// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taobao.wireless.security.adapter.datacollection;

import android.content.Context;
import com.taobao.wireless.security.adapter.JNICLibrary;
import com.taobao.wireless.security.adapter.b.d;

// Referenced classes of package com.taobao.wireless.security.adapter.datacollection:
//            DeviceInfoCapturer, AppInfoCapturer

public final class a
{

    private static final Object b = new Object();
    private static final Object c = new Object();
    private static final Object d = new Object();
    private Context a;

    public a(Context context)
    {
        a = context.getApplicationContext();
        DeviceInfoCapturer.initialize(a, this);
        AppInfoCapturer.initialize(a);
    }

    public static String a()
    {
        String s;
        synchronized (b)
        {
            s = com.taobao.wireless.security.adapter.b.d.b("DataCollectionData", "key_umid", "");
        }
        return s;
    }

    public static String a(int i, String s)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        s = JNICLibrary.getInstance().getEncryptedDevAndEnvInfoNative(i, s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        if (s.length == 0)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        s = com.alibaba.wireless.security.open.a.a.a(s);
        return s;
        obj;
        JVM INSTR monitorexit ;
        return null;
        s;
        throw s;
    }

    public static boolean a(String s)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        String s1;
        s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        s = b();
        if (s1.equals(s) || !com.taobao.wireless.security.adapter.b.d.a("DataCollectionData", "key_nick", s1))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        if (s.length() != 0)
        {
            JNICLibrary.getInstance().updateNickNative();
        }
        obj;
        JVM INSTR monitorexit ;
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        s;
        throw s;
    }

    public static String b()
    {
        String s;
        synchronized (c)
        {
            s = com.taobao.wireless.security.adapter.b.d.b("DataCollectionData", "key_nick", "");
        }
        return s;
    }

}
