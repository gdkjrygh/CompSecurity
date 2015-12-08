// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import android.os.Looper;

public class ovc
{

    ovc()
    {
    }

    public SurfaceTexture a(int i)
    {
        boolean flag;
        if (Looper.myLooper() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        return new SurfaceTexture(i);
    }
}
