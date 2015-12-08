// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.app.Activity;
import com.appboy.c.b;
import com.appboy.c.c;
import com.appboy.d.a;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.appboy.ui.inappmessage:
//            a, f, b

final class h
    implements b
{

    final com.appboy.ui.inappmessage.a a;

    h(com.appboy.ui.inappmessage.a a1)
    {
        a = a1;
        super();
    }

    public final void trigger(Object obj)
    {
label0:
        {
            Object obj1 = (c)obj;
            com.appboy.ui.inappmessage.a.d(a);
            obj = a;
            obj1 = ((c) (obj1)).a;
            ((com.appboy.ui.inappmessage.a) (obj)).a.push(obj1);
            if (((com.appboy.ui.inappmessage.a) (obj)).b != null && ((com.appboy.ui.inappmessage.a) (obj)).c.compareAndSet(false, true))
            {
                if (!((com.appboy.ui.inappmessage.a) (obj)).a.isEmpty())
                {
                    break label0;
                }
                ((com.appboy.ui.inappmessage.a) (obj)).c.set(false);
            }
            return;
        }
        a a1 = (a)((com.appboy.ui.inappmessage.a) (obj)).a.pop();
        int i = ((com.appboy.ui.inappmessage.a) (obj)).c().a();
        switch (com.appboy.ui.inappmessage.f.a[i - 1])
        {
        default:
            ((com.appboy.ui.inappmessage.a) (obj)).c.set(false);
            return;

        case 2: // '\002'
            ((com.appboy.ui.inappmessage.a) (obj)).a.push(a1);
            ((com.appboy.ui.inappmessage.a) (obj)).c.set(false);
            return;

        case 3: // '\003'
            ((com.appboy.ui.inappmessage.a) (obj)).c.set(false);
            return;

        case 1: // '\001'
            ((com.appboy.ui.inappmessage.a) (obj)).b.runOnUiThread(new com.appboy.ui.inappmessage.b(((com.appboy.ui.inappmessage.a) (obj)), a1));
            return;
        }
    }
}
