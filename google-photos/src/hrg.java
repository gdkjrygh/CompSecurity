// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class hrg extends mtf
{

    private final String a;
    private final int b;
    private final ekk c;

    public hrg(String s, int i, ekk ekk)
    {
        super("GetCollFromAlbumIdTask");
        a = s;
        c = ekk;
        b = i;
    }

    public final mue a(Context context)
    {
        Object obj = (els)olm.a(context, els);
        Object obj1 = (erz)olm.a(context, erz);
        context = noz.a(context, "GetCollFromAlbumIdTask", new String[0]);
        obj1 = ((erz) (obj1)).c(b, a);
        if (obj1 == null)
        {
            if (context.a())
            {
                context = String.valueOf(a);
                if (context.length() != 0)
                {
                    "Error trying to load media key for album ID: ".concat(context);
                } else
                {
                    new String("Error trying to load media key for album ID: ");
                }
            }
            return new mue(false);
        }
        ekq ekq1 = b.a(b, ((String) (obj1)));
        try
        {
            obj = (ekq)((ekr)((els) (obj)).a(ekq1.a())).a(ekq1, c).a();
        }
        catch (eke eke1)
        {
            if (context.a())
            {
                context = String.valueOf(obj1);
                if (context.length() != 0)
                {
                    "Error trying to load features for media collection: ".concat(context);
                } else
                {
                    new String("Error trying to load features for media collection: ");
                }
            }
            return new mue(0, eke1, null);
        }
        context = new mue(true);
        context.a().putParcelable("com.google.android.apps.photos.core.media_collection", ((android.os.Parcelable) (obj)));
        return context;
    }
}
