// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.content.ContextCompat;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.iid:
//            InstanceIDListenerService, b, a

public class e
{

    SharedPreferences a;
    Context b;

    public e(Context context)
    {
        this(context, "com.google.android.gms.appid");
    }

    public e(Context context, String s)
    {
        b = context;
        a = context.getSharedPreferences(s, 4);
        g((new StringBuilder()).append(s).append("-no-backup").toString());
    }

    private String b(String s, String s1, String s2)
    {
        return (new StringBuilder()).append(s).append("|T|").append(s1).append("|").append(s2).toString();
    }

    private void g(String s)
    {
        s = new File((new ContextCompat()).getNoBackupFilesDir(b), s);
        if (!s.exists()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        try
        {
            if (s.createNewFile() && !a())
            {
                Log.i("InstanceID/Store", "App restored, clearing state");
                InstanceIDListenerService.zza(b, this);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (Log.isLoggable("InstanceID/Store", 3))
            {
                Log.d("InstanceID/Store", (new StringBuilder()).append("Error creating file in no backup dir: ").append(s.getMessage()).toString());
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    String a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = a.getString(s, null);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    String a(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        s = a.getString((new StringBuilder()).append(s).append("|S|").append(s1).toString(), null);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public String a(String s, String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        s = b(s, s1, s2);
        s = a.getString(s, null);
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    KeyPair a(String s, long l)
    {
        this;
        JVM INSTR monitorenter ;
        KeyPair keypair;
        keypair = com.google.android.gms.iid.b.a();
        android.content.SharedPreferences.Editor editor = a.edit();
        a(editor, s, "|P|", com.google.android.gms.iid.a.a(keypair.getPublic().getEncoded()));
        a(editor, s, "|K|", com.google.android.gms.iid.a.a(keypair.getPrivate().getEncoded()));
        a(editor, s, "cre", Long.toString(l));
        editor.commit();
        this;
        JVM INSTR monitorexit ;
        return keypair;
        s;
        throw s;
    }

    void a(android.content.SharedPreferences.Editor editor, String s, String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        editor.putString((new StringBuilder()).append(s).append("|S|").append(s1).toString(), s2);
        this;
        JVM INSTR monitorexit ;
        return;
        editor;
        throw editor;
    }

    public void a(String s, String s1, String s2, String s3, String s4)
    {
        this;
        JVM INSTR monitorenter ;
        s = b(s, s1, s2);
        s1 = a.edit();
        s1.putString(s, s3);
        s1.putString("appVersion", s4);
        s1.putString("lastToken", Long.toString(System.currentTimeMillis() / 1000L));
        s1.commit();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    boolean a()
    {
        return a.getAll().isEmpty();
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        a.edit().clear().commit();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor;
        editor = a.edit();
        Iterator iterator = a.getAll().keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (s1.startsWith(s))
            {
                editor.remove(s1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_78;
        s;
        throw s;
        editor.commit();
        this;
        JVM INSTR monitorexit ;
    }

    public KeyPair c(String s)
    {
        return f(s);
    }

    void d(String s)
    {
        b((new StringBuilder()).append(s).append("|").toString());
    }

    public void e(String s)
    {
        b((new StringBuilder()).append(s).append("|T|").toString());
    }

    KeyPair f(String s)
    {
        String s1;
        Object obj;
        s1 = a(s, "|P|");
        obj = a(s, "|K|");
        if (obj == null)
        {
            return null;
        }
        s = Base64.decode(s1, 8);
        byte abyte0[] = Base64.decode(((String) (obj)), 8);
        obj = KeyFactory.getInstance("RSA");
        s = new KeyPair(((KeyFactory) (obj)).generatePublic(new X509EncodedKeySpec(s)), ((KeyFactory) (obj)).generatePrivate(new PKCS8EncodedKeySpec(abyte0)));
        return s;
        s;
_L2:
        Log.w("InstanceID/Store", (new StringBuilder()).append("Invalid key stored ").append(s).toString());
        InstanceIDListenerService.zza(b, this);
        return null;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
