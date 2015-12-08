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


# instance fields
.field private uu:Lcom/google/android/gms/analytics/i;

.field private xo:Z

.field private xp:I

.field private xq:J

.field private xr:Z

.field private xs:J

.field final synthetic xt:Lcom/google/android/gms/analytics/Tracker;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/analytics/Tracker;)V
    .locals 3

    const/4 v2, 0x0

    iput-object p1, p0, Lcom/google/android/gms/analytics/Tracker$a;->xt:Lcom/google/android/gms/analytics/Tracker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v2, p0, Lcom/google/android/gms/analytics/Tracker$a;->xo:Z

    iput v2, p0, Lcom/google/android/gms/analytics/Tracker$a;->xp:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->xq:J

    iput-boolean v2, p0, Lcom/google/android/gms/analytics/Tracker$a;->xr:Z

    new-instance v0, Lcom/google/android/gms/analytics/Tracker$a$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/analytics/Tracker$a$1;-><init>(Lcom/google/android/gms/analytics/Tracker$a;Lcom/google/android/gms/analytics/Tracker;)V

    iput-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->uu:Lcom/google/android/gms/analytics/i;

    return-void
.end method

.method private dB()V
    .locals 6

    invoke-static {}, Lcom/google/android/gms/analytics/GoogleAnalytics;->di()Lcom/google/android/gms/analytics/GoogleAnalytics;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "GoogleAnalytics isn\'t initialized for the Tracker!"

    invoke-static {v0}, Lcom/google/android/gms/analytics/aa;->A(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-wide v2, p0, Lcom/google/android/gms/analytics/Tracker$a;->xq:J

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-gez v1, :cond_1

    iget-boolean v1, p0, Lcom/google/android/gms/analytics/Tracker$a;->xo:Z

    if-eqz v1, :cond_2

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/analytics/Tracker$a;->xt:Lcom/google/android/gms/analytics/Tracker;

    invoke-static {v1}, Lcom/google/android/gms/analytics/Tracker;->b(Lcom/google/android/gms/analytics/Tracker;)Lcom/google/android/gms/analytics/Tracker$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->a(Lcom/google/android/gms/analytics/GoogleAnalytics$a;)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/analytics/Tracker$a;->xt:Lcom/google/android/gms/analytics/Tracker;

    invoke-static {v1}, Lcom/google/android/gms/analytics/Tracker;->b(Lcom/google/android/gms/analytics/Tracker;)Lcom/google/android/gms/analytics/Tracker$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/GoogleAnalytics;->b(Lcom/google/android/gms/analytics/GoogleAnalytics$a;)V

    goto :goto_0
.end method


# virtual methods
.method public dA()Z
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->xr:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/google/android/gms/analytics/Tracker$a;->xr:Z

    return v0
.end method

.method dC()Z
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->uu:Lcom/google/android/gms/analytics/i;

    invoke-interface {v0}, Lcom/google/android/gms/analytics/i;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/google/android/gms/analytics/Tracker$a;->xs:J

    const-wide/16 v4, 0x3e8

    iget-wide v6, p0, Lcom/google/android/gms/analytics/Tracker$a;->xq:J

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public dy()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->xq:J

    return-wide v0
.end method

.method public dz()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->xo:Z

    return v0
.end method

.method public enableAutoActivityTracking(Z)V
    .locals 0
    .param p1, "enabled"    # Z

    .prologue
    iput-boolean p1, p0, Lcom/google/android/gms/analytics/Tracker$a;->xo:Z

    invoke-direct {p0}, Lcom/google/android/gms/analytics/Tracker$a;->dB()V

    return-void
.end method

.method public h(Landroid/app/Activity;)V
    .locals 4

    const/4 v3, 0x1

    invoke-static {}, Lcom/google/android/gms/analytics/u;->cU()Lcom/google/android/gms/analytics/u;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/analytics/u$a;->we:Lcom/google/android/gms/analytics/u$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/u;->a(Lcom/google/android/gms/analytics/u$a;)V

    iget v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->xp:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/analytics/Tracker$a;->dC()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-boolean v3, p0, Lcom/google/android/gms/analytics/Tracker$a;->xr:Z

    :cond_0
    iget v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->xp:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->xp:I

    iget-boolean v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->xo:Z

    if-eqz v0, :cond_1

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v0, "&t"

    const-string v2, "screenview"

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/analytics/u;->cU()Lcom/google/android/gms/analytics/u;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/google/android/gms/analytics/u;->u(Z)V

    iget-object v2, p0, Lcom/google/android/gms/analytics/Tracker$a;->xt:Lcom/google/android/gms/analytics/Tracker;

    const-string v3, "&cd"

    iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->xt:Lcom/google/android/gms/analytics/Tracker;

    invoke-static {v0}, Lcom/google/android/gms/analytics/Tracker;->c(Lcom/google/android/gms/analytics/Tracker;)Lcom/google/android/gms/analytics/aj;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->xt:Lcom/google/android/gms/analytics/Tracker;

    invoke-static {v0}, Lcom/google/android/gms/analytics/Tracker;->c(Lcom/google/android/gms/analytics/Tracker;)Lcom/google/android/gms/analytics/aj;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/analytics/aj;->j(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/analytics/Tracker;->set(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->xt:Lcom/google/android/gms/analytics/Tracker;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/Tracker;->send(Ljava/util/Map;)V

    invoke-static {}, Lcom/google/android/gms/analytics/u;->cU()Lcom/google/android/gms/analytics/u;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/u;->u(Z)V

    :cond_1
    return-void

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public i(Landroid/app/Activity;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/analytics/u;->cU()Lcom/google/android/gms/analytics/u;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/analytics/u$a;->wf:Lcom/google/android/gms/analytics/u$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/analytics/u;->a(Lcom/google/android/gms/analytics/u$a;)V

    iget v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->xp:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->xp:I

    const/4 v0, 0x0

    iget v1, p0, Lcom/google/android/gms/analytics/Tracker$a;->xp:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->xp:I

    iget v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->xp:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->uu:Lcom/google/android/gms/analytics/i;

    invoke-interface {v0}, Lcom/google/android/gms/analytics/i;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/analytics/Tracker$a;->xs:J

    :cond_0
    return-void
.end method

.method public setSessionTimeout(J)V
    .locals 1
    .param p1, "sessionTimeout"    # J

    .prologue
    iput-wide p1, p0, Lcom/google/android/gms/analytics/Tracker$a;->xq:J

    invoke-direct {p0}, Lcom/google/android/gms/analytics/Tracker$a;->dB()V

    return-void
.end method
