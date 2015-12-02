// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.filemanager;

import android.widget.CompoundButton;

// Referenced classes of package com.qihoo.security.opti.trashclear.filemanager:
//            FileBrowseActivity, d

class a
    implements android.widget.dChangeListener
{

    final d a;
    final a b;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
label0:
        {
            if (FileBrowseActivity.i(b.b))
            {
                a.g = flag;
                if (!flag)
                {
                    break label0;
                }
                compoundbutton.setButtonDrawable(0x7f02006c);
            }
            return;
        }
        compoundbutton.setButtonDrawable(0x7f02006d);
    }

    ( , d d1)
    {
        b = ;
        a = d1;
        super();
    }
}
