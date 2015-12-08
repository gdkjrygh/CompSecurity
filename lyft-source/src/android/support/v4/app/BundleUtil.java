// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import java.util.Arrays;

class BundleUtil
{

    BundleUtil()
    {
    }

    public static Bundle[] getBundleArrayFromBundle(Bundle bundle, String s)
    {
        Object aobj[] = bundle.getParcelableArray(s);
        if ((aobj instanceof Bundle[]) || aobj == null)
        {
            return (Bundle[])(Bundle[])aobj;
        } else
        {
            aobj = (Bundle[])Arrays.copyOf(aobj, aobj.length, [Landroid/os/Bundle;);
            bundle.putParcelableArray(s, ((android.os.Parcelable []) (aobj)));
            return ((Bundle []) (aobj));
        }
    }
}
