// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.util;

import com.arist.entity.Lyric;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.arist.util:
//            Constant

public class LrcRead
{

    private ArrayList LyricList;
    private ArrayList files;
    private Lyric lyric;

    public LrcRead()
    {
    }

    public List GetLyric()
    {
        return LyricList;
    }

    public ArrayList Read(String s)
        throws FileNotFoundException, IOException
    {
        s = new BufferedReader(new InputStreamReader(new FileInputStream(new File(s)), "UTF-8"));
        LyricList = new ArrayList();
        do
        {
            String as[];
            do
            {
                String s1;
                do
                {
                    s1 = s.readLine();
                    if (s1 == null)
                    {
                        s.close();
                        return LyricList;
                    }
                } while ("".equals(s1.trim()));
                as = s1.replace("[", "").replace("]", "@").split("@");
            } while (as.length <= 1);
            lyric = new Lyric();
            lyric.setLyric(as[1]);
            lyric.setLyricTime(TimeStr(as[0]));
            LyricList.add(lyric);
        } while (true);
    }

    public int TimeStr(String s)
    {
        s = s.replace(":", ".").replace(".", "@").split("@");
        return (Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1])) * 1000 + Integer.parseInt(s[2]) * 10;
    }

    public ArrayList findLyric(String s)
    {
        File afile[];
        File file = new File(Constant.BASE_LYRIC_PATH);
        if (!file.exists() || !file.isDirectory())
        {
            file.mkdirs();
        }
        afile = file.listFiles();
        if (afile.length <= 0) goto _L2; else goto _L1
_L1:
        int j;
        files = new ArrayList();
        j = afile.length;
        int i = 0;
          goto _L3
_L2:
        File file1;
        try
        {
            return files;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
_L4:
        file1 = afile[i];
        if (file1.isFile() && file1.getAbsolutePath().toLowerCase().contains(s.toLowerCase()))
        {
            files.add(file1);
        }
        i++;
_L3:
        if (i < j) goto _L4; else goto _L2
    }
}
