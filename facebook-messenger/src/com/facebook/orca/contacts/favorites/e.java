// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.favorites;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.messages.threads.ui.name.ThreadNameView;
import com.facebook.orca.common.ui.widgets.text.a;
import com.facebook.widget.f;
import com.facebook.widget.tiles.ThreadTileView;

// Referenced classes of package com.facebook.orca.contacts.favorites:
//            g, f

public class e extends f
{

    private final ThreadNameView a;
    private final ThreadNameView b;
    private final View c;
    private final ThreadTileView d;
    private final a e;
    private final com.facebook.orca.photos.a.e f;
    private g g;

    public e(Context context)
    {
        this(context, null, 0);
    }

    public e(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        setContentView(k.orca_add_favorite_group_row);
        a = (ThreadNameView)getView(i.group_name);
        b = (ThreadNameView)getView(i.group_description);
        d = (ThreadTileView)getView(i.contact_group_tile_image);
        c = getView(i.add_button);
        context = t.a(context);
        e = (a)context.a(com/facebook/orca/common/ui/widgets/text/a);
        f = (com.facebook.orca.photos.a.e)context.a(com/facebook/orca/photos/a/e);
    }

    static g a(e e1)
    {
        return e1.g;
    }

    private void a()
    {
        Object obj = g.a();
        d.setThreadTileViewData(f.a(((com.facebook.orca.threads.ThreadSummary) (obj))));
        obj = e.a(((com.facebook.orca.threads.ThreadSummary) (obj)));
        a.setData(obj);
        b.setData(obj);
        c.setOnClickListener(new com.facebook.orca.contacts.favorites.f(this));
    }

    public g getContactRow()
    {
        return g;
    }

    public void setGroupRow(g g1)
    {
        g = g1;
        a();
    }
}
