// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.convert;

import org.joda.time.JodaTimePermission;

// Referenced classes of package org.joda.time.convert:
//            ConverterSet, Converter, ReadableInstantConverter, StringConverter, 
//            CalendarConverter, DateConverter, LongConverter, NullConverter, 
//            ReadablePartialConverter, ReadableDurationConverter, ReadableIntervalConverter, ReadablePeriodConverter, 
//            DurationConverter, InstantConverter, IntervalConverter, PartialConverter, 
//            PeriodConverter

public final class ConverterManager
{

    private static ConverterManager INSTANCE;
    private ConverterSet iDurationConverters;
    private ConverterSet iInstantConverters;
    private ConverterSet iIntervalConverters;
    private ConverterSet iPartialConverters;
    private ConverterSet iPeriodConverters;

    protected ConverterManager()
    {
        iInstantConverters = new ConverterSet(new Converter[] {
            ReadableInstantConverter.INSTANCE, StringConverter.INSTANCE, CalendarConverter.INSTANCE, DateConverter.INSTANCE, LongConverter.INSTANCE, NullConverter.INSTANCE
        });
        iPartialConverters = new ConverterSet(new Converter[] {
            ReadablePartialConverter.INSTANCE, ReadableInstantConverter.INSTANCE, StringConverter.INSTANCE, CalendarConverter.INSTANCE, DateConverter.INSTANCE, LongConverter.INSTANCE, NullConverter.INSTANCE
        });
        iDurationConverters = new ConverterSet(new Converter[] {
            ReadableDurationConverter.INSTANCE, ReadableIntervalConverter.INSTANCE, StringConverter.INSTANCE, LongConverter.INSTANCE, NullConverter.INSTANCE
        });
        iPeriodConverters = new ConverterSet(new Converter[] {
            ReadableDurationConverter.INSTANCE, ReadablePeriodConverter.INSTANCE, ReadableIntervalConverter.INSTANCE, StringConverter.INSTANCE, NullConverter.INSTANCE
        });
        iIntervalConverters = new ConverterSet(new Converter[] {
            ReadableIntervalConverter.INSTANCE, StringConverter.INSTANCE, NullConverter.INSTANCE
        });
    }

    private void checkAlterDurationConverters()
        throws SecurityException
    {
        SecurityManager securitymanager = System.getSecurityManager();
        if (securitymanager != null)
        {
            securitymanager.checkPermission(new JodaTimePermission("ConverterManager.alterDurationConverters"));
        }
    }

    private void checkAlterInstantConverters()
        throws SecurityException
    {
        SecurityManager securitymanager = System.getSecurityManager();
        if (securitymanager != null)
        {
            securitymanager.checkPermission(new JodaTimePermission("ConverterManager.alterInstantConverters"));
        }
    }

    private void checkAlterIntervalConverters()
        throws SecurityException
    {
        SecurityManager securitymanager = System.getSecurityManager();
        if (securitymanager != null)
        {
            securitymanager.checkPermission(new JodaTimePermission("ConverterManager.alterIntervalConverters"));
        }
    }

    private void checkAlterPartialConverters()
        throws SecurityException
    {
        SecurityManager securitymanager = System.getSecurityManager();
        if (securitymanager != null)
        {
            securitymanager.checkPermission(new JodaTimePermission("ConverterManager.alterPartialConverters"));
        }
    }

    private void checkAlterPeriodConverters()
        throws SecurityException
    {
        SecurityManager securitymanager = System.getSecurityManager();
        if (securitymanager != null)
        {
            securitymanager.checkPermission(new JodaTimePermission("ConverterManager.alterPeriodConverters"));
        }
    }

    public static ConverterManager getInstance()
    {
        if (INSTANCE == null)
        {
            INSTANCE = new ConverterManager();
        }
        return INSTANCE;
    }

    public DurationConverter addDurationConverter(DurationConverter durationconverter)
        throws SecurityException
    {
        checkAlterDurationConverters();
        if (durationconverter == null)
        {
            return null;
        } else
        {
            DurationConverter adurationconverter[] = new DurationConverter[1];
            iDurationConverters = iDurationConverters.add(durationconverter, adurationconverter);
            return adurationconverter[0];
        }
    }

