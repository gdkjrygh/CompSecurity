.class final Lcom/roidapp/baselib/b/c;
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
.field final synthetic a:Lcom/roidapp/baselib/b/b;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/b/b;)V
    .locals 0

    .prologue
    .line 274
    iput-object p1, p0, Lcom/roidapp/baselib/b/c;->a:Lcom/roidapp/baselib/b/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a()Ljava/lang/Void;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 276
    iget-object v1, p0, Lcom/roidapp/baselib/b/c;->a:Lcom/roidapp/baselib/b/b;

    monitor-enter v1

    .line 277
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/baselib/b/c;->a:Lcom/roidapp/baselib/b/b;

    invoke-static {v0}, Lcom/roidapp/baselib/b/b;->a(Lcom/roidapp/baselib/b/b;)Ljava/io/Writer;

    move-result-object v0

    if-nez v0, :cond_0

    .line 278
    monitor-exit v1

    .line 286
    :goto_0
    return-object v2

    .line 280
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/b/c;->a:Lcom/roidapp/baselib/b/b;

    invoke-static {v0}, Lcom/roidapp/baselib/b/b;->b(Lcom/roidapp/baselib/b/b;)V

    .line 281
    iget-object v0, p0, Lcom/roidapp/baselib/b/c;->a:Lcom/roidapp/baselib/b/b;

    invoke-static {v0}, Lcom/roidapp/baselib/b/b;->c(Lcom/roidapp/baselib/b/b;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 282
    iget-object v0, p0, Lcom/roidapp/baselib/b/c;->a:Lcom/roidapp/baselib/b/b;

    invoke-static {v0}, Lcom/roidapp/baselib/b/b;->d(Lcom/roidapp/baselib/b/b;)V

    .line 283
    iget-object v0, p0, Lcom/roidapp/baselib/b/c;->a:Lcom/roidapp/baselib/b/b;

    invoke-static {v0}, Lcom/roidapp/baselib/b/b;->e(Lcom/roidapp/baselib/b/b;)I

    .line 285
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


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 274
    invoke-direct {p0}, Lcom/roidapp/baselib/b/c;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
