// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package p.ca:
//            ak

class Object
    implements android.view.OnClickListener
{

    final TextView a;
    final ak b;

    public void onClick(View view)
    {
        if (ak.g().equals(a.getText()))
        {
            a.setText(ak.h());
            return;
        } else
        {
            a.setText(ak.g());
            return;
        }
    }

    dget.TextView(ak ak1, TextView textview)
    {
        b = ak1;
        a = textview;
        super();
    }
}
