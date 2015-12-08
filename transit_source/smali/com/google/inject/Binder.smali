.class public interface abstract Lcom/google/inject/Binder;
.super Ljava/lang/Object;
.source "Binder.java"


# virtual methods
.method public abstract addError(Lcom/google/inject/spi/Message;)V
.end method

.method public varargs abstract addError(Ljava/lang/String;[Ljava/lang/Object;)V
.end method

.method public abstract addError(Ljava/lang/Throwable;)V
.end method

.method public abstract bind(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/binder/AnnotatedBindingBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/TypeLiteral",
            "<TT;>;)",
            "Lcom/google/inject/binder/AnnotatedBindingBuilder",
            "<TT;>;"
        }
    .end annotation
.end method

.method public abstract bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/google/inject/binder/AnnotatedBindingBuilder",
            "<TT;>;"
        }
    .end annotation
.end method

.method public abstract bind(Lcom/google/inject/Key;)Lcom/google/inject/binder/LinkedBindingBuilder;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/Key",
            "<TT;>;)",
            "Lcom/google/inject/binder/LinkedBindingBuilder",
            "<TT;>;"
        }
    .end annotation
.end method

.method public abstract bindConstant()Lcom/google/inject/binder/AnnotatedConstantBindingBuilder;
.end method

.method public abstract bindListener(Lcom/google/inject/matcher/Matcher;Lcom/google/inject/spi/TypeListener;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/matcher/Matcher",
            "<-",
            "Lcom/google/inject/TypeLiteral",
            "<*>;>;",
            "Lcom/google/inject/spi/TypeListener;",
            ")V"
        }
    .end annotation
.end method

.method public abstract bindScope(Ljava/lang/Class;Lcom/google/inject/Scope;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lcom/google/inject/Scope;",
            ")V"
        }
    .end annotation
.end method

.method public abstract convertToTypes(Lcom/google/inject/matcher/Matcher;Lcom/google/inject/spi/TypeConverter;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/matcher/Matcher",
            "<-",
            "Lcom/google/inject/TypeLiteral",
            "<*>;>;",
            "Lcom/google/inject/spi/TypeConverter;",
            ")V"
        }
    .end annotation
.end method

.method public abstract currentStage()Lcom/google/inject/Stage;
.end method

.method public abstract disableCircularProxies()V
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

.method public abstract install(Lcom/google/inject/Module;)V
.end method

.method public abstract newPrivateBinder()Lcom/google/inject/PrivateBinder;
.end method

.method public abstract requestInjection(Lcom/google/inject/TypeLiteral;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/TypeLiteral",
            "<TT;>;TT;)V"
        }
    .end annotation
.end method

.method public abstract requestInjection(Ljava/lang/Object;)V
.end method

.method public varargs abstract requestStaticInjection([Ljava/lang/Class;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation
.end method

.method public abstract requireExplicitBindings()V
.end method

.method public varargs abstract skipSources([Ljava/lang/Class;)Lcom/google/inject/Binder;
.end method

.method public abstract withSource(Ljava/lang/Object;)Lcom/google/inject/Binder;
.end method
