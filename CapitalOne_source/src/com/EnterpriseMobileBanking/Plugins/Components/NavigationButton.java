// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.Plugins.QuickNavJSI;
import com.EnterpriseMobileBanking.Plugins.WebViewLinker;
import com.EnterpriseMobileBanking.Utils.Log;
import org.apache.cordova.DroidGap;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins.Components:
//            NativeButton

public class NavigationButton extends NativeButton
{

    private static final int MOVE_THRESHOLD = WebViewLinker.getHeightWidthDPI(15);
    private boolean isMenu;
    private String navigation;
    private float xDown;

    public NavigationButton(DroidGap droidgap, ViewGroup viewgroup)
    {
        navigation = "";
        isMenu = false;
        xDown = 0.0F;
        appLink = droidgap;
        params.weight = 1.0F;
        button = ((LayoutInflater)droidgap.getBaseContext().getSystemService("layout_inflater")).inflate(0x7f030019, null);
        viewgroup.addView(button, params);
        button.setOnClickListener(this);
        button.setOnTouchListener(this);
        deselectButton();
    }

    public boolean isMenuVisible()
    {
        return isMenu;
    }

    public boolean isNavigationButton()
    {
        return true;
    }

    public void onClick(View view)
    {
        if (isMenu)
        {
            Log.d("NavB", (new StringBuilder()).append("Action: ").append(action).toString());
            if (action.length() > 0)
            {
                appLink.sendJavascript(action);
            }
            AppHelper.getAppView().requestFocus();
            deselectButton();
            return;
        } else
        {
            Log.d("Nav", "Am no longer a menu");
            super.onClick(view);
            return;
        }
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (isMenu)
        {
            if (motionevent.getAction() == 0)
            {
                xDown = motionevent.getX();
                AppHelper.sendJavascript("quickNavJSI.setPreventClick( Ext.Msg.isVisible() );");
                touchedButton = view;
            } else
            {
                touchedButton = null;
                if (!QuickNavJSI.preventClick())
                {
                    if (ignoreTillUp || motionevent.getAction() == 1)
                    {
                        continue;
                    }
                    Log.d("NavB", (new StringBuilder()).append(motionevent.getAction()).append(" -- (").append(motionevent.getX()).append(",").append(motionevent.getY()).append(")").toString());
                    if (motionevent.getX() < 0.0F || motionevent.getY() > (float)button.getHeight() || motionevent.getX() < xDown - (float)MOVE_THRESHOLD)
                    {
                        if (motionevent.getY() < (float)button.getHeight() && AppHelper.showingMenu())
                        {
                            AppHelper.hideMenu();
                        }
                        setOnState(false);
                        ignoreTillUp = true;
                        return true;
                    }
                    if (motionevent.getX() > xDown + (float)MOVE_THRESHOLD || motionevent.getX() < xDown - (float)MOVE_THRESHOLD)
                    {
                        if (navigation.equalsIgnoreCase(AppHelper.getAppString(0x7f09010b)) || navigation.equalsIgnoreCase(AppHelper.getAppString(0x7f09010c)))
                        {
                            ignoreTillUp = true;
                            return true;
                        }
                        if (motionevent.getX() > (float)button.getWidth())
                        {
                            setOnState(false);
                            ignoreTillUp = true;
                            return true;
                        }
                    } else
                    if (motionevent.getAction() == 1)
                    {
                        setOnState(false);
                        xDown = 0.0F;
                        return true;
                    } else
                    {
                        setOnState(true);
                        return true;
                    }
                }
            }
            do
            {
                return true;
            } while (motionevent.getAction() != 1);
            if (!ignoreTillUp)
            {
                onClick(view);
            }
            deselectButton();
            Log.d("NB", "no longer ignoring");
            ignoreTillUp = false;
            xDown = 0.0F;
            return true;
        } else
        {
            return super.onTouch(view, motionevent);
        }
    }

    public void setAsIconButton()
    {
        isMenu = false;
        updateIconButton();
    }

    public void setAsMenuButton()
    {
        isMenu = true;
        updateNavText(navigation);
        deselectButton();
    }

    public void updateIconButton()
    {
        if (!isMenu)
        {
            button.post(new Runnable() {

                final NavigationButton this$0;

                public void run()
                {
                }

            
            {
                this$0 = NavigationButton.this;
                super();
            }
            });
        }
    }

    public void updateNavText(String s)
    {
        navigation = s;
        if (isMenu)
        {
            button.post(new Runnable() {

                final NavigationButton this$0;

                public void run()
                {
                }

            
            {
                this$0 = NavigationButton.this;
                super();
            }
            });
        }
    }

}
