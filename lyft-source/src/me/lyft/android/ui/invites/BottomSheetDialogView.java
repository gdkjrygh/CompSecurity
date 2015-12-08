// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import java.util.List;
import me.lyft.android.IUserSession;
import me.lyft.android.analytics.IntentAnalytics;
import me.lyft.android.analytics.studies.InviteFriendsAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.ActivityController;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.device.IDevice;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.infrastructure.lyft.constants.SocialSharing;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.utils.ViewExtensions;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.invites:
//            BottomSheetViewAdapter, ClipboardUtil, SocialIntentProvider

public class BottomSheetDialogView extends FrameLayout
    implements IHandleBack
{

    private static final int ANIM_IN_DURATION = 350;
    private static final int ANIM_OUT_DURATION = 350;
    private static final float CONTAINER_BACKGROUND_ALPHA = 0.2F;
    private static final int DRAWER_CONTAINER_OFFSET_PX = 200;
    ActivityController activityController;
    private final BottomSheetViewAdapter adapter;
    private final Interpolator attachInterpolator = new OvershootInterpolator();
    View backgroundView;
    private Binder binder;
    GridView bottomSheet;
    LinearLayout bottomSheetContainer;
    final android.support.v4.widget.ViewDragHelper.Callback callback = new android.support.v4.widget.ViewDragHelper.Callback() {

        final BottomSheetDialogView this$0;

        public int clampViewPositionVertical(View view, int i, int j)
        {
            j = getHeight();
            int k = view.getHeight();
            int l = getHeight();
            int i1 = view.getHeight();
            return Math.min(Math.max(i, j - (k - 200)), l + i1);
        }

        public int getViewVerticalDragRange(View view)
        {
            return 1;
        }

        public void onViewDragStateChanged(int i)
        {
            super.onViewDragStateChanged(i);
            i;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 25;
               goto _L1 _L2
_L1:
            return;
_L2:
            if (bottomSheetContainer.getTop() >= getHeight())
            {
                animateOut();
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        public void onViewPositionChanged(View view, int i, int j, int k, int l)
        {
            view.setY(j);
            float f = (float)(backgroundView.getHeight() - j) / ((float)view.getHeight() - 200F);
            backgroundView.setAlpha(f * 0.2F);
        }

        public void onViewReleased(View view, float f, float f1)
        {
            int i = getHeight();
            int j = view.getHeight() - 200;
            if (view.getTop() <= i - j / 2)
            {
                i -= j;
            }
            if (dragHelper.a(view.getLeft(), i))
            {
                invalidate();
            }
        }

        public boolean tryCaptureView(View view, int i)
        {
            return view == bottomSheetContainer;
        }

            
            {
                this$0 = BottomSheetDialogView.this;
                super();
            }
    };
    IConstantsProvider constantsProvider;
    private final Interpolator detachInterpolator = new DecelerateInterpolator();
    IDevice device;
    DialogFlow dialogFlow;
    private final ViewDragHelper dragHelper;
    private boolean isAddedToWindow;
    private boolean isRemoving;
    final Action1 onListItemsLoaded = new Action1() {

        final BottomSheetDialogView this$0;

        public volatile void call(Object obj)
        {
            call((List)obj);
        }

        public void call(List list)
        {
            adapter.swapData(list);
        }

            
            {
                this$0 = BottomSheetDialogView.this;
                super();
            }
    };
    private IntentAnalytics shareInvitesIntent;
    private final SocialIntentProvider socialIntentProvider;
    IUserSession userSession;

    public BottomSheetDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        isRemoving = false;
        isAddedToWindow = false;
        shareInvitesIntent = InviteFriendsAnalytics.createShareInvitesIntent();
        Scoop.a(this).b(this);
        socialIntentProvider = (new SocialIntentProvider.Builder()).twitter((String)Objects.firstNonNull(constantsProvider.getConstants().getSocialSharing().getInviteTwitterShareText(), getResources().getString(0x7f07010a, new Object[] {
            Objects.firstNonNull(userSession.getUser().getReferralUrl(), "")
        }))).build(getContext().getPackageManager(), userSession, constantsProvider, device);
        adapter = new BottomSheetViewAdapter(LayoutInflater.from(context));
        dragHelper = ViewDragHelper.a(this, 1.0F, callback);
    }

    void animateOut()
    {
        if (isAddedToWindow && !isRemoving)
        {
            isRemoving = true;
            ViewCompat.o(backgroundView).a(0.0F).a(350L).b();
            ViewCompat.o(bottomSheetContainer).c((ViewCompat.l(bottomSheetContainer) + (float)bottomSheetContainer.getHeight()) - 200F).a(350L).a(detachInterpolator).a(new ViewPropertyAnimatorListener() {

                boolean called;
                final BottomSheetDialogView this$0;

                public void onAnimationCancel(View view)
                {
                }

                public void onAnimationEnd(View view)
                {
                    if (!called)
                    {
                        called = true;
                        dialogFlow.dismiss();
                        isAddedToWindow = false;
                        isRemoving = false;
                    }
                }

                public void onAnimationStart(View view)
                {
                }

            
            {
                this$0 = BottomSheetDialogView.this;
                super();
                called = false;
            }
            }).b();
        }
    }

    public void computeScroll()
    {
        super.computeScroll();
        if (dragHelper.a(true))
        {
            ViewCompat.d(this);
        }
    }

    void copyReferralCodeToClipboard()
    {
        String s1 = (String)Objects.firstNonNull(userSession.getUser().getReferralUrl(), "");
        Context context = getContext();
        String s = s1;
        if (Strings.isNullOrEmpty(s1))
        {
            s = getResources().getString(0x7f070103, new Object[] {
                Objects.firstNonNull(userSession.getUser().getReferralCode(), "")
            });
        }
        ClipboardUtil.copyToClipboard(context, s);
        dialogFlow.show(new Toast(getResources().getString(0x7f0700c6)));
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        shareInvitesIntent.trackInitiation();
        binder = Binder.attach(this);
        binder.bind(socialIntentProvider.observeInstalledShareItems().toList(), onListItemsLoaded);
        binder.bind(ViewExtensions.onLoadedObservable(bottomSheetContainer), new Action1() {

            final BottomSheetDialogView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                bottomSheet.setPadding(bottomSheet.getPaddingLeft(), bottomSheet.getPaddingTop(), bottomSheet.getPaddingRight(), bottomSheet.getPaddingBottom() + 200);
                bottomSheetContainer.setTranslationY(bottomSheetContainer.getHeight() + 200);
                bottomSheetContainer.setVisibility(0);
                ViewCompat.o(backgroundView).a(0.2F).a(350L).b();
                ViewCompat.o(bottomSheetContainer).c(200F).a(350L).a(attachInterpolator).a(new ViewPropertyAnimatorListener() {

                    boolean called;
                    final _cls1 this$1;

                    public void onAnimationCancel(View view)
                    {
                    }

                    public void onAnimationEnd(View view)
                    {
                        if (!called)
                        {
                            called = true;
                            isAddedToWindow = true;
                        }
                    }

                    public void onAnimationStart(View view)
                    {
                    }

            
            {
                this$1 = _cls1.this;
                super();
                called = false;
            }
                }).b();
            }

            
            {
                this$0 = BottomSheetDialogView.this;
                super();
            }
        });
    }

    public boolean onBack()
    {
        shareInvitesIntent.trackCanceled("tap_back");
        animateOut();
        return true;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this, this);
        bottomSheet.setAdapter(adapter);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return dragHelper.a(motionevent);
    }

    void onItemClick()
    {
        shareInvitesIntent.trackCanceled("tap_background");
        animateOut();
    }

    void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (SocialIntentProvider.ShareItem)adapterview.getItemAtPosition(i);
        if (adapterview == socialIntentProvider.getCopyShareItem())
        {
            shareInvitesIntent.trackSuccess(((SocialIntentProvider.ShareItem) (adapterview)).name);
            copyReferralCodeToClipboard();
        } else
        {
            try
            {
                view = socialIntentProvider.createShareIntent(adapterview);
                activityController.startActivity(view);
                shareInvitesIntent.trackSuccess(((SocialIntentProvider.ShareItem) (adapterview)).name);
            }
            // Misplaced declaration of an exception variable
            catch (AdapterView adapterview)
            {
                adapterview = getResources().getString(0x7f070067);
                shareInvitesIntent.trackFailure(adapterview);
                dialogFlow.show(new Toast(adapterview));
            }
        }
        animateOut();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        dragHelper.b(motionevent);
        return true;
    }


/*
    static boolean access$002(BottomSheetDialogView bottomsheetdialogview, boolean flag)
    {
        bottomsheetdialogview.isAddedToWindow = flag;
        return flag;
    }

*/





/*
    static boolean access$402(BottomSheetDialogView bottomsheetdialogview, boolean flag)
    {
        bottomsheetdialogview.isRemoving = flag;
        return flag;
    }

*/
}
