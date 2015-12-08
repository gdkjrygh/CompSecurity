.class public Lcom/google/android/gms/internal/j;
.super Lcom/google/android/gms/internal/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/j$a;
    }
.end annotation


# static fields
.field private static kO:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;

.field private static kP:Ljava/util/concurrent/CountDownLatch;

.field private static kQ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/internal/j;->kP:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/m;Lcom/google/android/gms/internal/n;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/i;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/m;Lcom/google/android/gms/internal/n;)V

    return-void
.end method

.method static synthetic A()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/j;->kO:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;

    return-object v0
.end method

.method static synthetic B()Ljava/util/concurrent/CountDownLatch;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/j;->kP:Ljava/util/concurrent/CountDownLatch;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;
    .locals 0

    sput-object p0, Lcom/google/android/gms/internal/j;->kO:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;

    return-object p0
.end method

.method public static a(Ljava/lang/String;Landroid/content/Context;)Lcom/google/android/gms/internal/j;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/e;

    invoke-direct {v0}, Lcom/google/android/gms/internal/e;-><init>()V

    invoke-static {p0, p1, v0}, Lcom/google/android/gms/internal/j;->a(Ljava/lang/String;Landroid/content/Context;Lcom/google/android/gms/internal/m;)V

    const-class v1, Lcom/google/android/gms/internal/j;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lcom/google/android/gms/internal/j;->kO:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;

    if-nez v2, :cond_0

    new-instance v2, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;

    invoke-direct {v2, p1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;-><init>(Landroid/content/Context;)V

    sput-object v2, Lcom/google/android/gms/internal/j;->kO:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;

    new-instance v2, Lcom/google/android/gms/internal/j$1;

    invoke-direct {v2}, Lcom/google/android/gms/internal/j$1;-><init>()V

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Void;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/j$1;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v1, Lcom/google/android/gms/internal/j;

    new-instance v2, Lcom/google/android/gms/internal/p;

    const/16 v3, 0xef

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/p;-><init>(I)V

    invoke-direct {v1, p1, v0, v2}, Lcom/google/android/gms/internal/j;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/m;Lcom/google/android/gms/internal/n;)V

    return-object v1

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic a(Z)Z
    .locals 0

    sput-boolean p0, Lcom/google/android/gms/internal/j;->kQ:Z

    return p0
.end method


# virtual methods
.method protected b(Landroid/content/Context;)V
    .locals 4

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/i;->b(Landroid/content/Context;)V

    :try_start_0
    sget-boolean v0, Lcom/google/android/gms/internal/j;->kQ:Z

    if-eqz v0, :cond_1

    const/16 v0, 0x18

    invoke-static {p1}, Lcom/google/android/gms/internal/j;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/j;->a(ILjava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/j;->z()Lcom/google/android/gms/internal/j$a;

    move-result-object v2

    const/16 v3, 0x1c

    invoke-virtual {v2}, Lcom/google/android/gms/internal/j$a;->isLimitAdTrackingEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    const-wide/16 v0, 0x1

    :goto_1
    invoke-virtual {p0, v3, v0, v1}, Lcom/google/android/gms/internal/j;->a(IJ)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/j$a;->getId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v1, 0x1a

    const-wide/16 v2, 0x5

    invoke-virtual {p0, v1, v2, v3}, Lcom/google/android/gms/internal/j;->a(IJ)V

    const/16 v1, 0x18

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/j;->a(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/android/gms/internal/i$a; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0x0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method z()Lcom/google/android/gms/internal/j$a;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v7, 0x10

    const/4 v0, 0x0

    const-class v1, Lcom/google/android/gms/internal/j;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lcom/google/android/gms/internal/j;->kP:Ljava/util/concurrent/CountDownLatch;

    const-wide/16 v4, 0x2

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v4, v5, v3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/j$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v2, v3}, Lcom/google/android/gms/internal/j$a;-><init>(Lcom/google/android/gms/internal/j;Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit v1

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    new-instance v0, Lcom/google/android/gms/internal/j$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v2, v3}, Lcom/google/android/gms/internal/j$a;-><init>(Lcom/google/android/gms/internal/j;Ljava/lang/String;Z)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_0
    :try_start_2
    sget-object v2, Lcom/google/android/gms/internal/j;->kO:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;

    if-nez v2, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/j$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v2, v3}, Lcom/google/android/gms/internal/j$a;-><init>(Lcom/google/android/gms/internal/j;Ljava/lang/String;Z)V

    monitor-exit v1

    goto :goto_0

    :cond_1
    sget-object v2, Lcom/google/android/gms/internal/j;->kO:Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;

    invoke-virtual {v2}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getInfo()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    move-result-object v3

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v3}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    const-string v1, "^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$"

    invoke-virtual {v2, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    new-array v4, v7, [B

    move v1, v0

    :goto_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v0, v5, :cond_4

    const/16 v5, 0x8

    if-eq v0, v5, :cond_2

    const/16 v5, 0xd

    if-eq v0, v5, :cond_2

    const/16 v5, 0x12

    if-eq v0, v5, :cond_2

    const/16 v5, 0x17

    if-ne v0, v5, :cond_3

    :cond_2
    add-int/lit8 v0, v0, 0x1

    :cond_3
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5, v7}, Ljava/lang/Character;->digit(CI)I

    move-result v5

    shl-int/lit8 v5, v5, 0x4

    add-int/lit8 v6, v0, 0x1

    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v6, v7}, Ljava/lang/Character;->digit(CI)I

    move-result v6

    add-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v4, v1

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v0, v0, 0x2

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/j;->ky:Lcom/google/android/gms/internal/m;

    const/4 v1, 0x1

    invoke-interface {v0, v4, v1}, Lcom/google/android/gms/internal/m;->a([BZ)Ljava/lang/String;

    move-result-object v0

    :goto_2
    new-instance v1, Lcom/google/android/gms/internal/j$a;

    invoke-virtual {v3}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    move-result v2

    invoke-direct {v1, p0, v0, v2}, Lcom/google/android/gms/internal/j$a;-><init>(Lcom/google/android/gms/internal/j;Ljava/lang/String;Z)V

    move-object v0, v1

    goto :goto_0

    :cond_5
    move-object v0, v2

    goto :goto_2
.end method
