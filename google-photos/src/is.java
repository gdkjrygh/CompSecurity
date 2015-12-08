// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.print.PrintManager;

public class is
    implements iu, mau
{

    private final iv a;

    public is()
    {
    }

    is(Context context)
    {
        a = new iv(context);
    }

    public lzx a(jyw jyw)
    {
        return new mhb((j)jyw);
    }

    public final void a(int i)
    {
        a.d = i;
    }

    public final void a(String s, Uri uri, k k)
    {
        PrintManager printmanager;
        android.print.PrintAttributes.Builder builder;
        k = a;
        uri = new iw(k, s, uri, null, ((iv) (k)).d);
        printmanager = (PrintManager)((iv) (k)).a.getSystemService("print");
        builder = new android.print.PrintAttributes.Builder();
        builder.setColorMode(((iv) (k)).e);
        if (((iv) (k)).f != 1) goto _L2; else goto _L1
_L1:
        builder.setMediaSize(android.print.PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
_L4:
        printmanager.print(s, uri, builder.build());
        return;
_L2:
        if (((iv) (k)).f == 2)
        {
            builder.setMediaSize(android.print.PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
