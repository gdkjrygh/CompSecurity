// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.text.PTextView;
import me.grantland.widget.AutofitLayout;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXCoreConceptsSaveFragment

public class 
{

    public static void inject(butterknife.eFragment efragment, NUXCoreConceptsSaveFragment nuxcoreconceptssavefragment, Object obj)
    {
        nuxcoreconceptssavefragment._title = (PTextView)efragment._title(obj, 0x7f0f0288, "field '_title'");
        nuxcoreconceptssavefragment._phone = (WebImageView)efragment._phone(obj, 0x7f0f0289, "field '_phone'");
        nuxcoreconceptssavefragment._phoneBg = (WebImageView)efragment._phoneBg(obj, 0x7f0f028f, "field '_phoneBg'");
        nuxcoreconceptssavefragment._mainPin = (WebImageView)efragment._mainPin(obj, 0x7f0f028a, "field '_mainPin'");
        nuxcoreconceptssavefragment._smallPin1 = (WebImageView)efragment._smallPin1(obj, 0x7f0f028c, "field '_smallPin1'");
        nuxcoreconceptssavefragment._smallPin2 = (WebImageView)efragment._smallPin2(obj, 0x7f0f028d, "field '_smallPin2'");
        nuxcoreconceptssavefragment._smallPin3 = (WebImageView)efragment._smallPin3(obj, 0x7f0f028e, "field '_smallPin3'");
        nuxcoreconceptssavefragment._bottomFade = (WebImageView)efragment._bottomFade(obj, 0x7f0f0290, "field '_bottomFade'");
        nuxcoreconceptssavefragment._titleWrapper = (AutofitLayout)efragment._titleWrapper(obj, 0x7f0f0287, "field '_titleWrapper'");
    }

    public static void reset(NUXCoreConceptsSaveFragment nuxcoreconceptssavefragment)
    {
        nuxcoreconceptssavefragment._title = null;
        nuxcoreconceptssavefragment._phone = null;
        nuxcoreconceptssavefragment._phoneBg = null;
        nuxcoreconceptssavefragment._mainPin = null;
        nuxcoreconceptssavefragment._smallPin1 = null;
        nuxcoreconceptssavefragment._smallPin2 = null;
        nuxcoreconceptssavefragment._smallPin3 = null;
        nuxcoreconceptssavefragment._bottomFade = null;
        nuxcoreconceptssavefragment._titleWrapper = null;
    }

    public ()
    {
    }
}
