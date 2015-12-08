// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzv

public final class zzu
{
    public static final class zza
    {

        private final Object zzCG;
        private final List zzTZ;

        public String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder(100)).append(zzCG.getClass().getSimpleName()).append('{');
            int j = zzTZ.size();
            for (int i = 0; i < j; i++)
            {
                stringbuilder.append((String)zzTZ.get(i));
                if (i < j - 1)
                {
                    stringbuilder.append(", ");
                }
            }

            return stringbuilder.append('}').toString();
        }

        public zza zzg(String s, Object obj)
        {
            zzTZ.add((new StringBuilder()).append((String)zzv.zzr(s)).append("=").append(String.valueOf(obj)).toString());
            return this;
        }

        private zza(Object obj)
        {
            zzCG = zzv.zzr(obj);
            zzTZ = new ArrayList();
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

    public static zza zzq(Object obj)
    {
        return new zza(obj);
    }
}
