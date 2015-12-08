// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import com.braintreepayments.api.exceptions.AppSwitchNotAvailableException;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.security.auth.x500.X500Principal;

// Referenced classes of package com.braintreepayments.api:
//            ClientToken

public abstract class AppSwitch
{

    public static final String EXTRA_MERCHANT_ID = "com.braintreepayments.api.MERCHANT_ID";
    public static final String EXTRA_OFFLINE = "com.braintreepayments.api.OFFLINE";
    public static final String EXTRA_PAYMENT_METHOD_NONCE = "com.braintreepayments.api.EXTRA_PAYMENT_METHOD_NONCE";
    protected static boolean sEnableSignatureVerification = true;
    protected ClientToken mClientToken;
    protected Context mContext;

    public AppSwitch(Context context, ClientToken clienttoken)
    {
        mContext = context;
        mClientToken = clienttoken;
    }

    private boolean isSignatureValid()
    {
        boolean flag1 = false;
        if (sEnableSignatureVerification) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        PackageManager packagemanager = mContext.getPackageManager();
        Signature asignature[];
        Object obj;
        CertificateException certificateexception;
        String s;
        String s1;
        int i;
        int j;
        int k;
        int l;
        try
        {
            asignature = packagemanager.getPackageInfo(getPackage(), 64).signatures;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return false;
        }
        j = asignature.length;
        i = 0;
        flag = flag1;
        if (i >= j) goto _L4; else goto _L3
_L3:
        obj = asignature[i];
        obj = new ByteArrayInputStream(((Signature) (obj)).toByteArray());
        obj = (X509Certificate)CertificateFactory.getInstance("X509").generateCertificate(((java.io.InputStream) (obj)));
        s = ((X509Certificate) (obj)).getSubjectX500Principal().getName();
        s1 = ((X509Certificate) (obj)).getIssuerX500Principal().getName();
        k = ((X509Certificate) (obj)).getPublicKey().hashCode();
        if (!getCertificateSubject().equals(s) || !getCertificateIssuer().equals(s1)) goto _L6; else goto _L5
_L5:
        l = getPublicKeyHashCode();
        if (l != k) goto _L6; else goto _L7
_L7:
        flag = true;
_L9:
        return flag;
_L6:
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
        certificateexception;
        i++;
        break MISSING_BLOCK_LABEL_44;
    }

    protected abstract String getAppSwitchActivity();

    protected abstract String getCertificateIssuer();

    protected abstract String getCertificateSubject();

    protected Intent getLaunchIntent()
    {
        return (new Intent()).setComponent(new ComponentName(getPackage(), (new StringBuilder()).append(getPackage()).append(".").append(getAppSwitchActivity()).toString()));
    }

    protected abstract String getPackage();

    protected abstract int getPublicKeyHashCode();

    protected abstract String handleAppSwitchResponse(int i, Intent intent);

    protected boolean isAvailable()
    {
        List list = mContext.getPackageManager().queryIntentActivities(getLaunchIntent(), 0);
        return list.size() == 1 && getPackage().equals(((ResolveInfo)list.get(0)).activityInfo.packageName) && isSignatureValid();
    }

    protected void launch(Activity activity, int i)
    {
        if (isAvailable())
        {
            activity.startActivityForResult(getLaunchIntent(), i);
            return;
        } else
        {
            throw new AppSwitchNotAvailableException();
        }
    }

}
