// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.ConditionVariable;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.chromium.net.HttpUrlRequest;

public class cst
    implements csm, csq
{

    private static final String c = cst.getSimpleName();
    public csj a;
    public csv b;
    private final Context d;
    private final File e;
    private final cta f;
    private final String g;
    private final Object h = new Object();
    private final ddg i;
    private cse j;
    private csw k;
    private csw l;

    private cst(Context context, cta cta1, File file, Locale locale, ddg ddg1)
    {
        d = (Context)b.a(context, "context", null);
        f = (cta)b.a(cta1, "settings", null);
        e = (File)b.a(file, "cacheFile", null);
        g = locale.toString();
        i = (ddg)b.a(ddg1, "httpFetcher", null);
    }

    public static int a(cnx cnx1, long l1)
    {
        b.a(cnx1.b, "duration");
        b.a(l1, "timeUs", 0L, cnx1.b);
        float f1 = (float)l1 / (float)cnx1.b;
        return Math.min(Math.min(cnx1.c, (int)(f1 * (float)cnx1.c) + 0x186a0), cnx1.c);
    }

    static csj a(cst cst1)
    {
        return cst1.a;
    }

    public static cst a(Context context, cta cta1, cso cso1, css css1, File file, Locale locale, csi csi1)
    {
        cta1 = new cst(context, cta1, file, locale, new dcy(context, cta1.l()));
        cta1.a(new csw());
        try
        {
            cta1.a(cta1.g());
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            Log.e(c, "Couldn't use cached track metadata - inconsistent protobuf", file);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            Log.e(c, "Couldn't use cached track metadata - IO exception", file);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            Log.e(c, "Couldn't use cached track metadata - encryption method not supported", file);
        }
        cso1 = new csj(cso1.a, cta1, cso1.b.getDir(cso1.c, 0));
        c.b(((cst) (cta1)).a, "mMusicCache", null);
        cta1.a = (csj)b.a(cso1, "musicCache", null);
        cso1 = css1.a(cta1, null);
        c.b(((cst) (cta1)).b, "mDetailedTrackCache", null);
        cta1.b = new csv(cta1, (csp)b.a(cso1, "musicDetailCache", null));
        if (ddy.j.a())
        {
            context = cse.a(context, csi1.a, csi1.b, new css(context, csi1.c));
            c.b(((cst) (cta1)).j, "mLocalMusicData", null);
            cta1.j = (cse)b.a(context, "localMusicData", null);
        }
        return cta1;
    }

    private void a(csw csw1)
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        boolean flag;
        if (k == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = csw1;
        if (b == null || flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        b.evictAll();
        obj;
        JVM INSTR monitorexit ;
        return;
        csw1;
        obj;
        JVM INSTR monitorexit ;
        throw csw1;
    }

    static String e()
    {
        return c;
    }

    private csw f()
    {
        byte abyte0[];
        Object obj;
        String s2;
        cvp cvp1;
        String as[] = f.m();
        String s4 = g;
        obj = "";
        int j1 = as.length;
        for (int i1 = 0; i1 < j1;)
        {
            String s;
label0:
            {
                String s1 = as[i1];
                s = ((String) (obj));
                if (s1.length() <= ((String) (obj)).length())
                {
                    break label0;
                }
                s = ((String) (obj));
                if (!s4.startsWith(s1))
                {
                    break label0;
                }
                if (s4.length() != s1.length())
                {
                    s = ((String) (obj));
                    if (s4.charAt(s1.length()) != '_')
                    {
                        break label0;
                    }
                }
                s = s1;
            }
            i1++;
            obj = s;
        }

        s2 = f.k();
        if (TextUtils.isEmpty(s2))
        {
            Log.w(c, "Soundtracks base url was empty");
        }
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            abyte0 = String.valueOf(s2);
            String s3 = String.valueOf("index");
            if (s3.length() != 0)
            {
                abyte0 = abyte0.concat(s3);
            } else
            {
                abyte0 = new String(abyte0);
            }
        } else
        {
            abyte0 = String.format("%s%s-%s", new Object[] {
                s2, "index", obj
            });
        }
        abyte0 = i.a(abyte0);
        if (abyte0.length == 0)
        {
            abyte0 = (new StringBuilder(String.valueOf(obj).length() + 64)).append("Zero length response when loading index for locale ").append(((String) (obj))).append(" from network").toString();
            Log.w(c, abyte0);
            throw new IOException(abyte0);
        }
        cvp1 = (cvp)qlw.a(new cvp(), abyte0);
        obj = new FileOutputStream(e);
        ((FileOutputStream) (obj)).write(abyte0);
        b.a(((java.io.Closeable) (obj)));
        return new csw(cvp1, s2);
        Exception exception;
        exception;
        b.a(((java.io.Closeable) (obj)));
        throw exception;
    }

    private csw g()
    {
        if (!e.exists()) goto _L2; else goto _L1
_L1:
        FileInputStream fileinputstream = new FileInputStream(e);
        Object obj;
        byte abyte0[] = dek.a(fileinputstream);
        obj = qlo.a(abyte0, 0, abyte0.length);
        obj = new csw((new cvp()).b(((qlo) (obj))), f.k());
        b.a(fileinputstream);
        return ((csw) (obj));
        Exception exception;
        exception;
        fileinputstream = null;
_L4:
        b.a(fileinputstream);
        throw exception;
_L2:
        return new csw();
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final cqa a(cqc cqc1)
    {
        if (ddy.j.a())
        {
            if (TextUtils.isEmpty(cqc1.c))
            {
                return c().a(cqc1);
            } else
            {
                return d().a(cqc1);
            }
        } else
        {
            return c().a(cqc1);
        }
    }

    public final cvn a(cqa cqa1)
    {
        String s = String.valueOf(c().a);
        cqa1 = String.valueOf(Long.toHexString(cqa1.e.b));
        String s1 = String.valueOf(".metadata");
        cqa1 = (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(cqa1).length() + String.valueOf(s1).length())).append(s).append(cqa1).append(s1).toString();
        cqa1 = i.a(cqa1);
        cqa1 = qlo.a(cqa1, 0, cqa1.length);
        cqa1 = (new cvn()).b(cqa1);
        if (((cvn) (cqa1)).e == -1)
        {
            throw csy.a("beatsPerBar");
        }
        if (((cvn) (cqa1)).b == -1L)
        {
            throw csy.a("duration");
        }
        if (((cvn) (cqa1)).c == -1L)
        {
            throw csy.a("firstBeatTimeUs");
        }
        if (((cvn) (cqa1)).d == -1)
        {
            throw csy.a("sizeBytes");
        }
        if (((cvn) (cqa1)).d <= 0)
        {
            int i1 = ((cvn) (cqa1)).d;
            throw csy.a("sizeBytes", (new StringBuilder(11)).append(i1).toString());
        } else
        {
            return cqa1;
        }
    }

    public final void a(long l1, File file, int i1, int j1)
    {
        java.nio.channels.WritableByteChannel writablebytechannel;
        Object obj;
        Object obj1;
        Object obj2;
        csu csu1;
        HashMap hashmap;
        obj = null;
        writablebytechannel = null;
        int i2 = (int)file.length();
        int k1 = i1;
        if (i2 != i1)
        {
            String s = c;
            String s2 = String.valueOf(file.getName());
            Log.w(s, (new StringBuilder(String.valueOf(s2).length() + 74)).append("Music data Cache file ").append(s2).append(" was ").append(i2).append(" bytes long but expected ").append(i1).toString());
            k1 = i2;
        }
        String s1 = String.valueOf(c().a);
        obj1 = String.valueOf(Long.toHexString(l1));
        obj2 = String.valueOf(".mp3");
        obj1 = Uri.parse((new StringBuilder(String.valueOf(s1).length() + 0 + String.valueOf(obj1).length() + String.valueOf(obj2).length())).append(s1).append(((String) (obj1))).append(((String) (obj2))).toString());
        s1 = (new StringBuilder(29)).append("bytes=").append(k1).append("-").append(j1 - 1).toString();
        obj2 = new ConditionVariable();
        csu1 = new csu(this, ((ConditionVariable) (obj2)));
        hashmap = new HashMap();
        hashmap.put("range", s1);
        FileOutputStream fileoutputstream = new FileOutputStream(file, true);
        writablebytechannel = ((java.nio.channels.WritableByteChannel) (obj));
        obj = Channels.newChannel(fileoutputstream);
        writablebytechannel = ((java.nio.channels.WritableByteChannel) (obj));
        npi.a(d, ((Uri) (obj1)).toString(), 4, hashmap, ((java.nio.channels.WritableByteChannel) (obj)), csu1).g();
        writablebytechannel = ((java.nio.channels.WritableByteChannel) (obj));
        ((ConditionVariable) (obj2)).block();
        b.a(fileoutputstream);
        b.a(((java.io.Closeable) (obj)));
        if (file.length() != (long)j1)
        {
            l1 = file.length();
            throw new IOException((new StringBuilder(111)).append("Data from server was shorter than expected. Cache file is ").append(l1).append(" bytes, but should be ").append(j1).toString());
        } else
        {
            return;
        }
        file;
        obj = null;
_L2:
        b.a(((java.io.Closeable) (obj)));
        b.a(writablebytechannel);
        throw file;
        file;
        obj = fileoutputstream;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final boolean a()
    {
        String s = f.k();
        if (k.a.equals(s))
        {
            return false;
        }
        csw csw1;
        csw1 = f();
        c.a(csw1, "musicData", null);
        synchronized (h)
        {
            l = csw1;
        }
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (IOException ioexception)
        {
            return false;
        }
        catch (csy csy1)
        {
            Log.w(c, "InconsistentProtobufException when loading track list.", csy1);
            return false;
        }
        catch (csx csx1)
        {
            Log.w(c, "EncryptionNotSupportedException when loading track list", csx1);
        }
        return false;
    }

    public final cnx b(cqa cqa1)
    {
        return (cnx)b.get(cqa1);
    }

    public final void b()
    {
        synchronized (h)
        {
            if (l != null)
            {
                a(l);
                l = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public csw c()
    {
        csw csw1;
        synchronized (h)
        {
            csw1 = k;
        }
        return csw1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final cse d()
    {
        c.a(j, "mLocalMusicData", null);
        return j;
    }

}
