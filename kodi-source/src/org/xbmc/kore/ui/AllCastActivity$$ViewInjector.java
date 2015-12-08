// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

// Referenced classes of package org.xbmc.kore.ui:
//            AllCastActivity

public class 
    implements butterknife.ctor
{

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (AllCastActivity)obj, obj1);
    }

    public void inject(butterknife.ctor ctor, AllCastActivity allcastactivity, Object obj)
    {
        allcastactivity.castGridView = (GridView)ctor.iew((View)ctor.dView(obj, 0x7f0e0051, "field 'castGridView'"), 0x7f0e0051, "field 'castGridView'");
        allcastactivity.emptyView = (TextView)ctor.((View)ctor.dView(obj, 0x1020004, "field 'emptyView'"), 0x1020004, "field 'emptyView'");
    }

    public volatile void reset(Object obj)
    {
        reset((AllCastActivity)obj);
    }

    public void reset(AllCastActivity allcastactivity)
    {
        allcastactivity.castGridView = null;
        allcastactivity.emptyView = null;
    }

    public ()
    {
    }
}
