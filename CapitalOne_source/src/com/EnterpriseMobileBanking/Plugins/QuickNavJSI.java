// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.EnterpriseMobileBanking;
import com.EnterpriseMobileBanking.Plugins.Components.MenuItem;
import com.EnterpriseMobileBanking.Plugins.Components.NativeButton;
import com.EnterpriseMobileBanking.Utils.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins:
//            AndroidLocaleJSI

public class QuickNavJSI
{

    private static final String TAG = "QuickNavJSI";
    private static Boolean preventClick = Boolean.valueOf(false);
    private ArrayList buttons;
    private String lastMenu;
    private String lastNav;

    public QuickNavJSI(ArrayList arraylist)
    {
        buttons = null;
        lastNav = "";
        lastMenu = "";
        buttons = arraylist;
    }

    public static boolean preventClick()
    {
        return preventClick.booleanValue();
    }

    public void clearHighlight()
    {
        NativeButton.clearHighlight();
    }

    public void clickButton(final int index)
    {
        AppHelper.runOnUiThread(new Runnable() {

            final QuickNavJSI this$0;
            final int val$index;

            public void run()
            {
                ((NativeButton)buttons.get(index)).onClick(null);
            }

            
            {
                this$0 = QuickNavJSI.this;
                index = i;
                super();
            }
        });
    }

    public void handleMenu(String s)
    {
        Log.e("QuickNavJSI", "THIS IS NOT THE METHOD YOU ARE LOOKING FOR");
        Log.d("QuickNavJSI", (new StringBuilder()).append("HandleMenu: ").append(s).toString());
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        if (s.equalsIgnoreCase("undefined"))
        {
            break MISSING_BLOCK_LABEL_111;
        }
        if (!s.equalsIgnoreCase(lastMenu))
        {
            if ((new JSONArray(s)).length() <= 0);
            lastMenu = s;
            return;
        }
        try
        {
            Log.d("QuickNavJSI", "No updates needed for MENU");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.d("QuickNavJSI", (new StringBuilder()).append("JSON Exception: ").append(s.toString()).toString());
        }
    }

    public void handleNav(String s)
    {
        Log.d("QuickNavJSI", (new StringBuilder()).append("HandleNav: ").append(s).toString());
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        Object obj;
        String s1;
        if (s.equalsIgnoreCase("undefined"))
        {
            break MISSING_BLOCK_LABEL_221;
        }
        if (s.equalsIgnoreCase(lastNav))
        {
            break MISSING_BLOCK_LABEL_213;
        }
        obj = new JSONObject(s);
        s1 = ((JSONObject) (obj)).optString("text");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        if (!s1.equalsIgnoreCase("home")) goto _L2; else goto _L1
_L1:
        hideMenuButton();
_L3:
        s1 = ((JSONObject) (obj)).optString("signout");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        Log.d("QuickNavJSI", (new StringBuilder()).append("Signout: ").append(s1).toString());
        obj = ((JSONObject) (obj)).optString("timeout");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        Log.d("QuickNavJSI", (new StringBuilder()).append("Timeout: ").append(((String) (obj))).toString());
        lastNav = s;
        return;
_L2:
        try
        {
            showBackButton(s1, ((JSONObject) (obj)).optString("action"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.i("QuickNavJSI", (new StringBuilder()).append("Exception: ").append(s.getMessage()).toString());
            hideBackButton(true);
            return;
        }
          goto _L3
        hideBackButton(true);
          goto _L3
        Log.d("QuickNavJSI", "No Updates Needed for NAV");
        return;
        hideBackButton(true);
        return;
    }

    public void hideBackButton(boolean flag)
    {
        Log.d("QuickNavJSI", "Hiding Back Button!");
        AppHelper.hideBackButton();
    }

    public void hideMenuButton()
    {
        AppHelper.hideMenu();
    }

    public void highlightItem(String s)
    {
label0:
        {
            Log.d("QuickNavJSI", (new StringBuilder()).append("menuItem: ").append(s).toString());
            if (s == null || s.equalsIgnoreCase("undefined") || s.contains("LogoutController"))
            {
                break label0;
            }
            Log.d("QuickNavJSI", (new StringBuilder()).append("Need to highlight: ").append(s).toString());
            Object obj = AppHelper.getMenuItems();
            if (s.equalsIgnoreCase("gotoMenuPage('LoginController|index');"))
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            MenuItem menuitem;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                menuitem = (MenuItem)((Iterator) (obj)).next();
                Log.d("QuickNavJSI", (new StringBuilder()).append("Checking: ").append(menuitem.getAction()).toString());
            } while (!menuitem.getAction().equals(s));
            AppHelper.setLastItem(menuitem);
        }
    }

    public void returnToHome()
    {
        Log.v("QuickNavJSI", "in QuickNavJSI returnToHome");
        if (AndroidLocaleJSI.getInstance().skipLanding())
        {
            AppHelper.getApplicationLink().finish();
            return;
        } else
        {
            AppHelper.returnToHome();
            return;
        }
    }

    public void setHighlight(int i)
    {
    }

    public void setPreventClick(boolean flag)
    {
        preventClick = Boolean.valueOf(flag);
        if (!flag)
        {
            NativeButton.setTouchedAsPressed();
        }
    }

    public void showBackButton(String s, String s1)
    {
        Log.d("QuickNavJSI", (new StringBuilder()).append("ShowNavButton: ").append(s).toString());
        AppHelper.showBackButton();
    }


}
