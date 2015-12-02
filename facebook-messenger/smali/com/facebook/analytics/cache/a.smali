.class public Lcom/facebook/analytics/cache/a;
.super Ljava/lang/Object;
.source "CacheAccessPatternLogger.java"


# instance fields
.field private final a:Lcom/facebook/analytics/av;

.field private final b:Ljava/lang/String;

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/facebook/analytics/av;Ljavax/inject/a;)V
    .locals 0
    .param p3    # Ljavax/inject/a;
        .annotation runtime Lcom/facebook/analytics/cache/IsAccessPatternLoggingEnabled;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/facebook/analytics/av;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p2, p0, Lcom/facebook/analytics/cache/a;->a:Lcom/facebook/analytics/av;

    .line 28
    iput-object p1, p0, Lcom/facebook/analytics/cache/a;->b:Ljava/lang/String;

    .line 29
    iput-object p3, p0, Lcom/facebook/analytics/cache/a;->c:Ljavax/inject/a;

    .line 30
    return-void
.end method

.method private a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;
    .locals 3

    .prologue
    .line 106
    new-instance v0, Lcom/facebook/analytics/cb;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/facebook/analytics/cache/a;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "obj_id"

    invoke-virtual {v0, v1, p2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v0

    return-object v0
.end method

.method private a()Z
    .locals 2

    .prologue
    .line 110
    iget-object v0, p0, Lcom/facebook/analytics/cache/a;->c:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/w/q;

    sget-object v1, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    invoke-virtual {v0, v1}, Lcom/facebook/common/w/q;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public a(IJ)V
    .locals 3

    .prologue
    .line 40
    invoke-direct {p0}, Lcom/facebook/analytics/cache/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    iget-object v0, p0, Lcom/facebook/analytics/cache/a;->a:Lcom/facebook/analytics/av;

    const-string v1, "cache_read"

    invoke-direct {p0, v1, p1}, Lcom/facebook/analytics/cache/a;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "mem_size"

    invoke-virtual {v1, v2, p2, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 45
    :cond_0
    return-void
.end method

.method public a(IJJ)V
    .locals 3

    .prologue
    .line 83
    invoke-direct {p0}, Lcom/facebook/analytics/cache/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    iget-object v0, p0, Lcom/facebook/analytics/cache/a;->a:Lcom/facebook/analytics/av;

    const-string v1, "cache_write"

    invoke-direct {p0, v1, p1}, Lcom/facebook/analytics/cache/a;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "mem_size"

    invoke-virtual {v1, v2, p2, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "disk_size"

    invoke-virtual {v1, v2, p4, p5}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 89
    :cond_0
    return-void
.end method

.method public b(IJ)V
    .locals 3

    .prologue
    .line 54
    invoke-direct {p0}, Lcom/facebook/analytics/cache/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/facebook/analytics/cache/a;->a:Lcom/facebook/analytics/av;

    const-string v1, "cache_mem_read"

    invoke-direct {p0, v1, p1}, Lcom/facebook/analytics/cache/a;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "mem_size"

    invoke-virtual {v1, v2, p2, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 59
    :cond_0
    return-void
.end method

.method public c(IJ)V
    .locals 3

    .prologue
    .line 68
    invoke-direct {p0}, Lcom/facebook/analytics/cache/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/facebook/analytics/cache/a;->a:Lcom/facebook/analytics/av;

    const-string v1, "cache_disk_read"

    invoke-direct {p0, v1, p1}, Lcom/facebook/analytics/cache/a;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "disk_size"

    invoke-virtual {v1, v2, p2, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 73
    :cond_0
    return-void
.end method

.method public d(IJ)V
    .locals 3

    .prologue
    .line 98
    invoke-direct {p0}, Lcom/facebook/analytics/cache/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/facebook/analytics/cache/a;->a:Lcom/facebook/analytics/av;

    const-string v1, "cache_disk_write"

    invoke-direct {p0, v1, p1}, Lcom/facebook/analytics/cache/a;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "disk_size"

    invoke-virtual {v1, v2, p2, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;J)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 103
    :cond_0
    return-void
.end method
