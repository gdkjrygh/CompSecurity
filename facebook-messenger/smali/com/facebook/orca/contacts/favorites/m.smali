.class Lcom/facebook/orca/contacts/favorites/m;
.super Ljava/lang/Object;
.source "EditFavoritesActivity.java"

# interfaces
.implements Landroid/support/v4/app/ah;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/support/v4/app/ah",
        "<",
        "Lcom/facebook/orca/contacts/divebar/an;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)V
    .locals 0

    .prologue
    .line 175
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/m;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILandroid/os/Bundle;)Landroid/support/v4/a/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/os/Bundle;",
            ")",
            "Landroid/support/v4/a/c",
            "<",
            "Lcom/facebook/orca/contacts/divebar/an;",
            ">;"
        }
    .end annotation

    .prologue
    .line 179
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/m;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-static {v0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->c(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)Lcom/facebook/orca/contacts/divebar/ao;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/ao;->c()Lcom/facebook/orca/contacts/divebar/ad;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/support/v4/a/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/a/c",
            "<",
            "Lcom/facebook/orca/contacts/divebar/an;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 192
    return-void
.end method

.method public a(Landroid/support/v4/a/c;Lcom/facebook/orca/contacts/divebar/an;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/a/c",
            "<",
            "Lcom/facebook/orca/contacts/divebar/an;",
            ">;",
            "Lcom/facebook/orca/contacts/divebar/an;",
            ")V"
        }
    .end annotation

    .prologue
    .line 186
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/m;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-static {v0, p2}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->a(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;Lcom/facebook/orca/contacts/divebar/an;)V

    .line 187
    return-void
.end method

.method public bridge synthetic a(Landroid/support/v4/a/c;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 175
    check-cast p2, Lcom/facebook/orca/contacts/divebar/an;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/contacts/favorites/m;->a(Landroid/support/v4/a/c;Lcom/facebook/orca/contacts/divebar/an;)V

    return-void
.end method
