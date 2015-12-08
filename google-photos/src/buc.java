// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class buc
{

    private static final String b = buc.getSimpleName();
    public File a;
    private final Context c;

    public buc(Context context)
    {
        c = context;
    }

    static void a(String s)
    {
        String s1 = String.valueOf(s);
        if (s1.length() != 0)
        {
            "deleting thumbnail cache:".concat(s1);
        } else
        {
            new String("deleting thumbnail cache:");
        }
        (new File(Uri.parse(s).getPath())).delete();
    }

    final List a(Set set)
    {
        Object obj = String.valueOf(set);
        (new StringBuilder(String.valueOf(obj).length() + 27)).append("directory scan -- expected:").append(((String) (obj)));
        a();
        obj = new HashSet();
        File afile[] = a.listFiles();
        int j = afile.length;
        int i = 0;
        while (i < j) 
        {
            File file = afile[i];
            if ((int)file.length() == 0)
            {
                file.delete();
            } else
            {
                String s1 = file.getName().replace(".jpg", "");
                if (!set.contains(s1))
                {
                    file.delete();
                } else
                {
                    ((Set) (obj)).add(s1);
                }
            }
            i++;
        }
        ArrayList arraylist = new ArrayList();
        set = set.iterator();
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            String s = (String)set.next();
            if (!((Set) (obj)).contains(s))
            {
                arraylist.add(s);
            }
        } while (true);
        set = String.valueOf(arraylist);
        (new StringBuilder(String.valueOf(set).length() + 8)).append("missing:").append(set);
        return arraylist;
    }

    public void a()
    {
        if (a == null)
        {
            a = c.getDir("ThumbnailCache", 0);
        }
    }

}
