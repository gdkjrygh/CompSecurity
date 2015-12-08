// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.android.paste.widget.SectionHeaderView;
import com.spotify.mobile.android.util.Assertion;

final class ang.Object
    implements android.view.nClickListener
{

    private ejz a;

    public final void onClick(View view)
    {
        ejz ejz1 = a;
        ejr ejr1 = (ejr)view.getTag();
        if (ejr1 == null)
        {
            if (!(view instanceof SectionHeaderView))
            {
                Assertion.b("onItemClick called with a null tag item for the view");
            }
            return;
        } else
        {
            ejr1.a(new <init>(ejz1));
            return;
        }
    }

    (ejz ejz1)
    {
        a = ejz1;
        super();
    }
}
