.class Lcom/qihoo/security/ui/main/HomeActivity$1;
.super Landroid/content/BroadcastReceiver;
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
.method constructor <init>(Lcom/qihoo/security/ui/main/HomeActivity;)V
    .locals 0

    .prologue
    .line 187
    iput-object p1, p0, Lcom/qihoo/security/ui/main/HomeActivity$1;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 191
    if-nez p2, :cond_1

    .line 214
    :cond_0
    :goto_0
    return-void

    .line 195
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 196
    const-string/jumbo v1, "com.qihoo.security.FINISH_MAIN_SCREEN"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 197
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$1;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/main/HomeActivity;->finish()V

    goto :goto_0

    .line 198
    :cond_2
    const-string/jumbo v1, "com.qihoo.security.REBOOT_MAIN_SCREEN"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 202
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$1;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/main/HomeActivity;->finish()V

    .line 203
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$1;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/qihoo/security/ui/main/HomeActivity$1;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    const-class v3, Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/main/HomeActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 204
    :cond_3
    const-string/jumbo v1, "com.qihoo.security.RESET_MAIN_SCREEN"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 208
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$1;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    sget-object v1, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->RESULT_ACTION_FINISH:Lcom/qihoo/security/ui/fragment/utils/FragmentAction;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/ui/main/HomeActivity;->a(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V

    goto :goto_0

    .line 209
    :cond_4
    const-string/jumbo v1, "com.qihoo.security.v5.APPVersionRedPointHelper.HasNewVersion"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 210
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$1;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/HomeActivity;->a(Lcom/qihoo/security/ui/main/HomeActivity;)V

    goto :goto_0

    .line 211
    :cond_5
    const-string/jumbo v1, "com.qihoo.security.v5.APPVersionRedPointHelper.ClickedReadPoint"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 212
    iget-object v0, p0, Lcom/qihoo/security/ui/main/HomeActivity$1;->a:Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/HomeActivity;->a(Lcom/qihoo/security/ui/main/HomeActivity;)V

    goto :goto_0
.end method
