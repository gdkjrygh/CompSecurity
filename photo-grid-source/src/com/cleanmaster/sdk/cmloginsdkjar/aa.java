// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.cleanmaster.sdk.cmloginsdkjar.internal.Logger;
import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar:
//            b, ab, Request

final class aa
{

    private final OutputStream a;
    private final Logger b;
    private boolean c;

    public aa(OutputStream outputstream, Logger logger)
    {
        c = true;
        a = outputstream;
        b = logger;
    }

    private void a()
    {
        b("--%s", new Object[] {
            "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"
        });
    }

    private void a(String s, ParcelFileDescriptor parcelfiledescriptor, String s1)
    {
        Object obj1;
        obj1 = null;
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "content/unknown";
        }
        a(s, s, s2);
        if (!(a instanceof b)) goto _L2; else goto _L1
_L1:
        int i;
        ((b)a).a(parcelfiledescriptor.getStatSize());
        i = 0;
_L6:
        b("", new Object[0]);
        a();
        if (b != null)
        {
            b.appendKeyValue((new StringBuilder("    ")).append(s).toString(), String.format("<Data: %d>", new Object[] {
                Integer.valueOf(i)
            }));
        }
        return;
_L2:
        parcelfiledescriptor = new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelfiledescriptor);
        s1 = new BufferedInputStream(parcelfiledescriptor);
        byte abyte0[] = new byte[8192];
        i = 0;
_L4:
        int j = s1.read(abyte0);
        if (j == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        a.write(abyte0, 0, j);
        i += j;
        if (true) goto _L4; else goto _L3
_L3:
        s1.close();
        parcelfiledescriptor.close();
        if (true) goto _L6; else goto _L5
_L5:
        s;
        parcelfiledescriptor = null;
        s1 = obj1;
_L8:
        if (parcelfiledescriptor != null)
        {
            parcelfiledescriptor.close();
        }
        if (s1 != null)
        {
            s1.close();
        }
        throw s;
        s;
        Object obj = null;
        s1 = parcelfiledescriptor;
        parcelfiledescriptor = obj;
        continue; /* Loop/switch isn't completed */
        s;
        ParcelFileDescriptor parcelfiledescriptor1 = parcelfiledescriptor;
        parcelfiledescriptor = s1;
        s1 = parcelfiledescriptor1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void a(String s, String s1, String s2)
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
    }

    private transient void a(String s, Object aobj[])
    {
        if (c)
        {
            a.write("--".getBytes());
            a.write("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f".getBytes());
            a.write("\r\n".getBytes());
            c = false;
        }
        a.write(String.format(s, aobj).getBytes());
    }

    private transient void b(String s, Object aobj[])
    {
        a(s, aobj);
        a("\r\n", new Object[0]);
    }

    public final void a(String s, Object obj, Request request)
    {
        if (a instanceof ab)
        {
            ((ab)a).a(request);
        }
        if (!Request.access$000(obj)) goto _L2; else goto _L1
_L1:
        a(s, Request.access$100(obj));
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
        a();
        if (b != null)
        {
            b.appendKeyValue((new StringBuilder("    ")).append(s).toString(), "<Image>");
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
            a();
            if (b != null)
            {
                b.appendKeyValue((new StringBuilder("    ")).append(s).toString(), String.format("<Data: %d>", new Object[] {
                    Integer.valueOf(obj.length)
                }));
                return;
            }
        } else
        {
            if (obj instanceof ParcelFileDescriptor)
            {
                a(s, (ParcelFileDescriptor)obj, ((String) (null)));
                return;
            }
            if (obj instanceof Request.ParcelFileDescriptorWithMimeType)
            {
                obj = (Request.ParcelFileDescriptorWithMimeType)obj;
                a(s, ((Request.ParcelFileDescriptorWithMimeType) (obj)).b(), ((Request.ParcelFileDescriptorWithMimeType) (obj)).a());
                return;
            } else
            {
                throw new IllegalArgumentException("value is not a supported type: String, Bitmap, byte[]");
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
        a();
        if (b != null)
        {
            b.appendKeyValue((new StringBuilder("    ")).append(s).toString(), s1);
        }
    }

    public final void a(String s, JSONArray jsonarray, Collection collection)
    {
        if (!(a instanceof ab))
        {
            a(s, jsonarray.toString());
        } else
        {
            ab ab1 = (ab)a;
            a(s, ((String) (null)), ((String) (null)));
            a("[", new Object[0]);
            collection = collection.iterator();
            int i = 0;
            while (collection.hasNext()) 
            {
                Request request = (Request)collection.next();
                JSONObject jsonobject = jsonarray.getJSONObject(i);
                ab1.a(request);
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
                b.appendKeyValue((new StringBuilder("    ")).append(s).toString(), jsonarray.toString());
                return;
            }
        }
    }
}
