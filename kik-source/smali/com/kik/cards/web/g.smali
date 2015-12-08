.class final Lcom/kik/cards/web/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/kik/cards/web/f;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/f;)V
    .locals 0

    .prologue
    .line 473
    iput-object p1, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 477
    if-nez p2, :cond_1

    .line 478
    iget-object v0, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v0, v0, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    iget-object v0, v0, Lcom/kik/cards/web/CardsWebViewFragment;->c:Lcom/kik/android/a;

    const-string v1, "Browser Reload Tapped"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "URL"

    iget-object v2, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v2, v2, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v2}, Lcom/kik/cards/web/CardsWebViewFragment;->d(Lcom/kik/cards/web/CardsWebViewFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Domain"

    iget-object v2, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v2, v2, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v2}, Lcom/kik/cards/web/CardsWebViewFragment;->d(Lcom/kik/cards/web/CardsWebViewFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/kik/cards/web/bf;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Is Loaded"

    iget-object v2, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v2, v2, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v2}, Lcom/kik/cards/web/CardsWebViewFragment;->b(Lcom/kik/cards/web/CardsWebViewFragment;)Lcom/kik/cards/web/bd;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/cards/web/bd;->b()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 483
    iget-object v0, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v0, v0, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->l(Lcom/kik/cards/web/CardsWebViewFragment;)V

    .line 568
    :cond_0
    :goto_0
    return-void

    .line 485
    :cond_1
    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    .line 486
    iget-object v0, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v0, v0, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    iget-object v0, v0, Lcom/kik/cards/web/CardsWebViewFragment;->c:Lcom/kik/android/a;

    const-string v1, "Browser Share Tapped"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "URL"

    iget-object v2, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v2, v2, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v2}, Lcom/kik/cards/web/CardsWebViewFragment;->d(Lcom/kik/cards/web/CardsWebViewFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Domain"

    iget-object v2, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v2, v2, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v2}, Lcom/kik/cards/web/CardsWebViewFragment;->d(Lcom/kik/cards/web/CardsWebViewFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/kik/cards/web/bf;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 490
    iget-object v0, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v0, v0, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->e(Lcom/kik/cards/web/CardsWebViewFragment;)Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/cards/web/WebViewBrowserMetadataPlugin;->a()Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lcom/kik/cards/web/h;

    invoke-direct {v1, p0}, Lcom/kik/cards/web/h;-><init>(Lcom/kik/cards/web/g;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    goto :goto_0

    .line 534
    :cond_2
    const/4 v0, 0x2

    if-ne p2, v0, :cond_3

    .line 535
    iget-object v0, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v0, v0, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    iget-object v0, v0, Lcom/kik/cards/web/CardsWebViewFragment;->c:Lcom/kik/android/a;

    const-string v1, "Open In Browser Tapped"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "URL"

    iget-object v2, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v2, v2, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v2}, Lcom/kik/cards/web/CardsWebViewFragment;->d(Lcom/kik/cards/web/CardsWebViewFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Domain"

    iget-object v2, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v2, v2, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v2}, Lcom/kik/cards/web/CardsWebViewFragment;->d(Lcom/kik/cards/web/CardsWebViewFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/kik/cards/web/bf;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 539
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 541
    iget-object v1, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v1, v1, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v1}, Lcom/kik/cards/web/CardsWebViewFragment;->b(Lcom/kik/cards/web/CardsWebViewFragment;)Lcom/kik/cards/web/bd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kik/cards/web/bd;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 543
    iget-object v1, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v1, v1, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v1}, Lcom/kik/cards/web/CardsWebViewFragment;->a(Lcom/kik/cards/web/CardsWebViewFragment;)Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentActivity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 545
    :cond_3
    const/4 v0, 0x3

    if-ne p2, v0, :cond_5

    .line 546
    iget-object v0, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v0, v0, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    iget-object v0, v0, Lcom/kik/cards/web/CardsWebViewFragment;->c:Lcom/kik/android/a;

    const-string v1, "Copy Link URL Tapped"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "URL"

    iget-object v2, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v2, v2, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v2}, Lcom/kik/cards/web/CardsWebViewFragment;->d(Lcom/kik/cards/web/CardsWebViewFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Domain"

    iget-object v2, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v2, v2, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v2}, Lcom/kik/cards/web/CardsWebViewFragment;->d(Lcom/kik/cards/web/CardsWebViewFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/kik/cards/web/bf;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 550
    iget-object v0, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v0, v0, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->g()Ljava/lang/String;

    move-result-object v0

    .line 552
    if-eqz v0, :cond_4

    .line 553
    iget-object v1, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v1, v1, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v1}, Lcom/kik/cards/web/CardsWebViewFragment;->t()Landroid/content/Context;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2, v0}, Lcom/kik/m/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 555
    iget-object v0, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v0, v0, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f09014c

    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_0

    .line 558
    :cond_4
    iget-object v0, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v0, v0, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f090266

    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_0

    .line 561
    :cond_5
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    .line 562
    iget-object v0, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v0, v0, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->b(Lcom/kik/cards/web/CardsWebViewFragment;)Lcom/kik/cards/web/bd;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v0, v0, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    iget-object v0, v0, Lcom/kik/cards/web/CardsWebViewFragment;->t:Lkik/android/b/s;

    if-eqz v0, :cond_0

    .line 563
    iget-object v0, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v0, v0, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    iget-object v0, v0, Lcom/kik/cards/web/CardsWebViewFragment;->t:Lkik/android/b/s;

    iget-object v1, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v1, v1, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v1}, Lcom/kik/cards/web/CardsWebViewFragment;->b(Lcom/kik/cards/web/CardsWebViewFragment;)Lcom/kik/cards/web/bd;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kik/cards/web/bd;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/b/s;->f(Ljava/lang/String;)Lcom/kik/g/p;

    .line 564
    iget-object v0, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v0, v0, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->b(Lcom/kik/cards/web/CardsWebViewFragment;)Lcom/kik/cards/web/bd;

    move-result-object v0

    const-string v1, "javascript:window.localStorage.clear()"

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/aq;->loadUrl(Ljava/lang/String;)V

    .line 565
    iget-object v0, p0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v0, v0, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->l(Lcom/kik/cards/web/CardsWebViewFragment;)V

    goto/16 :goto_0
.end method
