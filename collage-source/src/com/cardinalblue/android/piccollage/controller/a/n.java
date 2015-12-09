// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.a;

import android.content.Context;
import android.content.pm.ActivityInfo;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.a.j;
import com.cardinalblue.android.piccollage.activities.BaseShareActivity;
import com.cardinalblue.android.piccollage.controller.e;
import com.cardinalblue.android.piccollage.model.k;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.a:
//            a

public class n extends a
{

    private ActivityInfo a;
    private final int d;
    private String e;
    private final String f;
    private File g;
    private final BaseShareActivity h;
    private Exception i;

    public n(BaseShareActivity baseshareactivity, int l)
    {
        this(baseshareactivity, l, null, null, "");
    }

    public n(BaseShareActivity baseshareactivity, int l, ActivityInfo activityinfo, String s)
    {
        this(baseshareactivity, l, activityinfo, null, s);
    }

    public n(BaseShareActivity baseshareactivity, int l, ActivityInfo activityinfo, String s, String s1)
    {
        super(baseshareactivity);
        a = null;
        d = l;
        a = activityinfo;
        f = s1;
        h = baseshareactivity;
        if (s == null || s.trim().equals(""))
        {
            e = baseshareactivity.getString(0x7f07025d);
            return;
        } else
        {
            e = s;
            return;
        }
    }

    public n(BaseShareActivity baseshareactivity, int l, String s)
    {
        this(baseshareactivity, l, null, null, s);
    }

    protected transient File a(Void avoid[])
    {
        try
        {
            avoid = h.u();
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            com.cardinalblue.android.piccollage.a.f.a(avoid);
            i = avoid;
            return null;
        }
        if (g == null)
        {
            try
            {
                g = k.a(avoid, "jpg");
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                i = avoid;
                return null;
            }
        }
        if (d == 4)
        {
            return k.a(g, c.getApplicationContext());
        }
        if (d != 8) goto _L2; else goto _L1
_L1:
        avoid = k.b(j.a(c, g, com.cardinalblue.android.b.k.s(), true), c);
        return avoid;
        avoid;
_L4:
        com.cardinalblue.android.piccollage.a.f.a(avoid);
        return null;
_L2:
        try
        {
            avoid = k.b(g, c);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            com.cardinalblue.android.piccollage.a.f.a(avoid);
            return null;
        }
        return avoid;
        avoid;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void a(File file)
    {
        super.onPostExecute(file);
        if (i != null)
        {
            com.cardinalblue.android.b.k.a(c, 0x7f07021d, 1);
            return;
        }
        if (file == null)
        {
            com.cardinalblue.android.b.k.a(c, 0x7f070260, 1);
            return;
        }
        if (d == 4)
        {
            com.cardinalblue.android.b.k.a(h, 0x7f070250, 0);
            return;
        } else
        {
            (new e(h)).a(a, file, e, f);
            return;
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onCancelled()
    {
        super.onCancelled();
        com.cardinalblue.android.b.k.a(c, 0x7f0700f8, 1);
    }

    protected void onPostExecute(Object obj)
    {
        a((File)obj);
    }

    protected void onPreExecute()
    {
        Context context = c;
        int l;
        if (d == 4)
        {
            l = 0x7f070253;
        } else
        {
            l = 0x7f070141;
        }
        super.a(context, l);
    }
}
