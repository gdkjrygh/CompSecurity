.class final Lcom/cleanmaster/ui/app/market/loader/g;
.super Landroid/os/Handler;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 580
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 580
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/loader/g;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 584
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/cleanmaster/ui/app/market/loader/f;

    .line 585
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    .line 594
    :goto_0
    return-void

    .line 588
    :pswitch_0
    iget-object v1, v0, Lcom/cleanmaster/ui/app/market/loader/f;->a:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    iget-object v0, v0, Lcom/cleanmaster/ui/app/market/loader/f;->b:[Ljava/lang/Object;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    invoke-static {v1, v0}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->c(Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;Ljava/lang/Object;)V

    goto :goto_0

    .line 591
    :pswitch_1
    iget-object v1, v0, Lcom/cleanmaster/ui/app/market/loader/f;->a:Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;

    iget-object v0, v0, Lcom/cleanmaster/ui/app/market/loader/f;->b:[Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lcom/cleanmaster/ui/app/market/loader/AsyncTaskEx;->b([Ljava/lang/Object;)V

    goto :goto_0

    .line 585
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
