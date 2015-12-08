// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

final class iki
    implements ekr
{

    private static final Set a = Collections.singleton("media_key");
    private final Context b;
    private final eme c;
    private final elp d;

    iki(Context context)
    {
        b = context;
        d = new elp(context, ikf);
        c = (new eme()).a(new ikg(context, d));
    }

    private List a(int i, ekk ekk)
    {
        ArrayList arraylist;
        Object obj;
        obj = mvj.b(b, i);
        arraylist = new ArrayList();
        obj = new mvu(((android.database.sqlite.SQLiteDatabase) (obj)));
        obj.a = "envelopes";
        obj.b = d.a(a, ekk);
        obj.c = "is_joined = 1";
        obj.f = "created_time_ms DESC";
        obj = ((mvu) (obj)).a();
        while (((Cursor) (obj)).moveToNext()) 
        {
            arraylist.add(new ikd(i, ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("media_key")), d.a(i, obj, ekk)));
        }
        break MISSING_BLOCK_LABEL_138;
        ekk;
        ((Cursor) (obj)).close();
        throw ekk;
        ((Cursor) (obj)).close();
        return arraylist;
    }

    public final ejy a(Class class1)
    {
        throw new UnsupportedOperationException("Not implemented");
    }

    public final elb a(ekg ekg, ekk ekk)
    {
        ekg = (ekq)ekg;
        if (ekg instanceof ikd)
        {
            return c.a(ekg, ekk);
        } else
        {
            ekg = String.valueOf(ekg);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekg).length() + 36)).append("Can not load features for media in: ").append(ekg).toString());
        }
    }

    public final elb a(ekq ekq1, ekk ekk)
    {
        if (ekq1 instanceof iiw)
        {
            ekq1 = (iiw)ekq1;
            try
            {
                ekq1 = b.b(a(((iiw) (ekq1)).a, ekk));
            }
            // Misplaced declaration of an exception variable
            catch (ekq ekq1)
            {
                return b.a(ekq1);
            }
            return ekq1;
        } else
        {
            ekq1 = String.valueOf(ekq1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq1).length() + 36)).append("Can not load child collections for: ").append(ekq1).toString());
        }
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.sharedmedia.SharedCore";
    }

    public final void a(ekq ekq1, ContentObserver contentobserver)
    {
        ContentResolver contentresolver = b.getContentResolver();
        if (ekq1 instanceof ikd)
        {
            ekq1 = (ikd)ekq1;
            contentresolver.registerContentObserver(eum.a(((ikd) (ekq1)).a, ((ikd) (ekq1)).b), false, contentobserver);
            return;
        }
        if (ekq1 instanceof iiw)
        {
            contentresolver.registerContentObserver(eum.a(((iiw)ekq1).a), true, contentobserver);
            return;
        } else
        {
            ekq1 = String.valueOf(ekq1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq1).length() + 30)).append("Can not register observer for ").append(ekq1).toString());
        }
    }

    public final void b(ekq ekq1, ContentObserver contentobserver)
    {
        ContentResolver contentresolver = b.getContentResolver();
        if (ekq1 instanceof ikd)
        {
            contentresolver.unregisterContentObserver(contentobserver);
            return;
        }
        if (ekq1 instanceof iiw)
        {
            contentresolver.unregisterContentObserver(contentobserver);
            return;
        } else
        {
            ekq1 = String.valueOf(ekq1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ekq1).length() + 32)).append("Can not unregister observer for ").append(ekq1).toString());
        }
    }

}
