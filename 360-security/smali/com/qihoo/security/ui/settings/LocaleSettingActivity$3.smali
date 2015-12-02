.class Lcom/qihoo/security/ui/settings/LocaleSettingActivity$3;
.super Lcom/qihoo/security/locale/b$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/settings/LocaleSettingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/settings/LocaleSettingActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/settings/LocaleSettingActivity;)V
    .locals 0

    .prologue
    .line 118
    iput-object p1, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$3;->a:Lcom/qihoo/security/ui/settings/LocaleSettingActivity;

    invoke-direct {p0}, Lcom/qihoo/security/locale/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 134
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$3;->a:Lcom/qihoo/security/ui/settings/LocaleSettingActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->c(Lcom/qihoo/security/ui/settings/LocaleSettingActivity;)Lcom/qihoo/security/service/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 135
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$3;->a:Lcom/qihoo/security/ui/settings/LocaleSettingActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->c(Lcom/qihoo/security/ui/settings/LocaleSettingActivity;)Lcom/qihoo/security/service/a;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/service/a;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 142
    :cond_0
    :goto_0
    return-void

    .line 137
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 149
    return-void
.end method

.method public a(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 129
    return-void
.end method

.method public b()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 153
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$3;->a:Lcom/qihoo/security/ui/settings/LocaleSettingActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->b(Lcom/qihoo/security/ui/settings/LocaleSettingActivity;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 154
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$3;->a:Lcom/qihoo/security/ui/settings/LocaleSettingActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->b(Lcom/qihoo/security/ui/settings/LocaleSettingActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 156
    :cond_0
    return-void
.end method

.method public c()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 121
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$3;->a:Lcom/qihoo/security/ui/settings/LocaleSettingActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->b(Lcom/qihoo/security/ui/settings/LocaleSettingActivity;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 122
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$3;->a:Lcom/qihoo/security/ui/settings/LocaleSettingActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->b(Lcom/qihoo/security/ui/settings/LocaleSettingActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 124
    :cond_0
    return-void
.end method

.method public d()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 160
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$3;->a:Lcom/qihoo/security/ui/settings/LocaleSettingActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->b(Lcom/qihoo/security/ui/settings/LocaleSettingActivity;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 161
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$3;->a:Lcom/qihoo/security/ui/settings/LocaleSettingActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->b(Lcom/qihoo/security/ui/settings/LocaleSettingActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 163
    :cond_0
    return-void
.end method
