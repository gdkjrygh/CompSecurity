// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yong.jamendo.api;

import java.util.ArrayList;
import org.json.JSONException;

// Referenced classes of package com.yong.jamendo.api:
//            WSError

public interface JamendoGet2Api
{

    public static final String ENCODING_MP3 = "mp31";
    public static final String ENCODING_OGG = "ogg2";

    public abstract ArrayList searchForTracksByTag(String s)
        throws JSONException, WSError;
}
