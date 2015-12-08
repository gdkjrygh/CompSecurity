// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.ArrayList;
import java.util.List;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.definitions.ActionName;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.infrastructure.lyft.constants.InviteRecommendedPromptDTO;
import me.lyft.android.infrastructure.lyft.constants.SocialSharing;
import me.lyft.android.infrastructure.lyft.invite.InviteRequestDTO;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.providers.TopContactsProvider;
import me.lyft.android.providers.UserContact;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.dialogs.DialogContainerView;
import me.lyft.android.ui.dialogs.Toast;

public class InviteTopContactsDialogView extends DialogContainerView
{

    private static final int CONTACT_POOL_SIZE = 20;
    private static final int MAX_CONTACTS = 9;
    ActivityController activityController;
    private ContactsAdapter adapter;
    private final AsyncActionAnalytics analytics;
    private Binder binder;
    IConstantsProvider constantsProvider;
    private final int contactOverlayColors[] = getResources().getIntArray(0x7f0a0001);
    DialogFlow dialogFlow;
    AbsListView gridView;
    ImageLoader imageLoader;
    private int inviteFriendCount;
    private final LayoutInflater layoutInflater;
    ILyftApi lyftApi;
    TextView messageTextView;
    Button okButton;
    IProgressController progressController;
    View rootContainer;
    TextView titleTextView;
    TopContactsProvider topContactsProvider;

