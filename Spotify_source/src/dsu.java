// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class dsu extends ggk
{

    public final Calendar a = Calendar.getInstance();
    private final TextView c;
    private final TextView d;

    private dsu(Context context)
    {
        super(LayoutInflater.from(context).inflate(0x7f03011d, null));
        c = (TextView)ctz.a(super.b.findViewById(0x7f11049f));
        d = (TextView)ctz.a(super.b.findViewById(0x7f1104a0));
    }

    public static dsu a(ImageView imageview)
    {
        android.graphics.drawable.Drawable drawable = imageview.getDrawable();
        if (drawable instanceof dsu)
        {
            return (dsu)drawable;
        } else
        {
            ((gft)dmz.a(gft)).a().a(imageview);
            dsu dsu1 = new dsu(imageview.getContext());
            imageview.setImageDrawable(dsu1);
            return dsu1;
        }
    }

    public final void a(Date date, Locale locale)
    {
        if (date != null)
        {
            a.setTime(date);
            a(locale);
            return;
        } else
        {
            c.setText("");
            d.setText("");
            return;
        }
    }

    public final void a(Locale locale)
    {
        locale = a.getDisplayName(2, 1, locale).toUpperCase(locale);
        int i = a.get(5);
        c.setText(locale);
        d.setText(String.valueOf(i));
    }
}
