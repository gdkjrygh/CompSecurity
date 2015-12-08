// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import android.content.Context;
import com.cmcm.adsdk.b.c.b;
import java.lang.reflect.Constructor;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            s, y, w

public final class x
{

    public static w a(String s1, Context context, String s2, String s3)
    {
        if (s1.equalsIgnoreCase("fb"))
        {
            com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "create FBNativeAdLoader");
            return new s(context, s2, s3);
        }
        if (!s1.equalsIgnoreCase("cm")) goto _L2; else goto _L1
_L1:
        com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "create PicksNativeAdLoader");
        s1 = new y(context, s2);
        return s1;
_L4:
        return null;
_L2:
        try
        {
            if (s1.equalsIgnoreCase("mp"))
            {
                com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "create MopubNativeAdLoader");
                return b("com.cmcm.adsdk.nativead.MopubNativeAdLoader", context, s2, s3);
            }
            if (s1.equalsIgnoreCase("ab"))
            {
                com.cmcm.adsdk.b.c.b.a("CMCMADSDK", "create AdmobNativeLoader");
                return b("com.cmcm.adsdk.nativead.AdmobNativeLoader", context, s2, s3);
            }
            com.cmcm.adsdk.b.c.b.b("CMCMADSDK", (new StringBuilder("unmatched adtype:")).append(s1).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.cmcm.adsdk.b.c.b.b("CMCMADSDK", s1.toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static w b(String s1, Context context, String s2, String s3)
    {
        try
        {
            s1 = (w)Class.forName(s1).getConstructor(new Class[] {
                android/content/Context, java/lang/String, java/lang/String
            }).newInstance(new Object[] {
                context, s2, s3
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.cmcm.adsdk.b.c.b.b("CMCMADSDK", s1.toString());
            return null;
        }
        return s1;
    }
}
