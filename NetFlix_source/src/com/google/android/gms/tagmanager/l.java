// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            cz, bb, k

class l
{
    public static interface a
    {

        public abstract int sizeOf(Object obj, Object obj1);
    }


    final a WH = new a() {

        final l WI;

        public int sizeOf(Object obj, Object obj1)
        {
            return 1;
        }

            
            {
                WI = l.this;
                super();
            }
    };

    public l()
    {
    }

    public k a(int i, a a1)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (jZ() < 12)
        {
            return new cz(i, a1);
        } else
        {
            return new bb(i, a1);
        }
    }

    int jZ()
    {
        return android.os.Build.VERSION.SDK_INT;
    }
}
