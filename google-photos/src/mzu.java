// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class mzu extends mzm
{

    public final boolean a()
    {
        return false;
    }

    protected final boolean a(mzo mzo)
    {
        if (g())
        {
            return true;
        } else
        {
            Log.w("RawTexture", "lost the content due to context change");
            return false;
        }
    }

    protected final int f()
    {
        return 3553;
    }

    public final boolean j()
    {
        return false;
    }
}
