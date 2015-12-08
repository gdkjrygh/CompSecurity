// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.net.HttpUrlRequest;

public final class nmp
{

    private static final Bundle a;
    private static final long b;
    private static final Set c;
    private static final nmt p = new nmq();
    private nne d;
    private boolean e;
    private final Context f;
    private final nyq g;
    private final String h;
    private final String i;
    private final String j;
    private final nmt k;
    private final boolean l = false;
    private final nnb m;
    private final nlw n;
    private final nmu o;

    nmp(nmr nmr1)
    {
        f = nmr1.a;
        h = nmr1.b;
        i = nmr1.c;
        j = nmr1.d;
        k = nmr1.e;
        m = nmr1.f;
        o = (nmu)olm.b(f, nmu);
        n = nmr1.g;
        g = new nyq(f, nmr1.b, "oauth2:https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.read https://www.googleapis.com/auth/plus.stream.write https://www.googleapis.com/auth/plus.circles.write https://www.googleapis.com/auth/plus.circles.read https://www.googleapis.com/auth/plus.photos.readwrite https://www.googleapis.com/auth/plus.native");
    }

    private nmo a(String s, nnf nnf1, String s1, boolean flag, long l1)
    {
        BufferedInputStream bufferedinputstream;
        k.a(nnf1.l, 0L, nnf1.k);
        if (Log.isLoggable("MediaUploader", 4))
        {
            int i1 = nnf1.hashCode();
            (new StringBuilder(28)).append("--- UPLOAD task: ").append(i1);
        }
        if (Log.isLoggable("MediaUploader", 2))
        {
            s1 = String.valueOf("Uploading stream, resumeFingerprint: ");
            (new StringBuilder(String.valueOf(s1).length() + 50 + String.valueOf(null).length())).append(s1).append(null).append(", background: ").append(flag).append(", offset: 0").append(")");
        }
        bufferedinputstream = new BufferedInputStream(nnf1.b.getContentResolver().openInputStream(nnf1.m));
        if (0L > 0L)
        {
            bufferedinputstream.skip(0L);
        }
        s1 = new nms(this, nnf1.l, nnf1.k, 0L);
        Object obj = new nne(f, g, s, nnf1.a, 0L, nnf1.k, bufferedinputstream, flag, s1);
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new nmd(null);
        }
        break MISSING_BLOCK_LABEL_266;
        s1;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        finally
        {
            this;
        }
        throw new nmj(s1.toString(), b.a(nnf1, s));
        d = null;
        this;
        JVM INSTR monitorexit ;
        p.a(bufferedinputstream);
        throw s;
        d = ((nne) (obj));
        this;
        JVM INSTR monitorexit ;
        int k1;
        a(((nmv) (obj)));
        k1 = ((nmv) (obj)).d;
        if (!a(k1)) goto _L2; else goto _L1
_L1:
        s1.a(nnf1.k, nnf1.k);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_324;
        }
        throw new nml("null HttpEntity in response");
        if (Log.isLoggable("MediaUploader", 3))
        {
            int j1 = (int)((nmv) (obj)).e;
            (new StringBuilder(32)).append("parseResult: length: ").append(j1);
        }
        s1 = ((nmv) (obj)).f;
        s1 = qlo.a(s1, 0, s1.length);
        obj = new pdq();
        ((pdq) (obj)).b(s1);
        obj = ((pdq) (obj)).a;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_415;
        }
        throw new nml("Unable to parse UploadMediaResponse");
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (((pka) (obj)).b != null) goto _L5; else goto _L4
_L10:
        if (((pka) (obj)).a == null) goto _L7; else goto _L6
_L6:
        pom pom1 = ((pka) (obj)).a;
        if (pom1.a == null) goto _L9; else goto _L8
_L8:
        obj = pom1.a.a;
_L12:
        String s2;
        if (pom1.d == null)
        {
            break MISSING_BLOCK_LABEL_1004;
        }
        s2 = pom1.d.a;
_L13:
        String s3 = pom1.c;
        s1 = new nmo(s1, ((String) (obj)), (long)(b.a(pom1.e) * 1000D), pom1.b, nnf1.k, s2, s3);
_L11:
        nmx.b(1L);
        this;
        JVM INSTR monitorenter ;
        d = null;
        this;
        JVM INSTR monitorexit ;
        p.a(bufferedinputstream);
        return s1;
_L5:
        s1 = ((pka) (obj)).b;
        long l2;
        long l3;
        long l4;
        boolean flag2;
        l1 = -1L;
        l2 = -1L;
        flag = false;
        flag2 = false;
        l4 = l1;
        l3 = l2;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_648;
        }
        if (((pov) (s1)).b != null)
        {
            l1 = ((pov) (s1)).b.longValue() / 0x100000L;
        }
        if (((pov) (s1)).a != null)
        {
            l2 = ((pov) (s1)).a.longValue() / 0x100000L;
        }
        flag = b.a(((pov) (s1)).d, false);
        flag2 = b.a(((pov) (s1)).c, false);
        l3 = l2;
        l4 = l1;
        s1 = new nna(l4, l3, flag, flag2);
          goto _L10
