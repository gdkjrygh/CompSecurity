// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.BitmapFactory;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class rH
    implements rF
{

    private rD a;

    public rH()
    {
        this(new rD());
    }

    private rH(rD rd)
    {
        a = rd;
    }

    private static IK a(WA wa)
    {
        int i;
        int j;
        wa = ((Wq) (wa)).a;
        IK ik;
        try
        {
            wa = new WN(new File(wa));
        }
        // Misplaced declaration of an exception variable
        catch (WA wa)
        {
            throw new Wu(String.format("InvalidMediaException in %s: %s", new Object[] {
                "SavingVideoEncoderConfiguration", wa.toString()
            }), wa);
        }
        i = wa.b();
        j = wa.c();
        if (i <= j)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        ik = new IK(i, j);
        wa.a();
        return ik;
        IK ik1 = new IK(j, i);
        wa.a();
        return ik1;
        Object obj;
        obj;
        throw new Wu((new StringBuilder("Failed to read video metadata: ")).append(((IOException) (obj)).toString()).toString(), ((Throwable) (obj)));
        obj;
        wa.a();
        throw obj;
    }

    public final VX a(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            list = (Wt)iterator.next();
            if (list instanceof Wr)
            {
                list = (Wr)list;
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(((Wq) (list)).a, options);
                if (options.outWidth > options.outHeight)
                {
                    list = new IK(options.outWidth, options.outHeight);
                } else
                {
                    list = new IK(options.outHeight, options.outWidth);
                }
                arraylist.add(list);
            } else
            if (list instanceof WA)
            {
                arraylist.add(a((WA)list));
            } else
            {
                throw new IllegalArgumentException("Unhandled media source type");
            }
        }

        list = a.a(arraylist);
        if (list == null)
        {
            throw new Wu("Could not find a valid resolution for transcoding.");
        } else
        {
            list = MediaFormat.createVideoFormat("video/avc", list.a(), list.b());
            list.setInteger("color-format", 0x7f000789);
            list.setInteger("bitrate", 0x3d0900);
            list.setInteger("frame-rate", 30);
            list.setInteger("i-frame-interval", 1);
            return new VX("video/avc", list);
        }
    }
}
