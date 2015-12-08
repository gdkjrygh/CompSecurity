// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget.route;

import android.view.View;

// Referenced classes of package com.thetransitapp.droid.widget.route:
//            RouteUiHandlers, RouteItem

public class RouteActionClickListener
    implements android.view.View.OnClickListener
{

    private final RouteUiHandlers.ClickType clickType;
    private final RouteItem routeItem;
    private final RouteUiHandlers uiHandlers;

    public RouteActionClickListener(RouteUiHandlers routeuihandlers, RouteUiHandlers.ClickType clicktype, RouteItem routeitem)
    {
        uiHandlers = routeuihandlers;
        clickType = clicktype;
        routeItem = routeitem;
    }

    public void onClick(View view)
    {
        uiHandlers.onClick(clickType, routeItem);
    }
}
