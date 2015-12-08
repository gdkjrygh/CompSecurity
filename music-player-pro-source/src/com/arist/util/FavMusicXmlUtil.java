// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.util;

import android.os.Environment;
import com.arist.entity.Music;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

// Referenced classes of package com.arist.util:
//            Constant

public class FavMusicXmlUtil
{

    public FavMusicXmlUtil()
    {
    }

    public static ArrayList getFavMusic()
        throws Exception
    {
        ArrayList arraylist;
        int i;
        arraylist = new ArrayList();
        Music music;
        Exception exception;
        XmlPullParser xmlpullparser;
        String s;
        try
        {
            Object obj = XmlPullParserFactory.newInstance();
            ((XmlPullParserFactory) (obj)).setNamespaceAware(false);
            xmlpullparser = ((XmlPullParserFactory) (obj)).newPullParser();
            obj = new File(Constant.BASE_FAV_PATH);
            if (!((File) (obj)).getParentFile().exists())
            {
                ((File) (obj)).getParentFile().mkdirs();
            }
            if (!((File) (obj)).exists())
            {
                ((File) (obj)).createNewFile();
            }
            xmlpullparser.setInput(new FileInputStream(((File) (obj))), "utf-8");
            i = xmlpullparser.getEventType();
        }
        catch (Exception exception1)
        {
            return arraylist;
        }
        music = null;
          goto _L1
_L2:
        i = xmlpullparser.next();
          goto _L1
_L7:
label0:
        {
            s = xmlpullparser.getName();
            if (!"music".equals(s))
            {
                break label0;
            }
            music = new Music();
        }
          goto _L2
label1:
        {
            if (!"id".equals(s))
            {
                break label1;
            }
            music.setId(Integer.parseInt(xmlpullparser.nextText()));
        }
          goto _L2
label2:
        {
            if (!"title".equals(s))
            {
                break label2;
            }
            music.setTitle(xmlpullparser.nextText());
        }
          goto _L2
label3:
        {
            if (!"data".equals(s))
            {
                break label3;
            }
            music.setData(xmlpullparser.nextText());
        }
          goto _L2
label4:
        {
            if (!"size".equals(s))
            {
                break label4;
            }
            music.setSize(Long.parseLong(xmlpullparser.nextText()));
        }
          goto _L2
label5:
        {
            if (!"duration".equals(s))
            {
                break label5;
            }
            music.setDuration(Integer.parseInt(xmlpullparser.nextText()));
        }
          goto _L2
label6:
        {
            if (!"album".equals(s))
            {
                break label6;
            }
            music.setAlbum(xmlpullparser.nextText());
        }
          goto _L2
        try
        {
label7:
            {
                if (!"albumId".equals(s))
                {
                    break label7;
                }
                music.setAlbumId(Integer.parseInt(xmlpullparser.nextText()));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            return arraylist;
        }
          goto _L2
        if (!"artist".equals(s)) goto _L4; else goto _L3
_L3:
        music.setArtist(xmlpullparser.nextText());
          goto _L2
_L4:
        if (!"folderPath".equals(s)) goto _L2; else goto _L5
_L5:
        music.setFolderPath(xmlpullparser.nextText());
          goto _L2
_L8:
        if (!"music".equals(xmlpullparser.getName())) goto _L2; else goto _L6
_L6:
        arraylist.add(music);
          goto _L2
_L1:
        if (i == 1)
        {
            return arraylist;
        }
        i;
        JVM INSTR tableswitch 0 3: default 412
    //                   0 103
    //                   1 412
    //                   2 106
    //                   3 343;
           goto _L2 _L2 _L2 _L7 _L8
    }

    public static void saveFavMusic(ArrayList arraylist)
    {
        Object obj;
        if (!Environment.getExternalStorageState().equals("mounted"))
        {
            return;
        }
        obj = new File(Constant.BASE_FAV_PATH);
        if (!((File) (obj)).getParentFile().exists())
        {
            ((File) (obj)).getParentFile().mkdirs();
        }
        FileOutputStream fileoutputstream;
        if (!((File) (obj)).exists())
        {
            try
            {
                ((File) (obj)).createNewFile();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }
        fileoutputstream = new FileOutputStream(((File) (obj)));
        obj = XmlPullParserFactory.newInstance().newSerializer();
        ((XmlSerializer) (obj)).setOutput(fileoutputstream, "UTF-8");
        ((XmlSerializer) (obj)).startDocument("UTF-8", Boolean.valueOf(true));
        ((XmlSerializer) (obj)).text("\n");
        ((XmlSerializer) (obj)).startTag(null, "musics");
        ((XmlSerializer) (obj)).text("\n");
        arraylist = arraylist.iterator();
_L1:
        if (!arraylist.hasNext())
        {
            ((XmlSerializer) (obj)).endTag(null, "musics");
            ((XmlSerializer) (obj)).text("\n");
            ((XmlSerializer) (obj)).endDocument();
            ((XmlSerializer) (obj)).flush();
            return;
        }
        try
        {
            Music music = (Music)arraylist.next();
            ((XmlSerializer) (obj)).startTag(null, "music");
            ((XmlSerializer) (obj)).text("\n");
            ((XmlSerializer) (obj)).startTag(null, "id");
            ((XmlSerializer) (obj)).text((new StringBuilder()).append(music.getId()).toString());
            ((XmlSerializer) (obj)).endTag(null, "id");
            ((XmlSerializer) (obj)).text("\n");
            ((XmlSerializer) (obj)).startTag(null, "title");
            ((XmlSerializer) (obj)).text(music.getTitle());
            ((XmlSerializer) (obj)).endTag(null, "title");
            ((XmlSerializer) (obj)).text("\n");
            ((XmlSerializer) (obj)).startTag(null, "data");
            ((XmlSerializer) (obj)).text(music.getData());
            ((XmlSerializer) (obj)).endTag(null, "data");
            ((XmlSerializer) (obj)).text("\n");
            ((XmlSerializer) (obj)).startTag(null, "size");
            ((XmlSerializer) (obj)).text((new StringBuilder()).append(music.getSize()).toString());
            ((XmlSerializer) (obj)).endTag(null, "size");
            ((XmlSerializer) (obj)).text("\n");
            ((XmlSerializer) (obj)).startTag(null, "duration");
            ((XmlSerializer) (obj)).text((new StringBuilder()).append(music.getDuration()).toString());
            ((XmlSerializer) (obj)).endTag(null, "duration");
            ((XmlSerializer) (obj)).text("\n");
            ((XmlSerializer) (obj)).startTag(null, "album");
            ((XmlSerializer) (obj)).text(music.getAlbum());
            ((XmlSerializer) (obj)).endTag(null, "album");
            ((XmlSerializer) (obj)).text("\n");
            ((XmlSerializer) (obj)).startTag(null, "albumId");
            ((XmlSerializer) (obj)).text((new StringBuilder()).append(music.getAlbumId()).toString());
            ((XmlSerializer) (obj)).endTag(null, "albumId");
            ((XmlSerializer) (obj)).text("\n");
            ((XmlSerializer) (obj)).startTag(null, "artist");
            ((XmlSerializer) (obj)).text(music.getArtist());
            ((XmlSerializer) (obj)).endTag(null, "artist");
            ((XmlSerializer) (obj)).text("\n");
            ((XmlSerializer) (obj)).startTag(null, "folderPath");
            ((XmlSerializer) (obj)).text(music.getFolderPath());
            ((XmlSerializer) (obj)).endTag(null, "folderPath");
            ((XmlSerializer) (obj)).text("\n");
            ((XmlSerializer) (obj)).endTag(null, "music");
            ((XmlSerializer) (obj)).text("\n");
        }
        // Misplaced declaration of an exception variable
        catch (ArrayList arraylist)
        {
            arraylist.printStackTrace();
            return;
        }
          goto _L1
    }
}
