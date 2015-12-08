// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;


// Referenced classes of package com.facebook.widget:
//            GraphObjectAdapter, GraphObjectPagingLoader, PlacePickerFragment, SimpleGraphObjectCursor

class <init> extends <init>
{

    final PlacePickerFragment this$0;

    public void attach(GraphObjectAdapter graphobjectadapter)
    {
        super._mth1(graphobjectadapter);
        class _cls1
            implements GraphObjectAdapter.DataNeededListener
        {

            final PlacePickerFragment.AsNeededLoadingStrategy this$1;

            public void onDataNeeded()
            {
                if (!loader.isLoading())
                {
                    loader.followNextLink();
                }
            }

            _cls1()
            {
                this$1 = PlacePickerFragment.AsNeededLoadingStrategy.this;
                super();
            }
        }

        adapter.setDataNeededListener(new _cls1());
    }

    protected void onLoadFinished(GraphObjectPagingLoader graphobjectpagingloader, SimpleGraphObjectCursor simplegraphobjectcursor)
    {
        super.d(graphobjectpagingloader, simplegraphobjectcursor);
        if (simplegraphobjectcursor != null && !graphobjectpagingloader.isLoading())
        {
            hideActivityCircle();
            if (simplegraphobjectcursor.isFromCache())
            {
                long l;
                if (simplegraphobjectcursor.areMoreObjectsAvailable())
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

    private _cls1()
    {
        this$0 = PlacePickerFragment.this;
        super(PlacePickerFragment.this);
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
