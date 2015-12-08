// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Handler;
import android.widget.LinearLayout;

// Referenced classes of package com.hmobile.biblekjv:
//            MainBookActivity

public class this._cls0 extends AsyncTask
{

    final MainBookActivity this$0;

    protected volatile transient Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        try
        {
            Thread.sleep(100L);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            avoid.printStackTrace();
        }
        return null;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
        super.onPostExecute(void1);
        navigationfade_global = settings.getBoolean("navigation_fade", true);
        if (navigationfade_global)
        {
            MainBookActivity.access$0(MainBookActivity.this).setVisibility(0);
        }
        (new Thread(new Runnable() {

            final MainBookActivity.LoadBook this$1;

            public void run()
            {
                try
                {
                    Thread.sleep(5000L);
                    MainBookActivity.access$1(this$0).sendEmptyMessage(0);
                    return;
                }
                catch (InterruptedException interruptedexception)
                {
                    interruptedexception.printStackTrace();
                }
            }

            
            {
                this$1 = MainBookActivity.LoadBook.this;
                super();
            }
        })).start();
        loadData();
    }


    public _cls1.this._cls1()
    {
        this$0 = MainBookActivity.this;
        super();
    }
}
