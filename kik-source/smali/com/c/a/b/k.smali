.class public abstract Lcom/c/a/b/k;
.super Ljava/util/AbstractCollection;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/a/b/k$a;,
        Lcom/c/a/b/k$b;
    }
.end annotation


# instance fields
.field private transient a:Lcom/c/a/b/m;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method a([Ljava/lang/Object;I)I
    .locals 3

    .prologue
    .line 199
    invoke-virtual {p0}, Lcom/c/a/b/k;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 200
    add-int/lit8 v0, p2, 0x1

    aput-object v2, p1, p2

    move p2, v0

    .line 201
    goto :goto_0

    .line 202
    :cond_0
    return p2
.end method

.method public abstract a()Lcom/c/a/b/ao;
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 96
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 120
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method abstract b()Z
.end method

.method public c()Lcom/c/a/b/m;
    .locals 1

    .prologue
    .line 171
    iget-object v0, p0, Lcom/c/a/b/k;->a:Lcom/c/a/b/m;

    .line 172
    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/c/a/b/k;->e()Lcom/c/a/b/m;

    move-result-object v0

    iput-object v0, p0, Lcom/c/a/b/k;->a:Lcom/c/a/b/m;

    :cond_0
    return-object v0
.end method

.method public final clear()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 156
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 84
    if-eqz p1, :cond_0

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method e()Lcom/c/a/b/m;
    .locals 2

    .prologue
    .line 176
    invoke-virtual {p0}, Lcom/c/a/b/k;->size()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 182
    new-instance v0, Lcom/c/a/b/af;

    invoke-virtual {p0}, Lcom/c/a/b/k;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/c/a/b/af;-><init>(Lcom/c/a/b/k;[Ljava/lang/Object;)V

    :goto_0
    return-object v0

    .line 178
    :pswitch_0
    invoke-static {}, Lcom/c/a/b/m;->f()Lcom/c/a/b/m;

    move-result-object v0

    goto :goto_0

    .line 180
    :pswitch_1
    invoke-virtual {p0}, Lcom/c/a/b/k;->a()Lcom/c/a/b/ao;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/a/b/ao;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/c/a/b/m;->a(Ljava/lang/Object;)Lcom/c/a/b/m;

    move-result-object v0

    goto :goto_0

    .line 176
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 45
    invoke-virtual {p0}, Lcom/c/a/b/k;->a()Lcom/c/a/b/ao;

    move-result-object v0

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 108
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 132
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 144
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 2

    .prologue
    .line 60
    invoke-virtual {p0}, Lcom/c/a/b/k;->size()I

    move-result v0

    .line 61
    if-nez v0, :cond_0

    .line 62
    sget-object v0, Lcom/c/a/b/ae;->a:[Ljava/lang/Object;

    .line 66
    :goto_0
    return-object v0

    .line 64
    :cond_0
    new-array v0, v0, [Ljava/lang/Object;

    .line 65
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/c/a/b/k;->a([Ljava/lang/Object;I)I

    goto :goto_0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    .prologue
    .line 71
    invoke-static {p1}, Lcom/c/a/a/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    invoke-virtual {p0}, Lcom/c/a/b/k;->size()I

    move-result v0

    .line 73
    array-length v1, p1

    if-ge v1, v0, :cond_1

    .line 74
    invoke-static {p1, v0}, Lcom/c/a/b/ae;->a([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    .line 78
    :cond_0
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/c/a/b/k;->a([Ljava/lang/Object;I)I

    .line 79
    return-object p1

    .line 75
    :cond_1
    array-length v1, p1

    if-le v1, v0, :cond_0

    .line 76
    const/4 v1, 0x0

    aput-object v1, p1, v0

    goto :goto_0
.end method
