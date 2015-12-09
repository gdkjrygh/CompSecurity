// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            RenderScript

public static final class mID extends Enum
{

    private static final PROFILE $VALUES[];
    public static final PROFILE DEBUG;
    public static final PROFILE NORMAL;
    public static final PROFILE PROFILE;
    int mID;

    public static mID valueOf(String s)
    {
        return (mID)Enum.valueOf(android/support/v8/renderscript/RenderScript$ContextType, s);
    }

    public static mID[] values()
    {
        return (mID[])$VALUES.clone();
    }

    static 
    {
        NORMAL = new <init>("NORMAL", 0, 0);
        DEBUG = new <init>("DEBUG", 1, 1);
        PROFILE = new <init>("PROFILE", 2, 2);
        $VALUES = (new .VALUES[] {
            NORMAL, DEBUG, PROFILE
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        mID = j;
    }
}
