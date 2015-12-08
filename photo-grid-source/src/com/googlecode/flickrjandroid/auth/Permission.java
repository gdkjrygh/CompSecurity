// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.auth;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Permission
    implements Serializable
{

    public static final Permission DELETE;
    public static final int DELETE_TYPE = 3;
    public static final Permission NONE;
    public static final int NONE_TYPE = 0;
    public static final Permission READ;
    public static final int READ_TYPE = 1;
    public static final Permission WRITE;
    public static final int WRITE_TYPE = 2;
    private static final long serialVersionUID = 0xb5468ce96c6424afL;
    private static final Map stringToPermissionMap;
    private int type;

    private Permission(int i)
    {
        type = i;
    }

    public static Permission fromString(String s)
    {
        return (Permission)stringToPermissionMap.get(s.toLowerCase());
    }

    public int getType()
    {
        return type;
    }

    public String toString()
    {
        switch (type)
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unsupported type: ")).append(type).toString());

        case 0: // '\0'
            return "none";

        case 1: // '\001'
            return "read";

        case 2: // '\002'
            return "write";

        case 3: // '\003'
            return "delete";
        }
    }

    static 
    {
        NONE = new Permission(0);
        READ = new Permission(1);
        WRITE = new Permission(2);
        DELETE = new Permission(3);
        HashMap hashmap = new HashMap();
        stringToPermissionMap = hashmap;
        hashmap.put("none", NONE);
        stringToPermissionMap.put("read", READ);
        stringToPermissionMap.put("write", WRITE);
        stringToPermissionMap.put("delete", DELETE);
    }
}
