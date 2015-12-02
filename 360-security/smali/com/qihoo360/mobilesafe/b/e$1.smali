.class Lcom/qihoo360/mobilesafe/b/e$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/mobilesafe/b/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/b/e;


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/b/e;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/b/e$1;->a:Lcom/qihoo360/mobilesafe/b/e;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 63
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 70
    :goto_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/e$1;->a:Lcom/qihoo360/mobilesafe/b/e;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/e;->b(Lcom/qihoo360/mobilesafe/b/e;)I

    .line 71
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/e$1;->a:Lcom/qihoo360/mobilesafe/b/e;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/e;->c(Lcom/qihoo360/mobilesafe/b/e;)Lcom/qihoo360/mobilesafe/b/e$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 72
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/e$1;->a:Lcom/qihoo360/mobilesafe/b/e;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/e;->c(Lcom/qihoo360/mobilesafe/b/e;)Lcom/qihoo360/mobilesafe/b/e$a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/b/e$1;->a:Lcom/qihoo360/mobilesafe/b/e;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/b/e;->d(Lcom/qihoo360/mobilesafe/b/e;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/b/e$a;->setColor(I)V

    .line 74
    :cond_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/e$1;->a:Lcom/qihoo360/mobilesafe/b/e;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/e;->a(Lcom/qihoo360/mobilesafe/b/e;)I

    move-result v0

    const/16 v1, 0x14

    if-gt v0, v1, :cond_2

    .line 75
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/e$1;->a:Lcom/qihoo360/mobilesafe/b/e;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/b/e;->a:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 76
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/b/e$1;->a:Lcom/qihoo360/mobilesafe/b/e;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/b/e;->e(Lcom/qihoo360/mobilesafe/b/e;)I

    move-result v1

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 77
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/b/e$1;->a:Lcom/qihoo360/mobilesafe/b/e;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/b/e;->f(Lcom/qihoo360/mobilesafe/b/e;)I

    move-result v1

    iput v1, v0, Landroid/os/Message;->arg2:I

    .line 78
    iput v5, v0, Landroid/os/Message;->what:I

    .line 79
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/b/e$1;->a:Lcom/qihoo360/mobilesafe/b/e;

    iget-object v1, v1, Lcom/qihoo360/mobilesafe/b/e;->a:Landroid/os/Handler;

    const-wide/16 v2, 0x32

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 85
    :cond_1
    :goto_1
    return-void

    .line 65
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/e$1;->a:Lcom/qihoo360/mobilesafe/b/e;

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/b/e$1;->a:Lcom/qihoo360/mobilesafe/b/e;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/b/e;->a(Lcom/qihoo360/mobilesafe/b/e;)I

    move-result v1

    int-to-float v1, v1

    const v2, 0x3d4ccccd    # 0.05f

    mul-float/2addr v1, v2

    const/4 v2, 0x2

    new-array v2, v2, [I

    const/4 v3, 0x0

    iget v4, p1, Landroid/os/Message;->arg1:I

    aput v4, v2, v3

    iget v3, p1, Landroid/os/Message;->arg2:I

    aput v3, v2, v5

    invoke-static {v1, v2}, Lcom/qihoo360/mobilesafe/b/c;->a(F[I)I

    move-result v1

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/b/e;->a(Lcom/qihoo360/mobilesafe/b/e;I)I

    goto :goto_0

    .line 81
    :cond_2
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/e$1;->a:Lcom/qihoo360/mobilesafe/b/e;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/e;->c(Lcom/qihoo360/mobilesafe/b/e;)Lcom/qihoo360/mobilesafe/b/e$a;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 82
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/e$1;->a:Lcom/qihoo360/mobilesafe/b/e;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/e;->c(Lcom/qihoo360/mobilesafe/b/e;)Lcom/qihoo360/mobilesafe/b/e$a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/b/e$1;->a:Lcom/qihoo360/mobilesafe/b/e;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/b/e;->d(Lcom/qihoo360/mobilesafe/b/e;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/b/e$a;->a(I)V

    goto :goto_1

    .line 63
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
