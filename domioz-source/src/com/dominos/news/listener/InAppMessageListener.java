// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.news.listener;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.appboy.b.a.a;
import com.appboy.d.i;
import com.appboy.ui.inappmessage.p;
import com.appboy.ui.inappmessage.t;
import com.appboy.ui.inappmessage.u;
import com.dominos.news.activity.NewsFeedActivity_;

public class InAppMessageListener
    implements p
{

    private final Activity mActivity;

    public InAppMessageListener(Activity activity)
    {
        mActivity = activity;
    }

    private void processClick(a a1, Uri uri)
    {
        switch (_cls1..SwitchMap.com.appboy.enums.inappmessage.ClickAction[a1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            NewsFeedActivity_.intent(mActivity).start();
            return;

        case 2: // '\002'
            a1 = new Intent("android.intent.action.VIEW", uri);
            break;
        }
        mActivity.startActivity(a1);
    }

    public int beforeInAppMessageDisplayed$1b17e3c1(com.appboy.d.a a1)
    {
        return u.a;
    }

    public boolean onInAppMessageButtonClicked(i j, t t1)
    {
        processClick(j.c(), j.d());
        t1.a(true);
        return true;
    }

    public boolean onInAppMessageClicked(com.appboy.d.a a1, t t1)
    {
        processClick(a1.m(), a1.n());
        t1.a(true);
        return true;
    }

    public void onInAppMessageDismissed(com.appboy.d.a a1)
    {
    }

    public boolean onInAppMessageReceived(com.appboy.d.a a1)
    {
        return false;
    }

    private class _cls1
    {

        static final int $SwitchMap$com$appboy$enums$inappmessage$ClickAction[];

        static 
        {
            $SwitchMap$com$appboy$enums$inappmessage$ClickAction = new int[a.values().length];
            try
            {
                $SwitchMap$com$appboy$enums$inappmessage$ClickAction[a.a.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$appboy$enums$inappmessage$ClickAction[a.b.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$appboy$enums$inappmessage$ClickAction[a.c.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
