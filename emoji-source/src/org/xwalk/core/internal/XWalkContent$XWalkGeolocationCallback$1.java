// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;


// Referenced classes of package org.xwalk.core.internal:
//            XWalkContent, XWalkGeolocationPermissions

class val.origin
    implements Runnable
{

    final val.origin this$1;
    final boolean val$allow;
    final String val$origin;
    final boolean val$retain;

    public void run()
    {
        if (val$retain)
        {
            if (val$allow)
            {
                XWalkContent.access$500(_fld0).allow(val$origin);
            } else
            {
                XWalkContent.access$500(_fld0).deny(val$origin);
            }
        }
        XWalkContent.access$600(_fld0, mNativeContent, val$allow, val$origin);
    }

    ()
    {
        this$1 = final_;
        val$retain = flag;
        val$allow = flag1;
        val$origin = String.this;
        super();
    }
}
