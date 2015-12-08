// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class etc
{

    static final String a[] = {
        "protobuf"
    };

    static String a(List list)
    {
        return b.b("collection_media_key", list.size());
    }

    static String[] b(List list)
    {
        return (String[])list.toArray(new String[list.size()]);
    }

}
