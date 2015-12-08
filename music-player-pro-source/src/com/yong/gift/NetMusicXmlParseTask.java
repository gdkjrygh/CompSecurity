// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yong.gift;

import android.os.AsyncTask;
import com.arist.util.HttpService;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

// Referenced classes of package com.yong.gift:
//            GiftXmlParser, GiftActivity

public class NetMusicXmlParseTask extends AsyncTask
{

    private GiftActivity context;
    private GiftXmlParser parser;

    public NetMusicXmlParseTask(GiftActivity giftactivity)
    {
        context = giftactivity;
        parser = new GiftXmlParser();
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
        context.updateView(arraylist);
    }
}
