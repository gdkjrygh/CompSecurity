// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import java.util.Locale;

public final class ebr extends ebd
{

    private static final String g[] = {
        "uri", "name", "artist_name", "image_small_uri"
    };

    public ebr(dzs dzs, eay eay1, ecb ecb1, Context context)
    {
        super(dzs, eay1, ecb1, context);
    }

    public static MediaBrowserItem a(Context context, eay eay1)
    {
        eay1 = new ebh(eay1.c());
        eay1.a = com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.b;
        eay1.d = eck.a(context, 0x7f020227);
        eay1.b = gei.a(context.getString(0x7f08018b), Locale.getDefault());
        return eay1.a();
    }

    protected final MediaBrowserItem a(Cursor cursor)
    {
        Object obj = null;
        String s = cursor.getString(0);
        if (s == null)
        {
            return null;
        }
        Object obj1 = super.b;
        if (s != null)
        {
            if (TextUtils.isEmpty(s))
            {
                obj = Uri.EMPTY;
            } else
            {
                obj = ((eay) (obj1)).c().buildUpon().appendEncodedPath(s).build();
            }
        }
        s = cursor.getString(1);
        obj1 = cursor.getString(2);
        cursor = super.c.a(dto.a(cursor.getString(3)));
        obj = new ebh(((Uri) (obj)));
        obj.b = s;
        obj.c = ((String) (obj1));
        obj.d = cursor;
        obj.a = com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.a;
        return ((ebh) (obj)).a();
    }

    protected final da a(Context context, String s)
    {
        return new cu(context, dti.a("", false, false), g, null, "artist_name");
    }

    public final boolean a(String s)
    {
        return String.valueOf(super.b.c()).equals(s);
    }

}
