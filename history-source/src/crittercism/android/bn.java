// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

// Referenced classes of package crittercism.android:
//            br, bp

public final class bn
{

    public JSONArray a;

    public bn(br br1)
    {
        a = new JSONArray();
        br1 = br1.c().iterator();
        do
        {
            if (!br1.hasNext())
            {
                break;
            }
            Object obj = ((bp)br1.next()).a();
            if (obj != null)
            {
                a.put(obj);
            }
        } while (true);
    }
}
