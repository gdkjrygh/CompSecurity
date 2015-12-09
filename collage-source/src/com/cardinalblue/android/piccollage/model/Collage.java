// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.activities.PhotoProtoActivity;
import com.cardinalblue.android.piccollage.model.a.a;
import com.cardinalblue.android.piccollage.model.gson.BaseScrapModel;
import com.cardinalblue.android.piccollage.model.gson.CollageRoot;
import com.cardinalblue.android.piccollage.model.gson.ImageScrapModel;
import com.cardinalblue.android.piccollage.view.g;
import com.cardinalblue.android.piccollage.view.h;
import com.cardinalblue.android.piccollage.view.n;
import com.google.b.t;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.cardinalblue.android.piccollage.model:
//            AbstractCollage, d, k

public class Collage extends AbstractCollage
{
    public static class a
        implements android.os.Parcelable.Creator
    {

        public Collage a(Parcel parcel)
        {
            return new Collage(parcel);
        }

        public Collage[] a(int i1)
        {
            return new Collage[i1];
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
    private long e;
    private File f;
    private File g;
    private long h;
    private String i;
    private d j;
    private int k;
    private int l;
    private String m;
    private List n;
    private List o;
    private boolean p;
    private File q;

    private Collage()
    {
        j = com.cardinalblue.android.piccollage.model.d.a();
        n = Collections.synchronizedList(new ArrayList());
        e = -1L;
        o = new ArrayList();
    }

    private Collage(ContentValues contentvalues)
        throws JSONException
    {
        j = com.cardinalblue.android.piccollage.model.d.a();
        n = Collections.synchronizedList(new ArrayList());
        Object obj = com.cardinalblue.android.piccollage.model.k.d(contentvalues.getAsString("thumb_path"));
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = new File(((String) (obj)));
        } else
        {
            obj = null;
        }
        f = ((File) (obj));
        obj = com.cardinalblue.android.piccollage.model.k.d(contentvalues.getAsString("background_path"));
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = new File(((String) (obj)));
        } else
        {
            obj = new File("");
        }
        g = ((File) (obj));
        b(contentvalues.getAsLong("_id").longValue());
        h = contentvalues.getAsLong("modified_time").longValue();
        i = contentvalues.getAsString("caption");
        obj = contentvalues.getAsString("frame");
        try
        {
            j = new d(((String) (obj)));
        }
        catch (JSONException jsonexception)
        {
            j = com.cardinalblue.android.piccollage.model.d.a();
        }
        contentvalues = contentvalues.getAsString("struct_json");
        p = TextUtils.isEmpty(contentvalues);
        if (p)
        {
            k = com.cardinalblue.android.b.k.c();
            l = com.cardinalblue.android.b.k.d() - com.cardinalblue.android.b.k.n();
            o = new ArrayList();
            z();
        } else
        {
            b(contentvalues, com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.A3);
            if (!d() && g() == null)
            {
                contentvalues = A();
                if (contentvalues != null)
                {
                    n.add(contentvalues);
                    return;
                }
            }
        }
    }

    public Collage(Parcel parcel)
    {
        j = com.cardinalblue.android.piccollage.model.d.a();
        n = Collections.synchronizedList(new ArrayList());
        a(parcel);
    }

    private g A()
    {
        return d("assets://backgrounds/bg_old_01.png");
    }

    public static Intent a(Context context)
    {
        return b(context, "com.cardinalblue.piccollage.action.compose");
    }

    public static Intent a(Context context, String s1)
    {
        context = b(context, "com.cardinalblue.piccollage.action.stickerstore");
        context.putExtra("extra_sticker_bundle", s1);
        return context;
    }

    public static Intent a(Context context, String s1, String s2, String s3)
    {
        if (TextUtils.isEmpty(s3) || TextUtils.isEmpty(s1))
        {
            return null;
        } else
        {
            context = b(context, "com.cardinalblue.piccollage.action.echo");
            context.putExtra("extra_echoed_collage_id", s1);
            context.putExtra("extra_start_from", s2);
            context.putExtra("extra_echo_template", s3);
            context.putExtra("extra_collage", a(false));
            return context;
        }
    }

