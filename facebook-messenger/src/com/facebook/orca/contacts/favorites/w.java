// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.favorites;

import android.content.Context;
import android.view.View;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.k;
import com.facebook.messages.threads.ui.name.ThreadNameView;
import com.facebook.orca.common.ui.widgets.e;
import com.facebook.orca.common.ui.widgets.text.a;
import com.facebook.widget.tiles.ThreadTileView;

// Referenced classes of package com.facebook.orca.contacts.favorites:
//            y, x

public class w extends e
{

    private y b;
    private ThreadNameView c;
    private ThreadNameView d;
    private View e;
    private ThreadTileView f;
    private a g;
    private com.facebook.orca.photos.a.e h;

    public w(Context context)
    {
        super(context);
        a(context);
    }

    static y a(w w1)
    {
        return w1.b;
    }

    private void a(Context context)
    {
        setContentView(k.orca_favorites_list_row);
        c = (ThreadNameView)getView(i.group_name);
        d = (ThreadNameView)getView(i.group_description);
        f = (ThreadTileView)getView(i.contact_group_tile_image);
        e = getView(i.delete_button);
        e.setClickable(true);
        context = t.a(context);
        g = (a)context.a(com/facebook/orca/common/ui/widgets/text/a);
        h = (com.facebook.orca.photos.a.e)context.a(com/facebook/orca/photos/a/e);
    }

    private void b()
    {
        Object obj = b.a();
        f.setThreadTileViewData(h.a(((com.facebook.orca.threads.ThreadSummary) (obj))));
        obj = g.a(((com.facebook.orca.threads.ThreadSummary) (obj)));
        c.setData(obj);
        d.setData(obj);
        e.setOnClickListener(new x(this));
    }

    public y getGroupRow()
    {
        return b;
    }

    public View getInnerRow()
    {
        return getChildAt(0);
    }

    public void setGroupRow(y y1)
    {
        b = y1;
        b();
    }
}
