.class Lcom/google/android/gms/analytics/Tracker$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/analytics/GoogleAnalytics$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/analytics/Tracker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/analytics/Tracker$a$a;
    }
.end annotation


# instance fields
.field private tg:Lcom/google/android/gms/analytics/i;

.field private vV:Ljava/util/Timer;

.field private vW:Ljava/util/TimerTask;

.field private vX:Z

.field private vY:Z

.field private vZ:I

.field private wa:J

.field private wb:Z

.field private wc:J

.field final synthetic wd:Lcom/google/android/gms/analytics/Tracker;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/analytics/Tracker;)V
    .locals 3

    const/4 v2, 0x0

    iput-object p1, p0, Lcom/google/android/gms/analytics/Tracker$a;->wd:Lcom/google/android/gms/analytics/Tracker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v2, p0, Lcom/google/android/gms/analytics/Tracker$a;->vX:Z

    iput-boolean v2, p0, Lcom/google/android/gms/analytics/Tracker$a;->vY:Z

    iput v2, p0, Lcom/google/android/gms/analytics/Tracker$a;->vZ:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->wa:J

    iput-boolean v2, p0, Lcom/google/android/gms/analytics/Tracker$a;->wb:Z

    new-instance v0, Lcom/google/android/gms/analytics/Tracker$a$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/analytics/Tracker$a$1;-><init>(Lcom/google/android/gms/analytics/Tracker$a;Lcom/google/android/gms/analytics/Tracker;)V

    iput-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->tg:Lcom/google/android/gms/analytics/i;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/analytics/Tracker$a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/analytics/Tracker$a;->vX:Z

    return p1
.end method

