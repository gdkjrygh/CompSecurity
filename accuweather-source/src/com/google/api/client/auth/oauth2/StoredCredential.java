// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import com.google.api.client.util.Objects;
import com.google.api.client.util.store.DataStore;
import com.google.api.client.util.store.DataStoreFactory;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.api.client.auth.oauth2:
//            Credential

public final class StoredCredential
    implements Serializable
{

    public static final String DEFAULT_DATA_STORE_ID = com/google/api/client/auth/oauth2/StoredCredential.getSimpleName();
    private static final long serialVersionUID = 1L;
    private String accessToken;
    private Long expirationTimeMilliseconds;
    private final Lock lock;
    private String refreshToken;

    public StoredCredential()
    {
        lock = new ReentrantLock();
    }

    public StoredCredential(Credential credential)
    {
        lock = new ReentrantLock();
        setAccessToken(credential.getAccessToken());
        setRefreshToken(credential.getRefreshToken());
        setExpirationTimeMilliseconds(credential.getExpirationTimeMilliseconds());
    }

    public static DataStore getDefaultDataStore(DataStoreFactory datastorefactory)
        throws IOException
    {
        return datastorefactory.getDataStore(DEFAULT_DATA_STORE_ID);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof StoredCredential))
            {
                return false;
            }
            obj = (StoredCredential)obj;
            if (!Objects.equal(getAccessToken(), ((StoredCredential) (obj)).getAccessToken()) || !Objects.equal(getRefreshToken(), ((StoredCredential) (obj)).getRefreshToken()) || !Objects.equal(getExpirationTimeMilliseconds(), ((StoredCredential) (obj)).getExpirationTimeMilliseconds()))
            {
                return false;
            }
        }
        return true;
    }

    public String getAccessToken()
    {
        lock.lock();
        String s = accessToken;
        lock.unlock();
        return s;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public Long getExpirationTimeMilliseconds()
    {
        lock.lock();
        Long long1 = expirationTimeMilliseconds;
        lock.unlock();
        return long1;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public String getRefreshToken()
    {
        lock.lock();
        String s = refreshToken;
        lock.unlock();
        return s;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            getAccessToken(), getRefreshToken(), getExpirationTimeMilliseconds()
        });
    }

    public StoredCredential setAccessToken(String s)
    {
        lock.lock();
        accessToken = s;
        lock.unlock();
        return this;
        s;
        lock.unlock();
        throw s;
    }

    public StoredCredential setExpirationTimeMilliseconds(Long long1)
    {
        lock.lock();
        expirationTimeMilliseconds = long1;
        lock.unlock();
        return this;
        long1;
        lock.unlock();
        throw long1;
    }

    public StoredCredential setRefreshToken(String s)
    {
        lock.lock();
        refreshToken = s;
        lock.unlock();
        return this;
        s;
        lock.unlock();
        throw s;
    }

    public String toString()
    {
        return Objects.toStringHelper(com/google/api/client/auth/oauth2/StoredCredential).add("accessToken", getAccessToken()).add("refreshToken", getRefreshToken()).add("expirationTimeMilliseconds", getExpirationTimeMilliseconds()).toString();
    }

}
