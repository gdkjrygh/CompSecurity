.class public Lcom/facebook/location/o;
.super Ljava/lang/Object;
.source "GetDeviceLocationParamsBuilder.java"


# instance fields
.field private a:J

.field private b:J

.field private c:F

.field private d:J

.field private e:F

.field private f:J

.field private g:F

.field private h:J

.field private i:F

.field private j:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private k:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    const-wide/32 v2, 0x1d4c0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const-wide/16 v0, 0x1388

    iput-wide v0, p0, Lcom/facebook/location/o;->a:J

    .line 20
    iput-wide v2, p0, Lcom/facebook/location/o;->b:J

    .line 21
    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, Lcom/facebook/location/o;->c:F

    .line 22
    const-wide/16 v0, 0xfa

    iput-wide v0, p0, Lcom/facebook/location/o;->d:J

    .line 23
    const/high16 v0, 0x41200000    # 10.0f

    iput v0, p0, Lcom/facebook/location/o;->e:F

    .line 24
    iput-wide v2, p0, Lcom/facebook/location/o;->f:J

    .line 25
    const/high16 v0, 0x42c80000    # 100.0f

    iput v0, p0, Lcom/facebook/location/o;->g:F

    .line 26
    iput-wide v2, p0, Lcom/facebook/location/o;->h:J

    .line 27
    const/high16 v0, 0x43480000    # 200.0f

    iput v0, p0, Lcom/facebook/location/o;->i:F

    .line 29
    const-string v0, "network"

    const-string v1, "gps"

    const-string v2, "passive"

    invoke-static {v0, v1, v2}, Lcom/google/common/a/fi;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/location/o;->j:Ljava/util/Set;

    .line 34
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/location/o;->k:Z

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .prologue
    .line 37
    iget-wide v0, p0, Lcom/facebook/location/o;->a:J

    return-wide v0
.end method

.method public a(F)Lcom/facebook/location/o;
    .locals 1

    .prologue
    .line 133
    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-gez v0, :cond_0

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 135
    iput p1, p0, Lcom/facebook/location/o;->g:F

    .line 136
    return-object p0

    .line 133
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(J)Lcom/facebook/location/o;
    .locals 2

    .prologue
    .line 46
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 47
    iput-wide p1, p0, Lcom/facebook/location/o;->a:J

    .line 48
    return-object p0

    .line 46
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()J
    .locals 2

    .prologue
    .line 52
    iget-wide v0, p0, Lcom/facebook/location/o;->b:J

    return-wide v0
.end method

.method public c()F
    .locals 1

    .prologue
    .line 67
    iget v0, p0, Lcom/facebook/location/o;->c:F

    return v0
.end method

.method public d()J
    .locals 2

    .prologue
    .line 83
    iget-wide v0, p0, Lcom/facebook/location/o;->d:J

    return-wide v0
.end method

.method public e()F
    .locals 1

    .prologue
    .line 97
    iget v0, p0, Lcom/facebook/location/o;->e:F

    return v0
.end method

.method public f()J
    .locals 2

    .prologue
    .line 112
    iget-wide v0, p0, Lcom/facebook/location/o;->f:J

    return-wide v0
.end method

.method public g()F
    .locals 1

    .prologue
    .line 126
    iget v0, p0, Lcom/facebook/location/o;->g:F

    return v0
.end method

.method public h()J
    .locals 2

    .prologue
    .line 140
    iget-wide v0, p0, Lcom/facebook/location/o;->h:J

    return-wide v0
.end method

.method public i()F
    .locals 1

    .prologue
    .line 154
    iget v0, p0, Lcom/facebook/location/o;->i:F

    return v0
.end method

.method public j()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 169
    iget-object v0, p0, Lcom/facebook/location/o;->j:Ljava/util/Set;

    return-object v0
.end method

.method public k()Z
    .locals 1

    .prologue
    .line 186
    iget-boolean v0, p0, Lcom/facebook/location/o;->k:Z

    return v0
.end method

.method public l()Lcom/facebook/location/GetDeviceLocationParams;
    .locals 1

    .prologue
    .line 199
    new-instance v0, Lcom/facebook/location/GetDeviceLocationParams;

    invoke-direct {v0, p0}, Lcom/facebook/location/GetDeviceLocationParams;-><init>(Lcom/facebook/location/o;)V

    return-object v0
.end method
