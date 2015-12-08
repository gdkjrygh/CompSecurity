.class public interface abstract Lcom/google/inject/spi/TypeEncounter;
.super Ljava/lang/Object;
.source "TypeEncounter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# virtual methods
.method public abstract addError(Lcom/google/inject/spi/Message;)V
.end method

.method public varargs abstract addError(Ljava/lang/String;[Ljava/lang/Object;)V
.end method

.method public abstract addError(Ljava/lang/Throwable;)V
.end method

.method public abstract getMembersInjector(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/MembersInjector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/TypeLiteral",
            "<TT;>;)",
            "Lcom/google/inject/MembersInjector",
            "<TT;>;"
        }
    .end annotation
.end method

.method public abstract getMembersInjector(Ljava/lang/Class;)Lcom/google/inject/MembersInjector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/google/inject/MembersInjector",
            "<TT;>;"
        }
    .end annotation
.end method

.method public abstract getProvider(Lcom/google/inject/Key;)Lcom/google/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/Key",
            "<TT;>;)",
            "Lcom/google/inject/Provider",
            "<TT;>;"
        }
    .end annotation
.end method

.method public abstract getProvider(Ljava/lang/Class;)Lcom/google/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/google/inject/Provider",
            "<TT;>;"
        }
    .end annotation
.end method

.method public abstract register(Lcom/google/inject/MembersInjector;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/MembersInjector",
            "<-TI;>;)V"
        }
    .end annotation
.end method

.method public abstract register(Lcom/google/inject/spi/InjectionListener;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/InjectionListener",
            "<-TI;>;)V"
        }
    .end annotation
.end method
