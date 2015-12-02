.class public Lcom/qihoo/security/appbox/ui/AppBoxShortcutActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 40
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 42
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/AppBoxShortcutActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 43
    const-string/jumbo v1, "from"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/b/h;->a(Landroid/content/Intent;Ljava/lang/String;I)I

    move-result v0

    .line 45
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/qihoo/security/appbox/ui/AppBoxShortcutActivity;->p:Landroid/content/Context;

    const-class v3, Lcom/qihoo/security/appbox/ui/AppBoxActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 46
    const-string/jumbo v2, "com.qihoo.security.lite.ACTION_APPBOX_SHORTCUT"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 47
    const-string/jumbo v2, "android.intent.category.LAUNCHER"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 48
    const/high16 v2, 0x200000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 49
    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 50
    const-string/jumbo v2, "from"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 51
    invoke-virtual {p0, v1}, Lcom/qihoo/security/appbox/ui/AppBoxShortcutActivity;->startActivity(Landroid/content/Intent;)V

    .line 52
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/AppBoxShortcutActivity;->finish()V

    .line 53
    return-void
.end method
