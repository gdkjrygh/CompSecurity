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
import com.EnterpriseMobileBanking.Utils.Log;
import org.apache.cordova.DroidGap;

public class NativeButton
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener
{

    protected static View lastButton = null;
    protected static android.widget.LinearLayout.LayoutParams params = new android.widget.LinearLayout.LayoutParams(-1, -1);
    protected static View touchedButton = null;
    protected String action;
    protected DroidGap appLink;
    protected View button;
    private String caption;
    protected boolean ignoreTillUp;
    protected String imgName;

    protected NativeButton()
    {
        appLink = null;
        action = null;
        button = null;
        imgName = null;
        caption = null;
        ignoreTillUp = false;
    }

    public NativeButton(DroidGap droidgap, ViewGroup viewgroup)
    {
        appLink = null;
        action = null;
        button = null;
        imgName = null;
        caption = null;
        ignoreTillUp = false;
        appLink = droidgap;
        params.weight = 1.0F;
        button = ((LayoutInflater)droidgap.getBaseContext().getSystemService("layout_inflater")).inflate(0x7f030019, null);
        viewgroup.addView(button, params);
        if (lastButton == null)
        {
            lastButton = button;
            lastButton.setTag(imgName);
        }
        button.setOnClickListener(this);
        button.setOnTouchListener(this);
    }

    public NativeButton(DroidGap droidgap, ViewGroup viewgroup, String s, String s1, String s2)
    {
        this(droidgap, viewgroup);
        updateAction(s);
        updateImage(s1);
        updateCaption(s2);
    }

    public static void clearHighlight()
    {
        if (lastButton != null)
        {
            View view = lastButton;
            view.post(new Runnable(view) {

                final View val$lb;

                public void run()
                {
                    Log.d("NatBut", (new StringBuilder()).append("Deselecting: <").append(lb.getTag()).append(">").toString());
                    lb.setSelected(false);
                    lb.postInvalidate();
                }

            
            {
                lb = view;
                super();
            }
            });
            lastButton = null;
        }
    }

    public static void setTouchedAsPressed()
    {
        if (touchedButton != null)
        {
            View view = touchedButton;
            view.post(new Runnable(view) {

                final View val$lastTouched;

                public void run()
                {
                    lastTouched.setPressed(true);
                    lastTouched.invalidate();
                }

            
            {
                lastTouched = view;
                super();
            }
            });
        }
    }

    protected void deselectButton()
    {
        button.post(new Runnable() {

            final NativeButton this$0;

            public void run()
            {
                Log.d("NatBut", (new StringBuilder()).append("Deslsecting: ").append(imgName).toString());
                button.setPressed(false);
                button.setSelected(false);
                button.invalidate();
            }

            
            {
                this$0 = NativeButton.this;
                super();
            }
        });
        if (lastButton == button)
        {
            lastButton = null;
        }
    }

    public String getAction()
    {
        return action;
    }

    public String getCaption()
    {
        return caption;
    }

    public boolean isNavigationButton()
    {
        return false;
    }

    public void onClick(View view)
    {
        AppHelper.hideKeyboard();
        if (AppHelper.showingMenu())
        {
            AppHelper.hideMenu();
        } else
        if (action != null)
        {
            if (lastButton != null && lastButton != button)
            {
                Log.d("NB", "Clearing lastButton");
                lastButton.setSelected(false);
                lastButton.postInvalidate();
            }
            lastButton = button;
            lastButton.setTag(imgName);
            button.setSelected(true);
            button.postInvalidate();
            button.post(new Runnable() {

                final NativeButton this$0;

                public void run()
                {
                    appLink.sendJavascript(action);
                }

            
            {
                this$0 = NativeButton.this;
                super();
            }
            });
            AppHelper.getAppView().requestFocus();
            return;
        }
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        AppHelper.sendJavascript("quickNavJSI.setPreventClick( Ext.Msg.isVisible() );");
        touchedButton = view;
_L4:
        return true;
_L2:
        touchedButton = null;
        if (QuickNavJSI.preventClick()) goto _L4; else goto _L3
_L3:
        if (ignoreTillUp || motionevent.getAction() == 1) goto _L6; else goto _L5
_L5:
        Log.d("NB", (new StringBuilder()).append(motionevent.getAction()).append(" -- (").append(motionevent.getX()).append(",").append(motionevent.getY()).append(")").toString());
        if (motionevent.getX() < 0.0F || motionevent.getY() < 0.0F || motionevent.getY() > (float)button.getHeight() || motionevent.getX() > (float)button.getWidth() || motionevent.getAction() == 3 || motionevent.getAction() == 4)
        {
            setPressed(false);
            ignoreTillUp = true;
        } else
        {
            setPressed(true);
        }
_L8:
        button.postInvalidate();
        return true;
_L6:
        if (motionevent.getAction() == 1)
        {
            if (!ignoreTillUp)
            {
                onClick(view);
            }
            setPressed(false);
            Log.d("NB", (new StringBuilder()).append("no longer ignoring -- ").append(action).toString());
            ignoreTillUp = false;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected void postInvalidate()
    {
        button.postInvalidate();
    }

    public void setActive()
    {
        if (lastButton != button)
        {
            clearHighlight();
            lastButton = button;
            lastButton.setTag(imgName);
            setOnState(true);
        }
    }

    public void setOnState(final boolean on)
    {
        button.post(new Runnable() {

            final NativeButton this$0;
            final boolean val$on;

            public void run()
            {
                Log.d("NatBut", (new StringBuilder()).append("setOn: ").append(imgName).toString());
                button.setSelected(on);
            }

            
            {
                this$0 = NativeButton.this;
                on = flag;
                super();
            }
        });
    }

    public void setPressed(final boolean on)
    {
        button.post(new Runnable() {

            final NativeButton this$0;
            final boolean val$on;

            public void run()
            {
                button.setPressed(on);
            }

            
            {
                this$0 = NativeButton.this;
                on = flag;
                super();
            }
        });
    }

    public void updateAction(String s)
    {
        action = s;
    }

    public void updateCaption(String s)
    {
        caption = s;
    }

    public void updateImage(String s)
    {
        updateImage(s, null);
    }

    public void updateImage(String s, String s1)
    {
        Log.d("NB", (new StringBuilder()).append("Image: ").append(s).toString());
        if (s != null && s.length() > 0)
        {
            if (s.equals(imgName));
        }
        if (false)
        {
            button.post(new Runnable() {

                final NativeButton this$0;

                public void run()
                {
                    button.invalidate();
                }

            
            {
                this$0 = NativeButton.this;
                super();
            }
            });
        }
    }

}
