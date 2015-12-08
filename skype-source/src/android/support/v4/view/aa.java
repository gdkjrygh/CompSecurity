// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.WindowInsets;

// Referenced classes of package android.support.v4.view:
//            an, r

final class aa
{

    // Unreferenced inner class android/support/v4/view/aa$1

/* anonymous class */
    static final class _cls1
        implements android.view.View.OnApplyWindowInsetsListener
    {

        final r a;

        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
        {
            windowinsets = new an(windowinsets);
            return ((an)a.a(view, windowinsets)).g();
        }

            
            {
                a = r1;
                super();
            }
    }

}
