// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.people.model.Owner;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.people.accountswitcherview:
//            AccountSwitcherView, OwnersAvatarManager, ExpanderView, OwnersCoverPhotoManager

public class SelectedAccountNavigationView extends FrameLayout
{
    private class AccountChangeListener
    {

        public abstract void onAccountChange(Owner owner);
    }

    private class ViewHolderItem
    {

        public ExpanderView accountListButton;
        public View accountText;
        public ImageView coverPhoto;
        public View crossfadeRecents1;
        public ImageView crossfadeRecents1Image;
        public View crossfadeRecents2;
        public ImageView crossfadeRecents2Image;
        public TextView offscreenAccountDisplayName;
        public TextView offscreenAddress;
        public View offscreenAvatar;
        public ImageView offscreenAvatarImage;
        public ImageView offscreenCoverPhoto;
        public View offscreenText;
        public View recentsAvatar1;
        public ImageView recentsAvatar1Image;
        public View recentsAvatar2;
        public ImageView recentsAvatar2Image;
        public View root;
        public View scrim;
        public TextView selectedAccountDisplayName;
        public TextView selectedAddress;
        public View selectedAvatar;
        public ImageView selectedAvatarImage;
        public View wrapper;

        public ViewHolderItem()
        {
        }
    }

    private class _cls2 extends AnimatorListenerAdapter
    {

        final SelectedAccountNavigationView this$0;

        public final void onAnimationEnd(Animator animator)
        {
            SelectedAccountNavigationView.access$400(SelectedAccountNavigationView.this);
            SelectedAccountNavigationView.access$100(SelectedAccountNavigationView.this);
            bindViews();
            mCurrentAnimation;
        }

        _cls2()
        {
            this$0 = SelectedAccountNavigationView.this;
            super();
        }
    }

    private final class DefaultViewHolderItemCreator
        implements ViewHolderItemCreator
    {

        final SelectedAccountNavigationView this$0;

        public final ViewHolderItem createViewHolderItem(View view)
        {
            ViewHolderItem viewholderitem = new ViewHolderItem();
            viewholderitem.root = view;
            viewholderitem.accountText = view.findViewById(0x7f0d0342);
            viewholderitem.selectedAvatar = view.findViewById(0x7f0d0069);
            viewholderitem.selectedAvatarImage = (ImageView)viewholderitem.selectedAvatar;
            viewholderitem.selectedAccountDisplayName = (TextView)view.findViewById(0x7f0d00ed);
            viewholderitem.selectedAddress = (TextView)view.findViewById(0x7f0d00da);
            viewholderitem.coverPhoto = (ImageView)view.findViewById(0x7f0d030a);
            viewholderitem.accountListButton = (ExpanderView)view.findViewById(0x7f0d0346);
            viewholderitem.scrim = view.findViewById(0x7f0d0341);
            viewholderitem.wrapper = findViewById(0x7f0d033f);
            if (mShowRecents)
            {
                viewholderitem.recentsAvatar1 = view.findViewById(0x7f0d0017);
                viewholderitem.recentsAvatar1Image = (ImageView)viewholderitem.recentsAvatar1;
                viewholderitem.recentsAvatar2 = view.findViewById(0x7f0d00ea);
                viewholderitem.recentsAvatar2Image = (ImageView)viewholderitem.recentsAvatar2;
                viewholderitem.offscreenAvatar = view.findViewById(0x7f0d00e7);
                viewholderitem.offscreenAvatarImage = (ImageView)viewholderitem.offscreenAvatar;
                viewholderitem.offscreenCoverPhoto = (ImageView)view.findViewById(0x7f0d0340);
                viewholderitem.offscreenText = view.findViewById(0x7f0d0343);
                viewholderitem.offscreenAccountDisplayName = (TextView)view.findViewById(0x7f0d0344);
                viewholderitem.offscreenAddress = (TextView)view.findViewById(0x7f0d0345);
                viewholderitem.crossfadeRecents1 = view.findViewById(0x7f0d00e8);
                viewholderitem.crossfadeRecents1Image = (ImageView)viewholderitem.crossfadeRecents1;
                viewholderitem.crossfadeRecents2 = view.findViewById(0x7f0d00e9);
                viewholderitem.crossfadeRecents2Image = (ImageView)viewholderitem.crossfadeRecents2;
            }
            return viewholderitem;
        }

        private DefaultViewHolderItemCreator()
        {
            this$0 = SelectedAccountNavigationView.this;
            super();
        }

        DefaultViewHolderItemCreator(byte byte0)
        {
            this();
        }
    }

    public static interface NavigationModeChangeListener
    {

        public abstract void onNavigationModeChange(SelectedAccountNavigationView selectedaccountnavigationview);
    }

    public static interface ViewDecorator
    {

        public abstract void decorateView$625b805a(ViewHolderItem viewholderitem, Owner owner);
    }

    public static interface ViewHolderItemCreator
    {

        public abstract ViewHolderItem createViewHolderItem(View view);
    }


