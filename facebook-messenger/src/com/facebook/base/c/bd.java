// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import android.os.Handler;
import android.os.Looper;
import com.facebook.inject.d;

// Referenced classes of package com.facebook.base.c:
//            b

class bd extends d
{

    private bd()
    {
    }

    bd(b b1)
    {
        this();
    }

    public Handler a()
    {
        return new Handler(Looper.getMainLooper());
    }

    public Object b()
    {
        return a();
    }
}
