// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            bu, bv

public final class bt
    implements bu
{

    private Map a;

    public bt()
    {
        a = new HashMap();
    }

    public final bt a(bv bv1)
    {
        if (bv1.b() != null)
        {
            a.put(bv1.a(), bv1.b());
        }
        return this;
    }

    public final JSONObject a()
    {
        return new JSONObject(a);
    }

    public final Object b()
    {
        return a();
    }
}