    public AccountChangeListener mAccountChangeListener;
    private int mActivePointerId;
    private Interpolator mAnimationInterpolator;
    public OwnersAvatarManager mAvatarLoader;
    private int mAvatarMarginTop;
    public GoogleApiClient mClient;
    public OwnersCoverPhotoManager mCoverLoader;
    private AnimatorSet mCurrentAnimation;
    public ViewDecorator mDecorator;
    int mDefaultHeight;
    public boolean mForceFullHeight;
    private boolean mIsRtl;
    public int mLayoutResId;
    public NavigationModeChangeListener mListener;
    private int mMinVelocity;
    public int mNavigationMode;
    private int mOffscreenAvatarStart;
    private int mOffscreenTextTranslationStart;
    private Owner mPendingBind;
    private Owner mPendingSelectedAccount;
    private float mRecentAvatarSize;
    private ArrayList mRecents;
    private float mRecents1Left;
    private int mRecents2Left;
    private Owner mSelectedAccount;
    private int mSelectedAvatarLeft;
    private float mSelectedAvatarSize;
    private int mSelectedAvatarWidth;
    public boolean mShowRecents;
    private float mStartX;
    private float mStartY;
    private boolean mSwiping;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    ViewHolderItem mViewHolder;
    public ViewHolderItemCreator mViewHolderItemCreator;

