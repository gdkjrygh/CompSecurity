// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker.Search;

import com.skype.android.analytics.EcsControllableEvent;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.SkypeTelemetryEvent;

public class SearchTelemetryEvent extends SkypeTelemetryEvent
{

    public SearchTelemetryEvent(EcsControllableEvent ecscontrollableevent, String s, int i)
    {
        super(ecscontrollableevent);
        put(LogAttributeName.Z, s);
        put(LogAttributeName.aa, Integer.valueOf(i));
    }

    public SearchTelemetryEvent(EcsControllableEvent ecscontrollableevent, String s, MediaPickerSearchFragment.SearchStringSource searchstringsource, com.skype.MediaDocument.DOCUMENT_TYPE document_type, String s1, int i, int j)
    {
        super(ecscontrollableevent);
        if (document_type.equals(com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK))
        {
            put(LogAttributeName.E, s1);
        } else
        {
            put(LogAttributeName.Y, s1);
        }
        put(LogAttributeName.T, searchstringsource);
        put(LogAttributeName.S, s);
        put(LogAttributeName.U, Integer.valueOf(i));
        put(LogAttributeName.V, Integer.valueOf(j));
    }

    public SearchTelemetryEvent(EcsControllableEvent ecscontrollableevent, String s, MediaPickerSearchFragment.SearchStringSource searchstringsource, String s1, int i, int j, int k)
    {
        this(ecscontrollableevent, s, searchstringsource, com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FLIK, s1, i, j);
        put(LogAttributeName.F, Integer.valueOf(k));
    }
}
