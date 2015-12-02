.class Lcom/facebook/ui/media/cache/d;
.super Ljava/lang/Object;
.source "DiskCache.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Ljava/io/File;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ui/media/cache/a;


# direct methods
.method constructor <init>(Lcom/facebook/ui/media/cache/a;)V
    .locals 0

    .prologue
    .line 517
    iput-object p1, p0, Lcom/facebook/ui/media/cache/d;->a:Lcom/facebook/ui/media/cache/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;Ljava/io/File;)I
    .locals 8

    .prologue
    const-wide/16 v2, 0x0

    .line 526
    iget-object v0, p0, Lcom/facebook/ui/media/cache/d;->a:Lcom/facebook/ui/media/cache/a;

    invoke-static {v0}, Lcom/facebook/ui/media/cache/a;->b(Lcom/facebook/ui/media/cache/a;)Lcom/facebook/common/time/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v0

    const-wide/32 v4, 0x6ddd00

    add-long/2addr v4, v0

    .line 527
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    cmp-long v0, v0, v4

    if-gez v0, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    .line 529
    :goto_0
    invoke-virtual {p2}, Ljava/io/File;->lastModified()J

    move-result-wide v6

    cmp-long v4, v6, v4

    if-gez v4, :cond_0

    invoke-virtual {p2}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    .line 531
    :cond_0
    sub-long/2addr v0, v2

    const-wide/32 v2, 0x7fffffff

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    const-wide/32 v2, -0x80000000

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    return v0

    :cond_1
    move-wide v0, v2

    .line 527
    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 517
    check-cast p1, Ljava/io/File;

    check-cast p2, Ljava/io/File;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/ui/media/cache/d;->a(Ljava/io/File;Ljava/io/File;)I

    move-result v0

    return v0
.end method
