// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.facebook.internal.h;
import com.facebook.internal.m;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            GraphRequest, g, n, q

private static final class d
    implements d
{

    private final OutputStream a;
    private final h b;
    private boolean c;
    private boolean d;

    private static RuntimeException a()
    {
        return new IllegalArgumentException("value is not a supported type.");
    }

    private void a(String s, Uri uri, String s1)
        throws IOException
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "content/unknown";
        }
        a(s, s, s2);
        s1 = g.g().getContentResolver().openInputStream(uri);
        int i;
        if (a instanceof n)
        {
            long l = m.a(uri);
            ((n)a).a(l);
            i = 0;
        } else
        {
            i = m.a(s1, a) + 0;
        }
        b("", new Object[0]);
        b();
        if (b != null)
        {
            b.a((new StringBuilder("    ")).append(s).toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[] {
                Integer.valueOf(i)
            }));
        }
    }

    private void a(String s, ParcelFileDescriptor parcelfiledescriptor, String s1)
        throws IOException
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "content/unknown";
        }
        a(s, s, s2);
        int i;
        if (a instanceof n)
        {
            ((n)a).a(parcelfiledescriptor.getStatSize());
            i = 0;
        } else
        {
            i = m.a(new android.os.iptor.AutoCloseInputStream(parcelfiledescriptor), a) + 0;
        }
        b("", new Object[0]);
        b();
        if (b != null)
        {
            b.a((new StringBuilder("    ")).append(s).toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[] {
                Integer.valueOf(i)
            }));
        }
    }

    private void a(String s, String s1, String s2)
        throws IOException
    {
        if (!d)
        {
            a("Content-Disposition: form-data; name=\"%s\"", new Object[] {
                s
            });
            if (s1 != null)
            {
                a("; filename=\"%s\"", new Object[] {
                    s1
                });
            }
            b("", new Object[0]);
            if (s2 != null)
            {
                b("%s: %s", new Object[] {
                    "Content-Type", s2
                });
            }
            b("", new Object[0]);
            return;
        } else
        {
            a.write(String.format("%s=", new Object[] {
                s
            }).getBytes());
            return;
        }
    }

    private transient void a(String s, Object aobj[])
        throws IOException
    {
        if (!d)
        {
            if (c)
            {
                a.write("--".getBytes());
                a.write("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f".getBytes());
                a.write("\r\n".getBytes());
                c = false;
            }
            a.write(String.format(s, aobj).getBytes());
            return;
        } else
        {
            a.write(URLEncoder.encode(String.format(Locale.US, s, aobj), "UTF-8").getBytes());
            return;
        }
    }

    private void b()
        throws IOException
    {
        if (!d)
        {
            b("--%s", new Object[] {
                "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"
            });
            return;
        } else
        {
            a.write("&".getBytes());
            return;
        }
    }

    private transient void b(String s, Object aobj[])
        throws IOException
    {
        a(s, aobj);
        if (!d)
        {
            a("\r\n", new Object[0]);
        }
    }

    public final void a(String s, Object obj, GraphRequest graphrequest)
        throws IOException
    {
        if (a instanceof q)
        {
            ((q)a).a(graphrequest);
        }
        if (!GraphRequest.a(obj)) goto _L2; else goto _L1
_L1:
        a(s, GraphRequest.b(obj));
_L4:
        return;
_L2:
        if (!(obj instanceof Bitmap))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (Bitmap)obj;
        a(s, s, "image/png");
        ((Bitmap) (obj)).compress(android.graphics.Format.PNG, 100, a);
        b("", new Object[0]);
        b();
        if (b != null)
        {
            b.a((new StringBuilder("    ")).append(s).toString(), "<Image>");
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (obj instanceof byte[])
        {
            obj = (byte[])(byte[])obj;
            a(s, s, "content/unknown");
            a.write(((byte []) (obj)));
            b("", new Object[0]);
            b();
            if (b != null)
            {
                b.a((new StringBuilder("    ")).append(s).toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[] {
                    Integer.valueOf(obj.length)
                }));
                return;
            }
        } else
        {
            if (obj instanceof Uri)
            {
                a(s, (Uri)obj, ((String) (null)));
                return;
            }
            if (obj instanceof ParcelFileDescriptor)
            {
                a(s, (ParcelFileDescriptor)obj, ((String) (null)));
                return;
            }
            if (obj instanceof rcelableResourceWithMimeType)
            {
                graphrequest = (rcelableResourceWithMimeType)obj;
                obj = ((rcelableResourceWithMimeType) (graphrequest)).b;
                graphrequest = ((rcelableResourceWithMimeType) (graphrequest)).a;
                if (obj instanceof ParcelFileDescriptor)
                {
                    a(s, (ParcelFileDescriptor)obj, ((String) (graphrequest)));
                    return;
                }
                if (obj instanceof Uri)
                {
                    a(s, (Uri)obj, ((String) (graphrequest)));
                    return;
                } else
                {
                    throw a();
                }
            } else
            {
                throw a();
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final void a(String s, String s1)
        throws IOException
    {
        a(s, ((String) (null)), ((String) (null)));
        b("%s", new Object[] {
            s1
        });
        b();
        if (b != null)
        {
            b.a((new StringBuilder("    ")).append(s).toString(), s1);
        }
    }

    public final void a(String s, JSONArray jsonarray, Collection collection)
        throws IOException, JSONException
    {
        if (!(a instanceof q))
        {
            a(s, jsonarray.toString());
        } else
        {
            q q1 = (q)a;
            a(s, ((String) (null)), ((String) (null)));
            a("[", new Object[0]);
            collection = collection.iterator();
            int i = 0;
            while (collection.hasNext()) 
            {
                GraphRequest graphrequest = (GraphRequest)collection.next();
                JSONObject jsonobject = jsonarray.getJSONObject(i);
                q1.a(graphrequest);
                if (i > 0)
                {
                    a(",%s", new Object[] {
                        jsonobject.toString()
                    });
                } else
                {
                    a("%s", new Object[] {
                        jsonobject.toString()
                    });
                }
                i++;
            }
            a("]", new Object[0]);
            if (b != null)
            {
                b.a((new StringBuilder("    ")).append(s).toString(), jsonarray.toString());
                return;
            }
        }
    }

    public tor(OutputStream outputstream, h h1, boolean flag)
    {
        c = true;
        d = false;
        a = outputstream;
        b = h1;
        d = flag;
    }
}
