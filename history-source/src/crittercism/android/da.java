// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.Context;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            cy, br, cz, au

public class da
    implements cy
{
    public static final class a
        implements cz
    {

        public final cy a(br br1, br br2, String s, Context context, au au)
        {
            return new da(br1, br2);
        }

        public a()
        {
        }
    }


    private br a;
    private br b;

    public da(br br1, br br2)
    {
        a = br1;
        b = br2;
    }

    public void a(boolean flag, int i, JSONObject jsonobject)
    {
        if (flag || i >= 200 && i < 300)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            a.a();
            return;
        } else
        {
            a.b(b);
            return;
        }
    }
}
