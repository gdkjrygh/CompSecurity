// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.emv;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.wallet.base.java.System;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Shorts;
import java.util.Arrays;

public final class RotatingAtc
{
    public static interface Listener
    {

        public abstract void atcThresholdReached();

        public abstract void lastAtcUsed();
    }

    public static class RotatingAtcLimit
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static RotatingAtcLimit createFromParcel(Parcel parcel)
            {
                return new RotatingAtcLimit(parcel.readInt(), parcel.readLong(), parcel.readString());
            }

            private static RotatingAtcLimit[] newArray(int i)
            {
                return new RotatingAtcLimit[i];
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private final long atcBundleDurationMillis;
        private final String atcBundleDurationString;
        private final int errorType;

        public int describeContents()
        {
            return 0;
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof RotatingAtcLimit)
            {
                obj = (RotatingAtcLimit)obj;
                flag = flag1;
                if (errorType == ((RotatingAtcLimit) (obj)).errorType)
                {
                    flag = flag1;
                    if (atcBundleDurationMillis == ((RotatingAtcLimit) (obj)).atcBundleDurationMillis)
                    {
                        flag = flag1;
                        if (Objects.equal(atcBundleDurationString, ((RotatingAtcLimit) (obj)).atcBundleDurationString))
                        {
                            flag = true;
                        }
                    }
                }
            }
            return flag;
        }

        public final String getBundleDurationString()
        {
            return atcBundleDurationString;
        }

        public final boolean hasReachedCountLimit()
        {
            return errorType == 1;
        }

        public final boolean hasReachedTimeLimit()
        {
            return errorType == 0;
        }

        public int hashCode()
        {
            return Objects.hashCode(new Object[] {
                Integer.valueOf(errorType), Long.valueOf(atcBundleDurationMillis), atcBundleDurationString
            });
        }

        public String toString()
        {
            com.google.common.base.Objects.ToStringHelper tostringhelper = Objects.toStringHelper(this);
            String s;
            if (errorType == 0)
            {
                s = "Bundle Expired";
            } else
            {
                s = "All Atcs Used";
            }
            return tostringhelper.add("errorType", s).add("durationMillis", atcBundleDurationMillis).add("durationString", atcBundleDurationString).toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeInt(errorType);
            parcel.writeLong(atcBundleDurationMillis);
            parcel.writeString(atcBundleDurationString);
        }


