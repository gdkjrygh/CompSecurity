// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AuthenticatorException;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class nyp extends nxx
{

    private static final byte b[] = "--MultiPartRequest\n".getBytes();
    private static final byte c[] = "--MultiPartRequest--\n".getBytes();
    private static final byte d[] = "Content-Type: ".getBytes();
    private static final byte e[] = "Content-Length: ".getBytes();
    private static final byte q[] = "Content-Type: application/http\n".getBytes();
    private static final byte r[] = "Content-ID: <item:".getBytes();
    private static final byte s[] = ">\n\n".getBytes();
    private static final Pattern t = Pattern.compile("Content-ID: <response-item:(.+)>");
    private static final Pattern u = Pattern.compile("HTTP/1\\.1 (\\d+) (.*)");
    private static final Pattern v = Pattern.compile("Content-Length: (\\d+)");
    private static final Pattern w = Pattern.compile("Content-Type:[\\s]*(.*)");
    private static final Charset x = Charset.forName("US-ASCII");
    private String A;
    private nxx B;
    public ArrayList a;
    private final String y;
    private final String z;

    public nyp(Context context, nyg nyg1, String s1, String s2)
    {
        super(context, nyg1, "batch", new nyq(context, nyg1.a, s2));
        a = new ArrayList();
        y = s1;
        z = s2;
    }

    private static int b(ByteBuffer bytebuffer)
    {
        String s1 = null;
        do
        {
            Object obj;
            do
            {
                obj = c(bytebuffer);
                if (obj == null)
                {
                    return -1;
                }
                if (((String) (obj)).isEmpty())
                {
                    int i1;
                    try
                    {
                        i1 = Integer.parseInt(s1);
                    }
                    // Misplaced declaration of an exception variable
                    catch (ByteBuffer bytebuffer)
                    {
                        throw new IOException((new StringBuilder(String.valueOf(s1).length() + 40)).append("Invalid response format. Section ID = '").append(s1).append("'").toString());
                    }
                    return i1;
                }
                obj = t.matcher(((CharSequence) (obj)));
            } while (!((Matcher) (obj)).matches());
            s1 = ((Matcher) (obj)).group(1);
        } while (true);
    }

    private static String c(ByteBuffer bytebuffer)
    {
        StringBuilder stringbuilder;
        int l1;
        l1 = bytebuffer.position();
        if (bytebuffer.hasArray())
        {
            while (bytebuffer.hasRemaining() && bytebuffer.get() != 10) ;
            int k1 = bytebuffer.position() - l1 - 1;
            if (k1 < 0)
            {
                return null;
            }
            if (k1 == 0)
            {
                return "";
            }
            int i1 = k1;
            if (bytebuffer.get((l1 + k1) - 1) == 13)
            {
                i1 = k1 - 1;
            }
            if (i1 == 0)
            {
                return "";
            } else
            {
                return new String(bytebuffer.array(), l1 + bytebuffer.arrayOffset(), i1, x);
            }
        }
        stringbuilder = oqs.a();
_L1:
        int j1;
        if (!bytebuffer.hasRemaining())
        {
            break MISSING_BLOCK_LABEL_142;
        }
        j1 = bytebuffer.get();
        if (j1 == 10)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        stringbuilder.append((char)j1);
          goto _L1
        bytebuffer;
        oqs.a(stringbuilder);
        throw bytebuffer;
        j1 = bytebuffer.position();
        if (l1 == j1)
        {
            oqs.a(stringbuilder);
            return null;
        }
        if (stringbuilder.charAt(stringbuilder.length() - 1) == '\r')
        {
            stringbuilder.setLength(stringbuilder.length() - 1);
        }
        bytebuffer = stringbuilder.toString();
        oqs.a(stringbuilder);
        return bytebuffer;
    }

    private void c()
    {
        int j1 = a.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            nxx nxx1 = (nxx)a.get(i1);
            if (!b(nxx1.n) && nxx1.c(nxx1.n))
            {
                String s1 = String.valueOf(nxx1.f());
                Log.e("HttpOperation", (new StringBuilder(String.valueOf(s1).length() + 23)).append("[").append(s1).append("] Unexpected exception").toString(), nxx1.n);
            }
        }

    }

    private String s()
    {
        StringBuilder stringbuilder = new StringBuilder(a.size() << 4);
        stringbuilder.append("BatchOperation[").append(a.size()).append("]: ");
        for (Iterator iterator = a.iterator(); iterator.hasNext(); stringbuilder.append(((nxx)iterator.next()).f()).append(", ")) { }
        stringbuilder.setLength(stringbuilder.length() - 2);
        return stringbuilder.toString();
    }

    public final void a(int i1, String s1, IOException ioexception)
    {
        Object obj;
        super.a(i1, s1, ioexception);
        obj = ioexception;
_L8:
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!(obj instanceof AuthenticatorException)) goto _L4; else goto _L3
_L3:
        int j1 = 1;
