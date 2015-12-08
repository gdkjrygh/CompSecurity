// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui:
//            OverflowMenuItem

public class 
    implements butterknife.jector
{

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (OverflowMenuItem)obj, obj1);
    }

    public void inject(butterknife.jector jector, OverflowMenuItem overflowmenuitem, Object obj)
    {
        overflowmenuitem.icon = (ImageView)jector.jector((View)jector.jector(obj, 0x7f0d0199, "field 'icon'"), 0x7f0d0199, "field 'icon'");
        overflowmenuitem.label = (TextView)jector.jector((View)jector.jector(obj, 0x7f0d019a, "field 'label'"), 0x7f0d019a, "field 'label'");
        overflowmenuitem.newItemHint = (TextView)jector.Hint((View)jector.Hint(obj, 0x7f0d019b, "field 'newItemHint'"), 0x7f0d019b, "field 'newItemHint'");
    }

    public volatile void reset(Object obj)
    {
        reset((OverflowMenuItem)obj);
    }

    public void reset(OverflowMenuItem overflowmenuitem)
    {
        overflowmenuitem.icon = null;
        overflowmenuitem.label = null;
        overflowmenuitem.newItemHint = null;
    }

    public ()
    {
    }
}
