// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.os.Build;

// Referenced classes of package b.a:
//            a

public final class hf extends a
{

    public hf()
    {
        super("serial");
    }

    public final String g()
    {
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            return Build.SERIAL;
        } else
        {
            return null;
        }
    }
}
