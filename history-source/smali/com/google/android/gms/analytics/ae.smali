.class public Lcom/google/android/gms/analytics/ae;
.super Ljava/lang/Object;


# static fields
.field private static BL:Lcom/google/android/gms/analytics/GoogleAnalytics;

.field private static volatile BM:Z

.field private static BN:Lcom/google/android/gms/analytics/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/google/android/gms/analytics/ae;->BM:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static T(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/analytics/ae;->getLogger()Lcom/google/android/gms/analytics/Logger;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/google/android/gms/analytics/Logger;->error(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static U(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/analytics/ae;->getLogger()Lcom/google/android/gms/analytics/Logger;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/google/android/gms/analytics/Logger;->info(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static V(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/analytics/ae;->getLogger()Lcom/google/android/gms/analytics/Logger;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/google/android/gms/analytics/Logger;->verbose(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static W(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/analytics/ae;->getLogger()Lcom/google/android/gms/analytics/Logger;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/google/android/gms/analytics/Logger;->warn(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static ff()Z
    .locals 2

    const/4 v0, 0x0

    invoke-static {}, Lcom/google/android/gms/analytics/ae;->getLogger()Lcom/google/android/gms/analytics/Logger;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/analytics/ae;->getLogger()Lcom/google/android/gms/analytics/Logger;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/analytics/Logger;->getLogLevel()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method static getLogger()Lcom/google/android/gms/analytics/Logger;
    .locals 2

    const-class v1, Lcom/google/android/gms/analytics/ae;

    monitor-enter v1

    :try_start_0
    sget-boolean v0, Lcom/google/android/gms/analytics/ae;->BM:Z

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/analytics/ae;->BN:Lcom/google/android/gms/analytics/Logger;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/analytics/p;

    invoke-direct {v0}, Lcom/google/android/gms/analytics/p;-><init>()V

    sput-object v0, Lcom/google/android/gms/analytics/ae;->BN:Lcom/google/android/gms/analytics/Logger;

    :cond_0
    sget-object v0, Lcom/google/android/gms/analytics/ae;->BN:Lcom/google/android/gms/analytics/Logger;

    monitor-exit v1

    :goto_0
    return-object v0

    :cond_1
    sget-object v0, Lcom/google/android/gms/analytics/ae;->BL:Lcom/google/android/gms/analytics/GoogleAnalytics;

    if-nez v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/analytics/GoogleAnalytics;->eY()Lcom/google/android/gms/analytics/GoogleAnalytics;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/analytics/ae;->BL:Lcom/google/android/gms/analytics/GoogleAnalytics;

    :cond_2
    sget-object v0, Lcom/google/android/gms/analytics/ae;->BL:Lcom/google/android/gms/analytics/GoogleAnalytics;

    if-eqz v0, :cond_3

    sget-object v0, Lcom/google/android/gms/analytics/ae;->BL:Lcom/google/android/gms/analytics/GoogleAnalytics;

    invoke-virtual {v0}, Lcom/google/android/gms/analytics/GoogleAnalytics;->getLogger()Lcom/google/android/gms/analytics/Logger;

    move-result-object v0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_3
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x0

    goto :goto_0
.end method
