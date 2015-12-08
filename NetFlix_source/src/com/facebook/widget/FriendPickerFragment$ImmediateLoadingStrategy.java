// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;


// Referenced classes of package com.facebook.widget:
//            FriendPickerFragment, GraphObjectPagingLoader, SimpleGraphObjectCursor

private class <init> extends <init>
{

    final FriendPickerFragment this$0;

    private void followNextLink()
    {
        displayActivityCircle();
        loader.followNextLink();
    }

    protected void onLoadFinished(GraphObjectPagingLoader graphobjectpagingloader, SimpleGraphObjectCursor simplegraphobjectcursor)
    {
        super.loader(graphobjectpagingloader, simplegraphobjectcursor);
        if (simplegraphobjectcursor != null && !graphobjectpagingloader.isLoading())
        {
            if (simplegraphobjectcursor.areMoreObjectsAvailable())
            {
                followNextLink();
                return;
            }
            hideActivityCircle();
            if (simplegraphobjectcursor.isFromCache())
            {
                long l;
                if (simplegraphobjectcursor.getCount() == 0)
                {
                    l = 2000L;
                } else
                {
                    l = 0L;
                }
                graphobjectpagingloader.refreshOriginalRequest(l);
                return;
            }
        }
    }

    private ()
    {
        this$0 = FriendPickerFragment.this;
        super(FriendPickerFragment.this);
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
