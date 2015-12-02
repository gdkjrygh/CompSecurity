.class public Lcom/facebook/orca/contacts/favorites/y;
.super Ljava/lang/Object;
.source "FavoriteGroupRow.java"

# interfaces
.implements Lcom/facebook/contacts/picker/ad;


# instance fields
.field private final a:Lcom/facebook/orca/threads/ThreadSummary;

.field private b:Lcom/facebook/orca/contacts/favorites/z;


# virtual methods
.method public a()Lcom/facebook/orca/threads/ThreadSummary;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/y;->a:Lcom/facebook/orca/threads/ThreadSummary;

    return-object v0
.end method

.method public b()V
    .locals 2

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/y;->b:Lcom/facebook/orca/contacts/favorites/z;

    if-eqz v0, :cond_0

    .line 33
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/y;->b:Lcom/facebook/orca/contacts/favorites/z;

    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/y;->a:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-interface {v0, v1}, Lcom/facebook/orca/contacts/favorites/z;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 35
    :cond_0
    return-void
.end method
