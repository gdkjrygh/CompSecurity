// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.facebook.internal.ak;
import com.facebook.internal.aw;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            ab, q, ar, az, 
//            GraphRequest

final class ae
    implements ab
{

    private final OutputStream a;
    private final ak b;
    private boolean c;
    private boolean d;

    public ae(OutputStream outputstream, ak ak1, boolean flag)
    {
        c = true;
        d = false;
        a = outputstream;
        b = ak1;
        d = flag;
    }

    private static RuntimeException a()
    {
        return new IllegalArgumentException("value is not a supported type.");
    }

    private void a(String s, Uri uri, String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "content/unknown";
        }
        a(s, s, s2);
        int i = aw.a(q.f().getContentResolver().openInputStream(uri), a);
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
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "content/unknown";
        }
        a(s, s, s2);
        int i;
        if (a instanceof ar)
        {
            ((ar)a).a(parcelfiledescriptor.getStatSize());
            i = 0;
        } else
        {
            i = aw.a(new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelfiledescriptor), a) + 0;
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
    {
        a(s, aobj);
        if (!d)
        {
            a("\r\n", new Object[0]);
        }
    }

    public final void a(String s, Object obj, GraphRequest graphrequest)
    {
        if (a instanceof az)
        {
            ((az)a).a(graphrequest);
        }
        if (!GraphRequest.b(obj)) goto _L2; else goto _L1
_L1:
        a(s, GraphRequest.c(obj));
_L4:
        return;
_L2:
        if (!(obj instanceof Bitmap))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (Bitmap)obj;
        a(s, s, "image/png");
        ((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.PNG, 100, a);
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
            obj = (byte[])obj;
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
            if (obj instanceof GraphRequest.ParcelableResourceWithMimeType)
            {
                graphrequest = (GraphRequest.ParcelableResourceWithMimeType)obj;
                obj = graphrequest.b();
                graphrequest = graphrequest.a();
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
    {
        if (!(a instanceof az))
        {
            a(s, jsonarray.toString());
        } else
        {
            az az1 = (az)a;
            a(s, ((String) (null)), ((String) (null)));
            a("[", new Object[0]);
            collection = collection.iterator();
            int i = 0;
            while (collection.hasNext()) 
            {
                GraphRequest graphrequest = (GraphRequest)collection.next();
                JSONObject jsonobject = jsonarray.getJSONObject(i);
                az1.a(graphrequest);
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
}
