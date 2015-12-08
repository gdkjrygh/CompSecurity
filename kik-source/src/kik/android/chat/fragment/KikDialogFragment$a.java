// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Resources;
import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            KikDialogFragment

public static class a
{

    KikDialogFragment a;

    public final a a(int i)
    {
        a.a(i);
        return this;
    }

    public final r a(int i, android.content.ickListener icklistener)
    {
        a.a(i, icklistener);
        return this;
    }

    public final er a(android.content.ncelListener ncellistener)
    {
        a.a(ncellistener);
        return this;
    }

    public final er a(View view)
    {
        a.a(view);
        return this;
    }

    public final a a(String s)
    {
        a.a(s);
        return this;
    }

    public final r a(String s, android.content.ickListener icklistener)
    {
        a.a(s, icklistener);
        return this;
    }

    public final r a(r r)
    {
        a.a(r);
        return this;
    }

    public final a a(boolean flag)
    {
        a.a(flag);
        return this;
    }

    public final r a(CharSequence acharsequence[], android.content.ickListener icklistener)
    {
        a.a(acharsequence, icklistener);
        return this;
    }

    public final KikDialogFragment a()
    {
        return a;
    }

    public final a b(int i)
    {
        a.b(i);
        return this;
    }

    public final r b(int i, android.content.ickListener icklistener)
    {
        a.b(i, icklistener);
        return this;
    }

    public final r b(String s)
    {
        a.b(s);
        return this;
    }

    public final r b(String s, android.content.ickListener icklistener)
    {
        a.b(s, icklistener);
        return this;
    }

    public final r b(boolean flag)
    {
        a.setCancelable(flag);
        return this;
    }

    public final r c(int i, android.content.ickListener icklistener)
    {
        a.c(i, icklistener);
        return this;
    }

    public r()
    {
        this(null);
    }

    public <init>(Resources resources)
    {
        a = new KikDialogFragment();
        KikDialogFragment.a(a, resources);
    }
}
