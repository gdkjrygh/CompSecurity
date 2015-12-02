.class public Lcom/qihoo/security/locale/LanguageFragment;
.super Lcom/qihoo/security/ui/fragment/BaseFragment;
.source "360Security"


# instance fields
.field protected a:Ljava/lang/String;

.field public final b:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/qihoo/security/ui/fragment/BaseFragment;-><init>()V

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/locale/LanguageFragment;->a:Ljava/lang/String;

    .line 52
    new-instance v0, Lcom/qihoo/security/locale/LanguageFragment$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/locale/LanguageFragment$1;-><init>(Lcom/qihoo/security/locale/LanguageFragment;)V

    iput-object v0, p0, Lcom/qihoo/security/locale/LanguageFragment;->b:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method protected a_(Landroid/os/Message;)V
    .locals 3

    .prologue
    .line 61
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 73
    :cond_0
    :goto_0
    return-void

    .line 63
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/locale/LanguageFragment;->d:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/g;->a(Landroid/content/Context;)Landroid/support/v4/content/g;

    move-result-object v0

    .line 64
    new-instance v1, Landroid/content/Intent;

    const-string/jumbo v2, "com.qihoo.security.REBOOT_MAIN_SCREEN"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/content/g;->a(Landroid/content/Intent;)Z

    .line 65
    invoke-virtual {p0}, Lcom/qihoo/security/locale/LanguageFragment;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    invoke-virtual {p0}, Lcom/qihoo/security/locale/LanguageFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    goto :goto_0

    .line 61
    nop

    :pswitch_data_0
    .packed-switch 0x3ea
        :pswitch_0
    .end packed-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 32
    invoke-super {p0, p1}, Lcom/qihoo/security/ui/fragment/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 34
    return-void
.end method

.method public onStart()V
    .locals 0

    .prologue
    .line 38
    invoke-super {p0}, Lcom/qihoo/security/ui/fragment/BaseFragment;->onStart()V

    .line 42
    return-void
.end method

.method public onStop()V
    .locals 0

    .prologue
    .line 46
    invoke-super {p0}, Lcom/qihoo/security/ui/fragment/BaseFragment;->onStop()V

    .line 50
    return-void
.end method
