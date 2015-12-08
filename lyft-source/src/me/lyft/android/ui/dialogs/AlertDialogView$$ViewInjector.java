// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            AlertDialogView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (AlertDialogView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, AlertDialogView alertdialogview, Object obj)
    {
        alertdialogview.dialogIconImageView = (ImageView)viewinjector.dialogIconImageView((View)viewinjector.dialogIconImageView(obj, 0x7f0d0072, "field 'dialogIconImageView'"), 0x7f0d0072, "field 'dialogIconImageView'");
        alertdialogview.dialogTitlePlaceholder = (LinearLayout)viewinjector.dialogTitlePlaceholder((View)viewinjector.dialogTitlePlaceholder(obj, 0x7f0d0073, "field 'dialogTitlePlaceholder'"), 0x7f0d0073, "field 'dialogTitlePlaceholder'");
        alertdialogview.dialogTitleTxt = (TextView)viewinjector.dialogTitleTxt((View)viewinjector.dialogTitleTxt(obj, 0x7f0d0074, "field 'dialogTitleTxt'"), 0x7f0d0074, "field 'dialogTitleTxt'");
        alertdialogview.messageTxt = (TextView)viewinjector.messageTxt((View)viewinjector.messageTxt(obj, 0x7f0d0075, "field 'messageTxt'"), 0x7f0d0075, "field 'messageTxt'");
        alertdialogview.listView = (ListView)viewinjector.listView((View)viewinjector.listView(obj, 0x7f0d0077, "field 'listView'"), 0x7f0d0077, "field 'listView'");
        alertdialogview.listDivider = (View)viewinjector.listDivider(obj, 0x7f0d0076, "field 'listDivider'");
        alertdialogview.buttonsPlaceholder = (LinearLayout)viewinjector.buttonsPlaceholder((View)viewinjector.buttonsPlaceholder(obj, 0x7f0d0079, "field 'buttonsPlaceholder'"), 0x7f0d0079, "field 'buttonsPlaceholder'");
        alertdialogview.buttonsDivider = (View)viewinjector.buttonsDivider(obj, 0x7f0d0078, "field 'buttonsDivider'");
    }

    public volatile void reset(Object obj)
    {
        reset((AlertDialogView)obj);
    }

    public void reset(AlertDialogView alertdialogview)
    {
        alertdialogview.dialogIconImageView = null;
        alertdialogview.dialogTitlePlaceholder = null;
        alertdialogview.dialogTitleTxt = null;
        alertdialogview.messageTxt = null;
        alertdialogview.listView = null;
        alertdialogview.listDivider = null;
        alertdialogview.buttonsPlaceholder = null;
        alertdialogview.buttonsDivider = null;
    }

    public ()
    {
    }
}
