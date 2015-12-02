// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.app;

import com.qihoo.security.SecurityApplication;
import com.qihoo.security.a;
import com.qihoo.security.appbox.core.b;
import com.qihoo.security.appbox.ui.AppBoxShortcutActivity;
import com.qihoo360.mobilesafe.b.i;
import com.qihoo360.mobilesafe.b.m;

public class e
{

    public static void a()
    {
        if (!i.a())
        {
            com.qihoo.security.a.a();
        }
    }

    public static void b()
    {
        if (!i.a())
        {
            android.content.Context context = SecurityApplication.a();
            if (!com.qihoo.security.appbox.core.b.a(context))
            {
                com.qihoo.security.appbox.core.b.a(context, true);
                m.a(context, com/qihoo/security/appbox/ui/AppBoxShortcutActivity, 0x7f020041, 0x7f0c01e4, null);
            }
        }
    }
}
