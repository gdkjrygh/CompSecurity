// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;


// Referenced classes of package org.chromium.content.browser:
//            BindingManagerImpl, ChildProcessConnection

class val.connection
    implements Runnable
{

    final ing this$1;
    final ChildProcessConnection val$connection;

    public void run()
    {
        if (val$connection.isStrongBindingBound())
        {
            val$connection.removeStrongBinding();
        }
    }

    I()
    {
        this$1 = final_i;
        val$connection = ChildProcessConnection.this;
        super();
    }
}
