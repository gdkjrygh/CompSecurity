// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package android.support.v4.content:
//            ModernAsyncTask

private static class <init> extends Handler
{

    public void handleMessage(Message message)
    {
        <init> <init>1 = (<init>)message.obj;
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            ModernAsyncTask.a(<init>1.a, <init>1.b[0]);
            return;

        case 2: // '\002'
            <init>1.a.a(<init>1.b);
            break;
        }
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
