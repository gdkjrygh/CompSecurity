// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.journey.selection;

import ly.kite.catalogue.Catalogue;
import ly.kite.catalogue.ProductGroup;
import ly.kite.widget.HeaderFooterGridView;

// Referenced classes of package ly.kite.journey.selection:
//            ChooseProductGroupFragment

public static interface 
{

    public abstract void pgOnPrePopulateProductGroupGrid(Catalogue catalogue, HeaderFooterGridView headerfootergridview);

    public abstract void pgOnProductGroupChosen(ProductGroup productgroup);
}
