// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.res.Resources;
import com.snapchat.android.SnapchatApplication;
import java.io.InputStream;
import java.security.KeyStore;

public final class DX
{

    private static KeyStore a;

    public static KeyStore a()
    {
        DX;
        JVM INSTR monitorenter ;
        KeyStore keystore;
        if (a == null)
        {
            a = b();
        }
        keystore = a;
        DX;
        JVM INSTR monitorexit ;
        return keystore;
        Exception exception;
        exception;
        throw exception;
    }

    private static KeyStore b()
    {
        InputStream inputstream;
        KeyStore keystore;
        keystore = KeyStore.getInstance("BKS");
        inputstream = SnapchatApplication.get().getResources().openRawResource(0x7f07000c);
        keystore.load(inputstream, "webesafeandsound".toCharArray());
        inputstream.close();
        return keystore;
        Exception exception;
        exception;
        inputstream.close();
        throw exception;
    }
}
