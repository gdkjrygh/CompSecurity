// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

final class aqi
    implements aqx
{

    private final aqk a = new aqk();
    private final aqq b = new aqq();

    aqi()
    {
    }

    static String c(int i, int j, android.graphics.Bitmap.Config config)
    {
        config = String.valueOf(config);
        return (new StringBuilder(String.valueOf(config).length() + 27)).append("[").append(i).append("x").append(j).append("], ").append(config).toString();
    }

    public final Bitmap a()
    {
        return (Bitmap)b.a();
    }

    public final Bitmap a(int i, int j, android.graphics.Bitmap.Config config)
    {
        config = a.a(i, j, config);
        return (Bitmap)b.a(config);
    }

    public final void a(Bitmap bitmap)
    {
        aqj aqj = a.a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        b.a(aqj, bitmap);
    }

    public final String b(int i, int j, android.graphics.Bitmap.Config config)
    {
        return c(i, j, config);
    }

    public final String b(Bitmap bitmap)
    {
        return c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    public final int c(Bitmap bitmap)
    {
        return bag.a(bitmap);
    }

    public final String toString()
    {
        String s = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 21)).append("AttributeStrategy:\n  ").append(s).toString();
    }
}
