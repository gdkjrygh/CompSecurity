// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.android.glue.molecules.card.CardAppearance;
import com.spotify.android.paste.widget.CardView;

public final class ddc extends dcy
{

    public ddc()
    {
    }

    public final dcw a(Context context)
    {
        return new ddb(new CardView(context), CardAppearance.b);
    }

    public final dcw b(Context context)
    {
        return new ddb(new CardView(context), CardAppearance.c);
    }
}
