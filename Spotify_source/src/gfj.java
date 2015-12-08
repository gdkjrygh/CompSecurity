// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.AsyncQueryHandler;
import android.content.Context;
import android.database.Cursor;
import java.lang.ref.WeakReference;

final class gfj extends AsyncQueryHandler
{

    private WeakReference a;

    public gfj(WeakReference weakreference, Context context)
    {
        super(context.getContentResolver());
        a = weakreference;
    }

    protected final void onQueryComplete(int i, Object obj, Cursor cursor)
    {
        gfi gfi1;
        gfi1 = (gfi)a.get();
        if (gfi1 == null || cursor == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        gfi1.a.a(gfi1, cursor);
        obj = gfi1.b;
        obj;
        JVM INSTR monitorenter ;
        if (gfi1.c != null)
        {
            gfi1.c.unregisterContentObserver(gfi1.e);
            gfi1.c.close();
        }
        if (gfi1.d)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        gfi1.c = cursor;
        gfi1.c.registerContentObserver(gfi1.e);
_L2:
        return;
        cursor.close();
        if (true) goto _L2; else goto _L1
_L1:
        cursor;
        obj;
        JVM INSTR monitorexit ;
        throw cursor;
    }
}
