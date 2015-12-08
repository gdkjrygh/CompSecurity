// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util.debug;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.common.collect.Maps;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.gsa.shared.util.debug:
//            DebugFileProvider, b

public class SelfDestructFileProvider extends DebugFileProvider
{

    private static Map a;

    public SelfDestructFileProvider()
    {
    }

    static Map a()
    {
        if (a == null)
        {
            a = Maps.b();
        }
        return a;
    }

    public ParcelFileDescriptor openFile(Uri uri, String s)
    {
        Object obj = uri.getPathSegments();
        if (((List) (obj)).size() < 2 || !((String)((List) (obj)).get(0)).equals("dump"))
        {
            uri = String.valueOf(uri);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(uri).length() + 18)).append("Unsupported path: ").append(uri).toString());
        }
        File file = getContext().getFilesDir();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            file = new File(file, (String)((Iterator) (obj)).next());
        }

        obj = new b(file);
        a().put(file, obj);
        ((b) (obj)).startWatching();
        return super.openFile(uri, s);
    }
}
