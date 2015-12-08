.class public Ltwitter4j/management/APIStatisticsOpenMBean;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljavax/management/DynamicMBean;


# static fields
.field private static final ITEM_DESCRIPTIONS:[Ljava/lang/String;

.field private static final ITEM_NAMES:[Ljava/lang/String;

.field private static final ITEM_TYPES:[Ljavax/management/openmbean/OpenType;


# instance fields
.field private final API_STATISTICS:Ltwitter4j/management/APIStatisticsMBean;

.field private final API_STATISTICS_TYPE:Ljavax/management/openmbean/TabularType;

.field private final METHOD_STATS_TYPE:Ljavax/management/openmbean/CompositeType;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 31
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "methodName"

    aput-object v1, v0, v2

    const-string v1, "callCount"

    aput-object v1, v0, v3

    const-string v1, "errorCount"

    aput-object v1, v0, v4

    const-string v1, "totalTime"

    aput-object v1, v0, v5

    const-string v1, "avgTime"

    aput-object v1, v0, v6

    sput-object v0, Ltwitter4j/management/APIStatisticsOpenMBean;->ITEM_NAMES:[Ljava/lang/String;

    .line 32
    const/4 v0, 0x5

    new-array v0, v0, [Ljavax/management/openmbean/OpenType;

    sget-object v1, Ljavax/management/openmbean/SimpleType;->STRING:Ljavax/management/openmbean/SimpleType;

    aput-object v1, v0, v2

    sget-object v1, Ljavax/management/openmbean/SimpleType;->LONG:Ljavax/management/openmbean/SimpleType;

    aput-object v1, v0, v3

    sget-object v1, Ljavax/management/openmbean/SimpleType;->LONG:Ljavax/management/openmbean/SimpleType;

    aput-object v1, v0, v4

    sget-object v1, Ljavax/management/openmbean/SimpleType;->LONG:Ljavax/management/openmbean/SimpleType;

    aput-object v1, v0, v5

    sget-object v1, Ljavax/management/openmbean/SimpleType;->LONG:Ljavax/management/openmbean/SimpleType;

    aput-object v1, v0, v6

    sput-object v0, Ltwitter4j/management/APIStatisticsOpenMBean;->ITEM_TYPES:[Ljavax/management/openmbean/OpenType;

    .line 34
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "The method name"

    aput-object v1, v0, v2

    const-string v1, "The number of times this method has been called"

    aput-object v1, v0, v3

    const-string v1, "The number of calls that failed"

    aput-object v1, v0, v4

    const-string v1, "The total amount of time spent invoking this method in milliseconds"

    aput-object v1, v0, v5

    const-string v1, "The average amount of time spent invoking this method in milliseconds"

    aput-object v1, v0, v6

    sput-object v0, Ltwitter4j/management/APIStatisticsOpenMBean;->ITEM_DESCRIPTIONS:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ltwitter4j/management/APIStatistics;)V
    .locals 6

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Ltwitter4j/management/APIStatisticsOpenMBean;->API_STATISTICS:Ltwitter4j/management/APIStatisticsMBean;

    .line 49
    :try_start_0
    new-instance v0, Ljavax/management/openmbean/CompositeType;

    const-string v1, "method statistics"

    const-string v2, "method statistics"

    sget-object v3, Ltwitter4j/management/APIStatisticsOpenMBean;->ITEM_NAMES:[Ljava/lang/String;

    sget-object v4, Ltwitter4j/management/APIStatisticsOpenMBean;->ITEM_DESCRIPTIONS:[Ljava/lang/String;

    sget-object v5, Ltwitter4j/management/APIStatisticsOpenMBean;->ITEM_TYPES:[Ljavax/management/openmbean/OpenType;

    invoke-direct/range {v0 .. v5}, Ljavax/management/openmbean/CompositeType;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[Ljavax/management/openmbean/OpenType;)V

    iput-object v0, p0, Ltwitter4j/management/APIStatisticsOpenMBean;->METHOD_STATS_TYPE:Ljavax/management/openmbean/CompositeType;

    .line 53
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "methodName"

    aput-object v2, v0, v1

    .line 54
    new-instance v1, Ljavax/management/openmbean/TabularType;

    const-string v2, "API statistics"

    const-string v3, "list of methods"

    iget-object v4, p0, Ltwitter4j/management/APIStatisticsOpenMBean;->METHOD_STATS_TYPE:Ljavax/management/openmbean/CompositeType;

    invoke-direct {v1, v2, v3, v4, v0}, Ljavax/management/openmbean/TabularType;-><init>(Ljava/lang/String;Ljava/lang/String;Ljavax/management/openmbean/CompositeType;[Ljava/lang/String;)V

    iput-object v1, p0, Ltwitter4j/management/APIStatisticsOpenMBean;->API_STATISTICS_TYPE:Ljavax/management/openmbean/TabularType;
    :try_end_0
    .catch Ljavax/management/openmbean/OpenDataException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    return-void

    .line 58
    :catch_0
    move-exception v0

    .line 59
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public getAttribute(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .prologue
    .line 150
    const-string v0, "statisticsTable"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 151
    invoke-virtual {p0}, Ltwitter4j/management/APIStatisticsOpenMBean;->getStatistics()Ljavax/management/openmbean/TabularDataSupport;

    move-result-object v0

    .line 159
    :goto_0
    return-object v0

    .line 152
    :cond_0
    const-string v0, "callCount"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 153
    iget-object v0, p0, Ltwitter4j/management/APIStatisticsOpenMBean;->API_STATISTICS:Ltwitter4j/management/APIStatisticsMBean;

    invoke-interface {v0}, Ltwitter4j/management/APIStatisticsMBean;->getCallCount()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    .line 154
    :cond_1
    const-string v0, "errorCount"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 155
    iget-object v0, p0, Ltwitter4j/management/APIStatisticsOpenMBean;->API_STATISTICS:Ltwitter4j/management/APIStatisticsMBean;

    invoke-interface {v0}, Ltwitter4j/management/APIStatisticsMBean;->getErrorCount()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    .line 156
    :cond_2
    const-string v0, "totalTime"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 157
    iget-object v0, p0, Ltwitter4j/management/APIStatisticsOpenMBean;->API_STATISTICS:Ltwitter4j/management/APIStatisticsMBean;

    invoke-interface {v0}, Ltwitter4j/management/APIStatisticsMBean;->getTotalTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    .line 158
    :cond_3
    const-string v0, "averageTime"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 159
    iget-object v0, p0, Ltwitter4j/management/APIStatisticsOpenMBean;->API_STATISTICS:Ltwitter4j/management/APIStatisticsMBean;

    invoke-interface {v0}, Ltwitter4j/management/APIStatisticsMBean;->getAverageTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    .line 161
    :cond_4
    new-instance v0, Ljavax/management/AttributeNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot find "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " attribute "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljavax/management/AttributeNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getAttributes([Ljava/lang/String;)Ljavax/management/AttributeList;
    .locals 5

    .prologue
    .line 166
    new-instance v1, Ljavax/management/AttributeList;

    invoke-direct {v1}, Ljavax/management/AttributeList;-><init>()V

    .line 167
    array-length v0, p1

    if-nez v0, :cond_0

    move-object v0, v1

    .line 177
    :goto_0
    return-object v0

    .line 169
    :cond_0
    const/4 v0, 0x0

    :goto_1
    array-length v2, p1

    if-ge v0, v2, :cond_1

    .line 171
    :try_start_0
    aget-object v2, p1, v0

    invoke-virtual {p0, v2}, Ltwitter4j/management/APIStatisticsOpenMBean;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 172
    new-instance v3, Ljavax/management/Attribute;

    aget-object v4, p1, v0

    invoke-direct {v3, v4, v2}, Ljavax/management/Attribute;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Ljavax/management/AttributeList;->add(Ljavax/management/Attribute;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 169
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 174
    :catch_0
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_2

    :cond_1
    move-object v0, v1

    .line 177
    goto :goto_0
.end method

.method public getMBeanInfo()Ljavax/management/MBeanInfo;
    .locals 12

    .prologue
    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 66
    const/4 v0, 0x5

    new-array v7, v0, [Ljavax/management/openmbean/OpenMBeanAttributeInfoSupport;

    .line 67
    new-array v8, v4, [Ljavax/management/openmbean/OpenMBeanConstructorInfoSupport;

    .line 68
    new-array v9, v4, [Ljavax/management/openmbean/OpenMBeanOperationInfoSupport;

    .line 69
    new-array v10, v5, [Ljavax/management/MBeanNotificationInfo;

    .line 72
    new-instance v0, Ljavax/management/openmbean/OpenMBeanAttributeInfoSupport;

    const-string v1, "callCount"

    const-string v2, "Total number of API calls"

    sget-object v3, Ljavax/management/openmbean/SimpleType;->LONG:Ljavax/management/openmbean/SimpleType;

    move v6, v5

    invoke-direct/range {v0 .. v6}, Ljavax/management/openmbean/OpenMBeanAttributeInfoSupport;-><init>(Ljava/lang/String;Ljava/lang/String;Ljavax/management/openmbean/OpenType;ZZZ)V

    aput-object v0, v7, v5

    .line 77
    new-instance v0, Ljavax/management/openmbean/OpenMBeanAttributeInfoSupport;

    const-string v1, "errorCount"

    const-string v2, "The number of failed API calls"

    sget-object v3, Ljavax/management/openmbean/SimpleType;->LONG:Ljavax/management/openmbean/SimpleType;

    move v6, v5

    invoke-direct/range {v0 .. v6}, Ljavax/management/openmbean/OpenMBeanAttributeInfoSupport;-><init>(Ljava/lang/String;Ljava/lang/String;Ljavax/management/openmbean/OpenType;ZZZ)V

    aput-object v0, v7, v4

    .line 82
    const/4 v11, 0x2

    new-instance v0, Ljavax/management/openmbean/OpenMBeanAttributeInfoSupport;

    const-string v1, "averageTime"

    const-string v2, "Average time spent invoking any API method"

    sget-object v3, Ljavax/management/openmbean/SimpleType;->LONG:Ljavax/management/openmbean/SimpleType;

    move v6, v5

    invoke-direct/range {v0 .. v6}, Ljavax/management/openmbean/OpenMBeanAttributeInfoSupport;-><init>(Ljava/lang/String;Ljava/lang/String;Ljavax/management/openmbean/OpenType;ZZZ)V

    aput-object v0, v7, v11

    .line 87
    const/4 v11, 0x3

    new-instance v0, Ljavax/management/openmbean/OpenMBeanAttributeInfoSupport;

    const-string v1, "totalTime"

    const-string v2, "Average time spent invoking any API method"

    sget-object v3, Ljavax/management/openmbean/SimpleType;->LONG:Ljavax/management/openmbean/SimpleType;

    move v6, v5

    invoke-direct/range {v0 .. v6}, Ljavax/management/openmbean/OpenMBeanAttributeInfoSupport;-><init>(Ljava/lang/String;Ljava/lang/String;Ljavax/management/openmbean/OpenType;ZZZ)V

    aput-object v0, v7, v11

    .line 92
    const/4 v11, 0x4

    new-instance v0, Ljavax/management/openmbean/OpenMBeanAttributeInfoSupport;

    const-string v1, "statisticsTable"

    const-string v2, "Table of statisics for all API methods"

    iget-object v3, p0, Ltwitter4j/management/APIStatisticsOpenMBean;->API_STATISTICS_TYPE:Ljavax/management/openmbean/TabularType;

    move v6, v5

    invoke-direct/range {v0 .. v6}, Ljavax/management/openmbean/OpenMBeanAttributeInfoSupport;-><init>(Ljava/lang/String;Ljava/lang/String;Ljavax/management/openmbean/OpenType;ZZZ)V

    aput-object v0, v7, v11

    .line 97
    new-instance v0, Ljavax/management/openmbean/OpenMBeanConstructorInfoSupport;

    const-string v1, "APIStatisticsOpenMBean"

    const-string v2, "Constructs an APIStatisticsOpenMBean instance"

    new-array v3, v5, [Ljavax/management/openmbean/OpenMBeanParameterInfoSupport;

    invoke-direct {v0, v1, v2, v3}, Ljavax/management/openmbean/OpenMBeanConstructorInfoSupport;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/openmbean/OpenMBeanParameterInfo;)V

    aput-object v0, v8, v5

    .line 102
    new-array v3, v5, [Ljavax/management/openmbean/OpenMBeanParameterInfoSupport;

    .line 103
    new-instance v0, Ljavax/management/openmbean/OpenMBeanOperationInfoSupport;

    const-string v1, "reset"

    const-string v2, "reset the statistics"

    sget-object v4, Ljavax/management/openmbean/SimpleType;->VOID:Ljavax/management/openmbean/SimpleType;

    invoke-direct/range {v0 .. v5}, Ljavax/management/openmbean/OpenMBeanOperationInfoSupport;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/openmbean/OpenMBeanParameterInfo;Ljavax/management/openmbean/OpenType;I)V

    aput-object v0, v9, v5

    .line 110
    new-instance v0, Ljavax/management/openmbean/OpenMBeanInfoSupport;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "API Statistics Open MBean"

    move-object v3, v7

    move-object v4, v8

    move-object v5, v9

    move-object v6, v10

    invoke-direct/range {v0 .. v6}, Ljavax/management/openmbean/OpenMBeanInfoSupport;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/openmbean/OpenMBeanAttributeInfo;[Ljavax/management/openmbean/OpenMBeanConstructorInfo;[Ljavax/management/openmbean/OpenMBeanOperationInfo;[Ljavax/management/MBeanNotificationInfo;)V

    .line 114
    return-object v0
.end method

.method public declared-synchronized getStatistics()Ljavax/management/openmbean/TabularDataSupport;
    .locals 8

    .prologue
    .line 118
    monitor-enter p0

    :try_start_0
    new-instance v1, Ljavax/management/openmbean/TabularDataSupport;

    iget-object v0, p0, Ltwitter4j/management/APIStatisticsOpenMBean;->API_STATISTICS_TYPE:Ljavax/management/openmbean/TabularType;

    invoke-direct {v1, v0}, Ljavax/management/openmbean/TabularDataSupport;-><init>(Ljavax/management/openmbean/TabularType;)V

    .line 120
    iget-object v0, p0, Ltwitter4j/management/APIStatisticsOpenMBean;->API_STATISTICS:Ltwitter4j/management/APIStatisticsMBean;

    invoke-interface {v0}, Ltwitter4j/management/APIStatisticsMBean;->getInvocationStatistics()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 121
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 122
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltwitter4j/management/InvocationStatistics;

    .line 123
    const/4 v3, 0x5

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-interface {v0}, Ltwitter4j/management/InvocationStatistics;->getName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-interface {v0}, Ltwitter4j/management/InvocationStatistics;->getCallCount()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x2

    invoke-interface {v0}, Ltwitter4j/management/InvocationStatistics;->getErrorCount()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x3

    invoke-interface {v0}, Ltwitter4j/management/InvocationStatistics;->getTotalTime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x4

    invoke-interface {v0}, Ltwitter4j/management/InvocationStatistics;->getAverageTime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v3, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    :try_start_1
    new-instance v0, Ljavax/management/openmbean/CompositeDataSupport;

    iget-object v4, p0, Ltwitter4j/management/APIStatisticsOpenMBean;->METHOD_STATS_TYPE:Ljavax/management/openmbean/CompositeType;

    sget-object v5, Ltwitter4j/management/APIStatisticsOpenMBean;->ITEM_NAMES:[Ljava/lang/String;

    invoke-direct {v0, v4, v5, v3}, Ljavax/management/openmbean/CompositeDataSupport;-><init>(Ljavax/management/openmbean/CompositeType;[Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    invoke-virtual {v1, v0}, Ljavax/management/openmbean/TabularDataSupport;->put(Ljavax/management/openmbean/CompositeData;)V
    :try_end_1
    .catch Ljavax/management/openmbean/OpenDataException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 134
    :catch_0
    move-exception v0

    .line 135
    :try_start_2
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 118
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 140
    :cond_0
    monitor-exit p0

    return-object v1
.end method

.method public invoke(Ljava/lang/String;[Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .prologue
    .line 183
    const-string v0, "reset"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 184
    invoke-virtual {p0}, Ltwitter4j/management/APIStatisticsOpenMBean;->reset()V

    .line 185
    const-string v0, "Statistics reset"

    return-object v0

    .line 187
    :cond_0
    new-instance v0, Ljavax/management/ReflectionException;

    new-instance v1, Ljava/lang/NoSuchMethodException;

    invoke-direct {v1, p1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cannot find the operation "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljavax/management/ReflectionException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw v0
.end method

.method public reset()V
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Ltwitter4j/management/APIStatisticsOpenMBean;->API_STATISTICS:Ltwitter4j/management/APIStatisticsMBean;

    invoke-interface {v0}, Ltwitter4j/management/APIStatisticsMBean;->reset()V

    .line 145
    return-void
.end method

.method public setAttribute(Ljavax/management/Attribute;)V
    .locals 2

    .prologue
    .line 196
    new-instance v0, Ljavax/management/AttributeNotFoundException;

    const-string v1, "No attributes can be set in this MBean"

    invoke-direct {v0, v1}, Ljavax/management/AttributeNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setAttributes(Ljavax/management/AttributeList;)Ljavax/management/AttributeList;
    .locals 1

    .prologue
    .line 202
    new-instance v0, Ljavax/management/AttributeList;

    invoke-direct {v0}, Ljavax/management/AttributeList;-><init>()V

    return-object v0
.end method
