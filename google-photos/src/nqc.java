// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.chromium.net.HistogramManager;

public final class nqc
    implements myd, npx
{

    private final Context a;
    private final nqd b = new nqd();
    private HistogramManager c;

    public nqc(Context context)
    {
        a = context;
        ((myf)olm.a(a, myf)).a(this);
    }

    private void b()
    {
        byte byte0 = 2;
        nqd nqd1 = b;
        nqd1;
        JVM INSTR monitorenter ;
        Object obj;
        String s;
        rbm arbm[];
        Long along[];
        npk npk1;
        NetworkInfo networkinfo;
        obj = a;
        s = b.c;
        arbm = b.a();
        along = b.b;
        npk1 = (npk)olm.a(((Context) (obj)), npk);
        networkinfo = ((ConnectivityManager)((Context) (obj)).getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null) goto _L2; else goto _L1
_L1:
        networkinfo.getType();
        JVM INSTR tableswitch 0 9: default 489
    //                   0 403
    //                   1 495
    //                   2 489
    //                   3 489
    //                   4 489
    //                   5 489
    //                   6 501
    //                   7 513
    //                   8 489
    //                   9 507;
           goto _L2 _L3 _L4 _L2 _L2 _L2 _L2 _L5 _L6 _L2 _L7
_L30:
        float f;
        int j;
        f = npk1.f();
        j = npk1.h();
        Exception exception;
        ock ock1;
        int i;
        if (j == 2)
        {
            byte0 = 1;
        } else
        if (j != 1)
        {
            if (j == -1)
            {
                byte0 = 3;
            } else
            if (j == -2)
            {
                byte0 = 4;
            } else
            {
                byte0 = 0;
            }
        }
        ock1 = new ock(i, f * 8E-06F, byte0, (float)npk1.g() * 8E-06F, arbm, along);
        ock1.e = s;
        ock1.b(((Context) (obj)));
        if (c != null) goto _L9; else goto _L8
_L8:
        obj = new olu(a, npv);
        if (!((olu) (obj)).a().contains("enable_cronet_histogram_logging")) goto _L11; else goto _L10
_L10:
        obj = (npv)((olu) (obj)).a("enable_cronet_histogram_logging");
        if (!lvd.a(null, null, false)) goto _L11; else goto _L12
_L12:
        i = 1;
_L57:
        if (i == 0) goto _L9; else goto _L13
_L13:
        c = HistogramManager.b();
_L9:
        if (c != null)
        {
            Context context = a;
            Object obj1 = b.c;
            byte abyte0[] = c.a();
            if (abyte0.length > 0)
            {
                obj1 = new obv(((String) (obj1)), abyte0);
                ((mrv)olm.a(context, mrv)).a(context, ((mru) (obj1)));
            }
        }
        if (Log.isLoggable("LogSink", 3))
        {
            i = b.a().length;
            (new StringBuilder(29)).append("Flushed ").append(i).append(" requests.");
        }
        nqd nqd2 = b;
        nqd2.c = null;
        nqd2.a.clear();
        nqd1;
        JVM INSTR monitorexit ;
        return;
_L3:
        networkinfo.getSubtype();
        JVM INSTR tableswitch 1 15: default 519
    //                   1 566
    //                   2 538
    //                   3 615
    //                   4 531
    //                   5 519
    //                   6 552
    //                   7 525
    //                   8 573
    //                   9 594
    //                   10 580
    //                   11 601
    //                   12 559
    //                   13 608
    //                   14 545
    //                   15 587;
           goto _L14 _L15 _L16 _L17 _L18 _L14 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28
_L32:
        if (true) goto _L30; else goto _L29
_L29:
_L34:
        if (true) goto _L32; else goto _L31
_L31:
_L36:
        if (true) goto _L34; else goto _L33
_L33:
_L38:
        if (true) goto _L36; else goto _L35
_L35:
_L40:
        if (true) goto _L38; else goto _L37
_L37:
_L42:
        if (true) goto _L40; else goto _L39
_L39:
_L44:
        if (true) goto _L42; else goto _L41
_L41:
_L46:
        if (true) goto _L44; else goto _L43
_L43:
_L48:
        if (true) goto _L46; else goto _L45
_L45:
_L50:
        if (true) goto _L48; else goto _L47
_L47:
_L52:
        if (true) goto _L50; else goto _L49
_L49:
_L54:
        if (true) goto _L52; else goto _L51
_L51:
_L56:
        if (true) goto _L54; else goto _L53
_L53:
_L55:
        exception;
        nqd1;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        i = 0;
          goto _L30
_L4:
        i = 1;
          goto _L30
_L5:
        i = 2;
          goto _L30
_L7:
        i = 3;
          goto _L30
_L6:
        i = 4;
          goto _L30
_L14:
        i = 0;
          goto _L30
_L20:
        i = 5;
          goto _L30
_L18:
        i = 6;
          goto _L30
_L16:
        i = 7;
          goto _L30
_L27:
        i = 8;
          goto _L30
_L19:
        i = 10;
          goto _L30
_L25:
        i = 11;
          goto _L30
_L15:
        i = 12;
          goto _L30
_L21:
        i = 13;
          goto _L30
_L23:
        i = 14;
          goto _L30
_L28:
        i = 15;
          goto _L30
_L22:
        i = 16;
          goto _L30
_L24:
        i = 17;
          goto _L30
_L26:
        i = 18;
          goto _L30
_L17:
        i = 19;
          goto _L30
_L11:
        i = 0;
          goto _L57
    }

    public final void a()
    {
        b.b = null;
        b();
    }

    public final void a(npy npy1)
    {
        byte byte0 = 3;
        this;
        JVM INSTR monitorenter ;
        Object obj;
        int i;
        obj = (jk)npy1.l;
        i = npy1.i;
        if (i == 200) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        nqd nqd1;
        Object obj1;
        olm.a(a, nwv);
        nqd1 = b;
        obj1 = npy1.c;
        Object obj2;
        Iterator iterator;
        String s;
        rcb rcb1;
        if (nqd1.c != null && !nqd1.c.equals(obj1))
        {
            i = 0;
        } else
        {
            i = 1;
        }
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        b();
        nqd1 = b;
        nqd1;
        JVM INSTR monitorenter ;
        obj1 = new rbm();
        obj1.e = Integer.valueOf(npy1.i);
        obj1.b = npy1.b;
        obj1.g = Integer.valueOf((int)npy1.g);
        obj1.f = Integer.valueOf((int)npy1.h);
        obj1.c = Integer.valueOf((int)(npy1.f - npy1.d));
        obj1.d = Integer.valueOf((int)(npy1.e - npy1.d));
        obj2 = npy1.j;
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        if (((String) (obj2)).isEmpty()) goto _L4; else goto _L5
_L5:
        if (!((String) (obj2)).equals("http/1.1")) goto _L7; else goto _L6
_L6:
        i = 1;
_L12:
        obj1.h = i;
        obj1.a = npy1.a;
        if (npy1.k > 0L)
        {
            obj1.i = Long.valueOf(npy1.k);
        }
        if (obj == null) goto _L9; else goto _L8
_L8:
        if (((jk) (obj)).keySet().size() <= 1) goto _L9; else goto _L10
_L10:
        obj2 = new ArrayList();
        for (iterator = ((jk) (obj)).keySet().iterator(); iterator.hasNext(); ((ArrayList) (obj2)).add(rcb1))
        {
            s = (String)iterator.next();
            rcb1 = new rcb();
            rcb1.a = s;
            rcb1.b = (Long)((jk) (obj)).get(s);
        }

          goto _L11
        npy1;
        nqd1;
        JVM INSTR monitorexit ;
        throw npy1;
        npy1;
        this;
        JVM INSTR monitorexit ;
        throw npy1;
_L7:
        if (!((String) (obj2)).equals("spdy/2"))
        {
            break MISSING_BLOCK_LABEL_383;
        }
        i = 2;
          goto _L12
        i = byte0;
        if (((String) (obj2)).equals("spdy/3")) goto _L12; else goto _L13
_L13:
        if (!((String) (obj2)).equals("spdy/3.1"))
        {
            break MISSING_BLOCK_LABEL_415;
        }
        i = 4;
          goto _L12
        if (!((String) (obj2)).startsWith("h2"))
        {
            break MISSING_BLOCK_LABEL_432;
        }
        i = 5;
          goto _L12
        if (!((String) (obj2)).equals("quic/1+spdy/3")) goto _L4; else goto _L14
_L14:
        i = 6;
          goto _L12
_L11:
        obj1.j = (rcb[])((ArrayList) (obj2)).toArray(new rcb[((ArrayList) (obj2)).size()]);
_L9:
        obj = b;
        obj.c = npy1.c;
        ((nqd) (obj)).a.add(obj1);
        b.a(a);
        if (Log.isLoggable("LogSink", 3))
        {
            npy1 = String.valueOf(obj1);
            (new StringBuilder(String.valueOf(npy1).length() + 14)).append("Added request:").append(npy1);
        }
        if (b.a.size() >= 50)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_580;
        }
        b();
        nqd1;
        JVM INSTR monitorexit ;
          goto _L1
_L4:
        i = 0;
          goto _L12
    }
}
