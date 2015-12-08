// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Environment;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.cache.HardCache;
import com.netflix.mediaclient.service.browse.cache.SoftCache;
import com.netflix.mediaclient.servicemgr.Genre;
import com.netflix.mediaclient.servicemgr.LoMo;
import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.util.StringUtils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseWebClient, BrowseAgent, SimpleBrowseAgentCallback

public class DataDumper
{
    private class VideosCallback extends SimpleBrowseAgentCallback
    {

        private final LoMo lomo;
        final DataDumper this$0;
        private final List todo;

        public void onVideosFetched(List list, int i)
        {
            if (dumpErrorOccurred)
            {
                return;
            }
            super.onVideosFetched(list, i);
            if (i != 0)
            {
                Log.e("DataDumper", "Bummer!  Invalid status code during data dump :(");
                dumpErrorOccurred = true;
                todo.clear();
            } else
            {
                lomoVideos.put(lomo, list);
                todo.remove(lomo);
            }
            if (todo.size() == 0)
            {
                Log.v("DataDumper", "--LoMo data collection complete--");
                handleDataLoadCompleted(lomoVideos);
                return;
            } else
            {
                Log.v("DataDumper", (new StringBuilder()).append("Remaining request count: ").append(todo.size()).toString());
                return;
            }
        }

        public VideosCallback(LoMo lomo1, List list)
        {
            this$0 = DataDumper.this;
            super();
            lomo = lomo1;
            todo = list;
        }
    }


    private static final int BOXSHOT_HEIGHT = 118;
    private static final int BOXSHOT_WIDTH = 83;
    private static final String CR = "\n";
    private static final int MAX_ROWS_IN_LIST = 100;
    private static final int MAX_VIDEOS_IN_ROW = 250;
    private static final String TAG = "DataDumper";
    private boolean dumpErrorOccurred;
    private final HardCache hardCache;
    private final LinkedHashMap lomoVideos = new LinkedHashMap();
    private final BrowseWebClient mBrowseWebClient;
    private final SoftCache softCache;
    private String title;

    public DataDumper(BrowseWebClient browsewebclient, HardCache hardcache, SoftCache softcache)
    {
        mBrowseWebClient = browsewebclient;
        hardCache = hardcache;
        softCache = softcache;
    }

    private void dumpGenre(String s)
    {
        Log.v("DataDumper", (new StringBuilder()).append("Taking a dump for genre: ").append(s).toString());
        mBrowseWebClient.fetchGenres(s, 0, 100, new SimpleBrowseAgentCallback() {

            final DataDumper this$0;

            public void onGenresFetched(List list, int i)
            {
                super.onGenresFetched(list, i);
                Log.v("DataDumper", (new StringBuilder()).append("genres fetched, count: ").append(list.size()).toString());
                ArrayList arraylist = new ArrayList(list);
                Genre genre;
                for (list = list.iterator(); list.hasNext(); mBrowseWebClient.fetchGenreVideos(genre, 0, 250, new VideosCallback(genre, arraylist)))
                {
                    genre = (Genre)list.next();
                    lomoVideos.put(genre, null);
                }

            }

            
            {
                this$0 = DataDumper.this;
                super();
            }
        });
    }

    private void dumpHomeLoLomo()
    {
        Log.v("DataDumper", "Taking a dump for home lolomo");
        mBrowseWebClient.fetchLoMos("lolomo", 0, 100, new SimpleBrowseAgentCallback() {

            final DataDumper this$0;

            public void onLoMosFetched(List list, int i)
            {
                super.onLoMosFetched(list, i);
                Log.v("DataDumper", (new StringBuilder()).append("lomos fetched, count: ").append(list.size()).toString());
                ArrayList arraylist = new ArrayList(list);
                LoMo lomo;
                for (list = list.iterator(); list.hasNext(); mBrowseWebClient.fetchVideos(lomo, 0, 250, new VideosCallback(lomo, arraylist)))
                {
                    lomo = (LoMo)list.next();
                    lomoVideos.put(lomo, null);
                }

            }

            
            {
                this$0 = DataDumper.this;
                super();
            }
        });
    }

