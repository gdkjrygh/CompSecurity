.class public Ltwitter4j/TwitterAPIMonitor;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final SINGLETON:Ltwitter4j/TwitterAPIMonitor;

.field private static final STATISTICS:Ltwitter4j/management/APIStatistics;

.field private static final logger:Ltwitter4j/internal/logging/Logger;

.field private static final pattern:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 38
    const-class v2, Ltwitter4j/TwitterAPIMonitor;

    invoke-static {v2}, Ltwitter4j/internal/logging/Logger;->getLogger(Ljava/lang/Class;)Ltwitter4j/internal/logging/Logger;

    move-result-object v2

    sput-object v2, Ltwitter4j/TwitterAPIMonitor;->logger:Ltwitter4j/internal/logging/Logger;

    .line 41
    const-string v2, "https?:\\/\\/[^\\/]+\\/[0-9.]*\\/([a-zA-Z_\\.]*).*"

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    sput-object v2, Ltwitter4j/TwitterAPIMonitor;->pattern:Ljava/util/regex/Pattern;

    .line 44
    new-instance v2, Ltwitter4j/TwitterAPIMonitor;

    invoke-direct {v2}, Ltwitter4j/TwitterAPIMonitor;-><init>()V

    sput-object v2, Ltwitter4j/TwitterAPIMonitor;->SINGLETON:Ltwitter4j/TwitterAPIMonitor;

    .line 46
    new-instance v2, Ltwitter4j/management/APIStatistics;

    const/16 v3, 0x64

    invoke-direct {v2, v3}, Ltwitter4j/management/APIStatistics;-><init>(I)V

    sput-object v2, Ltwitter4j/TwitterAPIMonitor;->STATISTICS:Ltwitter4j/management/APIStatistics;

    .line 52
    :try_start_0
    const-string v2, "java.specification.version"

    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 53
    if-eqz v2, :cond_0

    .line 54
    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    cmpl-double v2, v4, v2

    if-lez v2, :cond_0

    move v0, v1

    .line 56
    :cond_0
    invoke-static {}, Ltwitter4j/conf/ConfigurationContext;->getInstance()Ltwitter4j/conf/Configuration;

    move-result-object v2

    invoke-interface {v2}, Ltwitter4j/conf/Configuration;->isDalvik()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 59
    const-string v2, "http.keepAlive"

    const-string v3, "false"

    invoke-static {v2, v3}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_4

    :cond_1
    move v1, v0

    .line 67
    :goto_0
    :try_start_1
    invoke-static {}, Ljava/lang/management/ManagementFactory;->getPlatformMBeanServer()Ljavax/management/MBeanServer;

    move-result-object v0

    .line 68
    if-eqz v1, :cond_2

    .line 69
    new-instance v1, Ljavax/management/ObjectName;

    const-string v2, "twitter4j.mbean:type=APIStatistics"

    invoke-direct {v1, v2}, Ljavax/management/ObjectName;-><init>(Ljava/lang/String;)V

    .line 70
    sget-object v2, Ltwitter4j/TwitterAPIMonitor;->STATISTICS:Ltwitter4j/management/APIStatistics;

    invoke-interface {v0, v2, v1}, Ljavax/management/MBeanServer;->registerMBean(Ljava/lang/Object;Ljavax/management/ObjectName;)Ljavax/management/ObjectInstance;

    .line 89
    :goto_1
    return-void

    .line 72
    :cond_2
    new-instance v1, Ljavax/management/ObjectName;

    const-string v2, "twitter4j.mbean:type=APIStatisticsOpenMBean"

    invoke-direct {v1, v2}, Ljavax/management/ObjectName;-><init>(Ljava/lang/String;)V

    .line 73
    new-instance v2, Ltwitter4j/management/APIStatisticsOpenMBean;

    sget-object v3, Ltwitter4j/TwitterAPIMonitor;->STATISTICS:Ltwitter4j/management/APIStatistics;

    invoke-direct {v2, v3}, Ltwitter4j/management/APIStatisticsOpenMBean;-><init>(Ltwitter4j/management/APIStatistics;)V

    .line 74
    invoke-interface {v0, v2, v1}, Ljavax/management/MBeanServer;->registerMBean(Ljava/lang/Object;Ljavax/management/ObjectName;)Ljavax/management/ObjectInstance;
    :try_end_1
    .catch Ljavax/management/InstanceAlreadyExistsException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljavax/management/MBeanRegistrationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljavax/management/NotCompliantMBeanException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljavax/management/MalformedObjectNameException; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_1

    .line 76
    :catch_0
    move-exception v0

    .line 77
    invoke-virtual {v0}, Ljavax/management/InstanceAlreadyExistsException;->printStackTrace()V

    .line 78
    sget-object v1, Ltwitter4j/TwitterAPIMonitor;->logger:Ltwitter4j/internal/logging/Logger;

    invoke-virtual {v0}, Ljavax/management/InstanceAlreadyExistsException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ltwitter4j/internal/logging/Logger;->error(Ljava/lang/String;)V

    goto :goto_1

    .line 79
    :catch_1
    move-exception v0

    .line 80
    invoke-virtual {v0}, Ljavax/management/MBeanRegistrationException;->printStackTrace()V

    .line 81
    sget-object v1, Ltwitter4j/TwitterAPIMonitor;->logger:Ltwitter4j/internal/logging/Logger;

    invoke-virtual {v0}, Ljavax/management/MBeanRegistrationException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ltwitter4j/internal/logging/Logger;->error(Ljava/lang/String;)V

    goto :goto_1

    .line 82
    :catch_2
    move-exception v0

    .line 83
    invoke-virtual {v0}, Ljavax/management/NotCompliantMBeanException;->printStackTrace()V

    .line 84
    sget-object v1, Ltwitter4j/TwitterAPIMonitor;->logger:Ltwitter4j/internal/logging/Logger;

    invoke-virtual {v0}, Ljavax/management/NotCompliantMBeanException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ltwitter4j/internal/logging/Logger;->error(Ljava/lang/String;)V

    goto :goto_1

    .line 85
    :catch_3
    move-exception v0

    .line 86
    invoke-virtual {v0}, Ljavax/management/MalformedObjectNameException;->printStackTrace()V

    .line 87
    sget-object v1, Ltwitter4j/TwitterAPIMonitor;->logger:Ltwitter4j/internal/logging/Logger;

    invoke-virtual {v0}, Ljavax/management/MalformedObjectNameException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ltwitter4j/internal/logging/Logger;->error(Ljava/lang/String;)V

    goto :goto_1

    .line 63
    :catch_4
    move-exception v0

    goto :goto_0
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    return-void
.end method

