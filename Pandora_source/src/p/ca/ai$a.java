// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.ImageView;
import android.widget.ResourceCursorAdapter;
import android.widget.TextView;
import com.pandora.radio.data.y;
import p.l.c;
import p.l.d;
import p.l.g;
import p.l.j;

// Referenced classes of package p.ca:
//            ai

private class ntent.Context extends ResourceCursorAdapter
{

    final ai a;

    public void bindView(View view, Context context, Cursor cursor)
    {
        cursor = new y(cursor);
        ((TextView)view.findViewById(0x7f10011b)).setText(cursor.d());
        ImageView imageview = (ImageView)view.findViewById(0x7f1000b5);
        g.b(context).a(cursor.o()).a(0x7f0200e9).a(imageview);
        view = (ImageView)view.findViewById(0x7f100289);
        if (cursor.A())
        {
            view.setVisibility(0);
            view.setImageResource(0x7f0200db);
            return;
        }
        if (cursor.k())
        {
            view.setVisibility(0);
            view.setImageResource(0x7f020257);
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    public tabase.Cursor(ai ai1, Context context, int i, Cursor cursor)
    {
        a = ai1;
        super(context, i, cursor);
    }
}
