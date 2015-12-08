.class final Lcom/roidapp/baselib/c/e;
.super Lcom/roidapp/baselib/c/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/m",
        "<TParams;TResult;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/c/c;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/c/c;)V
    .locals 1

    .prologue
    .line 312
    iput-object p1, p0, Lcom/roidapp/baselib/c/e;->a:Lcom/roidapp/baselib/c/c;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/baselib/c/m;-><init>(B)V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResult;"
        }
    .end annotation

    .prologue
    .line 314
    iget-object v0, p0, Lcom/roidapp/baselib/c/e;->a:Lcom/roidapp/baselib/c/c;

    # getter for: Lcom/roidapp/baselib/c/c;->mTaskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;
    invoke-static {v0}, Lcom/roidapp/baselib/c/c;->access$300(Lcom/roidapp/baselib/c/c;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 316
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 318
    iget-object v0, p0, Lcom/roidapp/baselib/c/e;->a:Lcom/roidapp/baselib/c/c;

    iget-object v1, p0, Lcom/roidapp/baselib/c/e;->a:Lcom/roidapp/baselib/c/c;

    iget-object v2, p0, Lcom/roidapp/baselib/c/e;->b:[Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/roidapp/baselib/c/c;->doInBackground([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    # invokes: Lcom/roidapp/baselib/c/c;->postResult(Ljava/lang/Object;)Ljava/lang/Object;
    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/c;->access$400(Lcom/roidapp/baselib/c/c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
