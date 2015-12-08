// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzx

public final class zzw
{
    public static final class zza
    {

        private final List zzQr;
        private final Object zzzF;

        public final String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder(100)).append(zzzF.getClass().getSimpleName()).append('{');
            int j = zzQr.size();
            for (int i = 0; i < j; i++)
            {
                stringbuilder.append((String)zzQr.get(i));
                if (i < j - 1)
                {
                    stringbuilder.append(", ");
                }
            }

            return stringbuilder.append('}').toString();
        }

        public final zza zza(String s, Object obj)
        {
            zzQr.add((new StringBuilder()).append((String)zzx.zzl(s)).append("=").append(String.valueOf(obj)).toString());
            return this;
        }

        private zza(Object obj)
        {
            zzzF = zzx.zzl(obj);
            zzQr = new ArrayList();
        }

    }


    public static boolean equal(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static transient int hashCode(Object aobj[])
    {
        return Arrays.hashCode(aobj);
    }

    public static zza zzk(Object obj)
    {
        return new zza(obj);
    }
}
