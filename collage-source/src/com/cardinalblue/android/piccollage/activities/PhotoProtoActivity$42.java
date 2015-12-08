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

class a
    implements Callable
{

    final ArrayList a;
    final PhotoProtoActivity b;

    public Object call()
        throws Exception
    {
        int l = Math.min(a.size(), 30);
        int i = PhotoProtoActivity.d(b).w();
        int i1 = PhotoProtoActivity.d(b).v();
        List list;
        boolean flag;
        if (PhotoProtoActivity.e(b).n() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        list = m.a(i, i1, l, flag, com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.f(b));
        i = 0;
        while (i < l) 
        {
            PointF pointf = (PointF)list.get(i);
            String s = (String)a.get(i);
            try
            {
                com.cardinalblue.android.piccollage.lib.ity._cls42.a(s).b(150).a(new i(s, pointf) {

                    final String a;
                    final PointF b;
                    final PhotoProtoActivity._cls42 c;

                    public Void a(j j1)
                        throws Exception
                    {
                        Exception exception = j1.f();
                        if (exception == null && j1.e() != null)
                        {
                            try
                            {
                                j1 = g.a(c.b, (Bitmap)j1.e());
                                j1.b(a);
                                j1.b(true);
                                PhotoProtoActivity.e(c.b).i(j1);
                                if (b != null)
                                {
                                    j1.d(b.x, b.y);
                                }
                                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.a(c.b, j1);
                                com.cardinalblue.android.piccollage.activities.PhotoProtoActivity.g(c.b);
                            }
                            // Misplaced declaration of an exception variable
                            catch (j j1)
                            {
                                f.a(j1);
                            }
                        } else
                        {
                            f.a(exception);
                            k.a(c.b, 0x7f0701e0, 0);
                        }
                        return null;
                    }

                    public Object then(j j1)
                        throws Exception
                    {
                        return a(j1);
                    }

            
            {
                c = PhotoProtoActivity._cls42.this;
                a = s;
                b = pointf;
                super();
            }
                }, k.a);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                f.a(new IllegalArgumentException((new StringBuilder()).append("Can not create ImageLoader from uri [").append(s).append("]").toString()));
            }
            i++;
        }
        if (a.size() > 30)
        {
            k.a(b, b.getString(0x7f0702a4, new Object[] {
                Integer.valueOf(30)
            }), 0);
        }
        return null;
    }

    _cls1.b(PhotoProtoActivity photoprotoactivity, ArrayList arraylist)
    {
        b = photoprotoactivity;
        a = arraylist;
        super();
    }
}
