// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;

public final class obg extends omp
    implements nzu
{

    Uri a;
    Uri b;
    private nzt c;
    private oac d;
    private obk e;

    public obg()
    {
        c = new nzt(this, af);
    }

    static obk a(obg obg1)
    {
        return obg1.e;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            b = (Uri)bundle.getParcelable("privacy_uri");
            a = (Uri)bundle.getParcelable("terms_uri");
        }
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        e = (obk)ae.b(obk);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putParcelable("privacy_uri", b);
        bundle.putParcelable("terms_uri", a);
    }

    public final void r()
    {
        Object obj1;
        Uri uri;
        Uri uri1;
        Object obj4;
        d = new oac(ad);
        uri = a;
        uri1 = b;
        obj4 = a(b.HU);
        obj1 = "?";
        String s = ad.getPackageManager().getPackageInfo(ad.getPackageName(), 0).versionName;
        obj1 = s;
_L2:
        c.a(d.a(((CharSequence) (obj4)), ((CharSequence) (obj1))));
        obj1 = a(b.HW);
        String s1 = a(b.HV);
        obj4 = new Intent(ad, com/google/android/libraries/social/licenses/LicenseMenuActivity);
        obj1 = c.a(d.a(((CharSequence) (obj1)), s1, ((Intent) (obj4))));
        ((nzw) (obj1)).d("about_license_pref_key");
        obj1.k = new obh(this);
        if (uri1 != null)
        {
            Object obj2 = a(b.HS);
            Intent intent = new Intent("android.intent.action.VIEW", uri1);
            intent.addFlags(0x80000);
            obj2 = c.a(d.a(((CharSequence) (obj2)), "", intent));
            ((nzw) (obj2)).d("about_privacy_pref_key");
            obj2.k = new obi(this);
        }
        if (uri != null)
        {
            Object obj3 = a(b.HT);
            Intent intent1 = new Intent("android.intent.action.VIEW", uri);
            intent1.addFlags(0x80000);
            obj3 = c.a(d.a(((CharSequence) (obj3)), "", intent1));
            ((nzw) (obj3)).d("about_terms_pref_key");
            obj3.k = new obj(this);
        }
        return;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        Log.w("AboutSettingsProvider", "Cannot find package for Build preference", namenotfoundexception);
        if (true) goto _L2; else goto _L1
_L1:
    }
}
