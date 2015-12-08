// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.Button;
import com.spotify.android.paste.widget.EmptyView;

public final class ext
{

    public static EmptyView a(Context context, android.view.View.OnClickListener onclicklistener)
    {
        EmptyView emptyview = new EmptyView(context);
        context = dgp.b(context, emptyview);
        context.setId(0x7f11025e);
        context.setText(0x7f08038e);
        context.setSingleLine(true);
        emptyview.a(context);
        context.setOnClickListener(onclicklistener);
        return emptyview;
    }
}
