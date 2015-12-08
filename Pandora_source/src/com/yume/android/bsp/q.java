// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.bsp;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Random;
import java.util.UUID;

// Referenced classes of package com.yume.android.bsp:
//            p

final class q
    implements ServiceConnection
{

    private static p a = p.a();
    private static String f = null;
    private static boolean g = false;
    private final Context b;
    private List c;
    private final SharedPreferences d;
    private final Random e = new Random();
    private Intent h;

    private q(Context context)
    {
        h = null;
        d = context.getSharedPreferences("uuid_prefs", 0);
        b = context;
    }

    public static String a()
    {
        if (!g)
        {
            a.b("UUID Manager Not Initialized.");
        }
        return f;
    }

    private static String a(String s)
    {
        if (s == null)
        {
            return "";
        }
        byte abyte0[];
        StringBuffer stringbuffer;
        MessageDigest messagedigest = MessageDigest.getInstance("MD5");
        messagedigest.update(s.getBytes());
        abyte0 = messagedigest.digest();
        stringbuffer = new StringBuffer();
        int i = 0;
_L5:
        if (i >= abyte0.length)
        {
            return stringbuffer.toString();
        }
        s = Integer.toHexString(abyte0[i] & 0xff);
_L1:
        if (s.length() < 2)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        stringbuffer.append(s);
        i++;
        continue; /* Loop/switch isn't completed */
        s = (new StringBuilder("0")).append(s).toString();
          goto _L1
        s;
        s.printStackTrace();
_L3:
        return "";
        s;
        s.printStackTrace();
        if (true) goto _L3; else goto _L2
_L2:
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void a(Context context)
    {
        if (context != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        q q1 = new q(context);
        String s = q1.d.getString("uuid", null);
        f = s;
        if (s != null)
        {
            break; /* Loop/switch isn't completed */
        }
        q1.c = context.getPackageManager().queryIntentServices(new Intent("com.yume.uuid.GETDEVICEUUID"), 0);
        if (q1.c == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        int j = q1.c.size();
        int i = 0;
        boolean flag = false;
        do
        {
            if (i >= j)
            {
                if (flag)
                {
                    q1.c.size();
                    q1.e();
                    return;
                }
                break;
            }
            ServiceInfo serviceinfo = ((ResolveInfo)q1.c.get(i)).serviceInfo;
            if (serviceinfo != null && context.getApplicationInfo().packageName.equals(serviceinfo.applicationInfo.packageName))
            {
                q1.c.remove(i);
                flag = true;
            }
            i++;
        } while (true);
        a.a((new StringBuilder("Application '")).append(context.getApplicationInfo().packageName).append("' didn't included YuMe UUID Service.").toString());
        d();
        q1.c();
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        g = true;
        return;
    }

    public static boolean b()
    {
        return g;
    }

    private void c()
    {
        android.content.SharedPreferences.Editor editor = d.edit();
        editor.putString("uuid", f);
        editor.commit();
    }

    private static void d()
    {
        String s = UUID.randomUUID().toString();
        a.a((new StringBuilder("Generated UUID: ")).append(s).toString());
        f = a(s);
        a.a((new StringBuilder("Device UUID (Hash): ")).append(f).toString());
    }

    private void e()
    {
        if (c.size() > 0)
        {
            ServiceInfo serviceinfo = ((ResolveInfo)c.get(0)).serviceInfo;
            h = new Intent();
            h.setComponent(new ComponentName(serviceinfo.applicationInfo.packageName, serviceinfo.name));
            b.startService(h);
            b.bindService(h, this, 1);
            c.remove(0);
            return;
        }
        if (f == null)
        {
            d();
        }
        c();
        g = true;
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        try
        {
            componentname = Parcel.obtain();
            componentname.writeInt(e.nextInt());
            Parcel parcel = Parcel.obtain();
            ibinder.transact(1, Parcel.obtain(), parcel, 0);
            if (componentname.readInt() == parcel.readInt())
            {
                f = parcel.readString();
            }
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            a.b((new StringBuilder("UUID RemoteException: ")).append(componentname.getMessage()).toString());
        }
        b.unbindService(this);
        b.stopService(h);
        if (f == null)
        {
            e();
            return;
        } else
        {
            c();
            g = true;
            return;
        }
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
    }

}
