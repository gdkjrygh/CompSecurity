.class Lcom/facebook/orca/contacts/favorites/p;
.super Ljava/lang/Object;
.source "EditFavoritesActivity.java"

# interfaces
.implements Lcom/facebook/orca/contacts/favorites/v;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)V
    .locals 0

    .prologue
    .line 301
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/p;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/user/User;)V
    .locals 1

    .prologue
    .line 305
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/p;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-static {v0, p1}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->b(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;Lcom/facebook/user/User;)V

    .line 306
    return-void
.end method
