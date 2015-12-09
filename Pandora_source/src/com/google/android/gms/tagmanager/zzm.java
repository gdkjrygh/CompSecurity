// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            br, aa, cj

class zzm
{
    public static interface zza
    {

        public abstract int sizeOf(Object obj, Object obj1);
    }


    final zza a = new zza() {

        final zzm a;

        public int sizeOf(Object obj, Object obj1)
        {
            return 1;
        }

            
            {
                a = zzm.this;
                super();
            }
    };

    public zzm()
    {
    }

    int a()
    {
        return android.os.Build.VERSION.SDK_INT;
    }

    public cj a(int i, zza zza1)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (a() < 12)
        {
            return new br(i, zza1);
        } else
        {
            return new aa(i, zza1);
        }
    }
}
