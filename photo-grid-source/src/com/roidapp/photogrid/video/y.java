// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import com.roidapp.baselib.e.b;
import com.roidapp.photogrid.release.ih;
import com.roidapp.photogrid.video.onlinemusic.LocalTrack;
import com.roidapp.photogrid.video.onlinemusic.Track;
import java.io.File;
import java.util.HashMap;

// Referenced classes of package com.roidapp.photogrid.video:
//            q, ab, a, bi

final class y
    implements b
{

    final int a;
    final q b;

    y(q q1, int i)
    {
        b = q1;
        a = i;
        super();
    }

    public final void a(int i)
    {
        if (q.k(b) != null)
        {
            q.k(b).a(a, i);
        }
    }

    public final void a(int i, Exception exception)
    {
label0:
        {
label1:
            {
label2:
                {
                    Object obj = (a)q.l(b).get(Integer.valueOf(a));
                    if (obj != null)
                    {
                        ((a) (obj)).a();
                    }
                    q.l(b).remove(Integer.valueOf(a));
                    obj = b.c(a);
                    if (obj != null)
                    {
                        Object obj1 = q.a(((LocalTrack) (obj)).track.track_title);
                        obj.filePath = (new StringBuilder()).append(q.m(b)).append(((String) (obj1))).append("_").append(com.roidapp.photogrid.video.q.b(((LocalTrack) (obj)).track.mp3_url)).toString();
                        obj1 = new File(((LocalTrack) (obj)).filePath);
                        if (((File) (obj1)).exists() && !bi.a(((LocalTrack) (obj)).filePath).equalsIgnoreCase(((LocalTrack) (obj)).getTrack().file_md5))
                        {
                            ((File) (obj1)).delete();
                        }
                    }
                    if (q.k(b) != null)
                    {
                        switch (i)
                        {
                        default:
                            q.k(b).a(a, 0, exception);
                            break;

                        case 200: 
                            break label0;

                        case 400: 
                            break label2;

                        case 404: 
                            break label1;
                        }
                    }
                    return;
                }
                q.k(b).a(a, 4, exception);
                return;
            }
            q.k(b).a(a, 6, exception);
            return;
        }
        q.k(b).a(a, 5, exception);
    }

    public final void a(Object obj)
    {
        Object obj1;
        obj = (String)obj;
        obj1 = (a)q.l(b).get(Integer.valueOf(a));
        if (obj1 != null)
        {
            ((a) (obj1)).a();
        }
        q.l(b).remove(Integer.valueOf(a));
        obj1 = b.c(a);
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        File file = new File(((String) (obj)));
        if (!file.exists() || !bi.a(((String) (obj))).equalsIgnoreCase(((LocalTrack) (obj1)).getTrack().file_md5)) goto _L4; else goto _L3
_L3:
        obj1.filePath = ((String) (obj));
        q.a(b, a, ((LocalTrack) (obj1)));
        ih.C().a(((String) (obj)));
        b.a(((LocalTrack) (obj1)));
        if (q.k(b) != null)
        {
            q.k(b).a(a, ((String) (obj)));
        }
_L6:
        return;
_L4:
        if (q.k(b) != null)
        {
            if (file.getParentFile() != null && file.getParentFile().exists())
            {
                q.k(b).a(a, 3, null);
                return;
            } else
            {
                q.k(b).a(a, 5, null);
                return;
            }
        }
_L2:
        if (q.k(b) != null)
        {
            q.k(b).a(a, 0, null);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
