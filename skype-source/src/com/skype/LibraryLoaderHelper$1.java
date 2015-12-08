// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.util.HashMap;

// Referenced classes of package com.skype:
//            LibraryLoaderHelper

final class put extends HashMap
{

    final LibraryLoaderHelper this$0;

    (int i)
    {
        this$0 = LibraryLoaderHelper.this;
        super(i);
        libraryloaderhelper = LibraryLoaderHelper.access$000(LibraryLoaderHelper.this);
        int j = LibraryLoaderHelper.this.length;
        for (i = 0; i < j; i++)
        {
            put(LibraryLoaderHelper.this[i], Boolean.valueOf(false));
        }

    }
}