_L7:
        if (((pka) (obj)).c == null)
        {
            break MISSING_BLOCK_LABEL_769;
        }
        s2 = null;
        pom1 = null;
        qgg qgg1 = ((pka) (obj)).c;
        obj = pom1;
        String s4;
        if (qgg1.b == null)
        {
            break MISSING_BLOCK_LABEL_746;
        }
        s4 = qgg1.b.a;
        obj = pom1;
        s2 = s4;
        if (qgg1.b.b == null)
        {
            break MISSING_BLOCK_LABEL_746;
        }
        obj = qgg1.b.b.b;
        s2 = s4;
        s1 = new nmo(s1, null, 0L, ((String) (obj)), nnf1.k, null, s2);
          goto _L11
        throw new nml("Unsupported UploadMediaResponse type");
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
_L2:
        boolean flag1;
        if (k1 == 308)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_812;
        }
        throw new nml("uploaded full stream but server returned incomplete");
        if (k1 != 400)
        {
            break MISSING_BLOCK_LABEL_851;
        }
        throw new nml((new StringBuilder(55)).append("upload failed (bad payload, file too large) ").append(k1).toString());
        if (k1 < 500 || k1 >= 600)
        {
            break MISSING_BLOCK_LABEL_903;
        }
        throw new nmj((new StringBuilder(33)).append("upload transient error").append(k1).toString(), b.a(nnf1, s));
        if (((nms) (s1)).a != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_923;
        }
        throw ((nms) (s1)).a;
        if (((nmv) (obj)).h)
        {
            throw new nmd(((nmv) (obj)).g, b.a(nnf1, s));
        }
        if (((nmv) (obj)).g != null)
        {
            throw new nmj(((nmv) (obj)).g, b.a(nnf1, s));
        } else
        {
            throw new nml(Integer.toString(k1));
        }
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
_L4:
        s1 = null;
          goto _L10
