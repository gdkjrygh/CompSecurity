// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            aq, h

public static final class 
{

    public static aq a(h h1, String s, String s1)
    {
        Object obj = null;
        h1 = h1.a(s, s1, null);
        if (h1 != null)
        {
            try
            {
                h1 = new JSONObject(h1);
            }
            // Misplaced declaration of an exception variable
            catch (h h1)
            {
                h1 = obj;
            }
        } else
        {
            h1 = null;
        }
        if (h1 == null)
        {
            return new aq((byte)0);
        } else
        {
            return new aq(h1, (byte)0);
        }
    }
}
