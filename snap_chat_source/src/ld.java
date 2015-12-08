// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.model.chat.Chat;
import com.snapchat.android.model.chat.ChatMedia;

public final class ld
{

    private static final String TAG = "ChatEventAnalytics";
    private static final ld sInstance = new ld(BlizzardEventLogger.a());
    public final BlizzardEventLogger mBlizzardEventLogger;

    private ld(BlizzardEventLogger blizzardeventlogger)
    {
        mBlizzardEventLogger = blizzardeventlogger;
    }

    private static hi a(BD bd)
    {
        boolean flag = true;
        hi hi1 = new hi();
        hi1.publisherId = bd.mPublisherName;
        hi1.editionId = bd.mEditionId;
        hi1.dsnapId = bd.mDSnapId;
        hi1.mediaType = b(bd);
        if (bd.mCaption != -1)
        {
            hi1.caption = Long.valueOf(bd.mCaption);
        }
        if (bd.mDrawing != 1)
        {
            flag = false;
        }
        hi1.drawing = Boolean.valueOf(flag);
        if (bd.mFilterVisual != null)
        {
            try
            {
                hi1.filterVisual = hw.valueOf(bd.mFilterVisual);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                Timber.e("ChatEventAnalytics", (new StringBuilder("Invalid filter visual type ")).append(bd.mFilterVisual).toString(), new Object[0]);
            }
        }
        if (bd.mFilterInfo != null)
        {
            try
            {
                hi1.filterInfo = hs.valueOf(bd.mFilterInfo);
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                Timber.e("ChatEventAnalytics", (new StringBuilder("Invalid filter info type ")).append(bd.mFilterInfo).toString(), new Object[0]);
                return hi1;
            }
        }
        return hi1;
    }

    private static Long a(TU tu)
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$snapchat$android$model$chat$ChatMedia$MediaType[];
            static final int $SwitchMap$com$snapchat$soju$android$discover$LinkStatus[];

            static 
            {
                $SwitchMap$com$snapchat$soju$android$discover$LinkStatus = new int[TU.values().length];
                try
                {
                    $SwitchMap$com$snapchat$soju$android$discover$LinkStatus[TU.LINKABLE_LIVE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$snapchat$soju$android$discover$LinkStatus[TU.LINKABLE_ARCHIVED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$snapchat$soju$android$discover$LinkStatus[TU.NOT_LINKABLE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                $SwitchMap$com$snapchat$android$model$chat$ChatMedia$MediaType = new int[com.snapchat.android.model.chat.ChatMedia.MediaType.values().length];
                try
                {
                    $SwitchMap$com$snapchat$android$model$chat$ChatMedia$MediaType[com.snapchat.android.model.chat.ChatMedia.MediaType.IMAGE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$chat$ChatMedia$MediaType[com.snapchat.android.model.chat.ChatMedia.MediaType.VIDEO.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$android$model$chat$ChatMedia$MediaType[com.snapchat.android.model.chat.ChatMedia.MediaType.VIDEO_NO_SOUND.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.snapchat.soju.android.discover.LinkStatus[tu.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return Long.valueOf(1L);

        case 2: // '\002'
        case 3: // '\003'
            return Long.valueOf(0L);
        }
    }

    public static ld a()
    {
        return sInstance;
    }

    private static gO b(BD bd)
    {
        boolean flag = true;
        gO go = new gO();
        go.publisherId = bd.mPublisherName;
        go.editionId = bd.mEditionId;
        go.adsnapId = bd.mAdId;
        go.mediaType = b(((Chat) (bd)));
        if (bd.mCaption != -1)
        {
            go.caption = Long.valueOf(bd.mCaption);
        }
        if (bd.mDrawing != 1)
        {
            flag = false;
        }
        go.drawing = Boolean.valueOf(flag);
        if (bd.mFilterVisual != null)
        {
            try
            {
                go.filterVisual = hw.valueOf(bd.mFilterVisual);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                Timber.e("ChatEventAnalytics", (new StringBuilder("Invalid filter visual type ")).append(bd.mFilterVisual).toString(), new Object[0]);
            }
        }
        if (bd.mFilterInfo != null)
        {
            try
            {
                go.filterInfo = hs.valueOf(bd.mFilterInfo);
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                Timber.e("ChatEventAnalytics", (new StringBuilder("Invalid filter info type ")).append(bd.mFilterInfo).toString(), new Object[0]);
                return go;
            }
        }
        return go;
    }

    public static hJ b(Chat chat)
    {
        if (chat instanceof BG)
        {
            return hJ.TEXT;
        }
        if (!(chat instanceof ChatMedia)) goto _L2; else goto _L1
_L1:
        chat = ((ChatMedia)chat).G();
        _cls1..SwitchMap.com.snapchat.android.model.chat.ChatMedia.MediaType[chat.ordinal()];
        JVM INSTR tableswitch 1 3: default 60
    //                   1 62
    //                   2 66
    //                   3 70;
           goto _L2 _L3 _L4 _L5
_L2:
        return null;
_L3:
        return hJ.IMAGE;
_L4:
        return hJ.VIDEO;
_L5:
        return hJ.VIDEO_NO_SOUND;
    }

    public final void a(BD bd, boolean flag, Double double1, TU tu, Double double2)
    {
        hi hi1;
        hi1 = a(bd);
        hi1.timeViewed = double1;
        if (!flag) goto _L2; else goto _L1
_L1:
        _cls1..SwitchMap.com.snapchat.soju.android.discover.LinkStatus[tu.ordinal()];
        JVM INSTR tableswitch 1 3: default 52
    //                   1 131
    //                   2 131
    //                   3 140;
           goto _L3 _L4 _L4 _L5
_L3:
        Long long1 = null;
_L7:
        hi1.snapAvailable = long1;
        hi1.editionAvailable = a(tu);
_L2:
        hi1.snapTimeSec = double2;
        if (bd.ak() && double1 != null && double2 != null)
        {
            if (Double.compare(double1.doubleValue(), double2.doubleValue()) >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hi1.fullView = Boolean.valueOf(flag);
        }
        mBlizzardEventLogger.a(hi1);
        return;
_L4:
        long1 = Long.valueOf(1L);
        continue; /* Loop/switch isn't completed */
_L5:
        long1 = Long.valueOf(0L);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a(Chat chat)
    {
        if (chat instanceof BC)
        {
            mBlizzardEventLogger.a(new gq());
            return;
        }
        gp gp1 = new gp();
        gp1.mediaType = b(chat);
        long l;
        if (chat.C())
        {
            l = chat.D();
        } else
        {
            l = chat.W();
        }
        gp1.ackTimeSec = Double.valueOf((double)(l - chat.W()) / 1000D);
        if (chat instanceof BF)
        {
            gp1.source = jQ.STORY;
        }
        mBlizzardEventLogger.a(gp1);
    }

    public final void a(boolean flag)
    {
        gk gk1 = new gk();
        if (flag)
        {
            gk1.source = jQ.STORY;
        }
        mBlizzardEventLogger.a(gk1);
    }

    public final void b(BD bd, boolean flag, Double double1, TU tu, Double double2)
    {
        gO go = b(bd);
        go.timeViewed = double1;
        if (flag)
        {
            go.editionAvailable = a(tu);
        }
        go.snapTimeSec = double2;
        if (bd.ak() && double1 != null && double2 != null)
        {
            if (Double.compare(double1.doubleValue(), double2.doubleValue()) >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            go.fullView = Boolean.valueOf(flag);
        }
        mBlizzardEventLogger.a(go);
    }

}
