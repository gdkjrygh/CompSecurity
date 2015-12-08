// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.support.v4.view.ViewPager;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import org.xbmc.kore.ui.views.CirclePageIndicator;

// Referenced classes of package org.xbmc.kore.ui:
//            RemoteActivity

class this._cls1
    implements android.support.v4.view.ngeListener
{

    final bar this$1;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
        i = (int)(((float)(i - 1) + f) * (float)pixelsPerPage);
        backgroundImage.scrollTo(i, 0);
    }

    public void onPageSelected(int i)
    {
        RemoteActivity.access$400(_fld0, toolbar, i);
    }

    l.pixelsPerPage()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class org/xbmc/kore/ui/RemoteActivity$6

/* anonymous class */
    class RemoteActivity._cls6
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        final RemoteActivity this$0;
        final int val$pixelsPerPage;

        public boolean onPreDraw()
        {
            backgroundImage.getViewTreeObserver().removeOnPreDrawListener(this);
            int i = viewPager.getCurrentItem();
            int j = pixelsPerPage;
            backgroundImage.scrollTo((i - 1) * j, 0);
            pageIndicator.setOnPageChangeListener(new RemoteActivity._cls6._cls1());
            return true;
        }

            
            {
                this$0 = final_remoteactivity;
                pixelsPerPage = I.this;
                super();
            }
    }

}
