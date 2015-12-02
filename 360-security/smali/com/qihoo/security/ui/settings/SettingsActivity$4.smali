.class Lcom/qihoo/security/ui/settings/SettingsActivity$4;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/settings/SettingsActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/settings/SettingsActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/settings/SettingsActivity;)V
    .locals 0

    .prologue
    .line 717
    iput-object p1, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$4;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 720
    if-nez p2, :cond_1

    .line 733
    :cond_0
    :goto_0
    return-void

    .line 723
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 724
    const-string/jumbo v1, "com.qihoo.security.FINISH_MAIN_SCREEN"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string/jumbo v1, "com.qihoo.security.REBOOT_MAIN_SCREEN"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 726
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$4;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->finish()V

    goto :goto_0

    .line 727
    :cond_3
    const-string/jumbo v1, "com.qihoo.security.v5.APPVersionRedPointHelper.HasNewVersion"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 728
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$4;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->k(Lcom/qihoo/security/ui/settings/SettingsActivity;)V

    goto :goto_0

    .line 730
    :cond_4
    const-string/jumbo v1, "com.qihoo.security.v5.APPVersionRedPointHelper.ClickedReadPoint"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 731
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/SettingsActivity$4;->a:Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/SettingsActivity;->k(Lcom/qihoo/security/ui/settings/SettingsActivity;)V

    goto :goto_0
.end method
