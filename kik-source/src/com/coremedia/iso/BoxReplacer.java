// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso;

import com.coremedia.iso.boxes.Box;
import com.googlecode.mp4parser.FileDataSourceImpl;
import com.googlecode.mp4parser.util.Path;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.coremedia.iso:
//            IsoFile

public class BoxReplacer
{

    static final boolean $assertionsDisabled;

    public BoxReplacer()
    {
    }

    public static void replace(Map map, File file)
    {
        HashMap hashmap;
        HashMap hashmap1;
        IsoFile isofile;
        isofile = new IsoFile(new FileDataSourceImpl((new RandomAccessFile(file, "r")).getChannel()));
        hashmap = new HashMap();
        hashmap1 = new HashMap();
        map = map.entrySet().iterator();
_L3:
        if (map.hasNext()) goto _L2; else goto _L1
_L1:
        isofile.close();
        map = (new RandomAccessFile(file, "rw")).getChannel();
        file = hashmap.keySet().iterator();
_L4:
        if (!file.hasNext())
        {
            map.close();
            return;
        }
        break MISSING_BLOCK_LABEL_223;
_L2:
        java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
        Box box1 = Path.getPath(isofile, (String)entry.getKey());
        hashmap.put(Path.createPath(box1), (Box)entry.getValue());
        hashmap1.put(Path.createPath(box1), Long.valueOf(box1.getOffset()));
        if (!$assertionsDisabled && box1.getSize() != ((Box)entry.getValue()).getSize())
        {
            throw new AssertionError();
        }
          goto _L3
        String s = (String)file.next();
        Box box = (Box)hashmap.get(s);
        map.position(((Long)hashmap1.get(s)).longValue());
        box.getBox(map);
          goto _L4
    }

    static 
    {
        boolean flag;
        if (!com/coremedia/iso/BoxReplacer.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
