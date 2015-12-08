// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.snapchat.android.Timber;
import com.snapchat.android.database.DatabaseHelper;
import java.io.File;

public final class kD extends an
{

    private final Activity c;
    private final ll d;

    public kD(Activity activity, ll ll1)
    {
        super(activity);
        c = activity;
        d = ll1;
    }

    private Br d()
    {
        d.b();
        Object obj = getContext();
        long l = SystemClock.elapsedRealtime();
        try
        {
            long l1 = (new File(DatabaseHelper.a(((android.content.Context) (obj))).getWritableDatabase().getPath())).length();
            LO.c((new StringBuilder("UserLoader.loadInBackground DB SIZE ")).append(l1).append(" bytes").toString());
        }
        catch (SQLiteException sqliteexception)
        {
            Timber.e("UserLoader", "Error while opening database: %s", new Object[] {
                sqliteexception.getMessage()
            });
            if (c != null)
            {
                HZ.a(c, false, true);
            }
            return null;
        }
        obj = Br.a(((android.content.Context) (obj)));
        Timber.c("UserLoader", (new StringBuilder("loadInBackground() Elapsed Time: ")).append(SystemClock.elapsedRealtime() - l).toString(), new Object[0]);
        d.c();
        return ((Br) (obj));
    }

    public final Object c()
    {
        return d();
    }

    protected final void onStartLoading()
    {
        forceLoad();
    }

    protected final void onStopLoading()
    {
        a();
    }
}
