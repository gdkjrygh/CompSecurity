// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.Adapter;
import android.widget.AutoCompleteTextView;

final class ang.Object
    implements android.view.nFocusChangeListener
{

    final dyc a;

    public final void onFocusChange(View view, boolean flag)
    {
        if (!flag)
        {
            dyc.a(dyc.y(a));
            dyc.a(a, dyc.a(a, dyc.A(a)));
            dyc.n(a).dismissDropDown();
        } else
        {
            view = dyc.n(a).getAdapter();
            if (view != null && view.getCount() > 0)
            {
                dyc.n(a).post(new Runnable() {

                    private dyc._cls8 a;

                    public final void run()
                    {
                        dyc.n(a.a).showDropDown();
                    }

            
            {
                a = dyc._cls8.this;
                super();
            }
                });
                return;
            }
        }
    }

    (dyc dyc1)
    {
        a = dyc1;
        super();
    }
}
