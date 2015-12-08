// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import butterknife.ButterKnife;

// Referenced classes of package com.jcp.activities:
//            an, SameDayPickUpCustomerServiceWebView

public class SameDayPickUpCustomerServiceActivity extends an
{

    protected Button faqButton;
    protected Button termsButton;

    public SameDayPickUpCustomerServiceActivity()
    {
    }

    protected String a()
    {
        return "SAMEDAYPICKUPCUSTOMERSERVICE";
    }

    public void faqButtonClick()
    {
        Intent intent = new Intent(getApplicationContext(), com/jcp/activities/SameDayPickUpCustomerServiceWebView);
        intent.putExtra("ITEM_OPTION", 2);
        startActivity(intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03005b);
        ButterKnife.inject(this);
        if (getActionBar() != null)
        {
            getActionBar().hide();
        }
    }

    public void termsButtonClick()
    {
        Intent intent = new Intent(getApplicationContext(), com/jcp/activities/SameDayPickUpCustomerServiceWebView);
        intent.putExtra("ITEM_OPTION", 1);
        startActivity(intent);
    }
}
