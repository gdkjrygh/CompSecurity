// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package wei.mark.standout.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import wei.mark.standout.StandOutWindow;

// Referenced classes of package wei.mark.standout.ui:
//            Window

final class a
    implements android.view.ickListener
{

    final ImageView a;
    final Window b;

    public final void onClick(View view)
    {
        view = Window.a(b).getDropDown(b.b);
        if (view != null)
        {
            view.showAsDropDown(a);
        }
    }

    ow(Window window, ImageView imageview)
    {
        b = window;
        a = imageview;
        super();
    }
}
