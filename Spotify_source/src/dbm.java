// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import com.sony.snei.np.android.account.oauth.InstallationStatus;
import com.sony.snei.np.android.account.oauth.MalformedApkException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;

public final class dbm
{

    private static final HashSet a;

    private static ApplicationInfo a(Context context, String s)
    {
        int i = 0;
        context = context.getPackageManager();
        byte abyte0[];
        String s1;
        StringBuilder stringbuilder;
        try
        {
            Object obj = context.getPackageInfo(s, 64);
            if (((PackageInfo) (obj)).signatures == null || ((PackageInfo) (obj)).signatures.length != 1)
            {
                throw new MalformedApkException("Unknown APK signature");
            }
            obj = ((PackageInfo) (obj)).signatures[0];
            abyte0 = MessageDigest.getInstance("SHA1").digest(((Signature) (obj)).toByteArray());
            stringbuilder = new StringBuilder();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new MalformedApkException(context);
        }
        if (abyte0 == null) goto _L2; else goto _L1
_L1:
        if (i >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder.append(String.format("%02X", new Object[] {
            Integer.valueOf(abyte0[i] & 0xff)
        }));
        i++;
        if (true) goto _L1; else goto _L2
_L2:
        s1 = stringbuilder.toString();
        if (!a.contains(s1))
        {
            throw new MalformedApkException((new StringBuilder("Untrusted APK signature fingerprint:")).append(s1).toString());
        }
        context = context.getApplicationInfo(s, 128);
        return context;
    }

    public static InstallationStatus a(Context context)
    {
        context = b(context);
        if (context != null)
        {
            return ((dbn) (context)).d;
        } else
        {
            return InstallationStatus.d;
        }
    }

    public static dbn b(Context context)
    {
_L2:
        return null;
        if (dbs.a(context) || dbs.a(context)) goto _L2; else goto _L1
_L1:
        ApplicationInfo applicationinfo = a(context, "com.sony.snei.np.android.account");
        if (applicationinfo == null) goto _L2; else goto _L3
_L3:
        dbn dbn1;
        dbn1 = new dbn();
        dbn1.a = applicationinfo.metaData.getInt("capability_version", -1);
        dbn1.b = applicationinfo.metaData.getInt("protocol_version", -1);
        dbn1.b;
        JVM INSTR lookupswitch 2: default 92
    //                   -1: 118
    //                   3: 111;
           goto _L4 _L5 _L6
_L4:
        context = InstallationStatus.c;
_L8:
        dbn1.d = context;
        dbn1.c = applicationinfo.packageName;
        return dbn1;
_L6:
        context = InstallationStatus.a;
        continue; /* Loop/switch isn't completed */
_L5:
        context = InstallationStatus.b;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static 
    {
        HashSet hashset = new HashSet();
        a = hashset;
        hashset.add("C07CCD91B281AB88C7AD3725AF56A0F0A445EA50");
        a.add("D4E7814108426732C416DC09D26BBC552DF4F8C1");
    }
}
