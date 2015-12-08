// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.ImageView;
import android.widget.TextView;
import kik.android.widget.PullToRevealView;

// Referenced classes of package kik.android.chat.fragment:
//            KikConversationsFragment

public class 
{

    public static void inject(butterknife..ViewInjector viewinjector, KikConversationsFragment kikconversationsfragment, Object obj)
    {
        android.view.View view = viewinjector.ViewInjector(obj, 0x7f0e0050);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624016' for field '_missedConvoButton' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikconversationsfragment._missedConvoButton = view;
        view = viewinjector._missedConvoButton(obj, 0x7f0e0053);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624019' for field '_missedConvosTitle' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikconversationsfragment._missedConvosTitle = (TextView)view;
        view = viewinjector._missedConvosTitle(obj, 0x7f0e0052);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624018' for field '_missedConvosNotification' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikconversationsfragment._missedConvosNotification = (ImageView)view;
        view = viewinjector._missedConvosNotification(obj, 0x7f0e0043);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624003' for field '_animationContainer' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikconversationsfragment._animationContainer = view;
        view = viewinjector._animationContainer(obj, 0x7f0e0055);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624021' for field '_composeButton' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikconversationsfragment._composeButton = view;
        view = viewinjector._composeButton(obj, 0x7f0e004c);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624012' for field '_statusbarUnderlay' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikconversationsfragment._statusbarUnderlay = view;
        view = viewinjector._statusbarUnderlay(obj, 0x7f0e004f);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624015' for field '_navBarShadow' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikconversationsfragment._navBarShadow = view;
        view = viewinjector._navBarShadow(obj, 0x7f0e0054);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624020' for field '_composeButtonShadow' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikconversationsfragment._composeButtonShadow = view;
        view = viewinjector._composeButtonShadow(obj, 0x7f0e004d);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624013' for field '_conversationsTopbar' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikconversationsfragment._conversationsTopbar = view;
        view = viewinjector._conversationsTopbar(obj, 0x7f0e004e);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624014' for field '_webButton' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikconversationsfragment._webButton = view;
        view = viewinjector._webButton(obj, 0x7f0e0036);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131623990' for field '_settingsButton' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikconversationsfragment._settingsButton = view;
        view = viewinjector._settingsButton(obj, 0x7f0e0044);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624004' for field '_pullToScanHint' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikconversationsfragment._pullToScanHint = view;
        view = viewinjector._pullToScanHint(obj, 0x7f0e004a);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624010' for field '_pullToScanHeader' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikconversationsfragment._pullToScanHeader = view;
        viewinjector = viewinjector._pullToScanHeader(obj, 0x7f0e0049);
        if (viewinjector == null)
        {
            throw new IllegalStateException("Required view with id '2131624009' for field '_pullToScan' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            kikconversationsfragment._pullToScan = (PullToRevealView)viewinjector;
            return;
        }
    }

    public static void reset(KikConversationsFragment kikconversationsfragment)
    {
        kikconversationsfragment._missedConvoButton = null;
        kikconversationsfragment._missedConvosTitle = null;
        kikconversationsfragment._missedConvosNotification = null;
        kikconversationsfragment._animationContainer = null;
        kikconversationsfragment._composeButton = null;
        kikconversationsfragment._statusbarUnderlay = null;
        kikconversationsfragment._navBarShadow = null;
        kikconversationsfragment._composeButtonShadow = null;
        kikconversationsfragment._conversationsTopbar = null;
        kikconversationsfragment._webButton = null;
        kikconversationsfragment._settingsButton = null;
        kikconversationsfragment._pullToScanHint = null;
        kikconversationsfragment._pullToScanHeader = null;
        kikconversationsfragment._pullToScan = null;
    }

    public ()
    {
    }
}
