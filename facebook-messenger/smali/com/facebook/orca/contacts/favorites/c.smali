.class public Lcom/facebook/orca/contacts/favorites/c;
.super Ljava/lang/Object;
.source "AddFavoriteContactRow.java"

# interfaces
.implements Lcom/facebook/contacts/picker/ad;


# instance fields
.field private final a:Lcom/facebook/user/User;

.field private b:Lcom/facebook/orca/contacts/favorites/d;


# direct methods
.method public constructor <init>(Lcom/facebook/user/User;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/c;->a:Lcom/facebook/user/User;

    .line 22
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/user/User;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/c;->a:Lcom/facebook/user/User;

    return-object v0
.end method

.method public a(Lcom/facebook/orca/contacts/favorites/d;)V
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/c;->b:Lcom/facebook/orca/contacts/favorites/d;

    .line 30
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/c;->b:Lcom/facebook/orca/contacts/favorites/d;

    if-eqz v0, :cond_0

    .line 34
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/c;->b:Lcom/facebook/orca/contacts/favorites/d;

    iget-object v1, p0, Lcom/facebook/orca/contacts/favorites/c;->a:Lcom/facebook/user/User;

    invoke-interface {v0, v1}, Lcom/facebook/orca/contacts/favorites/d;->a(Lcom/facebook/user/User;)V

    .line 36
    :cond_0
    return-void
.end method
