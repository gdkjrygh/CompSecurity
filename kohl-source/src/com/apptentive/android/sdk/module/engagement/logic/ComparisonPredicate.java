// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.logic;

import android.content.Context;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.model.AppRelease;
import com.apptentive.android.sdk.model.CodePointStore;
import com.apptentive.android.sdk.model.CustomData;
import com.apptentive.android.sdk.model.Device;
import com.apptentive.android.sdk.model.Person;
import com.apptentive.android.sdk.model.Sdk;
import com.apptentive.android.sdk.storage.AppReleaseManager;
import com.apptentive.android.sdk.storage.DeviceManager;
import com.apptentive.android.sdk.storage.PersonManager;
import com.apptentive.android.sdk.storage.SdkManager;
import com.apptentive.android.sdk.storage.VersionHistoryStore;
import com.apptentive.android.sdk.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.logic:
//            Predicate, Condition

public class ComparisonPredicate extends Predicate
{
    private static final class QueryType extends Enum
    {

        private static final QueryType $VALUES[];
        public static final QueryType app_release;
        public static final QueryType application_build;
        public static final QueryType application_version;
        public static final QueryType code_point;
        public static final QueryType current_time;
        public static final QueryType device;
        public static final QueryType interactions;
        public static final QueryType is_update;
        public static final QueryType other;
        public static final QueryType person;
        public static final QueryType sdk;
        public static final QueryType time_since_install;

        public static QueryType parse(String s)
        {
            try
            {
                s = valueOf(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return other;
            }
            return s;
        }

        public static QueryType valueOf(String s)
        {
            return (QueryType)Enum.valueOf(com/apptentive/android/sdk/module/engagement/logic/ComparisonPredicate$QueryType, s);
        }

        public static QueryType[] values()
        {
            return (QueryType[])$VALUES.clone();
        }

        static 
        {
            application_version = new QueryType("application_version", 0);
            application_build = new QueryType("application_build", 1);
            current_time = new QueryType("current_time", 2);
            is_update = new QueryType("is_update", 3);
            time_since_install = new QueryType("time_since_install", 4);
            code_point = new QueryType("code_point", 5);
            interactions = new QueryType("interactions", 6);
            person = new QueryType("person", 7);
            device = new QueryType("device", 8);
            app_release = new QueryType("app_release", 9);
            sdk = new QueryType("sdk", 10);
            other = new QueryType("other", 11);
            $VALUES = (new QueryType[] {
                application_version, application_build, current_time, is_update, time_since_install, code_point, interactions, person, device, app_release, 
                sdk, other
            });
        }

        private QueryType(String s, int i)
        {
            super(s, i);
        }
    }

    private static final class ValueFilterType extends Enum
    {

        private static final ValueFilterType $VALUES[];
        public static final ValueFilterType invokes;
        public static final ValueFilterType other;

        public static ValueFilterType parse(String s)
        {
            try
            {
                s = valueOf(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return other;
            }
            return s;
        }

        public static ValueFilterType valueOf(String s)
        {
            return (ValueFilterType)Enum.valueOf(com/apptentive/android/sdk/module/engagement/logic/ComparisonPredicate$ValueFilterType, s);
        }

        public static ValueFilterType[] values()
        {
            return (ValueFilterType[])$VALUES.clone();
        }

        static 
        {
            invokes = new ValueFilterType("invokes", 0);
            other = new ValueFilterType("other", 1);
            $VALUES = (new ValueFilterType[] {
                invokes, other
            });
        }

        private ValueFilterType(String s, int i)
        {
            super(s, i);
        }
    }

    private static final class ValueSubFilterType extends Enum
    {

        private static final ValueSubFilterType $VALUES[];
        public static final ValueSubFilterType build;
        public static final ValueSubFilterType other;
        public static final ValueSubFilterType time_ago;
        public static final ValueSubFilterType total;
        public static final ValueSubFilterType version;

        public static ValueSubFilterType parse(String s)
        {
            try
            {
                s = valueOf(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return other;
            }
            return s;
        }

        public static ValueSubFilterType valueOf(String s)
        {
            return (ValueSubFilterType)Enum.valueOf(com/apptentive/android/sdk/module/engagement/logic/ComparisonPredicate$ValueSubFilterType, s);
        }

        public static ValueSubFilterType[] values()
        {
            return (ValueSubFilterType[])$VALUES.clone();
        }

        static 
        {
            total = new ValueSubFilterType("total", 0);
            version = new ValueSubFilterType("version", 1);
            build = new ValueSubFilterType("build", 2);
            time_ago = new ValueSubFilterType("time_ago", 3);
            other = new ValueSubFilterType("other", 4);
            $VALUES = (new ValueSubFilterType[] {
                total, version, build, time_ago, other
            });
        }

        private ValueSubFilterType(String s, int i)
        {
            super(s, i);
        }
    }


