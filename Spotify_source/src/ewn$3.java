// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ang.Object
    implements android.view.nClickListener
{

    private ewn a;

    public final void onClick(View view)
    {
        view = ewn.b(a);
        if (((exa) (view)).e == null)
        {
            throw new IllegalStateException("GenreQuestionnaire is not loaded.");
        } else
        {
            ((exa) (view)).a.a(((exa) (view)).e);
            return;
        }
    }

    (ewn ewn1)
    {
        a = ewn1;
        super();
    }
}
