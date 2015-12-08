// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.support.v4.content.FileProvider;
import java.io.File;
import java.util.ArrayList;

// Referenced classes of package com.skype.android.app.media:
//            ImageTransformer

public class MediaDocumentFileProvider extends FileProvider
{

    public static final String AUTHORITY = ".media.fileprovider";
    public static final String IMAGE_MIME_TYPE = "image";
    private static final String PATH_NAME = "/shared/";

    public MediaDocumentFileProvider()
    {
    }

    private String getPath(Uri uri)
    {
        String s = uri.getPath();
        if (uri.toString().contains("/shared/"))
        {
            uri = s.replace("/shared/", "/");
            return getContext().getFilesDir().getAbsolutePath().concat(uri);
        } else
        {
            return null;
        }
    }

    public static Uri getUriForFile(Context context, File file)
    {
        return getUriForFile(context, (new StringBuilder()).append(context.getPackageName()).append(".media.fileprovider").toString(), file);
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        String s2 = getPath(uri);
        if (s2 == null)
        {
            return super.query(uri, as, s, as1, s1);
        }
        s = new File(s2);
        as1 = getType(uri);
        uri = as;
        int i;
        int j;
        if (as == null)
        {
            if (as1.startsWith("image"))
            {
                uri = new String[2];
                uri[0] = "_data";
                uri[1] = "orientation";
            } else
            {
                uri = new String[1];
                uri[0] = "_data";
            }
        }
        as = new ArrayList();
        j = uri.length;
        i = 0;
        while (i < j) 
        {
            as1 = uri[i];
            if ("_data".equals(as1))
            {
                as.add(s2);
            } else
            if ("orientation".equals(as1))
            {
                as.add(Integer.valueOf(Math.round(ImageTransformer.getOrientationDegrees(s2))));
            } else
            if ("_size".equals(as1))
            {
                as.add(Long.valueOf(s.length()));
            } else
            if ("_display_name".equals(as1))
            {
                as.add(s.getName());
            }
            i++;
        }
        uri = new MatrixCursor(uri, 1);
        uri.addRow(as);
        return uri;
    }
}
