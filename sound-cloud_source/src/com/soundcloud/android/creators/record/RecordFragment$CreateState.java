// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;


// Referenced classes of package com.soundcloud.android.creators.record:
//            RecordFragment

public static final class titleId extends Enum
{

    private static final EDIT_PLAYBACK $VALUES[];
    public static final EDIT_PLAYBACK EDIT;
    public static final EDIT_PLAYBACK EDIT_PLAYBACK;
    public static final EDIT_PLAYBACK IDLE_PLAYBACK;
    public static final EDIT_PLAYBACK IDLE_RECORD;
    public static final EDIT_PLAYBACK PLAYBACK;
    public static final EDIT_PLAYBACK RECORD;
    private final int titleId;

    public static titleId valueOf(String s)
    {
        return (titleId)Enum.valueOf(com/soundcloud/android/creators/record/RecordFragment$CreateState, s);
    }

    public static titleId[] values()
    {
        return (titleId[])$VALUES.clone();
    }

    public final int getTitleId()
    {
        return titleId;
    }

    public final boolean isEdit()
    {
        return this == EDIT || this == EDIT_PLAYBACK;
    }

    public final boolean isPlayState()
    {
        return this == PLAYBACK || this == EDIT_PLAYBACK;
    }

    static 
    {
        IDLE_RECORD = new <init>("IDLE_RECORD", 0, 0x7f0701b0);
        RECORD = new <init>("RECORD", 1, 0x7f0701b2);
        IDLE_PLAYBACK = new <init>("IDLE_PLAYBACK", 2, 0x7f0701af);
        PLAYBACK = new <init>("PLAYBACK", 3, 0x7f0701b1);
        EDIT = new <init>("EDIT", 4, 0x7f0701ae);
        EDIT_PLAYBACK = new <init>("EDIT_PLAYBACK", 5, 0x7f0701ae);
        $VALUES = (new .VALUES[] {
            IDLE_RECORD, RECORD, IDLE_PLAYBACK, PLAYBACK, EDIT, EDIT_PLAYBACK
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        titleId = j;
    }
}
