// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import IG;
import PB;

// Referenced classes of package com.snapchat.android.util:
//            ScrollState

public final class StoriesPageStateManager
{
    public static final class PtrStatus extends Enum
    {

        private static final PtrStatus $VALUES[];
        public static final PtrStatus COMPLETE;
        public static final PtrStatus INIT;
        public static final PtrStatus LOADING;
        public static final PtrStatus PREPARE;

        public static PtrStatus fromValue(int i)
        {
            switch (i)
            {
            default:
                return INIT;

            case 1: // '\001'
                return INIT;

            case 2: // '\002'
                return PREPARE;

            case 3: // '\003'
                return LOADING;

            case 4: // '\004'
                return COMPLETE;
            }
        }

        public static PtrStatus valueOf(String s)
        {
            return (PtrStatus)Enum.valueOf(com/snapchat/android/util/StoriesPageStateManager$PtrStatus, s);
        }

        public static PtrStatus[] values()
        {
            return (PtrStatus[])$VALUES.clone();
        }

        static 
        {
            INIT = new PtrStatus("INIT", 0);
            PREPARE = new PtrStatus("PREPARE", 1);
            LOADING = new PtrStatus("LOADING", 2);
            COMPLETE = new PtrStatus("COMPLETE", 3);
            $VALUES = (new PtrStatus[] {
                INIT, PREPARE, LOADING, COMPLETE
            });
        }

        private PtrStatus(String s, int i)
        {
            super(s, i);
        }
    }


    private static final StoriesPageStateManager INSTANCE = new StoriesPageStateManager();
    public static final byte PTR_STATUS_COMPLETE = 4;
    public static final byte PTR_STATUS_INIT = 1;
    public static final byte PTR_STATUS_LOADING = 3;
    public static final byte PTR_STATUS_PREPARE = 2;
    private final PB mClock;
    public final IG mLastPtrPeriod;
    public PtrStatus mLastPtrStatus;
    public final IG mLastScrollPeriod;
    public ScrollState mLastScrollState;

    private StoriesPageStateManager()
    {
        this(new PB());
    }

    private StoriesPageStateManager(PB pb)
    {
        mLastPtrPeriod = new IG();
        mLastScrollPeriod = new IG();
        mLastPtrStatus = PtrStatus.INIT;
        mLastScrollState = ScrollState.UNKNOWN;
        mClock = pb;
    }

    public static StoriesPageStateManager a()
    {
        return INSTANCE;
    }


    // Unreferenced inner class com/snapchat/android/util/StoriesPageStateManager$1

/* anonymous class */
    public static final class _cls1
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
            $SwitchMap$com$snapchat$android$util$StoriesPageStateManager$PtrStatus = new int[PtrStatus.values().length];
            try
            {
                $SwitchMap$com$snapchat$android$util$StoriesPageStateManager$PtrStatus[PtrStatus.INIT.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
