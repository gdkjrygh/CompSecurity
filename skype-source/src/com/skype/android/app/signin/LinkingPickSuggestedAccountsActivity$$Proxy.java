// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.widget.Button;
import android.widget.LinearLayout;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingPickSuggestedAccountsActivity

public class  extends 
{

    public void clearViews()
    {
        super.();
        ((LinkingPickSuggestedAccountsActivity)getTarget()).linkDiffAccount = null;
        ((LinkingPickSuggestedAccountsActivity)getTarget()).linearLayout = null;
    }

    public void injectViews()
    {
        super.ayout();
        ((LinkingPickSuggestedAccountsActivity)getTarget()).linkDiffAccount = (Button)findViewById(0x7f1003dc);
        ((LinkingPickSuggestedAccountsActivity)getTarget()).linearLayout = (LinearLayout)findViewById(0x7f1003de);
    }

    public (LinkingPickSuggestedAccountsActivity linkingpicksuggestedaccountsactivity)
    {
        super(linkingpicksuggestedaccountsactivity);
    }
}
