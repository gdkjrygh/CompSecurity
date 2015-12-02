// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.share;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.common.w.j;
import com.facebook.common.w.n;
import com.facebook.h;
import com.facebook.inject.t;
import com.facebook.messages.model.share.Share;
import com.facebook.messages.model.share.ShareMedia;
import com.facebook.messages.model.share.ShareProperty;
import com.facebook.o;
import com.facebook.orca.common.ui.widgets.text.MultilineEllipsizeTextView;
import com.facebook.ui.images.d.d;
import com.facebook.ui.images.d.i;
import com.facebook.ui.images.d.k;
import com.facebook.widget.CustomRelativeLayout;
import com.facebook.widget.images.UrlImage;
import com.google.common.a.es;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.orca.share:
//            a, b, c

public class ShareView extends CustomRelativeLayout
{

    private k a;
    private a b;
    private UrlImage c;
    private MultilineEllipsizeTextView d;
    private TextView e;
    private TextView f;
    private List g;
    private Drawable h;
    private Share i;
    private boolean j;
    private int k;
    private c l;

    public ShareView(Context context)
    {
        super(context);
        a(context, ((AttributeSet) (null)));
    }

    public ShareView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context, attributeset);
    }

    public ShareView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a(context, attributeset);
    }

    static c a(ShareView shareview)
    {
        return shareview.l;
    }

    private com.facebook.ui.images.d.h a(Context context)
    {
        int i1 = com.facebook.common.w.j.a(context, 60F);
        int j1 = com.facebook.common.w.j.a(context, 150F);
        if (j)
        {
            i1 = j1;
        }
        return (new i()).a((new d()).a(1.0F).b(0.6F).c(0.6F).e()).a(i1).b(i1).c(i1).d(i1).a(j).b(j).j();
    }

    private void a(Context context, AttributeSet attributeset)
    {
        attributeset = getInjector();
        a = (k)attributeset.a(com/facebook/ui/images/d/k);
        b = (a)attributeset.a(com/facebook/orca/share/a);
        setContentView(com.facebook.k.orca_share_view);
        c = (UrlImage)findViewById(com.facebook.i.share_image);
        d = (MultilineEllipsizeTextView)findViewById(com.facebook.i.share_name);
        e = (TextView)findViewById(com.facebook.i.share_caption);
        f = (TextView)findViewById(com.facebook.i.share_description);
        g = es.a((TextView)findViewById(com.facebook.i.share_property1), (TextView)findViewById(com.facebook.i.share_property2), (TextView)findViewById(com.facebook.i.share_property3));
        h = context.getResources().getDrawable(h.orca_share_attachment_link_background);
        attributeset = new b(this);
        setOnClickListener(attributeset);
        d.setOnClickListener(attributeset);
        setWillNotDraw(false);
        k = com.facebook.common.w.j.a(context, 4F);
    }

    static Share b(ShareView shareview)
    {
        return shareview.i;
    }

    private void d()
    {
        Object obj;
        Iterator iterator;
        if (j)
        {
            setBackgroundResource(0x106000d);
        } else
        {
            setBackgroundResource(h.orca_share_attachment_background);
        }
        if (n.a(i.a()))
        {
            d.setVisibility(8);
        } else
        {
            d.setVisibility(0);
            d.setText(i.a());
        }
        if (n.a(i.b()))
        {
            e.setVisibility(8);
        } else
        {
            e.setVisibility(0);
            e.setText(i.b());
        }
        if (n.a(i.c()))
        {
            f.setVisibility(8);
        } else
        {
            f.setVisibility(0);
            f.setText(i.c());
        }
        obj = b.a(i);
        if (obj != null && !n.a(((ShareMedia) (obj)).d()))
        {
            com.google.common.a.mh mh;
            ShareProperty shareproperty;
            TextView textview;
            String s;
            if ("photo".equals(((ShareMedia) (obj)).c()))
            {
                c.setBackgroundResource(h.orca_image_attachment_background);
            } else
            {
                c.setBackgroundDrawable(null);
            }
            c.setVisibility(0);
            obj = Uri.parse(((ShareMedia) (obj)).d());
            if (((Uri) (obj)).isAbsolute())
            {
                com.facebook.ui.images.base.b b1 = a.a(a(getContext()));
                c.a(((Uri) (obj)), b1);
            } else
            {
                c.setVisibility(8);
            }
        } else
        {
            c.setVisibility(8);
        }
        obj = getResources();
        mh = i.g().h_();
        for (iterator = g.iterator(); mh.hasNext() && iterator.hasNext(); textview.setText(Html.fromHtml(String.format(((Resources) (obj)).getString(o.share_property), new Object[] {
    s, TextUtils.htmlEncode(shareproperty.b())
}))))
        {
            shareproperty = (ShareProperty)mh.next();
            textview = (TextView)iterator.next();
            textview.setVisibility(0);
            s = (new StringBuilder()).append("<font color=\"#888888\">").append(TextUtils.htmlEncode(shareproperty.a())).append("</font>").toString();
        }

        for (; iterator.hasNext(); ((TextView)iterator.next()).setVisibility(8)) { }
    }

    private Rect getShareNameRect()
    {
        Rect rect = new Rect();
        Rect rect1 = new Rect();
        d.getGlobalVisibleRect(rect);
        getGlobalVisibleRect(rect1);
        rect.offset(-rect1.left, -rect1.top);
        rect.left = rect.left - k;
        rect.top = rect.top - k;
        rect.bottom = rect.bottom + k;
        rect.right = rect.right + k;
        return rect;
    }

    void a()
    {
        invalidate(getShareNameRect());
    }

    public void a(Share share, boolean flag)
    {
        i = share;
        j = flag;
        d();
    }

    public Share getShare()
    {
        return i;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        Rect rect = getShareNameRect();
        h.setState(d.getDrawableState());
        h.setBounds(rect);
        h.draw(canvas);
    }

    public void setListener(c c1)
    {
        l = c1;
    }
}