    private void dumpVideoList(HardCache hardcache, SoftCache softcache, String s, int i)
    {
        hardcache = (List)getFromCache(hardcache, softcache, s);
        if (hardcache != null)
        {
            Log.d("DataDumper", String.format("Videos in key %s", new Object[] {
                s
            }));
            for (hardcache = hardcache.iterator(); hardcache.hasNext();)
            {
                softcache = (Video)hardcache.next();
                Log.d("DataDumper", String.format("(%d) %s, %s, %s", new Object[] {
                    Integer.valueOf(i), softcache.getId(), softcache.getType(), softcache.getTitle()
                }));
                i++;
            }

        }
    }

    private Object getFromCache(HardCache hardcache, SoftCache softcache, String s)
    {
        Object obj = hardCache.get(s);
        hardcache = ((HardCache) (obj));
        if (obj == null)
        {
            hardcache = ((HardCache) (softcache.get(s)));
        }
        return hardcache;
    }

    private int getVideoStartIndexFromKey(String s, String s1)
    {
        s = s.substring(s1.length() + 1).split("_");
        boolean flag = false;
        int i = ((flag) ? 1 : 0);
        if (s.length > 0)
        {
            i = ((flag) ? 1 : 0);
            if (StringUtils.isNotEmpty(s[0]))
            {
                i = Integer.parseInt(s[0]);
            }
        }
        return i;
    }

    private void handleDataLoadCompleted(LinkedHashMap linkedhashmap)
    {
        if (dumpErrorOccurred)
        {
            Log.e("DataDumper", "Error occurred - bailing on data dump");
            return;
        }
        StringBuilder stringbuilder = (new StringBuilder("<!DOCTYPE html><html><body>")).append("\n");
        stringbuilder.append("<h1>").append(title).append("</h1>").append("\n");
        for (Iterator iterator = linkedhashmap.keySet().iterator(); iterator.hasNext(); stringbuilder.append("</table>").append("\n"))
        {
            LoMo lomo = (LoMo)iterator.next();
            Log.v("DataDumper", (new StringBuilder()).append("lomo: ").append(lomo.getTitle()).append(", ").append(lomo.getId()).toString());
            stringbuilder.append("<p>");
            stringbuilder.append("<b>").append(lomo.getTitle()).append("</b>").append("<br />").append("\n");
            stringbuilder.append("Total video count: ").append(lomo.getNumVideos()).append(", ");
            stringbuilder.append("ID: ").append(lomo.getId()).append("<br />").append("\n");
            stringbuilder.append("</p>").append("\n");
            stringbuilder.append("<table>").append("\n");
            stringbuilder.append("<tr>").append("\n");
            Video video;
            for (Iterator iterator1 = ((List)linkedhashmap.get(lomo)).iterator(); iterator1.hasNext(); stringbuilder.append("<td><img src=\"").append(video.getBoxshotURL()).append("\" alt=\"").append(video.getTitle()).append("\"  width=\"").append(83).append("\" height=\"").append(118).append("\"></td>").append("\n"))
            {
                video = (Video)iterator1.next();
                Log.v("DataDumper", (new StringBuilder()).append("lomo: ").append(lomo.getTitle()).append(", video: ").append(video.getId()).append(", ").append(video.getTitle()).toString());
            }

            stringbuilder.append("</tr>").append("\n");
        }

        stringbuilder.append("</body></html>").append("\n");
        Log.v("DataDumper", "Writing to file...");
        writeToFile(stringbuilder.toString());
        Log.v("DataDumper", "Writing to file complete");
    }

