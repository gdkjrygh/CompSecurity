// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.assist;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.qihoo360.mobilesafe.assist:
//            SysclearAsyncTask19

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
            SysclearAsyncTask19.a(<init>1.a, <init>1.b[0]);
            return;

        case 2: // '\002'
            <init>1.a.b(<init>1.b);
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
