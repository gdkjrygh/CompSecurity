.class public final Lcom/google/android/gms/internal/gh;
.super Lcom/google/android/gms/internal/hb;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/gh$b;,
        Lcom/google/android/gms/internal/gh$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/hb",
        "<",
        "Lcom/google/android/gms/internal/gl;",
        ">;"
    }
.end annotation


# static fields
.field private static final BG:Lcom/google/android/gms/internal/gn;

.field private static final Ca:Ljava/lang/Object;

.field private static final Cb:Ljava/lang/Object;


# instance fields
.field private AP:D

.field private AQ:Z

.field private final Ae:Lcom/google/android/gms/cast/Cast$Listener;

.field private BH:Lcom/google/android/gms/cast/ApplicationMetadata;

.field private final BI:Lcom/google/android/gms/cast/CastDevice;

.field private final BJ:Lcom/google/android/gms/internal/gm;

.field private final BK:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/cast/Cast$MessageReceivedCallback;",
            ">;"
        }
    .end annotation
.end field

.field private final BL:J

.field private BM:Ljava/lang/String;

.field private BN:Z

.field private BO:Z

.field private BP:Z

.field private BQ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private BR:I

.field private final BS:Ljava/util/concurrent/atomic/AtomicLong;

.field private BT:Ljava/lang/String;

.field private BU:Ljava/lang/String;

.field private BV:Landroid/os/Bundle;

.field private BW:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Long;",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;>;"
        }
    .end annotation
.end field

.field private BX:Lcom/google/android/gms/internal/gh$b;

.field private BY:Lcom/google/android/gms/common/api/a$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/cast/Cast$ApplicationConnectionResult;",
            ">;"
        }
    .end annotation
.end field

.field private BZ:Lcom/google/android/gms/common/api/a$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation
.end field

