.class Lcom/facebook/orca/contacts/favorites/l;
.super Ljava/lang/Object;
.source "EditFavoritesActivity.java"

# interfaces
.implements Lcom/facebook/orca/contacts/favorites/h;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/favorites/j;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/favorites/j;)V
    .locals 0

    .prologue
    .line 133
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/l;->a:Lcom/facebook/orca/contacts/favorites/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/l;->a:Lcom/facebook/orca/contacts/favorites/j;

    iget-object v0, v0, Lcom/facebook/orca/contacts/favorites/j;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-static {v0}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->b(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)Lcom/facebook/orca/contacts/favorites/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/favorites/ac;->e()V

    .line 139
    return-void
.end method
