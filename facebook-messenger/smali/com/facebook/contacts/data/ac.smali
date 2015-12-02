.class public final Lcom/facebook/contacts/data/ac;
.super Ljava/lang/Object;
.source "FbContactsContract.java"

# interfaces
.implements Lcom/facebook/contacts/data/y;


# instance fields
.field public final a:Landroid/net/Uri;

.field final synthetic b:Lcom/facebook/contacts/data/x;


# direct methods
.method public constructor <init>(Lcom/facebook/contacts/data/x;)V
    .locals 2

    .prologue
    .line 154
    iput-object p1, p0, Lcom/facebook/contacts/data/ac;->b:Lcom/facebook/contacts/data/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 160
    iget-object v0, p0, Lcom/facebook/contacts/data/ac;->b:Lcom/facebook/contacts/data/x;

    iget-object v0, v0, Lcom/facebook/contacts/data/x;->b:Landroid/net/Uri;

    const-string v1, "search"

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/data/ac;->a:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Landroid/net/Uri;
    .locals 1

    .prologue
    .line 170
    sget-object v0, Lcom/facebook/contacts/data/x;->f:Ljava/util/Set;

    invoke-virtual {p0, p1, v0}, Lcom/facebook/contacts/data/ac;->a(Ljava/lang/String;Ljava/util/Set;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/util/Set;)Landroid/net/Uri;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/contacts/data/ad;",
            ">;)",
            "Landroid/net/Uri;"
        }
    .end annotation

    .prologue
    .line 181
    const-string v0, ","

    invoke-static {v0}, Lcom/google/common/base/Joiner;->on(Ljava/lang/String;)Lcom/google/common/base/Joiner;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/common/base/Joiner;->join(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    .line 182
    iget-object v1, p0, Lcom/facebook/contacts/data/ac;->a:Landroid/net/Uri;

    invoke-static {v0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {p1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final a(Landroid/net/Uri;)Lcom/facebook/contacts/data/ab;
    .locals 8

    .prologue
    const/4 v7, 0x3

    const/4 v6, 0x2

    .line 195
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v1

    .line 196
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-eq v0, v6, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-eq v0, v7, :cond_0

    .line 197
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid uri"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 199
    :cond_0
    const/4 v0, 0x1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 200
    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 201
    invoke-static {}, Lcom/google/common/a/fi;->e()Lcom/google/common/a/fk;

    move-result-object v3

    .line 202
    array-length v4, v2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v4, :cond_1

    aget-object v5, v2, v0

    .line 203
    invoke-static {v5}, Lcom/facebook/contacts/data/ad;->valueOf(Ljava/lang/String;)Lcom/facebook/contacts/data/ad;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/google/common/a/fk;->b(Ljava/lang/Object;)Lcom/google/common/a/fk;

    .line 202
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 206
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v0, v7, :cond_2

    const-string v0, ""

    .line 207
    :goto_1
    new-instance v1, Lcom/facebook/contacts/data/ab;

    iget-object v2, p0, Lcom/facebook/contacts/data/ac;->b:Lcom/facebook/contacts/data/x;

    invoke-virtual {v3}, Lcom/google/common/a/fk;->b()Lcom/google/common/a/fi;

    move-result-object v3

    invoke-direct {v1, v2, v0, v3}, Lcom/facebook/contacts/data/ab;-><init>(Lcom/facebook/contacts/data/x;Ljava/lang/String;Lcom/google/common/a/fi;)V

    return-object v1

    .line 206
    :cond_2
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_1
.end method