    public InviteTopContactsDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        analytics = new AsyncActionAnalytics(ActionName.INVITE_TOP_CONTACTS, Category.INVITE_FRIENDS);
        Scoop.a(this).b(this);
        layoutInflater = LayoutInflater.from(context);
    }

    private void loadTopContacts()
    {
        rootContainer.setVisibility(8);
        binder.bind(topContactsProvider.observeTopContacts(20), new AsyncCall() {

            final InviteTopContactsDialogView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                analytics.trackResponseFailure(throwable);
                dialogFlow.dismiss();
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((List)obj);
            }

            public void onSuccess(List list)
            {
                super.onSuccess(list);
                if (list.size() == 0)
                {
                    analytics.trackResponseFailure("no_users");
                    dialogFlow.dismiss();
                    return;
                } else
                {
                    adapter = new ContactsAdapter(getContext(), list);
                    gridView.setAdapter(adapter);
                    return;
                }
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                rootContainer.setVisibility(0);
            }

            
            {
                this$0 = InviteTopContactsDialogView.this;
                super();
            }

            private class ContactsAdapter extends ArrayAdapter
            {

                final InviteTopContactsDialogView this$0;

                private String getFirstNameAndLastInitial(String s)
                {
                    s = s.split(",")[0].split(" ");
                    if (s.length > 1)
                    {
                        return String.format("%s %s.", new Object[] {
                            s[0], Character.valueOf(s[s.length - 1].charAt(0))
                        });
                    } else
                    {
                        return s[0];
                    }
                }

                public int getCount()
                {
                    return Math.min(super.getCount(), inviteFriendCount);
                }

                public View getView(int i, View view, ViewGroup viewgroup)
                {
                    UserContact usercontact;
                    String s;
                    if (view == null)
                    {
                        view = layoutInflater.inflate(0x7f03008b, viewgroup, false);
                        viewgroup = new ViewHolder(view);
                        view.setTag(viewgroup);
                    } else
                    {
                        viewgroup = (ViewHolder)view.getTag();
                    }
                    usercontact = (UserContact)getItem(i);
                    s = getFirstNameAndLastInitial(usercontact.getName());
                    ((ViewHolder) (viewgroup)).textView.setText(s);
                    if (!Strings.isNullOrEmpty(usercontact.getPhotoUri()))
                    {
                        imageLoader.load(usercontact.getPhotoUri()).placeholder(0x7f0201fc).fit().into(((ViewHolder) (viewgroup)).imageView);
                        return view;
                    } else
                    {
                        i = contactOverlayColors[i % contactOverlayColors.length];
                        ((ViewHolder) (viewgroup)).imageView.setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_ATOP);
                        imageLoader.load(0x7f0201fc).fit().into(((ViewHolder) (viewgroup)).imageView);
                        return view;
                    }
                }

                public ContactsAdapter(Context context, List list)
                {
                    this$0 = InviteTopContactsDialogView.this;
                    super(context, 0x7f03008b, list);
                }

                private class ViewHolder
                {

                    ImageView imageView;
                    TextView textView;
                    final InviteTopContactsDialogView this$0;

                    ViewHolder(View view)
                    {
                        this$0 = InviteTopContactsDialogView.this;
                        super();
                        ButterKnife.a(this, view);
                    }
                }

            }

        });
    }

    private void onUserDismiss()
    {
        analytics.trackResponseFailure("user_dismiss");
        dialogFlow.dismiss();
    }

    public void cancelButtonOnClick(View view)
    {
        onUserDismiss();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        analytics.trackRequest();
        binder = Binder.attach(this);
        loadTopContacts();
    }

    public boolean onBack()
    {
        onUserDismiss();
        return true;
    }

    protected void onCancel()
    {
        super.onCancel();
        onUserDismiss();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        InviteRecommendedPromptDTO inviterecommendedpromptdto = (InviteRecommendedPromptDTO)Objects.firstNonNull(constantsProvider.getConstants().getSocialSharing().getInviteRecommendedPromptDTO(), InviteRecommendedPromptDTO.NULL);
        String s;
        String s1;
        String s2;
        int i;
        if (!Strings.isNullOrEmpty((String)Objects.firstNonNull(inviterecommendedpromptdto.getTitle(), "")))
        {
            s = (String)Objects.firstNonNull(inviterecommendedpromptdto.getTitle(), "");
        } else
        {
            s = getResources().getString(0x7f0701bb);
        }
        if (!Strings.isNullOrEmpty((String)Objects.firstNonNull(inviterecommendedpromptdto.getSubtitle(), "")))
        {
            s1 = (String)Objects.firstNonNull(inviterecommendedpromptdto.getSubtitle(), "");
        } else
        {
            s1 = getResources().getString(0x7f0701b8);
        }
        if (!Strings.isNullOrEmpty((String)Objects.firstNonNull(inviterecommendedpromptdto.getSendLabel(), "")))
        {
            s2 = (String)Objects.firstNonNull(inviterecommendedpromptdto.getSendLabel(), "");
        } else
        {
            s2 = getResources().getString(0x7f0701b7);
        }
        if (((Integer)Objects.firstNonNull(inviterecommendedpromptdto.getFriendCount(), Integer.valueOf(0))).intValue() > 0)
        {
            i = Math.min(9, ((Integer)Objects.firstNonNull(inviterecommendedpromptdto.getFriendCount(), Integer.valueOf(0))).intValue());
        } else
        {
            i = 9;
        }
        inviteFriendCount = i;
        titleTextView.setText(s);
        messageTextView.setText(s1);
        okButton.setText(s2);
    }

    public void sendInvitesOnClick(View view)
    {
        int j = adapter.getCount();
        view = new ArrayList();
        for (int i = 0; i < j; i++)
        {
            me.lyft.android.infrastructure.lyft.invite.InviteDTO invitedto = ((UserContact)adapter.getItem(i)).createEmailInvite();
            if (invitedto != null)
            {
                view.add(invitedto);
            }
        }

        progressController.showProgress();
        final int actualInviteCount = view.size();
        binder.bind(lyftApi.sendInvites(new InviteRequestDTO(view)), new AsyncCall() {

            final InviteTopContactsDialogView this$0;
            final int val$actualInviteCount;

            public void onFail(Throwable throwable)
            {
                analytics.trackResponseFailure(throwable);
                dialogFlow.dismiss();
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                analytics.trackResponseSuccess(String.format("invited %s", new Object[] {
                    Integer.valueOf(actualInviteCount)
                }));
                dialogFlow.show(new Toast(getResources().getString(0x7f0701b9)));
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.hideProgress();
            }

            
            {
                this$0 = InviteTopContactsDialogView.this;
                actualInviteCount = i;
                super();
            }
        });
    }

    public void termsOfServiceOnClick(View view)
    {
        view = new Intent("android.intent.action.VIEW", Uri.parse("http://api.lyft.com.s3.amazonaws.com/static/terms.html"));
        activityController.startActivity(view);
    }




/*
    static ContactsAdapter access$102(InviteTopContactsDialogView invitetopcontactsdialogview, ContactsAdapter contactsadapter)
    {
        invitetopcontactsdialogview.adapter = contactsadapter;
        return contactsadapter;
    }

*/



}
