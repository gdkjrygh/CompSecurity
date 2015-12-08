// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.util;

import android.os.Environment;
import java.io.File;
import java.util.ArrayList;

public class ScanMusic
{

    private static ArrayList folderList = new ArrayList();

    public ScanMusic()
    {
    }

    public void findMusicFolder(File file)
    {
        int i;
        int j;
        file = file.listFiles();
        j = file.length;
        i = 0;
_L2:
        File file1;
        String s;
        if (i >= j)
        {
            return;
        }
        file1 = file[i];
        s = file1.getAbsolutePath();
        if (!file1.getName().startsWith("."))
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (!file1.isDirectory())
        {
            continue; /* Loop/switch isn't completed */
        }
        findMusicFolder(file1);
          goto _L3
        continue; /* Loop/switch isn't completed */
        if (!file1.isFile() || !s.endsWith(".mp3") && !s.endsWith(".wma") && !s.endsWith(".flac")) goto _L3; else goto _L4
_L4:
        folderList.add((new File(file1.getParent())).getAbsolutePath());
        return;
        if (true) goto _L2; else goto _L5
_L5:
    }

    public ArrayList getMusicFolderList()
    {
        if (Environment.getExternalStorageState() == null)
        {
            return new ArrayList();
        } else
        {
            findMusicFolder(Environment.getExternalStorageDirectory());
            return folderList;
        }
    }

    public ArrayList getMusicList(String s)
    {
        ArrayList arraylist = new ArrayList();
        s = (new File(s)).listFiles();
        int j = s.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return arraylist;
            }
            File file = s[i];
            String s1 = file.getAbsolutePath();
            if (file.isFile() && (s1.endsWith(".mp3") || s1.endsWith(".wma") || s1.endsWith(".flac")))
            {
                arraylist.add(file.getAbsolutePath());
            }
            i++;
        } while (true);
    }

    public int getMusicNumInFolder(File file)
    {
        return file.listFiles().length;
    }

}
