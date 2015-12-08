// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.CheckedTextView;
import android.widget.TextView;

final class mwa
    implements android.view.View.OnClickListener
{

    private CheckedTextView a;
    private mvz b;

    mwa(mvz mvz1, CheckedTextView checkedtextview)
    {
        b = mvz1;
        a = checkedtextview;
        super();
    }

    public final void onClick(View view)
    {
        if (view instanceof CheckedTextView)
        {
            ((CheckedTextView)view).toggle();
        }
        mvz.a(b).setText(mvz.a(b, a.isChecked()));
    }
}
