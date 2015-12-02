.class public Lcom/facebook/orca/contacts/favorites/u;
.super Ljava/lang/Object;
.source "FavoriteContactRow.java"

# interfaces
.implements Lcom/facebook/contacts/picker/ad;


# instance fields
.field private final a:Lcom/facebook/user/User;

.field private b:Lcom/facebook/orca/contacts/favorites/v;


# direct methods
.method public constructor <init>(Lcom/facebook/user/User;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/u;->a:Lcom/facebook/user/User;

    .line 21
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/user/User;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/u;->a:Lcom/facebook/user/User;

    return-object v0
.end method

.method public a(Lcom/facebook/orca/contacts/favorites/v;)V
    .locals 0

    .prologue
    .line 28
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/u;->b:Lcom/facebook/orca/contacts/favorites/v;

    .line 29
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/u;->b:Lcom/facebook/orca/contacts/favorites/v;

    if-eqz v0, :cond_0

    .line 33
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/u;->b:Lcom/facebook/orca/contacts/favorites/v;

    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/u;->a:Lcom/facebook/user/User;

    invoke-interface {v0, v1}, Lcom/facebook/orca/contacts/favorites/v;->a(Lcom/facebook/user/User;)V

    .line 35
    :cond_0
    return-void
.end method