    public SelectedAccountNavigationView(Context context, AttributeSet attributeset)
    {
        boolean flag = true;
        super(context, attributeset);
        mNavigationMode = 0;
        mShowRecents = AccountSwitcherView.isAtLeastL();
        mRecents = new ArrayList(2);
        mLayoutResId = -1;
        mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        mVelocityTracker = VelocityTracker.obtain();
        mMinVelocity = ViewConfiguration.getMinimumFlingVelocity();
        attributeset = context.getResources();
        mSelectedAvatarSize = attributeset.getDimensionPixelSize(0x7f0c034d);
        mRecentAvatarSize = attributeset.getDimensionPixelSize(0x7f0c034a);
        int i;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            if (getResources().getConfiguration().getLayoutDirection() != 1)
            {
                flag = false;
            }
            mIsRtl = flag;
        }
        if (AccountSwitcherView.isAtLeastL())
        {
            i = 0x10c000d;
        } else
        {
            i = -1;
        }
        if (i != -1)
        {
            context = AnimationUtils.loadInterpolator(context, 0x10c000d);
        } else
        {
            context = new DecelerateInterpolator();
        }
        mAnimationInterpolator = context;
        mDefaultHeight = attributeset.getDimensionPixelSize(0x7f0c034e);
        mAvatarMarginTop = attributeset.getDimensionPixelSize(0x7f0c003e);
    }

    private void animateChangeText$256e089b(Owner owner, android.animation.AnimatorSet.Builder builder, int i)
    {
        setAccountDisplayName(mViewHolder.offscreenAccountDisplayName, mViewHolder.offscreenAddress, owner);
        mViewHolder.offscreenText.setVisibility(0);
        owner = ObjectAnimator.ofFloat(mViewHolder.offscreenText, "alpha", new float[] {
            1.0F
        });
        owner.setStartDelay(i);
        owner.setDuration(150L);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(mViewHolder.accountText, "alpha", new float[] {
            0.0F
        });
        objectanimator.setStartDelay(0L);
        objectanimator.setDuration(150L);
        builder.with(owner).with(objectanimator);
    }

    private void bindRecent(ImageView imageview, Owner owner)
    {
        if (imageview != null && mAvatarLoader != null)
        {
            Context context = imageview.getContext();
            owner.getAccountName();
            owner.getPlusPageId();
            imageview.setImageBitmap(OwnersAvatarManager.getPlaceholder$31ca6c6(context));
            if (!TextUtils.isEmpty(owner.getAvatarUrl()))
            {
                mAvatarLoader.removePendingRequest(imageview);
                mAvatarLoader.loadOwnerAvatar(imageview, owner.getAccountName(), owner.getPlusPageId(), 2);
            } else
            {
                mAvatarLoader.removePendingRequest(imageview);
            }
            imageview.setVisibility(0);
            imageview.setContentDescription(getContext().getString(0x7f100011, new Object[] {
                owner.getAccountName()
            }));
        }
    }

    private void bindViews()
    {
        if (mViewHolder == null)
        {
            createViewHolder();
        }
        if (mShowRecents)
        {
            resetView(mViewHolder.selectedAvatar);
            resetView(mViewHolder.recentsAvatar1);
            resetView(mViewHolder.recentsAvatar2);
            resetView(mViewHolder.accountText);
            resetView(mViewHolder.coverPhoto);
            resetView(mViewHolder.offscreenCoverPhoto);
            resetView(mViewHolder.offscreenAvatar);
        }
        ViewHolderItem viewholderitem = mViewHolder;
        Owner owner1 = mSelectedAccount;
        if (viewholderitem.root != null)
        {
            viewholderitem.root.setContentDescription(getContext().getResources().getString(0x7f100349, new Object[] {
                mSelectedAccount.getAccountName()
            }));
        }
        if (viewholderitem.selectedAvatarImage != null)
        {
            ImageView imageview = viewholderitem.selectedAvatarImage;
            Context context = getContext();
            owner1.getAccountName();
            owner1.getPlusPageId();
            imageview.setImageBitmap(OwnersAvatarManager.getPlaceholder$31ca6c6(context));
            if (!TextUtils.isEmpty(owner1.getAvatarUrl()))
            {
                mAvatarLoader.removePendingRequest(viewholderitem.selectedAvatarImage);
                mAvatarLoader.loadOwnerAvatar(viewholderitem.selectedAvatarImage, owner1.getAccountName(), owner1.getPlusPageId(), 2);
            } else
            {
                mAvatarLoader.removePendingRequest(viewholderitem.selectedAvatarImage);
            }
        }
        setAccountDisplayName(viewholderitem.selectedAccountDisplayName, viewholderitem.selectedAddress, owner1);
        setCoverPhoto(viewholderitem, viewholderitem.coverPhoto, owner1);
        if (mShowRecents)
        {
            if (mViewHolder == null)
            {
                createViewHolder();
            }
            if (mViewHolder.coverPhoto != null && mViewHolder.coverPhoto.getMeasuredWidth() == 0)
            {
                forceLayout();
            } else
            {
                if (mRecents.size() > 0)
                {
                    Owner owner = (Owner)mRecents.get(0);
                    ViewHolderItem viewholderitem1 = mViewHolder;
                    mViewHolder.recentsAvatar1.setVisibility(0);
                    bindRecent(mViewHolder.recentsAvatar1Image, owner);
                    setCoverPhoto(viewholderitem1, viewholderitem1.offscreenCoverPhoto, owner);
                } else
                {
                    mViewHolder.recentsAvatar1.setVisibility(8);
                }
                if (mRecents.size() > 1)
                {
                    mViewHolder.recentsAvatar2.setVisibility(0);
                    bindRecent(mViewHolder.recentsAvatar2Image, (Owner)mRecents.get(1));
                } else
                {
                    mViewHolder.recentsAvatar2.setVisibility(8);
                }
                mRecents1Left = -1F;
            }
        }
        if (mDecorator != null)
        {
            mDecorator._mth625b805a(mViewHolder, mSelectedAccount);
        }
        if (mShowRecents)
        {
            if (mViewHolder.offscreenAvatar != null)
            {
                mViewHolder.offscreenAvatar.setVisibility(8);
            }
            if (mViewHolder.offscreenCoverPhoto != null)
            {
                mViewHolder.offscreenCoverPhoto.setVisibility(8);
            }
            if (mViewHolder.offscreenText != null)
            {
                mViewHolder.offscreenText.setVisibility(8);
            }
            if (mViewHolder.crossfadeRecents1 != null)
            {
                mViewHolder.crossfadeRecents1.setAlpha(0.0F);
                mViewHolder.crossfadeRecents1.setScaleX(0.8F);
                mViewHolder.crossfadeRecents1.setScaleY(0.8F);
                mViewHolder.crossfadeRecents1.setVisibility(8);
            }
            if (mViewHolder.crossfadeRecents2 != null)
            {
                mViewHolder.crossfadeRecents2.setAlpha(0.0F);
                mViewHolder.crossfadeRecents2.setScaleX(0.8F);
                mViewHolder.crossfadeRecents2.setScaleY(0.8F);
                mViewHolder.crossfadeRecents2.setVisibility(8);
            }
        }
    }

    private void changeNavigationMode()
    {
        boolean flag = true;
        ExpanderView expanderview;
        int i;
        if (mNavigationMode == 1)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        setNavigationMode(i);
        if (mListener != null)
        {
            mListener.onNavigationModeChange(this);
        }
        expanderview = mViewHolder.accountListButton;
        if (mNavigationMode != 1)
        {
            flag = false;
        }
        expanderview.setExpanded(flag);
    }

    private void createViewHolder()
    {
        int i = 0x7f040132;
        Context context = getContext();
        if (mLayoutResId == -1)
        {
            if (!mForceFullHeight && !AccountSwitcherView.isAtLeastL())
            {
                i = 0x7f040133;
            }
            mLayoutResId = i;
        }
        if (mViewHolderItemCreator == null)
        {
            mViewHolderItemCreator = new DefaultViewHolderItemCreator((byte)0);
        }
        LayoutInflater.from(context).inflate(mLayoutResId, this);
        mViewHolder = mViewHolderItemCreator.createViewHolderItem(this);
        if (mShowRecents)
        {
            mViewHolder.recentsAvatar1.setOnClickListener(new android.view.View.OnClickListener() {

                final SelectedAccountNavigationView this$0;

                public final void onClick(View view)
                {
                    SelectedAccountNavigationView.access$700(SelectedAccountNavigationView.this, 0);
                }

            
            {
                this$0 = SelectedAccountNavigationView.this;
                super();
            }
            });
            mViewHolder.recentsAvatar2.setOnClickListener(new android.view.View.OnClickListener() {

                final SelectedAccountNavigationView this$0;

                public final void onClick(View view)
                {
                    SelectedAccountNavigationView.access$700(SelectedAccountNavigationView.this, 1);
                }

            
            {
                this$0 = SelectedAccountNavigationView.this;
                super();
            }
            });
        }
        if (mViewHolder.accountListButton != null)
        {
            mViewHolder.accountListButton.setOnClickListener(new android.view.View.OnClickListener() {

                final SelectedAccountNavigationView this$0;

                public final void onClick(View view)
                {
                    changeNavigationMode();
                }

            
            {
                this$0 = SelectedAccountNavigationView.this;
                super();
            }
            });
        }
    }

    private void onSecondaryPointerUp(MotionEvent motionevent)
    {
        int i = motionevent.getActionIndex();
        if (motionevent.getPointerId(i) == mActivePointerId)
        {
            if (i == 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            mActivePointerId = motionevent.getPointerId(i);
        }
    }

    private static void resetView(View view)
    {
        if (view != null)
        {
            ViewCompat.setTranslationX(view, 0.0F);
            ViewCompat.setTranslationY(view, 0.0F);
            ViewCompat.setScaleX(view, 1.0F);
            ViewCompat.setScaleY(view, 1.0F);
            view.setAlpha(1.0F);
        }
    }

    private static void setAccountDisplayName(TextView textview, TextView textview1, Owner owner)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (textview != null)
            {
                if (TextUtils.isEmpty(owner.getDisplayName()))
                {
                    textview.setText(owner.getAccountName());
                    flag = flag1;
                } else
                {
                    flag = true;
                    textview.setText(owner.getDisplayName());
                }
            }
            if (textview1 != null)
            {
                if (!flag)
                {
                    break label0;
                }
                textview1.setVisibility(0);
                textview1.setText(owner.getAccountName());
            }
            return;
        }
        textview1.setVisibility(8);
    }

    private void setCoverPhoto(ViewHolderItem viewholderitem, ImageView imageview, Owner owner)
    {
        if (imageview == null)
        {
            return;
        }
        if (!TextUtils.isEmpty(owner.getCoverPhotoUrl()))
        {
            mCoverLoader.removePendingRequest(imageview);
            OwnersCoverPhotoManager ownerscoverphotomanager = mCoverLoader;
            ownerscoverphotomanager.loadImageRequest(new OwnersCoverPhotoManager.OwnerCoverPhotoRequest(ownerscoverphotomanager, imageview, owner.getAccountName(), owner.getPlusPageId(), viewholderitem.coverPhoto.getMeasuredWidth()));
            return;
        } else
        {
            mCoverLoader.removePendingRequest(imageview);
            imageview.setImageBitmap(OwnersCoverPhotoManager.getPlaceholder(getContext()));
            return;
        }
    }

    public final void bind(Owner owner)
    {
label0:
        {
            if (mViewHolder == null)
            {
                createViewHolder();
            }
            if (owner == null)
            {
                mSelectedAccount = null;
                return;
            }
            if (mCurrentAnimation != null && mCurrentAnimation.isRunning())
            {
                mPendingSelectedAccount = owner;
                return;
            }
            if (mViewHolder.coverPhoto != null && mViewHolder.coverPhoto.getMeasuredWidth() == 0)
            {
                mPendingBind = owner;
                forceLayout();
                return;
            }
            if (mSelectedAccount != null && mSelectedAccount.getAccountName().equals(owner.getAccountName()))
            {
                break label0;
            }
            Owner owner1 = mSelectedAccount;
            mSelectedAccount = owner;
            owner = mSelectedAccount.getAccountName();
            byte byte0 = -1;
            int i = 0;
label1:
            do
            {
label2:
                {
                    int j = byte0;
                    if (i < mRecents.size())
                    {
                        if (!((Owner)mRecents.get(i)).getAccountName().equals(owner))
                        {
                            break label2;
                        }
                        j = i;
                    }
                    if (j >= 0)
                    {
                        mRecents.remove(j);
                    }
                    if (owner1 != null)
                    {
                        mRecents.add(0, owner1);
                        for (; mRecents.size() > 2; mRecents.remove(mRecents.size() - 1)) { }
                    }
                    break label1;
                }
                i++;
            } while (true);
            bindViews();
            return;
        }
        mSelectedAccount = owner;
        bindViews();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR lookupswitch 2: default 32
    //                   0: 37
    //                   6: 59;
           goto _L1 _L2 _L3
_L1:
        return mSwiping;
_L2:
        mSwiping = false;
        mActivePointerId = motionevent.getPointerId(0);
        mSwiping = false;
        continue; /* Loop/switch isn't completed */
_L3:
        onSecondaryPointerUp(motionevent);
        mActivePointerId = -1;
        mSwiping = false;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onMeasure(int i, int j)
    {
        if (mViewHolder == null)
        {
            createViewHolder();
        }
        if (mViewHolder.coverPhoto != null)
        {
            mViewHolder.coverPhoto.measure(i, j);
        }
        if (mViewHolder.scrim != null)
        {
            mViewHolder.scrim.measure(i, j);
        }
        if (mPendingBind != null)
        {
            bind(mPendingBind);
            mPendingBind = null;
        }
        super.onMeasure(i, j);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        Object obj;
        int i;
        i = motionevent.getAction();
        obj = getParent();
        i;
        JVM INSTR tableswitch 0 6: default 56
    //                   0 58
    //                   1 1063
    //                   2 77
    //                   3 2308
    //                   4 56
    //                   5 2323
    //                   6 2338;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        return true;
_L2:
        mStartX = motionevent.getX();
        mStartY = motionevent.getY();
        continue; /* Loop/switch isn't completed */
_L4:
        int j = motionevent.findPointerIndex(mActivePointerId);
        if (j < 0)
        {
            Log.e("SelectedAccountNavigationView", "Got ACTION_MOVE event but have an invalid active pointer id.");
            return false;
        }
        float f = motionevent.getX(j);
        float f7 = motionevent.getY(j);
        float f3 = f - mStartX;
        f7 -= mStartY;
        if (mShowRecents && mRecents.size() > 0 && !mSwiping && f3 * f3 + f7 * f7 > (float)(mTouchSlop * mTouchSlop) && Math.abs(f3) > Math.abs(f7))
        {
            mSwiping = true;
            if (obj != null)
            {
                ((ViewParent) (obj)).requestDisallowInterceptTouchEvent(true);
            }
        }
        if (mSwiping)
        {
            f -= mStartX;
            if (mRecents1Left == -1F)
            {
                mRecents1Left = mViewHolder.recentsAvatar1.getLeft();
                mRecents2Left = mViewHolder.recentsAvatar2.getLeft();
                mSelectedAvatarLeft = mViewHolder.selectedAvatar.getLeft() + mViewHolder.selectedAvatar.getPaddingLeft();
                mSelectedAvatarWidth = mViewHolder.selectedAvatar.getWidth();
            }
            float f4;
            float f8;
            float f11;
            float f14;
            float f15;
            if (mIsRtl)
            {
                f = Math.min(f, 0.0F);
            } else
            {
                f = Math.max(f, 0.0F);
            }
            f11 = mRecentAvatarSize / mSelectedAvatarSize;
            f8 = mRecentAvatarSize;
            f14 = mSelectedAvatarSize;
            if (mRecents.size() > 1)
            {
                f4 = mRecents2Left;
            } else
            {
                f4 = mRecents1Left;
            }
            f15 = (f4 - (float)mSelectedAvatarLeft) + (mRecentAvatarSize - mSelectedAvatarSize) * 0.5F;
            f4 = Math.min(1.0F, f / f15);
            f = Math.abs(0.5F * (f8 - f14));
            f8 = Math.max(0.0F, 1.0F - f4);
            mViewHolder.selectedAvatar.setTranslationX(f15 * f4);
            mViewHolder.selectedAvatar.setTranslationY(Math.abs(f * f4) * -1F);
            f = Math.min(1.0F, Math.max(f11, 1.0F - f4 * f11));
            mViewHolder.selectedAvatar.setScaleX(f);
            mViewHolder.selectedAvatar.setScaleY(f);
            if (mViewHolder.offscreenAvatar != null)
            {
                if (mViewHolder.offscreenAvatar.getVisibility() != 0)
                {
                    float f12;
                    int k;
                    if (mIsRtl)
                    {
                        k = getWidth() - mSelectedAvatarLeft;
                    } else
                    {
                        k = -mSelectedAvatarWidth - mSelectedAvatarLeft;
                    }
                    mOffscreenAvatarStart = k;
                    mViewHolder.offscreenAvatar.setTranslationX(mOffscreenAvatarStart);
                    mViewHolder.offscreenAvatarImage.setImageDrawable(mViewHolder.recentsAvatar1Image.getDrawable());
                    mViewHolder.offscreenAvatar.setVisibility(0);
                } else
                {
                    f = -mOffscreenAvatarStart;
                    mViewHolder.offscreenAvatar.setTranslationX(f * f4 + (float)mOffscreenAvatarStart);
                }
            }
            if (mRecents.size() > 1)
            {
                f = mRecents1Left;
                f12 = mRecents2Left;
                mViewHolder.recentsAvatar2.setTranslationX((f - f12) * f4);
            }
            if (mRecents.size() > 0)
            {
                if (mViewHolder.offscreenCoverPhoto != null)
                {
                    if (mViewHolder.offscreenCoverPhoto.getVisibility() != 0)
                    {
                        mViewHolder.offscreenCoverPhoto.setAlpha(0.0F);
                        mViewHolder.offscreenCoverPhoto.setVisibility(0);
                    } else
                    {
                        mViewHolder.offscreenCoverPhoto.setAlpha(f4);
                    }
                }
                if (mViewHolder.coverPhoto != null)
                {
                    mViewHolder.coverPhoto.setAlpha(1.0F - f4);
                }
                if (mIsRtl)
                {
                    f = (float)getLeft() - ((float)mViewHolder.recentsAvatar1.getWidth() + mRecents1Left);
                } else
                {
                    f = (float)getWidth() - mRecents1Left;
                }
                mViewHolder.recentsAvatar1.setTranslationX(f * f4);
                mViewHolder.recentsAvatar1.setAlpha(f8);
                if (mViewHolder.offscreenText != null)
                {
                    if (mViewHolder.offscreenText.getVisibility() != 0)
                    {
                        obj = (Owner)mRecents.get(0);
                        mOffscreenTextTranslationStart = mOffscreenAvatarStart;
                        mViewHolder.offscreenText.setTranslationX(mOffscreenTextTranslationStart);
                        setAccountDisplayName(mViewHolder.offscreenAccountDisplayName, mViewHolder.offscreenAddress, ((Owner) (obj)));
                        mViewHolder.offscreenText.setAlpha(0.0F);
                        mViewHolder.offscreenText.setVisibility(0);
                    } else
                    {
                        if (f4 > 0.3333333F)
                        {
                            float f1 = Math.min(1.0F, (f4 - 0.3333333F) * 3F);
                            mViewHolder.offscreenText.setAlpha(f1);
                        }
                        mViewHolder.offscreenText.setTranslationX((float)mOffscreenTextTranslationStart + (float)(-mOffscreenTextTranslationStart) * f4);
                    }
                }
                if (mViewHolder.accountText != null)
                {
                    mViewHolder.accountText.setTranslationX(mViewHolder.selectedAvatar.getTranslationX());
                    f = Math.max(0.0F, 1.0F - 3F * f4);
                    mViewHolder.accountText.setAlpha(f);
                }
            }
            mVelocityTracker.addMovement(motionevent);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (mActivePointerId < 0)
        {
            Log.e("SelectedAccountNavigationView", "Got ACTION_UP event but have an invalid active pointer id.");
            return false;
        }
        if (mSwiping)
        {
            float f2;
            float f5;
            float f9;
            int l;
            boolean flag;
            if (mRecents.size() > 1)
            {
                f2 = mRecents2Left;
            } else
            {
                f2 = mRecents1Left;
            }
            f9 = mViewHolder.selectedAvatar.getTranslationX();
            f5 = f9;
            if (mIsRtl)
            {
                f5 = Math.abs(f9);
            }
            if (f5 >= 0.5F * f2)
            {
                l = 1;
            } else
            {
                l = 0;
            }
            flag = l;
            if (l == 0)
            {
                flag = l;
                if (motionevent.getX(mActivePointerId) - mStartX > (float)mTouchSlop)
                {
                    mVelocityTracker.computeCurrentVelocity(1000);
                    float f6;
                    float f10;
                    float f13;
                    Object obj1;
                    ObjectAnimator objectanimator;
                    ObjectAnimator objectanimator2;
                    ObjectAnimator objectanimator4;
                    if (Math.abs(mVelocityTracker.getXVelocity()) > (float)mMinVelocity)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                }
            }
            if (flag)
            {
                motionevent = new AnimatorSet();
                f2 = mRecentAvatarSize / mSelectedAvatarSize;
                f10 = mRecentAvatarSize;
                f13 = mSelectedAvatarSize;
                if (mRecents.size() > 1)
                {
                    l = mViewHolder.recentsAvatar2.getLeft();
                } else
                {
                    l = mViewHolder.recentsAvatar1.getLeft();
                }
                f6 = l - mViewHolder.selectedAvatar.getLeft();
                f6 = (mRecentAvatarSize - mSelectedAvatarSize) * 0.5F + f6;
                obj1 = ObjectAnimator.ofFloat(mViewHolder.selectedAvatar, "translationX", new float[] {
                    f6
                });
                objectanimator = ObjectAnimator.ofFloat(mViewHolder.selectedAvatar, "translationY", new float[] {
                    0.5F * (f10 - f13)
                });
                objectanimator2 = ObjectAnimator.ofFloat(mViewHolder.selectedAvatar, "scaleY", new float[] {
                    f2
                });
                objectanimator4 = ObjectAnimator.ofFloat(mViewHolder.selectedAvatar, "scaleX", new float[] {
                    f2
                });
                obj1 = motionevent.play(((Animator) (obj1))).with(objectanimator).with(objectanimator4).with(objectanimator2);
                if (mShowRecents && mRecents.size() > 0)
                {
                    if (mRecents.size() > 1)
                    {
                        f2 = mViewHolder.recentsAvatar1.getLeft() - mViewHolder.recentsAvatar2.getLeft();
                        ((android.animation.AnimatorSet.Builder) (obj1)).with(ObjectAnimator.ofFloat(mViewHolder.recentsAvatar2, "translationX", new float[] {
                            f2
                        }));
                    }
                    if (mIsRtl)
                    {
                        f2 = (float)getLeft() - ((float)mViewHolder.recentsAvatar1.getWidth() + mRecents1Left);
                    } else
                    {
                        f2 = getWidth() - mViewHolder.recentsAvatar1.getLeft();
                    }
                    objectanimator = ObjectAnimator.ofFloat(mViewHolder.recentsAvatar1, "translationX", new float[] {
                        f2
                    });
                    objectanimator2 = ObjectAnimator.ofFloat(mViewHolder.recentsAvatar1, "alpha", new float[] {
                        0.0F
                    });
                    ((android.animation.AnimatorSet.Builder) (obj1)).with(objectanimator).with(objectanimator2);
                    if (mViewHolder.offscreenAvatar != null)
                    {
                        ((android.animation.AnimatorSet.Builder) (obj1)).with(ObjectAnimator.ofFloat(mViewHolder.offscreenAvatar, "translationX", new float[] {
                            0.0F
                        }));
                    }
                    if (mViewHolder.offscreenText != null)
                    {
                        animateChangeText$256e089b((Owner)mRecents.get(0), ((android.animation.AnimatorSet.Builder) (obj1)), 0);
                    }
                }
                motionevent.addListener(new AnimatorListenerAdapter() {

                    final SelectedAccountNavigationView this$0;

                    public final void onAnimationEnd(Animator animator)
                    {
                        SelectedAccountNavigationView.access$400(SelectedAccountNavigationView.this);
                        SelectedAccountNavigationView.access$100(SelectedAccountNavigationView.this);
                        bindViews();
                        mCurrentAnimation;
                    }

            
            {
                this$0 = SelectedAccountNavigationView.this;
                super();
            }
                });
                obj1 = mSelectedAccount;
                mSelectedAccount = (Owner)mRecents.remove(0);
                mRecents.add(obj1);
                motionevent.setDuration((long)((1.0F - mViewHolder.selectedAvatar.getTranslationX() / f6) * 450F));
                motionevent.setInterpolator(mAnimationInterpolator);
                mCurrentAnimation = motionevent;
                mCurrentAnimation.start();
            } else
            {
                motionevent = new AnimatorSet();
                android.animation.AnimatorSet.Builder builder = motionevent.play(ObjectAnimator.ofFloat(mViewHolder.selectedAvatar, "alpha", new float[] {
                    1.0F
                }));
                ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(mViewHolder.selectedAvatar, "translationX", new float[] {
                    0.0F
                });
                ObjectAnimator objectanimator3 = ObjectAnimator.ofFloat(mViewHolder.selectedAvatar, "translationY", new float[] {
                    0.0F
                });
                ObjectAnimator objectanimator5 = ObjectAnimator.ofFloat(mViewHolder.selectedAvatar, "scaleX", new float[] {
                    1.0F
                });
                ObjectAnimator objectanimator6 = ObjectAnimator.ofFloat(mViewHolder.selectedAvatar, "scaleY", new float[] {
                    1.0F
                });
                builder.with(objectanimator1).with(objectanimator3).with(objectanimator5).with(objectanimator6);
                builder.with(ObjectAnimator.ofFloat(mViewHolder.offscreenAvatar, "translationX", new float[] {
                    (float)mOffscreenAvatarStart
                }));
                if (mViewHolder.offscreenCoverPhoto != null)
                {
                    builder.with(ObjectAnimator.ofFloat(mViewHolder.offscreenCoverPhoto, "alpha", new float[] {
                        0.0F
                    }));
                }
                if (mViewHolder.coverPhoto != null)
                {
                    builder.with(ObjectAnimator.ofFloat(mViewHolder.coverPhoto, "alpha", new float[] {
                        1.0F
                    }));
                }
                builder.with(ObjectAnimator.ofFloat(mViewHolder.recentsAvatar2, "translationX", new float[] {
                    0.0F
                }));
                objectanimator5 = ObjectAnimator.ofFloat(mViewHolder.recentsAvatar1, "translationX", new float[] {
                    0.0F
                });
                objectanimator1 = ObjectAnimator.ofFloat(mViewHolder.offscreenText, "translationX", new float[] {
                    (float)(-getWidth())
                });
                objectanimator6 = ObjectAnimator.ofFloat(mViewHolder.recentsAvatar1, "alpha", new float[] {
                    1.0F
                });
                objectanimator3 = ObjectAnimator.ofFloat(mViewHolder.accountText, "translationX", new float[] {
                    0.0F
                });
                builder.with(objectanimator5).with(objectanimator6);
                objectanimator5 = ObjectAnimator.ofFloat(mViewHolder.offscreenText, "alpha", new float[] {
                    0.0F
                });
                objectanimator6 = ObjectAnimator.ofFloat(mViewHolder.accountText, "alpha", new float[] {
                    1.0F
                });
                builder.with(objectanimator1).with(objectanimator5).with(objectanimator3).with(objectanimator6);
                motionevent.setDuration(100L);
                motionevent.addListener(new AnimatorListenerAdapter() {

                    final SelectedAccountNavigationView this$0;

                    public final void onAnimationEnd(Animator animator)
                    {
                        mViewHolder.offscreenAvatar.setVisibility(8);
                        mViewHolder.offscreenText.setVisibility(8);
                        if (mViewHolder.offscreenCoverPhoto != null)
                        {
                            mViewHolder.offscreenCoverPhoto.setVisibility(8);
                        }
                        SelectedAccountNavigationView.access$100(SelectedAccountNavigationView.this);
                        bindViews();
                        mCurrentAnimation;
                    }

            
            {
                this$0 = SelectedAccountNavigationView.this;
                super();
            }
                });
                motionevent.setInterpolator(mAnimationInterpolator);
                mCurrentAnimation = motionevent;
                mCurrentAnimation.start();
            }
        } else
        {
            changeNavigationMode();
        }
        mSwiping = false;
        if (obj != null)
        {
            ((ViewParent) (obj)).requestDisallowInterceptTouchEvent(false);
        }
        mVelocityTracker.clear();
        return false;
_L5:
        if (obj != null)
        {
            ((ViewParent) (obj)).requestDisallowInterceptTouchEvent(false);
        }
        return false;
_L6:
        mActivePointerId = motionevent.getPointerId(motionevent.getActionIndex());
        continue; /* Loop/switch isn't completed */
_L7:
        onSecondaryPointerUp(motionevent);
        if (true) goto _L1; else goto _L8
_L8:
    }

    public final void setNavigationMode(int i)
    {
        boolean flag = true;
        if (mNavigationMode != i)
        {
            mNavigationMode = i;
            if (mViewHolder == null)
            {
                createViewHolder();
            }
            if (mNavigationMode != 1)
            {
                flag = false;
            }
            mViewHolder.accountListButton.setExpanded(flag);
        }
    }



/*
    static void access$100(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        if (selectedaccountnavigationview.mPendingSelectedAccount != null)
        {
            selectedaccountnavigationview.mSelectedAccount = selectedaccountnavigationview.mPendingSelectedAccount;
            selectedaccountnavigationview.mPendingSelectedAccount = null;
        }
        return;
    }

*/



/*
    static AnimatorSet access$302$1a86cb5f(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        selectedaccountnavigationview.mCurrentAnimation = null;
        return null;
    }

*/


/*
    static void access$400(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        if (selectedaccountnavigationview.mAccountChangeListener != null)
        {
            selectedaccountnavigationview.mAccountChangeListener.onAccountChange(selectedaccountnavigationview.mSelectedAccount);
        }
        return;
    }

*/


/*
    static void access$700(SelectedAccountNavigationView selectedaccountnavigationview, int i)
    {
        if (selectedaccountnavigationview.mRecents == null || selectedaccountnavigationview.mRecents.size() == 0)
        {
            return;
        }
        AnimatorSet animatorset = new AnimatorSet();
        float f;
        float f1;
        float f2;
        float f3;
        float f4;
        float f5;
        Object obj;
        Object obj1;
        Owner owner;
        android.animation.AnimatorSet.Builder builder;
        ObjectAnimator objectanimator;
        ObjectAnimator objectanimator2;
        if (i == 0)
        {
            obj = selectedaccountnavigationview.mViewHolder.recentsAvatar1;
        } else
        {
            obj = selectedaccountnavigationview.mViewHolder.recentsAvatar2;
        }
        ((View) (obj)).bringToFront();
        owner = (Owner)selectedaccountnavigationview.mRecents.get(i);
        obj1 = ObjectAnimator.ofFloat(selectedaccountnavigationview.mViewHolder.selectedAvatar, "alpha", new float[] {
            1.0F, 0.0F
        });
        f = selectedaccountnavigationview.mSelectedAvatarSize / selectedaccountnavigationview.mRecentAvatarSize;
        f1 = selectedaccountnavigationview.mSelectedAvatarSize;
        f2 = selectedaccountnavigationview.mRecentAvatarSize;
        f3 = selectedaccountnavigationview.mViewHolder.selectedAvatar.getLeft() - ((View) (obj)).getLeft();
        f4 = selectedaccountnavigationview.mRecentAvatarSize;
        f5 = selectedaccountnavigationview.mSelectedAvatarSize;
        builder = animatorset.play(((Animator) (obj1)));
        obj1 = ObjectAnimator.ofFloat(obj, "translationX", new float[] {
            f3 - (f4 - f5) * 0.5F
        });
        ((ObjectAnimator) (obj1)).setDuration(450L);
        objectanimator = ObjectAnimator.ofFloat(obj, "translationY", new float[] {
            (f1 - f2) * 0.5F
        });
        objectanimator.setDuration(450L);
        objectanimator2 = ObjectAnimator.ofFloat(obj, "scaleY", new float[] {
            f
        });
        objectanimator2.setDuration(300L);
        obj = ObjectAnimator.ofFloat(obj, "scaleX", new float[] {
            f
        });
        ((ObjectAnimator) (obj)).setDuration(300L);
        builder.with(((Animator) (obj1))).with(objectanimator).with(objectanimator2).with(((Animator) (obj)));
        if (i == 0)
        {
            obj = selectedaccountnavigationview.mViewHolder.crossfadeRecents1;
        } else
        {
            obj = selectedaccountnavigationview.mViewHolder.crossfadeRecents2;
        }
        if (i == 0)
        {
            obj1 = selectedaccountnavigationview.mViewHolder.crossfadeRecents1Image;
        } else
        {
            obj1 = selectedaccountnavigationview.mViewHolder.crossfadeRecents2Image;
        }
        if (obj1 != null)
        {
            ((ImageView) (obj1)).setImageDrawable(selectedaccountnavigationview.mViewHolder.selectedAvatarImage.getDrawable());
        }
        if (obj != null)
        {
            ((View) (obj)).setVisibility(0);
            obj1 = ObjectAnimator.ofFloat(obj, "alpha", new float[] {
                1.0F
            });
            ((ObjectAnimator) (obj1)).setDuration(450L);
            ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(obj, "scaleY", new float[] {
                1.0F
            });
            objectanimator1.setDuration(450L);
            obj = ObjectAnimator.ofFloat(obj, "scaleX", new float[] {
                1.0F
            });
            ((ObjectAnimator) (obj)).setDuration(450L);
            builder.with(((Animator) (obj1))).with(((Animator) (obj))).with(objectanimator1);
        }
        if (selectedaccountnavigationview.mViewHolder.offscreenText != null && selectedaccountnavigationview.mViewHolder.accountText != null)
        {
            selectedaccountnavigationview.mViewHolder.offscreenText.setAlpha(0.0F);
            selectedaccountnavigationview.mViewHolder.offscreenText.setTranslationX(0.0F);
            selectedaccountnavigationview.animateChangeText$256e089b(owner, builder, 150);
        }
        if (selectedaccountnavigationview.mViewHolder.coverPhoto != null)
        {
            obj = ObjectAnimator.ofFloat(selectedaccountnavigationview.mViewHolder.coverPhoto, "alpha", new float[] {
                0.0F
            });
            ((ObjectAnimator) (obj)).setDuration(300L);
            builder.with(((Animator) (obj)));
        }
        if (selectedaccountnavigationview.mViewHolder.offscreenCoverPhoto != null)
        {
            selectedaccountnavigationview.setCoverPhoto(selectedaccountnavigationview.mViewHolder, selectedaccountnavigationview.mViewHolder.offscreenCoverPhoto, owner);
            selectedaccountnavigationview.mViewHolder.offscreenCoverPhoto.setVisibility(0);
            obj = ObjectAnimator.ofFloat(selectedaccountnavigationview.mViewHolder.offscreenCoverPhoto, "alpha", new float[] {
                1.0F
            });
            ((ObjectAnimator) (obj)).setDuration(300L);
            builder.with(((Animator) (obj)));
        }
        animatorset.addListener(selectedaccountnavigationview. new _cls2());
        obj = selectedaccountnavigationview.mSelectedAccount;
        selectedaccountnavigationview.mSelectedAccount = (Owner)selectedaccountnavigationview.mRecents.get(i);
        selectedaccountnavigationview.mRecents.add(i, obj);
        selectedaccountnavigationview.mRecents.remove(i + 1);
        animatorset.setInterpolator(selectedaccountnavigationview.mAnimationInterpolator);
        selectedaccountnavigationview.mCurrentAnimation = animatorset;
        selectedaccountnavigationview.mCurrentAnimation.start();
        return;
    }

*/


}
