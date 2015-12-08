// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

final class fju
    implements elf
{

    private static final ekz a = (new ela()).a();
    private final elp b;

    fju(elp elp1)
    {
        b = elp1;
    }

    private List a(fjs fjs1, ekk ekk)
    {
        ArrayList arraylist = new ArrayList();
        fjz fjz1 = fjs1.b;
        Uri uri = fjz1.a;
        int i;
        try
        {
            if ("content".equals(uri.getScheme()) && "media".equals(uri.getAuthority()))
            {
                ContentUris.parseId(fjz1.a);
            }
        }
        // Misplaced declaration of an exception variable
        catch (fjs fjs1)
        {
            return arraylist;
        }
        // Misplaced declaration of an exception variable
        catch (fjs fjs1)
        {
            return arraylist;
        }
        if ("file".equals(uri.getScheme()))
        {
            File file = new File(uri.getPath());
            if (!file.exists())
            {
                fjs1 = String.valueOf(uri);
                throw new eke((new StringBuilder(String.valueOf(fjs1).length() + 22)).append("File does not exists: ").append(fjs1).toString());
            }
            if (!file.canRead())
            {
                fjs1 = String.valueOf(uri);
                throw new eke((new StringBuilder(String.valueOf(fjs1).length() + 19)).append("Can not read file: ").append(fjs1).toString());
            }
        }
        i = fjs1.a;
        arraylist.add(new fjq(i, fjz1, fjs1, b.a(i, fjz1, ekk)));
        return arraylist;
    }

    public final volatile long a(ekq ekq, ekw ekw)
    {
        return 1L;
    }

    public final Class a()
    {
        return fjs;
    }

    public final volatile List a(ekq ekq, ekw ekw, ekk ekk)
    {
        return a((fjs)ekq, ekk);
    }

    public final ekz b()
    {
        return a;
    }

    public final ekz c()
    {
        return a;
    }

}
