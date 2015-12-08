// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.kik.platform.h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kik.android.util.ct;
import org.c.b;
import org.c.c;

public class KikFileProvider extends ContentProvider
{
    private final class a
        implements Comparator
    {

        final KikFileProvider a;

        public final int compare(Object obj, Object obj1)
        {
            obj = (File)obj;
            return (int)(((File)obj1).lastModified() - ((File) (obj)).lastModified());
        }

        private a()
        {
            a = KikFileProvider.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final b a = c.a("KikFileProvider");

    public KikFileProvider()
    {
    }

    public static File a(Context context, InputStream inputstream)
    {
        String s;
        String s1;
        s = UUID.randomUUID().toString();
        s1 = h.a.buildUpon().appendPath(s).build().toString();
        byte abyte0[];
        context = (FileOutputStream)context.getContentResolver().openOutputStream(Uri.parse(s1));
        abyte0 = new byte[24576];
_L2:
        int i = inputstream.read(abyte0, 0, 24576);
        if (i <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            context.write(abyte0, 0, i);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            (new StringBuilder("Failed to copy file to internal provider!:")).append(context.getMessage());
            return null;
        }
        if (i > 0) goto _L2; else goto _L1
_L1:
        context = new File(URI.create((new StringBuilder("file:///data/data/kik.android/thirdpartyfiles/")).append(s).toString()));
        return context;
    }

    private void a()
    {
        File afile[] = (new File(URI.create("file:///data/data/kik.android/thirdpartyfiles/"))).listFiles();
        List list = Arrays.asList(afile);
        if (afile != null && afile.length > 4)
        {
            Collections.sort(list, new a((byte)0));
            Iterator iterator = list.iterator();
            int i = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                File file = (File)iterator.next();
                int j = i + 1;
                if (j <= 4)
                {
                    boolean flag;
                    if (!ct.a(file.getPath()))
                    {
                        flag = false;
                    } else
                    {
                        flag = ct.a(file.getPath(), ct.c(file.getPath()));
                    }
                    i = j;
                    if (!flag)
                    {
                        continue;
                    }
                }
                file.delete();
                i = j;
            } while (true);
        }
    }

    public static boolean a(String s)
    {
        return s != null && s.startsWith(URI.create("file:///data/data/kik.android/thirdpartyfiles/").getPath());
    }

    public int delete(Uri uri, String s, String as[])
    {
        return 0;
    }

    public String getType(Uri uri)
    {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        return null;
    }

    public boolean onCreate()
    {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String s)
    {
        s = new File(URI.create("file:///data/data/kik.android/thirdpartyfiles/"));
        if (!s.exists())
        {
            s.mkdirs();
        }
        a();
        uri = uri.getLastPathSegment();
        uri = new File(URI.create((new StringBuilder("file:///data/data/kik.android/thirdpartyfiles/")).append(uri).toString()));
        if (!uri.exists())
        {
            try
            {
                uri.createNewFile();
                uri.setLastModified(System.currentTimeMillis());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        return ParcelFileDescriptor.open(uri, 0x30000000);
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        return null;
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        return 0;
    }

}
