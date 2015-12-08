// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import android.content.Context;
import com.worklight.common.security.WLUserAuthManager;
import java.security.KeyStoreException;

public class WLUserCertificateManager
{

    public WLUserCertificateManager()
    {
    }

    public void deleteCertificate(Context context)
        throws Exception
    {
        WLUserAuthManager.getInstance().init(context);
        try
        {
            WLUserAuthManager.getInstance().clearKeystore();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new Exception("Could not find keystore.");
        }
    }
}
