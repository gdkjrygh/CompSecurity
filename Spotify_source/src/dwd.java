// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;

public final class dwd
    implements android.os.Handler.Callback, ggt
{

    private final Handler a = new Handler(this);
    private final Context b;
    private final Uri c;
    private ggq d;

    public dwd(Service service, Uri uri)
    {
        b = service;
        c = uri;
        d = ggq.a(service);
        d.a(uri.toString(), this);
        a.sendEmptyMessageDelayed(1, 500L);
        a.sendEmptyMessageDelayed(2, 5000L);
    }

    public final void a_(Uri uri)
    {
        uri = new Intent("android.intent.action.VIEW", uri);
        uri.addFlags(0x10000000);
        b.startActivity(uri);
        if (d != null)
        {
            d.b();
            d = null;
        }
        a.removeMessages(1);
        a.removeMessages(2);
    }

    public final boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 1: // '\001'
            dmz.a(ggc);
            ggc.a(b, 0x7f080562, 1, new Object[0]);
            return true;

        case 2: // '\002'
            a_(c);
            break;
        }
        return true;
    }
}
