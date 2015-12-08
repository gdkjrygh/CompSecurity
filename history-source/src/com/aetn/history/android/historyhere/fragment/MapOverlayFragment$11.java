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

class this._cls0
    implements android.animation.ner
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
            (new Handler()).postDelayed(new Runnable() {

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
                    (new Handler()).postDelayed(new Runnable() {

                        final _cls1 this$2;

                        public void run()
                        {
                            try
                            {
                                MapOverlayFragment.access$400(this$0).fakeDragBy(0.0F);
                                MapOverlayFragment.access$400(this$0).endFakeDrag();
                                MapOverlayFragment.access$1402(this$0, true);
                                MapOverlayFragment.access$400(this$0).setEnabled(true);
                                return;
                            }
                            catch (NullPointerException nullpointerexception)
                            {
                                nullpointerexception.printStackTrace();
                            }
                        }

            
            {
                this$2 = _cls1.this;
                super();
            }
                    }, 300L);
                }

            
            {
                this$1 = MapOverlayFragment._cls11.this;
                super();
            }
            }, 400L);
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

    _cls1.this._cls1()
    {
        this$0 = MapOverlayFragment.this;
        super();
    }
}
