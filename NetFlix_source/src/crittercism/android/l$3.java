// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            l, i

public final class a
    implements Runnable
{

    final JSONObject a;
    final l b;

    public final void run()
    {
        try
        {
            b.c.b(a);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public (l l1, JSONObject jsonobject)
    {
        b = l1;
        a = jsonobject;
        super();
    }
}
