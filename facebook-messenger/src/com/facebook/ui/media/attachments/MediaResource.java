// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.attachments;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.w.n;
import com.facebook.debug.log.b;
import com.google.common.base.Objects;
import java.io.File;

// Referenced classes of package com.facebook.ui.media.attachments:
//            e, g, f

public class MediaResource
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    private static final Class a = com/facebook/ui/media/attachments/MediaResource;
    private final long b;
    private final g c;
    private final Uri d;
    private final String e;
    private final String f;
    private final long g;
    private final int h;
    private final int i;

    private MediaResource(Parcel parcel)
    {
        b = parcel.readLong();
        d = (Uri)parcel.readParcelable(null);
        c = com.facebook.ui.media.attachments.g.valueOf(parcel.readString());
        e = parcel.readString();
        f = parcel.readString();
        g = parcel.readLong();
        h = parcel.readInt();
        i = parcel.readInt();
    }

    MediaResource(Parcel parcel, e e1)
    {
        this(parcel);
    }

    private MediaResource(f f1)
    {
        b = f1.a();
        c = f1.b();
        d = f1.c();
        e = f1.d();
        f = f1.e();
        g = f1.f();
        h = f1.g();
        i = f1.h();
    }

    MediaResource(f f1, e e1)
    {
        this(f1);
    }

    public static MediaResource a(Uri uri)
    {
        return a(uri, ((String) (null)));
    }

    public static MediaResource a(Uri uri, long l)
    {
        return a().a(g.AUDIO).a(uri).b(l).i();
    }

    public static MediaResource a(Uri uri, String s)
    {
        return a().a(g.PHOTO).a(uri).b(s).i();
    }

    public static MediaResource a(MediaResource mediaresource, String s)
    {
        return a(mediaresource).b(s).i();
    }

    public static MediaResource a(File file)
    {
        return a(file, 0, 0, 0L);
    }

    public static MediaResource a(File file, int k, int l, long l1)
    {
        int i1;
        int j1;
        if (k != 0)
        {
            i1 = k;
            j1 = l;
            if (l != 0)
            {
                break MISSING_BLOCK_LABEL_70;
            }
        }
        i1 = k;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        i1 = k;
        options.inJustDecodeBounds = true;
        i1 = k;
        BitmapFactory.decodeFile(file.getPath(), options);
        i1 = k;
        k = options.outWidth;
        i1 = k;
        j1 = options.outHeight;
        i1 = k;
_L2:
        return a().a(l1).a(g.PHOTO).a(Uri.fromFile(file)).a(i1).b(j1).i();
        Exception exception;
        exception;
        com.facebook.debug.log.b.b(a, "Error when trying to load photo options: ", exception);
        j1 = l;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static MediaResource a(File file, long l)
    {
        return a(file, 0, 0, l);
    }

    public static f a()
    {
        return new f();
    }

    public static f a(MediaResource mediaresource)
    {
        return (new f()).a(mediaresource.b()).a(mediaresource.d()).b(mediaresource.f()).a(mediaresource.c()).b(mediaresource.g()).a(mediaresource.e()).a(mediaresource.h()).b(mediaresource.i());
    }

    public static MediaResource b(Uri uri)
    {
        return a().a(g.VIDEO).a(uri).i();
    }

    public static MediaResource b(File file)
    {
        return b(Uri.fromFile(file));
    }

    public long b()
    {
        return b;
    }

    public g c()
    {
        return c;
    }

    public Uri d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof MediaResource))
            {
                return false;
            }
            obj = (MediaResource)obj;
            if (!Objects.equal(d(), ((MediaResource) (obj)).d()) || !Objects.equal(c(), ((MediaResource) (obj)).c()) || !Objects.equal(Long.valueOf(g()), Long.valueOf(((MediaResource) (obj)).g())) || !Objects.equal(Integer.valueOf(h()), Integer.valueOf(((MediaResource) (obj)).h())) || !Objects.equal(Integer.valueOf(i()), Integer.valueOf(((MediaResource) (obj)).i())))
            {
                return false;
            }
        }
        return true;
    }

    public String f()
    {
        return f;
    }

    public long g()
    {
        return g;
    }

    public int h()
    {
        return h;
    }

    public int i()
    {
        return i;
    }

    public String j()
    {
        if (n.c(f))
        {
            return null;
        } else
        {
            String as[] = f.split("/");
            return as[as.length - 1];
        }
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        parcel.writeLong(b);
        parcel.writeParcelable(d, k);
        parcel.writeString(c.name());
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeLong(g);
        parcel.writeInt(h);
        parcel.writeInt(i);
    }

}
