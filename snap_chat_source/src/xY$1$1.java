// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

final class ng.Object
    implements Runnable
{

    private a a;

    public final void run()
    {
        xY.b(a.a);
        xY.c(a.a);
    }

    ct(ct ct)
    {
        a = ct;
        super();
    }

    // Unreferenced inner class xY$1

/* anonymous class */
    final class xY._cls1
        implements android.view.View.OnTouchListener
    {

        final xY a;

        public final boolean onTouch(View view, MotionEvent motionevent)
        {
label0:
            {
                if (motionevent.getAction() == 0)
                {
                    if (a.c != null)
                    {
                        a.c.setSelected(false);
                        a.c = null;
                    }
                    a.b.remove("saved_state_last_selected_drawer");
                    if (!xY.a(a))
                    {
                        break label0;
                    }
                    xY.a(a, false);
                    xY.d(a).postDelayed(new xY._cls1._cls1(this), 200L);
                }
                return false;
            }
            xY.b(a);
            xY.c(a);
            return false;
        }

            
            {
                a = xy;
                super();
            }
    }

}
