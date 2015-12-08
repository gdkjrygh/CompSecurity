// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.converter;


// Referenced classes of package com.google.android.gms.games.server.converter:
//            ImageUrlBuilder

public class PlayerImageUrlConverter
    implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
{

    public PlayerImageUrlConverter()
    {
    }

    public final volatile Object convert(Object obj)
    {
        obj = new ImageUrlBuilder((String)obj);
        obj.mAllowSilhouette = false;
        obj.mSize = 96;
        return ((ImageUrlBuilder) (obj)).build();
    }

    public final volatile Object convertBack(Object obj)
    {
        return (String)obj;
    }

    public final int getTypeOut()
    {
        return 7;
    }
}
