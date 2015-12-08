// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;


// Referenced classes of package org.chromium.content.browser:
//            ContentReadbackHandler, ContentViewRenderView

class init> extends ContentReadbackHandler
{

    final ContentViewRenderView this$0;

    protected boolean readyForReadback()
    {
        return ContentViewRenderView.access$000(ContentViewRenderView.this) != 0L && mContentViewCore != null;
    }

    ()
    {
        this$0 = ContentViewRenderView.this;
        super();
    }
}
