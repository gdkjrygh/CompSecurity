.class final Lcom/kik/cards/web/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/kik/cards/web/CardsWebViewFragment;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/CardsWebViewFragment;)V
    .locals 0

    .prologue
    .line 867
    iput-object p1, p0, Lcom/kik/cards/web/t;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 871
    iget-object v0, p0, Lcom/kik/cards/web/t;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    iget-object v3, p0, Lcom/kik/cards/web/t;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v3}, Lcom/kik/cards/web/CardsWebViewFragment;->s(Lcom/kik/cards/web/CardsWebViewFragment;)Lkik/android/util/cv$c;

    move-result-object v3

    invoke-virtual {v3}, Lkik/android/util/cv$c;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/CardsWebViewFragment;->startActivity(Landroid/content/Intent;)V

    .line 872
    return-void
.end method
