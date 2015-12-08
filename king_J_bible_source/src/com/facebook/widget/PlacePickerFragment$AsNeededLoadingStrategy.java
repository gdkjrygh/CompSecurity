// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;


// Referenced classes of package com.facebook.widget:
//            PlacePickerFragment, GraphObjectAdapter, GraphObjectPagingLoader, SimpleGraphObjectCursor

private class <init> extends <init>
{

    final PlacePickerFragment this$0;

    public void attach(GraphObjectAdapter graphobjectadapter)
    {
        super.<init>(graphobjectadapter);
        adapter.setDataNeededListener(new GraphObjectAdapter.DataNeededListener() {

            final PlacePickerFragment.AsNeededLoadingStrategy this$1;

            public void onDataNeeded()
            {
                if (!loader.isLoading())
                {
                    loader.followNextLink();
                }
            }

            
            {
                this$1 = PlacePickerFragment.AsNeededLoadingStrategy.this;
                super();
            }
        });
    }

    protected void onLoadFinished(GraphObjectPagingLoader graphobjectpagingloader, SimpleGraphObjectCursor simplegraphobjectcursor)
    {
        super.d(graphobjectpagingloader, simplegraphobjectcursor);
        if (simplegraphobjectcursor != null && !graphobjectpagingloader.isLoading())
        {
            hideActivityCircle();
            if (simplegraphobjectcursor.isFromCache())
            {
                int i;
                if (simplegraphobjectcursor.areMoreObjectsAvailable())
                {
                    i = 2000;
                } else
                {
                    i = 0;
                }
                graphobjectpagingloader.refreshOriginalRequest(i);
                return;
            }
        }
    }

    private _cls1.this._cls1()
    {
        this$0 = PlacePickerFragment.this;
        super(PlacePickerFragment.this);
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
