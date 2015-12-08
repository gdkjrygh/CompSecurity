// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageManager;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public final class dkc extends dkb
{

    private final Context a;
    private final boolean b = b();

    dkc(Context context)
    {
        a = context;
    }

    private boolean b()
    {
        PackageManager packagemanager = a.getPackageManager();
        try
        {
            packagemanager.getPackageInfo("com.spotify.arsenal.verifier", 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return false;
        }
        return true;
    }

    public final boolean a()
    {
        if (!b) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        String as[] = a.getPackageManager().getSystemSharedLibraryNames();
        int j = as.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                if ("com.sony.device".equals(as[i]))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }

    public final boolean a(Flags flags)
    {
        return b || ((Boolean)flags.a(fys.C)).booleanValue();
    }
}
