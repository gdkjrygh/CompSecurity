// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package android.support.v7.media:
//            c

private final class <init> extends Handler
{

    final c a;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            c.a(a);
            return;

        case 2: // '\002'
            c.b(a);
            break;
        }
    }

    private (c c1)
    {
        a = c1;
        super();
    }

    a(c c1, a a1)
    {
        this(c1);
    }
}
