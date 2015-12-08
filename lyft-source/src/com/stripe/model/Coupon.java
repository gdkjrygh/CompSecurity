// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import java.util.Map;

// Referenced classes of package com.stripe.model:
//            MetadataStore, CouponCollection, DeletedCoupon

public class Coupon extends APIResource
    implements MetadataStore
{

    Integer amountOff;
    String currency;
    String duration;
    Integer durationInMonths;
    String id;
    Boolean livemode;
    Long maxRedemptions;
    Map metadata;
    Integer percentOff;
    Long redeemBy;
    Integer timesRedeemed;
    Boolean valid;

    public Coupon()
    {
    }

    public static CouponCollection all(Map map)
    {
        return all(map, (RequestOptions)null);
    }

    public static CouponCollection all(Map map, RequestOptions requestoptions)
    {
        return (CouponCollection)request(com.stripe.net.APIResource.RequestMethod.GET, classURL(com/stripe/model/Coupon), map, com/stripe/model/CouponCollection, requestoptions);
    }

    public static CouponCollection all(Map map, String s)
    {
        return all(map, RequestOptions.builder().setApiKey(s).build());
    }

    public static Coupon create(Map map)
    {
        return create(map, (RequestOptions)null);
    }

    public static Coupon create(Map map, RequestOptions requestoptions)
    {
        return (Coupon)request(com.stripe.net.APIResource.RequestMethod.POST, classURL(com/stripe/model/Coupon), map, com/stripe/model/Coupon, requestoptions);
    }

    public static Coupon create(Map map, String s)
    {
        return create(map, RequestOptions.builder().setApiKey(s).build());
    }

    public static Coupon retrieve(String s)
    {
        return retrieve(s, (RequestOptions)null);
    }

    public static Coupon retrieve(String s, RequestOptions requestoptions)
    {
        return (Coupon)request(com.stripe.net.APIResource.RequestMethod.GET, instanceURL(com/stripe/model/Coupon, s), null, com/stripe/model/Coupon, requestoptions);
    }

    public static Coupon retrieve(String s, String s1)
    {
        return retrieve(s, RequestOptions.builder().setApiKey(s1).build());
    }

    public DeletedCoupon delete()
    {
        return delete((RequestOptions)null);
    }

    public DeletedCoupon delete(RequestOptions requestoptions)
    {
        return (DeletedCoupon)request(com.stripe.net.APIResource.RequestMethod.DELETE, instanceURL(com/stripe/model/Coupon, id), null, com/stripe/model/DeletedCoupon, requestoptions);
    }

    public DeletedCoupon delete(String s)
    {
        return delete(RequestOptions.builder().setApiKey(s).build());
    }

    public Integer getAmountOff()
    {
        return amountOff;
    }

    public String getCurrency()
    {
        return currency;
    }

    public String getDuration()
    {
        return duration;
    }

    public Integer getDurationInMonths()
    {
        return durationInMonths;
    }

    public String getId()
    {
        return id;
    }

    public Boolean getLivemode()
    {
        return livemode;
    }

    public Long getMaxRedemptions()
    {
        return maxRedemptions;
    }

    public Map getMetadata()
    {
        return metadata;
    }

    public Integer getPercentOff()
    {
        return percentOff;
    }

    public Long getRedeemBy()
    {
        return redeemBy;
    }

    public Integer getTimesRedeemed()
    {
        return timesRedeemed;
    }

    public Boolean getValid()
    {
        return valid;
    }

    public void setAmountOff(Integer integer)
    {
        amountOff = integer;
    }

    public void setCurrency(String s)
    {
        currency = s;
    }

    public void setDuration(String s)
    {
        duration = s;
    }

    public void setDurationInMonths(Integer integer)
    {
        durationInMonths = integer;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLivemode(Boolean boolean1)
    {
        livemode = boolean1;
    }

    public void setMaxRedemptions(Long long1)
    {
        maxRedemptions = long1;
    }

    public void setMetadata(Map map)
    {
        metadata = map;
    }

    public void setPercentOff(Integer integer)
    {
        percentOff = integer;
    }

    public void setRedeemBy(Long long1)
    {
        redeemBy = long1;
    }

    public void setTimesRedeemed(Integer integer)
    {
        timesRedeemed = integer;
    }

    public void setValid(Boolean boolean1)
    {
        valid = boolean1;
    }

    public Coupon update(Map map)
    {
        return update(map, (RequestOptions)null);
    }

    public Coupon update(Map map, RequestOptions requestoptions)
    {
        return (Coupon)request(com.stripe.net.APIResource.RequestMethod.POST, instanceURL(com/stripe/model/Coupon, id), map, com/stripe/model/Coupon, requestoptions);
    }

    public Coupon update(Map map, String s)
    {
        return update(map, RequestOptions.builder().setApiKey(s).build());
    }

    public volatile MetadataStore update(Map map)
    {
        return update(map);
    }

    public volatile MetadataStore update(Map map, RequestOptions requestoptions)
    {
        return update(map, requestoptions);
    }
}
