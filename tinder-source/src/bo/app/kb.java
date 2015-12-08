// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            in, ji, kg

public final class kb
{

    final String a;
    final String b;
    final ji c;
    final int d;
    final int e;
    final kg f;
    final Object g;
    final boolean h;
    final android.graphics.BitmapFactory.Options i = new android.graphics.BitmapFactory.Options();

    public kb(String s, String s1, ji ji, int j, kg kg, in in1)
    {
        a = s;
        b = s1;
        c = ji;
        d = in1.j;
        e = j;
        f = kg;
        g = in1.n;
        h = in1.m;
        s = in1.k;
        s1 = i;
        s1.inDensity = ((android.graphics.BitmapFactory.Options) (s)).inDensity;
        s1.inDither = ((android.graphics.BitmapFactory.Options) (s)).inDither;
        s1.inInputShareable = ((android.graphics.BitmapFactory.Options) (s)).inInputShareable;
        s1.inJustDecodeBounds = ((android.graphics.BitmapFactory.Options) (s)).inJustDecodeBounds;
        s1.inPreferredConfig = ((android.graphics.BitmapFactory.Options) (s)).inPreferredConfig;
        s1.inPurgeable = ((android.graphics.BitmapFactory.Options) (s)).inPurgeable;
        s1.inSampleSize = ((android.graphics.BitmapFactory.Options) (s)).inSampleSize;
        s1.inScaled = ((android.graphics.BitmapFactory.Options) (s)).inScaled;
        s1.inScreenDensity = ((android.graphics.BitmapFactory.Options) (s)).inScreenDensity;
        s1.inTargetDensity = ((android.graphics.BitmapFactory.Options) (s)).inTargetDensity;
        s1.inTempStorage = ((android.graphics.BitmapFactory.Options) (s)).inTempStorage;
        if (android.os.Build.VERSION.SDK_INT >= 10)
        {
            s1.inPreferQualityOverSpeed = ((android.graphics.BitmapFactory.Options) (s)).inPreferQualityOverSpeed;
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            s1.inBitmap = ((android.graphics.BitmapFactory.Options) (s)).inBitmap;
            s1.inMutable = ((android.graphics.BitmapFactory.Options) (s)).inMutable;
        }
    }
}
