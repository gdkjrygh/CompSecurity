// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Message;

final class nxi
    implements android.os.Handler.Callback
{

    private nxh a;

    nxi(nxh nxh1)
    {
        a = nxh1;
        super();
    }

    public final boolean handleMessage(Message message)
    {
        return a.a(message);
    }
}
