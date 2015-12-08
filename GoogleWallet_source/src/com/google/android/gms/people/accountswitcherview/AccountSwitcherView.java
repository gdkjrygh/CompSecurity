// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.people.model.Owner;
import java.util.List;

// Referenced classes of package com.google.android.gms.people.accountswitcherview:
//            ShrinkingItem, ScrimDrawable, SelectedAccountNavigationView, ExpanderView, 
//            OwnersListAdapter, OwnersAvatarManager

public class AccountSwitcherView extends FrameLayout
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, SelectedAccountNavigationView.AccountChangeListener, SelectedAccountNavigationView.NavigationModeChangeListener
{
    public static interface AccountSelectedListener
    {
    }

    public static interface AddAccountListener
    {
    }

    public static interface ManageAccountsListener
    {
    }

    public static interface NavigationModeChangeListener
    {
    }

    public static interface SignInListener
    {
    }

    final class WindowInsetsListener
        implements android.view.View.OnApplyWindowInsetsListener
    {

        final AccountSwitcherView this$0;

        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
        {
            applyTopInset(windowinsets.getSystemWindowInsetTop());
            return windowinsets;
        }

        private WindowInsetsListener()
        {
            this$0 = AccountSwitcherView.this;
            super();
        }

    }


    public static final int NAVIGATION_MODE_ACCOUNTS = 1;
    public static final int NAVIGATION_MODE_DEFAULT = 0;
    private int mAccountLayoutResId;
    private ListView mAccountList;
    private OwnersListAdapter.ViewDecorator mAccountListDecorator;
    private OwnersListAdapter.ViewHolderItemCreator mAccountListViewHolderItemCreator;
    private AccountSelectedListener mAccountSelectedListener;
    private ShrinkingItem mAccountShrinkingWrapper;
    private OwnersListAdapter mAccountsAdapter;
    private AddAccountListener mAddAccountListener;
    private OwnersAvatarManager mAvatarManager;
    private GoogleApiClient mClient;
    private int mCurrentHeaderTop;
    private boolean mDrawScrimInPadding;
    private View mDrawerView;
    private boolean mForceFullHeight;
    private ManageAccountsListener mManageAccountsListener;
    private FrameLayout mNavContainer;
    private int mNavContainerTop;
    private View mNavView;
    private NavigationModeChangeListener mNavigationModeListener;
    private List mOwners;
    public ScrimDrawable mScrimDrawable;
    private boolean mScrollOff;
    private Owner mSelectedAccount;
    private SelectedAccountNavigationView mSelectedAccountView;
    private boolean mShowAddAccount;
    private boolean mShowManageAccounts;
    private boolean mShowSignIn;
    private ViewGroup mSignIn;
    private SignInListener mSignInListener;
    private ExpanderView mSignInShowHideAccounts;
    private boolean mUseCustomOrdering;

    public AccountSwitcherView(Context context)
    {
        this(context, null);
    }

    public AccountSwitcherView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mShowManageAccounts = true;
        mShowAddAccount = true;
        mDrawScrimInPadding = false;
        new TypedValue();
        attributeset = context.obtainStyledAttributes(attributeset, new int[] {
            R.attr.forceFullHeight
        });
        mForceFullHeight = attributeset.getBoolean(0, isAtLeastL());
        attributeset.recycle();
        inflateViews(context);
    }

    private void animateAccountWrapper(boolean flag, Interpolator interpolator)
    {
        int i;
        int j;
        if (flag)
        {
            j = 0;
            i = 1;
        } else
        {
            j = 1;
            i = 0;
        }
        if (isAtLeastVersion(11))
        {
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(mAccountShrinkingWrapper, "animatedHeightFraction", new float[] {
                (float)j, (float)i
            });
            objectanimator.setDuration(200L);
            objectanimator.setInterpolator(interpolator);
            objectanimator.start();
            return;
        } else
        {
            mAccountShrinkingWrapper.setAnimatedHeightFraction(i);
            return;
        }
    }

    private void applyTopInset(int i)
    {
        mSignIn.setPadding(mSignIn.getPaddingLeft(), i, mSignIn.getPaddingRight(), mSignIn.getPaddingBottom());
        mScrimDrawable.setIntrinsicHeight(i);
        mSelectedAccountView.applyTopInset(i);
    }

    private void inflateViews(Context context)
    {
        LayoutInflater.from(context).inflate(R.layout.account_switcher, this);
        mSignIn = (ViewGroup)findViewById(R.id.sign_in);
        mSignIn.setOnClickListener(this);
        mSignInShowHideAccounts = (ExpanderView)findViewById(R.id.account_list_button);
        mSignInShowHideAccounts.setOnClickListener(this);
        mSelectedAccountView = (SelectedAccountNavigationView)findViewById(R.id.selected_account_container);
        mSelectedAccountView.setForceFullHeight(mForceFullHeight);
        mSelectedAccountView.setOnNavigationModeChange(this);
        mSelectedAccountView.setOnAccountChangeListener(this);
        mAccountList = (ListView)findViewById(R.id.accounts_list);
        mAccountList.setOnItemClickListener(this);
        mAccountShrinkingWrapper = (ShrinkingItem)findViewById(R.id.accounts_wrapper);
        mAccountLayoutResId = -1;
        mNavContainer = (FrameLayout)findViewById(R.id.nav_container);
        setNavigationMode(0);
    }

    public static boolean isAtLeastL()
    {
        return isAtLeastVersion(21);
    }

    public static boolean isAtLeastVersion(int i)
    {
        return android.os.Build.VERSION.SDK_INT >= i;
    }

    private void offsetHeader(View view, int i)
    {
        view.offsetTopAndBottom(i);
        mCurrentHeaderTop = view.getTop();
    }

    private void offsetNav(int i)
    {
        mNavContainer.offsetTopAndBottom(i);
        mNavContainerTop = mNavContainer.getTop();
    }

    private void setNavigationModeInternal(int i)
    {
        mSelectedAccountView.setNavigationMode(i);
    }

    private void setSelectedAccount(Owner owner, boolean flag)
    {
        Owner owner1 = mSelectedAccount;
        mSelectedAccount = owner;
        if (mOwners != null)
        {
            mOwners = OwnersListAdapter.removeSelectedAccount(mOwners, owner1, mSelectedAccount);
            if (!flag)
            {
                mSelectedAccountView.bind(mSelectedAccount);
            }
            mAccountsAdapter.setOwners(mOwners);
            return;
        } else
        {
            mSelectedAccountView.bind(null);
            return;
        }
    }

    private void updateScrollOff()
    {
        if (mNavView != null && isAtLeastL())
        {
            mNavView.setNestedScrollingEnabled(mScrollOff);
            mNavContainer.setNestedScrollingEnabled(mScrollOff);
            setNestedScrollingEnabled(mScrollOff);
        }
    }

    private void updateVisibility(boolean flag)
    {
        switch (mSelectedAccountView.getNavigationMode())
        {
        default:
            return;

        case 0: // '\0'
            if (flag)
            {
                AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
                alphaanimation.setDuration(200L);
                mNavContainer.setAnimation(alphaanimation);
                animateAccountWrapper(false, new AccelerateInterpolator(0.8F));
            } else
            {
                mNavContainer.setAnimation(null);
            }
            mNavContainer.setVisibility(0);
            mAccountShrinkingWrapper.setVisibility(8);
            return;

        case 1: // '\001'
            break;
        }
        if (flag)
        {
            AlphaAnimation alphaanimation1 = new AlphaAnimation(1.0F, 0.0F);
            alphaanimation1.setDuration(200L);
            alphaanimation1.setStartOffset(133L);
            animateAccountWrapper(true, new DecelerateInterpolator(0.8F));
        } else
        {
            mNavContainer.setAnimation(null);
        }
        mNavContainer.setVisibility(8);
        mAccountShrinkingWrapper.setVisibility(0);
    }

    public int getNestedScrollAxes()
    {
        return 2;
    }

    public final void onAccountChange(Owner owner)
    {
        setSelectedAccount(owner, true);
        if (mAccountSelectedListener != null)
        {
            owner = mAccountSelectedListener;
            owner = mSelectedAccount;
        }
    }

    public void onClick(View view)
    {
        boolean flag = true;
        if (view == mSignIn)
        {
            if (mSignInListener != null)
            {
                view = mSignInListener;
            }
        } else
        if (view == mSignInShowHideAccounts)
        {
            int i;
            if (mSelectedAccountView.getNavigationMode() == 1)
            {
                i = 0;
            } else
            {
                i = 1;
            }
            setNavigationModeInternal(i);
            view = mSignInShowHideAccounts;
            if (mSelectedAccountView.getNavigationMode() != 1)
            {
                flag = false;
            }
            view.setExpanded(flag);
            onNavigationModeChange(mSelectedAccountView);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (mDrawerView != null)
        {
            mDrawerView.setOnApplyWindowInsetsListener(null);
            mDrawerView = null;
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (mAccountsAdapter.getItemViewType(i) != 0) goto _L2; else goto _L1
_L1:
        setSelectedAccount(mAccountsAdapter.getItem(i), false);
        if (mAccountSelectedListener != null)
        {
            adapterview = mAccountSelectedListener;
            adapterview = mSelectedAccount;
        }
_L4:
        return;
_L2:
        if (mAccountsAdapter.getItemViewType(i) != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (mAddAccountListener == null) goto _L4; else goto _L3
_L3:
        adapterview = mAddAccountListener;
        return;
        if (mAccountsAdapter.getItemViewType(i) != 2 || mManageAccountsListener == null) goto _L4; else goto _L5
_L5:
        adapterview = mManageAccountsListener;
        return;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        Object obj;
        if (mShowSignIn)
        {
            obj = mSignIn;
        } else
        {
            obj = mSelectedAccountView;
        }
        if (mCurrentHeaderTop != ((View) (obj)).getTop())
        {
            ((View) (obj)).offsetTopAndBottom(mCurrentHeaderTop - ((View) (obj)).getTop());
        }
        if (mNavContainerTop != mNavContainer.getTop())
        {
            mNavContainer.offsetTopAndBottom(mNavContainerTop - mNavContainer.getTop());
        }
    }

    public void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        j = 0;
        do
        {
label0:
            {
                if (j < getChildCount())
                {
                    if (!getChildAt(j).equals(mNavContainer))
                    {
                        break label0;
                    }
                    if (mShowSignIn)
                    {
                        j = mSignIn.getMeasuredHeight();
                    } else
                    {
                        j = mSelectedAccountView.getMeasuredHeight();
                    }
                    mNavContainer.setPadding(mNavContainer.getPaddingLeft(), j, mNavContainer.getPaddingRight(), mNavContainer.getPaddingBottom());
                    if (!mScrollOff)
                    {
                        j = 0;
                    }
                    mNavContainer.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(getHeight(), 0x40000000) + j);
                }
                return;
            }
            j++;
        } while (true);
    }

    public final void onNavigationModeChange(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        updateVisibility(true);
        if (mNavigationModeListener != null)
        {
            selectedaccountnavigationview = mNavigationModeListener;
            mSelectedAccountView.getNavigationMode();
        }
    }

    public boolean onNestedFling(View view, float f, float f1, boolean flag)
    {
        if (mShowSignIn)
        {
            view = mSignIn;
        } else
        {
            view = mSelectedAccountView;
        }
        if (!flag && f1 < 0.0F && view.getBottom() < 0)
        {
            offsetHeader(view, -view.getTop());
            offsetNav(-view.getTop());
            return true;
        }
        if (flag && f1 > 0.0F)
        {
            if (view.getTop() > -view.getMeasuredHeight())
            {
                offsetHeader(view, -view.getMeasuredHeight() - view.getTop());
            }
            if (mNavContainer.getTop() > -view.getMeasuredHeight())
            {
                offsetNav(-view.getMeasuredHeight() - mNavContainer.getTop());
            }
        }
        return false;
    }

    public void onNestedPreScroll(View view, int i, int j, int ai[])
    {
        if (mShowSignIn)
        {
            view = mSignIn;
        } else
        {
            view = mSelectedAccountView;
        }
        if (mSelectedAccountView.getNavigationMode() != 1)
        {
            boolean flag = false;
            i = ((flag) ? 1 : 0);
            if (j > 0)
            {
                i = ((flag) ? 1 : 0);
                if (view.getBottom() > 0)
                {
                    if (view.getBottom() > j)
                    {
                        i = -j;
                    } else
                    {
                        i = -view.getBottom();
                    }
                }
            }
            if (i != 0)
            {
                if (view.getTop() + i < -view.getMeasuredHeight())
                {
                    offsetHeader(view, -view.getMeasuredHeight() - view.getTop());
                } else
                {
                    offsetHeader(view, i);
                }
                if (mNavContainer.getTop() + i < -view.getMeasuredHeight())
                {
                    offsetNav(-view.getMeasuredHeight() - mNavContainer.getTop());
                } else
                {
                    offsetNav(i);
                }
                ai[0] = 0;
                ai[1] = i;
                return;
            }
        }
    }

    public void onNestedScroll(View view, int i, int j, int k, int l)
    {
label0:
        {
            j = 0;
            if (mShowSignIn)
            {
                view = mSignIn;
            } else
            {
                view = mSelectedAccountView;
            }
            i = j;
            if (l < 0)
            {
                i = j;
                if (view.getTop() < 0)
                {
                    if (l <= view.getTop())
                    {
                        i = view.getTop();
                    } else
                    {
                        i = l;
                    }
                }
            }
            if (i != 0)
            {
                if (view.getTop() - i > 0)
                {
                    offsetHeader(view, -view.getTop());
                } else
                {
                    offsetHeader(view, -i);
                }
                if (mNavContainer.getTop() - i <= view.getMeasuredHeight())
                {
                    break label0;
                }
                offsetNav(view.getMeasuredHeight() - mNavContainer.getTop());
            }
            return;
        }
        offsetNav(-i);
    }

    public boolean onStartNestedScroll(View view, View view1, int i)
    {
        return mScrollOff;
    }

    public void setAccountListLayout(int i, OwnersListAdapter.ViewHolderItemCreator viewholderitemcreator, OwnersListAdapter.ViewDecorator viewdecorator)
    {
        mAccountLayoutResId = i;
        mAccountListViewHolderItemCreator = viewholderitemcreator;
        mAccountListDecorator = viewdecorator;
    }

    public void setAccountSelectedListener(AccountSelectedListener accountselectedlistener)
    {
        mAccountSelectedListener = accountselectedlistener;
    }

    public void setAccounts(List list)
    {
        setAccounts(list, null);
    }

    public void setAccounts(List list, Owner owner)
    {
        setAccounts(list, owner, null, null);
    }

    public void setAccounts(List list, Owner owner, Owner owner1, Owner owner2)
    {
        if (mAccountsAdapter == null)
        {
            mAccountsAdapter = new OwnersListAdapter(getContext(), mAccountLayoutResId, mAccountListViewHolderItemCreator, mAccountListDecorator);
            mAccountsAdapter.setUseCustomOrdering(mUseCustomOrdering);
            mAccountsAdapter.setAvatarManager(mAvatarManager);
            mAccountList.setAdapter(mAccountsAdapter);
            mAccountsAdapter.showManageAccounts(mShowManageAccounts);
            mAccountsAdapter.showAddAccount(mShowAddAccount);
        }
        mOwners = list;
        if (mOwners == null)
        {
            mSelectedAccount = null;
        }
        setSelectedAccount(owner);
        mAccountsAdapter.setOwners(mOwners);
        mSelectedAccountView.setRecents(owner1, owner2);
    }

    public void setAddAccountListener(AddAccountListener addaccountlistener)
    {
        mAddAccountListener = addaccountlistener;
    }

    public void setClient(GoogleApiClient googleapiclient)
    {
        mClient = googleapiclient;
        mSelectedAccountView.setClient(mClient);
        mAvatarManager = new OwnersAvatarManager(getContext(), mClient);
        mSelectedAccountView.setAvatarManager(mAvatarManager);
    }

    public void setDrawScrimInTopPadding(boolean flag)
    {
        mDrawScrimInPadding = flag;
        int i = getPaddingTop();
        if (mDrawScrimInPadding && i > 0)
        {
            applyTopInset(i);
        }
    }

    public void setDrawer(View view)
    {
        if (isAtLeastL())
        {
            boolean flag = ViewCompat.getFitsSystemWindows(view);
            if (flag || mDrawScrimInPadding)
            {
                setForegroundGravity(55);
                mScrimDrawable = new ScrimDrawable();
                setForeground(mScrimDrawable);
            }
            if (mDrawerView != null && ViewCompat.getFitsSystemWindows(mDrawerView))
            {
                mDrawerView.setOnApplyWindowInsetsListener(null);
                mDrawerView = null;
            }
            if (flag && view != null)
            {
                mDrawerView = view;
                mDrawerView.setOnApplyWindowInsetsListener(new WindowInsetsListener());
            }
        }
    }

    public void setDrawerCloseListener(SelectedAccountNavigationView.DrawerCloseListener drawercloselistener)
    {
        mSelectedAccountView.setDrawerCloseListener(drawercloselistener);
    }

    public void setManageAccountsListener(ManageAccountsListener manageaccountslistener)
    {
        mManageAccountsListener = manageaccountslistener;
    }

    public void setNavigation(View view)
    {
        if (mNavContainer.getChildCount() > 0)
        {
            mNavContainer.removeAllViews();
        }
        mNavContainer.addView(view);
        mNavView = view;
        mNavContainer.setClipToPadding(false);
        updateScrollOff();
    }

    public void setNavigationMode(int i)
    {
        boolean flag = true;
        setNavigationModeInternal(i);
        updateVisibility(false);
        ExpanderView expanderview = mSignInShowHideAccounts;
        if (mSelectedAccountView.getNavigationMode() != 1)
        {
            flag = false;
        }
        expanderview.setExpanded(flag);
    }

    public void setNavigationModeChangeListener(NavigationModeChangeListener navigationmodechangelistener)
    {
        mNavigationModeListener = navigationmodechangelistener;
    }

    public void setPadding(int i, int j, int k, int l)
    {
        int i1 = j;
        if (mDrawScrimInPadding)
        {
            applyTopInset(j);
            i1 = 0;
        }
        super.setPadding(i, i1, k, l);
    }

    public void setPaddingRelative(int i, int j, int k, int l)
    {
        int i1 = j;
        if (mDrawScrimInPadding)
        {
            applyTopInset(j);
            i1 = 0;
        }
        super.setPaddingRelative(i, i1, k, l);
    }

    public void setRecents(Owner owner, Owner owner1)
    {
        mSelectedAccountView.setRecents(owner, owner1);
    }

    public void setScrollingHeaderEnabled(boolean flag)
    {
        if (flag && isAtLeastL())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mScrollOff = flag;
        updateScrollOff();
    }

    public void setSelectedAccount(Owner owner)
    {
        setSelectedAccount(owner, false);
    }

    public void setSelectedAccountLayout(int i, SelectedAccountNavigationView.ViewHolderItemCreator viewholderitemcreator, SelectedAccountNavigationView.ViewDecorator viewdecorator)
    {
        mSelectedAccountView.setSelectedAccountLayout(i, viewholderitemcreator, viewdecorator);
    }

    public void setSignInListener(SignInListener signinlistener)
    {
        mSignInListener = signinlistener;
    }

    public void setUseCustomOrdering(boolean flag)
    {
        mUseCustomOrdering = flag;
        if (mAccountsAdapter != null)
        {
            mAccountsAdapter.setUseCustomOrdering(mUseCustomOrdering);
        }
    }

}
