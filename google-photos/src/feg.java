// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Message;

final class feg
    implements android.os.Handler.Callback
{

    private fef a;

    feg(fef fef1)
    {
        a = fef1;
        super();
    }

    public final boolean handleMessage(Message message)
    {
        if (message.what != 2)
        {
            return false;
        } else
        {
            fef.a(a);
            return true;
        }
    }
}
