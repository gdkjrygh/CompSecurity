// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.ListView;
import com.jcp.views.TypefaceTextView;

// Referenced classes of package com.jcp.fragments:
//            LocalAdsCatalogsFragment

public class 
    implements butterknife.ector
{

    public void inject(butterknife.ector ector, LocalAdsCatalogsFragment localadscatalogsfragment, Object obj)
    {
        localadscatalogsfragment.mAdsCatalogsList = (ListView)ector.logsList((View)ector.logsList(obj, 0x7f0e01cb, "field 'mAdsCatalogsList'"), 0x7f0e01cb, "field 'mAdsCatalogsList'");
        localadscatalogsfragment.mStoreName = (TypefaceTextView)ector.me((View)ector.me(obj, 0x7f0e01c8, "field 'mStoreName'"), 0x7f0e01c8, "field 'mStoreName'");
        localadscatalogsfragment.mStoreAddress = (TypefaceTextView)ector.dress((View)ector.dress(obj, 0x7f0e01c9, "field 'mStoreAddress'"), 0x7f0e01c9, "field 'mStoreAddress'");
        localadscatalogsfragment.mSelectStoreBtn = (TypefaceTextView)ector.toreBtn((View)ector.toreBtn(obj, 0x7f0e01ca, "field 'mSelectStoreBtn'"), 0x7f0e01ca, "field 'mSelectStoreBtn'");
    }

    public volatile void inject(butterknife.ector ector, Object obj, Object obj1)
    {
        inject(ector, (LocalAdsCatalogsFragment)obj, obj1);
    }

    public void reset(LocalAdsCatalogsFragment localadscatalogsfragment)
    {
        localadscatalogsfragment.mAdsCatalogsList = null;
        localadscatalogsfragment.mStoreName = null;
        localadscatalogsfragment.mStoreAddress = null;
        localadscatalogsfragment.mSelectStoreBtn = null;
    }

    public volatile void reset(Object obj)
    {
        reset((LocalAdsCatalogsFragment)obj);
    }

    public ()
    {
    }
}
