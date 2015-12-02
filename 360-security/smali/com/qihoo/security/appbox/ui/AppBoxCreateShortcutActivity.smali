.class public Lcom/qihoo/security/appbox/ui/AppBoxCreateShortcutActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 21
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 24
    const-string/jumbo v0, "android.intent.action.CREATE_SHORTCUT"

    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/AppBoxCreateShortcutActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    invoke-static {}, Lcom/qihoo/security/app/e;->b()V

    .line 26
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/AppBoxCreateShortcutActivity;->finish()V

    .line 41
    :goto_0
    return-void

    .line 28
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/AppBoxCreateShortcutActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 29
    const-string/jumbo v1, "from"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/b/h;->a(Landroid/content/Intent;Ljava/lang/String;I)I

    move-result v0

    .line 31
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/qihoo/security/appbox/ui/AppBoxCreateShortcutActivity;->p:Landroid/content/Context;

    const-class v3, Lcom/qihoo/security/lite/AppEnterActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 32
    const-string/jumbo v2, "android.intent.action.MAIN"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 33
    const-string/jumbo v2, "android.intent.category.LAUNCHER"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 34
    const/high16 v2, 0x200000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 35
    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 36
    const-string/jumbo v2, "from"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 37
    invoke-virtual {p0, v1}, Lcom/qihoo/security/appbox/ui/AppBoxCreateShortcutActivity;->startActivity(Landroid/content/Intent;)V

    .line 38
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/AppBoxCreateShortcutActivity;->finish()V

    goto :goto_0
.end method
