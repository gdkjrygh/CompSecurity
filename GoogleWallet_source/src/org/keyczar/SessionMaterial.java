// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import com.google.gson.Gson;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.util.Util;

// Referenced classes of package org.keyczar:
//            AesKey

public final class SessionMaterial
{

    private AesKey key;
    private String nonce;

    public SessionMaterial()
    {
        key = null;
        nonce = "";
    }

    public SessionMaterial(AesKey aeskey, String s)
    {
        key = null;
        nonce = "";
        key = aeskey;
        nonce = s;
    }

    public final AesKey getKey()
        throws KeyczarException
    {
        if (key == null)
        {
            throw new KeyczarException("Key has not been initialized");
        } else
        {
            return key;
        }
    }

    public final String getNonce()
    {
        return nonce;
    }

    public final String toString()
    {
        return Util.gson().toJson(this);
    }
}
