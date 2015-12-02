// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.filemanager;

import java.text.Collator;
import java.util.Locale;

// Referenced classes of package com.qihoo.security.opti.trashclear.filemanager:
//            FileBrowseActivity, d

class <init> extends <init>
{

    final FileBrowseActivity a;

    public int a(d d1, d d2)
    {
        Collator collator = Collator.getInstance(Locale.CHINA);
        if (collator != null)
        {
            return collator.compare(d1.a, d2.a);
        } else
        {
            return d1.a.compareToIgnoreCase(d2.a);
        }
    }

    I(FileBrowseActivity filebrowseactivity)
    {
        a = filebrowseactivity;
        super(filebrowseactivity, null);
    }
}
