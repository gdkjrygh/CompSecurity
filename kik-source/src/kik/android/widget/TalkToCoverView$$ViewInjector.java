// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.View;

// Referenced classes of package kik.android.widget:
//            TalkToCoverView, dv, dw

public class 
{

    public static void inject(butterknife.jector jector, TalkToCoverView talktocoverview, Object obj)
    {
        View view = jector.jector(obj, 0x7f0e01e3);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131624419' for field '_deleteButton' and method 'deleteConversation' was not found. If this view is optional add '@Optional' annotation.");
        }
        talktocoverview._deleteButton = view;
        view.setOnClickListener(new dv(talktocoverview));
        jector = jector.Button(obj, 0x7f0e01e4);
        if (jector == null)
        {
            throw new IllegalStateException("Required view with id '2131624420' for field '_acceptButton' and method 'acceptContact' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            talktocoverview._acceptButton = jector;
            jector.setOnClickListener(new dw(talktocoverview));
            return;
        }
    }

    public static void reset(TalkToCoverView talktocoverview)
    {
        talktocoverview._deleteButton = null;
        talktocoverview._acceptButton = null;
    }

    public ()
    {
    }
}
