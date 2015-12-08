// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;

import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.gms.people.accountswitcherview.ScrimDrawable;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

// Referenced classes of package com.google.android.apps.wallet.navdrawer:
//            NavDrawerFragment

final class this._cls1
    implements android.view.tsListener
{

    final this._cls1 this$1;

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
    {
        return windowinsets;
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/android/apps/wallet/navdrawer/NavDrawerFragment$5

/* anonymous class */
    final class NavDrawerFragment._cls5
        implements android.view.View.OnAttachStateChangeListener
    {

        final NavDrawerFragment this$0;

        public final void onViewAttachedToWindow(View view)
        {
            view = (View)view.getParent();
            if (!(view instanceof DrawerLayout))
            {
                view.setFitsSystemWindows(true);
                view.setOnApplyWindowInsetsListener(new NavDrawerFragment._cls5._cls1());
            }
            NavDrawerFragment.access$300(NavDrawerFragment.this).setOnApplyWindowInsetsListener(new NavDrawerFragment._cls5._cls2());
        }

        public final void onViewDetachedFromWindow(View view)
        {
        }

            
            {
                this$0 = NavDrawerFragment.this;
                super();
            }

        // Unreferenced inner class com/google/android/apps/wallet/navdrawer/NavDrawerFragment$5$1

/* anonymous class */
        final class NavDrawerFragment._cls5._cls1
            implements android.view.View.OnApplyWindowInsetsListener
        {

            final NavDrawerFragment._cls5 this$1;

            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
            {
                int i = windowinsets.getSystemWindowInsetTop();
                NavDrawerFragment.access$900(this$0).setIntrinsicHeight(i);
                return windowinsets;
            }

                    
                    {
                        this$1 = NavDrawerFragment._cls5.this;
                        super();
                    }
        }

    }

}
