// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.location.Location;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import com.facebook.debug.log.b;
import com.facebook.orca.camera.a.d;
import com.facebook.orca.camera.a.f;
import com.facebook.orca.camera.a.g;
import com.facebook.orca.camera.a.l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.facebook.orca.camera:
//            aa, p, q

public class ImageManager
{

    public static final String a = (new StringBuilder()).append(Environment.getExternalStorageDirectory().toString()).append("/DCIM/Camera").toString();
    public static final String b = a(a);
    private static final Class c = com/facebook/orca/camera/ImageManager;
    private static final Uri d;
    private static final Uri e;
    private static final Uri f = Uri.parse("content://media/external/video/media");

    public ImageManager()
    {
    }

    public static Uri a(ContentResolver contentresolver, String s, long l1, Location location, String s1, String s2, Bitmap bitmap, 
            byte abyte0[], int ai[])
    {
        String s3 = (new StringBuilder()).append(s1).append("/").append(s2).toString();
        Object obj;
        obj = new File(s1);
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).mkdirs();
        }
        obj = new FileOutputStream(new File(s1, s2));
        if (bitmap == null) goto _L2; else goto _L1
_L1:
        s1 = ((String) (obj));
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 75, ((OutputStream) (obj)));
        ai[0] = 0;
_L4:
        aa.a(((java.io.Closeable) (obj)));
        s1 = new ContentValues(7);
        s1.put("title", s);
        s1.put("_display_name", s2);
        s1.put("datetaken", Long.valueOf(l1));
        s1.put("mime_type", "image/jpeg");
        s1.put("orientation", Integer.valueOf(ai[0]));
        s1.put("_data", s3);
        if (location != null)
        {
            s1.put("latitude", Double.valueOf(location.getLatitude()));
            s1.put("longitude", Double.valueOf(location.getLongitude()));
        }
        return contentresolver.insert(d, s1);
_L2:
        s1 = ((String) (obj));
        ((OutputStream) (obj)).write(abyte0);
        s1 = ((String) (obj));
        ai[0] = b(s3);
        if (true) goto _L4; else goto _L3
_L3:
        contentresolver;
_L10:
        s1 = ((String) (obj));
        com.facebook.debug.log.b.a(c, contentresolver);
        aa.a(((java.io.Closeable) (obj)));
        return null;
        contentresolver;
        obj = null;
_L8:
        s1 = ((String) (obj));
        com.facebook.debug.log.b.a(c, contentresolver);
        aa.a(((java.io.Closeable) (obj)));
        return null;
        contentresolver;
        s1 = null;
_L6:
        aa.a(s1);
        throw contentresolver;
        contentresolver;
        if (true) goto _L6; else goto _L5
_L5:
        contentresolver;
        if (true) goto _L8; else goto _L7
