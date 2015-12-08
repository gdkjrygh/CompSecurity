.class final Lcom/kik/cards/web/ab;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/cards/web/CardsWebViewFragment;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/CardsWebViewFragment;)V
    .locals 0

    .prologue
    .line 1748
    iput-object p1, p0, Lcom/kik/cards/web/ab;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 1752
    iget-object v0, p0, Lcom/kik/cards/web/ab;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->u()V

    .line 1753
    iget-object v0, p0, Lcom/kik/cards/web/ab;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->b(Lcom/kik/cards/web/CardsWebViewFragment;)Lcom/kik/cards/web/bd;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1754
    iget-object v0, p0, Lcom/kik/cards/web/ab;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->b(Lcom/kik/cards/web/CardsWebViewFragment;)Lcom/kik/cards/web/bd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/cards/web/bd;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 1756
    :try_start_0
    iget-object v1, p0, Lcom/kik/cards/web/ab;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v1, v2}, Lcom/kik/cards/web/CardsWebViewFragment;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1762
    :cond_0
    :goto_0
    return-void

    .line 1759
    :catch_0
    move-exception v0

    invoke-static {}, Lcom/kik/cards/web/CardsWebViewFragment;->z()Lorg/c/b;

    move-result-object v0

    const-string v1, "No activity found to handle fullscreen"

    invoke-interface {v0, v1}, Lorg/c/b;->b(Ljava/lang/String;)V

    goto :goto_0
.end method
