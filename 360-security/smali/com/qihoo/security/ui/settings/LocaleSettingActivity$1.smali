.class Lcom/qihoo/security/ui/settings/LocaleSettingActivity$1;
.super Landroid/os/Handler;
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
    .line 53
    iput-object p1, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$1;->a:Lcom/qihoo/security/ui/settings/LocaleSettingActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 57
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 58
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 70
    :cond_0
    :goto_0
    return-void

    .line 63
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$1;->a:Lcom/qihoo/security/ui/settings/LocaleSettingActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->a(Lcom/qihoo/security/ui/settings/LocaleSettingActivity;)Lcom/qihoo/security/ui/settings/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 64
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$1;->a:Lcom/qihoo/security/ui/settings/LocaleSettingActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->a(Lcom/qihoo/security/ui/settings/LocaleSettingActivity;)Lcom/qihoo/security/ui/settings/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/settings/a;->a()V

    goto :goto_0

    .line 58
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
