// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.soundcloud.android.creators.record:
//            CreateWaveDisplay, SoundRecorder, TrimHandleView, CreateWaveView

private static final class <init> extends Handler
{

    private final WeakReference viewRef;

    public final void handleMessage(Message message)
    {
        CreateWaveDisplay createwavedisplay;
        int i;
        boolean flag1;
        flag1 = true;
        i = 0;
        createwavedisplay = (CreateWaveDisplay)viewRef.get();
        if (createwavedisplay != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            message = SoundRecorder.getInstance(createwavedisplay.getContext()).getTrimWindow();
            if (CreateWaveDisplay.access$100(createwavedisplay))
            {
                i = (int)(message[0] * (float)CreateWaveDisplay.access$200(createwavedisplay));
            }
            float f;
            int j;
            if (CreateWaveDisplay.access$100(createwavedisplay))
            {
                j = (int)(message[1] * (float)CreateWaveDisplay.access$200(createwavedisplay));
            } else
            {
                j = CreateWaveDisplay.access$200(createwavedisplay);
            }
            f = (float)(Math.min(Math.max(i, CreateWaveDisplay.access$300(createwavedisplay)), j) - (long)i) / (float)(j - i);
            if (CreateWaveDisplay.access$400(createwavedisplay) != null)
            {
                CreateWaveDisplay.access$400(createwavedisplay).ek(f);
                return;
            }
            break;

        case 2: // '\002'
            CreateWaveDisplay.access$502(createwavedisplay, System.currentTimeMillis());
            if (CreateWaveDisplay.access$600(createwavedisplay) != null && CreateWaveDisplay.access$600(createwavedisplay).sMovedFrom(CreateWaveDisplay.access$700(createwavedisplay)))
            {
                CreateWaveDisplay.access$800(createwavedisplay).update(CreateWaveDisplay.access$600(createwavedisplay).sition);
                if (CreateWaveDisplay.access$400(createwavedisplay) != null)
                {
                    CreateWaveDisplay.access$400(createwavedisplay).justTrimLeft(Math.max(0.0F, (float)CreateWaveDisplay.access$600(createwavedisplay).sition / (float)CreateWaveDisplay.access$200(createwavedisplay)), CreateWaveDisplay.access$600(createwavedisplay).mestamp - CreateWaveDisplay.access$700(createwavedisplay).mestamp);
                }
                CreateWaveDisplay.access$900(createwavedisplay).invalidate();
            }
            CreateWaveDisplay.access$702(createwavedisplay, CreateWaveDisplay.access$600(createwavedisplay));
            if (CreateWaveDisplay.access$1000(createwavedisplay) != null && CreateWaveDisplay.access$1000(createwavedisplay).sMovedFrom(CreateWaveDisplay.access$1100(createwavedisplay)))
            {
                CreateWaveDisplay.access$1200(createwavedisplay).update(CreateWaveDisplay.access$200(createwavedisplay) - CreateWaveDisplay.access$1000(createwavedisplay).sition);
                if (CreateWaveDisplay.access$400(createwavedisplay) != null)
                {
                    CreateWaveDisplay.access$400(createwavedisplay).justTrimRight(Math.min(1.0F, (float)CreateWaveDisplay.access$1000(createwavedisplay).sition / (float)CreateWaveDisplay.access$200(createwavedisplay)), CreateWaveDisplay.access$1000(createwavedisplay).mestamp - CreateWaveDisplay.access$1100(createwavedisplay).mestamp);
                }
                CreateWaveDisplay.access$900(createwavedisplay).invalidate();
            }
            CreateWaveDisplay.access$1102(createwavedisplay, CreateWaveDisplay.access$1000(createwavedisplay));
            return;

        case 3: // '\003'
            CreateWaveDisplay.access$502(createwavedisplay, System.currentTimeMillis());
            CreateWaveDisplay.access$702(createwavedisplay, CreateWaveDisplay.access$600(createwavedisplay));
            CreateWaveDisplay.access$1102(createwavedisplay, CreateWaveDisplay.access$1000(createwavedisplay));
            message = CreateWaveDisplay.access$1200(createwavedisplay);
            boolean flag;
            if (CreateWaveDisplay.access$1300(createwavedisplay) != -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            message.setPressed(flag);
            message = CreateWaveDisplay.access$800(createwavedisplay);
            if (CreateWaveDisplay.access$1400(createwavedisplay) != -1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            message.setPressed(flag);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private (CreateWaveDisplay createwavedisplay)
    {
        viewRef = new WeakReference(createwavedisplay);
    }

    viewRef(CreateWaveDisplay createwavedisplay, viewRef viewref)
    {
        this(createwavedisplay);
    }
}
