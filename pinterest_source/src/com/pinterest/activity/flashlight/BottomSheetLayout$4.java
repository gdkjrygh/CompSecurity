// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.flashlight;

import android.view.View;

// Referenced classes of package com.pinterest.activity.flashlight:
//            BottomSheetLayout, OnSheetDismissedListener, ViewTransformer

class ener
    implements Runnable
{

    final BottomSheetLayout this$0;
    final OnSheetDismissedListener val$onSheetDismissedListener;
    final View val$sheetView;
    final ViewTransformer val$viewTransformer;

    public void run()
    {
        showWithSheetView(val$sheetView, val$viewTransformer, val$onSheetDismissedListener);
    }

    ener()
    {
        this$0 = final_bottomsheetlayout;
        val$sheetView = view;
        val$viewTransformer = viewtransformer;
        val$onSheetDismissedListener = OnSheetDismissedListener.this;
        super();
    }
}
