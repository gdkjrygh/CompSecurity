// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import com.lyft.scoop.Screen;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.adapters.ContactsAdapter;
import me.lyft.android.analytics.studies.SplitFareAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IRideFareRepository;
import me.lyft.android.application.splitfare.ISplitFareStateRepository;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.BackButtonToolbar;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.ride.RideFare;
import me.lyft.android.domain.ride.RideStatus;
import me.lyft.android.domain.splitfare.SplitFareState;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.infrastructure.splitfare.ISplitFareService;
import me.lyft.android.providers.ContactPhone;
import me.lyft.android.providers.UserContact;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import rx.functions.Action1;
import rx.functions.Func1;

public class InviteToSplitView extends LinearLayout
    implements IHandleBack
{

    private static final int ANIMATION_DURATION = 250;
    private final Interpolator animationInterpolator = new AccelerateDecelerateInterpolator() {

        final InviteToSplitView this$0;

        private void updatePosition()
        {
            android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)contactsList.getLayoutParams();
            layoutparams.bottomMargin = sendInvitesButton.getHeight() - (int)sendInvitesButton.getTranslationY();
            contactsList.setLayoutParams(layoutparams);
        }

        public float getInterpolation(float f)
        {
            f = super.getInterpolation(f);
            updatePosition();
            return f;
        }

            
            {
                this$0 = InviteToSplitView.this;
                super();
            }
    };
    AppFlow appFlow;
    Binder binder;
    MessageBus bus;
    IConstantsProvider constantsProvider;
    final ContactsAdapter contactsAdapter;
    ListView contactsList;
    DialogFlow dialogFlow;
    View emptyView;
    IRideFareRepository fareRepository;
    boolean isShowingSearch;
    final int maxContributors;
    final Action1 onRideUpdated = new Action1() {

        final InviteToSplitView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            unit = rideProvider.getPassengerRide().getStatus();
            if (unit.isDroppedOff() || unit.isCanceled())
            {
                appFlow.goBack();
            }
        }

            
            {
                this$0 = InviteToSplitView.this;
                super();
            }
    };
    IProgressController progressController;
    IPassengerRideProvider rideProvider;
    View sendInvitesButton;
    ISplitFareService splitFareService;
    ISplitFareStateRepository splitFareStateRepository;
    TextView splitPaymentFee;
    BackButtonToolbar toolbar;
    final Action1 toolbarItemClicked = new Action1() {

        final InviteToSplitView this$0;

        public void call(Integer integer)
        {
            switch (integer.intValue())
            {
            default:
                return;

            case 2131558437: 
                integer = contactsAdapter.getData();
                break;
            }
            List list = contactsAdapter.getCheckedData();
            List list1 = contactsAdapter.getDisabledData();
            dialogFlow.show(new SplitFareDialogs.ContactsSearchDialog(integer, list, list1));
        }

        public volatile void call(Object obj)
        {
            call((Integer)obj);
        }

            
            {
                this$0 = InviteToSplitView.this;
                super();
            }
    };
    IViewErrorHandler viewErrorHandler;

    public InviteToSplitView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        isShowingSearch = false;
        attributeset = Scoop.a(this);
        attributeset.b(this);
        contactsAdapter = new ContactsAdapter(attributeset.a(context));
        maxContributors = fareRepository.getFare().getMaximumContributors();
    }

    private boolean hasMaxInvitesBeenHit()
    {
        return contactsAdapter.getCheckedItemCount() >= maxContributors;
    }

    private void loadContacts()
    {
        binder.bind(splitFareService.observeSplitFareContacts(), new AsyncCall() {

            final InviteToSplitView this$0;

            public volatile void onSuccess(Object obj)
            {
                onSuccess((List)obj);
            }

            public void onSuccess(List list)
            {
                contactsAdapter.swapData(list);
                Iterator iterator;
                if (contactsAdapter.isEmpty())
                {
                    emptyView.setVisibility(0);
                    splitPaymentFee.setVisibility(8);
                } else
                {
                    emptyView.setVisibility(8);
                    splitPaymentFee.setVisibility(0);
                }
                list = splitFareStateRepository.getSplitFareState();
                iterator = contactsAdapter.getData().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    UserContact usercontact = (UserContact)iterator.next();
                    if (list.hasPhoneNumberBeenInvited(usercontact.getPhoneNumber().getPhoneNumber()))
                    {
                        contactsAdapter.addCheckedContact(usercontact);
                        contactsAdapter.addDisabledContact(usercontact);
                    }
                } while (true);
                list = contactsAdapter;
                boolean flag;
                if (contactsAdapter.getCheckedItemCount() >= maxContributors)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                list.setHasMaxInvitesBeenHit(flag);
            }

            
            {
                this$0 = InviteToSplitView.this;
                super();
            }
        });
    }

    private void setListItemChecked(int i)
    {
        if (contactsAdapter.isItemDisabled(i))
        {
            return;
        }
        boolean flag = contactsAdapter.isItemChecked(i);
        if (hasMaxInvitesBeenHit())
        {
            if (flag)
            {
                contactsAdapter.toggleChecked(i);
            }
        } else
        {
            contactsAdapter.toggleChecked(i);
        }
        contactsAdapter.setHasMaxInvitesBeenHit(hasMaxInvitesBeenHit());
        updateButtonAndTextStates();
    }

    private void updateButtonAndTextStates()
    {
        updateButtonAndTextStates(250);
    }

    private void updateButtonAndTextStates(int i)
    {
        int j = splitFareStateRepository.getSplitFareState().getInvitedContributorsCount();
        float f;
        boolean flag;
        if (contactsAdapter.getCheckedItemCount() - j > 0 && !isShowingSearch)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            f = 0.0F;
        } else
        {
            f = sendInvitesButton.getHeight();
        }
        if (f != sendInvitesButton.getTranslationY())
        {
            sendInvitesButton.clearAnimation();
            sendInvitesButton.animate().translationY(f).setDuration(i).setInterpolator(animationInterpolator).start();
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        binder.bind(rideProvider.observeRideUpdateEvent(), onRideUpdated);
        binder.bind(bus.observe(me/lyft/android/ui/splitfare/ContactsSearchDialogView$ContactSelectedEvent), new Action1() {

            final InviteToSplitView this$0;

            public volatile void call(Object obj)
            {
                call((UserContact)obj);
            }

            public void call(UserContact usercontact)
            {
                int i = contactsAdapter.getData().indexOf(usercontact);
                if (i != -1)
                {
                    setListItemChecked(i);
                } else
                if (usercontact.getPhoneNumber() != null)
                {
                    splitFareService.addUnknownPhoneNumber(usercontact.getPhoneNumber().getPhoneNumber());
                    contactsAdapter.addCheckedContact(usercontact);
                    loadContacts();
                    return;
                }
            }

            
            {
                this$0 = InviteToSplitView.this;
                super();
            }
        });
        binder.bind(dialogFlow.observeDialogChange(), new Action1() {

            final InviteToSplitView this$0;

            public void call(Screen screen)
            {
                isShowingSearch = screen instanceof SplitFareDialogs.ContactsSearchDialog;
                updateButtonAndTextStates(0);
            }

            public volatile void call(Object obj)
            {
                call((Screen)obj);
            }

            
            {
                this$0 = InviteToSplitView.this;
                super();
            }
        });
        binder.bind(toolbar.observeItemClick(), toolbarItemClicked);
        binder.bind(toolbar.observeHomeClick(), new Action1() {

            final InviteToSplitView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                SplitFareAnalytics.trackSplitRequestCancel();
            }

            
            {
                this$0 = InviteToSplitView.this;
                super();
            }
        });
        loadContacts();
    }

    public boolean onBack()
    {
        SplitFareAnalytics.trackSplitRequestCancel();
        return false;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this, this);
        toolbar.clearItems().addItem(0x7f0d0025, 0x7f0201b3).setTitle(getResources().getString(0x7f0701bd));
        splitPaymentFee.setText((CharSequence)Objects.firstNonNull(constantsProvider.getConstants().getSplitPaymentsFeeText(), getResources().getString(0x7f070108)));
        contactsList.setAdapter(contactsAdapter);
    }

    void onItemClick(int i)
    {
        setListItemChecked(i);
    }

    void sendInvites()
    {
        List list = Iterables.where(contactsAdapter.getCheckedData(), new Func1() {

            final InviteToSplitView this$0;

            public Boolean call(UserContact usercontact)
            {
                boolean flag;
                if (!contactsAdapter.isItemDisabled(usercontact))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call(Object obj)
            {
                return call((UserContact)obj);
            }

            
            {
                this$0 = InviteToSplitView.this;
                super();
            }
        });
        progressController.showProgress();
        binder.bind(splitFareService.sendInvites(list), new AsyncCall() {

            final InviteToSplitView this$0;

            public void onFail(Throwable throwable)
            {
                viewErrorHandler.handle(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                unit = (new me.lyft.android.ui.Dialogs.AlertDialog("split_invites_sent_dialog")).setTitle(getResources().getString(0x7f07034a)).setMessage(getResources().getString(0x7f070349)).setTitleColorResource(0x7f0c0025).addPositiveButton(getResources().getString(0x7f070212));
                dialogFlow.show(unit);
                appFlow.goBack();
            }

            public void onUnsubscribe()
            {
                progressController.hideProgress();
            }

            
            {
                this$0 = InviteToSplitView.this;
                super();
            }
        });
    }



}
