// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.animation.Animator;
import android.os.Handler;
import com.aetn.history.android.historyhere.widgets.CustomViewPager;
import java.util.ArrayList;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapOverlayFragment

class this._cls2
    implements Runnable
{

    final ._cls0 this$2;

    public void run()
    {
        try
        {
            MapOverlayFragment.access$400(_fld0).fakeDragBy(0.0F);
            MapOverlayFragment.access$400(_fld0).endFakeDrag();
            MapOverlayFragment.access$1402(_fld0, true);
            MapOverlayFragment.access$400(_fld0).setEnabled(true);
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            nullpointerexception.printStackTrace();
        }
    }

    ._cls0()
    {
        this$2 = this._cls2.this;
        super();
    }

    // Unreferenced inner class com/aetn/history/android/historyhere/fragment/MapOverlayFragment$11

/* anonymous class */
    class MapOverlayFragment._cls11
        implements android.animation.Animator.AnimatorListener
    {

        final MapOverlayFragment this$0;

        public void onAnimationCancel(Animator animator)
        {
        }

        public void onAnimationEnd(Animator animator)
        {
            if (!MapOverlayFragment.access$1400(MapOverlayFragment.this) && MapOverlayFragment.access$300(MapOverlayFragment.this) != null)
            {
                MapOverlayFragment.access$400(MapOverlayFragment.this).setEnabled(false);
                (new Handler()).postDelayed(new MapOverlayFragment._cls11._cls1(), 400L);
                return;
            } else
            {
                MapOverlayFragment.access$400(MapOverlayFragment.this).setEnabled(true);
                return;
            }
        }

        public void onAnimationRepeat(Animator animator)
        {
        }

        public void onAnimationStart(Animator animator)
        {
        }

            
            {
                this$0 = MapOverlayFragment.this;
                super();
            }
    }


    // Unreferenced inner class com/aetn/history/android/historyhere/fragment/MapOverlayFragment$11$1

/* anonymous class */
    class MapOverlayFragment._cls11._cls1
        implements Runnable
    {

        final MapOverlayFragment._cls11 this$1;

        public void run()
        {
            if (MapOverlayFragment.access$300(this$0).size() == 1)
            {
                return;
            }
            int i = 120;
            if (MapOverlayFragment.access$400(this$0).getCurrentItem() < MapOverlayFragment.access$300(this$0).size() - 1)
            {
                i = -140;
            }
            MapOverlayFragment.access$400(this$0).beginFakeDrag();
            MapOverlayFragment.access$400(this$0).fakeDragBy(i);
            (new Handler()).postDelayed(new MapOverlayFragment._cls11._cls1._cls1(), 300L);
        }

            
            {
                this$1 = MapOverlayFragment._cls11.this;
                super();
            }
    }

}
