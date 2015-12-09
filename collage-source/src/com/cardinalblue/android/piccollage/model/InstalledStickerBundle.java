// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.content.SharedPreferences;
import android.os.Parcel;
import com.cardinalblue.android.b.d;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.controller.o;
import com.cardinalblue.android.piccollage.lib.a;
import com.cardinalblue.android.piccollage.model.gson.AssetSticker;
import com.cardinalblue.android.piccollage.model.gson.AssetStickerBundleInfo;
import com.cardinalblue.android.piccollage.model.gson.Sticker;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.model:
//            StickerBundle, PurchasableStickerBundle, n, InstallRequirement

public class InstalledStickerBundle extends StickerBundle
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public InstalledStickerBundle a(Parcel parcel)
        {
            return new InstalledStickerBundle(parcel);
        }

        public InstalledStickerBundle[] a(int i1)
        {
            return new InstalledStickerBundle[i1];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i1)
        {
            return a(i1);
        }

    };
    protected AssetStickerBundleInfo a;
    private final String c;
    private n d;
    private String e;
    private InstallRequirement f;

    public InstalledStickerBundle(Parcel parcel)
    {
        c = parcel.readString();
        if (b == null)
        {
            b = new ArrayList();
        }
        parcel.readTypedList(b, Sticker.CREATOR);
        try
        {
            p();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            com.cardinalblue.android.piccollage.a.f.a(parcel);
        }
    }

    private InstalledStickerBundle(String s)
        throws IOException
    {
        c = s;
        p();
    }

    public static InstalledStickerBundle a(File file)
        throws IOException
    {
        return new InstalledStickerBundle(com.cardinalblue.android.piccollage.lib.e.a.c.b(file.getAbsolutePath()));
    }

    public static InstalledStickerBundle a(String s)
        throws IOException
    {
        return new InstalledStickerBundle(s);
    }

    private n n()
    {
        Object obj = null;
        n n1;
        if (d != null)
        {
            n1 = d;
        } else
        {
            n1 = obj;
            if (a != null)
            {
                PurchasableStickerBundle purchasablestickerbundle = o.a().b(a.productId);
                n1 = obj;
                if (purchasablestickerbundle != null)
                {
                    d = purchasablestickerbundle.h();
                    return d;
                }
            }
        }
        return n1;
    }

    private void p()
        throws IOException
    {
        Object obj = null;
        Object obj1 = com.cardinalblue.android.piccollage.lib.a.e.a(q()).d();
        obj = obj1;
        a = (AssetStickerBundleInfo)(new com.google.b.f()).a(new InputStreamReader(((java.io.InputStream) (obj1)), "UTF-8"), com/cardinalblue/android/piccollage/model/gson/AssetStickerBundleInfo);
        obj = obj1;
        Object obj2 = a.stickers;
        obj = obj1;
        b = new ArrayList();
        obj = obj1;
        obj2 = ((List) (obj2)).iterator();
_L2:
        obj = obj1;
        if (!((Iterator) (obj2)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        String s1 = ((AssetSticker)((Iterator) (obj2)).next()).url;
        obj = obj1;
        String s = (new StringBuilder()).append(c).append("/").append(s1).toString();
        obj = obj1;
        s1 = (new StringBuilder()).append(c).append("/thumbnail/").append(s1).toString();
        obj = obj1;
        b.add(Sticker.newInstance(s, s1));
        if (true) goto _L2; else goto _L1
        obj1;
        com.cardinalblue.android.b.k.a(((java.io.Closeable) (obj)));
        throw obj1;
_L1:
        com.cardinalblue.android.b.k.a(((java.io.Closeable) (obj1)));
        return;
    }

    private String q()
    {
        return (new StringBuilder(c)).append("/").append("info.json").toString();
    }

    public String a()
    {
        return a.title;
    }

    public void a(InstallRequirement installrequirement)
    {
        f = installrequirement;
    }

    public String b()
    {
        return a.getTitleTranslatedString();
    }

    public void b(String s)
    {
        e = s;
    }

    public String c()
    {
        if (a.description != null)
        {
            return a.description;
        } else
        {
            return "";
        }
    }

    public float d()
    {
        return -1F;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        for (String s = (new StringBuilder(c)).append("/").append("icon.png").toString(); com.cardinalblue.android.piccollage.lib.e.a.a(s).equals(com.cardinalblue.android.piccollage.lib.e.a.e) || (new File(com.cardinalblue.android.piccollage.lib.e.a.c.c(s))).exists();)
        {
            return s;
        }

        PurchasableStickerBundle purchasablestickerbundle = o.a().b(f());
        if (purchasablestickerbundle == null)
        {
            return "";
        } else
        {
            return purchasablestickerbundle.e();
        }
    }

    public String f()
    {
        return a.productId;
    }

    public boolean g()
    {
        return !m();
    }

    public n h()
    {
        return n();
    }

    public boolean i()
    {
        return true;
    }

    public List j()
    {
        return b;
    }

    public InstallRequirement k()
    {
        return f;
    }

    public String l()
    {
        return e;
    }

    public boolean m()
    {
        long l1 = com.cardinalblue.android.b.k.b("cardinalblue_video_ad_metadata2").getLong(f(), System.currentTimeMillis());
        return System.currentTimeMillis() - l1 > com.cardinalblue.android.b.d.i();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeString(c);
        parcel.writeTypedList(b);
    }

}
