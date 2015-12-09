// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.logging.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

public final class gix
{

    private static final gip d = gip.b("displayed_showcases");
    public final WeakReference a;
    public git b;
    private gin c;

    public gix(Context context)
    {
        a = new WeakReference(context);
        c = ((giq)dmz.a(giq)).b(context);
        b = new git();
    }

    private Set a()
    {
        HashSet hashset = new HashSet();
        JSONArray jsonarray = c.a(d, new JSONArray());
        int i = 0;
_L2:
        Object obj = hashset;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        hashset.add(jsonarray.getString(i));
        i++;
        if (true) goto _L2; else goto _L1
        obj;
        Logger.a(((Throwable) (obj)), "Displayed ids of showcases couldn't be deserialized", new Object[0]);
        obj = Collections.emptySet();
_L1:
        return ((Set) (obj));
    }

    public final List a(Flags flags)
    {
        Set set = a();
        ArrayList arraylist = new ArrayList();
        Iterator iterator = b.a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            giu giu1 = (giu)iterator.next();
            if (!set.contains(giu1.a) && giu1.g.a(flags))
            {
                arraylist.add(giu1);
            }
        } while (true);
        return arraylist;
    }

    public final void a(Collection collection)
    {
        HashSet hashset = new HashSet(a());
        JSONArray jsonarray = new JSONArray();
        for (collection = collection.iterator(); collection.hasNext(); hashset.add(((giu)collection.next()).a)) { }
        for (collection = hashset.iterator(); collection.hasNext(); jsonarray.put((String)collection.next())) { }
        c.b().a(d, jsonarray).b();
    }

}
