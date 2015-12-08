// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.tab;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

// Referenced classes of package com.hmobile.tab:
//            Tab

class >
    implements android.view.nClickListener
{

    final Tab this$0;

    public void onClick(View view)
    {
        if (Tab.access$0(Tab.this) != null || Tab.access$1(Tab.this) != null) goto _L2; else goto _L1
_L1:
        Toast.makeText(Tab.access$2(Tab.this), (new StringBuilder("Intent or Dialog not set for '")).append(Tab.access$3(Tab.this)).append("'").toString(), 0).show();
_L4:
        return;
_L2:
        if (Tab.access$0(Tab.this) != null && Tab.access$1(Tab.this) != null)
        {
            Toast.makeText(Tab.access$2(Tab.this), (new StringBuilder(" Only ONE can be set Intent or Dialog for '")).append(Tab.access$3(Tab.this)).append("'").toString(), 0).show();
            return;
        }
        if (Tab.access$0(Tab.this) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (Tab.access$4(Tab.this) != -1)
        {
            Tab.access$2(Tab.this).startActivityForResult(Tab.access$0(Tab.this), Tab.access$4(Tab.this));
            return;
        }
        if (Tab.access$2(Tab.this).getComponentName().getClassName().equalsIgnoreCase(Tab.access$0(Tab.this).getComponent().getClassName())) goto _L4; else goto _L3
_L3:
        Tab.access$2(Tab.this).startActivity(Tab.access$0(Tab.this));
        if (Tab.access$2(Tab.this).getClass().getSimpleName().equalsIgnoreCase("MainBookActivity")) goto _L4; else goto _L5
_L5:
        Tab.access$2(Tab.this).finish();
        return;
        if (Tab.access$1(Tab.this) == null) goto _L4; else goto _L6
_L6:
        Tab.access$1(Tab.this).show();
        return;
    }

    ()
    {
        this$0 = Tab.this;
        super();
    }
}
