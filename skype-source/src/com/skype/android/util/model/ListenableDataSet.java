// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.skype.android.util.model:
//            ListDataSet, Publisher

public class ListenableDataSet extends ListDataSet
    implements Publisher
{

    final Set b = new HashSet();
    final Set c = new HashSet();

    public ListenableDataSet()
    {
        super(new ArrayList());
    }
}
