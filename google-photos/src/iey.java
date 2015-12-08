// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

final class iey extends azf
{

    private final ifc a;
    private final TextView b;
    private final ImageView c;

    iey(TextView textview, ImageView imageview, ifc ifc1)
    {
        b = textview;
        c = imageview;
        a = ifc1;
    }

    public final void a(Drawable drawable)
    {
        c.setImageDrawable(drawable);
        b.setText("");
    }

    public final void a(Object obj, azp azp)
    {
        obj = (ifz)obj;
        a.a = ((ifz) (obj)).a;
        b.setText(((ifz) (obj)).a);
        c.setImageDrawable(((ifz) (obj)).b);
    }
}
