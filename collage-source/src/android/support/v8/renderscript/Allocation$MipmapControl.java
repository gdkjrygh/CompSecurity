// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            Allocation

public static final class mID extends Enum
{

    private static final MIPMAP_ON_SYNC_TO_TEXTURE $VALUES[];
    public static final MIPMAP_ON_SYNC_TO_TEXTURE MIPMAP_FULL;
    public static final MIPMAP_ON_SYNC_TO_TEXTURE MIPMAP_NONE;
    public static final MIPMAP_ON_SYNC_TO_TEXTURE MIPMAP_ON_SYNC_TO_TEXTURE;
    int mID;

    public static mID valueOf(String s)
    {
        return (mID)Enum.valueOf(android/support/v8/renderscript/Allocation$MipmapControl, s);
    }

    public static mID[] values()
    {
        return (mID[])$VALUES.clone();
    }

    static 
    {
        MIPMAP_NONE = new <init>("MIPMAP_NONE", 0, 0);
        MIPMAP_FULL = new <init>("MIPMAP_FULL", 1, 1);
        MIPMAP_ON_SYNC_TO_TEXTURE = new <init>("MIPMAP_ON_SYNC_TO_TEXTURE", 2, 2);
        $VALUES = (new .VALUES[] {
            MIPMAP_NONE, MIPMAP_FULL, MIPMAP_ON_SYNC_TO_TEXTURE
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        mID = j;
    }
}
