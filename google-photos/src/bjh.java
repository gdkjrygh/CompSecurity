// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class bjh
    implements bih
{

    private static final Set c;
    private boolean d;
    private final bjp e;
    private final bjw f;
    private final cmg g;
    private final ckf h;
    private final noj i;
    private final AtomicBoolean j = new AtomicBoolean();

    public bjh(cmg cmg1, bjp bjp1, bjw bjw1, ckf ckf1, noj noj1)
    {
        d = false;
        g = cmg1;
        e = (bjp)b.a(bjp1, "cache", null);
        f = (bjw)b.a(bjw1, "analyzer", null);
        h = (ckf)b.a(ckf1, "videoIdentifierGenerator", null);
        i = (noj)b.a(noj1, "movieMakerProvider", null);
    }

    static bjp a(bjh bjh1)
    {
        return bjh1.e;
    }

    static void a(bjh bjh1, cmf cmf1)
    {
        bjh1 = cmf1.d();
        if (bjh1 != null)
        {
            cmf1 = cos.values();
            int l = cmf1.length;
            for (int k = 0; k < l; k++)
            {
                Object obj = cmf1[k];
                if (!c.contains(obj))
                {
                    ((cmi) (bjh1)).a.remove(obj);
                }
            }

        }
    }

    private static final void b(Uri uri, bim bim, bii bii1)
    {
        bii1.b(uri, bim, clz.f().a());
    }

    public final void a()
    {
        j.set(true);
        f.a();
    }

    public final void a(Uri uri, bim bim, bii bii1)
    {
        byte abyte0[];
        byte abyte1[];
        Object obj1;
        ckf ckf1;
        j.set(false);
        ckf1 = h;
        obj1 = i.a(uri);
        abyte1 = ckf.a(((Uri) (obj1)), ckf1.b);
        abyte0 = abyte1;
        if (abyte1 != null) goto _L2; else goto _L1
_L1:
        abyte0 = ckf.a(((Uri) (obj1)), 4096, ckf1.b);
        if (abyte0 != null) goto _L4; else goto _L3
_L3:
        abyte0 = ckf.a;
        String s = String.valueOf(obj1);
        Log.e(abyte0, (new StringBuilder(String.valueOf(s).length() + 34)).append("Cannot compute hash of video file ").append(s).toString());
        abyte0 = null;
_L6:
        if (j.getAndSet(false))
        {
            b(uri, bim, bii1);
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        String s1 = ckf.a;
        obj1 = String.valueOf(obj1);
        Log.w(s1, (new StringBuilder(String.valueOf(obj1).length() + 54)).append("Cannot locate moov box; falling back on start of file ").append(((String) (obj1))).toString());
_L2:
        abyte0 = ckf.a(abyte0);
        if (true) goto _L6; else goto _L5
_L5:
        Object obj;
        obj = g;
        obj = e;
        boolean flag1;
        if (cmg.a(uri, ((bjp) (obj))))
        {
            obj = new clu(uri, ((bjp) (obj)));
        } else
        {
            obj = null;
        }
        if (obj == null || !((cmf) (obj)).a())
        {
            flag1 = false;
        } else
        {
            flag1 = Arrays.equals(abyte0, ((cmf) (obj)).b());
        }
        if (flag1) goto _L8; else goto _L7
_L7:
        if (j.getAndSet(false))
        {
            b(uri, bim, bii1);
            return;
        }
        f.a(uri, bim, new bji(this, bii1, abyte0));
_L21:
        j.set(false);
        return;
_L8:
        if (obj == null) goto _L10; else goto _L9
_L9:
        obj1 = ((cmf) (obj)).c();
        if (obj1 == null || !((cmb) (obj1)).e) goto _L10; else goto _L11
_L11:
        boolean flag = true;
_L13:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        bii1.a(uri, bim, ((cmf) (obj)));
        continue; /* Loop/switch isn't completed */
_L10:
        flag = false;
        if (true) goto _L13; else goto _L12
_L12:
        if (obj == null) goto _L15; else goto _L14
_L14:
        obj1 = ((cmf) (obj)).d();
        if (obj1 == null) goto _L15; else goto _L16
_L16:
        if (((cmi) (obj1)).a(cos.q) || ((cmi) (obj1)).a(cos.r) || ((cmi) (obj1)).a(cos.b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L15; else goto _L17
_L17:
        flag = true;
_L19:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_502;
        }
        if (j.getAndSet(false))
        {
            b(uri, bim, bii1);
            return;
        }
        break; /* Loop/switch isn't completed */
_L15:
        flag = false;
        if (true) goto _L19; else goto _L18
_L18:
        f.a(uri, bim, ((cmf) (obj)), new bji(this, bii1, abyte0));
        continue; /* Loop/switch isn't completed */
        if (j.getAndSet(false))
        {
            b(uri, bim, bii1);
            return;
        }
        f.a(uri, bim, new bji(this, bii1, abyte0));
        if (true) goto _L21; else goto _L20
_L20:
    }

    static 
    {
        bjh.getSimpleName();
        HashSet hashset = new HashSet();
        hashset.add(cos.d);
        hashset.add(cos.g);
        hashset.add(cos.o);
        hashset.add(cos.a);
        hashset.add(cos.b);
        hashset.add(cos.k);
        hashset.add(cos.u);
        hashset.add(cos.v);
        hashset.add(cos.w);
        c = Collections.unmodifiableSet(hashset);
    }
}
