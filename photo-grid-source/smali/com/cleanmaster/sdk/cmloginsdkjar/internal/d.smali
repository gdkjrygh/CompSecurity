.class final Lcom/cleanmaster/sdk/cmloginsdkjar/internal/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/io/FilenameFilter;

.field private static final b:Ljava/io/FilenameFilter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 303
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/e;

    invoke-direct {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/e;-><init>()V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/d;->a:Ljava/io/FilenameFilter;

    .line 309
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/f;

    invoke-direct {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/f;-><init>()V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/d;->b:Ljava/io/FilenameFilter;

    return-void
.end method

.method static a()Ljava/io/FilenameFilter;
    .locals 1

    .prologue
    .line 326
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/d;->a:Ljava/io/FilenameFilter;

    return-object v0
.end method

.method static a(Ljava/io/File;)V
    .locals 4

    .prologue
    .line 317
    .line 1330
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/d;->b:Ljava/io/FilenameFilter;

    .line 317
    invoke-virtual {p0, v0}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v1

    .line 318
    if-eqz v1, :cond_0

    .line 319
    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 320
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 319
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 323
    :cond_0
    return-void
.end method

.method static b(Ljava/io/File;)Ljava/io/File;
    .locals 4

    .prologue
    .line 334
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "buffer"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    # getter for: Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->bufferIndex:Ljava/util/concurrent/atomic/AtomicLong;
    invoke-static {}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->access$300()Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 335
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v1
.end method
