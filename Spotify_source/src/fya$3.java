// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;

final class ang.Object
    implements an
{

    private fya a;

    public final da a(Bundle bundle)
    {
        bundle = dtn.a;
        return new cu(a.k(), bundle, fya.H(), null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (((Cursor) (obj)).moveToFirst())
        {
            fya fya1;
            int i;
            int j;
            boolean flag;
            if (((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("capping_enabled")) != 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("should_show_remaining_time")) != 0)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            fya1 = a;
            if (i != 0 && j != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            fya.a(fya1, flag);
            if (fya.d(a))
            {
                j = ((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("remaining_playback_time"));
                i = j / 3600;
                j = (j - i * 3600) / 60;
                obj = a.l();
                fya.e(a).setText((new StringBuilder()).append(((Resources) (obj)).getString(0x7f08015e)).append(" ").append(((Resources) (obj)).getQuantityString(0x7f090004, i, new Object[] {
                    Integer.valueOf(i)
                })).append(" ").append(((Resources) (obj)).getQuantityString(0x7f090005, j, new Object[] {
                    Integer.valueOf(j)
                })).toString());
            }
            fya.f(a);
        }
    }

    (fya fya1)
    {
        a = fya1;
        super();
    }
}
