.class Lcom/facebook/AsyncTask$InternalHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 668
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/AsyncTask$1;)V
    .locals 0

    .prologue
    .line 668
    invoke-direct {p0}, Lcom/facebook/AsyncTask$InternalHandler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 672
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/facebook/AsyncTask$AsyncTaskResult;

    .line 673
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    .line 682
    :goto_0
    return-void

    .line 676
    :pswitch_0
    iget-object v1, v0, Lcom/facebook/AsyncTask$AsyncTaskResult;->mTask:Lcom/facebook/AsyncTask;

    iget-object v0, v0, Lcom/facebook/AsyncTask$AsyncTaskResult;->mData:[Ljava/lang/Object;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    # invokes: Lcom/facebook/AsyncTask;->finish(Ljava/lang/Object;)V
    invoke-static {v1, v0}, Lcom/facebook/AsyncTask;->access$600(Lcom/facebook/AsyncTask;Ljava/lang/Object;)V

    goto :goto_0

    .line 679
    :pswitch_1
    iget-object v1, v0, Lcom/facebook/AsyncTask$AsyncTaskResult;->mTask:Lcom/facebook/AsyncTask;

    iget-object v0, v0, Lcom/facebook/AsyncTask$AsyncTaskResult;->mData:[Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lcom/facebook/AsyncTask;->onProgressUpdate([Ljava/lang/Object;)V

    goto :goto_0

    .line 673
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
