.class Lcom/qihoo/security/lite/AppEnterActivity$2;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/lite/AppEnterActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/lite/AppEnterActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/lite/AppEnterActivity;)V
    .locals 0

    .prologue
    .line 302
    iput-object p1, p0, Lcom/qihoo/security/lite/AppEnterActivity$2;->a:Lcom/qihoo/security/lite/AppEnterActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 306
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 320
    :goto_0
    return-void

    .line 308
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity$2;->a:Lcom/qihoo/security/lite/AppEnterActivity;

    invoke-static {v0}, Lcom/qihoo/security/lite/AppEnterActivity;->b(Lcom/qihoo/security/lite/AppEnterActivity;)V

    goto :goto_0

    .line 311
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity$2;->a:Lcom/qihoo/security/lite/AppEnterActivity;

    invoke-static {v0}, Lcom/qihoo/security/lite/AppEnterActivity;->c(Lcom/qihoo/security/lite/AppEnterActivity;)V

    goto :goto_0

    .line 315
    :pswitch_2
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity$2;->a:Lcom/qihoo/security/lite/AppEnterActivity;

    invoke-static {v0}, Lcom/qihoo/security/lite/AppEnterActivity;->e(Lcom/qihoo/security/lite/AppEnterActivity;)Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/lite/AppEnterActivity$2;->a:Lcom/qihoo/security/lite/AppEnterActivity;

    invoke-static {v1}, Lcom/qihoo/security/lite/AppEnterActivity;->d(Lcom/qihoo/security/lite/AppEnterActivity;)Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 316
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity$2;->a:Lcom/qihoo/security/lite/AppEnterActivity;

    iget-object v1, p0, Lcom/qihoo/security/lite/AppEnterActivity$2;->a:Lcom/qihoo/security/lite/AppEnterActivity;

    invoke-static {v1}, Lcom/qihoo/security/lite/AppEnterActivity;->e(Lcom/qihoo/security/lite/AppEnterActivity;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/lite/AppEnterActivity;->startActivity(Landroid/content/Intent;)V

    .line 317
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity$2;->a:Lcom/qihoo/security/lite/AppEnterActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/lite/AppEnterActivity;->finish()V

    goto :goto_0

    .line 306
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
