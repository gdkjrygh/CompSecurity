.class Lcom/qihoo/security/ui/main/HomeActivity$7;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/main/HomeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/main/HomeActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/HomeActivity;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 320
    iput-object p1, p0, Lcom/qihoo/security/ui/main/HomeActivity$7;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 324
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 347
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 335
    :pswitch_1
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/b;->a()V

    .line 337
    invoke-static {}, Lcom/qihoo/security/adv/a/a;->a()Lcom/qihoo/security/adv/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/adv/a/a;->b()V

    .line 338
    invoke-static {}, Lcom/qihoo/security/adv/a/a;->a()Lcom/qihoo/security/adv/a/a;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvType;->FaceBookAdvData:Lcom/qihoo/security/adv/AdvDataManager$AdvType;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/adv/a/a;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvType;)V

    .line 339
    invoke-static {}, Lcom/qihoo/security/appbox/core/d;->a()Lcom/qihoo/security/appbox/core/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/core/d;->b()Z

    move-result v0

    .line 342
    if-eqz v0, :cond_0

    .line 343
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$7;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/HomeActivity;->b(Lcom/qihoo/security/ui/main/HomeActivity;)V

    goto :goto_0

    .line 324
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
