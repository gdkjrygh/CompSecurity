// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

final class cpo
    implements cpq
{

    private Context a;

    private cpo(Context context)
    {
        a = context;
    }

    cpo(Context context, byte byte0)
    {
        this(context);
    }

    public final Drawable a(int i)
    {
        Object obj;
        Resources resources;
        try
        {
            resources = a.createPackageContext("com.google.android.gms", 4).getResources();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        switch (i)
        {
        case 2: // '\002'
            obj = "ic_plusone_tall";
            break;

        default:
            obj = "ic_plusone_standard";
            break;

        case 0: // '\0'
            obj = "ic_plusone_small";
            break;

        case 1: // '\001'
            obj = "ic_plusone_medium";
            break;
        }
          goto _L1
_L3:
        return resources.getDrawable(resources.getIdentifier(((String) (obj)), "drawable", "com.google.android.gms"));
_L1:
        if (true) goto _L3; else goto _L2
_L2:
    }

    public final boolean a()
    {
        try
        {
            a.createPackageContext("com.google.android.gms", 4).getResources();
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return false;
        }
        return true;
    }
}
