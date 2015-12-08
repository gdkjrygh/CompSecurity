// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.graphics.Bitmap;
import android.graphics.PointF;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.controller.CollageController;
import com.cardinalblue.android.piccollage.controller.m;
import com.cardinalblue.android.piccollage.lib.a;
import com.cardinalblue.android.piccollage.model.AbstractCollage;
import com.cardinalblue.android.piccollage.view.g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class b
    implements i
{

    final String a;
    final PointF b;
    final a c;

    public Void a(j j1)
        throws Exception
    {
        Exception exception = j1.f();
        if (exception == null && j1.e() != null)
        {
            try
            {
                j1 = g.a(c.c, (Bitmap)j1.e());
                j1.b(a);
                j1.b(true);
                PhotoProtoActivity.e(c.c).i(j1);
                if (b != null)
                {
                    j1.d(b.x, b.y);
                }
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(c.c, j1);
                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.g(c.c);
            }
            // Misplaced declaration of an exception variable
            catch (j j1)
            {
                f.a(j1);
            }
        } else
        {
            f.a(exception);
            k.a(c.c, 0x7f0701e0, 0);
        }
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    ( , String s, PointF pointf)
    {
        c = ;
        a = s;
        b = pointf;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/activities/PhotoProtoActivity$42

/* anonymous class */
    class PhotoProtoActivity._cls42
        implements Callable
    {

        final ArrayList a;
        final PhotoProtoActivity b;

        public Object call()
            throws Exception
        {
            int i1 = Math.min(a.size(), 30);
            int l = PhotoProtoActivity.d(b).w();
            int j1 = PhotoProtoActivity.d(b).v();
            List list;
            boolean flag;
            if (PhotoProtoActivity.e(b).n() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            list = m.a(l, j1, i1, flag, com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.f(b));
            l = 0;
            while (l < i1) 
            {
                PointF pointf = (PointF)list.get(l);
                String s = (String)a.get(l);
                try
                {
                    com.cardinalblue.android.piccollage.lib.a.e.a(s).b(150).a(new PhotoProtoActivity._cls42._cls1(this, s, pointf), k.a);
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    f.a(new IllegalArgumentException((new StringBuilder()).append("Can not create ImageLoader from uri [").append(s).append("]").toString()));
                }
                l++;
            }
            if (a.size() > 30)
            {
                k.a(b, b.getString(0x7f0702a4, new Object[] {
                    Integer.valueOf(30)
                }), 0);
            }
            return null;
        }

            
            {
                b = photoprotoactivity;
                a = arraylist;
                super();
            }
    }

}
