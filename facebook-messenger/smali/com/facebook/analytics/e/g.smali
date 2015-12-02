.class public Lcom/facebook/analytics/e/g;
.super Ljava/lang/Object;
.source "MarkerConfig.java"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:J

.field private e:J

.field private f:J

.field private g:D

.field private h:Z

.field private i:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Class",
            "<*>;>;"
        }
    .end annotation
.end field

.field private j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    .prologue
    const-wide/16 v2, -0x1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/analytics/e/g;->d:J

    .line 22
    iput-wide v2, p0, Lcom/facebook/analytics/e/g;->e:J

    .line 23
    iput-wide v2, p0, Lcom/facebook/analytics/e/g;->f:J

    .line 24
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    iput-wide v0, p0, Lcom/facebook/analytics/e/g;->g:D

    .line 35
    iput-object p1, p0, Lcom/facebook/analytics/e/g;->b:Ljava/lang/String;

    .line 36
    invoke-static {}, Lcom/facebook/common/h/a;->a()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/analytics/e/g;->a:Ljava/lang/String;

    .line 37
    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)Lcom/facebook/analytics/e/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/analytics/e/g;"
        }
    .end annotation

    .prologue
    .line 155
    iput-object p1, p0, Lcom/facebook/analytics/e/g;->j:Ljava/util/Map;

    .line 156
    return-object p0
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lcom/facebook/analytics/e/g;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lcom/facebook/analytics/e/g;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c()D
    .locals 2

    .prologue
    .line 123
    iget-wide v0, p0, Lcom/facebook/analytics/e/g;->g:D

    return-wide v0
.end method

.method public d()J
    .locals 2

    .prologue
    .line 127
    iget-wide v0, p0, Lcom/facebook/analytics/e/g;->e:J

    return-wide v0
.end method

.method public e()J
    .locals 2

    .prologue
    .line 131
    iget-wide v0, p0, Lcom/facebook/analytics/e/g;->f:J

    return-wide v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 135
    iget-object v0, p0, Lcom/facebook/analytics/e/g;->a:Ljava/lang/String;

    return-object v0
.end method

.method public g()J
    .locals 2

    .prologue
    .line 139
    iget-wide v0, p0, Lcom/facebook/analytics/e/g;->d:J

    return-wide v0
.end method

.method public h()Z
    .locals 1

    .prologue
    .line 143
    iget-boolean v0, p0, Lcom/facebook/analytics/e/g;->h:Z

    return v0
.end method

.method public i()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Class",
            "<*>;>;"
        }
    .end annotation

    .prologue
    .line 147
    iget-object v0, p0, Lcom/facebook/analytics/e/g;->i:Ljava/util/Set;

    return-object v0
.end method

.method public j()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 151
    iget-object v0, p0, Lcom/facebook/analytics/e/g;->j:Ljava/util/Map;

    return-object v0
.end method
