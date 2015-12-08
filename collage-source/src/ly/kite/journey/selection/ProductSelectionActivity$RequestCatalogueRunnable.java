// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.journey.selection;

import android.widget.ProgressBar;
import ly.kite.catalogue.CatalogueLoader;

// Referenced classes of package ly.kite.journey.selection:
//            ProductSelectionActivity

private class <init>
    implements Runnable
{

    final ProductSelectionActivity this$0;

    public void run()
    {
        if (ProductSelectionActivity.access$100(ProductSelectionActivity.this) != null)
        {
            if (ProductSelectionActivity.access$200(ProductSelectionActivity.this) != null)
            {
                ProductSelectionActivity.access$200(ProductSelectionActivity.this).setVisibility(0);
            }
            ProductSelectionActivity.access$100(ProductSelectionActivity.this).requestCatalogue(0x36ee80L, ProductSelectionActivity.access$300(ProductSelectionActivity.this), ProductSelectionActivity.this);
        }
    }

    private Q()
    {
        this$0 = ProductSelectionActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
