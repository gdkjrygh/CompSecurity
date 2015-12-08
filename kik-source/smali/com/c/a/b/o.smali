.class public abstract Lcom/c/a/b/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/util/Map;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/a/b/o$a;
    }
.end annotation


# static fields
.field private static final a:[Ljava/util/Map$Entry;


# instance fields
.field private transient b:Lcom/c/a/b/v;

.field private transient c:Lcom/c/a/b/v;

.field private transient d:Lcom/c/a/b/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 313
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/util/Map$Entry;

    sput-object v0, Lcom/c/a/b/o;->a:[Ljava/util/Map$Entry;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 315
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/c/a/b/o;
    .locals 1

    .prologue
    .line 80
    invoke-static {p0, p1}, Lcom/c/a/b/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/c/a/b/j;

    move-result-object v0

    return-object v0
.end method

.method static c(Ljava/lang/Object;Ljava/lang/Object;)Lcom/c/a/b/p$a;
    .locals 1

    .prologue
    .line 135
    invoke-static {p0, p1}, Lcom/c/a/b/d;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 136
    new-instance v0, Lcom/c/a/b/p$a;

    invoke-direct {v0, p0, p1}, Lcom/c/a/b/p$a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static g()Lcom/c/a/b/o;
    .locals 1

    .prologue
    .line 70
    invoke-static {}, Lcom/c/a/b/j;->e()Lcom/c/a/b/j;

    move-result-object v0

    return-object v0
.end method

.method public static h()Lcom/c/a/b/o$a;
    .locals 1

    .prologue
    .line 144
    new-instance v0, Lcom/c/a/b/o$a;

    invoke-direct {v0}, Lcom/c/a/b/o$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/c/a/b/v;
    .locals 1

    .prologue
    .line 392
    iget-object v0, p0, Lcom/c/a/b/o;->b:Lcom/c/a/b/v;

    .line 393
    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/c/a/b/o;->c()Lcom/c/a/b/v;

    move-result-object v0

    iput-object v0, p0, Lcom/c/a/b/o;->b:Lcom/c/a/b/v;

    :cond_0
    return-object v0
.end method

.method abstract c()Lcom/c/a/b/v;
.end method

.method public final clear()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 362
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 372
    invoke-virtual {p0, p1}, Lcom/c/a/b/o;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 377
    invoke-virtual {p0}, Lcom/c/a/b/o;->f()Lcom/c/a/b/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/c/a/b/k;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public d()Lcom/c/a/b/v;
    .locals 1

    .prologue
    .line 406
    iget-object v0, p0, Lcom/c/a/b/o;->c:Lcom/c/a/b/v;

    .line 407
    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/c/a/b/o;->i()Lcom/c/a/b/v;

    move-result-object v0

    iput-object v0, p0, Lcom/c/a/b/o;->c:Lcom/c/a/b/v;

    :cond_0
    return-object v0
.end method

.method public synthetic entrySet()Ljava/util/Set;
    .locals 1

    .prologue
    .line 60
    invoke-virtual {p0}, Lcom/c/a/b/o;->b()Lcom/c/a/b/v;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 507
    invoke-static {p0, p1}, Lcom/c/a/b/ac;->a(Ljava/util/Map;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public f()Lcom/c/a/b/k;
    .locals 1

    .prologue
    .line 422
    iget-object v0, p0, Lcom/c/a/b/o;->d:Lcom/c/a/b/k;

    .line 423
    if-nez v0, :cond_0

    new-instance v0, Lcom/c/a/b/t;

    invoke-direct {v0, p0}, Lcom/c/a/b/t;-><init>(Lcom/c/a/b/o;)V

    iput-object v0, p0, Lcom/c/a/b/o;->d:Lcom/c/a/b/k;

    :cond_0
    return-object v0
.end method

.method public abstract get(Ljava/lang/Object;)Ljava/lang/Object;
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 515
    invoke-virtual {p0}, Lcom/c/a/b/o;->b()Lcom/c/a/b/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/a/b/v;->hashCode()I

    move-result v0

    return v0
.end method

.method i()Lcom/c/a/b/v;
    .locals 1

    .prologue
    .line 411
    new-instance v0, Lcom/c/a/b/r;

    invoke-direct {v0, p0}, Lcom/c/a/b/r;-><init>(Lcom/c/a/b/o;)V

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 367
    invoke-virtual {p0}, Lcom/c/a/b/o;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic keySet()Ljava/util/Set;
    .locals 1

    .prologue
    .line 60
    invoke-virtual {p0}, Lcom/c/a/b/o;->d()Lcom/c/a/b/v;

    move-result-object v0

    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 326
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 350
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 338
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 519
    invoke-static {p0}, Lcom/c/a/b/ac;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic values()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 60
    invoke-virtual {p0}, Lcom/c/a/b/o;->f()Lcom/c/a/b/k;

    move-result-object v0

    return-object v0
.end method
