// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;

import com.google.android.apps.handwriting.service.HandwritingRecognizerInfo;
import java.util.ArrayList;
import java.util.Iterator;

public class eceiver extends com.google.android.apps.handwriting.service.iver
{

    public final void a(ArrayList arraylist)
    {
        arraylist.size();
        for (arraylist = arraylist.iterator(); arraylist.hasNext();)
        {
            HandwritingRecognizerInfo handwritingrecognizerinfo = (HandwritingRecognizerInfo)arraylist.next();
            String s = handwritingrecognizerinfo.a;
            boolean flag = handwritingrecognizerinfo.b;
        }

    }

    public eceiver()
    {
    }
}