_L9:
        obj = null;
          goto _L12
        s2 = null;
          goto _L13
    }

    static nmt a(nmp nmp1)
    {
        return nmp1.k;
    }

    private nmv a(nmv nmv1)
    {
        nmv1.a();
        b();
        long l1 = SystemClock.elapsedRealtime();
        nmv1.c();
        nmx.a(SystemClock.elapsedRealtime() - l1);
        int i1 = nmv1.d;
        if (i1 == 401 || i1 == 403)
        {
            long l2;
            try
            {
                nmv1.c.a();
                nmv1.a();
            }
            // Misplaced declaration of an exception variable
            catch (nmv nmv1)
            {
                if (Log.isLoggable("MediaUploader", 5))
                {
                    Log.w("MediaUploader", "authentication failed", nmv1);
                }
                throw new nmk(nmv1);
            }
            b();
            l2 = SystemClock.elapsedRealtime();
            nmv1.c();
            nmx.a(SystemClock.elapsedRealtime() - l2);
        }
        return nmv1;
    }

    private static boolean a(int i1)
    {
        return i1 == 200 || i1 == 201;
    }

    static nmt c()
    {
        return p;
    }

    static long d()
    {
        return b;
    }

    public final nmo a(nnc nnc1)
    {
        Object obj1;
        String s;
        obj1 = null;
        s = null;
        Object obj = new nnf(f, nnc1.a, nnc1.b, nnc1.d, nnc1.l, nnc1.m, nnc1.n);
        if (nnc1.i || !b.d(f, nnc1.a))
        {
            break MISSING_BLOCK_LABEL_110;
        }
        obj1 = b.e(((nnf) (obj)).b, ((nnf) (obj)).m);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        obj.m = ((Uri) (obj1));
        obj1 = ((nnf) (obj)).a(((nnf) (obj)).m);
        obj.n = ((nkp) (obj1));
        obj.k = ((nkp) (obj1)).b;
        obj.j = true;
        if (!TextUtils.isEmpty(nnc1.c))
        {
            obj.i = nnc1.c;
        }
        if (nnc1.h > 0L)
        {
            obj.h = nnc1.h;
        }
        obj1 = ((nnf) (obj)).a;
        if (c.contains(obj1))
        {
            throw new nmf(((String) (obj1)), false);
        }
          goto _L1
        obj1;
        nnc1 = ((nnc) (obj));
        obj = obj1;
_L13:
        throw new nmh(((Throwable) (obj)));
        obj;
        obj1 = nnc1;
        nnc1 = ((nnc) (obj));
_L7:
        int i1;
        boolean flag;
        String s1;
        String s2;
        Context context;
        nyq nyq1;
        String s3;
        String s4;
        if (obj1 != null)
        {
            try
            {
                if (((nnf) (obj1)).j)
                {
                    (new File(((nnf) (obj1)).m.getPath())).delete();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                if (Log.isLoggable("MediaUploader", 5))
                {
                    Log.w("MediaUploader", "ignored exception", ((Throwable) (obj)));
                }
            }
        }
        e = false;
        throw nnc1;
_L1:
        if (obj1 == null) goto _L3; else goto _L2
_L2:
        if (!((String) (obj1)).startsWith("image/") && !((String) (obj1)).startsWith("video/") && !((String) (obj1)).startsWith("audio/")) goto _L3; else goto _L4
_L8:
        if (i1 != 0) goto _L6; else goto _L5
_L5:
        throw new nmf(((String) (obj1)), true);
        nnc1;
        obj1 = obj;
_L12:
        throw new nmj(nnc1, null);
        nnc1;
          goto _L7
_L3:
        i1 = 0;
          goto _L8
_L6:
        obj1 = nnc1.e;
        s = nnc1.f;
        s1 = nnc1.g;
        flag = nnc1.k;
        i1 = nnc1.j;
        if (l)
        {
            nnc1 = "uploadmediapreferredbackground";
        } else
        if (flag)
        {
            nnc1 = "uploadmediabackground";
        } else
        {
            nnc1 = "uploadmedia";
        }
        s2 = b.a(f, "plusi", nnc1, true, a);
        context = f;
        nyq1 = g;
        s3 = j;
        s4 = i;
        if (o != null)
        {
            break MISSING_BLOCK_LABEL_464;
        }
        nnc1 = m;
_L9:
        nnc1 = new nlz(context, nyq1, s2, ((nnf) (obj)), ((String) (obj1)), s, s1, flag, i1, s3, s4, nnc1);
        a(((nmv) (nnc1)));
        i1 = ((nmv) (nnc1)).d;
        if (!a(i1))
        {
            break MISSING_BLOCK_LABEL_524;
        }
        nnc1 = ((nlz) (nnc1)).a;
        if (nnc1 != null)
        {
            break MISSING_BLOCK_LABEL_481;
        }
        throw new nml("upload failed (initial response didn't get valid location url)");
        nnc1 = o.a(h);
          goto _L9
        nnc1 = a(((String) (nnc1)), ((nnf) (obj)), null, flag, 0L);
        try
        {
            if (((nnf) (obj)).j)
            {
                (new File(((nnf) (obj)).m.getPath())).delete();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (Log.isLoggable("MediaUploader", 5))
            {
                Log.w("MediaUploader", "ignored exception", ((Throwable) (obj)));
            }
        }
        e = false;
        return nnc1;
        if (i1 != 400)
        {
            break MISSING_BLOCK_LABEL_563;
        }
        throw new nml((new StringBuilder(55)).append("upload failed (bad payload, file too large) ").append(i1).toString());
        if (i1 != 401)
        {
            break MISSING_BLOCK_LABEL_585;
        }
        throw new nmk(Integer.toString(401));
        if (i1 != 503) goto _L11; else goto _L10
_L10:
        throw new nmj("Server throttle code 503", true);
_L14:
        throw new nmj((new StringBuilder(34)).append("upload transient error:").append(i1).toString());
_L15:
        throw new nml(Integer.toString(i1));
        nnc1;
        obj1 = s;
          goto _L12
        obj;
        nnc1 = null;
          goto _L13
_L4:
        i1 = 1;
          goto _L8
        nnc1;
        obj1 = obj;
          goto _L7
_L11:
        if (i1 != 0 && (i1 < 500 || i1 >= 600)) goto _L15; else goto _L14
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        e = true;
        if (d != null)
        {
            d.a.h();
            d = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void b()
    {
        nlw nlw1 = n;
        if (nlw1 != nlw.a)
        {
            if (nlw1.b == null)
            {
                throw new IllegalStateException("must supply network capability to validate constraints");
            }
            if (nlw1.b.c() && !nlw1.c)
            {
                throw new nme("metered network not allowed");
            }
            if (nlw1.b.d() && !nlw1.d)
            {
                throw new nme("roaming not allowed");
            }
        }
    }

    static 
    {
        Object obj = new Bundle();
        ((Bundle) (obj)).putString("uploadType", "resumable");
        a = ((Bundle) (obj));
        b = oqm.d.f * 10L;
        obj = new HashSet(2);
        ((Set) (obj)).addAll(Arrays.asList(new String[] {
            "application/placeholder-image", "application/stitching-preview"
        }));
        c = Collections.unmodifiableSet(((Set) (obj)));
        Pattern.compile("bytes=(\\d+)-(\\d+)");
    }
}
