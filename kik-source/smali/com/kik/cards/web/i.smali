.class final Lcom/kik/cards/web/i;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/h;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/h;)V
    .locals 0

    .prologue
    .line 505
    iput-object p1, p0, Lcom/kik/cards/web/i;->a:Lcom/kik/cards/web/h;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 517
    invoke-super {p0}, Lcom/kik/g/r;->a()V

    .line 518
    iget-object v0, p0, Lcom/kik/cards/web/i;->a:Lcom/kik/cards/web/h;

    iget-object v0, v0, Lcom/kik/cards/web/h;->a:Lcom/kik/cards/web/g;

    iget-object v0, v0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v0, v0, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->J()V

    .line 519
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 505
    check-cast p1, Lkik/a/d/a/a;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lkik/android/f/a/f;->a(Lkik/a/d/a/a;Z[B)V

    iget-object v0, p0, Lcom/kik/cards/web/i;->a:Lcom/kik/cards/web/h;

    iget-object v0, v0, Lcom/kik/cards/web/h;->a:Lcom/kik/cards/web/g;

    iget-object v0, v0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v0, v0, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/CardsWebViewFragment;->a(Landroid/os/Bundle;)V

    return-void
.end method
