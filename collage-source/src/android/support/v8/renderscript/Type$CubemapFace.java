// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            Type

public static final class mID extends Enum
{

    private static final NEGATIVE_Z $VALUES[];
    public static final NEGATIVE_Z NEGATIVE_X;
    public static final NEGATIVE_Z NEGATIVE_Y;
    public static final NEGATIVE_Z NEGATIVE_Z;
    public static final NEGATIVE_Z POSITIVE_X;
    public static final NEGATIVE_Z POSITIVE_Y;
    public static final NEGATIVE_Z POSITIVE_Z;
    int mID;

    public static mID valueOf(String s)
    {
        return (mID)Enum.valueOf(android/support/v8/renderscript/Type$CubemapFace, s);
    }

    public static mID[] values()
    {
        return (mID[])$VALUES.clone();
    }

    static 
    {
        POSITIVE_X = new <init>("POSITIVE_X", 0, 0);
        NEGATIVE_X = new <init>("NEGATIVE_X", 1, 1);
        POSITIVE_Y = new <init>("POSITIVE_Y", 2, 2);
        NEGATIVE_Y = new <init>("NEGATIVE_Y", 3, 3);
        POSITIVE_Z = new <init>("POSITIVE_Z", 4, 4);
        NEGATIVE_Z = new <init>("NEGATIVE_Z", 5, 5);
        $VALUES = (new .VALUES[] {
            POSITIVE_X, NEGATIVE_X, POSITIVE_Y, NEGATIVE_Y, POSITIVE_Z, NEGATIVE_Z
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        mID = j;
    }
}
