.class Lcom/facebook/orca/contacts/favorites/r;
.super Lcom/facebook/fbservice/ops/ac;
.source "EditFavoritesActivity.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)V
    .locals 0

    .prologue
    .line 376
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/r;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-direct {p0}, Lcom/facebook/fbservice/ops/ac;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 2

    .prologue
    .line 379
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/r;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->a(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 380
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/r;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-static {v0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->g(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)Lcom/facebook/fbservice/ops/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/aa;->b()V

    .line 381
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/r;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-static {v0, p1}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->a(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;Lcom/facebook/fbservice/service/OperationResult;)V

    .line 382
    return-void
.end method

.method protected a(Lcom/facebook/fbservice/service/ServiceException;)V
    .locals 2

    .prologue
    .line 386
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/r;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->a(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;

    .line 387
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/r;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-static {v0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->g(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)Lcom/facebook/fbservice/ops/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/fbservice/ops/aa;->b()V

    .line 388
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/r;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-static {v0, p1}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->a(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;Lcom/facebook/fbservice/service/ServiceException;)V

    .line 389
    return-void
.end method

.method public synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 376
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/contacts/favorites/r;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
