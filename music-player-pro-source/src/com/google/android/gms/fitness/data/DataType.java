// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.la;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.fitness.data:
//            Field, h

public final class DataType
    implements SafeParcelable
{

    public static final DataType AGGREGATE_ACTIVITY_SUMMARY;
    public static final DataType AGGREGATE_DISTANCE_DELTA;
    public static final DataType AGGREGATE_HEART_RATE_SUMMARY;
    public static final Set AGGREGATE_INPUT_TYPES;
    public static final DataType AGGREGATE_LOCATION_BOUNDING_BOX;
    public static final DataType AGGREGATE_POWER_SUMMARY;
    public static final DataType AGGREGATE_SPEED_SUMMARY;
    public static final DataType AGGREGATE_STEP_COUNT_DELTA;
    public static final DataType AGGREGATE_WEIGHT_SUMMARY;
    public static final android.os.Parcelable.Creator CREATOR = new h();
    public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.data_type/";
    public static final DataType TYPE_ACTIVITY_SAMPLE;
    public static final DataType TYPE_ACTIVITY_SEGMENT;
    public static final DataType TYPE_CALORIES_CONSUMED;
    public static final DataType TYPE_CALORIES_EXPENDED;
    public static final DataType TYPE_CYCLING_PEDALING_CADENCE;
    public static final DataType TYPE_CYCLING_PEDALING_CUMULATIVE;
    public static final DataType TYPE_CYCLING_WHEEL_REVOLUTION;
    public static final DataType TYPE_CYCLING_WHEEL_RPM;
    public static final DataType TYPE_DISTANCE_CUMULATIVE;
    public static final DataType TYPE_DISTANCE_DELTA;
    public static final DataType TYPE_HEART_RATE_BPM;
    public static final DataType TYPE_HEIGHT;
    public static final DataType TYPE_LOCATION_SAMPLE;
    public static final DataType TYPE_POWER_SAMPLE;
    public static final DataType TYPE_SPEED;
    public static final DataType TYPE_STEP_COUNT_CADENCE;
    public static final DataType TYPE_STEP_COUNT_CUMULATIVE;
    public static final DataType TYPE_STEP_COUNT_DELTA;
    public static final DataType TYPE_WEIGHT;
    public static final DataType Uq;
    public static final DataType Ur;
    private static final Map Us = new HashMap() {

            
            {
                put(DataType.TYPE_ACTIVITY_SEGMENT, Arrays.asList(new DataType[] {
                    DataType.AGGREGATE_ACTIVITY_SUMMARY
                }));
                put(DataType.TYPE_DISTANCE_DELTA, Arrays.asList(new DataType[] {
                    DataType.AGGREGATE_DISTANCE_DELTA
                }));
                put(DataType.TYPE_LOCATION_SAMPLE, Arrays.asList(new DataType[] {
                    DataType.AGGREGATE_LOCATION_BOUNDING_BOX
                }));
                put(DataType.TYPE_POWER_SAMPLE, Arrays.asList(new DataType[] {
                    DataType.AGGREGATE_POWER_SUMMARY
                }));
                put(DataType.TYPE_HEART_RATE_BPM, Arrays.asList(new DataType[] {
                    DataType.AGGREGATE_HEART_RATE_SUMMARY
                }));
                put(DataType.TYPE_SPEED, Arrays.asList(new DataType[] {
                    DataType.AGGREGATE_SPEED_SUMMARY
                }));
                put(DataType.TYPE_STEP_COUNT_DELTA, Arrays.asList(new DataType[] {
                    DataType.AGGREGATE_STEP_COUNT_DELTA
                }));
                put(DataType.TYPE_WEIGHT, Arrays.asList(new DataType[] {
                    DataType.AGGREGATE_WEIGHT_SUMMARY
                }));
            }
    };
    public static final DataType Ut[];
    public static final String Uu[];
    private final int CK;
    private final List Uv;
    private final String mName;

    DataType(int i, String s, List list)
    {
        CK = i;
        mName = s;
        Uv = Collections.unmodifiableList(list);
    }

    public transient DataType(String s, Field afield[])
    {
        this(1, s, ((List) (la.b(afield))));
    }

    private boolean a(DataType datatype)
    {
        return mName.equals(datatype.mName) && Uv.equals(datatype.Uv);
    }

    public static List getAggregatesForInput(DataType datatype)
    {
        datatype = (List)Us.get(datatype);
        if (datatype == null)
        {
            return Collections.emptyList();
        } else
        {
            return Collections.unmodifiableList(datatype);
        }
    }

    public static String getMimeType(DataType datatype)
    {
        return (new StringBuilder()).append("vnd.google.fitness.data_type/").append(datatype.getName()).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof DataType) && a((DataType)obj);
    }

    public List getFields()
    {
        return Uv;
    }

    public String getName()
    {
        return mName;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return mName.hashCode();
    }

    public int indexOf(Field field)
    {
        if (Uv.contains(field))
        {
            return Uv.indexOf(field);
        } else
        {
            throw new IllegalArgumentException(String.format("%s not a field of %s", new Object[] {
                field, this
            }));
        }
    }

    public String jB()
    {
        if (mName.startsWith("com.google."))
        {
            return mName.substring(11);
        } else
        {
            return mName;
        }
    }

    public String toString()
    {
        return String.format("DataType{%s%s}", new Object[] {
            mName, Uv
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        h.a(this, parcel, i);
    }

    static 
    {
        TYPE_STEP_COUNT_DELTA = new DataType("com.google.step_count.delta", new Field[] {
            Field.FIELD_STEPS
        });
        TYPE_STEP_COUNT_CUMULATIVE = new DataType("com.google.step_count.cumulative", new Field[] {
            Field.FIELD_STEPS
        });
        TYPE_STEP_COUNT_CADENCE = new DataType("com.google.step_count.cadence", new Field[] {
            Field.FIELD_RPM
        });
        TYPE_ACTIVITY_SEGMENT = new DataType("com.google.activity.segment", new Field[] {
            Field.FIELD_ACTIVITY
        });
        TYPE_CALORIES_CONSUMED = new DataType("com.google.calories.consumed", new Field[] {
            Field.FIELD_CALORIES
        });
        TYPE_CALORIES_EXPENDED = new DataType("com.google.calories.expended", new Field[] {
            Field.FIELD_CALORIES
        });
        TYPE_POWER_SAMPLE = new DataType("com.google.power.sample", new Field[] {
            Field.FIELD_WATTS
        });
        TYPE_ACTIVITY_SAMPLE = new DataType("com.google.activity.sample", new Field[] {
            Field.FIELD_ACTIVITY, Field.FIELD_CONFIDENCE
        });
        Uq = new DataType("com.google.activity.edge", new Field[] {
            Field.FIELD_ACTIVITY, Field.UA
        });
        Ur = new DataType("com.google.accelerometer", new Field[] {
            Field.UB, Field.UC, Field.UD
        });
        TYPE_HEART_RATE_BPM = new DataType("com.google.heart_rate.bpm", new Field[] {
            Field.FIELD_BPM
        });
        TYPE_LOCATION_SAMPLE = new DataType("com.google.location.sample", new Field[] {
            Field.FIELD_LATITUDE, Field.FIELD_LONGITUDE, Field.FIELD_ACCURACY, Field.FIELD_ALTITUDE
        });
        TYPE_DISTANCE_DELTA = new DataType("com.google.distance.delta", new Field[] {
            Field.FIELD_DISTANCE
        });
        TYPE_DISTANCE_CUMULATIVE = new DataType("com.google.distance.cumulative", new Field[] {
            Field.FIELD_DISTANCE
        });
        TYPE_SPEED = new DataType("com.google.speed", new Field[] {
            Field.FIELD_SPEED
        });
        TYPE_CYCLING_WHEEL_REVOLUTION = new DataType("com.google.cycling.wheel_revolution.cumulative", new Field[] {
            Field.FIELD_REVOLUTIONS
        });
        TYPE_CYCLING_WHEEL_RPM = new DataType("com.google.cycling.wheel_revolution.rpm", new Field[] {
            Field.FIELD_RPM
        });
        TYPE_CYCLING_PEDALING_CUMULATIVE = new DataType("com.google.cycling.pedaling.cumulative", new Field[] {
            Field.FIELD_REVOLUTIONS
        });
        TYPE_CYCLING_PEDALING_CADENCE = new DataType("com.google.cycling.pedaling.cadence", new Field[] {
            Field.FIELD_RPM
        });
        TYPE_HEIGHT = new DataType("com.google.height", new Field[] {
            Field.FIELD_HEIGHT
        });
        TYPE_WEIGHT = new DataType("com.google.weight", new Field[] {
            Field.FIELD_WEIGHT
        });
        AGGREGATE_INPUT_TYPES = Collections.unmodifiableSet(new HashSet(Arrays.asList(new DataType[] {
            TYPE_STEP_COUNT_DELTA, TYPE_DISTANCE_DELTA, TYPE_ACTIVITY_SEGMENT, TYPE_SPEED, TYPE_HEART_RATE_BPM, TYPE_WEIGHT, TYPE_LOCATION_SAMPLE
        })));
        AGGREGATE_ACTIVITY_SUMMARY = new DataType("com.google.activity.summary", new Field[] {
            Field.FIELD_ACTIVITY, Field.FIELD_DURATION, Field.FIELD_NUM_SEGMENTS
        });
        AGGREGATE_STEP_COUNT_DELTA = TYPE_STEP_COUNT_DELTA;
        AGGREGATE_DISTANCE_DELTA = TYPE_DISTANCE_DELTA;
        AGGREGATE_HEART_RATE_SUMMARY = new DataType("com.google.heart_rate.summary", new Field[] {
            Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN
        });
        AGGREGATE_LOCATION_BOUNDING_BOX = new DataType("com.google.location.bounding_box", new Field[] {
            Field.FIELD_LOW_LATITUDE, Field.FIELD_LOW_LONGITUDE, Field.FIELD_HIGH_LATITUDE, Field.FIELD_HIGH_LONGITUDE
        });
        AGGREGATE_POWER_SUMMARY = new DataType("com.google.power.summary", new Field[] {
            Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN
        });
        AGGREGATE_SPEED_SUMMARY = new DataType("com.google.speed.summary", new Field[] {
            Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN
        });
        AGGREGATE_WEIGHT_SUMMARY = new DataType("com.google.weight.summary", new Field[] {
            Field.FIELD_AVERAGE, Field.FIELD_MAX, Field.FIELD_MIN
        });
        Ut = (new DataType[] {
            Ur, Uq, TYPE_ACTIVITY_SAMPLE, TYPE_ACTIVITY_SEGMENT, AGGREGATE_ACTIVITY_SUMMARY, TYPE_CALORIES_CONSUMED, TYPE_CALORIES_EXPENDED, TYPE_CYCLING_PEDALING_CADENCE, TYPE_CYCLING_PEDALING_CUMULATIVE, TYPE_CYCLING_WHEEL_REVOLUTION, 
            TYPE_CYCLING_WHEEL_RPM, TYPE_DISTANCE_CUMULATIVE, TYPE_DISTANCE_DELTA, TYPE_HEART_RATE_BPM, AGGREGATE_HEART_RATE_SUMMARY, TYPE_HEIGHT, AGGREGATE_LOCATION_BOUNDING_BOX, TYPE_LOCATION_SAMPLE, TYPE_POWER_SAMPLE, AGGREGATE_POWER_SUMMARY, 
            TYPE_SPEED, AGGREGATE_SPEED_SUMMARY, TYPE_STEP_COUNT_CADENCE, TYPE_STEP_COUNT_CUMULATIVE, TYPE_STEP_COUNT_DELTA, TYPE_WEIGHT, AGGREGATE_WEIGHT_SUMMARY
        });
        Uu = (new String[] {
            Ur.getName(), Uq.getName(), TYPE_ACTIVITY_SAMPLE.getName(), TYPE_ACTIVITY_SEGMENT.getName(), AGGREGATE_ACTIVITY_SUMMARY.getName(), TYPE_CALORIES_CONSUMED.getName(), TYPE_CALORIES_EXPENDED.getName(), TYPE_CYCLING_PEDALING_CADENCE.getName(), TYPE_CYCLING_PEDALING_CUMULATIVE.getName(), TYPE_CYCLING_WHEEL_REVOLUTION.getName(), 
            TYPE_CYCLING_WHEEL_RPM.getName(), TYPE_DISTANCE_CUMULATIVE.getName(), TYPE_DISTANCE_DELTA.getName(), TYPE_HEART_RATE_BPM.getName(), AGGREGATE_HEART_RATE_SUMMARY.getName(), TYPE_HEIGHT.getName(), AGGREGATE_LOCATION_BOUNDING_BOX.getName(), TYPE_LOCATION_SAMPLE.getName(), TYPE_POWER_SAMPLE.getName(), AGGREGATE_POWER_SUMMARY.getName(), 
            TYPE_SPEED.getName(), AGGREGATE_SPEED_SUMMARY.getName(), TYPE_STEP_COUNT_CADENCE.getName(), TYPE_STEP_COUNT_CUMULATIVE.getName(), TYPE_STEP_COUNT_DELTA.getName(), TYPE_WEIGHT.getName(), AGGREGATE_WEIGHT_SUMMARY.getName()
        });
    }
}
