// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package org.xbmc.kore.ui:
//            AddonDetailsFragment

public class >
    implements butterknife.ctor
{

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (AddonDetailsFragment)obj, obj1);
    }

    public void inject(butterknife.ctor ctor, final AddonDetailsFragment target, Object obj)
    {
        View view = (View)ctor.(obj, 0x7f0e007c, "field 'fabButton' and method 'onFabClicked'");
        target.fabButton = (ImageButton)ctor.(view, 0x7f0e007c, "field 'fabButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final AddonDetailsFragment..ViewInjector this$0;
            final AddonDetailsFragment val$target;

            public void doClick(View view1)
            {
                target.onFabClicked(view1);
            }

            
            {
                this$0 = AddonDetailsFragment..ViewInjector.this;
                target = addondetailsfragment;
                super();
            }
        });
        view = (View)ctor.(obj, 0x7f0e0077, "field 'enabledButton' and method 'onEnabledClicked'");
        target.enabledButton = (ImageButton)ctor.tton(view, 0x7f0e0077, "field 'enabledButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final AddonDetailsFragment..ViewInjector this$0;
            final AddonDetailsFragment val$target;

            public void doClick(View view1)
            {
                target.onEnabledClicked(view1);
            }

            
            {
                this$0 = AddonDetailsFragment..ViewInjector.this;
                target = addondetailsfragment;
                super();
            }
        });
        target.mediaPanel = (ScrollView)ctor.l((View)ctor.(obj, 0x7f0e0071, "field 'mediaPanel'"), 0x7f0e0071, "field 'mediaPanel'");
        target.mediaArt = (ImageView)ctor.((View)ctor.(obj, 0x7f0e0070, "field 'mediaArt'"), 0x7f0e0070, "field 'mediaArt'");
        target.mediaPoster = (ImageView)ctor.er((View)ctor.(obj, 0x7f0e0075, "field 'mediaPoster'"), 0x7f0e0075, "field 'mediaPoster'");
        target.mediaTitle = (TextView)ctor.e((View)ctor.(obj, 0x7f0e0073, "field 'mediaTitle'"), 0x7f0e0073, "field 'mediaTitle'");
        target.mediaUndertitle = (TextView)ctor.rtitle((View)ctor.(obj, 0x7f0e0074, "field 'mediaUndertitle'"), 0x7f0e0074, "field 'mediaUndertitle'");
        target.mediaAuthor = (TextView)ctor.or((View)ctor.(obj, 0x7f0e0079, "field 'mediaAuthor'"), 0x7f0e0079, "field 'mediaAuthor'");
        target.mediaVersion = (TextView)ctor.ion((View)ctor.(obj, 0x7f0e007a, "field 'mediaVersion'"), 0x7f0e007a, "field 'mediaVersion'");
        target.mediaDescription = (TextView)ctor.ription((View)ctor.(obj, 0x7f0e007b, "field 'mediaDescription'"), 0x7f0e007b, "field 'mediaDescription'");
    }

    public volatile void reset(Object obj)
    {
        reset((AddonDetailsFragment)obj);
    }

    public void reset(AddonDetailsFragment addondetailsfragment)
    {
        addondetailsfragment.fabButton = null;
        addondetailsfragment.enabledButton = null;
        addondetailsfragment.mediaPanel = null;
        addondetailsfragment.mediaArt = null;
        addondetailsfragment.mediaPoster = null;
        addondetailsfragment.mediaTitle = null;
        addondetailsfragment.mediaUndertitle = null;
        addondetailsfragment.mediaAuthor = null;
        addondetailsfragment.mediaVersion = null;
        addondetailsfragment.mediaDescription = null;
    }

    public >()
    {
    }
}
