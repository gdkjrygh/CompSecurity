// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import com.spotify.mobile.android.ui.contextmenu.ItemLoadException;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;

public abstract class fxt extends fui
{

    private final String d;
    private final Context e;
    private final fxu f;

    protected fxt(Context context, String s, fxu fxu1)
    {
        d = s;
        e = context;
        f = fxu1;
    }

    private static boolean b(Cursor cursor)
    {
        return cursor.getCount() == 0 || !duc.a(cursor);
    }

    protected abstract Cursor a(Context context, String s);

    protected final Object a()
    {
        Object obj = null;
        int i = 0;
        do
        {
            Object obj1;
            if (obj != null)
            {
                try
                {
                    Thread.sleep(500L);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1) { }
            }
            obj1 = a(e, d);
            if (obj != null)
            {
                ((Cursor) (obj)).close();
            }
            i++;
            if (!b(((Cursor) (obj1))) || i >= 5)
            {
                if (b(((Cursor) (obj1))))
                {
                    throw new ItemLoadException();
                } else
                {
                    ((Cursor) (obj1)).moveToFirst();
                    obj = a(((Cursor) (obj1)));
                    ((Cursor) (obj1)).close();
                    return obj;
                }
            }
            obj = obj1;
        } while (true);
    }

    protected abstract Object a(Cursor cursor);

    protected final void a(Object obj, SpotifyContextMenu spotifycontextmenu)
    {
        f.a(obj);
    }
}
