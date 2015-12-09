// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.support.v7.c.a;
import android.support.v7.internal.view.menu.ab;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public final class d extends ActionMode
{

    final Context a;
    final a b;

    public d(Context context, a a1)
    {
        a = context;
        b = a1;
    }

    public final void finish()
    {
        b.c();
    }

    public final View getCustomView()
    {
        return b.i();
    }

    public final Menu getMenu()
    {
        return ab.a(a, (android.support.v4.b.a.a)b.b());
    }

    public final MenuInflater getMenuInflater()
    {
        return b.a();
    }

    public final CharSequence getSubtitle()
    {
        return b.g();
    }

    public final Object getTag()
    {
        return b.j();
    }

    public final CharSequence getTitle()
    {
        return b.f();
    }

    public final boolean getTitleOptionalHint()
    {
        return b.k();
    }

    public final void invalidate()
    {
        b.d();
    }

    public final boolean isTitleOptional()
    {
        return b.h();
    }

    public final void setCustomView(View view)
    {
        b.a(view);
    }

    public final void setSubtitle(int i)
    {
        b.b(i);
    }

    public final void setSubtitle(CharSequence charsequence)
    {
        b.a(charsequence);
    }

    public final void setTag(Object obj)
    {
        b.a(obj);
    }

    public final void setTitle(int i)
    {
        b.a(i);
    }

    public final void setTitle(CharSequence charsequence)
    {
        b.b(charsequence);
    }

    public final void setTitleOptionalHint(boolean flag)
    {
        b.a(flag);
    }
}
