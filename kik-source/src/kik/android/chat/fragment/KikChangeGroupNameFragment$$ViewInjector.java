// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.EditText;

// Referenced classes of package kik.android.chat.fragment:
//            KikChangeGroupNameFragment

public class 
{

    public static void inject(butterknife..ViewInjector viewinjector, KikChangeGroupNameFragment kikchangegroupnamefragment, Object obj)
    {
        android.view.View view = viewinjector.ViewInjector(obj, 0x7f0e0011);
        if (view == null)
        {
            throw new IllegalStateException("Required view with id '2131623953' for field '_groupNameField' was not found. If this view is optional add '@Optional' annotation.");
        }
        kikchangegroupnamefragment._groupNameField = (EditText)view;
        viewinjector = viewinjector._groupNameField(obj, 0x7f0e0018);
        if (viewinjector == null)
        {
            throw new IllegalStateException("Required view with id '2131623960' for field '_confirmNameButton' was not found. If this view is optional add '@Optional' annotation.");
        } else
        {
            kikchangegroupnamefragment._confirmNameButton = viewinjector;
            return;
        }
    }

    public static void reset(KikChangeGroupNameFragment kikchangegroupnamefragment)
    {
        kikchangegroupnamefragment._groupNameField = null;
        kikchangegroupnamefragment._confirmNameButton = null;
    }

    public ()
    {
    }
}
