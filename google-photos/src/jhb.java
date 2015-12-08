// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

public final class jhb
{

    public final ImageView a;
    public Bitmap b;
    private final noz c;

    public jhb(Context context, ImageView imageview)
    {
        c = noz.a(context, 2, "VideoStillHolder", new String[0]);
        a = imageview;
    }

    public void a(int i)
    {
        a.setVisibility(i);
    }

    public final boolean a()
    {
        return b != null;
    }

    public final String toString()
    {
        String s = String.valueOf("{isVisible=");
        boolean flag;
        if (a.getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return (new StringBuilder(String.valueOf(s).length() + 6)).append(s).append(flag).append("}").toString();
    }
}
