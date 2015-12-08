// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.os.AsyncTask;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

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
        if (MainBookActivity.access$2(MainBookActivity.this) || MainBookActivity.access$3(MainBookActivity.this) || MainBookActivity.access$4(MainBookActivity.this) || MainBookActivity.access$5(MainBookActivity.this) || MainBookActivity.access$6(MainBookActivity.this) || MainBookActivity.access$7(MainBookActivity.this) || MainBookActivity.access$8(MainBookActivity.this) || MainBookActivity.access$9(MainBookActivity.this))
        {
            void1 = MainBookActivity.access$10(MainBookActivity.this).getChildAt(MainBookActivity.access$11(MainBookActivity.this) - 1);
            MainBookActivity.access$12(MainBookActivity.this, void1.getBottom());
            MainBookActivity.access$13(MainBookActivity.this).smoothScrollTo(0, MainBookActivity.access$14(MainBookActivity.this));
            MainBookActivity.access$15(MainBookActivity.this, false);
            MainBookActivity.access$16(MainBookActivity.this, false);
            MainBookActivity.access$17(MainBookActivity.this, false);
            MainBookActivity.access$18(MainBookActivity.this, false);
            MainBookActivity.access$19(MainBookActivity.this, false);
            MainBookActivity.access$20(MainBookActivity.this, false);
            MainBookActivity.access$21(MainBookActivity.this, false);
        }
    }

    public ()
    {
        this$0 = MainBookActivity.this;
        super();
    }
}