    public InstantConverter addInstantConverter(InstantConverter instantconverter)
        throws SecurityException
    {
        checkAlterInstantConverters();
        if (instantconverter == null)
        {
            return null;
        } else
        {
            InstantConverter ainstantconverter[] = new InstantConverter[1];
            iInstantConverters = iInstantConverters.add(instantconverter, ainstantconverter);
            return ainstantconverter[0];
        }
    }

    public IntervalConverter addIntervalConverter(IntervalConverter intervalconverter)
        throws SecurityException
    {
        checkAlterIntervalConverters();
        if (intervalconverter == null)
        {
            return null;
        } else
        {
            IntervalConverter aintervalconverter[] = new IntervalConverter[1];
            iIntervalConverters = iIntervalConverters.add(intervalconverter, aintervalconverter);
            return aintervalconverter[0];
        }
    }

    public PartialConverter addPartialConverter(PartialConverter partialconverter)
        throws SecurityException
    {
        checkAlterPartialConverters();
        if (partialconverter == null)
        {
            return null;
        } else
        {
            PartialConverter apartialconverter[] = new PartialConverter[1];
            iPartialConverters = iPartialConverters.add(partialconverter, apartialconverter);
            return apartialconverter[0];
        }
    }

    public PeriodConverter addPeriodConverter(PeriodConverter periodconverter)
        throws SecurityException
    {
        checkAlterPeriodConverters();
        if (periodconverter == null)
        {
            return null;
        } else
        {
            PeriodConverter aperiodconverter[] = new PeriodConverter[1];
            iPeriodConverters = iPeriodConverters.add(periodconverter, aperiodconverter);
            return aperiodconverter[0];
        }
    }

    public DurationConverter getDurationConverter(Object obj)
    {
        ConverterSet converterset = iDurationConverters;
        Object obj1;
        if (obj == null)
        {
            obj1 = null;
        } else
        {
            obj1 = obj.getClass();
        }
        obj1 = (DurationConverter)converterset.select(((Class) (obj1)));
        if (obj1 != null)
        {
            return ((DurationConverter) (obj1));
        }
        obj1 = (new StringBuilder()).append("No duration converter found for type: ");
        if (obj == null)
        {
            obj = "null";
        } else
        {
            obj = obj.getClass().getName();
        }
        throw new IllegalArgumentException(((StringBuilder) (obj1)).append(((String) (obj))).toString());
    }

    public DurationConverter[] getDurationConverters()
    {
        ConverterSet converterset = iDurationConverters;
        DurationConverter adurationconverter[] = new DurationConverter[converterset.size()];
        converterset.copyInto(adurationconverter);
        return adurationconverter;
    }

    public InstantConverter getInstantConverter(Object obj)
    {
        ConverterSet converterset = iInstantConverters;
        Object obj1;
        if (obj == null)
        {
            obj1 = null;
        } else
        {
            obj1 = obj.getClass();
        }
        obj1 = (InstantConverter)converterset.select(((Class) (obj1)));
        if (obj1 != null)
        {
            return ((InstantConverter) (obj1));
        }
        obj1 = (new StringBuilder()).append("No instant converter found for type: ");
        if (obj == null)
        {
            obj = "null";
        } else
        {
            obj = obj.getClass().getName();
        }
        throw new IllegalArgumentException(((StringBuilder) (obj1)).append(((String) (obj))).toString());
    }

    public InstantConverter[] getInstantConverters()
    {
        ConverterSet converterset = iInstantConverters;
        InstantConverter ainstantconverter[] = new InstantConverter[converterset.size()];
        converterset.copyInto(ainstantconverter);
        return ainstantconverter;
    }

    public IntervalConverter getIntervalConverter(Object obj)
    {
        ConverterSet converterset = iIntervalConverters;
        Object obj1;
        if (obj == null)
        {
            obj1 = null;
        } else
        {
            obj1 = obj.getClass();
        }
        obj1 = (IntervalConverter)converterset.select(((Class) (obj1)));
        if (obj1 != null)
        {
            return ((IntervalConverter) (obj1));
        }
        obj1 = (new StringBuilder()).append("No interval converter found for type: ");
        if (obj == null)
        {
            obj = "null";
        } else
        {
            obj = obj.getClass().getName();
        }
        throw new IllegalArgumentException(((StringBuilder) (obj1)).append(((String) (obj))).toString());
    }

    public IntervalConverter[] getIntervalConverters()
    {
        ConverterSet converterset = iIntervalConverters;
        IntervalConverter aintervalconverter[] = new IntervalConverter[converterset.size()];
        converterset.copyInto(aintervalconverter);
        return aintervalconverter;
    }

