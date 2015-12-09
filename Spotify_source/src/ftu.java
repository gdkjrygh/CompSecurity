// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import com.squareup.picasso.Picasso;

public final class ftu extends os
{

    public Filter c;
    private final String d;
    private final gji e;

    public ftu(Context context)
    {
        super(context);
        d = context.getString(0x7f0803e1);
        dmz.a(gjj);
        e = gjj.a(context);
    }

    public final View a(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return dds.a(context, viewgroup).a();
    }

    public final void a(View view, Context context, Cursor cursor)
    {
        context = (ddi)dds.a(view);
        view = (doa)view.getTag();
        android.widget.ImageView imageview;
        android.net.Uri uri;
        if (view == null)
        {
            view = doa.a(cursor, d);
            context.a(view);
        } else
        {
            view.b(cursor, d);
        }
        context.a(((doa) (view)).b);
        cursor = e;
        imageview = context.d();
        uri = dto.a(((doa) (view)).d);
        ((gji) (cursor)).b.a(uri).a(0x7f02006f).b(0x7f02006f).a(gft.a(imageview));
        context.a().setEnabled(((doa) (view)).c);
    }

    public final Filter getFilter()
    {
        return c;
    }
}
