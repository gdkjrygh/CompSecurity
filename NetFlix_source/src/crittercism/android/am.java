// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package crittercism.android:
//            ak

public final class am
{

    private static Map a;

    public static ak a(String s)
    {
        if (s != null && a.containsKey(s))
        {
            return (ak)a.get(s);
        } else
        {
            return null;
        }
    }

    static 
    {
        HashMap hashmap = new HashMap();
        a = hashmap;
        hashmap.put("com.amazon.venezia", new al.a.a());
        a.put("com.android.vending", new al.b.a());
    }
}
