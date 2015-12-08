// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.core:
//            JsonProcessingException, TreeNode, JsonFactory, JsonParser, 
//            JsonGenerator

public abstract class ObjectCodec
{

    protected ObjectCodec()
    {
    }

    public abstract TreeNode createArrayNode();

    public abstract TreeNode createObjectNode();

    public JsonFactory getFactory()
    {
        return getJsonFactory();
    }

    public abstract JsonFactory getJsonFactory();

    public abstract TreeNode readTree(JsonParser jsonparser)
        throws IOException, JsonProcessingException;

    public abstract Object readValue(JsonParser jsonparser, ResolvedType resolvedtype)
        throws IOException, JsonProcessingException;

    public abstract Object readValue(JsonParser jsonparser, TypeReference typereference)
        throws IOException, JsonProcessingException;

    public abstract Object readValue(JsonParser jsonparser, Class class1)
        throws IOException, JsonProcessingException;

    public abstract Iterator readValues(JsonParser jsonparser, ResolvedType resolvedtype)
        throws IOException, JsonProcessingException;

    public abstract Iterator readValues(JsonParser jsonparser, TypeReference typereference)
        throws IOException, JsonProcessingException;

    public abstract Iterator readValues(JsonParser jsonparser, Class class1)
        throws IOException, JsonProcessingException;

    public abstract JsonParser treeAsTokens(TreeNode treenode);

    public abstract Object treeToValue(TreeNode treenode, Class class1)
        throws JsonProcessingException;

    public abstract void writeValue(JsonGenerator jsongenerator, Object obj)
        throws IOException, JsonProcessingException;
}
