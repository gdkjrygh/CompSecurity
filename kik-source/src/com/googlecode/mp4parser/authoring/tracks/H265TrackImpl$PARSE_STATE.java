// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;


// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            H265TrackImpl

public static final class I extends Enum
{

    public static final SLICE_OES_EOB AUD_SEI_SLICE;
    private static final SLICE_OES_EOB ENUM$VALUES[];
    public static final SLICE_OES_EOB SEI_SLICE;
    public static final SLICE_OES_EOB SLICE_OES_EOB;

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/googlecode/mp4parser/authoring/tracks/H265TrackImpl$PARSE_STATE, s);
    }

    public static I[] values()
    {
        I ai[] = ENUM$VALUES;
        int i = ai.length;
        I ai1[] = new ENUM.VALUES[i];
        System.arraycopy(ai, 0, ai1, 0, i);
        return ai1;
    }

    static 
    {
        AUD_SEI_SLICE = new <init>("AUD_SEI_SLICE", 0);
        SEI_SLICE = new <init>("SEI_SLICE", 1);
        SLICE_OES_EOB = new <init>("SLICE_OES_EOB", 2);
        ENUM$VALUES = (new ENUM.VALUES[] {
            AUD_SEI_SLICE, SEI_SLICE, SLICE_OES_EOB
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
