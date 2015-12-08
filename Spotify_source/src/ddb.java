// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageView;
import com.spotify.android.glue.molecules.card.CardAppearance;
import com.spotify.android.paste.widget.CardView;

final class ddb
    implements dcv, dcw
{

    private final CardView a;
    private final CardAppearance b;

    ddb(View view, CardAppearance cardappearance)
    {
        a = (CardView)view;
        b = cardappearance;
    }

    public final View a()
    {
        return a;
    }

    public final void a(String s)
    {
        a.a(s);
    }

    public final void b()
    {
        a.a(false);
    }

    public final void b(String s)
    {
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[CardAppearance.values().length];
                try
                {
                    a[CardAppearance.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[CardAppearance.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[CardAppearance.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[b.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unsupported CardAppearance: ")).append(b).toString());

        case 1: // '\001'
            throw new UnsupportedOperationException("Can't set subtitle on a title-only card");

        case 2: // '\002'
            a.b(s);
            return;

        case 3: // '\003'
            a.c(s);
            break;
        }
    }

    public final ImageView c()
    {
        return a.a;
    }
}
