// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.controllers;

import android.content.Context;
import com.dominos.controllers.interfaces.IDominosMenuList;
import com.dominos.controllers.interfaces.IDominosView;
import com.dominos.controllers.interfaces.IDominosViewController;

public class MenuListController
    implements IDominosViewController
{

    private final String TAG = com/dominos/controllers/MenuListController.getName();
    private Context mContext;
    private IDominosMenuList mIDominosView;

    public MenuListController(Context context)
    {
        mContext = context;
    }

    public void dispose()
    {
    }

    public IDominosViewController setView(IDominosView idominosview)
    {
        mIDominosView = (IDominosMenuList)idominosview;
        return this;
    }
}
