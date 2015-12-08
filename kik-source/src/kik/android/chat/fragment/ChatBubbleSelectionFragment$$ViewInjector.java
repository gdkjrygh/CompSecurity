// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.ListView;
import android.widget.TextView;

// Referenced classes of package kik.android.chat.fragment:
//            ChatBubbleSelectionFragment

public class I
{

    public static void inject(butterknife..ViewInjector viewinjector, ChatBubbleSelectionFragment chatbubbleselectionfragment, Object obj)
    {
        android.view.View view = viewinjector.ViewInjector(obj, 0x7f0e0015);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131623957' for field '_bubbleList' was not found. If this view is optional add '@Optional' annotation.");
        }
        chatbubbleselectionfragment._bubbleList = (ListView)view;
        viewinjector = viewinjector._bubbleList(obj, 0x7f0e0078);
        if (viewinjector == null)
        {
            throw new IllegalStateException("Required view with id '2131624056' for field '_title' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            chatbubbleselectionfragment._title = (TextView)viewinjector;
            return;
        }
    }

    public static void reset(ChatBubbleSelectionFragment chatbubbleselectionfragment)
    {
        chatbubbleselectionfragment._bubbleList = null;
        chatbubbleselectionfragment._title = null;
    }

    public I()
    {
    }
}
