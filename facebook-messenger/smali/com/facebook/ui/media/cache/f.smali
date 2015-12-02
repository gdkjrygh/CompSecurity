.class Lcom/facebook/ui/media/cache/f;
.super Ljava/lang/Object;
.source "DiskCache.java"

# interfaces
.implements Lcom/facebook/cache/t;


# annotations
.annotation build Lcom/google/common/annotations/VisibleForTesting;
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ui/media/cache/a;

.field private b:J


# direct methods
.method constructor <init>(Lcom/facebook/ui/media/cache/a;)V
    .locals 2

    .prologue
    .line 833
    iput-object p1, p0, Lcom/facebook/ui/media/cache/f;->a:Lcom/facebook/ui/media/cache/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 834
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/facebook/ui/media/cache/f;->b:J

    return-void
.end method


# virtual methods
.method public a(D)V
    .locals 6

    .prologue
    .line 853
    iget-object v0, p0, Lcom/facebook/ui/media/cache/f;->a:Lcom/facebook/ui/media/cache/a;

    invoke-static {v0}, Lcom/facebook/ui/media/cache/a;->e(Lcom/facebook/ui/media/cache/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 855
    :try_start_0
    iget-object v0, p0, Lcom/facebook/ui/media/cache/f;->a:Lcom/facebook/ui/media/cache/a;

    const-wide/16 v2, -0x1

    invoke-static {v0, v2, v3}, Lcom/facebook/ui/media/cache/a;->a(Lcom/facebook/ui/media/cache/a;J)J

    .line 856
    iget-object v0, p0, Lcom/facebook/ui/media/cache/f;->a:Lcom/facebook/ui/media/cache/a;

    invoke-static {v0}, Lcom/facebook/ui/media/cache/a;->f(Lcom/facebook/ui/media/cache/a;)V

    .line 857
    iget-object v0, p0, Lcom/facebook/ui/media/cache/f;->a:Lcom/facebook/ui/media/cache/a;

    invoke-static {v0}, Lcom/facebook/ui/media/cache/a;->c(Lcom/facebook/ui/media/cache/a;)J

    move-result-wide v2

    iget-object v0, p0, Lcom/facebook/ui/media/cache/f;->a:Lcom/facebook/ui/media/cache/a;

    invoke-static {v0}, Lcom/facebook/ui/media/cache/a;->c(Lcom/facebook/ui/media/cache/a;)J

    move-result-wide v4

    long-to-double v4, v4

    mul-double/2addr v4, p1

    double-to-long v4, v4

    sub-long/2addr v2, v4

    .line 858
    iget-object v0, p0, Lcom/facebook/ui/media/cache/f;->a:Lcom/facebook/ui/media/cache/a;

    invoke-static {v0, v2, v3}, Lcom/facebook/ui/media/cache/a;->b(Lcom/facebook/ui/media/cache/a;J)V

    .line 859
    monitor-exit v1

    .line 860
    return-void

    .line 859
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public b()Lcom/facebook/cache/l;
    .locals 1

    .prologue
    .line 838
    sget-object v0, Lcom/facebook/cache/l;->FILE:Lcom/facebook/cache/l;

    return-object v0
.end method

.method public c()J
    .locals 2

    .prologue
    .line 843
    iget-object v0, p0, Lcom/facebook/ui/media/cache/f;->a:Lcom/facebook/ui/media/cache/a;

    invoke-static {v0}, Lcom/facebook/ui/media/cache/a;->c(Lcom/facebook/ui/media/cache/a;)J

    move-result-wide v0

    return-wide v0
.end method

.method public d()J
    .locals 2

    .prologue
    .line 848
    iget-object v0, p0, Lcom/facebook/ui/media/cache/f;->a:Lcom/facebook/ui/media/cache/a;

    invoke-static {v0}, Lcom/facebook/ui/media/cache/a;->d(Lcom/facebook/ui/media/cache/a;)[Ljava/io/File;

    move-result-object v0

    array-length v0, v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 864
    const-string v0, "DiskCache.SyndicatedFileCache"

    return-object v0
.end method

.method public f()J
    .locals 2

    .prologue
    .line 869
    iget-wide v0, p0, Lcom/facebook/ui/media/cache/f;->b:J

    return-wide v0
.end method
