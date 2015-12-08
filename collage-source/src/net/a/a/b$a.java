// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.a.a;

import android.os.Handler;
import android.os.Message;
import android.widget.PopupWindow;
import com.cardinalblue.android.b.k;

// Referenced classes of package net.a.a:
//            b

private static class <init> extends Handler
{

    public void handleMessage(Message message)
    {
        super.handleMessage(message);
        if (message.what == 1 && (message.obj instanceof PopupWindow))
        {
            k.a((PopupWindow)message.obj);
        }
    }

    private essage()
    {
    }

    essage(essage essage)
    {
        this();
    }
}
