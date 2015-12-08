// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import org.chromium.base.ThreadUtils;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkContent, XWalkGeolocationPermissions

private class <init>
    implements <init>
{

    final XWalkContent this$0;

    public void invoke(final String origin, final boolean allow, final boolean retain)
    {
        ThreadUtils.runOnUiThread(new Runnable() {

            final XWalkContent.XWalkGeolocationCallback this$1;
            final boolean val$allow;
            final String val$origin;
            final boolean val$retain;

            public void run()
            {
                if (retain)
                {
                    if (allow)
                    {
                        XWalkContent.access$500(this$0).allow(origin);
                    } else
                    {
                        XWalkContent.access$500(this$0).deny(origin);
                    }
                }
                XWalkContent.access$600(this$0, mNativeContent, allow, origin);
            }

            
            {
                this$1 = XWalkContent.XWalkGeolocationCallback.this;
                retain = flag;
                allow = flag1;
                origin = s;
                super();
            }
        });
    }

    private _cls1.val.origin()
    {
        this$0 = XWalkContent.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
