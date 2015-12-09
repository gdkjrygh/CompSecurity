// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.facebook.b.al;
import com.facebook.b.z;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            af, s, av, bd, 
//            GraphRequest

class ai
    implements af
{

    private final OutputStream a;
    private final z b;
    private boolean c;
    private boolean d;

    public ai(OutputStream outputstream, z z1, boolean flag)
    {
        c = true;
        d = false;
        a = outputstream;
        b = z1;
        d = flag;
    }

    private RuntimeException b()
    {
        return new IllegalArgumentException("value is not a supported type.");
    }

    public void a()
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

    public void a(String s1, Bitmap bitmap)
    {
        a(s1, s1, "image/png");
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, a);
        b("", new Object[0]);
        a();
        if (b != null)
        {
            b.a((new StringBuilder()).append("    ").append(s1).toString(), "<Image>");
        }
    }

    public void a(String s1, Uri uri, String s2)
    {
        String s3 = s2;
        if (s2 == null)
        {
            s3 = "content/unknown";
        }
        a(s1, s1, s3);
        s2 = s.f().getContentResolver().openInputStream(uri);
        int i;
        if (a instanceof av)
        {
            long l = al.a(uri);
            ((av)a).a(l);
            i = 0;
        } else
        {
            i = al.a(s2, a) + 0;
        }
        b("", new Object[0]);
        a();
        if (b != null)
        {
            b.a((new StringBuilder()).append("    ").append(s1).toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[] {
                Integer.valueOf(i)
            }));
        }
    }

    public void a(String s1, ParcelFileDescriptor parcelfiledescriptor, String s2)
    {
        String s3 = s2;
        if (s2 == null)
        {
            s3 = "content/unknown";
        }
        a(s1, s1, s3);
        int i;
        if (a instanceof av)
        {
            ((av)a).a(parcelfiledescriptor.getStatSize());
            i = 0;
        } else
        {
            i = al.a(new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelfiledescriptor), a) + 0;
        }
        b("", new Object[0]);
        a();
        if (b != null)
        {
            b.a((new StringBuilder()).append("    ").append(s1).toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[] {
                Integer.valueOf(i)
            }));
        }
    }

    public void a(String s1, Object obj, GraphRequest graphrequest)
    {
        if (a instanceof bd)
        {
            ((bd)a).a(graphrequest);
        }
        if (GraphRequest.b(obj))
        {
            a(s1, GraphRequest.c(obj));
            return;
        }
        if (obj instanceof Bitmap)
        {
            a(s1, (Bitmap)obj);
            return;
        }
        if (obj instanceof byte[])
        {
            a(s1, (byte[])(byte[])obj);
            return;
        }
        if (obj instanceof Uri)
        {
            a(s1, (Uri)obj, ((String) (null)));
            return;
        }
        if (obj instanceof ParcelFileDescriptor)
        {
            a(s1, (ParcelFileDescriptor)obj, ((String) (null)));
            return;
        }
        if (obj instanceof GraphRequest.ParcelableResourceWithMimeType)
        {
            graphrequest = (GraphRequest.ParcelableResourceWithMimeType)obj;
            obj = graphrequest.b();
            graphrequest = graphrequest.a();
            if (obj instanceof ParcelFileDescriptor)
            {
                a(s1, (ParcelFileDescriptor)obj, ((String) (graphrequest)));
                return;
            }
            if (obj instanceof Uri)
            {
                a(s1, (Uri)obj, ((String) (graphrequest)));
                return;
            } else
            {
                throw b();
            }
        } else
        {
            throw b();
        }
    }

    public void a(String s1, String s2)
    {
        a(s1, ((String) (null)), ((String) (null)));
        b("%s", new Object[] {
            s2
        });
        a();
        if (b != null)
        {
            b.a((new StringBuilder()).append("    ").append(s1).toString(), s2);
        }
    }

    public void a(String s1, String s2, String s3)
    {
        if (!d)
        {
            a("Content-Disposition: form-data; name=\"%s\"", new Object[] {
                s1
            });
            if (s2 != null)
            {
                a("; filename=\"%s\"", new Object[] {
                    s2
                });
            }
            b("", new Object[0]);
            if (s3 != null)
            {
                b("%s: %s", new Object[] {
                    "Content-Type", s3
                });
            }
            b("", new Object[0]);
            return;
        } else
        {
            a.write(String.format("%s=", new Object[] {
                s1
            }).getBytes());
            return;
        }
    }

    public void a(String s1, JSONArray jsonarray, Collection collection)
    {
        if (!(a instanceof bd))
        {
            a(s1, jsonarray.toString());
        } else
        {
            bd bd1 = (bd)a;
            a(s1, ((String) (null)), ((String) (null)));
            a("[", new Object[0]);
            collection = collection.iterator();
            int i = 0;
            while (collection.hasNext()) 
            {
                GraphRequest graphrequest = (GraphRequest)collection.next();
                JSONObject jsonobject = jsonarray.getJSONObject(i);
                bd1.a(graphrequest);
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
                b.a((new StringBuilder()).append("    ").append(s1).toString(), jsonarray.toString());
                return;
            }
        }
    }

    public void a(String s1, byte abyte0[])
    {
        a(s1, s1, "content/unknown");
        a.write(abyte0);
        b("", new Object[0]);
        a();
        if (b != null)
        {
            b.a((new StringBuilder()).append("    ").append(s1).toString(), String.format(Locale.ROOT, "<Data: %d>", new Object[] {
                Integer.valueOf(abyte0.length)
            }));
        }
    }

    public transient void a(String s1, Object aobj[])
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
            a.write(String.format(s1, aobj).getBytes());
            return;
        } else
        {
            a.write(URLEncoder.encode(String.format(Locale.US, s1, aobj), "UTF-8").getBytes());
            return;
        }
    }

    public transient void b(String s1, Object aobj[])
    {
        a(s1, aobj);
        if (!d)
        {
            a("\r\n", new Object[0]);
        }
    }
}
