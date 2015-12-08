// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.payment:
//            EditFacebookCreditCardView

public class I
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (EditFacebookCreditCardView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, EditFacebookCreditCardView editfacebookcreditcardview, Object obj)
    {
        editfacebookcreditcardview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        editfacebookcreditcardview.cardTitleTextView = (TextView)viewinjector.cardTitleTextView((View)viewinjector.cardTitleTextView(obj, 0x7f0d01f9, "field 'cardTitleTextView'"), 0x7f0d01f9, "field 'cardTitleTextView'");
        editfacebookcreditcardview.defaultCardView = (View)viewinjector.defaultCardView(obj, 0x7f0d01fa, "field 'defaultCardView'");
        editfacebookcreditcardview.errorView = (View)viewinjector.errorView(obj, 0x7f0d01fb, "field 'errorView'");
        editfacebookcreditcardview.makeDefaultButton = (Button)viewinjector.makeDefaultButton((View)viewinjector.makeDefaultButton(obj, 0x7f0d01fc, "field 'makeDefaultButton'"), 0x7f0d01fc, "field 'makeDefaultButton'");
        editfacebookcreditcardview.footerView = (LinearLayout)viewinjector.footerView((View)viewinjector.footerView(obj, 0x7f0d01fd, "field 'footerView'"), 0x7f0d01fd, "field 'footerView'");
    }

    public volatile void reset(Object obj)
    {
        reset((EditFacebookCreditCardView)obj);
    }

    public void reset(EditFacebookCreditCardView editfacebookcreditcardview)
    {
        editfacebookcreditcardview.toolbar = null;
        editfacebookcreditcardview.cardTitleTextView = null;
        editfacebookcreditcardview.defaultCardView = null;
        editfacebookcreditcardview.errorView = null;
        editfacebookcreditcardview.makeDefaultButton = null;
        editfacebookcreditcardview.footerView = null;
    }

    public I()
    {
    }
}
