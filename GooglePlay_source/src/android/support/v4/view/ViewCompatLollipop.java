// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.WindowInsets;

// Referenced classes of package android.support.v4.view:
//            WindowInsetsCompatApi21, OnApplyWindowInsetsListener

final class ViewCompatLollipop
{

    // Unreferenced inner class android/support/v4/view/ViewCompatLollipop$1

/* anonymous class */
    static final class _cls1
        implements android.view.View.OnApplyWindowInsetsListener
    {

        final OnApplyWindowInsetsListener val$listener;

        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
        {
            windowinsets = new WindowInsetsCompatApi21(windowinsets);
            return ((WindowInsetsCompatApi21)listener.onApplyWindowInsets(view, windowinsets)).mSource;
        }

            
            {
                listener = onapplywindowinsetslistener;
                super();
            }
    }

}
