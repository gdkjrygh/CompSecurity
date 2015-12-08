// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.os.Message;

// Referenced classes of package android.support.design.widget:
//            Snackbar

static final class 
    implements android.os.lback
{

    public final boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            ((Snackbar)message.obj).a();
            return true;

        case 1: // '\001'
            ((Snackbar)message.obj).a(message.arg1);
            break;
        }
        return true;
    }

    ()
    {
    }
}
