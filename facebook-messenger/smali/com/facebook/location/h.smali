.class public Lcom/facebook/location/h;
.super Ljava/lang/Object;
.source "GetDeviceLocationExecutor.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/location/LocationManager;

.field private final c:Lcom/facebook/location/r;

.field private final d:Ljava/util/concurrent/ScheduledExecutorService;

.field private final e:Lcom/facebook/common/time/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/facebook/location/h;

    sput-object v0, Lcom/facebook/location/h;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/location/LocationManager;Lcom/facebook/location/r;Ljava/util/concurrent/ScheduledExecutorService;Lcom/facebook/common/time/a;)V
    .locals 0
    .param p3    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation runtime Lcom/facebook/common/executors/ForLightweightTaskHandlerThread;
        .end annotation
    .end param

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/facebook/location/h;->b:Landroid/location/LocationManager;

    .line 47
    iput-object p2, p0, Lcom/facebook/location/h;->c:Lcom/facebook/location/r;

    .line 48
    iput-object p3, p0, Lcom/facebook/location/h;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 49
    iput-object p4, p0, Lcom/facebook/location/h;->e:Lcom/facebook/common/time/a;

    .line 50
    return-void
.end method

.method static synthetic a(Lcom/facebook/location/h;)Landroid/location/LocationManager;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/location/h;->b:Landroid/location/LocationManager;

    return-object v0
.end method

.method static synthetic a()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 33
    sget-object v0, Lcom/facebook/location/h;->a:Ljava/lang/Class;

    return-object v0
.end method

.method private a(Landroid/location/Location;)Ljava/lang/String;
    .locals 7

    .prologue
    .line 327
    if-nez p1, :cond_0

    .line 328
    const/4 v0, 0x0

    .line 330
    :goto_0
    return-object v0

    :cond_0
    invoke-static {p1}, Lcom/google/common/base/Objects;->toStringHelper(Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "accuracy"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " m"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    const-string v1, "age"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p1}, Lcom/facebook/location/h;->b(Landroid/location/Location;)J

    move-result-wide v3

    const-wide/16 v5, 0x3e8

    div-long/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ms"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/base/Objects$ToStringHelper;->add(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/common/base/Objects$ToStringHelper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/base/Objects$ToStringHelper;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/location/h;Landroid/location/Location;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0, p1}, Lcom/facebook/location/h;->a(Landroid/location/Location;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 403
    invoke-static {p1, p2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private b(Landroid/location/Location;)J
    .locals 4

    .prologue
    .line 337
    iget-object v0, p0, Lcom/facebook/location/h;->e:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method static synthetic b(Lcom/facebook/location/h;Landroid/location/Location;)J
    .locals 2

    .prologue
    .line 33
    invoke-direct {p0, p1}, Lcom/facebook/location/h;->b(Landroid/location/Location;)J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic b(Lcom/facebook/location/h;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/location/h;->d:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/location/h;)Lcom/facebook/location/r;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/location/h;->c:Lcom/facebook/location/r;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/location/GetDeviceLocationParams;Lcom/facebook/fbservice/service/g;)Lcom/facebook/location/j;
    .locals 6

    .prologue
    .line 55
    sget-object v0, Lcom/facebook/location/h;->a:Ljava/lang/Class;

    const-string v1, "Getting location. Target age: %d ms, Target accuracy: %f m, Timeout: %d ms"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-wide v4, p1, Lcom/facebook/location/GetDeviceLocationParams;->f:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget v4, p1, Lcom/facebook/location/GetDeviceLocationParams;->g:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    iget-wide v4, p1, Lcom/facebook/location/GetDeviceLocationParams;->a:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    new-instance v0, Lcom/facebook/location/j;

    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/location/j;-><init>(Lcom/facebook/location/h;Lcom/facebook/location/GetDeviceLocationParams;Lcom/facebook/fbservice/service/g;)V

    return-object v0
.end method

.method a(Landroid/location/Location;Landroid/location/Location;Lcom/facebook/location/GetDeviceLocationParams;)Z
    .locals 9
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 355
    if-nez p1, :cond_1

    move v1, v2

    .line 396
    :cond_0
    :goto_0
    return v1

    .line 358
    :cond_1
    if-eqz p2, :cond_0

    .line 364
    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v3

    invoke-virtual {p2}, Landroid/location/Location;->getTime()J

    move-result-wide v5

    sub-long v4, v3, v5

    .line 365
    iget-wide v6, p3, Lcom/facebook/location/GetDeviceLocationParams;->h:J

    cmp-long v0, v4, v6

    if-lez v0, :cond_2

    move v0, v1

    .line 366
    :goto_1
    iget-wide v6, p3, Lcom/facebook/location/GetDeviceLocationParams;->h:J

    neg-long v6, v6

    cmp-long v3, v4, v6

    if-gez v3, :cond_3

    move v3, v1

    .line 367
    :goto_2
    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    if-lez v4, :cond_4

    move v5, v1

    .line 371
    :goto_3
    if-nez v0, :cond_0

    .line 374
    if-eqz v3, :cond_5

    move v1, v2

    .line 375
    goto :goto_0

    :cond_2
    move v0, v2

    .line 365
    goto :goto_1

    :cond_3
    move v3, v2

    .line 366
    goto :goto_2

    :cond_4
    move v5, v2

    .line 367
    goto :goto_3

    .line 379
    :cond_5
    invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F

    move-result v0

    invoke-virtual {p2}, Landroid/location/Location;->getAccuracy()F

    move-result v3

    sub-float v3, v0, v3

    .line 380
    cmpl-float v0, v3, v8

    if-lez v0, :cond_8

    move v4, v1

    .line 381
    :goto_4
    cmpg-float v0, v3, v8

    if-gez v0, :cond_9

    move v0, v1

    .line 382
    :goto_5
    iget v6, p3, Lcom/facebook/location/GetDeviceLocationParams;->i:F

    cmpl-float v3, v3, v6

    if-lez v3, :cond_a

    move v3, v1

    .line 384
    :goto_6
    invoke-virtual {p1}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2}, Landroid/location/Location;->getProvider()Ljava/lang/String;

    move-result-object v7

    invoke-direct {p0, v6, v7}, Lcom/facebook/location/h;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    .line 389
    if-nez v0, :cond_0

    .line 391
    if-eqz v5, :cond_6

    if-eqz v4, :cond_0

    .line 393
    :cond_6
    if-eqz v5, :cond_7

    if-nez v3, :cond_7

    if-nez v6, :cond_0

    :cond_7
    move v1, v2

    .line 396
    goto :goto_0

    :cond_8
    move v4, v2

    .line 380
    goto :goto_4

    :cond_9
    move v0, v2

    .line 381
    goto :goto_5

    :cond_a
    move v3, v2

    .line 382
    goto :goto_6
.end method