_L7:
        contentresolver;
        obj = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static ImageListParam a(Uri uri)
    {
        ImageListParam imagelistparam = new ImageListParam();
        imagelistparam.e = uri;
        return imagelistparam;
    }

    public static ImageListParam a(p p1, int i, int j, String s)
    {
        ImageListParam imagelistparam = new ImageListParam();
        imagelistparam.a = p1;
        imagelistparam.b = i;
        imagelistparam.c = j;
        imagelistparam.d = s;
        return imagelistparam;
    }

    public static d a(ContentResolver contentresolver, Uri uri)
    {
        return a(contentresolver, a(uri));
    }

    public static d a(ContentResolver contentresolver, Uri uri, int i)
    {
        String s;
        if (uri != null)
        {
            s = uri.toString();
        } else
        {
            s = "";
        }
        if (s.startsWith("content://drm"))
        {
            return a(contentresolver, p.ALL, 2, i, null);
        }
        if (s.startsWith("content://media/external/video"))
        {
            return a(contentresolver, p.EXTERNAL, 4, i, null);
        }
        if (c(s))
        {
            return a(contentresolver, uri);
        } else
        {
            uri = uri.getQueryParameter("bucketId");
            return a(contentresolver, p.ALL, 1, i, ((String) (uri)));
        }
    }

    public static d a(ContentResolver contentresolver, ImageListParam imagelistparam)
    {
        p p1 = imagelistparam.a;
        int i = imagelistparam.b;
        int j = imagelistparam.c;
        String s = imagelistparam.d;
        Uri uri = imagelistparam.e;
        if (imagelistparam.f || contentresolver == null)
        {
            return new q(null);
        }
        if (uri != null)
        {
            return new l(contentresolver, uri);
        }
        boolean flag = a(false);
        imagelistparam = new ArrayList();
        if (flag && p1 != p.INTERNAL && (i & 1) != 0)
        {
            imagelistparam.add(new f(contentresolver, d, e, j, s));
        }
        if ((p1 == p.INTERNAL || p1 == p.ALL) && (i & 1) != 0)
        {
            imagelistparam.add(new f(contentresolver, android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI, android.provider.MediaStore.Images.Thumbnails.INTERNAL_CONTENT_URI, j, s));
        }
        contentresolver = imagelistparam.iterator();
        do
        {
            if (!contentresolver.hasNext())
            {
                break;
            }
            com.facebook.orca.camera.a.b b1 = (com.facebook.orca.camera.a.b)contentresolver.next();
            if (b1.c())
            {
                b1.a();
                contentresolver.remove();
            }
        } while (true);
        if (imagelistparam.size() == 1)
        {
            return (com.facebook.orca.camera.a.b)imagelistparam.get(0);
        } else
        {
            return new g((d[])imagelistparam.toArray(new d[imagelistparam.size()]), j);
        }
    }

    public static d a(ContentResolver contentresolver, p p1, int i, int j, String s)
    {
        return a(contentresolver, a(p1, i, j, s));
    }

    public static String a(String s)
    {
        return String.valueOf(s.toLowerCase().hashCode());
    }

    public static boolean a()
    {
        return a(true);
    }

    public static boolean a(boolean flag)
    {
        boolean flag1 = true;
        String s = Environment.getExternalStorageState();
        if ("mounted".equals(s))
        {
            if (flag)
            {
                flag1 = b();
            }
        } else
        if (flag || !"mounted_ro".equals(s))
        {
            return false;
        }
        return flag1;
    }

    public static int b(String s)
    {
        int i;
        try
        {
            s = new ExifInterface(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.facebook.debug.log.b.e(c, "cannot read exif", s);
            s = null;
        }
        if (s == null) goto _L2; else goto _L1
_L1:
        i = s.getAttributeInt("Orientation", -1);
        if (i == -1) goto _L2; else goto _L3
_L3:
        i;
        JVM INSTR tableswitch 3 8: default 68
    //                   3 89
    //                   4 68
    //                   5 68
    //                   6 86
    //                   7 68
    //                   8 93;
           goto _L2 _L4 _L2 _L2 _L5 _L2 _L6
_L2:
        return 0;
_L5:
        return 90;
_L4:
        return 180;
_L6:
        return 270;
    }

    private static boolean b()
    {
        Object obj;
        File file;
        obj = (new StringBuilder()).append(Environment.getExternalStorageDirectory().toString()).append("/DCIM").toString();
        file = new File(((String) (obj)));
        if (file.isDirectory() || file.mkdirs()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        obj = new File(((String) (obj)), ".probe");
        if (((File) (obj)).exists())
        {
            ((File) (obj)).delete();
        }
        if (!((File) (obj)).createNewFile()) goto _L1; else goto _L3
_L3:
        ((File) (obj)).delete();
        return true;
        IOException ioexception;
        ioexception;
        return false;
    }

    static boolean c(String s)
    {
        return !s.startsWith(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) && !s.startsWith(android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    static 
    {
        d = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        e = android.provider.MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI;
    }

    private class ImageListParam
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new r();
        public p a;
        public int b;
        public int c;
        public String d;
        public Uri e;
        public boolean f;

        public int describeContents()
        {
            return 0;
        }

        public String toString()
        {
            return String.format("ImageListParam{loc=%s,inc=%d,sort=%d,bucket=%s,empty=%b,single=%s}", new Object[] {
                a, Integer.valueOf(b), Integer.valueOf(c), d, Boolean.valueOf(f), e
            });
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeInt(a.ordinal());
            parcel.writeInt(b);
            parcel.writeInt(c);
            parcel.writeString(d);
            parcel.writeParcelable(e, i);
            if (f)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
        }


        public ImageListParam()
        {
        }

        private ImageListParam(Parcel parcel)
        {
            a = p.values()[parcel.readInt()];
            b = parcel.readInt();
            c = parcel.readInt();
            d = parcel.readString();
            e = (Uri)parcel.readParcelable(null);
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f = flag;
        }

        ImageListParam(Parcel parcel, o o)
        {
            this(parcel);
        }
    }

}
