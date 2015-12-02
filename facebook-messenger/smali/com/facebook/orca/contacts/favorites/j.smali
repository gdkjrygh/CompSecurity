.class Lcom/facebook/orca/contacts/favorites/j;
.super Ljava/lang/Object;
.source "EditFavoritesActivity.java"

# interfaces
.implements Lcom/facebook/contacts/picker/v;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/j;->a:Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lcom/facebook/contacts/picker/ad;
    .locals 3

    .prologue
    .line 116
    instance-of v0, p1, Lcom/facebook/user/UserWithIdentifier;

    if-eqz v0, :cond_0

    .line 117
    check-cast p1, Lcom/facebook/user/UserWithIdentifier;

    .line 118
    new-instance v0, Lcom/facebook/orca/contacts/favorites/c;

    invoke-virtual {p1}, Lcom/facebook/user/UserWithIdentifier;->a()Lcom/facebook/user/User;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/orca/contacts/favorites/c;-><init>(Lcom/facebook/user/User;)V

    .line 119
    new-instance v1, Lcom/facebook/orca/contacts/favorites/k;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/favorites/k;-><init>(Lcom/facebook/orca/contacts/favorites/j;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/favorites/c;->a(Lcom/facebook/orca/contacts/favorites/d;)V

    .line 141
    :goto_0
    return-object v0

    .line 130
    :cond_0
    instance-of v0, p1, Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_1

    .line 131
    check-cast p1, Lcom/facebook/orca/threads/ThreadSummary;

    .line 132
    new-instance v0, Lcom/facebook/orca/contacts/favorites/g;

    invoke-direct {v0, p1}, Lcom/facebook/orca/contacts/favorites/g;-><init>(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 133
    new-instance v1, Lcom/facebook/orca/contacts/favorites/l;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/favorites/l;-><init>(Lcom/facebook/orca/contacts/favorites/j;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/contacts/favorites/g;->a(Lcom/facebook/orca/contacts/favorites/h;)V

    goto :goto_0

    .line 144
    :cond_1
    invoke-static {}, Lcom/facebook/orca/contacts/favorites/EditFavoritesActivity;->j()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unexpected rowData of type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 145
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method
