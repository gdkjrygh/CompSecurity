// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import com.snapchat.android.util.SnapMediaUtils;

static final class nit> extends aA
{

    protected final void a(boolean flag, Object obj)
    {
        obj = (Bitmap)obj;
        if (flag && !Fe.b() && obj != null)
        {
            Jy.a().a(((Bitmap) (obj)));
        }
    }

    protected final int c(Object obj)
    {
        return (int)Math.ceil((float)SnapMediaUtils.f((Bitmap)obj) / 1024F);
    }

    >(int i)
    {
        super(i);
    }
}
