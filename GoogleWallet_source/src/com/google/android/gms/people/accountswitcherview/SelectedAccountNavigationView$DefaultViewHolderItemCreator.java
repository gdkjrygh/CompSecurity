// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.google.android.gms.people.accountswitcherview:
//            SelectedAccountNavigationView, ExpanderView

final class <init>
    implements <init>
{

    final SelectedAccountNavigationView this$0;

    public final <init> createViewHolderItem(View view)
    {
        <init> <init>1 = new <init>();
        <init>1.<init> = view;
        <init>1.<init> = view.findViewById(<init>);
        <init>1. = view.findViewById();
        <init>1.Image = (ImageView)<init>1.;
        <init>1.tDisplayName = (TextView)view.findViewById(tDisplayName);
        <init>1.s = (TextView)view.findViewById(s);
        <init>1.s = (ImageView)view.findViewById(s);
        <init>1.ton = (ExpanderView)view.findViewById(ton);
        <init>1.ton = view.findViewById(ton);
        <init>1.ton = findViewById(ton);
        if (SelectedAccountNavigationView.access$900(SelectedAccountNavigationView.this))
        {
            <init>1. = view.findViewById();
            <init>1.Image = (ImageView)<init>1.;
            <init>1. = view.findViewById();
            <init>1.Image = (ImageView)<init>1.;
            <init>1.r = view.findViewById(r);
            <init>1.rImage = (ImageView)<init>1.r;
            <init>1.Photo = (ImageView)view.findViewById(Photo);
            <init>1.Photo = view.findViewById(Photo);
            <init>1.ntDisplayName = (TextView)view.findViewById(ntDisplayName);
            <init>1.ss = (TextView)view.findViewById(ss);
            <init>1.ts1 = view.findViewById(ts1);
            <init>1.ts1Image = (ImageView)<init>1.ts1;
            <init>1.ts2 = view.findViewById(ts2);
            <init>1.ts2Image = (ImageView)<init>1.ts2;
        }
        return <init>1;
    }

    private ()
    {
        this$0 = SelectedAccountNavigationView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
