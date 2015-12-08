// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import com.spotify.android.paste.widget.prettylist.StickyListView;

public abstract class dja
{

    public dja()
    {
    }

    public static djd a(Context context)
    {
        return new djd(context, 0);
    }

    public static djd b(Context context)
    {
        return new djd(context, 1);
    }

    public static djd c(Context context)
    {
        return new djd(context, 2);
    }

    public abstract djt a();

    public abstract void a(int j);

    public abstract void a(Menu menu, Activity activity);

    public abstract void a(View view);

    public abstract void a(boolean flag);

    public abstract View b();

    public abstract void b(int j);

    public abstract void b(View view);

    public abstract void b(boolean flag);

    public abstract ImageView c();

    public abstract void c(View view);

    public abstract ImageView d();

    public abstract StickyListView e();

    public abstract ListView f();

    public gve g()
    {
        return null;
    }

    public abstract void h();

    public abstract void i();
}
