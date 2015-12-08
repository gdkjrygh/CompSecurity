.class public final Lcom/bumptech/glide/i/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Lcom/bumptech/glide/i/a;


# instance fields
.field private final a:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<[B>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 19
    new-instance v0, Lcom/bumptech/glide/i/a;

    invoke-direct {v0}, Lcom/bumptech/glide/i/a;-><init>()V

    sput-object v0, Lcom/bumptech/glide/i/a;->b:Lcom/bumptech/glide/i/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/bumptech/glide/i/h;->a(I)Ljava/util/Queue;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/i/a;->a:Ljava/util/Queue;

    .line 28
    return-void
.end method

.method public static a()Lcom/bumptech/glide/i/a;
    .locals 1

    .prologue
    .line 25
    sget-object v0, Lcom/bumptech/glide/i/a;->b:Lcom/bumptech/glide/i/a;

    return-object v0
.end method


# virtual methods
.method public final a([B)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 64
    array-length v1, p1

    const/high16 v2, 0x10000

    if-eq v1, v2, :cond_0

    .line 75
    :goto_0
    return v0

    .line 69
    :cond_0
    iget-object v1, p0, Lcom/bumptech/glide/i/a;->a:Ljava/util/Queue;

    monitor-enter v1

    .line 70
    :try_start_0
    iget-object v2, p0, Lcom/bumptech/glide/i/a;->a:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Queue;->size()I

    move-result v2

    const/16 v3, 0x20

    if-ge v2, v3, :cond_1

    .line 71
    const/4 v0, 0x1

    .line 72
    iget-object v2, p0, Lcom/bumptech/glide/i/a;->a:Ljava/util/Queue;

    invoke-interface {v2, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    .line 74
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

.method public final b()[B
    .locals 3

    .prologue
    .line 45
    iget-object v1, p0, Lcom/bumptech/glide/i/a;->a:Ljava/util/Queue;

    monitor-enter v1

    .line 46
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/i/a;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 47
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    if-nez v0, :cond_0

    .line 49
    const/high16 v0, 0x10000

    new-array v0, v0, [B

    .line 50
    const-string v1, "ByteArrayPool"

    const/4 v2, 0x3

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 54
    :cond_0
    return-object v0

    .line 47
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
