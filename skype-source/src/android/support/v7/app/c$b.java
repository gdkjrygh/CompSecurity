// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.app:
//            c

private static final class  extends Handler
{

    private WeakReference a;

    public final void handleMessage(Message message)
    {
        switch (message.what)
        {
        case 0: // '\0'
        default:
            return;

        case -3: 
        case -2: 
        case -1: 
            ((android.content.ogInterface.OnClickListener)message.obj).onClick((DialogInterface)a.get(), message.what);
            return;

        case 1: // '\001'
            ((DialogInterface)message.obj).dismiss();
            break;
        }
    }

    public face(DialogInterface dialoginterface)
    {
        a = new WeakReference(dialoginterface);
    }
}
