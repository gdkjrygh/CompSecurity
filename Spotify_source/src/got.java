// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.android.paste.widget.CardView;

public final class got extends abo
{

    public CardView j;

    public got(View view)
    {
        super(view);
    }

    public final void a(android.view.View.OnLongClickListener onlongclicklistener)
    {
        j.setOnLongClickListener(onlongclicklistener);
    }

    public final void a(String s)
    {
        j.b(s);
    }
}
