// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.ui.snapeditormotion.SwipeHandlerType;

public final class GU
{

    static GU a;
    public final GP b = new GV();
    public final GP c = new GR();
    public final GP d = new GS();
    public final GP e = new GQ();

    GU()
    {
    }

    // Unreferenced inner class GU$1

/* anonymous class */
    public static final class _cls1
    {

        public static final int a[];

        static 
        {
            a = new int[SwipeHandlerType.values().length];
            try
            {
                a[SwipeHandlerType.NO_SWIPE_STARTED.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[SwipeHandlerType.SWIPE_STARTED.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[SwipeHandlerType.SINGLE_SWIPE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[SwipeHandlerType.DOUBLE_SWIPE.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
