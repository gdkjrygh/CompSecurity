// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.b;

import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import org.c.b.a.d;
import org.c.c.e;
import org.c.c.f;
import org.c.c.g;
import org.c.c.n;
import org.c.d.a;
import org.c.d.i;
import org.c.d.j;
import org.c.d.m;

// Referenced classes of package org.c.c.b:
//            f, b, j, i, 
//            d, h

public class c
    implements org.c.c.b.f
{

    private static final byte a[] = {
        45, 95, 49, 50, 51, 52, 53, 54, 55, 56, 
        57, 48, 97, 98, 99, 100, 101, 102, 103, 104, 
        105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 
        115, 116, 117, 118, 119, 120, 121, 122, 65, 66, 
        67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 
        77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 
        87, 88, 89, 90
    };
    private final Random b = new Random();
    private Charset c;
    private List d;
    private List e;

    public c()
    {
        c = Charset.forName("UTF-8");
        d = new ArrayList();
        e = new ArrayList();
        d.add(n.APPLICATION_FORM_URLENCODED);
        d.add(n.MULTIPART_FORM_DATA);
        e.add(new b());
        org.c.c.b.j j1 = new org.c.c.b.j();
        j1.setWriteAcceptCharset(false);
        e.add(j1);
        e.add(new org.c.c.b.i());
    }

    static void a(OutputStream outputstream)
    {
        b(outputstream);
    }

    private void a(OutputStream outputstream, j j1, byte abyte0[])
    {
        Object obj1;
        Iterator iterator = j1.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_320;
            }
            j1 = (java.util.Map.Entry)iterator.next();
            String s = (String)j1.getKey();
            Iterator iterator1 = ((List)j1.getValue()).iterator();
            while (iterator1.hasNext()) 
            {
label0:
                {
                    j1 = ((j) (iterator1.next()));
                    outputstream.write(45);
                    outputstream.write(45);
                    outputstream.write(abyte0);
                    b(outputstream);
                    Object obj;
                    f f1;
                    n n1;
                    org.c.c.b.f f2;
                    f f3;
                    if (j1 instanceof e)
                    {
                        j1 = (e)j1;
                    } else
                    {
                        j1 = new e(j1);
                    }
                    obj = j1.getBody();
                    obj1 = obj.getClass();
                    f1 = j1.getHeaders();
                    n1 = f1.getContentType();
                    j1 = e.iterator();
                    do
                    {
                        if (!j1.hasNext())
                        {
                            break label0;
                        }
                        f2 = (org.c.c.b.f)j1.next();
                    } while (!f2.canWrite(((Class) (obj1)), n1));
                    obj1 = new org.c.c.b.d(this, outputstream);
                    f3 = ((org.c.c.j) (obj1)).getHeaders();
                    if (obj instanceof d)
                    {
                        j1 = ((d)obj).getFilename();
                    } else
                    {
                        j1 = null;
                    }
                    f3.setContentDispositionFormData(s, j1);
                    if (!f1.isEmpty())
                    {
                        ((org.c.c.j) (obj1)).getHeaders().putAll(f1);
                    }
                    f2.write(obj, n1, ((org.c.c.j) (obj1)));
                    b(outputstream);
                }
            }
        } while (true);
        throw new h((new StringBuilder("Could not write request: no suitable HttpMessageConverter found for request type [")).append(((Class) (obj1)).getName()).append("]").toString());
    }

    private byte[] a()
    {
        byte abyte0[] = new byte[b.nextInt(11) + 30];
        for (int k = 0; k < abyte0.length; k++)
        {
            abyte0[k] = a[b.nextInt(a.length)];
        }

        return abyte0;
    }

    private static void b(OutputStream outputstream)
    {
        outputstream.write(13);
        outputstream.write(10);
    }

    public final void addPartConverter(org.c.c.b.f f1)
    {
        org.c.d.a.notNull(f1, "'partConverter' must not be NULL");
        e.add(f1);
    }

    public boolean canRead(Class class1, n n1)
    {
        if (!org/c/d/j.isAssignableFrom(class1))
        {
            return false;
        }
        if (n1 == null)
        {
            return true;
        }
        for (class1 = getSupportedMediaTypes().iterator(); class1.hasNext();)
        {
            n n2 = (n)class1.next();
            if (!n2.equals(n.MULTIPART_FORM_DATA) && n2.includes(n1))
            {
                return true;
            }
        }

        return false;
    }

    public boolean canWrite(Class class1, n n1)
    {
        if (!org/c/d/j.isAssignableFrom(class1))
        {
            return false;
        }
        if (n1 == null || n.ALL.equals(n1))
        {
            return true;
        }
        for (class1 = getSupportedMediaTypes().iterator(); class1.hasNext();)
        {
            if (((n)class1.next()).isCompatibleWith(n1))
            {
                return true;
            }
        }

        return false;
    }

    public List getSupportedMediaTypes()
    {
        return Collections.unmodifiableList(d);
    }

    public volatile Object read(Class class1, g g1)
    {
        return read(class1, g1);
    }

    public j read(Class class1, g g1)
    {
        class1 = g1.getHeaders().getContentType();
        i k;
        int l;
        int i1;
        if (class1.getCharSet() != null)
        {
            class1 = class1.getCharSet();
        } else
        {
            class1 = c;
        }
        g1 = m.tokenizeToStringArray(org.c.d.g.copyToString(new InputStreamReader(g1.getBody(), class1)), "&");
        k = new i(g1.length);
        i1 = g1.length;
        l = 0;
        while (l < i1) 
        {
            String s = g1[l];
            int j1 = s.indexOf('=');
            if (j1 == -1)
            {
                k.add(URLDecoder.decode(s, class1.name()), null);
            } else
            {
                k.add(URLDecoder.decode(s.substring(0, j1), class1.name()), URLDecoder.decode(s.substring(j1 + 1), class1.name()));
            }
            l++;
        }
        return k;
    }

    public void setCharset(Charset charset)
    {
        c = charset;
    }

    public final void setPartConverters(List list)
    {
        org.c.d.a.notEmpty(list, "'partConverters' must not be empty");
        e = list;
    }

    public void setSupportedMediaTypes(List list)
    {
        d = list;
    }

    public volatile void write(Object obj, n n1, org.c.c.j j1)
    {
        write((j)obj, n1, j1);
    }

    public void write(j j1, n n1, org.c.c.j j2)
    {
        if (n1 == null) goto _L2; else goto _L1
_L1:
        boolean flag = n.MULTIPART_FORM_DATA.equals(n1);
_L8:
        if (flag) goto _L4; else goto _L3
_L3:
        Object obj;
        Iterator iterator;
        if (n1 != null)
        {
            j2.getHeaders().setContentType(n1);
            Object obj2;
            Iterator iterator1;
            String s;
            if (n1.getCharSet() != null)
            {
                n1 = n1.getCharSet();
            } else
            {
                n1 = c;
            }
        } else
        {
            j2.getHeaders().setContentType(n.APPLICATION_FORM_URLENCODED);
            n1 = c;
        }
        obj = new StringBuilder();
        iterator = j1.keySet().iterator();
_L6:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (String)iterator.next();
        iterator1 = ((List)j1.get(obj2)).iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            s = (String)iterator1.next();
            ((StringBuilder) (obj)).append(URLEncoder.encode(((String) (obj2)), n1.name()));
            if (s != null)
            {
                ((StringBuilder) (obj)).append('=');
                ((StringBuilder) (obj)).append(URLEncoder.encode(s, n1.name()));
                if (iterator1.hasNext())
                {
                    ((StringBuilder) (obj)).append('&');
                }
            }
        } while (true);
        if (iterator.hasNext())
        {
            ((StringBuilder) (obj)).append('&');
        }
        continue; /* Loop/switch isn't completed */
_L2:
        obj = j1.keySet().iterator();
label0:
        do
        {
            if (((Iterator) (obj)).hasNext())
            {
                iterator = ((List)j1.get((String)((Iterator) (obj)).next())).iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        continue label0;
                    }
                    obj2 = iterator.next();
                } while (obj2 == null || (obj2 instanceof String));
                break;
            } else
            {
                flag = false;
                continue; /* Loop/switch isn't completed */
            }
        } while (true);
        flag = true;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L6; else goto _L5
_L5:
        j1 = ((StringBuilder) (obj)).toString().getBytes(n1.name());
        j2.getHeaders().setContentLength(j1.length);
        org.c.d.g.copy(j1, j2.getBody());
        return;
_L4:
        n1 = a();
        Object obj1 = Collections.singletonMap("boundary", new String(n1, "US-ASCII"));
        obj1 = new n(n.MULTIPART_FORM_DATA, ((java.util.Map) (obj1)));
        j2.getHeaders().setContentType(((n) (obj1)));
        a(j2.getBody(), j1, n1);
        j1 = j2.getBody();
        j1.write(45);
        j1.write(45);
        j1.write(n1);
        j1.write(45);
        j1.write(45);
        b(j1);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

}
