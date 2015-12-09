// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import com.cardinalblue.android.piccollage.model.AbstractCollage;
import com.google.b.h;
import java.lang.reflect.Type;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            CollageRoot, JsonCollage

public static class setJsonCollage
    implements h
{

    protected static final String TAG_JSON = "json";
    protected static final String TAG_STRUCT = "struct";
    JsonCollage json;

    public setJsonCollage createInstance(Type type)
    {
        return new <init>();
    }

    public volatile Object createInstance(Type type)
    {
        return createInstance(type);
    }

    public JsonCollage getJsonCollage()
    {
        return json;
    }

    public void setJsonCollage(JsonCollage jsoncollage)
    {
        json = jsoncollage;
    }

    private ()
    {
        json = new JsonCollage();
    }

    public json(AbstractCollage abstractcollage)
    {
        setJsonCollage(new JsonCollage(abstractcollage));
    }

    setJsonCollage(setJsonCollage setjsoncollage)
    {
        this();
    }

    public <init>(JsonCollage jsoncollage)
    {
        setJsonCollage(jsoncollage);
    }
}
