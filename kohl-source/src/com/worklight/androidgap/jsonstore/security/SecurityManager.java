// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.jsonstore.security;

import android.content.Context;
import android.util.Base64;

// Referenced classes of package com.worklight.androidgap.jsonstore.security:
//            Keychain, DPKBean, SecurityUtils

public class SecurityManager
{

    private static final int IV_NUM_BYTES = 16;
    private static final int LOCAL_KEY_NUM_BYTES = 32;
    private static SecurityManager instance;
    private Keychain keychain;

    private SecurityManager(Context context)
    {
        keychain = new Keychain(context);
    }

    public static SecurityManager getInstance(Context context)
    {
        com/worklight/androidgap/jsonstore/security/SecurityManager;
        JVM INSTR monitorenter ;
        if (instance == null)
        {
            instance = new SecurityManager(context);
        }
        context = instance;
        com/worklight/androidgap/jsonstore/security/SecurityManager;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public void destroyKeychain()
    {
        keychain.destroy();
    }

    public String getDPK(String s, String s1)
        throws Exception
    {
        s1 = keychain.getDPKBean(s1);
        return new String(SecurityUtils.decode(SecurityUtils.encodeKeyAsHexString(SecurityUtils.generateKey(s, s1.getSalt())), new String(Base64.decode(s1.getEncryptedDPK(), 0)), s1.getIV()));
    }

    public String getSalt(String s)
        throws Exception
    {
        s = keychain.getDPKBean(s);
        if (s == null)
        {
            return null;
        } else
        {
            return s.getSalt();
        }
    }

    public boolean isDPKAvailable(String s)
    {
        return keychain.isDPKAvailable(s);
    }

    public boolean storeDPK(String s, String s1, String s2, String s3, boolean flag)
        throws Exception
    {
        String s4 = s2;
        if (s2 != null && !s2.equals("")) goto _L2; else goto _L1
_L1:
        s4 = SecurityUtils.encodeBytesAsHexString(SecurityUtils.generateLocalKey(32));
_L4:
        s2 = SecurityUtils.encodeBytesAsHexString(SecurityUtils.generateIV(16));
        s = new DPKBean(Base64.encodeToString(SecurityUtils.encodeBytesAsHexString(SecurityUtils.encrypt(SecurityUtils.encodeKeyAsHexString(SecurityUtils.generateKey(s, s3)), s4, s2)).getBytes(), 0), s2, s3, 10000);
        keychain.setDPKBean(s1, s);
        return false;
_L2:
        if (!flag)
        {
            s4 = SecurityUtils.encodeKeyAsHexString(SecurityUtils.generateKey(s2, s3));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
