// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;

// Referenced classes of package b.a:
//            a

public final class ca extends a
{

    private Context a;

    public ca(Context context)
    {
        super("android_id");
        a = context;
    }

    public final String g()
    {
        String s;
        try
        {
            s = android.provider.Settings.Secure.getString(a.getContentResolver(), "android_id");
        }
        catch (Exception exception)
        {
            return null;
        }
        return s;
    }
}
