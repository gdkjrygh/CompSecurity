.class public abstract Lcom/google/common/a/ej;
.super Lcom/google/common/a/ev;
.source "ImmutableBiMap.java"

# interfaces
.implements Lcom/google/common/a/av;


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/ev",
        "<TK;TV;>;",
        "Lcom/google/common/a/av",
        "<TK;TV;>;"
    }
.end annotation


# static fields
.field private static final a:Lcom/google/common/a/ej;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ej",
            "<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 46
    new-instance v0, Lcom/google/common/a/el;

    invoke-direct {v0}, Lcom/google/common/a/el;-><init>()V

    sput-object v0, Lcom/google/common/a/ej;->a:Lcom/google/common/a/ej;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 213
    invoke-direct {p0}, Lcom/google/common/a/ev;-><init>()V

    return-void
.end method

.method public static e()Lcom/google/common/a/ej;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/a/ej",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 55
    sget-object v0, Lcom/google/common/a/ej;->a:Lcom/google/common/a/ej;

    return-object v0
.end method

.method public static f()Lcom/google/common/a/ek;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/a/ek",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 114
    new-instance v0, Lcom/google/common/a/ek;

    invoke-direct {v0}, Lcom/google/common/a/ek;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 235
    invoke-virtual {p0}, Lcom/google/common/a/ej;->g()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ev;->a()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Lcom/google/common/a/av;
    .locals 1

    .prologue
    .line 42
    invoke-virtual {p0}, Lcom/google/common/a/ej;->h()Lcom/google/common/a/ej;

    move-result-object v0

    return-object v0
.end method

.method public synthetic c()Lcom/google/common/a/em;
    .locals 1

    .prologue
    .line 42
    invoke-virtual {p0}, Lcom/google/common/a/ej;->i()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 227
    invoke-virtual {p0}, Lcom/google/common/a/ej;->g()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/common/a/ev;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 231
    invoke-virtual {p0}, Lcom/google/common/a/ej;->h()Lcom/google/common/a/ej;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/common/a/ej;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public synthetic entrySet()Ljava/util/Set;
    .locals 1

    .prologue
    .line 42
    invoke-virtual {p0}, Lcom/google/common/a/ej;->a()Lcom/google/common/a/fi;

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
    .line 274
    if-eq p1, p0, :cond_0

    invoke-virtual {p0}, Lcom/google/common/a/ej;->g()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/common/a/ev;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method abstract g()Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ev",
            "<TK;TV;>;"
        }
    .end annotation
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .prologue
    .line 239
    invoke-virtual {p0}, Lcom/google/common/a/ej;->g()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public abstract h()Lcom/google/common/a/ej;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ej",
            "<TV;TK;>;"
        }
    .end annotation
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 278
    invoke-virtual {p0}, Lcom/google/common/a/ej;->g()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ev;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 251
    invoke-virtual {p0}, Lcom/google/common/a/ej;->h()Lcom/google/common/a/ej;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ej;->i_()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public i_()Lcom/google/common/a/fi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<TK;>;"
        }
    .end annotation

    .prologue
    .line 243
    invoke-virtual {p0}, Lcom/google/common/a/ej;->g()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ev;->i_()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 265
    invoke-virtual {p0}, Lcom/google/common/a/ej;->g()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ev;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public synthetic keySet()Ljava/util/Set;
    .locals 1

    .prologue
    .line 42
    invoke-virtual {p0}, Lcom/google/common/a/ej;->i_()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 270
    invoke-virtual {p0}, Lcom/google/common/a/ej;->g()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ev;->size()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 282
    invoke-virtual {p0}, Lcom/google/common/a/ej;->g()Lcom/google/common/a/ev;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/ev;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic values()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 42
    invoke-virtual {p0}, Lcom/google/common/a/ej;->i()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method
