// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.payment:
//            EditGoogleWalletView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (EditGoogleWalletView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, EditGoogleWalletView editgooglewalletview, Object obj)
    {
        editgooglewalletview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        editgooglewalletview.cardTitleTextView = (TextView)viewinjector.cardTitleTextView((View)viewinjector.cardTitleTextView(obj, 0x7f0d01f9, "field 'cardTitleTextView'"), 0x7f0d01f9, "field 'cardTitleTextView'");
        editgooglewalletview.defaultCardView = (View)viewinjector.defaultCardView(obj, 0x7f0d01fa, "field 'defaultCardView'");
        editgooglewalletview.makeDefaultButton = (Button)viewinjector.makeDefaultButton((View)viewinjector.makeDefaultButton(obj, 0x7f0d01fc, "field 'makeDefaultButton'"), 0x7f0d01fc, "field 'makeDefaultButton'");
        editgooglewalletview.editCardButton = (Button)viewinjector.editCardButton((View)viewinjector.editCardButton(obj, 0x7f0d01fe, "field 'editCardButton'"), 0x7f0d01fe, "field 'editCardButton'");
        editgooglewalletview.deleteButton = (Button)viewinjector.deleteButton((View)viewinjector.deleteButton(obj, 0x7f0d01ff, "field 'deleteButton'"), 0x7f0d01ff, "field 'deleteButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((EditGoogleWalletView)obj);
    }

    public void reset(EditGoogleWalletView editgooglewalletview)
    {
        editgooglewalletview.toolbar = null;
        editgooglewalletview.cardTitleTextView = null;
        editgooglewalletview.defaultCardView = null;
        editgooglewalletview.makeDefaultButton = null;
        editgooglewalletview.editCardButton = null;
        editgooglewalletview.deleteButton = null;
    }

    public ()
    {
    }
}
