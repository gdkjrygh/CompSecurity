// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import android.view.View;
import com.qihoo.security.malware.db.c;
import com.qihoo.security.malware.vo.MaliciousInfo;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.antivirus:
//            VirusIgnoreListActivity

class a
    implements android.view.reListActivity.a._cls2
{

    final MaliciousInfo a;
    final tifyDataSetChanged b;

    public void onClick(View view)
    {
        VirusIgnoreListActivity.b(b.b, true);
        c.a(b(b), a._id);
        VirusIgnoreListActivity.b(b.b).remove(a);
        b.tifyDataSetChanged();
    }

    A(A a1, MaliciousInfo maliciousinfo)
    {
        b = a1;
        a = maliciousinfo;
        super();
    }
}
