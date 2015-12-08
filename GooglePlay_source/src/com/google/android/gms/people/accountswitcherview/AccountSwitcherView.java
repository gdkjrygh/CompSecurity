// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import com.google.android.gms.people.model.Owner;
import java.util.List;

// Referenced classes of package com.google.android.gms.people.accountswitcherview:
//            OwnersListAdapter, SelectedAccountNavigationView

public final class AccountSwitcherView extends FrameLayout
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, SelectedAccountNavigationView.AccountChangeListener, SelectedAccountNavigationView.NavigationModeChangeListener
{

    private int mCurrentHeaderTop;
    private int mNavContainerTop;
    private List mOwners;
    private Owner mSelectedAccount;

    private static void animateAccountWrapper(boolean flag, Interpolator interpolator)
    {
        int i;
        int j;
        if (flag)
        {
            i = 0;
            j = 1;
        } else
        {
            i = 1;
            j = 0;
        }
        if (isAtLeastVersion(11))
        {
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(null, "animatedHeightFraction", new float[] {
                (float)i, (float)j
            });
            objectanimator.setDuration(200L);
            objectanimator.setInterpolator(interpolator);
            objectanimator.start();
            return;
        } else
        {
            float f = j;
            throw new NullPointerException();
        }
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
        throw new NullPointerException();
    }

    private void offsetNav(int i)
    {
        throw new NullPointerException();
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
                owner = mSelectedAccount;
                throw new NullPointerException();
            } else
            {
                owner = mOwners;
                throw new NullPointerException();
            }
        } else
        {
            throw new NullPointerException();
        }
    }

    public final int getNestedScrollAxes()
    {
        return 2;
    }

    public final void onAccountChange(Owner owner)
    {
        setSelectedAccount(owner, true);
    }

    public final void onClick(View view)
    {
        while (view == null || view != null) 
        {
            return;
        }
        throw new NullPointerException();
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        throw new NullPointerException();
    }

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        i = mCurrentHeaderTop;
        throw new NullPointerException();
    }

    public final void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        i = 0;
        do
        {
            if (i < getChildCount())
            {
                if (getChildAt(i).equals(null))
                {
                    throw new NullPointerException();
                }
            } else
            {
                return;
            }
            i++;
        } while (true);
    }

    public final void onNavigationModeChange(SelectedAccountNavigationView selectedaccountnavigationview)
    {
        throw new NullPointerException();
    }

    public final boolean onNestedFling(View view, float f, float f1, boolean flag)
    {
        if (!flag && f1 < 0.0F)
        {
            throw new NullPointerException();
        }
        if (flag && f1 > 0.0F)
        {
            throw new NullPointerException();
        } else
        {
            return false;
        }
    }

    public final void onNestedPreScroll(View view, int i, int j, int ai[])
    {
        throw new NullPointerException();
    }

    public final void onNestedScroll(View view, int i, int j, int k, int l)
    {
        if (l < 0)
        {
            throw new NullPointerException();
        }
        if (false)
        {
            throw new NullPointerException();
        } else
        {
            return;
        }
    }

    public final boolean onStartNestedScroll(View view, View view1, int i)
    {
        return false;
    }

    public final void setPadding(int i, int j, int k, int l)
    {
        super.setPadding(i, j, k, l);
    }

    public final void setPaddingRelative(int i, int j, int k, int l)
    {
        super.setPaddingRelative(i, j, k, l);
    }
}
