// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;
import com.kik.e.a;
import com.kik.g.p;
import com.kik.l.ab;
import java.util.Locale;
import kik.a.e.f;
import kik.android.chat.fragment.KikFragmentBase;
import kik.android.gifs.a.b;
import kik.android.gifs.a.c;

// Referenced classes of package kik.android.widget:
//            by, au, bt, bu

public abstract class GifWidgetFragment extends KikFragmentBase
    implements by
{

    protected f a;
    protected com.kik.android.a b;
    protected ab c;
    private Context d;
    private b e;
    private GifWidget.b f;
    private kik.android.chat.fragment.KikChatFragment.d g;
    private int h;

    public GifWidgetFragment()
    {
    }

    protected static void a(RecyclerView recyclerview)
    {
        recyclerview.b().c(0);
    }

    protected final p a(String s, au au1)
    {
        p p1 = new p();
        java.util.List list = au1.d();
        if (s != null)
        {
            s = e.a(s, kik.android.gifs.a.b.a.d, Locale.getDefault());
        } else
        {
            s = e.a();
        }
        s.a(new bt(this, list, p1, au1));
        return p1;
    }

    protected void a()
    {
    }

    protected void a(int j)
    {
        h = j;
    }

    protected final void a(TextView textview, String s)
    {
        a(kik.android.widget.GifWidget.a.f);
        textview.setText(getString(0x7f090111, new Object[] {
            s
        }));
    }

    protected final void a(com.kik.g.f f1)
    {
        super.a(f1);
        f1.a(a.b(), new bu(this));
    }

    protected final void a(String s, String s1)
    {
        Toast.makeText(d, s1, 0).show();
    }

    protected final void a(kik.android.chat.fragment.KikChatFragment.d d1)
    {
        g = d1;
    }

    public final void a(kik.android.gifs.a.f f1, int j)
    {
        a(f1, j, null);
    }

    protected void a(kik.android.gifs.a.f f1, int j, String s)
    {
        W();
        if (f != null)
        {
            f.a(f1, j, s);
        }
    }

    protected final void a(GifWidget.b b1)
    {
        f = b1;
    }

    protected void b()
    {
    }

    protected void c()
    {
    }

    protected void d()
    {
    }

    protected final com.kik.android.a e()
    {
        return b;
    }

    protected final kik.android.chat.fragment.KikChatFragment.d f()
    {
        return g;
    }

    protected final Context g()
    {
        return d;
    }

    protected final b h()
    {
        return e;
    }

    protected final int i()
    {
        return h;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d = getActivity();
        V().a(this);
        e = kik.android.gifs.a.c.a(d.getApplicationContext());
    }

    public void onDestroy()
    {
        super.onDestroy();
        e.b();
    }
}
