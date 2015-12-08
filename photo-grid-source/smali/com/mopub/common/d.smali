.class final Lcom/mopub/common/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/mopub/common/DiskLruCache;


# direct methods
.method constructor <init>(Lcom/mopub/common/DiskLruCache;)V
    .locals 0

    .prologue
    .line 166
    iput-object p1, p0, Lcom/mopub/common/d;->a:Lcom/mopub/common/DiskLruCache;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 166
    invoke-virtual {p0}, Lcom/mopub/common/d;->call()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public final call()Ljava/lang/Void;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 168
    iget-object v1, p0, Lcom/mopub/common/d;->a:Lcom/mopub/common/DiskLruCache;

    monitor-enter v1

    .line 169
    :try_start_0
    iget-object v0, p0, Lcom/mopub/common/d;->a:Lcom/mopub/common/DiskLruCache;

    invoke-static {v0}, Lcom/mopub/common/DiskLruCache;->a(Lcom/mopub/common/DiskLruCache;)Ljava/io/Writer;

    move-result-object v0

    if-nez v0, :cond_0

    .line 170
    monitor-exit v1

    .line 178
    :goto_0
    return-object v2

    .line 172
    :cond_0
    iget-object v0, p0, Lcom/mopub/common/d;->a:Lcom/mopub/common/DiskLruCache;

    invoke-static {v0}, Lcom/mopub/common/DiskLruCache;->b(Lcom/mopub/common/DiskLruCache;)V

    .line 173
    iget-object v0, p0, Lcom/mopub/common/d;->a:Lcom/mopub/common/DiskLruCache;

    invoke-static {v0}, Lcom/mopub/common/DiskLruCache;->c(Lcom/mopub/common/DiskLruCache;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 174
    iget-object v0, p0, Lcom/mopub/common/d;->a:Lcom/mopub/common/DiskLruCache;

    invoke-static {v0}, Lcom/mopub/common/DiskLruCache;->d(Lcom/mopub/common/DiskLruCache;)V

    .line 175
    iget-object v0, p0, Lcom/mopub/common/d;->a:Lcom/mopub/common/DiskLruCache;

    invoke-static {v0}, Lcom/mopub/common/DiskLruCache;->e(Lcom/mopub/common/DiskLruCache;)I

    .line 177
    :cond_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
