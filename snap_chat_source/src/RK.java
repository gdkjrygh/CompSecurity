// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class RK extends Qc
{

    protected String dtoken1i;
    protected String dtoken1v;
    protected String message;
    protected String messageFormat;
    protected String phoneNumber;
    protected String preAuthToken;
    protected Boolean recoveryCodeUsed;
    protected Integer status;
    protected Boolean twoFaNeeded;
    protected String username;
    protected UT verificationNeeded;

    public RK()
    {
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof RK))
        {
            return false;
        } else
        {
            obj = (RK)obj;
            return (new EqualsBuilder()).append(serverInfo, ((RK) (obj)).serverInfo).append(messagingGatewayInfo, ((RK) (obj)).messagingGatewayInfo).append(updatesResponse, ((RK) (obj)).updatesResponse).append(friendsResponse, ((RK) (obj)).friendsResponse).append(storiesResponse, ((RK) (obj)).storiesResponse).append(conversationsResponse, ((RK) (obj)).conversationsResponse).append(conversationsResponseInfo, ((RK) (obj)).conversationsResponseInfo).append(discover, ((RK) (obj)).discover).append(identityCheckResponse, ((RK) (obj)).identityCheckResponse).append(sponsored, ((RK) (obj)).sponsored).append(message, ((RK) (obj)).message).append(status, ((RK) (obj)).status).append(dtoken1i, ((RK) (obj)).dtoken1i).append(dtoken1v, ((RK) (obj)).dtoken1v).append(twoFaNeeded, ((RK) (obj)).twoFaNeeded).append(username, ((RK) (obj)).username).append(messageFormat, ((RK) (obj)).messageFormat).append(phoneNumber, ((RK) (obj)).phoneNumber).append(preAuthToken, ((RK) (obj)).preAuthToken).append(recoveryCodeUsed, ((RK) (obj)).recoveryCodeUsed).append(verificationNeeded, ((RK) (obj)).verificationNeeded).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(serverInfo).append(messagingGatewayInfo).append(updatesResponse).append(friendsResponse).append(storiesResponse).append(conversationsResponse).append(conversationsResponseInfo).append(discover).append(identityCheckResponse).append(sponsored).append(message).append(status).append(dtoken1i).append(dtoken1v).append(twoFaNeeded).append(username).append(messageFormat).append(phoneNumber).append(preAuthToken).append(recoveryCodeUsed).append(verificationNeeded).toHashCode();
    }

    public final String n()
    {
        return message;
    }

    public final Integer o()
    {
        return status;
    }

    public final String p()
    {
        return dtoken1i;
    }

    public final String q()
    {
        return dtoken1v;
    }

    public final Boolean r()
    {
        return twoFaNeeded;
    }

    public final String s()
    {
        return username;
    }

    public final String t()
    {
        return messageFormat;
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }

    public final String u()
    {
        return phoneNumber;
    }

    public final String v()
    {
        return preAuthToken;
    }

    public final Boolean w()
    {
        return recoveryCodeUsed;
    }

    public final UT x()
    {
        return verificationNeeded;
    }

    public final boolean y()
    {
        return verificationNeeded != null;
    }
}
