// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.tinder.e.au;
import com.tinder.enums.UserPhotoSize;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.z;
import com.tinder.model.User;
import com.tinder.utils.ad;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.tinder.views:
//            RoundImageView

public class LoadingView extends FrameLayout
{

    private static final float ALPHA_BEG = 0.095F;
    private static final float ALPHA_END = 0F;
    private static final long ANIM_DURATION = 4000L;
    private static final long RING_STAGGER = 600L;
    private static final float SCALE_BEG = 1F;
    private static final float SCALE_END = 5F;
    final int AVATAR_ANIM_TIME;
    private List mAnimatorSets;
    private FrameLayout mFrameLayoutAvatar;
    private View mInviteLayout;
    z mManagerProfile;
    private AccelerateDecelerateInterpolator mPingInterpolator;
    private TextView mPromptText;
    private RelativeLayout mRelativeLayout;
    private ImageView mRing1;
    private ImageView mRing2;
    private RoundImageView mRoundImageAvatar;

    public LoadingView(Context context)
    {
        super(context);
        AVATAR_ANIM_TIME = 360;
        init(context);
    }

    public LoadingView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        AVATAR_ANIM_TIME = 360;
        init(context);
    }

    public LoadingView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        AVATAR_ANIM_TIME = 360;
        init(context);
    }

    private void init(Context context)
    {
        ManagerApp.h().a(this);
        context = inflate(context, 0x7f0300a3, this);
        setClipChildren(false);
        setClipToPadding(false);
        mPingInterpolator = new AccelerateDecelerateInterpolator();
        mRelativeLayout = (RelativeLayout)context.findViewById(0x7f0e02ee);
        mFrameLayoutAvatar = (FrameLayout)context.findViewById(0x7f0e02f2);
        mPromptText = (TextView)context.findViewById(0x7f0e02f4);
        mRoundImageAvatar = (RoundImageView)context.findViewById(0x7f0e02f3);
        mRing1 = (ImageView)context.findViewById(0x7f0e02ef);
        mRing2 = (ImageView)context.findViewById(0x7f0e02f0);
        mAnimatorSets = new ArrayList();
    }

    public void animateAvatarIn(au au)
    {
        ad.c(mFrameLayoutAvatar, 0.0F);
        mRing1.setVisibility(4);
        mRing2.setVisibility(4);
        mFrameLayoutAvatar.animate().scaleX(1.0F).scaleY(1.0F).setStartDelay(0L).setDuration(360L).setInterpolator(new OvershootInterpolator()).setListener(au);
    }

    public void cancelAllAnimations()
    {
        for (Iterator iterator = mAnimatorSets.iterator(); iterator.hasNext(); ((AnimatorSet)iterator.next()).cancel()) { }
    }

    public String getLoadingText()
    {
        return mPromptText.getText().toString();
    }

    public void refreshProfileAvatarImage()
    {
        Object obj = mManagerProfile.b();
        if (mRoundImageAvatar != null && obj != null && ((User) (obj)).hasPhotos())
        {
            obj = (String)((User) (obj)).getAvatarUrlsForSize(UserPhotoSize.MED).get(0);
            Picasso.a(getContext()).a(((String) (obj))).a(0x7f090026, 0x7f090026).b().a(mRoundImageAvatar);
        }
    }

    public void restartAllAnimations()
    {
        Iterator iterator = mAnimatorSets.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            AnimatorSet animatorset = (AnimatorSet)iterator.next();
            if (!animatorset.isStarted())
            {
                animatorset.start();
            }
        } while (true);
    }

    public void setLoadingText(int i)
    {
        String s1 = getResources().getResourceName(i);
        if (s1 == null || !s1.startsWith("com.tinder"))
        {
            throw new IllegalArgumentException("A Tinder resource id must be provided");
        } else
        {
            mPromptText.setText(i);
            return;
        }
    }

    public void startAllPingAnimations()
    {
        if (mAnimatorSets.isEmpty())
        {
            mRing1.setVisibility(0);
            mRing2.setVisibility(0);
            startPingAnimation(mRing1, 0L);
            startPingAnimation(mRing2, 600L);
            return;
        } else
        {
            restartAllAnimations();
            return;
        }
    }

    public void startPingAnimation(final ImageView ring, long l)
    {
        mRoundImageAvatar.setScaleX(0.0F);
        mRoundImageAvatar.setScaleY(0.0F);
        mRoundImageAvatar.animate().scaleX(1.0F).scaleY(1.0F).setStartDelay(180L).setDuration(360L).setInterpolator(new OvershootInterpolator());
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.setTarget(ring);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(ring, "scaleX", new float[] {
            1.0F, 5F
        });
        objectanimator.setRepeatCount(-1);
        objectanimator.setRepeatMode(1);
        objectanimator.setDuration(4000L);
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(ring, "scaleY", new float[] {
            1.0F, 5F
        });
        objectanimator1.setRepeatCount(-1);
        objectanimator1.setRepeatMode(1);
        objectanimator1.setDuration(4000L);
        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(ring, "alpha", new float[] {
            0.095F, 0.0F
        });
        objectanimator2.setRepeatCount(-1);
        objectanimator2.setRepeatMode(1);
        objectanimator2.setDuration(4000L);
        animatorset.setInterpolator(mPingInterpolator);
        animatorset.setStartDelay(l);
        animatorset.playTogether(new Animator[] {
            objectanimator, objectanimator1, objectanimator2
        });
        animatorset.addListener(new AnimatorListenerAdapter() {

            final LoadingView this$0;
            final ImageView val$ring;

            public void onAnimationCancel(Animator animator)
            {
                ring.setVisibility(8);
            }

            
            {
                this$0 = LoadingView.this;
                ring = imageview;
                super();
            }
        });
        animatorset.start();
        mAnimatorSets.add(animatorset);
    }

    public void startSinglePingAnimation(ImageView imageview)
    {
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.setTarget(imageview);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(imageview, "scaleX", new float[] {
            1.0F, 5F
        });
        objectanimator.setDuration(4000L);
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(imageview, "scaleY", new float[] {
            1.0F, 5F
        });
        objectanimator1.setDuration(4000L);
        imageview = ObjectAnimator.ofFloat(imageview, "alpha", new float[] {
            0.095F, 0.0F
        });
        imageview.setDuration(4000L);
        animatorset.setInterpolator(mPingInterpolator);
        animatorset.playTogether(new Animator[] {
            objectanimator, objectanimator1, imageview
        });
        animatorset.start();
    }
}
