// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import java.util.List;

// Referenced classes of package com.skype.android.app.search:
//            SearchResultLoader

public class searchTerm
{

    List recent;
    String searchTerm;
    final SearchResultLoader this$0;

    public (List list, String s)
    {
        this$0 = SearchResultLoader.this;
        super();
        recent = list;
        searchTerm = s;
    }
}
