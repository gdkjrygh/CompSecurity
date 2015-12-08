// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class BX extends BQ
{

    public als mScheduleDate;

    protected BX()
    {
    }

    public BX(Rg rg)
    {
        super(rg);
    }

    public String toString()
    {
        return ds.a(this).a("lensId", super.mLensId).a("lensCode", super.mLensCode).a("imageId", super.mIconLink).a("hintId", super.mHintId).a("lensLink", super.mLensLink).a("configPath", super.mConfigPath).a("filesPath", super.mFilesPath).a("clientCacheExpiration", super.mClientCacheExpiration).a("priority", super.mPriority).a("order", super.mOrder).a("isSponsored", super.mIsSponsored).a("scheduleDate", mScheduleDate).a("isPreparingResources", super.mIsLoading).a("hasPreparedResources", g()).toString();
    }
}
