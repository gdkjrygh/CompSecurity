// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.Iterator;

// Referenced classes of package com.fasterxml.jackson.core:
//            TreeNode, JsonFactory, JsonParser, JsonGenerator

public abstract class ObjectCodec
{

    protected ObjectCodec()
    {
    }

    public abstract TreeNode createArrayNode();

    public abstract TreeNode createObjectNode();

    public abstract JsonFactory getJsonFactory();

    public abstract TreeNode readTree(JsonParser jsonparser);

    public abstract Object readValue(JsonParser jsonparser, ResolvedType resolvedtype);

    public abstract Object readValue(JsonParser jsonparser, TypeReference typereference);

    public abstract Object readValue(JsonParser jsonparser, Class class1);

    public abstract Iterator readValues(JsonParser jsonparser, ResolvedType resolvedtype);

    public abstract Iterator readValues(JsonParser jsonparser, TypeReference typereference);

    public abstract Iterator readValues(JsonParser jsonparser, Class class1);

    public abstract JsonParser treeAsTokens(TreeNode treenode);

    public abstract Object treeToValue(TreeNode treenode, Class class1);

    public abstract void writeValue(JsonGenerator jsongenerator, Object obj);
}
