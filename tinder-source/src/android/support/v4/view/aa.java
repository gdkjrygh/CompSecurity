// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.WindowInsets;

// Referenced classes of package android.support.v4.view:
//            an, s

final class aa
{

    // Unreferenced inner class android/support/v4/view/aa$1

/* anonymous class */
    static final class _cls1
        implements android.view.View.OnApplyWindowInsetsListener
    {

        final s a;

        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
        {
            windowinsets = new an(windowinsets);
            return ((an)a.onApplyWindowInsets(view, windowinsets)).a;
        }

            
            {
                a = s1;
                super();
            }
    }

}