    public static Collage a(Cursor cursor)
    {
        ContentValues contentvalues = new ContentValues();
        DatabaseUtils.cursorRowToContentValues(cursor, contentvalues);
        try
        {
            cursor = new Collage(contentvalues);
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            com.cardinalblue.android.piccollage.a.f.a(cursor);
            return null;
        }
        return cursor;
    }

    public static Collage a(String s1, com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum versionenum)
        throws JSONException
    {
        Collage collage = new Collage();
        collage.b(s1, versionenum);
        return collage;
    }

    public static Collage a(boolean flag)
    {
        Collage collage = new Collage();
        collage.k = n();
        int i1;
        if (flag)
        {
            i1 = n();
        } else
        {
            i1 = o();
        }
        collage.l = i1;
        return collage;
    }

    private void a(SQLiteDatabase sqlitedatabase)
    {
        ContentValues contentvalues = com.cardinalblue.android.piccollage.model.a.a.a(q(), f(), r(), s().toString(), i());
        com.cardinalblue.android.piccollage.a.b.L();
        if (d())
        {
            b(sqlitedatabase.insert("collages", null, contentvalues));
            return;
        } else
        {
            sqlitedatabase.update("collages", contentvalues, (new StringBuilder()).append("_id=").append(e).toString(), null);
            return;
        }
    }

    private void a(Parcel parcel)
    {
        e = parcel.readLong();
        Object obj = parcel.readString();
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = new File("");
        } else
        {
            obj = new File(((String) (obj)));
        }
        f = ((File) (obj));
        obj = parcel.readString();
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = null;
        } else
        {
            obj = new File(((String) (obj)));
        }
        g = ((File) (obj));
        h = parcel.readLong();
        q = new File(parcel.readString());
        e(new String(com.cardinalblue.android.b.k.a(new FileInputStream(q))));
_L2:
        i = parcel.readString();
        c = parcel.readInt();
        d = parcel.readInt();
        return;
        Object obj1;
        obj1;
