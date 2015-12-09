// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cb;

import android.view.View;
import android.widget.EditText;
import com.pandora.android.util.s;

// Referenced classes of package p.cb:
//            a

class .Object
    implements android.view..OnFocusChangeListener
{

    final a a;

    public void onFocusChange(View view, boolean flag)
    {
        view = s.a(a.b.getText());
        if (flag)
        {
            if (p.cb.a.k().equals(view))
            {
                a.b.setText(null);
                p.cb.a.a(a, false);
            }
        } else
        if (s.a(view))
        {
            a.b.setText(p.cb.a.k());
            p.cb.a.a(a, false);
            return;
        }
    }

    iew.View(a a1)
    {
        a = a1;
        super();
    }
}
