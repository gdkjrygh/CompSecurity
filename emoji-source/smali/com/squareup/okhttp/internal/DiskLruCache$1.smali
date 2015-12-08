.class Lcom/squareup/okhttp/internal/DiskLruCache$1;
.super Ljava/lang/Object;
.source "DiskLruCache.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/DiskLruCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

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
.field final synthetic this$0:Lcom/squareup/okhttp/internal/DiskLruCache;


# direct methods
.method constructor <init>(Lcom/squareup/okhttp/internal/DiskLruCache;)V
    .locals 0
    .param p1, "this$0"    # Lcom/squareup/okhttp/internal/DiskLruCache;

    .prologue
    .line 164
    iput-object p1, p0, Lcom/squareup/okhttp/internal/DiskLruCache$1;->this$0:Lcom/squareup/okhttp/internal/DiskLruCache;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 164
    invoke-virtual {p0}, Lcom/squareup/okhttp/internal/DiskLruCache$1;->call()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/lang/Void;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 166
    iget-object v1, p0, Lcom/squareup/okhttp/internal/DiskLruCache$1;->this$0:Lcom/squareup/okhttp/internal/DiskLruCache;

    monitor-enter v1

    .line 167
    :try_start_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache$1;->this$0:Lcom/squareup/okhttp/internal/DiskLruCache;

    # getter for: Lcom/squareup/okhttp/internal/DiskLruCache;->journalWriter:Ljava/io/Writer;
    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache;->access$000(Lcom/squareup/okhttp/internal/DiskLruCache;)Ljava/io/Writer;

    move-result-object v0

    if-nez v0, :cond_0

    .line 168
    monitor-exit v1

    .line 176
    :goto_0
    return-object v3

    .line 170
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache$1;->this$0:Lcom/squareup/okhttp/internal/DiskLruCache;

    # invokes: Lcom/squareup/okhttp/internal/DiskLruCache;->trimToSize()V
    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache;->access$100(Lcom/squareup/okhttp/internal/DiskLruCache;)V

    .line 171
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache$1;->this$0:Lcom/squareup/okhttp/internal/DiskLruCache;

    # invokes: Lcom/squareup/okhttp/internal/DiskLruCache;->journalRebuildRequired()Z
    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache;->access$200(Lcom/squareup/okhttp/internal/DiskLruCache;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 172
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache$1;->this$0:Lcom/squareup/okhttp/internal/DiskLruCache;

    # invokes: Lcom/squareup/okhttp/internal/DiskLruCache;->rebuildJournal()V
    invoke-static {v0}, Lcom/squareup/okhttp/internal/DiskLruCache;->access$300(Lcom/squareup/okhttp/internal/DiskLruCache;)V

    .line 173
    iget-object v0, p0, Lcom/squareup/okhttp/internal/DiskLruCache$1;->this$0:Lcom/squareup/okhttp/internal/DiskLruCache;

    const/4 v2, 0x0

    # setter for: Lcom/squareup/okhttp/internal/DiskLruCache;->redundantOpCount:I
    invoke-static {v0, v2}, Lcom/squareup/okhttp/internal/DiskLruCache;->access$402(Lcom/squareup/okhttp/internal/DiskLruCache;I)I

    .line 175
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
