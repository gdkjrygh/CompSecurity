// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.widget.LinearLayout;

// Referenced classes of package com.pinterest.ui.grid:
//            PinterestGridView, AdapterEmptyView, PinterestAdapterView, AdapterFooterView

public class 
{

    public static void inject(butterknife.wInjector winjector, PinterestGridView pinterestgridview, Object obj)
    {
        pinterestgridview._content = (LinearLayout)winjector.tent(obj, 0x7f0f04bf, "field '_content'");
        pinterestgridview._emptyVw = (AdapterEmptyView)winjector.tyVw(obj, 0x7f0f0210, "field '_emptyVw'");
        pinterestgridview._adapterVw = (PinterestAdapterView)winjector.pterVw(obj, 0x7f0f04c0, "field '_adapterVw'");
        pinterestgridview._footerVw = (AdapterFooterView)winjector.terVw(obj, 0x7f0f0468, "field '_footerVw'");
    }

    public static void reset(PinterestGridView pinterestgridview)
    {
        pinterestgridview._content = null;
        pinterestgridview._emptyVw = null;
        pinterestgridview._adapterVw = null;
        pinterestgridview._footerVw = null;
    }

    public ()
    {
    }
}