.field private final mHandler:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/gn;

    const-string v1, "CastClientImpl"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/gn;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/gh;->BG:Lcom/google/android/gms/internal/gn;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/gh;->Ca:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/gh;->Cb:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/cast/CastDevice;JLcom/google/android/gms/cast/Cast$Listener;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V
    .locals 6

    const/4 v5, 0x0

    check-cast v5, [Ljava/lang/String;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p7

    move-object v4, p8

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/hb;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;[Ljava/lang/String;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/gh;->BI:Lcom/google/android/gms/cast/CastDevice;

    iput-object p6, p0, Lcom/google/android/gms/internal/gh;->Ae:Lcom/google/android/gms/cast/Cast$Listener;

    iput-wide p4, p0, Lcom/google/android/gms/internal/gh;->BL:J

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/gh;->mHandler:Landroid/os/Handler;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/gh;->BK:Ljava/util/Map;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/gh;->BP:Z

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/gh;->BR:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/gh;->BH:Lcom/google/android/gms/cast/ApplicationMetadata;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/gh;->BM:Ljava/lang/String;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/google/android/gms/internal/gh;->BQ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/gh;->AP:D

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/gh;->AQ:Z

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v2, 0x0

    invoke-direct {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/internal/gh;->BS:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/gh;->BW:Ljava/util/Map;

    new-instance v0, Lcom/google/android/gms/internal/gh$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/gh$b;-><init>(Lcom/google/android/gms/internal/gh;Lcom/google/android/gms/internal/gh$1;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/gh;->BX:Lcom/google/android/gms/internal/gh$b;

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BX:Lcom/google/android/gms/internal/gh$b;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/gh;->registerConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)V

    new-instance v0, Lcom/google/android/gms/internal/gh$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/gh$1;-><init>(Lcom/google/android/gms/internal/gh;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/gh;->BJ:Lcom/google/android/gms/internal/gm;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/gh;Lcom/google/android/gms/cast/ApplicationMetadata;)Lcom/google/android/gms/cast/ApplicationMetadata;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/gh;->BH:Lcom/google/android/gms/cast/ApplicationMetadata;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/gh;Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$d;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/gh;->BY:Lcom/google/android/gms/common/api/a$d;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/gh;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/gh;->BT:Ljava/lang/String;

    return-object p1
.end method

.method private a(Lcom/google/android/gms/internal/ge;)V
    .locals 7

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ge;->ec()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/internal/gh;->BM:Ljava/lang/String;

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/gi;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    iput-object v0, p0, Lcom/google/android/gms/internal/gh;->BM:Ljava/lang/String;

    move v0, v1

    :goto_0
    sget-object v3, Lcom/google/android/gms/internal/gh;->BG:Lcom/google/android/gms/internal/gn;

    const-string v4, "hasChanged=%b, mFirstApplicationStatusUpdate=%b"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v2

    iget-boolean v6, p0, Lcom/google/android/gms/internal/gh;->BN:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/gn;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/gh;->Ae:Lcom/google/android/gms/cast/Cast$Listener;

    if-eqz v1, :cond_1

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/gh;->BN:Z

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->Ae:Lcom/google/android/gms/cast/Cast$Listener;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/Cast$Listener;->onApplicationStatusChanged()V

    :cond_1
    iput-boolean v2, p0, Lcom/google/android/gms/internal/gh;->BN:Z

    return-void

    :cond_2
    move v0, v2

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/gh;Lcom/google/android/gms/internal/ge;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/gh;->a(Lcom/google/android/gms/internal/ge;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/gh;Lcom/google/android/gms/internal/gj;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/gh;->a(Lcom/google/android/gms/internal/gj;)V

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/gj;)V
    .locals 9

    const/4 v8, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/gj;->eh()D

    move-result-wide v4

    const-wide/high16 v6, 0x7ff8000000000000L    # NaN

    cmpl-double v0, v4, v6

    if-eqz v0, :cond_6

    iget-wide v6, p0, Lcom/google/android/gms/internal/gh;->AP:D

    cmpl-double v0, v4, v6

    if-eqz v0, :cond_6

    iput-wide v4, p0, Lcom/google/android/gms/internal/gh;->AP:D

    move v0, v1

    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gj;->en()Z

    move-result v3

    iget-boolean v4, p0, Lcom/google/android/gms/internal/gh;->AQ:Z

    if-eq v3, v4, :cond_0

    iput-boolean v3, p0, Lcom/google/android/gms/internal/gh;->AQ:Z

    move v0, v1

    :cond_0
    sget-object v3, Lcom/google/android/gms/internal/gh;->BG:Lcom/google/android/gms/internal/gn;

    const-string v4, "hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b"

    new-array v5, v8, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v2

    iget-boolean v6, p0, Lcom/google/android/gms/internal/gh;->BO:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/gn;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/gh;->Ae:Lcom/google/android/gms/cast/Cast$Listener;

    if-eqz v3, :cond_2

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/gh;->BO:Z

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->Ae:Lcom/google/android/gms/cast/Cast$Listener;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/Cast$Listener;->onVolumeChanged()V

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/gj;->eo()I

    move-result v0

    iget v3, p0, Lcom/google/android/gms/internal/gh;->BR:I

    if-eq v0, v3, :cond_5

    iput v0, p0, Lcom/google/android/gms/internal/gh;->BR:I

    move v0, v1

    :goto_1
    sget-object v3, Lcom/google/android/gms/internal/gh;->BG:Lcom/google/android/gms/internal/gn;

    const-string v4, "hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b"

    new-array v5, v8, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v2

    iget-boolean v6, p0, Lcom/google/android/gms/internal/gh;->BO:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/gn;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/gh;->Ae:Lcom/google/android/gms/cast/Cast$Listener;

    if-eqz v1, :cond_4

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/gh;->BO:Z

    if-eqz v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->Ae:Lcom/google/android/gms/cast/Cast$Listener;

    iget v1, p0, Lcom/google/android/gms/internal/gh;->BR:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/Cast$Listener;->O(I)V

    :cond_4
    iput-boolean v2, p0, Lcom/google/android/gms/internal/gh;->BO:Z

    return-void

    :cond_5
    move v0, v2

    goto :goto_1

    :cond_6
    move v0, v2

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/gh;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/gh;->BP:Z

    return p1
.end method

.method static synthetic b(Lcom/google/android/gms/internal/gh;Lcom/google/android/gms/common/api/a$d;)Lcom/google/android/gms/common/api/a$d;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/gh;->BZ:Lcom/google/android/gms/common/api/a$d;

    return-object p1
.end method

.method static synthetic b(Lcom/google/android/gms/internal/gh;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/gh;->BU:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/google/android/gms/internal/gh;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BQ:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/gh;)Lcom/google/android/gms/common/api/a$d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BY:Lcom/google/android/gms/common/api/a$d;

    return-object v0
.end method

.method private c(Lcom/google/android/gms/common/api/a$d;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/cast/Cast$ApplicationConnectionResult;",
            ">;)V"
        }
    .end annotation

    sget-object v1, Lcom/google/android/gms/internal/gh;->Ca:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BY:Lcom/google/android/gms/common/api/a$d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BY:Lcom/google/android/gms/common/api/a$d;

    new-instance v2, Lcom/google/android/gms/internal/gh$a;

    new-instance v3, Lcom/google/android/gms/common/api/Status;

    const/16 v4, 0x7d2

    invoke-direct {v3, v4}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/gh$a;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/common/api/a$d;->a(Ljava/lang/Object;)V

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/gh;->BY:Lcom/google/android/gms/common/api/a$d;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/gh;)Lcom/google/android/gms/cast/Cast$Listener;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->Ae:Lcom/google/android/gms/cast/Cast$Listener;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/gh;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method private e(Lcom/google/android/gms/common/api/a$d;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    sget-object v1, Lcom/google/android/gms/internal/gh;->Cb:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BZ:Lcom/google/android/gms/common/api/a$d;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0x7d1

    invoke-direct {v0, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/a$d;->a(Ljava/lang/Object;)V

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/gh;->BZ:Lcom/google/android/gms/common/api/a$d;

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private ei()V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/gh;->BG:Lcom/google/android/gms/internal/gn;

    const-string v1, "removing all MessageReceivedCallbacks"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gn;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/gh;->BK:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BK:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private ej()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    iget-boolean v0, p0, Lcom/google/android/gms/internal/gh;->BP:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BQ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not connected to a device"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method

.method static synthetic ek()Lcom/google/android/gms/internal/gn;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/gh;->BG:Lcom/google/android/gms/internal/gn;

    return-object v0
.end method

.method static synthetic el()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/gh;->Ca:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic em()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/gh;->Cb:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/internal/gh;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BK:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/internal/gh;)Lcom/google/android/gms/cast/CastDevice;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BI:Lcom/google/android/gms/cast/CastDevice;

    return-object v0
.end method

.method static synthetic h(Lcom/google/android/gms/internal/gh;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BW:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic i(Lcom/google/android/gms/internal/gh;)Lcom/google/android/gms/common/api/a$d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BZ:Lcom/google/android/gms/common/api/a$d;

    return-object v0
.end method

.method static synthetic j(Lcom/google/android/gms/internal/gh;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/gh;->ei()V

    return-void
.end method


# virtual methods
.method protected G(Landroid/os/IBinder;)Lcom/google/android/gms/internal/gl;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/gl$a;->H(Landroid/os/IBinder;)Lcom/google/android/gms/internal/gl;

    move-result-object v0

    return-object v0
.end method

.method public a(D)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Volume cannot be "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gh;->ft()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/gl;

    iget-wide v4, p0, Lcom/google/android/gms/internal/gh;->AP:D

    iget-boolean v6, p0, Lcom/google/android/gms/internal/gh;->AQ:Z

    move-wide v2, p1

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/gl;->a(DDZ)V

    return-void
.end method

.method protected a(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 7

    const/16 v6, 0x3e9

    const/4 v0, 0x0

    const/4 v5, 0x1

    sget-object v1, Lcom/google/android/gms/internal/gh;->BG:Lcom/google/android/gms/internal/gn;

    const-string v2, "in onPostInitHandler; statusCode=%d"

    new-array v3, v5, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/gn;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    if-ne p1, v6, :cond_2

    :cond_0
    iput-boolean v5, p0, Lcom/google/android/gms/internal/gh;->BP:Z

    iput-boolean v5, p0, Lcom/google/android/gms/internal/gh;->BN:Z

    iput-boolean v5, p0, Lcom/google/android/gms/internal/gh;->BO:Z

    :goto_0
    if-ne p1, v6, :cond_1

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/gh;->BV:Landroid/os/Bundle;

    iget-object v1, p0, Lcom/google/android/gms/internal/gh;->BV:Landroid/os/Bundle;

    const-string v2, "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING"

    invoke-virtual {v1, v2, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    move p1, v0

    :cond_1
    invoke-super {p0, p1, p2, p3}, Lcom/google/android/gms/internal/hb;->a(ILandroid/os/IBinder;Landroid/os/Bundle;)V

    return-void

    :cond_2
    iput-boolean v0, p0, Lcom/google/android/gms/internal/gh;->BP:Z

    goto :goto_0
.end method

.method protected a(Lcom/google/android/gms/internal/hi;Lcom/google/android/gms/internal/hb$e;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/gh;->BG:Lcom/google/android/gms/internal/gn;

    const-string v1, "getServiceFromBroker(): mLastApplicationId=%s, mLastSessionId=%s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/google/android/gms/internal/gh;->BT:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/google/android/gms/internal/gh;->BU:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gn;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BI:Lcom/google/android/gms/cast/CastDevice;

    invoke-virtual {v0, v5}, Lcom/google/android/gms/cast/CastDevice;->putInBundle(Landroid/os/Bundle;)V

    const-string v0, "com.google.android.gms.cast.EXTRA_CAST_FLAGS"

    iget-wide v2, p0, Lcom/google/android/gms/internal/gh;->BL:J

    invoke-virtual {v5, v0, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BT:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "last_application_id"

    iget-object v1, p0, Lcom/google/android/gms/internal/gh;->BT:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BU:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "last_session_id"

    iget-object v1, p0, Lcom/google/android/gms/internal/gh;->BU:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const v2, 0x4da6e8

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gh;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BJ:Lcom/google/android/gms/internal/gm;

    invoke-interface {v0}, Lcom/google/android/gms/internal/gm;->asBinder()Landroid/os/IBinder;

    move-result-object v4

    move-object v0, p1

    move-object v1, p2

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/hi;->a(Lcom/google/android/gms/internal/hh;ILjava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V

    return-void
.end method

.method public a(Ljava/lang/String;Lcom/google/android/gms/cast/Cast$MessageReceivedCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/internal/gi;->ak(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/gh;->aj(Ljava/lang/String;)V

    if-eqz p2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/gh;->BK:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BK:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gh;->ft()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gl;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/gl;->an(Ljava/lang/String;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public a(Ljava/lang/String;Lcom/google/android/gms/cast/LaunchOptions;Lcom/google/android/gms/common/api/a$d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/cast/LaunchOptions;",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/cast/Cast$ApplicationConnectionResult;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/gh;->c(Lcom/google/android/gms/common/api/a$d;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gh;->ft()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gl;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/gl;->a(Ljava/lang/String;Lcom/google/android/gms/cast/LaunchOptions;)V

    return-void
.end method

.method public a(Ljava/lang/String;Lcom/google/android/gms/common/api/a$d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/gh;->e(Lcom/google/android/gms/common/api/a$d;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gh;->ft()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gl;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/gl;->am(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/common/api/a$d;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Ljava/lang/IllegalStateException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The message payload cannot be null or empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/high16 v1, 0x10000

    if-le v0, v1, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Message exceeds maximum size"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, Lcom/google/android/gms/internal/gi;->ak(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/gh;->ej()V

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BS:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gh;->ft()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gl;

    invoke-interface {v0, p1, p2, v2, v3}, Lcom/google/android/gms/internal/gl;->a(Ljava/lang/String;Ljava/lang/String;J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BW:Ljava/util/Map;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public a(Ljava/lang/String;ZLcom/google/android/gms/common/api/a$d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/cast/Cast$ApplicationConnectionResult;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/gh;->c(Lcom/google/android/gms/common/api/a$d;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gh;->ft()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gl;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/gl;->e(Ljava/lang/String;Z)V

    return-void
.end method

.method public aj(Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Channel namespace cannot be null or empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/gh;->BK:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BK:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/Cast$MessageReceivedCallback;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gh;->ft()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gl;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/gl;->ao(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_1
    :goto_0
    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/internal/gh;->BG:Lcom/google/android/gms/internal/gn;

    const-string v2, "Error unregistering namespace (%s): %s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 v4, 0x1

    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/internal/gn;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/common/api/a$d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/cast/Cast$ApplicationConnectionResult;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/gh;->c(Lcom/google/android/gms/common/api/a$d;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gh;->ft()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gl;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/gl;->h(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected bu()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE"

    return-object v0
.end method

.method protected bv()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.cast.internal.ICastDeviceController"

    return-object v0
.end method

.method public d(Lcom/google/android/gms/common/api/a$d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/gh;->e(Lcom/google/android/gms/common/api/a$d;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gh;->ft()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gl;

    invoke-interface {v0}, Lcom/google/android/gms/internal/gl;->ep()V

    return-void
.end method

.method public disconnect()V
    .locals 6

    const/4 v5, 0x1

    const/4 v4, 0x0

    sget-object v0, Lcom/google/android/gms/internal/gh;->BG:Lcom/google/android/gms/internal/gn;

    const-string v1, "disconnect(); mDisconnecting=%b, isConnected=%b"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/android/gms/internal/gh;->BQ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gh;->isConnected()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gn;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BQ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/gh;->BG:Lcom/google/android/gms/internal/gn;

    const-string v1, "mDisconnecting is set, so short-circuiting"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/gn;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/gh;->ei()V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gh;->isConnected()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gh;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/gh;->ft()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gl;

    invoke-interface {v0}, Lcom/google/android/gms/internal/gl;->disconnect()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    invoke-super {p0}, Lcom/google/android/gms/internal/hb;->disconnect()V

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    sget-object v1, Lcom/google/android/gms/internal/gh;->BG:Lcom/google/android/gms/internal/gn;

    const-string v2, "Error while disconnecting the controller interface: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/internal/gn;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-super {p0}, Lcom/google/android/gms/internal/hb;->disconnect()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-super {p0}, Lcom/google/android/gms/internal/hb;->disconnect()V

    throw v0
.end method

.method public ef()Landroid/os/Bundle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BV:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BV:Landroid/os/Bundle;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/internal/gh;->BV:Landroid/os/Bundle;

    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/internal/hb;->ef()Landroid/os/Bundle;

    move-result-object v0

    goto :goto_0
.end method

.method public eg()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gh;->ft()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gl;

    invoke-interface {v0}, Lcom/google/android/gms/internal/gl;->eg()V

    return-void
.end method

.method public eh()D
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/gh;->ej()V

    iget-wide v0, p0, Lcom/google/android/gms/internal/gh;->AP:D

    return-wide v0
.end method

.method public getApplicationMetadata()Lcom/google/android/gms/cast/ApplicationMetadata;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/gh;->ej()V

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BH:Lcom/google/android/gms/cast/ApplicationMetadata;

    return-object v0
.end method

.method public getApplicationStatus()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/gh;->ej()V

    iget-object v0, p0, Lcom/google/android/gms/internal/gh;->BM:Ljava/lang/String;

    return-object v0
.end method

.method public isMute()Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/gh;->ej()V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/gh;->AQ:Z

    return v0
.end method

.method protected synthetic x(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/gh;->G(Landroid/os/IBinder;)Lcom/google/android/gms/internal/gl;

    move-result-object v0

    return-object v0
.end method

.method public y(Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;,
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gh;->ft()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/gl;

    iget-wide v2, p0, Lcom/google/android/gms/internal/gh;->AP:D

    iget-boolean v1, p0, Lcom/google/android/gms/internal/gh;->AQ:Z

    invoke-interface {v0, p1, v2, v3, v1}, Lcom/google/android/gms/internal/gl;->a(ZDZ)V

    return-void
.end method
