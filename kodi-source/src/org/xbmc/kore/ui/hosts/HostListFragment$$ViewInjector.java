// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package org.xbmc.kore.ui.hosts:
//            HostListFragment

public class _cls1.val.target
    implements butterknife.ewInjector
{

    public volatile void inject(butterknife.ewInjector ewinjector, Object obj, Object obj1)
    {
        inject(ewinjector, (HostListFragment)obj, obj1);
    }

    public void inject(butterknife.ewInjector ewinjector, final HostListFragment target, Object obj)
    {
        target.hostGridView = (GridView)ewinjector.tGridView((View)ewinjector.View(obj, 0x7f0e006e, "field 'hostGridView'"), 0x7f0e006e, "field 'hostGridView'");
        obj = (View)ewinjector.View(obj, 0x7f0e008c, "field 'addHostButton' and method 'onAddHostClicked'");
        target.addHostButton = (Button)ewinjector.HostButton(((View) (obj)), 0x7f0e008c, "field 'addHostButton'");
        ((View) (obj)).setOnClickListener(new DebouncingOnClickListener() {

            final HostListFragment..ViewInjector this$0;
            final HostListFragment val$target;

            public void doClick(View view)
            {
                target.onAddHostClicked(view);
            }

            
            {
                this$0 = HostListFragment..ViewInjector.this;
                target = hostlistfragment;
                super();
            }
        });
    }

    public volatile void reset(Object obj)
    {
        reset((HostListFragment)obj);
    }

    public void reset(HostListFragment hostlistfragment)
    {
        hostlistfragment.hostGridView = null;
        hostlistfragment.addHostButton = null;
    }

    public _cls1.val.target()
    {
    }
}
