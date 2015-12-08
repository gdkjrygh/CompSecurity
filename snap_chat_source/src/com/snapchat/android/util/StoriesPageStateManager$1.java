// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;


// Referenced classes of package com.snapchat.android.util:
//            StoriesPageStateManager, ScrollState

public static final class rStatus
{

    public static final int $SwitchMap$com$snapchat$android$util$ScrollState[];
    public static final int $SwitchMap$com$snapchat$android$util$StoriesPageStateManager$PtrStatus[];

    static 
    {
        $SwitchMap$com$snapchat$android$util$ScrollState = new int[ScrollState.values().length];
        try
        {
            $SwitchMap$com$snapchat$android$util$ScrollState[ScrollState.IDLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$snapchat$android$util$ScrollState[ScrollState.DRAGGING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$snapchat$android$util$ScrollState[ScrollState.SETTLING.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        $SwitchMap$com$snapchat$android$util$StoriesPageStateManager$PtrStatus = new int[rStatus.values().length];
        try
        {
            $SwitchMap$com$snapchat$android$util$StoriesPageStateManager$PtrStatus[rStatus.INIT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
