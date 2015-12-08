// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.onboarding.taste.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;
import java.util.ArrayList;
import java.util.List;

public class Answers
    implements JacksonModel
{

    public List answers;

    public Answers(List list)
    {
        answers = new ArrayList();
        answers = (List)ctz.a(list);
    }
}
