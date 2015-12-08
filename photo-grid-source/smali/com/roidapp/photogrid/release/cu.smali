.class final Lcom/roidapp/photogrid/release/cu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field a:Landroid/os/Handler;

.field final synthetic b:Lcom/roidapp/photogrid/release/cs;

.field private c:I

.field private d:I


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/cs;)V
    .locals 1

    .prologue
    .line 426
    iput-object p1, p0, Lcom/roidapp/photogrid/release/cu;->b:Lcom/roidapp/photogrid/release/cs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 427
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/cu;->c:I

    .line 428
    const v0, -0x985711

    iput v0, p0, Lcom/roidapp/photogrid/release/cu;->d:I

    .line 429
    new-instance v0, Lcom/roidapp/photogrid/release/cv;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/cv;-><init>(Lcom/roidapp/photogrid/release/cu;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/cu;->a:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/cu;)I
    .locals 1

    .prologue
    .line 426
    iget v0, p0, Lcom/roidapp/photogrid/release/cu;->d:I

    return v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/cu;I)I
    .locals 0

    .prologue
    .line 426
    iput p1, p0, Lcom/roidapp/photogrid/release/cu;->c:I

    return p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/cu;)I
    .locals 1

    .prologue
    .line 426
    iget v0, p0, Lcom/roidapp/photogrid/release/cu;->c:I

    return v0
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    .prologue
    .line 449
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 450
    packed-switch v0, :pswitch_data_0

    .line 457
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 452
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cu;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/cu;->a:Landroid/os/Handler;

    iget v2, p0, Lcom/roidapp/photogrid/release/cu;->d:I

    invoke-virtual {v1, v2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x5

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    .line 450
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
