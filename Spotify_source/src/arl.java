// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import com.facebook.Session;

public final class arl
{

    public final ape a;
    public final BroadcastReceiver b = new arm(this, (byte)0);
    public final de c;
    public boolean d;

    public arl(Context context, ape ape)
    {
        d = false;
        a = new arn(this, ape);
        c = de.a(context);
    }

    public static Session a()
    {
        Session session = Session.g();
        if (session != null && session.a())
        {
            return session;
        } else
        {
            return null;
        }
    }
}
