// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.support.v4.content.j;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.iap.c;
import com.pandora.android.iap.f;
import com.pandora.android.provider.b;
import com.pandora.radio.data.o;
import org.json.JSONException;
import p.cc.e;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.df.a;

public class z extends d
{

    public z()
    {
    }

    protected boolean a(String s)
    {
        return s.equals(com.pandora.android.iap.d.d.a().d().d()) || s.startsWith("android.test.purchased");
    }

    public Object b(Object aobj[])
        throws JSONException, q, y, n, RemoteException, OperationApplicationException
    {
        return c(aobj);
    }

    public transient Void c(Object aobj[])
        throws q, y, JSONException, n
    {
        String s;
        String s1;
        String s2;
        String s3;
        aobj = (e)aobj[0];
        s = ((e) (aobj)).f();
        s1 = ((e) (aobj)).b();
        s2 = ((e) (aobj)).c();
        s3 = ((e) (aobj)).g();
        if (s2 == null || !a(s2)) goto _L2; else goto _L1
_L1:
        boolean flag1 = b.a.b().e().b(s, s1, s2, s3);
        p.df.a.a("GoogleInApp", (new StringBuilder()).append("Backend successful, isMonthly: ").append(flag1).toString());
        boolean flag = true;
_L4:
        if (flag)
        {
            p.df.a.a("GoogleInApp", "Confirming P2P...");
            if (com.pandora.android.iap.d.d.a().d().a(((e) (aobj))))
            {
                b.a.b().j().a(false);
                b.a.C().a(new PandoraIntent("iap_complete"));
            }
        }
_L2:
        return null;
        y y1;
        y1;
        p.df.a.a("GoogleInApp", (new StringBuilder()).append("Backend api exception: ").append(y1.getMessage()).toString());
        switch (y1.a())
        {
        default:
            f.a();
            throw y1;

        case 1000: 
            f.a();
            break;
        }
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        aobj;
        p.df.a.a("GoogleInApp", (new StringBuilder()).append("Backend IO error: ").append(((q) (aobj)).getMessage()).toString());
        f.a();
        throw aobj;
        aobj;
        p.df.a.a("GoogleInApp", (new StringBuilder()).append("Backend HTTP error: ").append(((n) (aobj)).getMessage()).toString());
        f.a();
        throw aobj;
        aobj;
        p.df.a.a("GoogleInApp", (new StringBuilder()).append("Backend json error: ").append(((JSONException) (aobj)).getMessage()).toString());
        f.a();
        throw aobj;
    }
}
