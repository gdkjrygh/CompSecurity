// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import com.snapchat.android.discover.model.ChannelPage;

final class lang.Object
    implements lang.Object
{

    private vS a;

    public final void a(ImageView imageview, Drawable drawable, Bundle bundle, boolean flag)
    {
        String s = bundle.getString("uri");
        ChannelPage channelpage = (ChannelPage)bundle.getParcelable("channel_page");
        if (!flag)
        {
            a.a = null;
            a.b = vS.a(channelpage.g);
            a.c = false;
        } else
        {
            a.a = s;
            a.b = drawable;
            a.c = true;
        }
        if (imageview != null)
        {
            Jo.a(imageview, a.b);
            if (a.d != null)
            {
                a.d.a(imageview, drawable, bundle, flag);
            }
        }
    }

    >(vS vs)
    {
        a = vs;
        super();
    }
}
