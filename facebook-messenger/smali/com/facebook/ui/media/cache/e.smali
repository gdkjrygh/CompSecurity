.class Lcom/facebook/ui/media/cache/e;
.super Ljava/lang/Object;
.source "DiskCache.java"

# interfaces
.implements Lcom/google/common/b/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/b/i",
        "<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/io/InputStream;

.field private b:Z


# direct methods
.method private constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    .prologue
    .line 319
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 320
    iput-object p1, p0, Lcom/facebook/ui/media/cache/e;->a:Ljava/io/InputStream;

    .line 321
    return-void
.end method

.method synthetic constructor <init>(Ljava/io/InputStream;Lcom/facebook/ui/media/cache/b;)V
    .locals 0

    .prologue
    .line 314
    invoke-direct {p0, p1}, Lcom/facebook/ui/media/cache/e;-><init>(Ljava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public declared-synchronized a()Ljava/io/InputStream;
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 325
    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lcom/facebook/ui/media/cache/e;->b:Z

    if-nez v1, :cond_0

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 326
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/ui/media/cache/e;->b:Z

    .line 327
    iget-object v0, p0, Lcom/facebook/ui/media/cache/e;->a:Ljava/io/InputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 325
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 314
    invoke-virtual {p0}, Lcom/facebook/ui/media/cache/e;->a()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method
