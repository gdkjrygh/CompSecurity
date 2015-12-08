// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.os.Message;

// Referenced classes of package android.support.design.widget:
//            n

final class a
    implements android.os.ler.Callback
{

    final n a;

    public final boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            n.a(a, (a)message.obj);
            break;
        }
        return true;
    }

    (n n1)
    {
        a = n1;
        super();
    }
}