_L3:
        com.cardinalblue.android.piccollage.a.f.a(((Throwable) (obj1)));
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
          goto _L3
    }

    private void a(CollageRoot collageroot)
    {
        switch (collageroot.getVersion())
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            int i1 = com.cardinalblue.android.b.k.n();
            l = l - i1;
            com.cardinalblue.android.piccollage.view.k k1;
            for (Iterator iterator = n.iterator(); iterator.hasNext(); k1.d(k1.K(), k1.L() - (float)i1))
            {
                k1 = (com.cardinalblue.android.piccollage.view.k)iterator.next();
            }

            // fall through

        case 3: // '\003'
            collageroot.setVersion(3);
            return;
        }
    }

    private static Intent b(Context context, String s1)
    {
        context = new Intent(context, com/cardinalblue/android/piccollage/activities/PhotoProtoActivity);
        context.setAction(s1);
        return context;
    }

    public static Collage b(com.cardinalblue.android.piccollage.model.gson.PhotoboxTemplateList.PhotoboxTemplate photoboxtemplate)
    {
        Collage collage = new Collage();
        ImageScrapModel imagescrapmodel = ImageScrapModel.newBackgroundModel(photoboxtemplate.getBackgroundUrl());
        collage.t().add(com.cardinalblue.android.piccollage.view.h.a(com.cardinalblue.android.b.k.a(), imagescrapmodel));
        collage.a(photoboxtemplate);
        float f1 = photoboxtemplate.getPrintingSizeRatio();
        int i1 = n();
        int j1 = o();
        if ((1.0F * (float)j1) / (float)i1 > f1)
        {
            collage.k = i1;
            collage.l = (int)(f1 * (float)i1);
            return collage;
        } else
        {
            collage.k = (int)((float)j1 / f1);
            collage.l = j1;
            return collage;
        }
    }

    private void b(String s1, com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum versionenum)
    {
        if (TextUtils.isEmpty(s1))
        {
            return;
        }
        s1 = (CollageRoot)CollageRoot.versionedTypeAdapterGson(versionenum).a(s1, com/cardinalblue/android/piccollage/model/gson/CollageRoot);
        k = s1.getWidth();
        l = s1.getHeight();
        j = a(s1.getFrame());
        o = s1.getTags();
        m = s1.getLogName();
        b = s1.getKiteTemplateModel();
        versionenum = s1.getScraps().iterator();
_L1:
        com.cardinalblue.android.piccollage.view.k k1;
        if (!versionenum.hasNext())
        {
            break MISSING_BLOCK_LABEL_131;
        }
        k1 = BaseScrapModel.generateScrap((BaseScrapModel)versionenum.next());
        if (k1 != null)
        {
            try
            {
                n.add(k1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                com.cardinalblue.android.piccollage.a.f.a(s1);
                return;
            }
        }
          goto _L1
        a(s1);
        k();
        return;
    }

    public static g d(String s1)
    {
        byte abyte0[] = com.androidquery.util.a.a(com.cardinalblue.android.b.k.a().getAssets().open("background-scrap-stub.json"));
        ImageScrapModel imagescrapmodel = (ImageScrapModel)CollageRoot.versionedTypeAdapterGson(com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.A3).a(new String(abyte0), com/cardinalblue/android/piccollage/model/gson/ImageScrapModel);
        imagescrapmodel.getImage().setSourceUrl(s1);
        s1 = com.cardinalblue.android.piccollage.view.h.a(com.cardinalblue.android.b.k.a(), imagescrapmodel);
        return s1;
        s1;
_L2:
        com.cardinalblue.android.piccollage.a.f.a(s1);
        return null;
        s1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void e(String s1)
        throws JSONException
    {
        try
        {
            s1 = (CollageRoot)CollageRoot.versionedTypeAdapterGson(com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.A3).a(s1, com/cardinalblue/android/piccollage/model/gson/CollageRoot);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new JSONException(s1.getMessage());
        }
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        j = com.cardinalblue.android.piccollage.model.d.a();
        throw new JSONException("model should not be null after it's deserialized");
        k = s1.getWidth();
        l = s1.getHeight();
        j = a(s1.getFrame());
        m = s1.getLogName();
        b = s1.getKiteTemplateModel();
        o = new ArrayList();
        if (s1.getTags() != null)
        {
            o.addAll(s1.getTags());
        }
        s1 = s1.getScraps().iterator();
_L2:
        com.cardinalblue.android.piccollage.view.k k1;
        do
        {
            if (!s1.hasNext())
            {
                break MISSING_BLOCK_LABEL_178;
            }
            k1 = BaseScrapModel.generateScrap((BaseScrapModel)s1.next());
        } while (k1 == null);
        n.add(k1);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static int n()
    {
        return com.cardinalblue.android.b.k.c();
    }

    public static int o()
    {
        return com.cardinalblue.android.b.k.d() - com.cardinalblue.android.b.k.m();
    }

    private void z()
    {
        Object obj;
        File file;
        file = f();
        obj = null;
        Bitmap bitmap = com.cardinalblue.android.piccollage.model.k.a(file);
        obj = bitmap;
_L1:
        k.a a1;
        if (obj != null)
        {
            g g1 = com.cardinalblue.android.piccollage.view.h.a(com.cardinalblue.android.b.k.a(), ((Bitmap) (obj)), com.cardinalblue.android.piccollage.view.h.a.b);
            g1.a(file);
            g1.c(true);
            obj = g1;
            if (TextUtils.isEmpty(g1.i()))
            {
                g1.b(g1.k().getAbsolutePath());
                obj = g1;
            }
        } else
        {
            obj = A();
        }
        if (obj != null)
        {
            n.add(obj);
        }
        return;
        a1;
        com.cardinalblue.android.piccollage.a.f.a(a1);
          goto _L1
    }

    public void a(int i1)
    {
        if (k == i1)
        {
            return;
        }
        if (i1 <= 0)
        {
            com.cardinalblue.android.piccollage.a.f.a(new IllegalArgumentException((new StringBuilder()).append("width should not be negative : ").append(i1).toString()));
        }
        k = i1;
        c();
    }

    public void a(int i1, int j1)
    {
        super.a(i1, j1);
        if (d() && k == -1 && l == -1)
        {
            k = i1;
            l = j1;
        }
    }

    public void a(Bitmap bitmap)
        throws IOException
    {
        if (d())
        {
            a(com.cardinalblue.android.piccollage.model.a.a.a(com.cardinalblue.android.b.k.a()).getWritableDatabase());
        }
        File file;
        try
        {
            bitmap = com.cardinalblue.android.piccollage.model.k.a(bitmap);
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            throw new IOException(bitmap);
        }
        file = com.cardinalblue.android.piccollage.model.k.a(p(), "jpg");
        com.cardinalblue.android.b.k.a(bitmap, file);
        a(file);
    }

    public void a(d d1)
    {
        j = d1;
        c();
    }

    public void a(File file)
    {
        f = file;
        c();
    }

    public Intent b(Context context)
    {
        context = new Intent(context, com/cardinalblue/android/piccollage/activities/PhotoProtoActivity);
        context.setAction("com.cardinalblue.piccollage.action.compose");
        if (b != null)
        {
            context.putExtra("extra_photobox_product_id", b.getTemplateId());
        }
        context.putExtra("extra_collage", this);
        return context;
    }

    public void b(int i1)
    {
        if (l == i1)
        {
            return;
        }
        if (i1 <= 0)
        {
            com.cardinalblue.android.piccollage.a.f.a(new IllegalArgumentException((new StringBuilder()).append("height should not be negative : ").append(i1).toString()));
        }
        l = i1;
        c();
    }

    public void b(long l1)
    {
        e = l1;
    }

    public void b(String s1)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "";
        }
        i = s2;
        c();
    }

    public void c(Context context)
    {
        SQLiteDatabase sqlitedatabase;
        context = com.cardinalblue.android.piccollage.model.a.a.a(context);
        sqlitedatabase = context.getWritableDatabase();
        a(sqlitedatabase);
        if (context != null)
        {
            context.close();
        }
        a = false;
        return;
        Exception exception;
        exception;
        if (context != null)
        {
            context.close();
        }
        throw exception;
    }

    public void c(String s1)
    {
        a(a(s1));
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return p;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof Collage))
        {
            obj = (Collage)obj;
            if (e == ((Collage) (obj)).e)
            {
                return true;
            }
        }
        return false;
    }

    public File f()
    {
        return g;
    }

    public void k()
    {
        boolean flag1 = false;
        if (d != -1 && l != -1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        float f3;
        float f4;
        Iterator iterator;
        boolean flag;
        if (!TextUtils.isEmpty(l()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (w() == c)
        {
            flag = flag1;
            if (v() == d)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        flag = true;
        if (!flag) goto _L1; else goto _L3
_L3:
        float f1 = Math.min((float)c / (float)w(), (float)d / (float)v());
        f3 = ((float)c * 1.0F) / (float)w();
        f4 = ((float)d * 1.0F) / (float)v();
        for (iterator = t().iterator(); iterator.hasNext();)
        {
            com.cardinalblue.android.piccollage.view.k k1 = (com.cardinalblue.android.piccollage.view.k)iterator.next();
            float f5 = k1.K() * f3;
            float f6 = k1.L() * f4;
            if (k1 instanceof n)
            {
                k1.a(f5, f6, 3F * f1, k1.Q());
            } else
            {
                k1.a(f5, f6, f1, k1.Q());
            }
        }

        k = c;
        l = d;
        return;
        if (l == d) goto _L1; else goto _L4
_L4:
        int i1 = l;
        float f2 = ((float)d * 1.0F) / (float)i1;
        com.cardinalblue.android.piccollage.view.k k2;
        for (Iterator iterator1 = n.iterator(); iterator1.hasNext(); k2.d(k2.K(), k2.L() * f2))
        {
            k2 = (com.cardinalblue.android.piccollage.view.k)iterator1.next();
        }

        l = d;
        return;
    }

    public String l()
    {
        return m;
    }

    public long p()
    {
        return e;
    }

    public File q()
    {
        return f;
    }

    public String r()
    {
        return i;
    }

    public d s()
    {
        return j;
    }

    public List t()
    {
        return n;
    }

    public String toString()
    {
        String s1 = "";
        String s2 = i();
        s1 = s2;
_L2:
        return (new StringBuilder()).append("id: ").append(e).append(", thumb: ").append(f).append(", json_struct: ").append(s1).append(", caption: ").append(i).toString();
        Throwable throwable;
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public List u()
    {
        return o;
    }

    public int v()
    {
        return l;
    }

    public int w()
    {
        return k;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeLong(e);
        String s1;
        String s2;
        if (f == null)
        {
            s1 = "";
        } else
        {
            s1 = f.getAbsolutePath();
        }
        parcel.writeString(s1);
        if (g == null)
        {
            s1 = "";
        } else
        {
            s1 = g.getAbsolutePath();
        }
        parcel.writeString(s1);
        parcel.writeLong(h);
        s1 = "";
        if (q == null || !q.exists())
        {
            q = com.cardinalblue.android.piccollage.model.k.b("json");
        }
        com.androidquery.util.a.a(q, i().getBytes());
        s2 = q.getAbsolutePath();
        s1 = s2;
_L2:
        parcel.writeString(s1);
        parcel.writeString(i);
        parcel.writeInt(c);
        parcel.writeInt(d);
        return;
        IOException ioexception;
        ioexception;
        com.cardinalblue.android.piccollage.a.f.a(ioexception);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public List x()
        throws IOException
    {
        Object obj = new ArrayList();
        if (f != null)
        {
            ((ArrayList) (obj)).add(f);
        }
        if (g != null)
        {
            ((ArrayList) (obj)).add(g);
        }
        try
        {
            if (!e())
            {
                Iterator iterator = ((CollageRoot)CollageRoot.versionedTypeAdapterGson(com.cardinalblue.android.piccollage.model.gson.CollageRoot.VersionEnum.A3).a(i(), com/cardinalblue/android/piccollage/model/gson/CollageRoot)).getScraps().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    Object obj1 = (BaseScrapModel)iterator.next();
                    if (obj1 instanceof ImageScrapModel)
                    {
                        obj1 = ((ImageScrapModel)obj1).getImage().getDecodedThumbnailUrl();
                        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                        {
                            ((ArrayList) (obj)).add(new File(((String) (obj1))));
                        }
                    }
                } while (true);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IOException(((t) (obj)).getMessage());
        }
        return ((List) (obj));
    }

    public boolean y()
    {
        Object obj;
        Object obj1;
        boolean flag;
        boolean flag1;
        obj1 = null;
        obj = null;
        flag = true;
        flag1 = true;
        if (k <= 0 || l <= 0) goto _L2; else goto _L1
_L1:
        if (k != l) goto _L4; else goto _L3
_L3:
        return flag1;
_L4:
        return false;
_L2:
        InputStream inputstream = com.cardinalblue.android.b.k.a().getContentResolver().openInputStream(Uri.fromFile(q()));
        obj = inputstream;
        obj1 = inputstream;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        obj = inputstream;
        obj1 = inputstream;
        options.inJustDecodeBounds = true;
        obj = inputstream;
        obj1 = inputstream;
        BitmapFactory.decodeStream(inputstream, null, options);
        obj = inputstream;
        obj1 = inputstream;
        int i1 = options.outWidth;
        obj = inputstream;
        obj1 = inputstream;
        int j1 = options.outHeight;
        if (i1 != j1)
        {
            flag = false;
        }
        flag1 = flag;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
                return flag;
            }
            return flag;
        }
        if (true) goto _L3; else goto _L5
_L5:
        Exception exception1;
        exception1;
        obj1 = obj;
        exception1.printStackTrace();
        Exception exception;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
                return false;
            }
            return false;
        } else
        {
            return false;
        }
        exception;
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            catch (IOException ioexception1)
            {
                ioexception1.printStackTrace();
            }
        }
        throw exception;
    }

}
