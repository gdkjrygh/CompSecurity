// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import java.util.Locale;

public final class ebs extends ebd
{

    private static final String g[] = {
        "uri", "name", "image_small_uri", "tracks_in_collection_count"
    };

    public ebs(dzs dzs, eay eay1, ecb ecb1, Context context)
    {
        super(dzs, eay1, ecb1, context);
    }

    public static MediaBrowserItem a(Context context, eay eay1)
    {
        eay1 = new ebh(eay1.b());
        eay1.a = com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.b;
        eay1.d = eck.a(context, 0x7f020228);
        eay1.b = gei.a(context.getString(0x7f080190), Locale.getDefault());
        return eay1.a();
    }

    protected final MediaBrowserItem a(Cursor cursor)
    {
        String s1 = cursor.getString(0);
        if (TextUtils.isEmpty(s1))
        {
            return null;
        }
        String s = cursor.getString(1);
        android.net.Uri uri = super.c.a(dto.a(cursor.getString(2)));
        int i = cursor.getInt(3);
        if (i <= 0)
        {
            cursor = eay.d(s1);
        } else
        {
            cursor = eay.e(s1);
        }
        cursor = new ebh(cursor);
        cursor.b = s;
        cursor.c = super.d.getResources().getQuantityString(0x7f09000e, i, new Object[] {
            Integer.valueOf(i)
        });
        cursor.d = uri;
        cursor.a = com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.a;
        return cursor.a();
    }

    protected final da a(Context context, String s)
    {
        return new cu(context, dti.b("", false), g, null, "name");
    }

    public final boolean a(String s)
    {
        return String.valueOf(super.b.b()).equals(s);
    }

}
