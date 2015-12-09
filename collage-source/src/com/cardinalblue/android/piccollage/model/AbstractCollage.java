// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.graphics.Bitmap;
import android.os.Parcelable;
import com.cardinalblue.android.piccollage.model.gson.BaseScrapModel;
import com.cardinalblue.android.piccollage.model.gson.CollageRoot;
import com.cardinalblue.android.piccollage.view.c;
import com.cardinalblue.android.piccollage.view.g;
import com.cardinalblue.android.piccollage.view.k;
import com.google.b.f;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.cardinalblue.android.piccollage.model:
//            h, d

public abstract class AbstractCollage
    implements Parcelable, h
{
    public static interface a
    {

        public abstract void a(AbstractCollage abstractcollage);
    }


    protected boolean a;
    protected com.cardinalblue.android.piccollage.model.gson.PhotoboxTemplateList.PhotoboxTemplate b;
    protected int c;
    protected int d;
    private a e;

    public AbstractCollage()
    {
        a = false;
        c = -1;
        d = -1;
    }

    public int a(float f1, float f2)
    {
        return s().a(f1, f2, w(), v());
    }

    protected d a(String s)
    {
        try
        {
            s = new d(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return com.cardinalblue.android.piccollage.model.d.a();
        }
        return s;
    }

    public final com.cardinalblue.android.piccollage.model.gson.PhotoboxTemplateList.PhotoboxTemplate a()
    {
        return b;
    }

    public final k a(long l1)
    {
        for (Iterator iterator = t().iterator(); iterator.hasNext();)
        {
            k k1 = (k)iterator.next();
            if (k1.U() == l1)
            {
                return k1;
            }
        }

        return null;
    }

    public void a(float f1)
    {
        d d1 = s();
        if (d1 != null)
        {
            d1.a(f1);
            c();
        }
    }

    public void a(int i1, int j1)
    {
        c = i1;
        d = j1;
    }

    public void a(Bitmap bitmap)
        throws IOException
    {
    }

    public void a(a a1)
    {
        e = a1;
    }

    public void a(com.cardinalblue.android.piccollage.model.gson.PhotoboxTemplateList.PhotoboxTemplate photoboxtemplate)
    {
        b = photoboxtemplate;
    }

    public final void a(k k1)
    {
        t().add(k1);
        c();
        Collections.sort(t(), new Comparator() {

            final AbstractCollage a;

            public int a(k k2, k k3)
            {
                return k2.W() - k3.W();
            }

            public int compare(Object obj, Object obj1)
            {
                return a((k)obj, (k)obj1);
            }

            
            {
                a = AbstractCollage.this;
                super();
            }
        });
    }

    public final boolean a(BaseScrapModel basescrapmodel)
    {
        k k1 = a(basescrapmodel.getId());
        if (k1 != null)
        {
            k1.a(basescrapmodel);
            k1.J();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean a(k k1, boolean flag)
    {
        boolean flag1 = t().remove(k1);
        if (flag)
        {
            c();
        }
        return flag1;
    }

    public boolean b()
    {
        return a;
    }

    public void c()
    {
        a = true;
        if (e != null)
        {
            e.a(this);
        }
    }

    public boolean d()
    {
        return p() == -1L;
    }

    public boolean e()
    {
        return false;
    }

    public File f()
    {
        return null;
    }

    public c g()
    {
        for (Iterator iterator = t().iterator(); iterator.hasNext();)
        {
            k k1 = (k)iterator.next();
            if (k1 instanceof c)
            {
                return (c)k1;
            }
        }

        return null;
    }

    public int h()
    {
        Iterator iterator = t().iterator();
        int i1 = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((k)iterator.next()).a())
            {
                i1++;
            }
        } while (true);
        return i1;
    }

    public final String i()
    {
        return CollageRoot.versionedTypeAdapterGson(com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.A3).a(new CollageRoot(this));
    }

    public final String j()
    {
        return CollageRoot.versionedTypeAdapterGson(com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.V5).a(new CollageRoot(this));
    }

    public void k()
    {
    }

    public String l()
    {
        return null;
    }

    public boolean m()
    {
        for (Iterator iterator = t().iterator(); iterator.hasNext();)
        {
            k k1 = (k)iterator.next();
            if ((k1 instanceof g) && ((g)k1).C())
            {
                return true;
            }
        }

        return false;
    }
}
