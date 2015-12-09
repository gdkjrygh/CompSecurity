// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.google.android.gms.people.accountswitcherview:
//            SelectedAccountNavigationView, ExpanderView

private final class <init>
    implements <init>
{

    final SelectedAccountNavigationView this$0;

    public final <init> createViewHolderItem(View view)
    {
        <init> <init>1 = new <init>();
        <init>1.<init> = view;
        <init>1.<init> = view.findViewById(0x7f0d0342);
        <init>1. = view.findViewById(0x7f0d0069);
        <init>1.Image = (ImageView)<init>1.;
        <init>1.tDisplayName = (TextView)view.findViewById(0x7f0d00ed);
        <init>1.s = (TextView)view.findViewById(0x7f0d00da);
        <init>1.s = (ImageView)view.findViewById(0x7f0d030a);
        <init>1.ton = (ExpanderView)view.findViewById(0x7f0d0346);
        <init>1.ton = view.findViewById(0x7f0d0341);
        <init>1.ton = findViewById(0x7f0d033f);
        if (SelectedAccountNavigationView.access$900(SelectedAccountNavigationView.this))
        {
            <init>1. = view.findViewById(0x7f0d0017);
            <init>1.Image = (ImageView)<init>1.;
            <init>1. = view.findViewById(0x7f0d00ea);
            <init>1.Image = (ImageView)<init>1.;
            <init>1.r = view.findViewById(0x7f0d00e7);
            <init>1.rImage = (ImageView)<init>1.r;
            <init>1.Photo = (ImageView)view.findViewById(0x7f0d0340);
            <init>1.Photo = view.findViewById(0x7f0d0343);
            <init>1.ntDisplayName = (TextView)view.findViewById(0x7f0d0344);
            <init>1.ss = (TextView)view.findViewById(0x7f0d0345);
            <init>1.ts1 = view.findViewById(0x7f0d00e8);
            <init>1.ts1Image = (ImageView)<init>1.ts1;
            <init>1.ts2 = view.findViewById(0x7f0d00e9);
            <init>1.ts2Image = (ImageView)<init>1.ts2;
        }
        return <init>1;
    }

    private ()
    {
        this$0 = SelectedAccountNavigationView.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
