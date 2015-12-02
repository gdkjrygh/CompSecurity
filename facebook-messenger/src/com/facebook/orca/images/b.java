// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.images;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

// Referenced classes of package com.facebook.orca.images:
//            ImageSearchActivity

class b
    implements android.widget.TextView.OnEditorActionListener
{

    final ImageSearchActivity a;

    b(ImageSearchActivity imagesearchactivity)
    {
        a = imagesearchactivity;
        super();
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            if (i != 2)
            {
                flag = flag1;
                if (keyevent == null)
                {
                    break label0;
                }
                flag = flag1;
                if (keyevent.getKeyCode() != 66)
                {
                    break label0;
                }
            }
            ImageSearchActivity.b(a).hideSoftInputFromWindow(ImageSearchActivity.a(a).getWindowToken(), 0);
            ImageSearchActivity.c(a);
            flag = true;
        }
        return flag;
    }
}
