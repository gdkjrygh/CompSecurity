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
import android.os.Handler;
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
    public static interface AccountChangeListener
    {

        public abstract void onAccountChange(Owner owner);
    }

    final class DefaultViewHolderItemCreator
        implements ViewHolderItemCreator
    {

        final SelectedAccountNavigationView this$0;

        public final ViewHolderItem createViewHolderItem(View view)
        {
            ViewHolderItem viewholderitem = new ViewHolderItem();
            viewholderitem.root = view;
            viewholderitem.accountText = view.findViewById(R.id.account_text);
            viewholderitem.selectedAvatar = view.findViewById(R.id.avatar);
            viewholderitem.selectedAvatarImage = (ImageView)viewholderitem.selectedAvatar;
            viewholderitem.selectedAccountDisplayName = (TextView)view.findViewById(R.id.account_display_name);
            viewholderitem.selectedAddress = (TextView)view.findViewById(R.id.account_address);
            viewholderitem.coverPhoto = (ImageView)view.findViewById(R.id.cover_photo);
            viewholderitem.accountListButton = (ExpanderView)view.findViewById(R.id.account_list_button);
            viewholderitem.scrim = view.findViewById(R.id.scrim);
            viewholderitem.wrapper = findViewById(R.id.account_switcher_lib_view_wrapper);
            if (mShowRecents)
            {
                viewholderitem.recentsAvatar1 = view.findViewById(R.id.avatar_recents_one);
                viewholderitem.recentsAvatar1Image = (ImageView)viewholderitem.recentsAvatar1;
                viewholderitem.recentsAvatar2 = view.findViewById(R.id.avatar_recents_two);
                viewholderitem.recentsAvatar2Image = (ImageView)viewholderitem.recentsAvatar2;
                viewholderitem.offscreenAvatar = view.findViewById(R.id.offscreen_avatar);
                viewholderitem.offscreenAvatarImage = (ImageView)viewholderitem.offscreenAvatar;
                viewholderitem.offscreenCoverPhoto = (ImageView)view.findViewById(R.id.offscreen_cover_photo);
                viewholderitem.offscreenText = view.findViewById(R.id.offscreen_text);
                viewholderitem.offscreenAccountDisplayName = (TextView)view.findViewById(R.id.offscreen_account_display_name);
                viewholderitem.offscreenAddress = (TextView)view.findViewById(R.id.offscreen_account_address);
                viewholderitem.crossfadeRecents1 = view.findViewById(R.id.crossfade_avatar_recents_one);
                viewholderitem.crossfadeRecents1Image = (ImageView)viewholderitem.crossfadeRecents1;
                viewholderitem.crossfadeRecents2 = view.findViewById(R.id.crossfade_avatar_recents_two);
                viewholderitem.crossfadeRecents2Image = (ImageView)viewholderitem.crossfadeRecents2;
            }
            return viewholderitem;
        }

        private DefaultViewHolderItemCreator()
        {
            this$0 = SelectedAccountNavigationView.this;
            super();
        }

    }

    public static interface DrawerCloseListener
    {
    }

    public static interface NavigationModeChangeListener
    {

        public abstract void onNavigationModeChange(SelectedAccountNavigationView selectedaccountnavigationview);
    }

    public static interface ViewDecorator
    {
    }

    public static final class ViewHolderItem
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

    public static interface ViewHolderItemCreator
    {

        public abstract ViewHolderItem createViewHolderItem(View view);
    }


    private AccountChangeListener mAccountChangeListener;
    private int mActivePointerId;
    private Interpolator mAnimationInterpolator;
    private OwnersAvatarManager mAvatarLoader;
    private int mAvatarMarginTop;
    private GoogleApiClient mClient;
    private DrawerCloseListener mCloseDrawerListener;
    private OwnersCoverPhotoManager mCoverLoader;
    private AnimatorSet mCurrentAnimation;
    private ViewDecorator mDecorator;
    private int mDefaultHeight;
    private boolean mForceFullHeight;
    private boolean mIsRtl;
    private int mLayoutResId;
    private NavigationModeChangeListener mListener;
    private int mMinVelocity;
    private int mNavigationMode;
    private int mOffscreenAvatarStart;
    private int mOffscreenTextTranslationStart;
    private Owner mPendingBind;
    private Owner mPendingRecent1;
    private Owner mPendingRecent2;
    private Owner mPendingSelectedAccount;
    private float mRecentAvatarSize;
    private ArrayList mRecents;
    private float mRecents1Left;
    private int mRecents2Left;
    private Owner mSelectedAccount;
    private int mSelectedAvatarLeft;
    private float mSelectedAvatarSize;
    private int mSelectedAvatarWidth;
    private boolean mShowRecents;
    private float mStartX;
    private float mStartY;
    private boolean mSwiping;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    private ViewHolderItem mViewHolder;
    private ViewHolderItemCreator mViewHolderItemCreator;

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
        mSelectedAvatarSize = attributeset.getDimensionPixelSize(R.dimen.selected_account_avatar_size);
        mRecentAvatarSize = attributeset.getDimensionPixelSize(R.dimen.recent_account_avatar_size);
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
        mDefaultHeight = attributeset.getDimensionPixelSize(R.dimen.selected_account_height);
        mAvatarMarginTop = attributeset.getDimensionPixelSize(R.dimen.avatar_margin_top);
    }

    private void accountChanged()
    {
        if (mAccountChangeListener != null)
        {
            mAccountChangeListener.onAccountChange(mSelectedAccount);
        }
    }

    private void animateAccountSwipeChange()
    {
        AnimatorSet animatorset = new AnimatorSet();
        float f1 = mRecentAvatarSize / mSelectedAvatarSize;
        float f3 = mRecentAvatarSize;
        float f4 = mSelectedAvatarSize;
        float f;
        Object obj;
        ObjectAnimator objectanimator;
        ObjectAnimator objectanimator2;
        ObjectAnimator objectanimator4;
        int i;
        if (mRecents.size() > 1)
        {
            i = mViewHolder.recentsAvatar2.getLeft();
        } else
        {
            i = mViewHolder.recentsAvatar1.getLeft();
        }
        f = (float)(i - mViewHolder.selectedAvatar.getLeft()) + (mRecentAvatarSize - mSelectedAvatarSize) * 0.5F;
        obj = ObjectAnimator.ofFloat(mViewHolder.selectedAvatar, "translationX", new float[] {
            f
        });
        objectanimator = ObjectAnimator.ofFloat(mViewHolder.selectedAvatar, "translationY", new float[] {
            (f3 - f4) * 0.5F
        });
        objectanimator2 = ObjectAnimator.ofFloat(mViewHolder.selectedAvatar, "scaleY", new float[] {
            f1
        });
        objectanimator4 = ObjectAnimator.ofFloat(mViewHolder.selectedAvatar, "scaleX", new float[] {
            f1
        });
        obj = animatorset.play(((Animator) (obj))).with(objectanimator).with(objectanimator4).with(objectanimator2);
        if (mShowRecents && mRecents.size() > 0)
        {
            if (mRecents.size() > 1)
            {
                float f2 = mViewHolder.recentsAvatar1.getLeft() - mViewHolder.recentsAvatar2.getLeft();
                ((android.animation.AnimatorSet.Builder) (obj)).with(ObjectAnimator.ofFloat(mViewHolder.recentsAvatar2, "translationX", new float[] {
                    f2
                }));
            }
            ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(mViewHolder.recentsAvatar1, "translationX", new float[] {
                (float)(getWidth() - mViewHolder.recentsAvatar1.getLeft())
            });
            ObjectAnimator objectanimator3 = ObjectAnimator.ofFloat(mViewHolder.recentsAvatar1, "alpha", new float[] {
                0.0F
            });
            ((android.animation.AnimatorSet.Builder) (obj)).with(objectanimator1).with(objectanimator3);
            if (mViewHolder.offscreenAvatar != null)
            {
                ((android.animation.AnimatorSet.Builder) (obj)).with(ObjectAnimator.ofFloat(mViewHolder.offscreenAvatar, "translationX", new float[] {
                    0.0F
                }));
            }
            if (mViewHolder.offscreenText != null)
            {
                animateChangeText((Owner)mRecents.get(0), ((android.animation.AnimatorSet.Builder) (obj)), 0, 0);
            }
        }
        animatorset.addListener(new AnimatorListenerAdapter() {

            final SelectedAccountNavigationView this$0;

            public final void onAnimationEnd(Animator animator)
            {
                accountChanged();
                runPendingBinds();
                bindViews();
                mCurrentAnimation = null;
            }

            
            {
                this$0 = SelectedAccountNavigationView.this;
                super();
            }
        });
        obj = mSelectedAccount;
        mSelectedAccount = (Owner)mRecents.remove(0);
        mRecents.add(obj);
        closeDrawer(100);
        animatorset.setDuration((long)(450F * (1.0F - mViewHolder.selectedAvatar.getTranslationX() / f)));
        animatorset.setInterpolator(mAnimationInterpolator);
        mCurrentAnimation = animatorset;
        mCurrentAnimation.start();
    }

    private void animateAccountTapChange(int i)
    {
        if (mRecents == null || mRecents.size() == 0)
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
            obj = mViewHolder.recentsAvatar1;
        } else
        {
            obj = mViewHolder.recentsAvatar2;
        }
        ((View) (obj)).bringToFront();
        owner = (Owner)mRecents.get(i);
        obj1 = ObjectAnimator.ofFloat(mViewHolder.selectedAvatar, "alpha", new float[] {
            1.0F, 0.0F
        });
        f = mSelectedAvatarSize / mRecentAvatarSize;
        f1 = mSelectedAvatarSize;
        f2 = mRecentAvatarSize;
        f3 = mViewHolder.selectedAvatar.getLeft() - ((View) (obj)).getLeft();
        f4 = mRecentAvatarSize;
        f5 = mSelectedAvatarSize;
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
            obj = mViewHolder.crossfadeRecents1;
        } else
        {
            obj = mViewHolder.crossfadeRecents2;
        }
        if (i == 0)
        {
            obj1 = mViewHolder.crossfadeRecents1Image;
        } else
        {
            obj1 = mViewHolder.crossfadeRecents2Image;
        }
        if (obj1 != null)
        {
            ((ImageView) (obj1)).setImageDrawable(mViewHolder.selectedAvatarImage.getDrawable());
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
        if (mViewHolder.offscreenText != null && mViewHolder.accountText != null)
        {
            mViewHolder.offscreenText.setAlpha(0.0F);
            mViewHolder.offscreenText.setTranslationX(0.0F);
            animateChangeText(owner, builder, 150, 0);
        }
        if (mViewHolder.coverPhoto != null)
        {
            obj = ObjectAnimator.ofFloat(mViewHolder.coverPhoto, "alpha", new float[] {
                0.0F
            });
            ((ObjectAnimator) (obj)).setDuration(300L);
            builder.with(((Animator) (obj)));
        }
        if (mViewHolder.offscreenCoverPhoto != null)
        {
            setCoverPhoto(mViewHolder, mViewHolder.offscreenCoverPhoto, owner);
            mViewHolder.offscreenCoverPhoto.setVisibility(0);
            obj = ObjectAnimator.ofFloat(mViewHolder.offscreenCoverPhoto, "alpha", new float[] {
                1.0F
            });
            ((ObjectAnimator) (obj)).setDuration(300L);
            builder.with(((Animator) (obj)));
        }
        animatorset.addListener(new AnimatorListenerAdapter() {

            final SelectedAccountNavigationView this$0;

            public final void onAnimationEnd(Animator animator)
            {
                accountChanged();
                runPendingBinds();
                bindViews();
                mCurrentAnimation = null;
            }

            
            {
                this$0 = SelectedAccountNavigationView.this;
                super();
            }
        });
        obj = mSelectedAccount;
        mSelectedAccount = (Owner)mRecents.get(i);
        mRecents.add(i, obj);
        mRecents.remove(i + 1);
        closeDrawer(300);
        animatorset.setInterpolator(mAnimationInterpolator);
        mCurrentAnimation = animatorset;
        mCurrentAnimation.start();
    }

    private void animateChangeText(Owner owner, android.animation.AnimatorSet.Builder builder, int i, int j)
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
        objectanimator.setStartDelay(j);
        objectanimator.setDuration(150L);
        builder.with(owner).with(objectanimator);
    }

    private void bindRecent(ImageView imageview, Owner owner)
    {
        if (imageview != null && mAvatarLoader != null)
        {
            OwnersAvatarManager ownersavatarmanager = mAvatarLoader;
            imageview.setImageBitmap(OwnersAvatarManager.getPlaceholder(imageview.getContext(), owner.getAccountName(), owner.getPlusPageId(), 1));
            if (!TextUtils.isEmpty(owner.getAvatarUrl()))
            {
                mAvatarLoader.removePendingRequest(imageview);
                mAvatarLoader.loadOwnerAvatar(imageview, owner.getAccountName(), owner.getPlusPageId(), 2);
            } else
            {
                mAvatarLoader.removePendingRequest(imageview);
            }
            imageview.setVisibility(0);
            imageview.setContentDescription(getContext().getString(R.string.account_item, new Object[] {
                owner.getAccountName()
            }));
        }
    }

    private void bindRecents()
    {
        if (!mShowRecents)
        {
            return;
        }
        if (mViewHolder == null)
        {
            createViewHolder();
        }
        if (mViewHolder.coverPhoto != null && mViewHolder.coverPhoto.getMeasuredWidth() == 0)
        {
            forceLayout();
            return;
        }
        if (mRecents.size() > 0)
        {
            Owner owner = (Owner)mRecents.get(0);
            ViewHolderItem viewholderitem = mViewHolder;
            mViewHolder.recentsAvatar1.setVisibility(0);
            bindRecent(mViewHolder.recentsAvatar1Image, owner);
            setCoverPhoto(viewholderitem, viewholderitem.offscreenCoverPhoto, owner);
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

    private void bindSelectedView()
    {
        ViewHolderItem viewholderitem = mViewHolder;
        Owner owner = mSelectedAccount;
        if (viewholderitem.root != null)
        {
            viewholderitem.root.setContentDescription(getContext().getResources().getString(R.string.selected_account, new Object[] {
                mSelectedAccount.getAccountName()
            }));
        }
        if (viewholderitem.selectedAvatarImage != null)
        {
            ImageView imageview = viewholderitem.selectedAvatarImage;
            OwnersAvatarManager ownersavatarmanager = mAvatarLoader;
            imageview.setImageBitmap(OwnersAvatarManager.getPlaceholder(getContext(), owner.getAccountName(), owner.getPlusPageId(), 2));
            if (!TextUtils.isEmpty(owner.getAvatarUrl()))
            {
                mAvatarLoader.removePendingRequest(viewholderitem.selectedAvatarImage);
                mAvatarLoader.loadOwnerAvatar(viewholderitem.selectedAvatarImage, owner.getAccountName(), owner.getPlusPageId(), 2);
            } else
            {
                mAvatarLoader.removePendingRequest(viewholderitem.selectedAvatarImage);
            }
        }
        setAccountDisplayName(viewholderitem.selectedAccountDisplayName, viewholderitem.selectedAddress, owner);
        setCoverPhoto(viewholderitem, viewholderitem.coverPhoto, owner);
    }

    private void bindViews()
    {
        if (mViewHolder == null)
        {
            createViewHolder();
        }
        resetViews();
        bindSelectedView();
        bindRecents();
        if (mDecorator != null)
        {
            Object obj = mDecorator;
            obj = mViewHolder;
            obj = mSelectedAccount;
            obj = mRecents;
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

    private void closeDrawer(int i)
    {
        if (mCloseDrawerListener != null)
        {
            getHandler().postDelayed(new Runnable() {

                final SelectedAccountNavigationView this$0;

                public final void run()
                {
                    DrawerCloseListener _tmp = mCloseDrawerListener;
                }

            
            {
                this$0 = SelectedAccountNavigationView.this;
                super();
            }
            }, i);
        }
    }

    private void createViewHolder()
    {
        Context context = getContext();
        if (mLayoutResId == -1)
        {
            int i;
            if (mForceFullHeight)
            {
                i = R.layout.selected_account;
            } else
            if (AccountSwitcherView.isAtLeastL())
            {
                i = R.layout.selected_account;
            } else
            {
                i = R.layout.selected_account_short;
            }
            mLayoutResId = i;
        }
        if (mViewHolderItemCreator == null)
        {
            mViewHolderItemCreator = new DefaultViewHolderItemCreator();
        }
        LayoutInflater.from(context).inflate(mLayoutResId, this);
        mViewHolder = mViewHolderItemCreator.createViewHolderItem(this);
        if (mShowRecents)
        {
            mViewHolder.recentsAvatar1.setOnClickListener(new android.view.View.OnClickListener() {

                final SelectedAccountNavigationView this$0;

                public final void onClick(View view)
                {
                    animateAccountTapChange(0);
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
                    animateAccountTapChange(1);
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

    private void follow(float f)
    {
        if (mRecents1Left == -1F)
        {
            mRecents1Left = mViewHolder.recentsAvatar1.getLeft();
            mRecents2Left = mViewHolder.recentsAvatar2.getLeft();
            mSelectedAvatarLeft = mViewHolder.selectedAvatar.getLeft() + mViewHolder.selectedAvatar.getPaddingLeft();
            mSelectedAvatarWidth = mViewHolder.selectedAvatar.getWidth();
        }
        float f1;
        float f2;
        float f3;
        float f5;
        float f6;
        if (mIsRtl)
        {
            f = Math.min(f, 0.0F);
        } else
        {
            f = Math.max(f, 0.0F);
        }
        f3 = mRecentAvatarSize / mSelectedAvatarSize;
        f2 = mRecentAvatarSize;
        f5 = mSelectedAvatarSize;
        if (mRecents.size() > 1)
        {
            f1 = mRecents2Left;
        } else
        {
            f1 = mRecents1Left;
        }
        f6 = (f1 - (float)mSelectedAvatarLeft) + (mRecentAvatarSize - mSelectedAvatarSize) * 0.5F;
        f1 = Math.min(1.0F, f / f6);
        f = Math.abs((f2 - f5) * 0.5F);
        f2 = Math.max(0.0F, 1.0F - f1);
        mViewHolder.selectedAvatar.setTranslationX(f6 * f1);
        mViewHolder.selectedAvatar.setTranslationY(-1F * Math.abs(f1 * f));
        f = Math.min(1.0F, Math.max(f3, 1.0F - f1 * f3));
        mViewHolder.selectedAvatar.setScaleX(f);
        mViewHolder.selectedAvatar.setScaleY(f);
        if (mViewHolder.offscreenAvatar != null)
        {
            if (mViewHolder.offscreenAvatar.getVisibility() != 0)
            {
                float f4;
                Owner owner;
                int i;
                if (mIsRtl)
                {
                    i = getWidth() - mSelectedAvatarLeft;
                } else
                {
                    i = -mSelectedAvatarWidth - mSelectedAvatarLeft;
                }
                mOffscreenAvatarStart = i;
                mViewHolder.offscreenAvatar.setTranslationX(mOffscreenAvatarStart);
                mViewHolder.offscreenAvatarImage.setImageDrawable(mViewHolder.recentsAvatar1Image.getDrawable());
                mViewHolder.offscreenAvatar.setVisibility(0);
            } else
            {
                f = -mOffscreenAvatarStart;
                mViewHolder.offscreenAvatar.setTranslationX((float)mOffscreenAvatarStart + f * f1);
            }
        }
        if (mRecents.size() > 1)
        {
            f = mRecents1Left;
            f4 = mRecents2Left;
            mViewHolder.recentsAvatar2.setTranslationX(f1 * (f - f4));
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
                    mViewHolder.offscreenCoverPhoto.setAlpha(f1);
                }
            }
            if (mViewHolder.coverPhoto != null)
            {
                mViewHolder.coverPhoto.setAlpha(1.0F - f1);
            }
            if (mIsRtl)
            {
                f = (float)getLeft() - ((float)mViewHolder.recentsAvatar1.getWidth() + mRecents1Left);
            } else
            {
                f = (float)getWidth() - mRecents1Left;
            }
            mViewHolder.recentsAvatar1.setTranslationX(f * f1);
            mViewHolder.recentsAvatar1.setAlpha(f2);
            if (mViewHolder.offscreenText != null)
            {
                if (mViewHolder.offscreenText.getVisibility() != 0)
                {
                    owner = (Owner)mRecents.get(0);
                    mOffscreenTextTranslationStart = mOffscreenAvatarStart;
                    mViewHolder.offscreenText.setTranslationX(mOffscreenTextTranslationStart);
                    setAccountDisplayName(mViewHolder.offscreenAccountDisplayName, mViewHolder.offscreenAddress, owner);
                    mViewHolder.offscreenText.setAlpha(0.0F);
                    mViewHolder.offscreenText.setVisibility(0);
                } else
                {
                    if (f1 > 0.3333333F)
                    {
                        f = Math.min(1.0F, (f1 - 0.3333333F) * 3F);
                        mViewHolder.offscreenText.setAlpha(f);
                    }
                    mViewHolder.offscreenText.setTranslationX((float)mOffscreenTextTranslationStart + (float)(-mOffscreenTextTranslationStart) * f1);
                }
            }
            if (mViewHolder.accountText != null)
            {
                mViewHolder.accountText.setTranslationX(mViewHolder.selectedAvatar.getTranslationX());
                f = Math.max(0.0F, 1.0F - 3F * f1);
                mViewHolder.accountText.setAlpha(f);
            }
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

    private void resetViews()
    {
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
    }

    private void runPendingBinds()
    {
        if (mPendingSelectedAccount != null)
        {
            mSelectedAccount = mPendingSelectedAccount;
            mPendingSelectedAccount = null;
        }
        if (mPendingRecent1 != null || mPendingRecent2 != null)
        {
            mRecents.clear();
            if (mPendingRecent1 != null)
            {
                mRecents.add(mPendingRecent1);
            }
            if (mPendingRecent2 != null)
            {
                mRecents.add(mPendingRecent2);
            }
            mPendingRecent1 = null;
            mPendingRecent2 = null;
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
            mCoverLoader.loadOwnerCoverPhoto(imageview, owner.getAccountName(), owner.getPlusPageId(), viewholderitem.coverPhoto.getMeasuredWidth());
            return;
        } else
        {
            mCoverLoader.removePendingRequest(imageview);
            viewholderitem = mCoverLoader;
            imageview.setImageBitmap(OwnersCoverPhotoManager.getPlaceholder(getContext()));
            return;
        }
    }

    private void snapBack()
    {
        AnimatorSet animatorset = new AnimatorSet();
        android.animation.AnimatorSet.Builder builder = animatorset.play(ObjectAnimator.ofFloat(mViewHolder.selectedAvatar, "alpha", new float[] {
            1.0F
        }));
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(mViewHolder.selectedAvatar, "translationX", new float[] {
            0.0F
        });
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(mViewHolder.selectedAvatar, "translationY", new float[] {
            0.0F
        });
        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(mViewHolder.selectedAvatar, "scaleX", new float[] {
            1.0F
        });
        ObjectAnimator objectanimator3 = ObjectAnimator.ofFloat(mViewHolder.selectedAvatar, "scaleY", new float[] {
            1.0F
        });
        builder.with(objectanimator).with(objectanimator1).with(objectanimator2).with(objectanimator3);
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
        objectanimator2 = ObjectAnimator.ofFloat(mViewHolder.recentsAvatar1, "translationX", new float[] {
            0.0F
        });
        objectanimator = ObjectAnimator.ofFloat(mViewHolder.offscreenText, "translationX", new float[] {
            (float)(-getWidth())
        });
        objectanimator3 = ObjectAnimator.ofFloat(mViewHolder.recentsAvatar1, "alpha", new float[] {
            1.0F
        });
        objectanimator1 = ObjectAnimator.ofFloat(mViewHolder.accountText, "translationX", new float[] {
            0.0F
        });
        builder.with(objectanimator2).with(objectanimator3);
        objectanimator2 = ObjectAnimator.ofFloat(mViewHolder.offscreenText, "alpha", new float[] {
            0.0F
        });
        objectanimator3 = ObjectAnimator.ofFloat(mViewHolder.accountText, "alpha", new float[] {
            1.0F
        });
        builder.with(objectanimator).with(objectanimator2).with(objectanimator1).with(objectanimator3);
        animatorset.setDuration(100L);
        animatorset.addListener(new AnimatorListenerAdapter() {

            final SelectedAccountNavigationView this$0;

            public final void onAnimationEnd(Animator animator)
            {
                mViewHolder.offscreenAvatar.setVisibility(8);
                mViewHolder.offscreenText.setVisibility(8);
                if (mViewHolder.offscreenCoverPhoto != null)
                {
                    mViewHolder.offscreenCoverPhoto.setVisibility(8);
                }
                runPendingBinds();
                bindViews();
                mCurrentAnimation = null;
            }

            
            {
                this$0 = SelectedAccountNavigationView.this;
                super();
            }
        });
        animatorset.setInterpolator(mAnimationInterpolator);
        mCurrentAnimation = animatorset;
        mCurrentAnimation.start();
    }

    private void updateAvatarMargin(View view, int i)
    {
        if (view != null)
        {
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
            marginlayoutparams.topMargin = mAvatarMarginTop + i;
            view.setLayoutParams(marginlayoutparams);
        }
    }

    public final void applyTopInset(int i)
    {
        if (mViewHolder == null)
        {
            createViewHolder();
        }
        int j = mDefaultHeight + i;
        setMinimumHeight(j);
        android.view.ViewGroup.LayoutParams layoutparams = mViewHolder.wrapper.getLayoutParams();
        if (layoutparams == null)
        {
            layoutparams = new android.view.ViewGroup.LayoutParams(-1, j);
        } else
        {
            layoutparams.height = j;
        }
        mViewHolder.wrapper.setLayoutParams(layoutparams);
        updateAvatarMargin(mViewHolder.selectedAvatar, i);
        updateAvatarMargin(mViewHolder.offscreenAvatar, i);
        updateAvatarMargin(mViewHolder.recentsAvatar1, i);
        updateAvatarMargin(mViewHolder.recentsAvatar2, i);
        updateAvatarMargin(mViewHolder.crossfadeRecents1, i);
        updateAvatarMargin(mViewHolder.crossfadeRecents2, i);
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

    public final int getNavigationMode()
    {
        return mNavigationMode;
    }

    public final ArrayList getRecents()
    {
        return mRecents;
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
        ViewParent viewparent;
        int i;
        i = motionevent.getAction();
        viewparent = getParent();
        i;
        JVM INSTR tableswitch 0 6: default 56
    //                   0 58
    //                   1 241
    //                   2 77
    //                   3 462
    //                   4 56
    //                   5 477
    //                   6 492;
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
        float f4 = motionevent.getY(j);
        float f2 = f - mStartX;
        f4 -= mStartY;
        if (mShowRecents && mRecents.size() > 0 && !mSwiping && f2 * f2 + f4 * f4 > (float)(mTouchSlop * mTouchSlop) && Math.abs(f2) > Math.abs(f4))
        {
            mSwiping = true;
            if (viewparent != null)
            {
                viewparent.requestDisallowInterceptTouchEvent(true);
            }
        }
        if (mSwiping)
        {
            follow(f - mStartX);
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
            float f1;
            float f3;
            float f5;
            boolean flag;
            boolean flag1;
            if (mRecents.size() > 1)
            {
                f1 = mRecents2Left;
            } else
            {
                f1 = mRecents1Left;
            }
            f5 = mViewHolder.selectedAvatar.getTranslationX();
            f3 = f5;
            if (mIsRtl)
            {
                f3 = Math.abs(f5);
            }
            if (f3 >= 0.5F * f1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag;
            if (!flag)
            {
                flag1 = flag;
                if (motionevent.getX(mActivePointerId) - mStartX > (float)mTouchSlop)
                {
                    mVelocityTracker.computeCurrentVelocity(1000);
                    if (Math.abs(mVelocityTracker.getXVelocity()) > (float)mMinVelocity)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                }
            }
            if (flag1)
            {
                animateAccountSwipeChange();
            } else
            {
                snapBack();
            }
        } else
        {
            changeNavigationMode();
        }
        mSwiping = false;
        if (viewparent != null)
        {
            viewparent.requestDisallowInterceptTouchEvent(false);
        }
        mVelocityTracker.clear();
        return false;
_L5:
        if (viewparent != null)
        {
            viewparent.requestDisallowInterceptTouchEvent(false);
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

    public void setAvatarManager(OwnersAvatarManager ownersavatarmanager)
    {
        mAvatarLoader = ownersavatarmanager;
    }

    public void setClient(GoogleApiClient googleapiclient)
    {
        mClient = googleapiclient;
        if (mClient != null)
        {
            mCoverLoader = new OwnersCoverPhotoManager(getContext(), mClient);
        }
    }

    public void setDrawerCloseListener(DrawerCloseListener drawercloselistener)
    {
        mCloseDrawerListener = drawercloselistener;
    }

    public void setForceFullHeight(boolean flag)
    {
        if (flag && AccountSwitcherView.isAtLeastVersion(11))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mForceFullHeight = flag;
        mShowRecents = mForceFullHeight;
    }

    public void setNavigationMode(int i)
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

    public void setOnAccountChangeListener(AccountChangeListener accountchangelistener)
    {
        mAccountChangeListener = accountchangelistener;
    }

    public void setOnNavigationModeChange(NavigationModeChangeListener navigationmodechangelistener)
    {
        mListener = navigationmodechangelistener;
    }

    public void setRecents(Owner owner, Owner owner1)
    {
        if (mCurrentAnimation != null && mCurrentAnimation.isRunning())
        {
            mPendingRecent1 = owner;
            mPendingRecent2 = owner1;
            return;
        }
        if (mRecents == null)
        {
            mRecents = new ArrayList();
        } else
        {
            mRecents.clear();
        }
        if (owner != null)
        {
            mRecents.add(owner);
        }
        if (owner1 != null)
        {
            mRecents.add(owner1);
        }
        bindRecents();
    }

    public void setRecentsLayout(int i, ViewHolderItemCreator viewholderitemcreator, ViewDecorator viewdecorator)
    {
        setSelectedAccountLayout(i, viewholderitemcreator, viewdecorator);
    }

    public void setSelectedAccountLayout(int i, ViewHolderItemCreator viewholderitemcreator, ViewDecorator viewdecorator)
    {
        mLayoutResId = i;
        mViewHolderItemCreator = viewholderitemcreator;
        mDecorator = viewdecorator;
    }





/*
    static AnimatorSet access$302(SelectedAccountNavigationView selectedaccountnavigationview, AnimatorSet animatorset)
    {
        selectedaccountnavigationview.mCurrentAnimation = animatorset;
        return animatorset;
    }

*/





}
