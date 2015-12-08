.class final Lcom/mopub/common/a;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "[B>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/mopub/common/CacheService$DiskLruCacheGetListener;

.field private final b:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/mopub/common/CacheService$DiskLruCacheGetListener;)V
    .locals 0

    .prologue
    .line 185
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 186
    iput-object p2, p0, Lcom/mopub/common/a;->a:Lcom/mopub/common/CacheService$DiskLruCacheGetListener;

    .line 187
    iput-object p1, p0, Lcom/mopub/common/a;->b:Ljava/lang/String;

    .line 188
    return-void
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 181
    .line 2192
    iget-object v0, p0, Lcom/mopub/common/a;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/mopub/common/CacheService;->getFromDiskCache(Ljava/lang/String;)[B

    move-result-object v0

    .line 181
    return-object v0
.end method

.method protected final onCancelled()V
    .locals 3

    .prologue
    .line 209
    iget-object v0, p0, Lcom/mopub/common/a;->a:Lcom/mopub/common/CacheService$DiskLruCacheGetListener;

    if-eqz v0, :cond_0

    .line 210
    iget-object v0, p0, Lcom/mopub/common/a;->a:Lcom/mopub/common/CacheService$DiskLruCacheGetListener;

    iget-object v1, p0, Lcom/mopub/common/a;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/mopub/common/CacheService$DiskLruCacheGetListener;->onComplete(Ljava/lang/String;[B)V

    .line 212
    :cond_0
    return-void
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 181
    check-cast p1, [B

    .line 1197
    invoke-virtual {p0}, Lcom/mopub/common/a;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1198
    invoke-virtual {p0}, Lcom/mopub/common/a;->onCancelled()V

    .line 1199
    :cond_0
    :goto_0
    return-void

    .line 1202
    :cond_1
    iget-object v0, p0, Lcom/mopub/common/a;->a:Lcom/mopub/common/CacheService$DiskLruCacheGetListener;

    if-eqz v0, :cond_0

    .line 1203
    iget-object v0, p0, Lcom/mopub/common/a;->a:Lcom/mopub/common/CacheService$DiskLruCacheGetListener;

    iget-object v1, p0, Lcom/mopub/common/a;->b:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Lcom/mopub/common/CacheService$DiskLruCacheGetListener;->onComplete(Ljava/lang/String;[B)V

    goto :goto_0
.end method
