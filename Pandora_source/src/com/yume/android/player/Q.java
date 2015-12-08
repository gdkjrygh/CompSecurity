// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.widget.FrameLayout;
import com.yume.android.sdk.YuMeAdInfo;
import com.yume.android.sdk.YuMeAssetType;
import com.yume.android.sdk.YuMeControlBarInfo;
import com.yume.android.sdk.YuMeException;
import com.yume.android.sdk.YuMeImageRegion;
import com.yume.android.sdk.YuMeSDKPlayerInterface;
import com.yume.android.sdk.YuMeTimelineEvent;
import com.yume.android.sdk.YuMeTimelineEventType;
import com.yume.android.sdk.YuMeTimerInfo;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.yume.android.player:
//            B, x, G, ai, 
//            J, T, S, YuMePlayerInterfaceImpl, 
//            aq, A

final class Q
{

    boolean a;
    ai b;
    x c;
    G d;
    boolean e;
    private YuMeAdInfo f;
    private J g;
    private FrameLayout h;
    private int i;
    private HashMap j;
    private HashMap k;

    public Q(J j1, FrameLayout framelayout, YuMeAdInfo yumeadinfo)
    {
        B.a();
        f = null;
        a = true;
        g = null;
        h = null;
        i = 0;
        j = null;
        k = null;
        e = false;
        g = j1;
        h = framelayout;
        f = yumeadinfo;
        if (f.eBaseAssetType != YuMeAssetType.IMAGE) goto _L2; else goto _L1
_L1:
        c = new x(this, g, h);
_L4:
        if (f.imagesList != null || f.timersList != null)
        {
            d = new G(this, g, h);
        }
        return;
_L2:
        if (f.eBaseAssetType == YuMeAssetType.VIDEO)
        {
            b = new ai(this, g, h);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final void a(int i1)
    {
        int j1;
        if (i1 == 0)
        {
            e = true;
            S s = J.d;
            s.runOnUiThread(new T(s));
            int k1;
            if (f.timelineEventInterval > 0)
            {
                try
                {
                    YuMePlayerInterfaceImpl.a.YuMeSDKPlayer_TimelineEventOccured(YuMeTimelineEventType.NONE, 0);
                }
                catch (YuMeException yumeexception)
                {
                    yumeexception.printStackTrace();
                }
            }
        }
        if (f == null || f.timelineEventsList == null) goto _L2; else goto _L1
_L1:
        k1 = f.timelineEventsList.size();
        j1 = 0;
_L8:
        if (j1 < k1) goto _L4; else goto _L3
_L3:
        j1 = 0;
_L6:
        if (j1 != 0)
        {
            if (j == null)
            {
                j = new HashMap();
            }
            j.put(Integer.valueOf(i1), Integer.valueOf(i1));
        }
_L2:
        return;
_L4:
        YuMeTimelineEvent yumetimelineevent;
        yumetimelineevent = (YuMeTimelineEvent)f.timelineEventsList.get(j1);
        if (yumetimelineevent == null || yumetimelineevent.eEventType != YuMeTimelineEventType.PLAYBACK_PERCENTAGE || yumetimelineevent.value != i1)
        {
            break; /* Loop/switch isn't completed */
        }
        YuMePlayerInterfaceImpl.a.YuMeSDKPlayer_TimelineEventOccured(yumetimelineevent.eEventType, yumetimelineevent.eventId);
        j1 = 1;
        continue; /* Loop/switch isn't completed */
        YuMeException yumeexception1;
        yumeexception1;
        yumeexception1.printStackTrace();
        j1 = 1;
        if (true) goto _L6; else goto _L5
_L5:
        j1++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    final boolean a()
    {
        if (!a) goto _L2; else goto _L1
_L1:
        if (f.baseAssetUrl == null) goto _L4; else goto _L3
_L3:
        if (f.eBaseAssetType != YuMeAssetType.VIDEO) goto _L6; else goto _L5
_L5:
        boolean flag = b.a(f.baseAssetUrl);
_L8:
        if (!flag)
        {
            return false;
        }
          goto _L2
_L6:
        if (f.eBaseAssetType == YuMeAssetType.IMAGE)
        {
            flag = c.a(f.baseAssetUrl);
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
_L2:
        if (f.imagesList != null)
        {
            d.a();
        }
        return true;
_L4:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
    }

    final void b()
    {
        if (c == null) goto _L2; else goto _L1
_L1:
        c.c();
_L4:
        if (f.imagesList != null || f.timersList != null)
        {
            J.d.a(this);
        }
        return;
_L2:
        if (b != null)
        {
            b.h();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final void b(int i1)
    {
        int j1;
        boolean flag;
        j1 = 1;
        flag = false;
        if (f == null) goto _L2; else goto _L1
_L1:
        if (f.timelineEventInterval > 0)
        {
            if (f.timelineEventInterval != 1 || i1 <= 0)
            {
                i = i + 1;
                if (i != f.timelineEventInterval)
                {
                    j1 = 0;
                }
            }
            if (j1 != 0)
            {
                i = 0;
                int k1;
                try
                {
                    YuMePlayerInterfaceImpl.a.YuMeSDKPlayer_TimelineEventOccured(YuMeTimelineEventType.NONE, i1);
                }
                catch (YuMeException yumeexception)
                {
                    yumeexception.printStackTrace();
                }
            }
        }
        if (f.timelineEventsList == null) goto _L2; else goto _L3
_L3:
        k1 = f.timelineEventsList.size();
        j1 = ((flag) ? 1 : 0);
_L6:
        if (j1 < k1) goto _L4; else goto _L2
_L2:
        return;
_L4:
        YuMeTimelineEvent yumetimelineevent = (YuMeTimelineEvent)f.timelineEventsList.get(j1);
        if (yumetimelineevent != null && yumetimelineevent.eEventType == YuMeTimelineEventType.ABSOLUTE_TIME_IN_SECONDS && yumetimelineevent.value == i1)
        {
            try
            {
                YuMePlayerInterfaceImpl.a.YuMeSDKPlayer_TimelineEventOccured(yumetimelineevent.eEventType, yumetimelineevent.eventId);
            }
            catch (YuMeException yumeexception1)
            {
                yumeexception1.printStackTrace();
            }
            if (k == null)
            {
                k = new HashMap();
            }
            k.put(Integer.valueOf(i1), Integer.valueOf(i1));
            return;
        }
        j1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    final void c()
    {
        if (b != null)
        {
            b.j();
        }
        if (c != null)
        {
            c.a();
        }
        if (d != null)
        {
            d.c();
        }
    }

    public final YuMeAdInfo d()
    {
        return f;
    }

    final boolean e()
    {
        if (f != null)
        {
            return f.bIsBaseAssetClickable.booleanValue();
        } else
        {
            return false;
        }
    }

    final boolean f()
    {
        if (f != null)
        {
            return f.bIsBaseAssetSwipable.booleanValue();
        } else
        {
            return false;
        }
    }

    final int g()
    {
        if (f != null)
        {
            return f.baseAssetDuration;
        } else
        {
            return 0;
        }
    }

    final int h()
    {
        if (f != null)
        {
            return f.baseAssetID;
        } else
        {
            return 0;
        }
    }

    final YuMeControlBarInfo i()
    {
        if (f != null)
        {
            return f.controlBarInfo;
        } else
        {
            return null;
        }
    }

    final boolean j()
    {
        return f.controlBarInfo != null;
    }

    final List k()
    {
        if (f != null)
        {
            return f.imagesList;
        } else
        {
            return null;
        }
    }

    final List l()
    {
        if (f != null)
        {
            return f.timersList;
        } else
        {
            return null;
        }
    }

    final boolean m()
    {
        if (f.controlBarInfo != null)
        {
            return f.controlBarInfo.bIsFlipElementPresent.booleanValue();
        } else
        {
            return false;
        }
    }

    final int n()
    {
        if (f.controlBarInfo != null)
        {
            return f.controlBarInfo.height;
        } else
        {
            return 0;
        }
    }

    final boolean o()
    {
        if (f == null || f.eBaseAssetType != YuMeAssetType.IMAGE || f.timersList == null) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        j1 = f.timersList.size();
        i1 = 0;
_L5:
        if (i1 < j1) goto _L3; else goto _L2
_L2:
        return false;
_L3:
        YuMeTimerInfo yumetimerinfo = (YuMeTimerInfo)f.timersList.get(i1);
        if (yumetimerinfo != null && yumetimerinfo.backgroundImgURL == null && yumetimerinfo.bIsVisibleAtStart.booleanValue() && yumetimerinfo.duration == f.baseAssetDuration && yumetimerinfo.heightPercent == -1 && yumetimerinfo.widthPercent == -1 && yumetimerinfo.xPercent == -1 && yumetimerinfo.yPercent == -1 && yumetimerinfo.eRegion == YuMeImageRegion.BOTTOM_LEFT && yumetimerinfo.positionInRegion == -1 && yumetimerinfo.zIndex == -1)
        {
            return true;
        }
        i1++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    final void p()
    {
        if (c != null)
        {
            c.c();
        }
        if (b != null)
        {
            b.h();
        }
        if (d != null)
        {
            J.d.a(this);
        }
    }

    final void q()
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        if (b.h != aq.c) goto _L4; else goto _L3
_L3:
        b.f();
_L6:
        return;
_L4:
        a();
        return;
_L2:
        if (c != null)
        {
            if (c.i == A.c)
            {
                c.b();
                return;
            } else
            {
                a();
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
