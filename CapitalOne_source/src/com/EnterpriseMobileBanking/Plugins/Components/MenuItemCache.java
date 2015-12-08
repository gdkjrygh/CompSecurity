// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.EnterpriseMobileBanking.AppHelper;
import com.capitalone.mobile.banking.app.Application;
import com.capitalone.mobile.banking.session.SessionManager;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins.Components:
//            MenuItem, TransiteWebView

public class MenuItemCache
{

    private static final String TAG = "MenuItemCache";
    private static Map imageMap;
    private static int indicatorColor = 0x80000000;
    private LinearLayout buttonLayout;
    private Context context;
    private ImageView icon;
    private View menuIndicator;
    private ImageView rightIcon;
    private TextView text;
    private TextView title;
    private LinearLayout titleLayout;

    MenuItemCache(View view)
    {
        icon = null;
        title = null;
        text = null;
        titleLayout = null;
        buttonLayout = null;
        menuIndicator = null;
        rightIcon = null;
        context = AppHelper.getApplicationLink();
        if (indicatorColor == 0x80000000)
        {
            indicatorColor = view.getResources().getColor(0x7f070023);
        }
        icon = (ImageView)view.findViewById(0x7f0800aa);
        title = (TextView)view.findViewById(0x7f0800a7);
        text = (TextView)view.findViewById(0x7f0800ab);
        titleLayout = (LinearLayout)view.findViewById(0x7f0800a6);
        buttonLayout = (LinearLayout)view.findViewById(0x7f0800a8);
        menuIndicator = view.findViewById(0x7f0800a9);
        rightIcon = (ImageView)view.findViewById(0x7f0800ac);
    }

    MenuItemCache(View view, Context context1)
    {
        this(view);
        context = context1;
    }

    private int getResourceId(String s)
    {
        String s1 = s;
        if (s.toLowerCase().endsWith(".png"))
        {
            s1 = s.substring(0, s.length() - 4);
        }
        s = s1;
        if (imageMap.containsKey(s1))
        {
            s = (String)imageMap.get(s1);
        }
        int i;
        try
        {
            i = com/konylabs/capitalone/R$drawable.getField(s).getInt(null);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1;
        }
        return i;
    }

    void populate(MenuItem menuitem)
    {
label0:
        {
            if (menuitem != null)
            {
                if (menuitem.getAction().length() != 0)
                {
                    break label0;
                }
                title.setText(Html.fromHtml(menuitem.getText()));
                if (titleLayout.getVisibility() != 0)
                {
                    titleLayout.setVisibility(0);
                    buttonLayout.setVisibility(8);
                }
            }
            return;
        }
        if (menuitem.isSelected())
        {
            int i;
            if (menuitem.getText().contains("Freeze"))
            {
                AppHelper.setIsFreezeCardFlow(true);
            } else
            {
                AppHelper.setIsFreezeCardFlow(false);
            }
            menuIndicator.setBackgroundColor(indicatorColor);
            if (AppHelper.getLastLob() == 0x7f080080 && AppHelper.isAuthenticated())
            {
                ((Application)AppHelper.getAppContext().getApplicationContext()).getSessionManager().resetTimeout();
            }
            if (menuitem.getText().contains("Deposit Checks") && AppHelper.getTransiteView().getUrl().contains("terms"))
            {
                AppHelper.getTransiteView().setVisibility(8);
            }
        } else
        {
            menuIndicator.setBackgroundColor(0);
        }
        i = getResourceId(menuitem.getImage());
        if (i > -1)
        {
            icon.setImageResource(i);
        } else
        {
            icon.setImageDrawable(null);
        }
        text.setText(Html.fromHtml(menuitem.getText()));
        if (buttonLayout.getVisibility() != 0)
        {
            buttonLayout.setVisibility(0);
            titleLayout.setVisibility(8);
        }
        if (menuitem.getAction().toLowerCase().startsWith(context.getString(0x7f09010a)))
        {
            rightIcon.setImageResource(0x7f0200ef);
            text.setContentDescription((new StringBuilder()).append(text.getText()).append(" ").append(context.getString(0x7f09012f)).append(" ").append(context.getString(0x7f090130)).toString());
            return;
        } else
        {
            rightIcon.setImageResource(0x7f0200eb);
            text.setContentDescription((new StringBuilder()).append(text.getText()).append(" ").append(context.getString(0x7f09012f)).toString());
            return;
        }
    }

    static 
    {
        imageMap = new HashMap();
        imageMap.put("accounts", "menuicon_bank");
        imageMap.put("transfer", "menuicon_transfers");
        imageMap.put("rdc", "menuicon_deposit");
        imageMap.put("billpay", "menuicon_paybill");
        imageMap.put("p2p", "menuicon_p2p");
        imageMap.put("card", "menuicon_cards");
        imageMap.put("contact", "menuicon_contact");
        imageMap.put("estatements", "menuicon_statements");
        imageMap.put("atm", "menuicon_atm");
        imageMap.put("bank", "menuicon_parthenon");
        imageMap.put("brokerage", "menuicon_sharebuilder");
        imageMap.put("products", "menuicon_products");
    }
}
