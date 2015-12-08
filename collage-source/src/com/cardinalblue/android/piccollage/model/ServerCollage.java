// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import com.androidquery.util.a;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.gson.BaseScrapModel;
import com.cardinalblue.android.piccollage.model.gson.CollageRoot;
import com.google.b.t;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cardinalblue.android.piccollage.model:
//            AbstractCollage, d, k

public class ServerCollage extends AbstractCollage
{
    public static class a
        implements android.os.Parcelable.Creator
    {

        public ServerCollage a(Parcel parcel)
        {
            return new ServerCollage(parcel);
        }

        public ServerCollage[] a(int i1)
        {
            return new ServerCollage[i1];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i1)
        {
            return a(i1);
        }

        public a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new a();
    private File e;
    private String f;
    private d g;
    private int h;
    private int i;
    private List j;
    private List k;
    private String l;

    private ServerCollage()
    {
        j = new ArrayList(0);
        k = new ArrayList(0);
    }

    public ServerCollage(Parcel parcel)
    {
        j = new ArrayList(0);
        k = new ArrayList(0);
        a(parcel);
    }

    public static ServerCollage a(CollageRoot collageroot)
    {
        ServerCollage servercollage = new ServerCollage();
        servercollage.c(collageroot.getFrame());
        servercollage.a(collageroot.getTags());
        Iterator iterator = collageroot.getScraps().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.cardinalblue.android.piccollage.view.k k1 = BaseScrapModel.generateScrap((BaseScrapModel)iterator.next());
            if (k1 != null)
            {
                servercollage.t().add(k1);
            }
        } while (true);
        servercollage.a(collageroot.getWidth());
        servercollage.b(collageroot.getHeight());
        return servercollage;
    }

    private void a(Parcel parcel)
    {
        f = parcel.readString();
        e = new File(parcel.readString());
        e(new String(com.cardinalblue.android.b.k.a(new FileInputStream(e))));
_L1:
        Object obj;
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            l = parcel.readString();
        }
        h = parcel.readInt();
        i = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readInt();
        return;
        obj;
_L2:
        com.cardinalblue.android.piccollage.a.f.a(((Throwable) (obj)));
          goto _L1
        obj;
          goto _L2
    }

    private void a(List list)
    {
        k.clear();
        if (list != null)
        {
            k.addAll(list);
        }
    }

    public static ServerCollage d(String s1)
        throws JSONException
    {
        ServerCollage servercollage = new ServerCollage();
        servercollage.e(s1);
        return servercollage;
    }

    private void e(String s1)
        throws JSONException
    {
        CollageRoot collageroot;
        try
        {
            collageroot = (CollageRoot)CollageRoot.versionedTypeAdapterGson(com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.V5).a(s1, com/cardinalblue/android/piccollage/model/gson/CollageRoot);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new JSONException(s1.getMessage());
        }
        if (collageroot != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        g = com.cardinalblue.android.piccollage.model.d.a();
        throw new JSONException("model should not be null after it's deserialized");
        g = a(collageroot.getFrame());
        a(collageroot.getTags());
        s1 = new JSONObject(s1);
        if (!s1.getJSONObject("collage").getJSONObject("json").has("editor_actions"))
        {
            break MISSING_BLOCK_LABEL_127;
        }
        s1 = s1.getJSONObject("collage").getJSONObject("json").getJSONArray("editor_actions");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        l = s1.toString();
        s1 = collageroot.getScraps().iterator();
_L1:
        com.cardinalblue.android.piccollage.view.k k1;
        do
        {
            if (!s1.hasNext())
            {
                break MISSING_BLOCK_LABEL_177;
            }
            k1 = BaseScrapModel.generateScrap((BaseScrapModel)s1.next());
        } while (k1 == null);
        t().add(k1);
          goto _L1
        h = collageroot.getWidth();
        i = collageroot.getHeight();
        return;
    }

    public void a(int i1)
    {
        h = i1;
    }

    public void a(d d1)
    {
        g = d1;
    }

    public void b(int i1)
    {
        i = i1;
    }

    public void b(String s1)
    {
        f = s1;
    }

    public void c(Context context)
    {
    }

    public void c(String s1)
    {
        try
        {
            g = new d(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            g = com.cardinalblue.android.piccollage.model.d.a();
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String n()
    {
        return l;
    }

    public long p()
    {
        return -1L;
    }

    public String r()
    {
        return f;
    }

    public d s()
    {
        return g;
    }

    public List t()
    {
        return j;
    }

    public List u()
    {
        return k;
    }

    public int v()
    {
        return i;
    }

    public int w()
    {
        return h;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        String s1;
        parcel.writeString(f);
        s1 = "";
        String s2;
        if (e == null || !e.exists())
        {
            e = com.cardinalblue.android.piccollage.model.k.b("json");
        }
        com.androidquery.util.a.a(e, j().getBytes());
        s2 = e.getAbsolutePath();
        s1 = s2;
_L1:
        parcel.writeString(s1);
        IOException ioexception;
        int j1;
        if (!TextUtils.isEmpty(l))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        if (i1 != 0)
        {
            parcel.writeString(l);
        }
        parcel.writeInt(h);
        parcel.writeInt(i);
        parcel.writeInt(c);
        parcel.writeInt(d);
        return;
        ioexception;
        com.cardinalblue.android.piccollage.a.f.a(ioexception);
          goto _L1
    }

    public boolean y()
    {
        return h == i;
    }

}
