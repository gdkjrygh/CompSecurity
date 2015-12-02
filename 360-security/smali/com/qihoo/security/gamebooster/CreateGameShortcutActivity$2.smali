.class Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)V
    .locals 0

    .prologue
    .line 80
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$2;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 84
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 108
    :cond_0
    :goto_0
    return-void

    .line 87
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$2;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->b(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)I

    .line 88
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$2;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->c(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 89
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$2;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->e(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$2;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->d(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)Lcom/qihoo/security/locale/d;

    move-result-object v1

    const v2, 0x7f0c008b

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$2;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->f(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$2;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->d(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)Lcom/qihoo/security/locale/d;

    move-result-object v1

    const v2, 0x7f0c008c

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$2;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->g(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)Lcom/qihoo/security/locale/widget/LocaleButton;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$2;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->d(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)Lcom/qihoo/security/locale/d;

    move-result-object v1

    const v2, 0x7f0c008d

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleButton;->setText(Ljava/lang/CharSequence;)V

    .line 92
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$2;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->h(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 93
    const/16 v0, 0x2b5e

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 94
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$2;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->a()V

    goto :goto_0

    .line 95
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$2;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->c(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 96
    const/16 v0, 0x2b5f

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 98
    invoke-static {}, Lcom/qihoo/security/gamebooster/b;->a()Lcom/qihoo/security/gamebooster/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/b;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$2;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->i(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 99
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$2;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    const-class v2, Lcom/qihoo/security/gamebooster/GameBoosterActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 100
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$2;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    invoke-virtual {v1}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string/jumbo v2, "pkg_name"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 101
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 102
    const/high16 v1, 0x200000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 103
    const-string/jumbo v1, "pkg_name"

    iget-object v2, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$2;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    invoke-static {v2}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->i(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 104
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$2;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->startActivity(Landroid/content/Intent;)V

    .line 106
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$2;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->finish()V

    goto/16 :goto_0
.end method
