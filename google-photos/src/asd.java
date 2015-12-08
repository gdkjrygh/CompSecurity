// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.AssetManager;
import android.net.Uri;
import java.util.List;

public final class asd
    implements atm
{

    private static final int a = 22;
    private final AssetManager b;
    private final ase c;

    public asd(AssetManager assetmanager, ase ase1)
    {
        b = assetmanager;
        c = ase1;
    }

    public final atn a(Object obj, int i, int j, ani ani)
    {
        obj = (Uri)obj;
        ani = ((Uri) (obj)).toString().substring(a);
        return new atn(new azw(obj), c.a(b, ani));
    }

    public final boolean a(Object obj)
    {
        boolean flag1 = false;
        obj = (Uri)obj;
        boolean flag = flag1;
        if ("file".equals(((Uri) (obj)).getScheme()))
        {
            flag = flag1;
            if (!((Uri) (obj)).getPathSegments().isEmpty())
            {
                flag = flag1;
                if ("android_asset".equals(((Uri) (obj)).getPathSegments().get(0)))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

}
