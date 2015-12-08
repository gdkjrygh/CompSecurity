// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.notification;

import android.app.Activity;
import android.widget.PopupWindow;

// Referenced classes of package com.roidapp.cloudlib.sns.notification:
//            p

final class r
    implements Runnable
{

    final p a;

    r(p p1)
    {
        a = p1;
        super();
    }

    public final void run()
    {
        while (p.a(a) == null || ((Activity)p.a(a)).isFinishing() || p.b(a) == null) 
        {
            return;
        }
        try
        {
            p.b(a).dismiss();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }
}