_L6:
        if (j1 != 0)
        {
            int k1 = a.size();
            for (j1 = 0; j1 < k1; j1++)
            {
                ((nxx)a.get(j1)).a(i1, s1, ioexception);
            }

        }
        break; /* Loop/switch isn't completed */
_L4:
        obj = ((Throwable) (obj)).getCause();
        continue; /* Loop/switch isn't completed */
_L2:
        j1 = 0;
        if (true) goto _L6; else goto _L5
_L5:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void a(ByteBuffer bytebuffer)
    {
        boolean aflag[];
        ByteBuffer bytebuffer1;
        int i1;
        if (r())
        {
            b(bytebuffer, s());
        }
        aflag = new boolean[a.size()];
        bytebuffer1 = bytebuffer.duplicate();
        i1 = 0;
_L5:
        int j2 = b(bytebuffer1);
        if (j2 == -1) goto _L2; else goto _L1
_L1:
        Object obj1;
        String s1;
        int i2;
        B = (nxx)a.get(j2);
        int j1 = 0;
        i2 = 200;
        s1 = null;
        bytebuffer = null;
        do
        {
            Object obj = c(bytebuffer1);
            if (((String) (obj)).isEmpty())
            {
                break;
            }
            Matcher matcher = v.matcher(((CharSequence) (obj)));
            if (matcher.matches())
            {
                j1 = Integer.parseInt(matcher.group(1));
            } else
            {
                Matcher matcher1 = u.matcher(((CharSequence) (obj)));
                if (matcher1.matches())
                {
                    i2 = Integer.parseInt(matcher1.group(1));
                    s1 = matcher1.group(2);
                } else
                {
                    obj = w.matcher(((CharSequence) (obj)));
                    if (((Matcher) (obj)).matches())
                    {
                        bytebuffer = ((Matcher) (obj)).group(1);
                    }
                }
            }
        } while (true);
        obj1 = bytebuffer1.slice();
        ((ByteBuffer) (obj1)).limit(j1);
        bytebuffer1.position(j1 + bytebuffer1.position());
        c(bytebuffer1);
        if (i2 < 200 || i2 >= 300) goto _L4; else goto _L3
_L3:
        B.a(((ByteBuffer) (obj1)));
        bytebuffer = null;
_L6:
        B.a(i2, s1, bytebuffer);
        B.b();
        a(B.f(), B.p.e);
        aflag[j2] = true;
        if (B.l())
        {
            i1++;
        }
          goto _L5
_L4:
        if (Log.isLoggable("HttpOperation", 3))
        {
            String s2 = String.valueOf(B.f());
            (new StringBuilder(String.valueOf(s1).length() + 22 + String.valueOf(s2).length())).append("Error: ").append(i2).append("/").append(s1).append(" [").append(s2).append("]");
        }
        if (i2 == 401)
        {
            throw new nxu(i2, s1);
        }
        B.a(((ByteBuffer) (obj1)), bytebuffer);
        obj1 = null;
_L7:
        bytebuffer = ((ByteBuffer) (obj1));
        if (obj1 == null)
        {
            bytebuffer = new nxu(i2, s1);
        }
          goto _L6
_L2:
        for (int k1 = 0; k1 < aflag.length; k1++)
        {
            if (!aflag[k1])
            {
                bytebuffer = String.valueOf(a.get(k1));
                throw new IOException((new StringBuilder(String.valueOf(bytebuffer).length() + 43)).append("Incomplete response. Response missing for: ").append(bytebuffer).toString());
            }
        }

        if (i1 != 0)
        {
            c();
            int l1 = a.size();
            throw new IOException((new StringBuilder(57)).append(i1).append(" of ").append(l1).append(" operations in the batch failed").toString());
        } else
        {
            return;
        }
        obj1;
          goto _L7
    }

    public final void a(nxx nxx1)
    {
        if (!nxx1.c(z))
        {
            nxx1 = String.valueOf(nxx1.f());
            if (nxx1.length() != 0)
            {
                nxx1 = "Operation cannot be batched: ".concat(nxx1);
            } else
            {
                nxx1 = new String("Operation cannot be batched: ");
            }
            throw new IllegalArgumentException(nxx1);
        } else
        {
            a.add(nxx1);
            return;
        }
    }

    public final void d(String s1)
    {
        if (super.l())
        {
            super.d(s1);
        }
        int j1 = a.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((nxx)a.get(i1)).d(s1);
        }

    }

    public final void e()
    {
        int j1 = a.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((nxx)a.get(i1)).e();
        }

    }

    public final String f()
    {
        if (A == null)
        {
            StringBuilder stringbuilder = (new StringBuilder(super.f())).append('{');
            for (Iterator iterator = a.iterator(); iterator.hasNext(); stringbuilder.append(((nxx)iterator.next()).f()).append(", ")) { }
            stringbuilder.setLength(stringbuilder.length() - 2);
            stringbuilder.append('}');
            A = stringbuilder.toString();
        }
        return A;
    }

    public final String g()
    {
        return b.a(g, y, "batch", true, false, null);
    }

    public final String[] h()
    {
        int j1 = a.size();
        String as[] = new String[j1];
        for (int i1 = 0; i1 < j1; i1++)
        {
            as[i1] = ((nxx)a.get(i1)).f();
        }

        return as;
    }

    public final byte[] i()
    {
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte0[];
        nxx nxx1;
        byte abyte1[];
        int i1;
        try
        {
            bytearrayoutputstream = new ByteArrayOutputStream(a.size() << 9);
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("Cannot create a byte array stream", ioexception);
        }
        i1 = 0;
        if (i1 >= a.size())
        {
            break; /* Loop/switch isn't completed */
        }
        nxx1 = (nxx)a.get(i1);
        bytearrayoutputstream.write(b);
        bytearrayoutputstream.write(q);
        bytearrayoutputstream.write(r);
        bytearrayoutputstream.write(Integer.toString(i1).getBytes());
        bytearrayoutputstream.write(s);
        bytearrayoutputstream.write(nxx1.i.getBytes());
        bytearrayoutputstream.write(32);
        bytearrayoutputstream.write(Uri.parse(nxx1.g()).getPath().getBytes());
        bytearrayoutputstream.write(10);
        abyte1 = nxx1.i();
        if (q())
        {
            nxx1.a(abyte1, nxx1.j());
        }
        if (abyte1 == null)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        if (abyte1.length > 0)
        {
            bytearrayoutputstream.write(d);
            bytearrayoutputstream.write(nxx1.k().getBytes());
            bytearrayoutputstream.write(10);
            bytearrayoutputstream.write(e);
            bytearrayoutputstream.write(Integer.toString(abyte1.length).getBytes());
            bytearrayoutputstream.write(10);
            bytearrayoutputstream.write(10);
            bytearrayoutputstream.write(abyte1);
            bytearrayoutputstream.write(10);
        }
        bytearrayoutputstream.write(10);
        i1++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_21;
_L1:
        bytearrayoutputstream.write(c);
        abyte0 = bytearrayoutputstream.toByteArray();
        return abyte0;
    }

    public final String j()
    {
        return s();
    }

    public final String k()
    {
        return "multipart/mixed; boundary=MultiPartRequest";
    }

    public final boolean l()
    {
        if (super.l())
        {
            return true;
        }
        int j1 = a.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((nxx)a.get(i1)).l())
            {
                return true;
            }
        }

        return false;
    }

}
