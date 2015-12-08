// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class mfi extends HandlerThread
    implements android.os.Handler.Callback, mfg
{

    private final Context a;
    private final ArrayList b = new ArrayList();
    private final Object c = new Object();
    private jyn d;
    private Handler e;

    public mfi(Context context)
    {
        super("PanoramaClient", 10);
        a = context.getApplicationContext();
    }

    static Handler a(mfi mfi1)
    {
        return mfi1.e;
    }

    static String a(int i)
    {
        switch (i)
        {
        default:
            return "none";

        case 2: // '\002'
            return "360 horizontal";

        case 1: // '\001'
            return "partial";

        case 3: // '\003'
            return "full";
        }
    }

    private boolean a()
    {
        return d != null && d.e();
    }

    public final void a(Uri uri, mfh mfh1)
    {
        if (jyc.a(a) != 0)
        {
            mfh1.c();
            return;
        }
        mfh1 = new mfj(this, mfh1, uri);
        synchronized (c)
        {
            b.add(mfh1);
            if (e == null)
            {
                start();
                e = new Handler(getLooper(), this);
            }
            e.sendEmptyMessage(0);
        }
        return;
        mfh1;
        uri;
        JVM INSTR monitorexit ;
        throw mfh1;
    }

    public final boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            synchronized (c)
            {
                e.removeMessages(0);
                message = new ArrayList(b);
                b.clear();
            }
            int j = message.size();
            int i = 0;
            while (i < j) 
            {
                obj = (mfj)message.get(i);
                boolean flag;
                if (a())
                {
                    flag = true;
                } else
                {
                    if (d != null)
                    {
                        d.d();
                    }
                    d = (new jyo(a)).a(lmc.b).a();
                    ConnectionResult connectionresult = d.a(30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("PanoramaClient", 3))
                    {
                        String s1 = String.valueOf(connectionresult);
                        (new StringBuilder(String.valueOf(s1).length() + 18)).append("ConnectionResult: ").append(s1);
                    }
                    flag = connectionresult.b();
                }
                if (flag)
                {
                    if (Log.isLoggable("PanoramaClient", 3))
                    {
                        String s = String.valueOf(((mfj) (obj)).b);
                        (new StringBuilder(String.valueOf(s).length() + 38)).append("Detecting if the image is a panorama: ").append(s);
                    }
                    e.removeMessages(1);
                    lmc.c.a(d, ((mfj) (obj)).b, null).a(((jyx) (obj)));
                } else
                {
                    ((mfj) (obj)).a.c();
                }
                i++;
            }
            return true;

        case 1: // '\001'
            if (a())
            {
                d.d();
                d = null;
            }
            return true;
        }
        message;
        obj;
        JVM INSTR monitorexit ;
        throw message;
    }
}
