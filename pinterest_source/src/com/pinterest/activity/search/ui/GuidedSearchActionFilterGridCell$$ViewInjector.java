// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.widget.TextView;
import com.pinterest.ui.imageview.SquareImageView;

// Referenced classes of package com.pinterest.activity.search.ui:
//            GuidedSearchActionFilterGridCell

public class 
{

    public static void inject(butterknife.idCell idcell, GuidedSearchActionFilterGridCell guidedsearchactionfiltergridcell, Object obj)
    {
        guidedsearchactionfiltergridcell._filterImage = (SquareImageView)idcell._filterImage(obj, 0x7f0f0327, "field '_filterImage'");
        guidedsearchactionfiltergridcell._filterTextView = (TextView)idcell._filterTextView(obj, 0x7f0f0328, "field '_filterTextView'");
    }

    public static void reset(GuidedSearchActionFilterGridCell guidedsearchactionfiltergridcell)
    {
        guidedsearchactionfiltergridcell._filterImage = null;
        guidedsearchactionfiltergridcell._filterTextView = null;
    }

    public ()
    {
    }
}
