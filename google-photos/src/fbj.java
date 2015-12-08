// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Build;

public final class fbj
{

    private static final fbe a = (new fbf()).a("htc", "htc one", Integer.valueOf(19)).a("samsung", "gt-i8200", Integer.valueOf(17)).a("samsung", "galaxy nexus", Integer.valueOf(0x7fffffff)).a();
    private static final fbe b = (new fbf()).a("lge", "nexus 5", Integer.valueOf(19)).a("asus", "nexus 7", Integer.valueOf(19)).a("samsung", "nexus 10", Integer.valueOf(19)).a("motorola", "xt1058", Integer.valueOf(19)).a("samsung", "sm-g900f", Integer.valueOf(19)).a("sony", "c6606", Integer.valueOf(16)).a("sony", "c6603", Integer.valueOf(16)).a("micromax", "4560mmx", Integer.valueOf(19)).a("micromax", "micromax aq4501", Integer.valueOf(19)).a("spice", "spice mi-498", Integer.valueOf(19)).a("karbonn", "sparkle v", Integer.valueOf(19)).a();

    public fbj()
    {
    }

    public static int a(int i, int j)
    {
        Object obj = Build.MANUFACTURER;
        String s = Build.MODEL;
        int k = android.os.Build.VERSION.SDK_INT;
        int l = Math.max(i, j);
        i = Math.min(i, j);
        if (l > 1920 || i > 1080)
        {
            return 1;
        }
        if (k >= 21)
        {
            return 2;
        }
        obj = (Integer)b.a(((String) (obj)), s);
        return obj == null || ((Integer) (obj)).intValue() > k ? 1 : 2;
    }

    public static boolean a()
    {
        Object obj = Build.MANUFACTURER;
        String s = Build.MODEL;
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 16)
        {
            obj = (Integer)a.a(((String) (obj)), s);
            if (obj == null || i > ((Integer) (obj)).intValue())
            {
                return true;
            }
        }
        return false;
    }

}
