.class Lcom/facebook/orca/contacts/favorites/n;
.super Ljava/lang/Object;
.source "EditFavoritesActivity.java"

# interfaces
.implements Lcom/facebook/widget/listview/g;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)V
    .locals 0

    .prologue
    .line 217
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/n;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 2

    .prologue
    .line 220
    if-ltz p2, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/n;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-static {v0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->d(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 221
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/n;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-static {v0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->d(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 222
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/n;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-static {v1}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->d(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 223
    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/n;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-static {v1}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->d(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 224
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/n;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-static {v0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->e(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)V

    .line 225
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/n;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-static {v0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->f(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)V

    .line 227
    :cond_0
    return-void
.end method
