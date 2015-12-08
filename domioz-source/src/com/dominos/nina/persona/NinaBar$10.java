// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

// Referenced classes of package com.dominos.nina.persona:
//            NinaBar, NinaAnimatedIcon

class 
    implements android.view.sChangeListener
{

    final NinaBar this$0;
    final Runnable val$listenerRunnableListeningAborted;

    public void onFocusChange(View view, boolean flag)
    {
        if (flag && !NinaBar.access$1100(NinaBar.this))
        {
            NinaBar.access$1102(NinaBar.this, true);
            NinaBar.access$002(NinaBar.this, false);
            NinaBar.access$100(NinaBar.this).toEditing();
            NinaBar.access$300(NinaBar.this).setHint(NinaBar.access$1300(NinaBar.this));
            NinaBar.access$1200(NinaBar.this);
            (new Thread(val$listenerRunnableListeningAborted)).start();
        } else
        if (!flag && NinaBar.access$400(NinaBar.this).isActive(NinaBar.access$300(NinaBar.this)))
        {
            cleanupEdit();
            return;
        }
    }

    Manager()
    {
        this$0 = final_ninabar;
        val$listenerRunnableListeningAborted = Runnable.this;
        super();
    }
}
