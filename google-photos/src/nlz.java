// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.net.HttpUrlRequest;

final class nlz extends nmv
{

    String a;
    private final Context j;
    private final String k;
    private final nnf l;
    private final String m;
    private final String n;
    private final String o;
    private final boolean p;
    private final int q;
    private final String r;
    private final String s;
    private HttpUrlRequest t;
    private nnb u;

    public nlz(Context context, nyb nyb1, String s1, nnf nnf1, String s2, String s3, String s4, 
            boolean flag, int i, String s5, String s6, nnb nnb1)
    {
        super(nyb1);
        j = context;
        k = s1;
        l = nnf1;
        m = s2;
        n = s3;
        o = s4;
        p = flag;
        q = i;
        r = s5;
        s = s6;
        u = nnb1;
    }

    public final void a()
    {
        Object obj1 = new HashMap(super.c.a(k));
        ((Map) (obj1)).put("X-Upload-Content-Type", l.a);
        long l1 = l.k;
        if (l1 >= 0L)
        {
            ((Map) (obj1)).put("X-Upload-Content-Length", Long.toString(l1));
        }
        Object obj = String.valueOf(Base64.encodeToString(l.n.a, 2));
        Object obj2;
        Context context;
        nnf nnf1;
        String s1;
        String s2;
        String s3;
        nnb nnb1;
        String s4;
        int i;
        if (((String) (obj)).length() != 0)
        {
            obj = "sha1=".concat(((String) (obj)));
        } else
        {
            obj = new String("sha1=");
        }
        ((Map) (obj1)).put("X-Goog-Hash", obj);
        t = npi.a(j, k, 3, ((Map) (obj1)), this.i);
        obj1 = new pdp();
        obj = (nma)olm.a(j, nma);
        context = j;
        s1 = s;
        s2 = m;
        obj = n;
        s3 = o;
        nnf1 = l;
        i = q;
        nnb1 = u;
        obj2 = new pjz();
        s4 = nnf1.c.a();
        obj2.a = s1;
        obj2.b = s2;
        obj2.f = s3;
        obj2.l = s4;
        if (nma.a(nnb1))
        {
            obj2.s = nma.b(nnb1);
            boolean flag;
            if (nnb1 == nnb.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj2.c = Boolean.valueOf(flag);
        } else
        {
            obj2.c = Boolean.valueOf(nnf1.j);
        }
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = nkp.a(s4);
        }
        obj2.e = ((String) (obj));
        obj2.n = (new String[] {
            obj
        });
        obj = nnf1.d;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj2.o = ((String) (obj));
        }
        obj2.m = new pkv();
        ((pjz) (obj2)).m.a = Integer.valueOf(i);
        obj2.g = Long.valueOf(nnf1.h / 1000L);
        if (nnf1.e != null)
        {
            obj2.j = new pjg();
            ((pjz) (obj2)).j.a = new pkr();
            ((pjz) (obj2)).j.a.a = nnf1.e;
        } else
        if (b.f(context, nnf1.l))
        {
            obj2.j = new pjg();
            ((pjz) (obj2)).j.a = new pkr();
            ((pjz) (obj2)).j.a.a = new pyp();
            ((pjz) (obj2)).j.a.a.b = 8;
        }
        if (nnf1.f != null)
        {
            obj2.k = new pjr();
            ((pjz) (obj2)).k.a = nnf1.f;
        }
        obj2.d = nnf1.i;
        obj = nnf1.g;
        if (obj != null)
        {
            obj2.r = ((pkw) (obj));
            obj2.l = null;
            obj2.n = null;
            obj2.s = nma.b(nnb.c);
            obj2.p = 3;
            obj2.c = null;
            obj2.e = null;
            obj2.h = null;
            obj2.d = null;
            obj2.k = null;
            obj2.i = null;
            obj2.g = null;
            obj2.m = null;
            obj2.q = new qgh();
        }
        obj1.a = ((pjz) (obj2));
        obj = j;
        obj2 = r;
        if (p)
        {
            i = 50;
        } else
        {
            i = 100;
        }
        nzd.a(((Context) (obj)), ((qlw) (obj1)), ((String) (obj2)), false, i);
        obj = qlw.a(((qlw) (obj1)));
        t.a("application/x-protobuf", ((byte []) (obj)));
        if (Log.isLoggable("MediaUploader", 2))
        {
            b.a(2, "MediaUploader", ((pdp) (obj1)).toString());
        }
    }

    protected final void a(HttpUrlRequest httpurlrequest)
    {
        httpurlrequest = (List)(new nly(httpurlrequest.l())).a.get(nly.a("Location"));
        if (httpurlrequest == null || httpurlrequest.size() != 1)
        {
            if (Log.isLoggable("MediaUploader", 5))
            {
                Log.w("MediaUploader", "invalid response location header");
            }
            return;
        } else
        {
            a = (String)httpurlrequest.get(0);
            return;
        }
    }

    protected final HttpUrlRequest b()
    {
        return t;
    }
}