    public PartialConverter getPartialConverter(Object obj)
    {
        ConverterSet converterset = iPartialConverters;
        Object obj1;
        if (obj == null)
        {
            obj1 = null;
        } else
        {
            obj1 = obj.getClass();
        }
        obj1 = (PartialConverter)converterset.select(((Class) (obj1)));
        if (obj1 != null)
        {
            return ((PartialConverter) (obj1));
        }
        obj1 = (new StringBuilder()).append("No partial converter found for type: ");
        if (obj == null)
        {
            obj = "null";
        } else
        {
            obj = obj.getClass().getName();
        }
        throw new IllegalArgumentException(((StringBuilder) (obj1)).append(((String) (obj))).toString());
    }

    public PartialConverter[] getPartialConverters()
    {
        ConverterSet converterset = iPartialConverters;
        PartialConverter apartialconverter[] = new PartialConverter[converterset.size()];
        converterset.copyInto(apartialconverter);
        return apartialconverter;
    }

    public PeriodConverter getPeriodConverter(Object obj)
    {
        ConverterSet converterset = iPeriodConverters;
        Object obj1;
        if (obj == null)
        {
            obj1 = null;
        } else
        {
            obj1 = obj.getClass();
        }
        obj1 = (PeriodConverter)converterset.select(((Class) (obj1)));
        if (obj1 != null)
        {
            return ((PeriodConverter) (obj1));
        }
        obj1 = (new StringBuilder()).append("No period converter found for type: ");
        if (obj == null)
        {
            obj = "null";
        } else
        {
            obj = obj.getClass().getName();
        }
        throw new IllegalArgumentException(((StringBuilder) (obj1)).append(((String) (obj))).toString());
    }

    public PeriodConverter[] getPeriodConverters()
    {
        ConverterSet converterset = iPeriodConverters;
        PeriodConverter aperiodconverter[] = new PeriodConverter[converterset.size()];
        converterset.copyInto(aperiodconverter);
        return aperiodconverter;
    }

    public DurationConverter removeDurationConverter(DurationConverter durationconverter)
        throws SecurityException
    {
        checkAlterDurationConverters();
        if (durationconverter == null)
        {
            return null;
        } else
        {
            DurationConverter adurationconverter[] = new DurationConverter[1];
            iDurationConverters = iDurationConverters.remove(durationconverter, adurationconverter);
            return adurationconverter[0];
        }
    }

    public InstantConverter removeInstantConverter(InstantConverter instantconverter)
        throws SecurityException
    {
        checkAlterInstantConverters();
        if (instantconverter == null)
        {
            return null;
        } else
        {
            InstantConverter ainstantconverter[] = new InstantConverter[1];
            iInstantConverters = iInstantConverters.remove(instantconverter, ainstantconverter);
            return ainstantconverter[0];
        }
    }

    public IntervalConverter removeIntervalConverter(IntervalConverter intervalconverter)
        throws SecurityException
    {
        checkAlterIntervalConverters();
        if (intervalconverter == null)
        {
            return null;
        } else
        {
            IntervalConverter aintervalconverter[] = new IntervalConverter[1];
            iIntervalConverters = iIntervalConverters.remove(intervalconverter, aintervalconverter);
            return aintervalconverter[0];
        }
    }

    public PartialConverter removePartialConverter(PartialConverter partialconverter)
        throws SecurityException
    {
        checkAlterPartialConverters();
        if (partialconverter == null)
        {
            return null;
        } else
        {
            PartialConverter apartialconverter[] = new PartialConverter[1];
            iPartialConverters = iPartialConverters.remove(partialconverter, apartialconverter);
            return apartialconverter[0];
        }
    }

    public PeriodConverter removePeriodConverter(PeriodConverter periodconverter)
        throws SecurityException
    {
        checkAlterPeriodConverters();
        if (periodconverter == null)
        {
            return null;
        } else
        {
            PeriodConverter aperiodconverter[] = new PeriodConverter[1];
            iPeriodConverters = iPeriodConverters.remove(periodconverter, aperiodconverter);
            return aperiodconverter[0];
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("ConverterManager[").append(iInstantConverters.size()).append(" instant,").append(iPartialConverters.size()).append(" partial,").append(iDurationConverters.size()).append(" duration,").append(iPeriodConverters.size()).append(" period,").append(iIntervalConverters.size()).append(" interval]").toString();
    }
}
