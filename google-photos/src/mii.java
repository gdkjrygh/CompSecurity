// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.photos.autobackup.model.LocalFolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class mii extends mhq
{

    private lnw a;

    public mii(lnw lnw1)
    {
        a = lnw1;
    }

    public final List a()
    {
        ArrayList arraylist = new ArrayList();
        if (a.b() == null)
        {
            return arraylist;
        }
        for (Iterator iterator = a.b().iterator(); iterator.hasNext(); arraylist.add(new mih((LocalFolder)iterator.next()))) { }
        return arraylist;
    }

    public final maa r()
    {
        return new maq(a.a_());
    }
}
