// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import com.spotify.mobile.android.ui.adapter.SettingsAdapter;

final class ang.Object
    implements an
{

    private fyk a;

    public final da a(Bundle bundle)
    {
        bundle = dtw.a;
        return new cu(a.k(), bundle, fyk.K(), null, null);
    }

    public final void a()
    {
    }

    public final void a(Object obj)
    {
        Cursor cursor = (Cursor)obj;
        if (cursor.moveToFirst())
        {
            obj = fyk.b(a);
            obj.e = cursor.getInt(cursor.getColumnIndexOrThrow("private_session_timeout")) / 3600;
            ((SettingsAdapter) (obj)).a();
            if (cursor.getInt(cursor.getColumnIndexOrThrow("logged_in")) != 0)
            {
                SettingsAdapter settingsadapter = fyk.b(a);
                obj = cursor.getString(cursor.getColumnIndexOrThrow("current_user_name"));
                if (obj == null)
                {
                    obj = "";
                }
                settingsadapter.l = (String)obj;
                settingsadapter.a();
                settingsadapter = fyk.b(a);
                obj = cursor.getString(cursor.getColumnIndexOrThrow("current_user"));
                if (obj == null)
                {
                    obj = "";
                }
                settingsadapter.m = (String)obj;
                settingsadapter.a();
            }
            a.Y = true;
            a.J();
        }
    }

    (fyk fyk1)
    {
        a = fyk1;
        super();
    }
}
