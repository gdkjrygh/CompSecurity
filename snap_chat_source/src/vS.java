// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import com.snapchat.android.Timber;
import com.snapchat.android.discover.model.ChannelPage;

public final class vS
{

    public String a;
    public Drawable b;
    public boolean c;
    public wm.a d;
    private final wm e;
    private wm.a f = new wm.a() {

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

            
            {
                a = vS.this;
                super();
            }
    };

    public vS()
    {
        this(wm.a());
    }

    private vS(wm wm1)
    {
        c = false;
        e = wm1;
    }

    protected static Drawable a(int i)
    {
        return new Gg(i);
    }

    public final void a(ImageView imageview, ChannelPage channelpage, boolean flag)
    {
        String s;
        Object obj;
        if (flag)
        {
            s = channelpage.i();
            obj = channelpage.l();
        } else
        {
            s = channelpage.h();
            obj = channelpage.k();
        }
        if (b != null && TextUtils.equals(s, a))
        {
            Jo.a(imageview, b);
            return;
        }
        if (wm.a(channelpage, flag))
        {
            obj = new Bundle();
            ((Bundle) (obj)).putString("uri", s);
            ((Bundle) (obj)).putParcelable("channel_page", channelpage);
            e.a(imageview, channelpage, flag, f, ((Bundle) (obj)));
            return;
        } else
        {
            Timber.a("ChannelViewBrandIconProvider", "DISCOVER-MEDIA-BRAND-ICON: %s's icon has not been downloaded yet: [%s] inverted? %b", new Object[] {
                channelpage.a, obj, Boolean.valueOf(flag)
            });
            a = null;
            c = false;
            b = a(channelpage.g);
            Jo.a(imageview, b);
            imageview.setImageDrawable(null);
            return;
        }
    }
}
