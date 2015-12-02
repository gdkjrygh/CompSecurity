// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.facebook.contacts.picker:
//            ak

class am
    implements android.widget.AdapterView.OnItemClickListener
{

    final ak a;

    am(ak ak1)
    {
        a = ak1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        ak.b(a, i);
    }
}
