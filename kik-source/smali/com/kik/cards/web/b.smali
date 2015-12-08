.class final Lcom/kik/cards/web/b;
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
    .line 414
    iput-object p1, p0, Lcom/kik/cards/web/b;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 419
    iget-object v0, p0, Lcom/kik/cards/web/b;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    iget-object v0, v0, Lcom/kik/cards/web/CardsWebViewFragment;->c:Lcom/kik/android/a;

    if-eqz v0, :cond_0

    .line 420
    iget-object v0, p0, Lcom/kik/cards/web/b;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    iget-object v0, v0, Lcom/kik/cards/web/CardsWebViewFragment;->c:Lcom/kik/android/a;

    const-string v1, "Browser Screen Closed"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Reason"

    const-string v2, "Explicit"

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    .line 422
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/b;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->k(Lcom/kik/cards/web/CardsWebViewFragment;)V

    .line 423
    return-void
.end method
