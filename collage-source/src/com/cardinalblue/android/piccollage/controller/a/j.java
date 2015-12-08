// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.a;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.controller.f;
import com.cardinalblue.android.piccollage.model.gson.DownloadMedia;
import com.cardinalblue.android.piccollage.model.gson.DownloadMediaList;
import com.cardinalblue.android.piccollage.model.gson.DownloadMediaListResponse;
import com.cardinalblue.android.piccollage.model.gson.Media;
import com.cardinalblue.android.piccollage.model.gson.MediaList;
import com.cardinalblue.android.piccollage.view.a.n;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.a.d.d;
import org.b.a.a.b;
import org.b.a.a.c;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.a:
//            a

public class j extends a
{

    private final Context a;
    private final com.cardinalblue.android.piccollage.model.j d;
    private final n e;

    public j(Context context, com.cardinalblue.android.piccollage.model.j j1, n n1)
    {
        super(context);
        a = context;
        d = j1;
        e = n1;
    }

    private Throwable a(List list)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = null;
        obj = new TreeMap();
        Media media;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ((Map) (obj)).put(media.getId(), media))
        {
            media = (Media)iterator.next();
        }

        list = d.a(list, "medium");
        if (list.d() != 200)
        {
            throw new Exception(a.getString(0x7f0701f1));
        }
          goto _L1
        list;
        obj = null;
_L7:
        b b1;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return list;
            }
        }
        return list;
_L1:
        list = list.c();
        b1 = new b(list, "UTF-8", com.cardinalblue.android.piccollage.model.j.a);
        obj3 = (DownloadMediaListResponse)k.b(org.a.f.b.a(b1.a().a()), com/cardinalblue/android/piccollage/model/gson/DownloadMediaListResponse);
        if (!((DownloadMediaListResponse) (obj3)).isOk())
        {
            throw new Exception(a.getString(0x7f0700f8));
        }
        obj4 = ((DownloadMediaListResponse) (obj3)).getDownloadMediaListObject().getList();
        obj3 = new TreeMap();
        for (obj4 = ((List) (obj4)).iterator(); ((Iterator) (obj4)).hasNext(); ((Map) (obj3)).put(((DownloadMedia) (obj5)).getMediaDataFileName(), ((Map) (obj)).get(((DownloadMedia) (obj5)).getId())))
        {
            obj5 = (DownloadMedia)((Iterator) (obj4)).next();
        }

          goto _L2
        obj;
        obj1 = obj2;
_L5:
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (list != null)
        {
            try
            {
                list.close();
            }
            // Misplaced declaration of an exception variable
            catch (List list) { }
        }
        throw obj;
_L2:
        obj4 = new android.graphics.BitmapFactory.Options();
        obj4.inPreferredConfig = f.e;
        obj4.inDither = true;
        obj4.inTempStorage = new byte[0x10000];
_L3:
        obj = b1.a();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_396;
        }
        obj6 = ((c) (obj)).b("Content-Type").split("name=")[1];
        obj = ((c) (obj)).a();
        try
        {
            obj5 = BitmapFactory.decodeStream(((InputStream) (obj)), null, ((android.graphics.BitmapFactory.Options) (obj4)));
            obj6 = (Media)((Map) (obj3)).get(obj6);
            ((Media) (obj6)).setThumbnail(((android.graphics.Bitmap) (obj5)));
            ((InputStream) (obj)).close();
        }
        catch (Throwable throwable)
        {
            List list1 = list;
            list = throwable;
            throwable = ((Throwable) (obj));
            obj = list1;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj1 = obj;
            obj = exception;
        }
        publishProgress(new Media[] {
            obj6
        });
          goto _L3
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (list != null)
        {
            try
            {
                list.close();
            }
            // Misplaced declaration of an exception variable
            catch (List list) { }
        }
        return null;
        obj;
        list = null;
        obj1 = obj2;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L5; else goto _L4
_L4:
        Throwable throwable1;
        throwable1;
        obj = list;
        list = throwable1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected transient Throwable a(String as[])
    {
        MediaList medialist;
        Object obj;
        medialist = null;
        obj = null;
        if (as != null) goto _L2; else goto _L1
_L1:
        String s;
        return ((Throwable) (obj));
_L2:
        if (TextUtils.isEmpty(s = as[0])) goto _L1; else goto _L3
_L3:
        int l = 1;
        int i;
        try
        {
            obj = d.a(s, 1);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            return as;
        }
        as = medialist;
        medialist = ((MediaList) (obj));
        i = l;
        if (((MediaList) (obj)).getMediaListCount() == 0)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        as = a(((MediaList) (obj)).getList());
        i = l;
        medialist = ((MediaList) (obj));
_L7:
        obj = as;
        if (as != null) goto _L1; else goto _L4
_L4:
        obj = as;
        if (!medialist.hasNextPage()) goto _L1; else goto _L5
_L5:
        l = i + 1;
        obj = d.a(s, l);
        medialist = ((MediaList) (obj));
        i = l;
        if (((MediaList) (obj)).getMediaListCount() == 0) goto _L7; else goto _L6
_L6:
        as = a(((MediaList) (obj)).getList());
        medialist = ((MediaList) (obj));
        i = l;
          goto _L7
    }

    protected void a(Throwable throwable)
    {
        super.onPostExecute(throwable);
        if (throwable != null)
        {
            String s = throwable.getLocalizedMessage();
            if (throwable instanceof IOException)
            {
                s = a.getString(0x7f0701f1);
            }
            throwable = (new android.app.AlertDialog.Builder(a)).setTitle(0x1040014).setMessage(s).create();
            k.a(a, this, throwable);
        }
    }

    protected transient void a(Media amedia[])
    {
        int l = amedia.length;
        for (int i = 0; i < l; i++)
        {
            Media media = amedia[i];
            e.add(media);
        }

    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Throwable)obj);
    }

    protected void onPreExecute()
    {
        super.a(a, 0x7f0701fa);
    }

    protected void onProgressUpdate(Object aobj[])
    {
        a((Media[])aobj);
    }
}
