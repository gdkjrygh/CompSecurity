.class Lcom/facebook/AsyncTask$2;
.super Lcom/facebook/AsyncTask$WorkerRunnable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/AsyncTask$WorkerRunnable",
        "<TParams;TResult;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/AsyncTask;


# direct methods
.method constructor <init>(Lcom/facebook/AsyncTask;)V
    .locals 1

    .prologue
    .line 313
    iput-object p1, p0, Lcom/facebook/AsyncTask$2;->this$0:Lcom/facebook/AsyncTask;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/AsyncTask$WorkerRunnable;-><init>(Lcom/facebook/AsyncTask$1;)V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResult;"
        }
    .end annotation

    .prologue
    .line 315
    iget-object v0, p0, Lcom/facebook/AsyncTask$2;->this$0:Lcom/facebook/AsyncTask;

    # getter for: Lcom/facebook/AsyncTask;->mTaskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;
    invoke-static {v0}, Lcom/facebook/AsyncTask;->access$300(Lcom/facebook/AsyncTask;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 317
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 319
    iget-object v0, p0, Lcom/facebook/AsyncTask$2;->this$0:Lcom/facebook/AsyncTask;

    iget-object v1, p0, Lcom/facebook/AsyncTask$2;->this$0:Lcom/facebook/AsyncTask;

    iget-object v2, p0, Lcom/facebook/AsyncTask$2;->mParams:[Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/facebook/AsyncTask;->doInBackground([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    # invokes: Lcom/facebook/AsyncTask;->postResult(Ljava/lang/Object;)Ljava/lang/Object;
    invoke-static {v0, v1}, Lcom/facebook/AsyncTask;->access$400(Lcom/facebook/AsyncTask;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
