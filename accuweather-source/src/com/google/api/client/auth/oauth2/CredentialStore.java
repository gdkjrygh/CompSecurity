// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import java.io.IOException;

// Referenced classes of package com.google.api.client.auth.oauth2:
//            Credential

public interface CredentialStore
{

    public abstract void delete(String s, Credential credential)
        throws IOException;

    public abstract boolean load(String s, Credential credential)
        throws IOException;

    public abstract void store(String s, Credential credential)
        throws IOException;
}
