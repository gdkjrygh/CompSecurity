// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.coocent.android.xmlparser;

import android.content.Context;
import android.os.AsyncTask;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

// Referenced classes of package net.coocent.android.xmlparser:
//            GiftXmlParser, AsyncGiftImageLoader, HttpService, LoadAppInfoListener, 
//            GiftEntity

public class NetMusicXmlParseTask extends AsyncTask
{

    private AsyncGiftImageLoader loader;
    private Context mcontext;
    private LoadAppInfoListener mloadAppInfoListener;
    private GiftXmlParser parser;

    public NetMusicXmlParseTask(LoadAppInfoListener loadappinfolistener, Context context)
    {
        mloadAppInfoListener = loadappinfolistener;
        mcontext = context;
        parser = new GiftXmlParser(mcontext);
        loader = new AsyncGiftImageLoader();
    }

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient ArrayList doInBackground(String as[])
    {
        Object obj1 = null;
        Object obj = null;
        ArrayList arraylist = obj;
        ArrayList arraylist1 = obj1;
        InputStream inputstream;
        try
        {
            inputstream = HttpService.getStream(as[0], null, 1);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            as.printStackTrace();
            return arraylist;
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            as.printStackTrace();
            return arraylist1;
        }
        arraylist = obj;
        arraylist1 = obj1;
        as = parser.parse(inputstream);
        arraylist = as;
        arraylist1 = as;
        inputstream.close();
        return as;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((ArrayList)obj);
    }

    protected void onPostExecute(ArrayList arraylist)
    {
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        mloadAppInfoListener.onAppInfoLoaded(arraylist);
        j = arraylist.size();
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        return;
_L3:
        loader.loadImage((GiftEntity)arraylist.get(i), null);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
