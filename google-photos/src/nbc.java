// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.support.rastermill.FrameSequence;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import org.chromium.net.ChunkedWritableByteChannel;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;
import org.chromium.net.ResponseTooLargeException;

public abstract class nbc extends nxb
    implements npd, HttpUrlRequestListener
{

    private String A;
    private int B;
    private long C;
    public final nbj a;
    public nbe b;
    HttpUrlRequest c;
    public nbf d;
    int e;
    private String q;
    private File r;
    private boolean s;
    private npj t;
    private long u;
    private long v;
    private String w;
    private long x;
    private long y;
    private String z;

    public nbc(nbj nbj1, nbg nbg1)
    {
        super(nbj1, nbg1);
        B = -1;
        e = 0;
        a = nbj1;
    }

    private static int a(Bitmap bitmap)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            return bitmap.getAllocationByteCount();
        } else
        {
            return bitmap.getRowBytes() * bitmap.getHeight();
        }
    }

    private String a(String s1, boolean flag)
    {
        try
        {
            String s2 = String.valueOf(s1);
            String s4 = String.valueOf("u");
            if (s4.length() != 0)
            {
                s2 = s2.concat(s4);
            } else
            {
                s2 = new String(s2);
            }
            return oqs.a(s2);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return a();
        }
        catch (IOException ioexception)
        {
            a("Cannot obtain download URL for partial file", ((Throwable) (ioexception)));
        }
        if (flag)
        {
            r.delete();
            s1 = String.valueOf(s1);
            String s3 = String.valueOf("u");
            if (s3.length() != 0)
            {
                s1 = s1.concat(s3);
            } else
            {
                s1 = new String(s1);
            }
            (new File(s1)).delete();
        }
        return a();
    }

    static nxd a(nbc nbc1)
    {
        return nbc1.g;
    }

    private void a(String s1, ByteBuffer bytebuffer, boolean flag, boolean flag1)
    {
        if (flag && !b(s1, flag1))
        {
            return;
        }
        myy myy1;
        if (flag1)
        {
            myy1 = a.e();
        } else
        {
            myy1 = a.d();
        }
        myy1.a(s1, bytebuffer);
    }

    private void a(ByteBuffer bytebuffer)
    {
        Object obj;
        boolean flag;
        obj = (nbg)g;
        if (i != 2 && i != 1)
        {
            if (super.m)
            {
                bytebuffer = String.valueOf(g);
                obj = String.valueOf(nxb.c(super.i));
                (new StringBuilder(String.valueOf(bytebuffer).length() + 53 + String.valueOf(obj).length())).append("Resource no longer needed, not delivering: ").append(bytebuffer).append(", status: ").append(((String) (obj)));
            }
            return;
        }
        if ((((nbg) (obj)).b & 2) != 0)
        {
            if (super.m)
            {
                bytebuffer = String.valueOf(g);
                obj = String.valueOf(e());
                (new StringBuilder(String.valueOf(bytebuffer).length() + 48 + String.valueOf(obj).length())).append("Completing a download-only request: ").append(bytebuffer).append(" file name: ").append(((String) (obj)));
            }
            a.a(this, 1, e());
            return;
        }
        if ((((nbg) (obj)).b & 8) != 0)
        {
            if (super.m)
            {
                obj = String.valueOf(g);
                (new StringBuilder(String.valueOf(obj).length() + 56)).append("Image decoding disabled. Delivering bytes to consumers: ").append(((String) (obj)));
            }
            a.a(this, 1, b.j(bytebuffer));
            return;
        }
        try
        {
            flag = nag.a(bytebuffer);
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            if (super.m)
            {
                bytebuffer = String.valueOf(g);
                (new StringBuilder(String.valueOf(bytebuffer).length() + 36)).append("Out of memory while decoding image: ").append(bytebuffer);
            }
            b.a(new nbd(this));
            a.a(this, 6, null);
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        l = 2;
        if ((((nbg) (obj)).b & 4) != 0 && (((nbg) (obj)).b & 0x20) == 0 && naz.a(bytebuffer))
        {
            c(new naz(FrameSequence.a(bytebuffer)));
            return;
        }
        if ((((nbg) (obj)).b & 4) == 0 || !flag)
        {
            break MISSING_BLOCK_LABEL_405;
        }
        c(new nag(bytebuffer));
        return;
        if ((((nbg) (obj)).b & 0x40) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bytebuffer = ((ByteBuffer) (a.a(this, bytebuffer, flag)));
        if (b != null)
        {
            bytebuffer = ((ByteBuffer) (b.a((nbg)g, bytebuffer)));
        }
        if (bytebuffer == null)
        {
            break MISSING_BLOCK_LABEL_507;
        }
        if (super.m)
        {
            String s1 = String.valueOf(g);
            (new StringBuilder(String.valueOf(s1).length() + 31)).append("Delivering image to consumers: ").append(s1);
        }
        c(bytebuffer);
        return;
        if (super.m)
        {
            bytebuffer = String.valueOf(g);
            (new StringBuilder(String.valueOf(bytebuffer).length() + 26)).append("Bad image; cannot decode: ").append(bytebuffer);
        }
        bytebuffer = e();
        if (bytebuffer == null)
        {
            break MISSING_BLOCK_LABEL_563;
        }
        bytebuffer.delete();
        a.a(this, 5);
        return;
    }

    public static boolean a(String s1)
    {
        while (s1 == null || s1.length() == 0 || s1.charAt(s1.length() - 1) != '~') 
        {
            return false;
        }
        return true;
    }

    public static int b(Object obj)
    {
        if (obj instanceof Bitmap)
        {
            return ((Bitmap)obj).getWidth();
        }
        if (obj instanceof naw)
        {
            return ((naw)obj).b;
        } else
        {
            return 0;
        }
    }

    private boolean b(String s1, boolean flag)
    {
        myy myy1;
        String s2;
        String s3;
        if (flag)
        {
            myy1 = a.e();
        } else
        {
            myy1 = a.d();
        }
        s2 = String.valueOf(s1);
        s3 = String.valueOf("u");
        if (s3.length() != 0)
        {
            s2 = s2.concat(s3);
        } else
        {
            s2 = new String(s2);
        }
        s2 = myy1.b(s2);
        try
        {
            oqs.a(s2, q);
        }
        catch (IOException ioexception)
        {
            a("Cannot save download URL", ioexception);
            (new File(myy1.b(s1))).delete();
            return false;
        }
        return true;
    }

    static boolean n()
    {
        return android.os.Build.VERSION.SDK_INT < 11;
    }

    private String o()
    {
        String s1 = String.valueOf(d());
        return (new StringBuilder(String.valueOf(s1).length() + 1)).append(s1).append('~').toString();
    }

    private void p()
    {
        if (j)
        {
            j = false;
            v = System.currentTimeMillis();
            long l1 = v;
            long l2 = u;
            w = (new StringBuilder(23)).append(l1 - l2).append(" ms").toString();
            a.b(this);
            if (super.m)
            {
                String s1 = w;
                String s2 = String.valueOf(g);
                (new StringBuilder(String.valueOf(s1).length() + 24 + String.valueOf(s2).length())).append("Download completed in ").append(s1).append("; ").append(s2);
                return;
            }
        }
    }

    public abstract String a();

    public final void a(int i1)
    {
        p();
        super.a(i1);
    }

    public final void a(int i1, String s1)
    {
        p();
        super.a(i1, s1);
    }

    public final void a(long l1, long l2)
    {
        if (d != null)
        {
            d.a(l1, l2);
        }
    }

    public final void a(long l1, String s1, int i1, int j1, int k1, Bitmap bitmap)
    {
        y = SystemClock.currentThreadTimeMillis() - l1;
        l1 = y;
        z = (new StringBuilder(23)).append(l1).append(" ms").toString();
        if (super.m)
        {
            String s2;
            if (bitmap == null)
            {
                bitmap = "null";
            } else
            {
                int i2 = bitmap.getWidth();
                int j2 = bitmap.getHeight();
                bitmap = (new StringBuilder(25)).append("[").append(i2).append("x").append(j2).append("]").toString();
            }
            s2 = z;
            (new StringBuilder(String.valueOf(s1).length() + 80 + String.valueOf(bitmap).length() + String.valueOf(s2).length())).append("Decoded ").append(i1).append(" byte ").append(s1).append(" from source [").append(j1).append("x").append(k1).append("] into bitmap ").append(bitmap).append(" in ").append(s2);
        }
    }

    public void a(Object obj)
    {
        boolean flag2 = false;
        Object obj1 = (nbg)g;
        if ((((nbg) (obj1)).b & 2) != 0)
        {
            p();
            if (s)
            {
                obj = r;
                String s2 = r.getName();
                boolean flag;
                if ((((nbg) (obj1)).b & 0x400) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                b(s2, flag);
            } else
            {
                obj = e();
                r.renameTo(((File) (obj)));
            }
            if (super.m)
            {
                obj1 = String.valueOf(g);
                s2 = String.valueOf(obj);
                (new StringBuilder(String.valueOf(obj1).length() + 48 + String.valueOf(s2).length())).append("Completing a download-only request: ").append(((String) (obj1))).append(" file name: ").append(s2);
            }
            a.a(this, 1, obj);
        } else
        {
            Object obj3 = (ByteBuffer)obj;
            if (super.m)
            {
                int i1 = ((ByteBuffer) (obj3)).remaining();
                obj = String.valueOf(g);
                (new StringBuilder(String.valueOf(obj).length() + 47)).append("Delivering data: ").append(((String) (obj))).append("; buffer has ").append(i1).append(" bytes");
            }
            if (obj3 != null)
            {
                Object obj2 = (nbg)g;
                p();
                if (r != null)
                {
                    r.delete();
                }
                if (i == 2 || ((ByteBuffer) (obj3)).remaining() != 0)
                {
                    boolean flag1;
                    if (x == -1L && i != 2)
                    {
                        flag1 = true;
                    } else
                    if (x > 0L && (long)((ByteBuffer) (obj3)).remaining() < x)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (flag1)
                    {
                        obj = o();
                    } else
                    {
                        obj = d();
                    }
                    if ((((nbg) (obj2)).b & 0x400) != 0)
                    {
                        flag2 = true;
                    }
                    if ((((nbg) (obj2)).b & 2) != 0)
                    {
                        a(((String) (obj)), ((ByteBuffer) (obj3)), flag1, flag2);
                        if (super.m)
                        {
                            obj2 = String.valueOf(g);
                            obj3 = String.valueOf(e());
                            if (flag2)
                            {
                                obj = "; long-term cache";
                            } else
                            {
                                obj = "";
                            }
                            (new StringBuilder(String.valueOf(obj2).length() + 48 + String.valueOf(obj3).length() + String.valueOf(obj).length())).append("Completing a download-only request: ").append(((String) (obj2))).append(" file name: ").append(((String) (obj3))).append(((String) (obj)));
                        }
                        a.a(this, 1, e());
                        return;
                    }
                    if (!flag1)
                    {
                        a(((ByteBuffer) (obj3)));
                    }
                    if ((((nbg) (obj2)).b & 1) == 0)
                    {
                        if (super.m)
                        {
                            String s3 = String.valueOf(g);
                            String s1;
                            if (flag2)
                            {
                                s1 = "; long-term cache";
                            } else
                            {
                                s1 = "";
                            }
                            (new StringBuilder(String.valueOf(s3).length() + 40 + String.valueOf(obj).length() + String.valueOf(s1).length())).append("Saving image in file cache: ").append(s3).append(" file name: ").append(((String) (obj))).append(s1);
                        }
                        a(((String) (obj)), ((ByteBuffer) (obj3)), flag1, flag2);
                        return;
                    }
                }
            }
        }
    }

    protected final void a(StringBuilder stringbuilder)
    {
        stringbuilder.append("\n  Size:").append(m());
    }

    public final void a(HttpUrlRequest httpurlrequest)
    {
        C = System.currentTimeMillis();
        A = httpurlrequest.j();
        if (t != null)
        {
            npj npj1 = t;
            long l1 = httpurlrequest.a();
            npj1.a.c = l1;
        }
    }

    public abstract String b();

    public final void b(HttpUrlRequest httpurlrequest)
    {
        this;
        JVM INSTR monitorenter ;
        if (httpurlrequest == c)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        c = null;
        this;
        JVM INSTR monitorexit ;
        p();
        e = e + 1;
        Object obj = httpurlrequest.d();
        int i1;
        long l1;
        if (obj instanceof ResponseTooLargeException)
        {
            boolean flag = true;
            String s1 = String.valueOf(g);
            (new StringBuilder(String.valueOf(s1).length() + 20)).append("Response too large: ").append(s1);
            i1 = ((flag) ? 1 : 0);
            if ((((nbg)g).b & 0x800) != 0)
            {
                s = true;
                obj = null;
                i1 = ((flag) ? 1 : 0);
            }
        } else
        {
            i1 = 0;
        }
        if (obj != null)
        {
            if (Log.isLoggable("ImageResource", 3))
            {
                httpurlrequest = String.valueOf(g);
                (new StringBuilder(String.valueOf(httpurlrequest).length() + 25)).append("Network Exception: Id is:").append(httpurlrequest);
            }
            httpurlrequest = String.valueOf(((IOException) (obj)).getMessage());
            if (httpurlrequest.length() != 0)
            {
                httpurlrequest = "Network exception: ".concat(httpurlrequest);
            } else
            {
                httpurlrequest = new String("Network exception: ");
            }
            a(httpurlrequest, ((Throwable) (obj)));
            if (i1 != 0)
            {
                i1 = 5;
            } else
            {
                i1 = 4;
            }
            a(i1);
            return;
        }
        break MISSING_BLOCK_LABEL_237;
        httpurlrequest;
        this;
        JVM INSTR monitorexit ;
        throw httpurlrequest;
        i1 = httpurlrequest.b();
        if (i1 != 200)
        {
            if (r != null)
            {
                r.delete();
            }
            a(i1, ((String) (null)));
            return;
        }
        if (i != 2)
        {
            s = true;
        }
        l1 = httpurlrequest.a();
        if (l1 == -1L)
        {
            x = -1L;
        } else
        {
            x = l1 + x;
        }
        obj = (nbg)g;
        a.a(((nbg) (obj)).c, httpurlrequest.m(), httpurlrequest.k(), u, C, v, x, i1, A);
        if (t != null)
        {
            httpurlrequest = ((ChunkedWritableByteChannel)t.b).a();
        } else
        if ((((nbg) (obj)).b & 2) == 0)
        {
            httpurlrequest = httpurlrequest.e();
        } else
        {
            httpurlrequest = null;
        }
        a.a(this, httpurlrequest);
        return;
    }

    public void c()
    {
        Object obj1;
        obj1 = (nbg)g;
        if ((((nbg) (obj1)).b & 0x80) != 0)
        {
            if (super.m)
            {
                String s1 = String.valueOf(g);
                obj1 = String.valueOf(e());
                (new StringBuilder(String.valueOf(s1).length() + 34 + String.valueOf(obj1).length())).append("Loading disabled for: ").append(s1).append(" file name: ").append(((String) (obj1)));
            }
            a.a(this, 3, null);
            return;
        }
        if ((((nbg) (obj1)).b & 2) != 0)
        {
            File file = f();
            if (file != null)
            {
                if (super.m)
                {
                    obj1 = String.valueOf(g);
                    String s6 = String.valueOf(file);
                    (new StringBuilder(String.valueOf(obj1).length() + 46 + String.valueOf(s6).length())).append("Returning file name to consumers: ").append(((String) (obj1))).append(" file name: ").append(s6);
                }
                a.a(this, 1, file);
                return;
            }
        }
        if ((((nbg) (obj1)).b & 1) != 0) goto _L2; else goto _L1
_L1:
        Object obj2 = f();
        if (obj2 == null) goto _L2; else goto _L3
_L3:
        if (super.m)
        {
            String s2 = String.valueOf(g);
            String s7 = String.valueOf(obj2);
            (new StringBuilder(String.valueOf(s2).length() + 37 + String.valueOf(s7).length())).append("Loading image from file: ").append(s2).append(" file name: ").append(s7);
        }
        Object obj = b.a(((File) (obj2)), true);
_L5:
        if (obj != null)
        {
            a(((ByteBuffer) (obj)));
            return;
        }
        break; /* Loop/switch isn't completed */
        obj;
        obj = null;
        continue; /* Loop/switch isn't completed */
        obj;
        obj2 = String.valueOf(obj2);
        a((new StringBuilder(String.valueOf(obj2).length() + 18)).append("Cannot load file: ").append(((String) (obj2))).toString(), ((Throwable) (obj)));
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
        if ((((nbg) (obj1)).b & 0x40000) != 0)
        {
            if (super.m)
            {
                String s3 = String.valueOf(g);
                String s5 = String.valueOf(e());
                (new StringBuilder(String.valueOf(s3).length() + 38 + String.valueOf(s5).length())).append("Downloading disabled for: ").append(s3).append(" file name: ").append(s5);
            }
            a.a(this, 3, null);
            return;
        }
        if (super.m)
        {
            String s4 = String.valueOf(g);
            (new StringBuilder(String.valueOf(s4).length() + 21)).append("Requesting download: ").append(s4);
        }
        g();
        return;
    }

    public String d()
    {
        return b();
    }

    public File e()
    {
        Object obj = (nbg)g;
        if ((((nbg) (obj)).b & 1) != 0)
        {
            return null;
        }
        if ((((nbg) (obj)).b & 0x400) != 0)
        {
            obj = a.e();
        } else
        {
            obj = a.d();
        }
        return new File(((myy) (obj)).b(d()));
    }

    public File f()
    {
        String s1 = d();
        File file = a.d().a(s1);
        if (file != null)
        {
            return file;
        } else
        {
            return a.e().a(s1);
        }
    }

    public void g()
    {
        Object obj;
        boolean flag = false;
        obj = null;
        j = true;
        u = System.currentTimeMillis();
        a.a(this);
        q = a();
        if (q == null)
        {
            if (Log.isLoggable("ImageResource", 3))
            {
                String s1 = String.valueOf(g);
                (new StringBuilder(String.valueOf(s1).length() + 35)).append("Unable to download null image url: ").append(s1);
            }
            a(5);
        }
        if ((((nbg)g).b & 2) == 0)
        {
            break MISSING_BLOCK_LABEL_474;
        }
        nbg nbg1 = (nbg)g;
        String s2 = o();
        if ((nbg1.b & 0x400) != 0)
        {
            obj = a.e();
        } else
        {
            obj = a.d();
        }
        obj = ((myy) (obj)).b(s2);
        r = new File(((String) (obj)));
        if (r.exists())
        {
            q = a(((String) (obj)), false);
        }
        if (super.m)
        {
            obj = q;
            String s3 = String.valueOf(super.g);
            (new StringBuilder(String.valueOf(obj).length() + 34 + String.valueOf(s3).length())).append("Downloading using URL: ").append(((String) (obj))).append(" resource: ").append(s3);
        }
        obj = r.getParentFile();
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).mkdirs();
        }
        try
        {
            obj = (new FileOutputStream(r, true)).getChannel();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a("Cannot open cache file", ((Throwable) (obj)));
            a(4);
            return;
        }
        if (q == null)
        {
            obj = String.valueOf(this);
            throw new NullPointerException((new StringBuilder(String.valueOf(obj).length() + 22)).append("Download URL is null: ").append(((String) (obj))).toString());
        }
        obj = npi.a(a.o(), q, 0, null, ((java.nio.channels.WritableByteChannel) (obj)), this);
        ((HttpUrlRequest) (obj)).a(r.length());
        long l1;
        if ((nbg1.b & 0x2000) != 0)
        {
            l1 = a.j();
        } else
        {
            l1 = a.k();
        }
        if ((nbg1.b & 0x800) == 0)
        {
            flag = true;
        }
        ((HttpUrlRequest) (obj)).a(l1, flag);
        this;
        JVM INSTR monitorenter ;
        c = ((HttpUrlRequest) (obj));
        this;
        JVM INSTR monitorexit ;
        ((HttpUrlRequest) (obj)).g();
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        long l2 = a.k();
        x = 0L;
        Object obj1 = o();
        r = a.d().a(((String) (obj1)));
        if (r != null)
        {
            q = a(r.getPath(), true);
            if (!r.exists())
            {
                r = null;
            }
        }
        if (super.m)
        {
            String s4 = q;
            String s7 = String.valueOf(super.g);
            (new StringBuilder(String.valueOf(s4).length() + 34 + String.valueOf(s7).length())).append("Downloading using URL: ").append(s4).append(" resource: ").append(s7);
        }
        t = new npj(new ChunkedWritableByteChannel(), this);
        if (r != null)
        {
            try
            {
                x = r.length();
                if (super.m)
                {
                    long l3 = x;
                    String s5 = String.valueOf(super.g);
                    (new StringBuilder(String.valueOf(obj1).length() + 68 + String.valueOf(s5).length())).append("Continuing download to file ").append(((String) (obj1))).append(" (").append(l3).append(" bytes) resource: ").append(s5);
                }
                obj1 = b.a(r, true);
                t.write(((ByteBuffer) (obj1)));
            }
            catch (IOException ioexception)
            {
                t = null;
                x = 0L;
            }
        }
        obj1 = (nbb)olm.b(a.o(), nbb);
        if (obj1 != null)
        {
            obj1 = ((nbb) (obj1)).a();
            obj = obj1;
            if (super.m)
            {
                obj = obj1;
                if (!((Map) (obj1)).isEmpty())
                {
                    obj = String.valueOf(obj1);
                    String s6 = String.valueOf(super.g);
                    (new StringBuilder(String.valueOf(obj).length() + 33 + String.valueOf(s6).length())).append("Adding image headers: ").append(((String) (obj))).append(" resource: ").append(s6);
                    obj = obj1;
                }
            }
        }
        if (t != null)
        {
            obj = npi.a(a.o(), q, 2, ((Map) (obj)), t, this);
            ((HttpUrlRequest) (obj)).a(x);
        } else
        {
            obj = npi.a(a.o(), q, 2, ((Map) (obj)), this);
        }
        ((HttpUrlRequest) (obj)).a(l2, true);
        this;
        JVM INSTR monitorenter ;
        c = ((HttpUrlRequest) (obj));
        this;
        JVM INSTR monitorexit ;
        ((HttpUrlRequest) (obj)).g();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void h()
    {
        if ((((nbg)g).b & 0x10) == 0)
        {
            Bitmap bitmap = i();
            if (bitmap != null)
            {
                if (bitmap.isMutable())
                {
                    bitmap.eraseColor(0);
                }
                a.a(bitmap);
            }
        }
        super.h();
    }

    public final Bitmap i()
    {
        if (h instanceof Bitmap)
        {
            return (Bitmap)h;
        }
        if (h instanceof naw)
        {
            return ((naw)h).a;
        } else
        {
            return null;
        }
    }

    public final int j()
    {
        return b(h);
    }

    public final int k()
    {
        Object obj = h;
        return l();
    }

    public final int l()
    {
        if (h instanceof Bitmap)
        {
            return ((Bitmap)h).getHeight();
        }
        if (h instanceof naw)
        {
            return ((naw)h).c;
        } else
        {
            return 0;
        }
    }

    public final int m()
    {
        if (B != -1) goto _L2; else goto _L1
_L1:
        if (h == null) goto _L4; else goto _L3
_L3:
        if (!(h instanceof Bitmap)) goto _L6; else goto _L5
_L5:
        B = a((Bitmap)h);
_L2:
        return B;
_L6:
        if (h instanceof naw)
        {
            B = a(((naw)h).a);
            continue; /* Loop/switch isn't completed */
        }
        if (h instanceof nag)
        {
            nag nag1 = (nag)h;
            int i1 = ((qwf) (nag1)).a.length;
            B = (((qwf) (nag1)).f.length << 2) + i1;
            continue; /* Loop/switch isn't completed */
        }
        if (h instanceof nbh)
        {
            B = ((nbh)h).f;
            continue; /* Loop/switch isn't completed */
        }
        if (h instanceof byte[])
        {
            B = ((byte[])h).length;
            continue; /* Loop/switch isn't completed */
        }
_L4:
        B = 0x7fffffff;
        if (true) goto _L2; else goto _L7
_L7:
    }
}
