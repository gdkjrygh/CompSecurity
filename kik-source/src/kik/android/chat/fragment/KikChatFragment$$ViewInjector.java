// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import kik.android.widget.DarkFrameLayout;
import kik.android.widget.DarkLinearLayout;
import kik.android.widget.PagerIconTabs;
import kik.android.widget.TabIconImageView;
import kik.android.widget.TalkToCoverView;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

public class 
{

    public static void inject(butterknife..ViewInjector viewinjector, KikChatFragment kikchatfragment, Object obj)
    {
        android.view.View view = viewinjector.ViewInjector(obj, 0x7f0e01b1);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624369' for field 'sendButton' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikchatfragment.sendButton = view;
        view = viewinjector.sendButton(obj, 0x7f0e00d8);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624152' for field '_contentButton' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikchatfragment._contentButton = (DarkFrameLayout)view;
        view = viewinjector._contentButton(obj, 0x7f0e01ad);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624365' for field '_contentButtonSpacer' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikchatfragment._contentButtonSpacer = view;
        kikchatfragment.talkToCover = (TalkToCoverView)viewinjector.talkToCover(obj, 0x7f0e0025);
        view = viewinjector.talkToCover(obj, 0x7f0e002b);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131623979' for field '_newMessagesButton' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikchatfragment._newMessagesButton = (Button)view;
        view = viewinjector._newMessagesButton(obj, 0x7f0e002a);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131623978' for field '_scrollToLastReadButton' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikchatfragment._scrollToLastReadButton = (Button)view;
        view = viewinjector._scrollToLastReadButton(obj, 0x7f0e001c);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131623964' for field '_topBar' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikchatfragment._topBar = view;
        view = viewinjector._topBar(obj, 0x7f0e01aa);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624362' for field 'tabs' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikchatfragment.tabs = (PagerIconTabs)view;
        kikchatfragment.rootLayout = (FrameLayout)viewinjector.rootLayout(obj, 0x7f0e001a);
        kikchatfragment._contentFrame = (FrameLayout)viewinjector._contentFrame(obj, 0x7f0e0019);
        kikchatfragment._mediaShadow = (FrameLayout)viewinjector._mediaShadow(obj, 0x7f0e01a4);
        kikchatfragment._contentAttachFrame = (RelativeLayout)viewinjector._contentAttachFrame(obj, 0x7f0e01a7);
        kikchatfragment.contentButtonImage = (TabIconImageView)viewinjector.contentButtonImage(obj, 0x7f0e01b2);
        view = viewinjector.contentButtonImage(obj, 0x7f0e01a6);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624358' for field '_suggestedRecyclerView' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikchatfragment._suggestedRecyclerView = (RecyclerView)view;
        view = viewinjector._suggestedRecyclerView(obj, 0x7f0e01b3);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624371' for field '_mediaItemArea' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikchatfragment._mediaItemArea = (ViewPager)view;
        view = viewinjector._mediaItemArea(obj, 0x7f0e01a3);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624355' for field 'tray' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikchatfragment.tray = (ViewGroup)view;
        view = viewinjector.tray(obj, 0x7f0e01ac);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624364' for field '_mediaModeButton' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikchatfragment._mediaModeButton = (TabIconImageView)view;
        view = viewinjector._mediaModeButton(obj, 0x7f0e01a5);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624357' for field '_mediaTrayContainer' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            kikchatfragment._mediaTrayContainer = (DarkLinearLayout)view;
            kikchatfragment._textLayout = (ViewGroup)viewinjector._textLayout(obj, 0x7f0e01a9);
            kikchatfragment._mediaLayout = (ViewGroup)viewinjector._mediaLayout(obj, 0x7f0e01a8);
            return;
        }
    }

    public static void reset(KikChatFragment kikchatfragment)
    {
        kikchatfragment.sendButton = null;
        kikchatfragment._contentButton = null;
        kikchatfragment._contentButtonSpacer = null;
        kikchatfragment.talkToCover = null;
        kikchatfragment._newMessagesButton = null;
        kikchatfragment._scrollToLastReadButton = null;
        kikchatfragment._topBar = null;
        kikchatfragment.tabs = null;
        kikchatfragment.rootLayout = null;
        kikchatfragment._contentFrame = null;
        kikchatfragment._mediaShadow = null;
        kikchatfragment._contentAttachFrame = null;
        kikchatfragment.contentButtonImage = null;
        kikchatfragment._suggestedRecyclerView = null;
        kikchatfragment._mediaItemArea = null;
        kikchatfragment.tray = null;
        kikchatfragment._mediaModeButton = null;
        kikchatfragment._mediaTrayContainer = null;
        kikchatfragment._textLayout = null;
        kikchatfragment._mediaLayout = null;
    }

    public ()
    {
    }
}
