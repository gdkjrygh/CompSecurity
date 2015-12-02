// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.images;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

// Referenced classes of package com.facebook.orca.images:
//            ImageSearchActivity

class a
    implements android.view.View.OnClickListener
{

    final ImageSearchActivity a;

    a(ImageSearchActivity imagesearchactivity)
    {
        a = imagesearchactivity;
        super();
    }

    public void onClick(View view)
    {
        ImageSearchActivity.b(a).hideSoftInputFromWindow(ImageSearchActivity.a(a).getWindowToken(), 0);
        ImageSearchActivity.c(a);
    }
}
