// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;


// Referenced classes of package com.fasterxml.jackson.core:
//            TreeCodec, JsonFactory, JsonParser, TreeNode, 
//            JsonGenerator

public abstract class ObjectCodec extends TreeCodec
{

    public ObjectCodec()
    {
    }

    public JsonFactory getFactory()
    {
        return getJsonFactory();
    }

    public JsonFactory getJsonFactory()
    {
        return getFactory();
    }

    public abstract TreeNode readTree(JsonParser jsonparser);

    public abstract Object treeToValue(TreeNode treenode, Class class1);

    public abstract void writeValue(JsonGenerator jsongenerator, Object obj);
}
