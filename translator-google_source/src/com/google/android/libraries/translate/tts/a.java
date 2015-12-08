// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.tts;

import com.google.android.libraries.translate.languages.Language;

// Referenced classes of package com.google.android.libraries.translate.tts:
//            e, MyTts

final class a
    implements e
{

    final MyTts a;
    private final e b;

    public a(MyTts mytts, e e1)
    {
        a = mytts;
        super();
        b = e1;
        MyTts.a(mytts, this);
    }

    private void a()
    {
        if (MyTts.a(a) == this)
        {
            MyTts.a(a, null);
        }
    }

    public final void b(int i)
    {
        b.b(i);
        a();
    }

    public final void b(String s, Language language)
    {
        b.b(s, language);
    }

    public final void j()
    {
        b.j();
        a();
    }

    public final void k()
    {
        b.k();
    }
}
