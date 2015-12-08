// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.File;
import java.io.IOException;

public final class awt
    implements ank
{

    public awt()
    {
    }

    private static boolean a(aqa aqa1, File file)
    {
        aqa1 = (awr)aqa1.b();
        try
        {
            azx.a(aqa1.a(), file);
        }
        // Misplaced declaration of an exception variable
        catch (aqa aqa1)
        {
            if (Log.isLoggable("GifEncoder", 5))
            {
                Log.w("GifEncoder", "Failed to encode gif drawable data", aqa1);
            }
            return false;
        }
        return true;
    }

    public final anb a(ani ani)
    {
        return anb.a;
    }

    public final volatile boolean a(Object obj, File file, ani ani)
    {
        return a((aqa)obj, file);
    }
}
