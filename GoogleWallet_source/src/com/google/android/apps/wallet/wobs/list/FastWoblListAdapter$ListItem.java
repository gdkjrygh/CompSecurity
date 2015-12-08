// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.list;


// Referenced classes of package com.google.android.apps.wallet.wobs.list:
//            FastWoblListAdapter

public static final class sortKey
{

    final String entityId;
    final nt fingerprint;
    final com.google.wallet.proto.Adapter.Fingerprint layout;
    final String sortKey;

    public final String getEntityId()
    {
        return entityId;
    }

    public nt(String s, com.google.wallet.proto.Adapter.ListItem listitem, byte abyte0[], String s1)
    {
        entityId = s;
        layout = listitem;
        fingerprint = new nt(abyte0);
        sortKey = s1;
    }
}
