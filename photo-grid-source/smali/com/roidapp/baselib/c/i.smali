.class final Lcom/roidapp/baselib/c/i;
.super Landroid/os/Handler;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 667
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 667
    invoke-direct {p0}, Lcom/roidapp/baselib/c/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 671
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/roidapp/baselib/c/h;

    .line 672
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    .line 681
    :goto_0
    return-void

    .line 675
    :pswitch_0
    iget-object v1, v0, Lcom/roidapp/baselib/c/h;->a:Lcom/roidapp/baselib/c/c;

    iget-object v0, v0, Lcom/roidapp/baselib/c/h;->b:[Ljava/lang/Object;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    # invokes: Lcom/roidapp/baselib/c/c;->finish(Ljava/lang/Object;)V
    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/c;->access$600(Lcom/roidapp/baselib/c/c;Ljava/lang/Object;)V

    goto :goto_0

    .line 678
    :pswitch_1
    iget-object v1, v0, Lcom/roidapp/baselib/c/h;->a:Lcom/roidapp/baselib/c/c;

    iget-object v0, v0, Lcom/roidapp/baselib/c/h;->b:[Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lcom/roidapp/baselib/c/c;->onProgressUpdate([Ljava/lang/Object;)V

    goto :goto_0

    .line 672
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
