// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.ef;
import com.google.android.gms.internal.zzrx;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            ae, w, ac, u, 
//            c, ab, z, j

public final class h extends ae
{

    h(ac ac)
    {
        super(ac);
    }

    static Object a(int i1, Object obj)
    {
        Object obj1;
        if (obj == null)
        {
            obj1 = null;
        } else
        {
            obj1 = obj;
            if (!(obj instanceof Long))
            {
                obj1 = obj;
                if (!(obj instanceof Float))
                {
                    if (obj instanceof Integer)
                    {
                        return Long.valueOf(((Integer)obj).intValue());
                    }
                    if (obj instanceof Byte)
                    {
                        return Long.valueOf(((Byte)obj).byteValue());
                    }
                    if (obj instanceof Short)
                    {
                        return Long.valueOf(((Short)obj).shortValue());
                    }
                    if (obj instanceof Boolean)
                    {
                        long l1;
                        if (((Boolean)obj).booleanValue())
                        {
                            l1 = 1L;
                        } else
                        {
                            l1 = 0L;
                        }
                        return Long.valueOf(l1);
                    }
                    if (obj instanceof Double)
                    {
                        return Float.valueOf((float)((Double)obj).doubleValue());
                    }
                    if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence))
                    {
                        obj = String.valueOf(obj);
                        obj1 = obj;
                        if (((String) (obj)).length() > i1)
                        {
                            return null;
                        }
                    } else
                    {
                        return null;
                    }
                }
            }
        }
        return obj1;
    }

    public static boolean a(Context context, Class class1)
    {
        context = context.getPackageManager().getReceiverInfo(new ComponentName(context, class1), 2);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        boolean flag = ((ActivityInfo) (context)).enabled;
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_34;
        context;
        return false;
    }

    public static boolean b(Context context, Class class1)
    {
        context = context.getPackageManager().getServiceInfo(new ComponentName(context, class1), 4);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        boolean flag = ((ServiceInfo) (context)).enabled;
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_34;
        context;
        return false;
    }

    public final void a(Bundle bundle, String s, Object obj)
    {
        if (obj instanceof Long)
        {
            bundle.putLong(s, ((Long)obj).longValue());
        } else
        {
            if (obj instanceof Float)
            {
                bundle.putFloat(s, ((Float)obj).floatValue());
                return;
            }
            if (obj instanceof String)
            {
                bundle.putString(s, String.valueOf(obj));
                return;
            }
            if (s != null)
            {
                super.l().d.a("Not putting event parameter. Invalid value type. name, type", s, obj.getClass().getSimpleName());
                return;
            }
        }
    }

    public final void a(com.google.android.gms.internal.ep.b b1, Object obj)
    {
        u.a(obj);
        b1.b = null;
        b1.c = null;
        b1.d = null;
        if (obj instanceof String)
        {
            b1.b = (String)obj;
            return;
        }
        if (obj instanceof Long)
        {
            b1.c = (Long)obj;
            return;
        }
        if (obj instanceof Float)
        {
            b1.d = (Float)obj;
            return;
        } else
        {
            super.l().a.a("Ignoring invalid (type) event param value", obj);
            return;
        }
    }

    public final void a(com.google.android.gms.internal.ep.e e1, Object obj)
    {
        u.a(obj);
        e1.c = null;
        e1.d = null;
        e1.e = null;
        if (obj instanceof String)
        {
            e1.c = (String)obj;
            return;
        }
        if (obj instanceof Long)
        {
            e1.d = (Long)obj;
            return;
        }
        if (obj instanceof Float)
        {
            e1.e = (Float)obj;
            return;
        } else
        {
            super.l().a.a("Ignoring invalid (type) user attribute value", obj);
            return;
        }
    }

    public final boolean a()
    {
        super.e();
        return super.i().checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
    }

    public final boolean a(long l1, long l2)
    {
        while (l1 == 0L || l2 <= 0L || Math.abs(super.h().a() - l1) > l2) 
        {
            return true;
        }
        return false;
    }

    public final byte[] a(com.google.android.gms.internal.ep.c c1)
    {
        byte abyte0[];
        try
        {
            abyte0 = new byte[c1.e()];
            zzrx zzrx1 = zzrx.a(abyte0, abyte0.length);
            c1.a(zzrx1);
            zzrx1.a();
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.internal.ep.c c1)
        {
            super.l().a.a("Data loss. Failed to serialize batch", c1);
            return null;
        }
        return abyte0;
    }

    public final byte[] a(byte abyte0[])
        throws IOException
    {
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            GZIPOutputStream gzipoutputstream = new GZIPOutputStream(bytearrayoutputstream);
            gzipoutputstream.write(abyte0);
            gzipoutputstream.close();
            bytearrayoutputstream.close();
            abyte0 = bytearrayoutputstream.toByteArray();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            super.l().a.a("Failed to gzip content", abyte0);
            throw abyte0;
        }
        return abyte0;
    }

    public final byte[] b(byte abyte0[])
        throws IOException
    {
        GZIPInputStream gzipinputstream;
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte1[];
        abyte0 = new ByteArrayInputStream(abyte0);
        gzipinputstream = new GZIPInputStream(abyte0);
        bytearrayoutputstream = new ByteArrayOutputStream();
        abyte1 = new byte[1024];
_L1:
        int i1 = gzipinputstream.read(abyte1);
label0:
        {
            if (i1 <= 0)
            {
                break label0;
            }
            try
            {
                bytearrayoutputstream.write(abyte1, 0, i1);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                super.l().a.a("Failed to ungzip content", abyte0);
                throw abyte0;
            }
        }
          goto _L1
        gzipinputstream.close();
        abyte0.close();
        abyte0 = bytearrayoutputstream.toByteArray();
        return abyte0;
    }

    public final volatile void c()
    {
        super.c();
    }

    public final volatile void d()
    {
        super.d();
    }

    public final volatile void e()
    {
        super.e();
    }

    public final volatile com.google.android.gms.measurement.internal.u f()
    {
        return super.f();
    }

    public final volatile c g()
    {
        return super.g();
    }

    public final volatile ef h()
    {
        return super.h();
    }

    public final volatile Context i()
    {
        return super.i();
    }

    public final volatile h j()
    {
        return super.j();
    }

    public final volatile ab k()
    {
        return super.k();
    }

    public final volatile w l()
    {
        return super.l();
    }

    public final volatile z m()
    {
        return super.m();
    }

    public final volatile j n()
    {
        return super.n();
    }
}
