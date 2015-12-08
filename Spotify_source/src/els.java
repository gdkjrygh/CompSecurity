// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.view.View;
import com.spotify.android.paste.widget.EmptyView;

public final class els
{

    public static View a(View view)
    {
        EmptyView emptyview = (EmptyView)view.findViewById(0x7f110355);
        gag.a(view.getContext(), emptyview, view.getResources().getString(0x7f080154));
        return emptyview;
    }
}
