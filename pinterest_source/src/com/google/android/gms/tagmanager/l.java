// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            da, bb, k

class l
{

    final a aqk = new _cls1();

    public l()
    {
    }

    public k a(int i, a a1)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (pg() < 12)
        {
            return new da(i, a1);
        } else
        {
            return new bb(i, a1);
        }
    }

    int pg()
    {
        return android.os.Build.VERSION.SDK_INT;
    }

    private class _cls1
        implements a
    {

        final l aql;

        public int sizeOf(Object obj, Object obj1)
        {
            return 1;
        }

        _cls1()
        {
            aql = l.this;
            super();
        }
    }

}
