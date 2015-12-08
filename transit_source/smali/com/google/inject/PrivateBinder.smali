.class public interface abstract Lcom/google/inject/PrivateBinder;
.super Ljava/lang/Object;
.source "PrivateBinder.java"

# interfaces
.implements Lcom/google/inject/Binder;


# virtual methods
.method public abstract expose(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/binder/AnnotatedElementBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/TypeLiteral",
            "<*>;)",
            "Lcom/google/inject/binder/AnnotatedElementBuilder;"
        }
    .end annotation
.end method

.method public abstract expose(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedElementBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Lcom/google/inject/binder/AnnotatedElementBuilder;"
        }
    .end annotation
.end method

.method public abstract expose(Lcom/google/inject/Key;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<*>;)V"
        }
    .end annotation
.end method

.method public varargs abstract skipSources([Ljava/lang/Class;)Lcom/google/inject/PrivateBinder;
.end method

.method public abstract withSource(Ljava/lang/Object;)Lcom/google/inject/PrivateBinder;
.end method
