// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;

// Referenced classes of package b.a:
//            a, ff

public final class he extends a
{

    private Context a;

    public he(Context context)
    {
        super("mac");
        a = context;
    }

    public final String g()
    {
        String s;
        try
        {
            s = ff.k(a);
        }
        catch (Exception exception)
        {
            return null;
        }
        return s;
    }
}
