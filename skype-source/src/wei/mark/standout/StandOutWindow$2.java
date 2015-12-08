// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package wei.mark.standout;

import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package wei.mark.standout:
//            StandOutWindow

final class b
    implements android.view.ner
{

    final b a;
    final PopupWindow b;
    final StandOutWindow c;

    public final void onClick(View view)
    {
        a.c.run();
        b.dismiss();
    }

    (StandOutWindow standoutwindow,  , PopupWindow popupwindow)
    {
        c = standoutwindow;
        a = ;
        b = popupwindow;
        super();
    }
}
