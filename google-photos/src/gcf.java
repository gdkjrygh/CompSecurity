// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.SparseBooleanArray;
import java.io.IOException;

public class gcf
{

    public final Context a;
    public final noz b;
    public SparseBooleanArray c;
    private final mmv d;
    private final noz e;

    public gcf(Context context)
    {
        c = new SparseBooleanArray();
        a = context;
        d = (mmv)olm.a(context, mmv);
        b = noz.a(context, 3, "Bootstrap", new String[] {
            "sync"
        });
        e = noz.a(context, "Bootstrap", new String[] {
            "sync"
        });
    }

    public static void a(mmz mmz1)
    {
        mmz1.f("Bootstrap").e("local_media_fast_sync_complete").e("local_media_full_sync_complete");
    }

    private mmz d(int i)
    {
        return d.b(i).h("Bootstrap");
    }

    public final boolean a(int i)
    {
        return gcp.a(((gdn)olm.a(a, gdn)).b(i));
    }

    public final void b(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (i != -1) goto _L2; else goto _L1
_L1:
        erj erj1;
        Object obj;
        hdr hdr1;
        try
        {
            throw new IllegalStateException("Attempt to bootstrap database for invalid account");
        }
        catch (mmy mmy1) { }
        finally
        {
            this;
        }
        if (b.a())
        {
            noy.a(i);
        }
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        erj1 = (erj)olm.a(a, erj);
        hdr1 = (hdr)olm.a(a, hdr);
        hdr1.b(true);
        if (b.a())
        {
            noy.a(i);
        }
        d(i).c("local_media_fast_sync_complete", true).d();
        erj1.a(i, "fast local sync complete", null);
        hdr1.b(false);
        if (b.a())
        {
            noy.a(i);
        }
        d(i).c("local_media_full_sync_complete", true).d();
        (new oce(119)).b(a);
        gcc gcc1 = (gcc)olm.a(a, gcc);
        gcc1.a(i, null, get.c);
        if (b.a())
        {
            noy.a(i);
        }
        c.put(i, true);
        erj1.a(i, "initial remote sync complete", null);
        (new oce(120)).b(a);
        gcc1.a(i, null, get.d);
        erj1.a(i, "full initial sync complete", null);
        if (b.a())
        {
            noy.a(i);
        }
          goto _L3
        obj;
        if (!e.a()) goto _L3; else goto _L4
_L4:
        noy.a(i);
        if (true) goto _L3; else goto _L5
_L5:
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        if (!e.a()) goto _L3; else goto _L6
_L6:
        noy.a(i);
          goto _L3
        obj;
        if (!e.a()) goto _L3; else goto _L7
_L7:
        noy.a(i);
          goto _L3
    }

    public final void c(int i)
    {
        mmz mmz1 = ((mmv)olm.a(a, mmv)).b(i);
        a(mmz1);
        mmz1.d();
        c.delete(i);
_L1:
        return;
        mmy mmy1;
        mmy1;
        if (b.a())
        {
            noy.a(i);
            return;
        }
          goto _L1
    }
}
