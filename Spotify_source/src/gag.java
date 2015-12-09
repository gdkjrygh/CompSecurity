// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.android.paste.widget.EmptyView;

public final class gag
{

    public static EmptyView a(Context context, EmptyView emptyview, String s)
    {
        emptyview.a(dff.k(context));
        emptyview.a(context.getString(0x7f0802ad));
        emptyview.b(s);
        return emptyview;
    }

    public static EmptyView a(Context context, String s)
    {
        return a(context, new EmptyView(context), s);
    }
}
