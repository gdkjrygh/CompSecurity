// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.kik.android.a.b;
import com.kik.cache.ad;
import com.kik.cache.av;
import com.kik.f.a.a.a;
import kik.android.b.g;

// Referenced classes of package kik.android.widget:
//            q, t, s, SquareNetworkedImageView, 
//            RobotoTextView

public class ContentLinkView extends FrameLayout
{

    ImageView _contentLinkButtonImg;
    FrameLayout _contentLinkCenterLayout;
    SquareNetworkedImageView _contentLinkPic;
    RobotoTextView _contentLinkText;
    private View a;
    private a b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private g g;
    private com.kik.android.a h;
    private int i;
    private final android.view.View.OnClickListener j;

    public ContentLinkView(Context context)
    {
        this(context, null);
    }

    public ContentLinkView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = false;
        i = com.kik.ui.fragment.FragmentBase.a.a.a;
        j = new q(this);
        a = LayoutInflater.from(context).inflate(0x7f03003b, this);
        ButterKnife.inject(this, a);
    }

    static a a(ContentLinkView contentlinkview)
    {
        return contentlinkview.b;
    }

    private boolean a()
    {
        return b.f().startsWith("card://") || b.f().startsWith("cards://");
    }

    static boolean a(ContentLinkView contentlinkview, boolean flag)
    {
        contentlinkview.d = flag;
        return flag;
    }

    static int b(ContentLinkView contentlinkview)
    {
        return contentlinkview.i;
    }

    private boolean b()
    {
        return b.f().indexOf("http") == 0 || b.f().indexOf("https") == 0;
    }

    static boolean b(ContentLinkView contentlinkview, boolean flag)
    {
        contentlinkview.e = flag;
        return flag;
    }

    private Drawable c()
    {
        if ("image".equals(b.d()))
        {
            return getResources().getDrawable(0x7f0201a7);
        }
        if (b.f().indexOf("market://") == 0)
        {
            return getResources().getDrawable(0x7f020209);
        } else
        {
            return getResources().getDrawable(0x7f0202f7);
        }
    }

    static g c(ContentLinkView contentlinkview)
    {
        return contentlinkview.g;
    }

    static boolean c(ContentLinkView contentlinkview, boolean flag)
    {
        contentlinkview.f = flag;
        return flag;
    }

    static com.kik.android.a d(ContentLinkView contentlinkview)
    {
        return contentlinkview.h;
    }

    static boolean e(ContentLinkView contentlinkview)
    {
        return contentlinkview.a();
    }

    static boolean f(ContentLinkView contentlinkview)
    {
        return contentlinkview.b();
    }

    public final void a(int k)
    {
        i = k;
    }

    public final void a(int k, int l)
    {
        l;
        JVM INSTR lookupswitch 3: default 36
    //                   2: 121
    //                   4: 129
    //                   8: 129;
           goto _L1 _L2 _L3 _L3
_L1:
        if (k != 0) goto _L5; else goto _L4
_L4:
        if (c && (!e || d) && !f)
        {
            b b1 = new b(this, 0, (int)a.getResources().getDimension(0x7f0d0000));
            b1.setDuration(300L);
            b1.setAnimationListener(new t(this));
            startAnimation(b1);
            super.setVisibility(k);
        }
_L7:
        return;
_L2:
        c = false;
        continue; /* Loop/switch isn't completed */
_L3:
        c = true;
        continue; /* Loop/switch isn't completed */
_L5:
        if (!f && (!e || d) || d) goto _L7; else goto _L6
_L6:
        b b2 = new b(this, (int)a.getResources().getDimension(0x7f0d0000), 0);
        b2.setDuration(300L);
        b2.setAnimationListener(new s(this));
        startAnimation(b2);
        return;
        if (true) goto _L1; else goto _L8
_L8:
    }

    public final void a(com.kik.android.a a1)
    {
        h = a1;
    }

    public final void a(a a1, ad ad)
    {
        b = a1;
        String s1 = a1.d();
        av av1 = av.a(a1.g(), _contentLinkPic.getMeasuredWidth(), _contentLinkPic.getMeasuredHeight());
        _contentLinkPic.setVisibility(0);
        _contentLinkCenterLayout.setOnClickListener(j);
        _contentLinkPic.b(c());
        if (av1 != null)
        {
            _contentLinkPic.a(c());
            _contentLinkPic.a(av1, ad);
        }
        _contentLinkText.setVisibility(0);
        if (a1.e() != null)
        {
            _contentLinkText.setText(a1.e());
        } else
        if ("image".equals(s1))
        {
            _contentLinkText.setText(getResources().getString(0x7f090325));
        } else
        if (b.f().indexOf("market://") == 0)
        {
            _contentLinkText.setText(getResources().getString(0x7f0902c6, new Object[] {
                a1.h()
            }));
        } else
        {
            _contentLinkText.setText(getResources().getString(0x7f0902e8, new Object[] {
                a1.h()
            }));
        }
        if ("image".equals(s1) || a() || b())
        {
            _contentLinkButtonImg.setImageDrawable(getResources().getDrawable(0x7f0201f5));
            return;
        } else
        {
            _contentLinkButtonImg.setImageDrawable(getResources().getDrawable(0x7f02000a));
            return;
        }
    }

    public final void a(g g1)
    {
        g = g1;
    }
}