        public RotatingAtcLimit(int i, long l, String s)
        {
            boolean flag;
            if (i == 0 || i == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Unrecognized error type %s", new Object[] {
                Integer.valueOf(i)
            });
            if (l > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "invalid duration: %s", new Object[] {
                Long.valueOf(l)
            });
            errorType = i;
            atcBundleDurationMillis = l;
            atcBundleDurationString = s;
        }
    }

    public static final class UsageLimits
    {

        private final long duration;
        private final long expirationThresholdTimeClientEpoch;
        private final long expirationTimeClientEpoch;
        private final String stringDuration;
        private final int transactionCountThreshold;

        public final boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof UsageLimits)
            {
                obj = (UsageLimits)obj;
                flag = flag1;
                if (expirationTimeClientEpoch == ((UsageLimits) (obj)).expirationTimeClientEpoch)
                {
                    flag = flag1;
                    if (transactionCountThreshold == ((UsageLimits) (obj)).transactionCountThreshold)
                    {
                        flag = flag1;
                        if (expirationThresholdTimeClientEpoch == ((UsageLimits) (obj)).expirationThresholdTimeClientEpoch)
                        {
                            flag = flag1;
                            if (duration == ((UsageLimits) (obj)).duration)
                            {
                                flag = flag1;
                                if (stringDuration.equals(((UsageLimits) (obj)).stringDuration))
                                {
                                    flag = true;
                                }
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public final long getDuration()
        {
            return duration;
        }

        public final long getExpirationThresholdTimeClientEpoch()
        {
            return expirationThresholdTimeClientEpoch;
        }

        public final long getExpirationTimeClientEpoch()
        {
            return expirationTimeClientEpoch;
        }

        public final String getStringDuration()
        {
            return stringDuration;
        }

        public final int getTransactionCountThreshold()
        {
            return transactionCountThreshold;
        }

        public final int hashCode()
        {
            return Objects.hashCode(new Object[] {
                Long.valueOf(expirationTimeClientEpoch), Integer.valueOf(transactionCountThreshold), Long.valueOf(expirationThresholdTimeClientEpoch), Long.valueOf(duration), stringDuration
            });
        }

        public final String toString()
        {
            return Objects.toStringHelper(this).add("expirationTimeClientOffset", expirationTimeClientEpoch).add("transactionCountThreshold", transactionCountThreshold).add("expirationThresholdTimestampClientOffset", expirationThresholdTimeClientEpoch).add("duration", duration).add("stringDuration", stringDuration).toString();
        }


        public UsageLimits(long l, int i, long l1, long l2, 
                String s)
        {
            expirationTimeClientEpoch = l;
            transactionCountThreshold = i;
            expirationThresholdTimeClientEpoch = l1;
            duration = l2;
            stringDuration = s;
        }
    }


    private int mCurrentAtcIdx;
    private final UsageLimits mLimits;
    private final Listener mListener;
    private final int mNumAtcs;
    private final int mReaderAtcs[];
    private final int mSecretAtcs[];
    private final System mSystem;

    public RotatingAtc(int ai[], int ai1[], int i, UsageLimits usagelimits, Listener listener, System system)
    {
        Preconditions.checkNotNull(usagelimits);
        int j;
        boolean flag;
        if (ai.length == ai1.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "readerAtcs.length: %s; secretAtcs.length: %s", new Object[] {
            Integer.valueOf(ai.length), Integer.valueOf(ai1.length)
        });
        mNumAtcs = ai.length;
        if (mNumAtcs > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (i >= -1 && i <= mNumAtcs - 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "currentAtcIdx: %s; mNumAtcs: %s", new Object[] {
            Integer.valueOf(i), Integer.valueOf(mNumAtcs)
        });
        checkBounds(ai);
        checkBounds(ai1);
        j = usagelimits.getTransactionCountThreshold();
        if (j >= 0 && j <= mNumAtcs)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "transactionCountThreshold: %s", new Object[] {
            Integer.valueOf(j)
        });
        mReaderAtcs = ai;
        mSecretAtcs = ai1;
        mLimits = usagelimits;
        mListener = listener;
        mCurrentAtcIdx = i;
        mSystem = system;
    }

    public RotatingAtc(int ai[], int ai1[], UsageLimits usagelimits)
    {
        this(ai, ai1, -1, usagelimits, null, new System());
    }

    private static void checkBounds(int ai[])
    {
        int i = 0;
        while (i < ai.length) 
        {
            boolean flag;
            if (ai[i] >> 16 == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Element %s of array is out of bounds: %s", new Object[] {
                Integer.valueOf(i), Integer.valueOf(ai[i])
            });
            i++;
        }
    }

    private boolean hasReachedCountThreshold()
    {
        return mCurrentAtcIdx + 1 >= mLimits.transactionCountThreshold;
    }

    private boolean hasReachedTimeLimit()
    {
        long l = mLimits.getExpirationTimeClientEpoch();
        System system = mSystem;
        return l <= System.currentTimeMillis();
    }

    private boolean hasReachedTimeThreshold()
    {
        long l = mLimits.getExpirationThresholdTimeClientEpoch();
        System system = mSystem;
        return l <= System.currentTimeMillis();
    }

    private boolean hasRunOutOfAtcs()
    {
        return mCurrentAtcIdx >= mNumAtcs - 1;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof RotatingAtc)
        {
            obj = (RotatingAtc)obj;
            flag = flag1;
            if (mLimits.equals(((RotatingAtc) (obj)).mLimits))
            {
                flag = flag1;
                if (mCurrentAtcIdx == ((RotatingAtc) (obj)).mCurrentAtcIdx)
                {
                    flag = flag1;
                    if (Arrays.equals(mReaderAtcs, ((RotatingAtc) (obj)).mReaderAtcs))
                    {
                        flag = flag1;
                        if (Arrays.equals(mSecretAtcs, ((RotatingAtc) (obj)).mSecretAtcs))
                        {
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int getCurrentAtcIndex()
    {
        return mCurrentAtcIdx;
    }

    public final RotatingAtcLimit getLimitDescription()
    {
        if (hasRunOutOfAtcs())
        {
            return new RotatingAtcLimit(1, mLimits.getDuration(), mLimits.getStringDuration());
        } else
        {
            return new RotatingAtcLimit(0, mLimits.getDuration(), mLimits.getStringDuration());
        }
    }

    public final UsageLimits getLimits()
    {
        return mLimits;
    }

    public final int getReaderAtc()
    {
        return mReaderAtcs[mCurrentAtcIdx];
    }

    public final int[] getReaderAtcs()
    {
        return mReaderAtcs;
    }

    public final int getSecretAtc()
    {
        return mSecretAtcs[mCurrentAtcIdx];
    }

    public final int[] getSecretAtcs()
    {
        return mSecretAtcs;
    }

    public final boolean hasReachedLimit()
    {
        return hasRunOutOfAtcs() || hasReachedTimeLimit();
    }

    public final boolean hasReachedThreshold()
    {
        return hasReachedTimeThreshold() || hasReachedCountThreshold();
    }

    public final int hashCode()
    {
        return Objects.hashCode(new Object[] {
            Integer.valueOf(Arrays.hashCode(mReaderAtcs)), Integer.valueOf(Arrays.hashCode(mSecretAtcs)), mLimits, Integer.valueOf(mCurrentAtcIdx)
        });
    }

    public final void next()
    {
        boolean flag;
        if (!hasRunOutOfAtcs())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "RotatingATC ran out of atcs. size: %s", new Object[] {
            Integer.valueOf(mNumAtcs)
        });
        mCurrentAtcIdx = mCurrentAtcIdx + 1;
        if (mListener != null)
        {
            int i = mCurrentAtcIdx + 1;
            if (i >= mNumAtcs)
            {
                mListener.lastAtcUsed();
            } else
            if (i >= mLimits.transactionCountThreshold)
            {
                mListener.atcThresholdReached();
                return;
            }
        }
    }

    public final byte[] readerAtcToByteArray()
    {
        return Shorts.toByteArray((short)getReaderAtc());
    }

    public final String toString()
    {
        return String.format("readerAtcs: %s; currentIdx: %s; limits: %s", new Object[] {
            Arrays.toString(mReaderAtcs), Integer.valueOf(mCurrentAtcIdx), mLimits
        });
    }
}
