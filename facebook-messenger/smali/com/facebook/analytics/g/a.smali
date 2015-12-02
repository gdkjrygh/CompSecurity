.class public Lcom/facebook/analytics/g/a;
.super Ljava/lang/Object;
.source "AnalyticsHighEventsRateReporter.java"


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
.field private final b:Lcom/facebook/common/time/a;

.field private final c:Ljava/util/concurrent/Executor;

.field private final d:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Lcom/facebook/analytics/g/d;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mCleanupSync"
    .end annotation
.end field

.field private final e:Lcom/facebook/analytics/g/c;

.field private final f:Ljava/lang/Object;

.field private g:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 83
    const-class v0, Lcom/facebook/analytics/g/a;

    sput-object v0, Lcom/facebook/analytics/g/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/common/time/a;Ljava/util/concurrent/Executor;)V
    .locals 2

    .prologue
    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/facebook/analytics/g/a;->f:Ljava/lang/Object;

    .line 101
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/analytics/g/a;->g:J

    .line 106
    iput-object p1, p0, Lcom/facebook/analytics/g/a;->b:Lcom/facebook/common/time/a;

    .line 107
    iput-object p2, p0, Lcom/facebook/analytics/g/a;->c:Ljava/util/concurrent/Executor;

    .line 109
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/facebook/analytics/g/a;->d:Landroid/util/SparseArray;

    .line 110
    new-instance v0, Lcom/facebook/analytics/g/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/analytics/g/c;-><init>(Lcom/facebook/analytics/g/a;Lcom/facebook/analytics/g/b;)V

    iput-object v0, p0, Lcom/facebook/analytics/g/a;->e:Lcom/facebook/analytics/g/c;

    .line 111
    iget-object v0, p0, Lcom/facebook/analytics/g/a;->b:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/analytics/g/a;->g:J

    .line 112
    return-void
.end method

.method static synthetic a()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 23
    sget-object v0, Lcom/facebook/analytics/g/a;->a:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/analytics/g/a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/analytics/g/a;->f:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/analytics/g/a;)Lcom/facebook/common/time/a;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/analytics/g/a;->b:Lcom/facebook/common/time/a;

    return-object v0
.end method

.method private b()V
    .locals 6

    .prologue
    .line 155
    iget-object v0, p0, Lcom/facebook/analytics/g/a;->b:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    .line 156
    iget-wide v2, p0, Lcom/facebook/analytics/g/a;->g:J

    sub-long v2, v0, v2

    const-wide/32 v4, 0x2bf20

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    .line 157
    iput-wide v0, p0, Lcom/facebook/analytics/g/a;->g:J

    .line 158
    iget-object v0, p0, Lcom/facebook/analytics/g/a;->c:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lcom/facebook/analytics/g/a;->e:Lcom/facebook/analytics/g/c;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 160
    :cond_0
    return-void
.end method

.method private b(Lcom/facebook/analytics/am;D)V
    .locals 5

    .prologue
    .line 163
    const-string v0, "Too many events logged for this type: %s. Current Rate: %.2f events/min. See fburl.com/12412193 for how to address this."

    .line 165
    sget-object v1, Lcom/facebook/analytics/g/a;->a:Ljava/lang/Class;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v0, v2}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    return-void
.end method

.method static synthetic c(Lcom/facebook/analytics/g/a;)Landroid/util/SparseArray;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/analytics/g/a;->d:Landroid/util/SparseArray;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/analytics/am;)V
    .locals 3

    .prologue
    .line 115
    if-nez p1, :cond_0

    .line 116
    sget-object v0, Lcom/facebook/analytics/g/a;->a:Ljava/lang/Class;

    const-string v1, "Got null event in maybeLogWarning()"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 124
    :goto_0
    return-void

    .line 119
    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/analytics/g/a;->b(Lcom/facebook/analytics/am;)D

    move-result-wide v0

    .line 120
    invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/analytics/g/a;->a(Lcom/facebook/analytics/am;D)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 121
    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/analytics/g/a;->b(Lcom/facebook/analytics/am;D)V

    .line 123
    :cond_1
    invoke-direct {p0}, Lcom/facebook/analytics/g/a;->b()V

    goto :goto_0
.end method

.method a(Lcom/facebook/analytics/am;D)Z
    .locals 3
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 130
    const-string v1, "disable_throttle_warning"

    invoke-interface {p1, v1}, Lcom/facebook/analytics/am;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 133
    :cond_0
    :goto_0
    return v0

    :cond_1
    const-wide/high16 v1, 0x4014000000000000L    # 5.0

    cmpl-double v1, p2, v1

    if-lez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method b(Lcom/facebook/analytics/am;)D
    .locals 6
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    .line 139
    iget-object v1, p0, Lcom/facebook/analytics/g/a;->f:Ljava/lang/Object;

    monitor-enter v1

    .line 140
    :try_start_0
    iget-object v0, p0, Lcom/facebook/analytics/g/a;->d:Landroid/util/SparseArray;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/g/d;

    .line 141
    if-nez v0, :cond_0

    .line 142
    new-instance v0, Lcom/facebook/analytics/g/d;

    invoke-interface {p1}, Lcom/facebook/analytics/am;->b()J

    move-result-wide v2

    invoke-direct {v0, v2, v3}, Lcom/facebook/analytics/g/d;-><init>(J)V

    .line 143
    iget-object v2, p0, Lcom/facebook/analytics/g/a;->d:Landroid/util/SparseArray;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-virtual {v2, v3, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 145
    :cond_0
    invoke-interface {p1}, Lcom/facebook/analytics/am;->b()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/facebook/analytics/g/d;->a(J)D

    move-result-wide v2

    .line 146
    const-wide/high16 v4, 0x4014000000000000L    # 5.0

    cmpl-double v0, v2, v4

    if-lez v0, :cond_1

    .line 148
    iget-object v0, p0, Lcom/facebook/analytics/g/a;->d:Landroid/util/SparseArray;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->remove(I)V

    .line 150
    :cond_1
    monitor-exit v1

    .line 151
    return-wide v2

    .line 150
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