.method public static getInstance()Ltwitter4j/TwitterAPIMonitor;
    .locals 1

    .prologue
    .line 98
    sget-object v0, Ltwitter4j/TwitterAPIMonitor;->SINGLETON:Ltwitter4j/TwitterAPIMonitor;

    return-object v0
.end method


# virtual methods
.method public getStatistics()Ltwitter4j/management/APIStatisticsMBean;
    .locals 1

    .prologue
    .line 102
    sget-object v0, Ltwitter4j/TwitterAPIMonitor;->STATISTICS:Ltwitter4j/management/APIStatistics;

    return-object v0
.end method

.method methodCalled(Ljava/lang/String;JZ)V
    .locals 2

    .prologue
    .line 106
    sget-object v0, Ltwitter4j/TwitterAPIMonitor;->pattern:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 107
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->groupCount()I

    move-result v1

    if-lez v1, :cond_0

    .line 108
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    .line 109
    sget-object v1, Ltwitter4j/TwitterAPIMonitor;->STATISTICS:Ltwitter4j/management/APIStatistics;

    invoke-virtual {v1, v0, p2, p3, p4}, Ltwitter4j/management/APIStatistics;->methodCalled(Ljava/lang/String;JZ)V

    .line 111
    :cond_0
    return-void
.end method
