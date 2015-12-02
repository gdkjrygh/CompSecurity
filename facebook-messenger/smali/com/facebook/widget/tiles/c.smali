.class public Lcom/facebook/widget/tiles/c;
.super Ljava/lang/Object;
.source "DefaultTilesCache.java"


# instance fields
.field private final a:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap",
            "<",
            "Lcom/facebook/widget/tiles/d;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    new-instance v0, Lcom/google/common/a/hy;

    invoke-direct {v0}, Lcom/google/common/a/hy;-><init>()V

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Lcom/google/common/a/hy;->a(I)Lcom/google/common/a/hy;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/google/common/a/hy;->c(I)Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->i()Lcom/google/common/a/hy;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/hy;->n()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/tiles/c;->a:Ljava/util/concurrent/ConcurrentMap;

    .line 63
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/widget/tiles/d;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/facebook/widget/tiles/c;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public a(Lcom/facebook/widget/tiles/d;Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/widget/tiles/c;->a:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    return-void
.end method