.method private df()V
    .locals 6

    invoke-static {}, Lcom/google/android/gms/analytics/GoogleAnalytics;->cM()Lcom/google/android/gms/analytics/GoogleAnalytics;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "GoogleAnalytics isn\'t initialized for the Tracker!"

    invoke-static {v0}, Lcom/google/android/gms/analytics/aa;->w(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-wide v2, p0, Lcom/google/android/gms/analytics/Tracker$a;->wa:J

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-gez v1, :cond_1

    iget-boolean v1, p0, Lcom/google/android/gms/analytics/Tracker$a;->vY:Z

    if-eqz v1, :cond_2

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/analytics/Tracker$a;->wd:Lcom/google/android/gms/analytics/Tracker;

    invoke-static {v1}, Lcom/google/android/gms/analytics/Tracker;->b(Lcom/google/android/gms/analytics/Tracker;)Lcom/google/android/gms/analytics/Tracker$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->a(Lcom/google/android/gms/analytics/GoogleAnalytics$a;)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/analytics/Tracker$a;->wd:Lcom/google/android/gms/analytics/Tracker;

    invoke-static {v1}, Lcom/google/android/gms/analytics/Tracker;->b(Lcom/google/android/gms/analytics/Tracker;)Lcom/google/android/gms/analytics/Tracker$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->b(Lcom/google/android/gms/analytics/GoogleAnalytics$a;)V

    goto :goto_0
.end method

.method private declared-synchronized dg()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->vV:Ljava/util/Timer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->vV:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->vV:Ljava/util/Timer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public dc()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->wa:J

    return-wide v0
.end method

.method public dd()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->vY:Z

    return v0
.end method

.method public de()Z
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->wb:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/android/gms/analytics/Tracker$a;->wb:Z

    return v0
.end method

.method dh()Z
    .locals 6

    const-wide/16 v2, 0x0

    iget-wide v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->wa:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->wa:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->tg:Lcom/google/android/gms/analytics/i;

    invoke-interface {v0}, Lcom/google/android/gms/analytics/i;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/analytics/Tracker$a;->wc:J

    iget-wide v4, p0, Lcom/google/android/gms/analytics/Tracker$a;->wa:J

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public enableAutoActivityTracking(Z)V
    .locals 0
    .param p1, "enabled"    # Z

    .prologue
    iput-boolean p1, p0, Lcom/google/android/gms/analytics/Tracker$a;->vY:Z

    invoke-direct {p0}, Lcom/google/android/gms/analytics/Tracker$a;->df()V

    return-void
.end method

.method public f(Landroid/app/Activity;)V
    .locals 4

    const/4 v3, 0x1

    invoke-static {}, Lcom/google/android/gms/analytics/u;->cy()Lcom/google/android/gms/analytics/u;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/analytics/u$a;->uQ:Lcom/google/android/gms/analytics/u$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/u;->a(Lcom/google/android/gms/analytics/u$a;)V

    invoke-direct {p0}, Lcom/google/android/gms/analytics/Tracker$a;->dg()V

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->vX:Z

    if-nez v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->vZ:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/Tracker$a;->dh()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-boolean v3, p0, Lcom/google/android/gms/analytics/Tracker$a;->wb:Z

    :cond_0
    iput-boolean v3, p0, Lcom/google/android/gms/analytics/Tracker$a;->vX:Z

    iget v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->vZ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->vZ:I

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->vY:Z

    if-eqz v0, :cond_1

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "&t"

    const-string v2, "appview"

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/analytics/u;->cy()Lcom/google/android/gms/analytics/u;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/analytics/u;->t(Z)V

    iget-object v2, p0, Lcom/google/android/gms/analytics/Tracker$a;->wd:Lcom/google/android/gms/analytics/Tracker;

    const-string v3, "&cd"

    iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->wd:Lcom/google/android/gms/analytics/Tracker;

    invoke-static {v0}, Lcom/google/android/gms/analytics/Tracker;->c(Lcom/google/android/gms/analytics/Tracker;)Lcom/google/android/gms/analytics/aj;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->wd:Lcom/google/android/gms/analytics/Tracker;

    invoke-static {v0}, Lcom/google/android/gms/analytics/Tracker;->c(Lcom/google/android/gms/analytics/Tracker;)Lcom/google/android/gms/analytics/aj;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/aj;->h(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->wd:Lcom/google/android/gms/analytics/Tracker;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/Tracker;->send(Ljava/util/Map;)V

    invoke-static {}, Lcom/google/android/gms/analytics/u;->cy()Lcom/google/android/gms/analytics/u;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/u;->t(Z)V

    :cond_1
    return-void

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public g(Landroid/app/Activity;)V
    .locals 4

    invoke-static {}, Lcom/google/android/gms/analytics/u;->cy()Lcom/google/android/gms/analytics/u;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/analytics/u$a;->uR:Lcom/google/android/gms/analytics/u$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/u;->a(Lcom/google/android/gms/analytics/u$a;)V

    iget v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->vZ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->vZ:I

    const/4 v0, 0x0

    iget v1, p0, Lcom/google/android/gms/analytics/Tracker$a;->vZ:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->vZ:I

    iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->tg:Lcom/google/android/gms/analytics/i;

    invoke-interface {v0}, Lcom/google/android/gms/analytics/i;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->wc:J

    iget v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->vZ:I

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/analytics/Tracker$a;->dg()V

    new-instance v0, Lcom/google/android/gms/analytics/Tracker$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/analytics/Tracker$a$a;-><init>(Lcom/google/android/gms/analytics/Tracker$a;Lcom/google/android/gms/analytics/Tracker$1;)V

    iput-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->vW:Ljava/util/TimerTask;

    new-instance v0, Ljava/util/Timer;

    const-string v1, "waitForActivityStart"

    invoke-direct {v0, v1}, Ljava/util/Timer;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->vV:Ljava/util/Timer;

    iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->vV:Ljava/util/Timer;

    iget-object v1, p0, Lcom/google/android/gms/analytics/Tracker$a;->vW:Ljava/util/TimerTask;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_0
    return-void
.end method

.method public setSessionTimeout(J)V
    .locals 1
    .param p1, "sessionTimeout"    # J

    .prologue
    iput-wide p1, p0, Lcom/google/android/gms/analytics/Tracker$a;->wa:J

    invoke-direct {p0}, Lcom/google/android/gms/analytics/Tracker$a;->df()V

    return-void
.end method
