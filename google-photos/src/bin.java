// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

public class bin extends Service
{

    private bqz a;
    private bip b;

    public bin()
    {
    }

    static bqz a(bin bin1)
    {
        return bin1.a;
    }

    public static cwr a(Context context)
    {
        return new cwr(context, new Intent(context, bin));
    }

    public IBinder onBind(Intent intent)
    {
        return b;
    }

    public void onCreate()
    {
        super.onCreate();
        bma bma1 = bpe.a(this).a;
        a = bma1.g();
        b = new bip(this, bma1.a(), bma1.b(), bma1.c(), bma1.d(), (NotificationManager)getSystemService("notification"), bma1.p(), bma1.q(), bma1.r(), bma1.s(), bma1.v(), (noj)olm.a(this, noj));
    }

    public void onDestroy()
    {
        super.onDestroy();
        (new Thread(new biq(b), "MFF Context release thread")).start();
    }

    static 
    {
        bin.getSimpleName();
    }
}
