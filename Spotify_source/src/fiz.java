// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

public final class fiz
{

    final SimpleDateFormat a = new SimpleDateFormat("d MMM yyyy", Locale.getDefault());
    final Context b;

    public fiz(Context context)
    {
        b = context;
    }

    public static String a(int i)
    {
        int j = i / 60;
        return String.format(Locale.US, "%02d:%02d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i % 60)
        });
    }

    public static String a(Context context, ent ent1, Flags flags)
    {
        int i = ent1.getNumTracksInCollection();
        if (ent1.isFollowed() && i == 0)
        {
            context = context.getString(0x7f08018f);
        } else
        if (ent1.isFollowed())
        {
            context = context.getResources().getQuantityString(0x7f090008, i, new Object[] {
                Integer.valueOf(i)
            });
        } else
        {
            context = context.getResources().getQuantityString(0x7f090007, i, new Object[] {
                Integer.valueOf(i)
            });
        }
        if (eom.c(flags))
        {
            context = null;
        }
        return context;
    }

    public static String a(enw enw1)
    {
        Object obj1 = enw1.getArtists();
        Object obj = enw1.getAlbum();
        if (obj1 != null && ((List) (obj1)).size() > 0 && ((ent)((List) (obj1)).get(0)).getName() != null)
        {
            enw1 = ((ent)((List) (obj1)).get(0)).getName();
        } else
        {
            enw1 = "";
        }
        if (obj != null && ((enr) (obj)).getName() != null)
        {
            obj = ((enr) (obj)).getName();
        } else
        {
            obj = "";
        }
        obj1 = (new StringBuilder()).append(enw1);
        if (!TextUtils.isEmpty(enw1) && !TextUtils.isEmpty(((CharSequence) (obj))))
        {
            enw1 = " \u2022 ";
        } else
        {
            enw1 = "";
        }
        return ((StringBuilder) (obj1)).append(enw1).append(((String) (obj))).toString();
    }

    public final fjb a(fio fio)
    {
        return new fja(this, fio);
    }
}
