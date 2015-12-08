// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.a;

import android.content.Context;
import android.content.Intent;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.controller.CollageController;
import com.cardinalblue.android.piccollage.model.gson.DownloadMediaList;
import com.cardinalblue.android.piccollage.model.gson.DownloadMediaListResponse;
import com.cardinalblue.android.piccollage.model.j;
import com.cardinalblue.android.piccollage.view.PhotoProtoView;
import com.cardinalblue.android.piccollage.view.g;
import com.cardinalblue.android.piccollage.view.h;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Locale;
import org.a.d.d;
import org.b.a.a.b;
import org.b.a.a.c;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.a:
//            a

public class i extends a
{

    private final PhotoProtoView a;
    private final j d;
    private final CollageController e;

    public i(PhotoProtoView photoprotoview, j j1, CollageController collagecontroller)
    {
        super(photoprotoview.getContext());
        a = photoprotoview;
        d = j1;
        e = collagecontroller;
    }

    protected transient Throwable a(Intent aintent[])
    {
        Object obj;
        int l;
        l = 0;
        obj = null;
        if (aintent != null) goto _L2; else goto _L1
_L1:
        Object obj1 = null;
_L5:
        return ((Throwable) (obj1));
_L2:
        obj1 = aintent[0].getStringArrayListExtra("photo_ids");
        if (obj1 == null || ((ArrayList) (obj1)).size() == 0)
        {
            return null;
        }
        aintent = d.a(((ArrayList) (obj1)), "large");
        if (aintent.d() != 200)
        {
            throw new Exception(a.getContext().getString(0x7f0701f1));
        }
          goto _L3
        aintent;
_L8:
        obj1 = aintent;
        if (obj == null) goto _L5; else goto _L4
_L4:
        IOException ioexception;
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            return aintent;
        }
        return aintent;
_L3:
        aintent = aintent.c();
        b b1;
        int i1;
        b1 = new b(aintent, "UTF-8", j.a);
        ioexception = (DownloadMediaListResponse)k.b(org.a.f.b.a(b1.a().a()), com/cardinalblue/android/piccollage/model/gson/DownloadMediaListResponse);
        if (!ioexception.isOk())
        {
            throw new Exception(a.getContext().getString(0x7f0700f8));
        }
        i1 = ioexception.getDownloadMediaListObject().getMediaListCount();
        if (i1 == 0)
        {
            Exception exception;
            Object obj2;
            StringBuilder stringbuilder;
            if (aintent != null)
            {
                try
                {
                    aintent.close();
                }
                // Misplaced declaration of an exception variable
                catch (Intent aintent[]) { }
            }
            return null;
        }
        ioexception = b1.a();
        if (ioexception == null) goto _L7; else goto _L6
_L6:
        obj2 = ioexception.b("Content-Type").split(";name=")[0].toLowerCase(Locale.getDefault());
        ioexception = com.cardinalblue.android.piccollage.model.k.a(a.getContext(), ioexception.a(), ((String) (obj2)));
        ioexception = h.a(a.getContext(), ioexception);
        obj2 = com.cardinalblue.android.piccollage.lib.e.a.g;
        stringbuilder = (new StringBuilder()).append("kddi/");
        i1 = l + 1;
        ioexception.b(((com.cardinalblue.android.piccollage.lib.e.a) (obj2)).b(stringbuilder.append((String)((ArrayList) (obj1)).get(l)).toString()));
        e.i(ioexception);
        publishProgress(new com.cardinalblue.android.piccollage.view.k[] {
            ioexception
        });
        l = i1;
        break MISSING_BLOCK_LABEL_183;
        ioexception;
_L11:
        try
        {
            f.a(ioexception);
            break MISSING_BLOCK_LABEL_183;
        }
        catch (Exception exception1)
        {
            ioexception = aintent;
            aintent = exception1;
        }
        finally
        {
            ioexception = aintent;
            aintent = exception;
        }
          goto _L8
_L10:
        if (ioexception != null)
        {
            try
            {
                ioexception.close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception) { }
        }
        throw aintent;
_L7:
        if (aintent != null)
        {
            try
            {
                aintent.close();
            }
            // Misplaced declaration of an exception variable
            catch (Intent aintent[]) { }
        }
        return null;
        aintent;
        ioexception = null;
        if (true) goto _L10; else goto _L9
_L9:
        ioexception;
        l = i1;
          goto _L11
    }

    protected void a(Throwable throwable)
    {
        super.onPostExecute(throwable);
        if (throwable != null)
        {
            throwable = (new android.app.AlertDialog.Builder(a.getContext())).setTitle(0x1040014).setMessage(throwable.getLocalizedMessage()).create();
            k.a(a.getContext(), this, throwable);
        }
    }

    protected transient void a(com.cardinalblue.android.piccollage.view.k ak[])
    {
        if (e != null)
        {
            int i1 = ak.length;
            int l = 0;
            while (l < i1) 
            {
                com.cardinalblue.android.piccollage.view.k k1 = ak[l];
                e.a(k1, true);
                l++;
            }
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Intent[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Throwable)obj);
    }

    protected void onPreExecute()
    {
        super.a(a.getContext(), 0x7f0701fa);
    }

    protected void onProgressUpdate(Object aobj[])
    {
        a((com.cardinalblue.android.piccollage.view.k[])aobj);
    }
}
