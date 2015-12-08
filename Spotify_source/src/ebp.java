// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import java.util.Locale;

public final class ebp extends ebd
{

    private static final String g[] = {
        "uri", "name", "item_count", "image_small_uri", "is_folder", "owner_name", "folder_all_tracks_uri", "folder_count", "is_own"
    };
    private final Uri h;

    public ebp(dzs dzs, eay eay1, ecb ecb1, Context context)
    {
        super(dzs, eay1, ecb1, context);
        h = super.b.a();
    }

    public static MediaBrowserItem a(Context context, eay eay1)
    {
        eay1 = new ebh(eay1.a());
        eay1.b = gei.a(context.getString(0x7f0801a0), Locale.getDefault());
        eay1.a = com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.b;
        eay1.d = eck.a(context, 0x7f02022d);
        return eay1.a();
    }

    protected final MediaBrowserItem a(Cursor cursor)
    {
        String s = cursor.getString(1);
        Object obj = cursor.getString(0);
        int i = cursor.getInt(2);
        if (gcw.a(cursor, 4))
        {
            cursor.getString(6);
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append(super.d.getResources().getQuantityString(0x7f090015, i, new Object[] {
                Integer.valueOf(i)
            }));
            i = cursor.getInt(7);
            if (i > 0)
            {
                stringbuilder.append(", ").append(super.d.getResources().getQuantityString(0x7f090014, i, new Object[] {
                    Integer.valueOf(i)
                }));
            }
            cursor = new ebh(Uri.parse(((String) (obj))));
            cursor.b = s;
            cursor.c = stringbuilder.toString();
            cursor.a = com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.b;
            cursor.d = eck.a(super.d, 0x7f02022d);
            return cursor.a();
        }
        Uri uri1 = eay.b(((String) (obj)));
        Uri uri = super.c.a(dto.a(cursor.getString(3)));
        if (((String) (obj)).endsWith(":starred"))
        {
            s = super.d.getString(0x7f0803ff);
            uri = eck.a(super.d, 0x7f020238);
        }
        String s1 = super.d.getResources().getQuantityString(0x7f090016, i, new Object[] {
            Integer.valueOf(i)
        });
        obj = new StringBuilder();
        String s2 = cursor.getString(5);
        if (!gcw.a(cursor, 8) && !TextUtils.isEmpty(s2))
        {
            ((StringBuilder) (obj)).append(String.format(super.d.getString(0x7f0803fb), new Object[] {
                s2
            }));
            ((StringBuilder) (obj)).append(" \u2022 ");
        }
        ((StringBuilder) (obj)).append(s1);
        cursor = new ebh(uri1);
        cursor.b = s;
        cursor.a = com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.a;
        cursor.c = ((StringBuilder) (obj)).toString();
        cursor.d = uri;
        return cursor.a();
    }

    protected final da a(Context context, String s)
    {
        if (s.contains(":folder:"))
        {
            context = dtl.b(s);
        } else
        {
            context = dtu.a();
        }
        return new cu(super.d, context, g, null, null);
    }

    public final boolean a(String s)
    {
        return String.valueOf(h).equals(s) || s.contains(":folder:");
    }

}
