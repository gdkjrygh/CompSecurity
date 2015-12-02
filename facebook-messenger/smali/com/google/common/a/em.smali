.class public abstract Lcom/google/common/a/em;
.super Ljava/lang/Object;
.source "ImmutableCollection.java"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/util/Collection;


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/io/Serializable;",
        "Ljava/util/Collection",
        "<TE;>;"
    }
.end annotation


# static fields
.field static final c:Lcom/google/common/a/em;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/em",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private transient a:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 44
    new-instance v0, Lcom/google/common/a/ep;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/common/a/ep;-><init>(Lcom/google/common/a/en;)V

    sput-object v0, Lcom/google/common/a/em;->c:Lcom/google/common/a/em;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method abstract a()Z
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .prologue
    .line 91
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<+TE;>;)Z"
        }
    .end annotation

    .prologue
    .line 111
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final clear()V
    .locals 1

    .prologue
    .line 141
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
    .line 67
    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/google/common/a/em;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/common/a/gg;->a(Ljava/util/Iterator;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 72
    invoke-static {p0, p1}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public h()Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 156
    iget-object v0, p0, Lcom/google/common/a/em;->a:Lcom/google/common/a/es;

    .line 157
    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/common/a/em;->i()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/google/common/a/em;->a:Lcom/google/common/a/es;

    :cond_0
    return-object v0
.end method

.method public abstract h_()Lcom/google/common/a/mh;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/mh",
            "<TE;>;"
        }
    .end annotation
.end method

.method i()Lcom/google/common/a/es;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/es",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 161
    invoke-virtual {p0}, Lcom/google/common/a/em;->size()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 167
    new-instance v0, Lcom/google/common/a/ei;

    invoke-virtual {p0}, Lcom/google/common/a/em;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/google/common/a/ei;-><init>([Ljava/lang/Object;Lcom/google/common/a/em;)V

    :goto_0
    return-object v0

    .line 163
    :pswitch_0
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0

    .line 165
    :pswitch_1
    invoke-virtual {p0}, Lcom/google/common/a/em;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/mh;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0

    .line 161
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 77
    invoke-virtual {p0}, Lcom/google/common/a/em;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 40
    invoke-virtual {p0}, Lcom/google/common/a/em;->h_()Lcom/google/common/a/mh;

    move-result-object v0

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 101
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 121
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 131
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 57
    invoke-static {p0}, Lcom/google/common/a/jp;->a(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .prologue
    .line 62
    invoke-static {p0, p1}, Lcom/google/common/a/jp;->a(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 81
    invoke-static {p0}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
