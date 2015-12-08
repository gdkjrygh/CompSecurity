// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.discover.model.ChannelPage;
import com.snapchat.android.discover.ui.ChannelView;
import java.util.Map;

final class lang.Object
    implements android.view.OnClickListener
{

    private vt a;

    public final void onClick(View view)
    {
        Object obj = (ChannelView)view;
        int i = -1;
        if (view.getTag(0x7f0d0001) != null)
        {
            i = ((Integer)view.getTag(0x7f0d0001)).intValue();
        }
        if (!a.e.a(((ChannelView) (obj)), a.f, MediaOpenOrigin.STORIES, i))
        {
            String s = ((ChannelView) (obj)).b.a;
            obj = (vU)a.g.get(s);
            view = ((View) (obj));
            if (obj == null)
            {
                view = new vU();
            }
            view.a = true;
            a.g.put(s, view);
        }
    }

    >(vt vt1)
    {
        a = vt1;
        super();
    }
}
