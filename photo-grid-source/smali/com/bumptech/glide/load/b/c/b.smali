.class public final Lcom/bumptech/glide/load/b/c/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# instance fields
.field a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    const/4 v0, 0x0

    iput v0, p0, Lcom/bumptech/glide/load/b/c/b;->a:I

    return-void
.end method


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 3

    .prologue
    .line 114
    new-instance v0, Lcom/bumptech/glide/load/b/c/c;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "fifo-pool-thread-"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/bumptech/glide/load/b/c/b;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Lcom/bumptech/glide/load/b/c/c;-><init>(Lcom/bumptech/glide/load/b/c/b;Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 121
    iget v1, p0, Lcom/bumptech/glide/load/b/c/b;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/bumptech/glide/load/b/c/b;->a:I

    .line 122
    return-object v0
.end method
