// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import kik.android.chat.KikApplication;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class cn
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final KikChatFragment a;

    cn(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void onGlobalLayout()
    {
        if (KikChatFragment.I(a) == 1)
        {
            Object obj1 = a.getActivity();
            if (obj1 != null)
            {
                Object obj = new Rect();
                obj1 = ((Activity) (obj1)).getWindow().getDecorView();
                ((View) (obj1)).getWindowVisibleDisplayFrame(((Rect) (obj)));
                int j = ((View) (obj1)).getRootView().getHeight() - ((Rect) (obj)).bottom;
                obj = ((View) (obj1)).findViewById(0x1020030);
                ((View) (obj1)).findViewById(0x102002f);
                int i = j;
                if (obj != null)
                {
                    i = j - ((View) (obj)).getHeight();
                }
                if (i > KikApplication.a(200))
                {
                    KikChatFragment.b(a, i);
                }
            }
        }
    }
}