    protected List conditions;
    protected String query;

    public ComparisonPredicate(String s, Object obj)
        throws JSONException
    {
        query = s;
        conditions = new ArrayList();
        if (obj instanceof JSONObject)
        {
            s = (JSONObject)obj;
            String s1;
            Predicate.Operation operation;
            for (obj = s.keys(); ((Iterator) (obj)).hasNext(); conditions.add(new Condition(operation, s.get(s1))))
            {
                s1 = (String)((Iterator) (obj)).next();
                operation = Predicate.Operation.valueOf(s1);
            }

        } else
        {
            conditions.add(new Condition(Predicate.Operation.$eq, obj));
        }
    }

    private String getLoggableValue(Object obj)
    {
        if (obj != null)
        {
            if (obj instanceof String)
            {
                return (new StringBuilder()).append("\"").append(obj).append("\"").toString();
            } else
            {
                return obj.toString();
            }
        } else
        {
            return "null";
        }
    }

    private Object normalize(Object obj, Object obj1)
    {
        Object obj2 = obj1;
        if (obj instanceof Double)
        {
            obj2 = obj1;
            if (obj1 instanceof Number)
            {
                obj2 = Double.valueOf(((Number)obj1).doubleValue());
            }
        }
        return obj2;
    }

    public boolean apply(Context context)
    {
        Iterator iterator;
        Log.v("Comparison Predicate: %s", new Object[] {
            query
        });
        context = getValue(context, query);
        Log.v("   => %s", new Object[] {
            context
        });
        iterator = conditions.iterator();
_L3:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Condition condition;
        condition = (Condition)iterator.next();
        condition.operand = normalize(context, condition.operand);
        Log.v("-- Compare: %s %s %s", new Object[] {
            getLoggableValue(context), condition.operation, getLoggableValue(condition.operand)
        });
        static class _cls1
        {

            static final int $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[];
            static final int $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$ValueFilterType[];
            static final int $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$ValueSubFilterType[];
            static final int $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[];

            static 
            {
                $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation = new int[Predicate.Operation.values().length];
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[Predicate.Operation.$gt.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror25) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[Predicate.Operation.$gte.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror24) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[Predicate.Operation.$eq.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[Predicate.Operation.$ne.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[Predicate.Operation.$lte.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[Predicate.Operation.$lt.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[Predicate.Operation.$exists.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[Predicate.Operation.$contains.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[Predicate.Operation.$starts_with.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$Predicate$Operation[Predicate.Operation.$ends_with.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType = new int[QueryType.values().length];
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[QueryType.application_version.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[QueryType.application_build.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[QueryType.current_time.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[QueryType.is_update.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[QueryType.time_since_install.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[QueryType.interactions.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[QueryType.code_point.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[QueryType.person.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[QueryType.device.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[QueryType.app_release.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$QueryType[QueryType.sdk.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$ValueFilterType = new int[ValueFilterType.values().length];
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$ValueFilterType[ValueFilterType.invokes.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$ValueSubFilterType = new int[ValueSubFilterType.values().length];
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$ValueSubFilterType[ValueSubFilterType.version.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$ValueSubFilterType[ValueSubFilterType.build.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$ValueSubFilterType[ValueSubFilterType.total.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$apptentive$android$sdk$module$engagement$logic$ComparisonPredicate$ValueSubFilterType[ValueSubFilterType.time_ago.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.apptentive.android.sdk.module.engagement.logic.Predicate.Operation[condition.operation.ordinal()];
        JVM INSTR tableswitch 1 10: default 180
    //                   1 183
    //                   2 245
    //                   3 305
    //                   4 363
    //                   5 421
    //                   6 481
    //                   7 541
    //                   8 619
    //                   9 676
    //                   10 733;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L4:
        if (context != null) goto _L15; else goto _L14
_L14:
        return false;
_L15:
        if (condition.operand instanceof Comparable)
        {
            if (context.compareTo((Comparable)condition.operand) <= 0)
            {
                return false;
            }
        } else
        {
            throw new IllegalArgumentException(String.format("Can't compare %s > %s", new Object[] {
                context, condition.operand
            }));
        }
          goto _L3
_L5:
        if (context == null) goto _L14; else goto _L16
_L16:
        if (condition.operand instanceof Comparable)
        {
            if (context.compareTo((Comparable)condition.operand) < 0)
            {
                return false;
            }
        } else
        {
            throw new IllegalArgumentException(String.format("Can't compare %s >= %s", new Object[] {
                context, condition.operand
            }));
        }
          goto _L3
_L6:
        if (context == null) goto _L14; else goto _L17
_L17:
        if (condition.operand instanceof Comparable)
        {
            if (!context.equals((Comparable)condition.operand))
            {
                return false;
            }
        } else
        {
            throw new IllegalArgumentException(String.format("Can't compare %s == %s", new Object[] {
                context, condition.operand
            }));
        }
          goto _L3
_L7:
        if (context == null) goto _L14; else goto _L18
_L18:
        if (condition.operand instanceof Comparable)
        {
            if (context.equals((Comparable)condition.operand))
            {
                return false;
            }
        } else
        {
            throw new IllegalArgumentException(String.format("Can't compare %s != %s", new Object[] {
                context, condition.operand
            }));
        }
          goto _L3
_L8:
        if (context == null) goto _L14; else goto _L19
_L19:
        if (condition.operand instanceof Comparable)
        {
            if (context.compareTo((Comparable)condition.operand) > 0)
            {
                return false;
            }
        } else
        {
            throw new IllegalArgumentException(String.format("Can't compare %s <= %s", new Object[] {
                context, condition.operand
            }));
        }
          goto _L3
_L9:
        if (context == null) goto _L14; else goto _L20
_L20:
        if (condition.operand instanceof Comparable)
        {
            if (context.compareTo((Comparable)condition.operand) >= 0)
            {
                return false;
            }
        } else
        {
            throw new IllegalArgumentException(String.format("Can't compare %s < %s", new Object[] {
                context, condition.operand
            }));
        }
          goto _L3
_L10:
        if (!(condition.operand instanceof Boolean))
        {
            throw new IllegalArgumentException(String.format("Argument %s is not a boolean", new Object[] {
                condition.operand
            }));
        }
        boolean flag4 = ((Boolean)condition.operand).booleanValue();
        boolean flag;
        if (context != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag == flag4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
_L11:
        if (context == null) goto _L14; else goto _L21
_L21:
        boolean flag5 = false;
        boolean flag1 = flag5;
        if (context instanceof String)
        {
            flag1 = flag5;
            if (condition.operand instanceof String)
            {
                flag1 = ((String)context).toLowerCase().contains(((String)condition.operand).toLowerCase());
            }
        }
        return flag1;
_L12:
        if (context == null) goto _L14; else goto _L22
_L22:
        boolean flag6 = false;
        boolean flag2 = flag6;
        if (context instanceof String)
        {
            flag2 = flag6;
            if (condition.operand instanceof String)
            {
                flag2 = ((String)context).toLowerCase().startsWith(((String)condition.operand).toLowerCase());
            }
        }
        return flag2;
_L13:
        if (context == null) goto _L14; else goto _L23
_L23:
        boolean flag7 = false;
        boolean flag3 = flag7;
        if (context instanceof String)
        {
            flag3 = flag7;
            if (condition.operand instanceof String)
            {
                flag3 = ((String)context).toLowerCase().endsWith(((String)condition.operand).toLowerCase());
            }
        }
        return flag3;
_L2:
        return true;
    }

    public Comparable getValue(Context context, String s)
    {
        Object obj;
        Object obj2;
        obj2 = s.split("/");
        obj = QueryType.parse(obj2[0]);
        _cls1..SwitchMap.com.apptentive.android.sdk.module.engagement.logic.ComparisonPredicate.QueryType[((QueryType) (obj)).ordinal()];
        JVM INSTR tableswitch 1 11: default 84
    //                   1 86
    //                   2 91
    //                   3 100
    //                   4 107
    //                   5 205
    //                   6 310
    //                   7 310
    //                   8 368
    //                   9 550
    //                   10 615
    //                   11 632;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L7 _L8 _L9 _L10 _L11
_L1:
        return null;
_L2:
        return Util.getAppVersionName(context);
_L3:
        return Double.valueOf(Util.getAppVersionCode(context));
_L4:
        return Double.valueOf(Util.currentTimeSeconds());
_L5:
        obj2 = ValueSubFilterType.parse(obj2[1]);
        obj = Boolean.valueOf(false);
        _cls1..SwitchMap.com.apptentive.android.sdk.module.engagement.logic.ComparisonPredicate.ValueSubFilterType[((ValueSubFilterType) (obj2)).ordinal()];
        JVM INSTR tableswitch 1 2: default 152
    //                   1 177
    //                   2 191;
           goto _L12 _L13 _L14
_L12:
        Log.w("Unsupported sub filter type \"%s\" for query \"%s\"", new Object[] {
            ((ValueSubFilterType) (obj2)).name(), s
        });
        context = ((Context) (obj));
_L15:
        return context;
_L13:
        context = Boolean.valueOf(VersionHistoryStore.isUpdate(context, com.apptentive.android.sdk.storage.VersionHistoryStore.Selector.version));
          goto _L15
_L14:
        context = Boolean.valueOf(VersionHistoryStore.isUpdate(context, com.apptentive.android.sdk.storage.VersionHistoryStore.Selector.build));
          goto _L15
_L6:
        obj2 = ValueSubFilterType.parse(obj2[1]);
        obj = null;
        _cls1..SwitchMap.com.apptentive.android.sdk.module.engagement.logic.ComparisonPredicate.ValueSubFilterType[((ValueSubFilterType) (obj2)).ordinal()];
        JVM INSTR tableswitch 1 3: default 252
    //                   1 288
    //                   2 299
    //                   3 277;
           goto _L16 _L17 _L18 _L19
_L16:
        Log.w("Unsupported sub filter type \"%s\" for query \"%s\"", new Object[] {
            ((ValueSubFilterType) (obj2)).name(), s
        });
        context = ((Context) (obj));
_L20:
        return context;
_L19:
        context = VersionHistoryStore.getTimeSinceVersionFirstSeen(context, com.apptentive.android.sdk.storage.VersionHistoryStore.Selector.total);
          goto _L20
_L17:
        context = VersionHistoryStore.getTimeSinceVersionFirstSeen(context, com.apptentive.android.sdk.storage.VersionHistoryStore.Selector.version);
          goto _L20
_L18:
        context = VersionHistoryStore.getTimeSinceVersionFirstSeen(context, com.apptentive.android.sdk.storage.VersionHistoryStore.Selector.build);
          goto _L20
_L7:
        boolean flag2 = ((QueryType) (obj)).equals(QueryType.interactions);
        s = obj2[1];
        obj = ValueFilterType.parse(obj2[2]);
        ValueSubFilterType valuesubfiltertype = ValueSubFilterType.parse(obj2[3]);
        boolean flag;
        switch (_cls1..SwitchMap.com.apptentive.android.sdk.module.engagement.logic.ComparisonPredicate.ValueFilterType[((ValueFilterType) (obj)).ordinal()])
        {
        case 1: // '\001'
            switch (_cls1..SwitchMap.com.apptentive.android.sdk.module.engagement.logic.ComparisonPredicate.ValueSubFilterType[valuesubfiltertype.ordinal()])
            {
            case 1: // '\001'
                return Double.valueOf(CodePointStore.getVersionInvokes(context, flag2, s, Util.getAppVersionName(context)).longValue());

            case 3: // '\003'
                return Double.valueOf(CodePointStore.getTotalInvokes(context, flag2, s).longValue());

            case 2: // '\002'
                return Double.valueOf(CodePointStore.getBuildInvokes(context, flag2, s, String.valueOf(Util.getAppVersionCode(context))).longValue());

            case 4: // '\004'
                return Double.valueOf(Util.currentTimeSeconds() - CodePointStore.getLastInvoke(context, flag2, s).doubleValue());
            }
            break;
        }
_L8:
        while (true) 
        {
            obj = obj2[1];
            flag = false;
            s = ((String) (obj));
            if (((String) (obj)).equals("custom_data"))
            {
                flag = true;
                s = obj2[2];
            }
            obj = PersonManager.getStoredPerson(context);
            if (flag)
            {
                obj = ((Person) (obj)).getCustomData();
                if (obj != null)
                {
                    return (Comparable)((CustomData) (obj)).opt(s);
                }
            } else
            {
                return (Comparable)((Person) (obj)).opt(s);
            }
            break;
        }
_L9:
        Object obj1 = obj2[1];
        boolean flag1 = false;
        s = ((String) (obj1));
        if (((String) (obj1)).equals("custom_data"))
        {
            flag1 = true;
            s = obj2[2];
        }
        obj1 = DeviceManager.getStoredDevice(context);
        if (flag1)
        {
            obj1 = ((Device) (obj1)).getCustomData();
            if (obj1 != null)
            {
                return (Comparable)((CustomData) (obj1)).opt(s);
            }
        } else
        {
            return (Comparable)((Device) (obj1)).opt(s);
        }
_L10:
        s = obj2[1];
        return (Comparable)AppReleaseManager.getStoredAppRelease(context).opt(s);
_L11:
        s = obj2[1];
        return (Comparable)SdkManager.getStoredSdk(context).opt(s);
    }
}
