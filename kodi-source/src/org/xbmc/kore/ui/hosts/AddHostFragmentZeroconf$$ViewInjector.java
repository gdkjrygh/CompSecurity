// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ProgressBar;
import android.widget.TextView;

// Referenced classes of package org.xbmc.kore.ui.hosts:
//            AddHostFragmentZeroconf

public class 
    implements butterknife.ewInjector
{

    public volatile void inject(butterknife.ewInjector ewinjector, Object obj, Object obj1)
    {
        inject(ewinjector, (AddHostFragmentZeroconf)obj, obj1);
    }

    public void inject(butterknife.ewInjector ewinjector, AddHostFragmentZeroconf addhostfragmentzeroconf, Object obj)
    {
        addhostfragmentzeroconf.titleTextView = (TextView)ewinjector.leTextView((View)ewinjector.leTextView(obj, 0x7f0e006c, "field 'titleTextView'"), 0x7f0e006c, "field 'titleTextView'");
        addhostfragmentzeroconf.messageTextView = (TextView)ewinjector.sageTextView((View)ewinjector.sageTextView(obj, 0x7f0e006d, "field 'messageTextView'"), 0x7f0e006d, "field 'messageTextView'");
        addhostfragmentzeroconf.nextButton = (Button)ewinjector.tButton((View)ewinjector.tButton(obj, 0x7f0e009c, "field 'nextButton'"), 0x7f0e009c, "field 'nextButton'");
        addhostfragmentzeroconf.previousButton = (Button)ewinjector.viousButton((View)ewinjector.viousButton(obj, 0x7f0e0097, "field 'previousButton'"), 0x7f0e0097, "field 'previousButton'");
        addhostfragmentzeroconf.progressBar = (ProgressBar)ewinjector.gressBar((View)ewinjector.gressBar(obj, 0x7f0e006f, "field 'progressBar'"), 0x7f0e006f, "field 'progressBar'");
        addhostfragmentzeroconf.hostListGridView = (GridView)ewinjector.tListGridView((View)ewinjector.tListGridView(obj, 0x7f0e006e, "field 'hostListGridView'"), 0x7f0e006e, "field 'hostListGridView'");
    }

    public volatile void reset(Object obj)
    {
        reset((AddHostFragmentZeroconf)obj);
    }

    public void reset(AddHostFragmentZeroconf addhostfragmentzeroconf)
    {
        addhostfragmentzeroconf.titleTextView = null;
        addhostfragmentzeroconf.messageTextView = null;
        addhostfragmentzeroconf.nextButton = null;
        addhostfragmentzeroconf.previousButton = null;
        addhostfragmentzeroconf.progressBar = null;
        addhostfragmentzeroconf.hostListGridView = null;
    }

    public ()
    {
    }
}
