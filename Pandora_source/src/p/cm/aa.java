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
import com.pandora.radio.data.af;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.o;
import org.json.JSONException;
import p.cc.e;
import p.cx.d;
import p.cx.n;
import p.cx.q;
import p.cx.x;
import p.cx.y;
import p.df.a;

public class aa extends d
{

    public aa()
    {
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
        Object obj;
        obj = (e)aobj[0];
        aobj = ((e) (obj)).f();
        s = ((e) (obj)).b();
        s1 = ((e) (obj)).c();
        obj = ((e) (obj)).g();
        if (s1 == null || !s1.equals(com.pandora.android.iap.d.d.a().d().c()) && !s1.startsWith("android.test.purchased")) goto _L2; else goto _L1
_L1:
        boolean flag = b.a.b().e().a(((String) (aobj)), s, s1, ((String) (obj)));
        a.a("GoogleInApp", (new StringBuilder()).append("Backend successful, isMonthly: ").append(flag).toString());
_L4:
        if (flag)
        {
            b.a.b().j().a(false);
            b.a.C().a(new PandoraIntent("iap_complete"));
            b.a.d().a(false);
            b.a.d().b(true);
            b.a.C().a(new PandoraIntent("hide_banner_ad"));
            b.a.b().k().a(null);
        }
        return null;
        aobj;
        flag = false;
_L5:
        a.a("GoogleInApp", (new StringBuilder()).append("Backend api exception: ").append(((y) (aobj)).getMessage()).toString());
        f.a();
        switch (((y) (aobj)).a())
        {
        default:
            throw aobj;

        case 1000: 
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
        aobj;
        a.a("GoogleInApp", (new StringBuilder()).append("Backend IO error: ").append(((q) (aobj)).getMessage()).toString());
        f.a();
        throw aobj;
        aobj;
        a.a("GoogleInApp", (new StringBuilder()).append("Backend HTTP error: ").append(((n) (aobj)).getMessage()).toString());
        f.a();
        throw aobj;
        aobj;
        a.a("GoogleInApp", (new StringBuilder()).append("Backend json error: ").append(((JSONException) (aobj)).getMessage()).toString());
        f.a();
        throw aobj;
_L2:
        a.a("GoogleInApp", (new StringBuilder()).append("ERROR: invalid sku: ").append(s1).toString());
        return null;
        aobj;
          goto _L5
    }
}
