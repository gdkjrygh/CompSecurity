// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding.adapters;

import android.databinding.ViewStubProxy;

public class ViewStubBindingAdapter
{

    public ViewStubBindingAdapter()
    {
    }

    public static void setOnInflateListener(ViewStubProxy viewstubproxy, android.view.ViewStub.OnInflateListener oninflatelistener)
    {
        viewstubproxy.setOnInflateListener(oninflatelistener);
    }
}
