// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.libraries.social.gateway.GatewayActivity;

public final class fgx
    implements mmt, omb, opl, ops, opv
{

    private static final ekk f = (new ekm()).a(iks).a(ila).a(hjl).a(hjp).a(hjv).a(hpe).a(iku).b(ikw).b(ile).a();
    public mtj a;
    public boolean b;
    public boolean c;
    public fgv d;
    public ekq e;
    private final Activity g;
    private final int h;
    private final fhb i;
    private mmr j;
    private nfw k;
    private noz l;

    public fgx(Activity activity, opd opd1, int i1, fhb fhb1)
    {
        g = activity;
        h = i1;
        i = (fhb)p.b(fhb1, "must provide non-null listener");
        opd1.a(this);
    }

    static void a(fgx fgx1, mue mue1)
    {
        if (mue1 == null || mue1.c())
        {
            fgx1.a(mue1, "ReadMediaCollectionById");
            return;
        } else
        {
            mue1 = new ikd(fgx1.j.d(), fgx1.d.a, elm.a);
            fgx1.a.a(new elc(mue1, f, fgx1.h));
            return;
        }
    }

    private void a(mue mue1, String s)
    {
        if (l.a())
        {
            noy.a("result", mue1);
            noy.a("taskTag", s);
        }
        b = true;
        i.g();
    }

    static void b(fgx fgx1, mue mue1)
    {
        if (mue1 == null || mue1.c())
        {
            fgx1.a(mue1, elc.a(fgx1.h));
            return;
        } else
        {
            fgx1.e = (ekq)mue1.a().getParcelable("com.google.android.apps.photos.core.media_collection");
            fgx1.i.f();
            return;
        }
    }

    static void c(fgx fgx1, mue mue1)
    {
        if (mue1 == null || mue1.c())
        {
            fgx1.a(mue1, "com.google.android.apps.photos.envelope.GetEnvelopeInfoFromUriTask");
            return;
        } else
        {
            fgx1.d = (fgv)mue1.a().getParcelable("envelope_info");
            fgx1.a();
            return;
        }
    }

    public void a()
    {
        boolean flag1 = false;
        if (d.c)
        {
            Intent intent = new Intent(g, com/google/android/libraries/social/gateway/GatewayActivity);
            intent.setData(d.d);
            g.startActivity(intent);
            g.finish();
        } else
        {
            boolean flag;
            if (d != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.b(flag, "envelopeInfo should be loaded");
            if (j.e())
            {
                flag = flag1;
                if (d != null)
                {
                    flag = true;
                }
                p.b(flag, "envelopeInfo should be loaded");
                p.b(j.e(), "should have an account");
                if (e != null)
                {
                    i.f();
                    return;
                }
                if (!a.a(elc.a(h)) && !a.a("ReadMediaCollectionById"))
                {
                    int i1 = j.d();
                    a.a(new fhj(i1, d.a));
                    a.a(new fhk(i1, d.a));
                    Object obj = new hgg();
                    obj.b = g;
                    obj.a = i1;
                    obj.c = d.a;
                    obj.d = d.b;
                    obj.g = true;
                    obj = ((hgg) (obj)).a();
                    a.a(((mtf) (obj)));
                    return;
                }
            } else
            {
                ngg ngg1 = new ngg();
                ngg1.d = true;
                ngg1.h = true;
                ngg1.f = true;
                ngg1.g = true;
                k.a(ngg1);
                return;
            }
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = ((mtj)olm1.a(mtj)).a("com.google.android.apps.photos.envelope.GetEnvelopeInfoFromUriTask", new fha(this)).a(elc.a(h), new fgz(this)).a("ReadMediaCollectionById", new fgy(this));
        j = ((mmr)olm1.a(mmr)).a(this);
        k = (nfw)olm1.b(nfw);
        l = noz.a(context, 3, "LoadEnvelopeMixin", new String[0]);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            b = bundle.getBoolean("has_load_failed");
            c = bundle.getBoolean("login_started");
            d = (fgv)bundle.getParcelable("envelope_info");
            e = (ekq)bundle.getParcelable("com.google.android.apps.photos.core.media_collection");
        }
    }

    public final void a(boolean flag, mms mms1, mms mms2, int i1, int j1)
    {
        if (flag && c) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (mms2 != mms.c)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "envelopeInfo should be loaded");
        p.b(j.e(), "should have an account");
        if (e != null)
        {
            i.f();
            return;
        }
        if (a.a(elc.a(h)) || a.a("ReadMediaCollectionById")) goto _L1; else goto _L3
_L3:
        i1 = j.d();
        a.a(new fhj(i1, d.a));
        a.a(new fhk(i1, d.a));
        mms1 = new hgg();
        mms1.b = g;
        mms1.a = i1;
        mms1.c = d.a;
        mms1.d = d.b;
        mms1.g = true;
        mms1 = mms1.a();
        a.a(mms1);
        return;
        if (mms2 != mms.b) goto _L1; else goto _L4
_L4:
        Toast.makeText(g, b.oM, 1).show();
        g.finish();
        return;
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("has_load_failed", b);
        bundle.putBoolean("login_started", c);
        bundle.putParcelable("envelope_info", d);
        bundle.putParcelable("com.google.android.apps.photos.core.media_collection", e);
    }

}
