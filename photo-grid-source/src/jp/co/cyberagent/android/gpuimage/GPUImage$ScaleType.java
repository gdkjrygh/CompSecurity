// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package jp.co.cyberagent.android.gpuimage;


public final class  extends Enum
{

    private static final CENTER_CROP $VALUES[];
    public static final CENTER_CROP CENTER_CROP;
    public static final CENTER_CROP CENTER_INSIDE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(jp/co/cyberagent/android/gpuimage/GPUImage$ScaleType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CENTER_INSIDE = new <init>("CENTER_INSIDE", 0);
        CENTER_CROP = new <init>("CENTER_CROP", 1);
        $VALUES = (new .VALUES[] {
            CENTER_INSIDE, CENTER_CROP
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
