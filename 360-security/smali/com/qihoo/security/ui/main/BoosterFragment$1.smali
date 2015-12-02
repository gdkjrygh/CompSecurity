.class Lcom/qihoo/security/ui/main/BoosterFragment$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/main/BoosterFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/main/BoosterFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V
    .locals 0

    .prologue
    .line 217
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$1;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 220
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$1;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 242
    :goto_0
    return-void

    .line 226
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 232
    :pswitch_0
    const/4 v0, 0x1

    const-wide/32 v2, 0xea60

    invoke-virtual {p0, v0, v2, v3}, Lcom/qihoo/security/ui/main/BoosterFragment$1;->sendEmptyMessageDelayed(IJ)Z

    .line 233
    const/16 v0, 0x2afa

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 236
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$1;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment;Z)Z

    .line 237
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$1;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Z)V

    goto :goto_0

    .line 226
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