    private void writeToFile(String s)
    {
        try
        {
            File file = Environment.getExternalStorageDirectory();
            file = new File((new StringBuilder()).append(file.getAbsolutePath()).append("/lolomo.html").toString());
            FileWriter filewriter = new FileWriter(file);
            filewriter.write(s);
            filewriter.close();
            Log.v("DataDumper", (new StringBuilder()).append("Wrote file to: ").append(file).toString());
            Log.v("DataDumper", "*****************************************************************");
            Log.v("DataDumper", (new StringBuilder()).append("Get html data file with command: adb pull /sdcard").append("/lolomo.html").toString());
            Log.v("DataDumper", "*****************************************************************");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.handleException("DataDumper", s);
        }
    }

    public void dumpHomeLoLoMosAndVideos(String s, String s1)
    {
        dumpErrorOccurred = false;
        lomoVideos.clear();
        if ("lolomo".equals(s))
        {
            title = "Home LoLoMo";
            dumpHomeLoLomo();
            return;
        } else
        {
            title = s1;
            dumpGenre(s);
            return;
        }
    }

    public void dumpHomeLoLoMosAndVideosToLog()
    {
        Object obj1 = null;
        Set set = hardCache.getKeySet();
        Set set1 = softCache.getKeySet();
        Iterator iterator = set.iterator();
        Object obj;
        do
        {
            obj = obj1;
            if (!iterator.hasNext())
            {
                break;
            }
            obj = (String)iterator.next();
            if (!((String) (obj)).contains(BrowseAgent.CACHE_KEY_PREFIX_LOMO))
            {
                continue;
            }
            obj = (List)getFromCache(hardCache, softCache, ((String) (obj)));
            break;
        } while (true);
        if (obj != null)
        {
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
            {
                Object obj2 = (LoMo)((Iterator) (obj)).next();
                Log.d("DataDumper", String.format("%s, %d, %s", new Object[] {
                    ((LoMo) (obj2)).getId(), Integer.valueOf(((LoMo) (obj2)).getNumVideos()), ((LoMo) (obj2)).getTitle()
                }));
                obj2 = (new StringBuilder(BrowseAgent.CACHE_KEY_PREFIX_VIDEOS)).append("_").append(((LoMo) (obj2)).getId()).toString();
                Iterator iterator1 = set.iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    String s = (String)iterator1.next();
                    if (s.contains(((CharSequence) (obj2))))
                    {
                        dumpVideoList(hardCache, softCache, s, getVideoStartIndexFromKey(s, ((String) (obj2))));
                    }
                } while (true);
                iterator1 = set1.iterator();
                while (iterator1.hasNext()) 
                {
                    String s1 = (String)iterator1.next();
                    if (s1.contains(((CharSequence) (obj2))))
                    {
                        dumpVideoList(hardCache, softCache, s1, getVideoStartIndexFromKey(s1, ((String) (obj2))));
                    }
                }
            }

        }
    }

    public void dumpHomeLoMos()
    {
        Object obj1 = null;
        Iterator iterator = hardCache.getKeySet().iterator();
        Object obj;
        do
        {
            obj = obj1;
            if (!iterator.hasNext())
            {
                break;
            }
            obj = (String)iterator.next();
            if (!((String) (obj)).contains(BrowseAgent.CACHE_KEY_PREFIX_LOMO))
            {
                continue;
            }
            obj = (List)getFromCache(hardCache, softCache, ((String) (obj)));
            break;
        } while (true);
        if (obj != null)
        {
            LoMo lomo;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); Log.d("DataDumper", String.format("%s, %d, %s", new Object[] {
    lomo.getId(), Integer.valueOf(lomo.getNumVideos()), lomo.getTitle()
})))
            {
                lomo = (LoMo)((Iterator) (obj)).next();
            }

        }
    }





/*
    static boolean access$202(DataDumper datadumper, boolean flag)
    {
        datadumper.dumpErrorOccurred = flag;
        return flag;
    }

*/

}
