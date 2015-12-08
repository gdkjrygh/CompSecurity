// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.content.Context;
import com.amazon.device.messaging.development.ADMManifest;
import com.appboy.f;
import com.appboy.f.a;

// Referenced classes of package a.a:
//            bd

public class ap
{

    public static final String c;
    public final Context a;
    public final bd b;

    public ap(Context context, bd bd)
    {
        a = context;
        b = bd;
    }

    private static boolean a()
    {
        try
        {
            Class.forName("com.amazon.device.messaging.ADM");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            com.appboy.f.a.b(c, "com.amazon.device.messaging.ADM not found");
            return false;
        }
        return true;
    }

    public static boolean a(Context context)
    {
        return a() && b(context);
    }

    private static boolean b(Context context)
    {
        try
        {
            ADMManifest.checkManifestAuthoredProperly(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.appboy.f.a.b(c, "Manifest not authored properly to support ADM.");
            context.printStackTrace();
            return false;
        }
        return true;
    }

    static 
    {
        c = String.format("%s.%s", new Object[] {
            f.a, a/a/ap.getName()
        });
    }
}
