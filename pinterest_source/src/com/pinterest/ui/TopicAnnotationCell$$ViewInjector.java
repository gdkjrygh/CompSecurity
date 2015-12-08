// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui;

import android.widget.TextView;

// Referenced classes of package com.pinterest.ui:
//            TopicAnnotationCell

public class 
{

    public static void inject(butterknife.ctor ctor, TopicAnnotationCell topicannotationcell, Object obj)
    {
        topicannotationcell._topicNameWrapper = ctor.eWrapper(obj, 0x7f0f036e, "field '_topicNameWrapper'");
        topicannotationcell._topicName = (TextView)ctor.e(obj, 0x7f0f036a, "field '_topicName'");
    }

    public static void reset(TopicAnnotationCell topicannotationcell)
    {
        topicannotationcell._topicNameWrapper = null;
        topicannotationcell._topicName = null;
    }

    public ()
    {
    }
}
