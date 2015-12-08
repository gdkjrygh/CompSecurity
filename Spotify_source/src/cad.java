// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public final class cad
    implements caa
{

    final ckw a;

    public cad(Context context, VersionInfoParcel versioninfoparcel, bzm bzm)
    {
        bkv.f();
        a = clc.a(context, new AdSizeParcel(), false, false, bzm, versioninfoparcel);
        a.a().setWillNotDraw(true);
    }

    private static void a(Runnable runnable)
    {
        bfq.a();
        if (bjz.b())
        {
            runnable.run();
            return;
        } else
        {
            cjj.a.post(runnable);
            return;
        }
    }

    public final void a()
    {
        a.destroy();
    }

    public final void a(bfe bfe, bhs bhs, cde cde, bhz bhz)
    {
        a.k().a(bfe, bhs, cde, bhz, false, null, null, new bkg((byte)0), null);
    }

    public final void a(cab cab)
    {
        a.k().d = new cky(cab) {

            private cab a;

            public final void a(ckw ckw1, boolean flag)
            {
                a.a();
            }

            
            {
                a = cab1;
                super();
            }
        };
    }

    public final void a(String s)
    {
        a(new Runnable(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[] {
            s
        })) {

            private String a;
            private cad b;

            public final void run()
            {
                b.a.loadData(a, "text/html", "UTF-8");
            }

            
            {
                b = cad.this;
                a = s;
                super();
            }
        });
    }

    public final void a(String s, cdi cdi)
    {
        a.k().a(s, cdi);
    }

    public final void a(String s, String s1)
    {
        a(new Runnable(s, s1) {

            private String a;
            private String b;
            private cad c;

            public final void run()
            {
                c.a.a(a, b);
            }

            
            {
                c = cad.this;
                a = s;
                b = s1;
                super();
            }
        });
    }

    public final void a(String s, JSONObject jsonobject)
    {
        a(new Runnable(s, jsonobject) {

            private String a;
            private JSONObject b;
            private cad c;

            public final void run()
            {
                c.a.b(a, b);
            }

            
            {
                c = cad.this;
                a = s;
                b = jsonobject;
                super();
            }
        });
    }

    public final caf b()
    {
        return new cag(this);
    }

    public final void b(String s)
    {
        a(new Runnable(s) {

            private String a;
            private cad b;

            public final void run()
            {
                b.a.loadUrl(a);
            }

            
            {
                b = cad.this;
                a = s;
                super();
            }
        });
    }

    public final void b(String s, cdi cdi)
    {
        ckx ckx1 = a.k();
        Object obj = ckx1.c;
        obj;
        JVM INSTR monitorenter ;
        s = (List)ckx1.b.get(s);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        s.remove(cdi);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void b(String s, JSONObject jsonobject)
    {
        a.a(s, jsonobject);
    }

    public final void c(String s)
    {
        a(new Runnable(s) {

            private String a;
            private cad b;

            public final void run()
            {
                b.a.loadData(a, "text/html", "UTF-8");
            }

            
            {
                b = cad.this;
                a = s;
                super();
            }
        });
    }
}
