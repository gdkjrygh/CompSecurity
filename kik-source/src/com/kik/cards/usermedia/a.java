// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import com.kik.cards.web.CardsWebViewFragment;
import com.kik.cards.web.usermedia.c;
import com.kik.g.p;
import com.kik.g.s;
import java.io.File;
import java.io.IOException;
import kik.a.e.v;

// Referenced classes of package com.kik.cards.usermedia:
//            b

public final class a
    implements c
{

    private CardsWebViewFragment a;
    private v b;

    public a(CardsWebViewFragment cardswebviewfragment, v v)
    {
        a = cardswebviewfragment;
        b = v;
    }

    private static File a()
    {
        File file;
        File file1;
        if ("mounted".equals(Environment.getExternalStorageState()))
        {
            file = new File(Environment.getExternalStorageDirectory(), "kikTemp");
        } else
        {
            file = new File(Environment.getDownloadCacheDirectory(), "kikTemp");
        }
        if (!file.exists())
        {
            file.mkdirs();
        }
        file1 = new File(file, ".noMedia");
        try
        {
            file1.createNewFile();
        }
        catch (IOException ioexception) { }
        file = new File(file, "temp");
        if (file.exists())
        {
            file.delete();
        }
        try
        {
            file.createNewFile();
        }
        catch (IOException ioexception1)
        {
            return file;
        }
        return file;
    }

    static v a(a a1)
    {
        return a1.b;
    }

    public final p a(int i, int j, boolean flag)
    {
        File file = a();
        CardsWebViewFragment cardswebviewfragment = a;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE", null);
        intent.putExtra("output", Uri.fromFile(file));
        return s.b(cardswebviewfragment.a(intent), new b(this, file, flag));
    }
}
