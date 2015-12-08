// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;


// Referenced classes of package android.support.v4.widget:
//            SearchViewCompat

class val.listener
    implements atBridge
{

    final yTextSubmit this$0;
    final yTextSubmit val$listener;

    public boolean onQueryTextChange(String s)
    {
        return val$listener.yTextChange(s);
    }

    public boolean onQueryTextSubmit(String s)
    {
        return val$listener.yTextSubmit(s);
    }

    atBridge()
    {
        this$0 = final_atbridge;
        val$listener = val.listener.this;
        super();
    }
}
