.class final Lcom/kik/cards/web/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;


# instance fields
.field final synthetic a:Lcom/kik/cards/web/CardsWebViewFragment;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/CardsWebViewFragment;)V
    .locals 0

    .prologue
    .line 241
    iput-object p1, p0, Lcom/kik/cards/web/a;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onBackStackChanged()V
    .locals 3

    .prologue
    .line 246
    iget-object v0, p0, Lcom/kik/cards/web/a;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->a(Lcom/kik/cards/web/CardsWebViewFragment;)Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    .line 247
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->getBackStackEntryCount()I

    move-result v2

    .line 249
    const/4 v0, 0x0

    .line 251
    if-lez v2, :cond_0

    .line 252
    add-int/lit8 v0, v2, -0x1

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentManager;->getBackStackEntryAt(I)Landroid/support/v4/app/FragmentManager$BackStackEntry;

    move-result-object v0

    .line 255
    :cond_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/support/v4/app/FragmentManager$BackStackEntry;->getId()I

    move-result v0

    iget-object v1, p0, Lcom/kik/cards/web/a;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v1}, Lcom/kik/cards/web/CardsWebViewFragment;->getId()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 256
    :cond_1
    invoke-static {}, Lcom/kik/cards/web/CardsWebViewFragment;->z()Lorg/c/b;

    .line 257
    iget-object v0, p0, Lcom/kik/cards/web/a;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/CardsWebViewFragment;->c(Z)V

    .line 263
    :goto_0
    return-void

    .line 260
    :cond_2
    invoke-static {}, Lcom/kik/cards/web/CardsWebViewFragment;->z()Lorg/c/b;

    .line 261
    iget-object v0, p0, Lcom/kik/cards/web/a;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/CardsWebViewFragment;->c(Z)V

    goto :goto_0
.end method
