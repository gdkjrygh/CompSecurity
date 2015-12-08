.class public interface abstract Lcom/google/inject/spi/PrivateElements;
.super Ljava/lang/Object;
.source "PrivateElements.java"

# interfaces
.implements Lcom/google/inject/spi/Element;


# virtual methods
.method public abstract getElements()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/inject/spi/Element;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getExposedKeys()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/Key",
            "<*>;>;"
        }
    .end annotation
.end method

.method public abstract getExposedSource(Lcom/google/inject/Key;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getInjector()Lcom/google/inject/Injector;
.end method
