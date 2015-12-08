// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import java.io.File;

public final class ghq
    implements mli
{

    private final String a;
    private final ame b;

    public ghq(Context context, String s)
    {
        a = s;
        b = aly.c(context).g().a(ayt.b(0x80000000, 0x80000000).a(apa.b));
    }

    public final void a(String s, ImageView imageview)
    {
        ame ame1 = b;
        String s1 = String.valueOf("file:///android_asset/");
        s = String.valueOf((new File(a, s)).getPath());
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        ame1.a(Uri.parse(s)).a(imageview);
    }
}
