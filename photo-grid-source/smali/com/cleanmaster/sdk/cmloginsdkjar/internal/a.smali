.class final Lcom/cleanmaster/sdk/cmloginsdkjar/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cleanmaster/sdk/cmloginsdkjar/internal/j;


# instance fields
.field final synthetic a:J

.field final synthetic b:Ljava/io/File;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;


# direct methods
.method constructor <init>(Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;JLjava/io/File;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 166
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/a;->d:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;

    iput-wide p2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/a;->a:J

    iput-object p4, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/a;->b:Ljava/io/File;

    iput-object p5, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/a;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 171
    iget-wide v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/a;->a:J

    iget-object v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/a;->d:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;

    # getter for: Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->lastClearCacheTime:Ljava/util/concurrent/atomic/AtomicLong;
    invoke-static {v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->access$000(Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;)Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 172
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/a;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 176
    :goto_0
    return-void

    .line 174
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/a;->d:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;

    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/a;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/a;->b:Ljava/io/File;

    # invokes: Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->renameToTargetAndTrim(Ljava/lang/String;Ljava/io/File;)V
    invoke-static {v0, v1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->access$100(Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;Ljava/lang/String;Ljava/io/File;)V

    goto :goto_0
.end method
