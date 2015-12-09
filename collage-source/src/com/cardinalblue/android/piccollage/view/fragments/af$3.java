// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.model.gson.PhotoboxTemplateList;
import java.io.File;
import java.io.FileInputStream;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            af

class a
    implements i
{

    final af a;

    public PhotoboxTemplateList a(j j1)
        throws Exception
    {
        return (PhotoboxTemplateList)k.b(new String(k.a(new FileInputStream((File)j1.e()))), com/cardinalblue/android/piccollage/model/gson/PhotoboxTemplateList);
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    emplateList(af af1)
    {
        a = af1;
        super();
    }
}
