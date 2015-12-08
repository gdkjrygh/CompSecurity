.class public abstract Lcom/google/inject/AbstractModule;
.super Ljava/lang/Object;
.source "AbstractModule.java"

# interfaces
.implements Lcom/google/inject/Module;


# instance fields
.field binder:Lcom/google/inject/Binder;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected addError(Lcom/google/inject/spi/Message;)V
    .locals 1
    .param p1, "message"    # Lcom/google/inject/spi/Message;

    .prologue
    .line 140
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    invoke-interface {v0, p1}, Lcom/google/inject/Binder;->addError(Lcom/google/inject/spi/Message;)V

    .line 141
    return-void
.end method

.method protected varargs addError(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "arguments"    # [Ljava/lang/Object;

    .prologue
    .line 125
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    invoke-interface {v0, p1, p2}, Lcom/google/inject/Binder;->addError(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    return-void
.end method

.method protected addError(Ljava/lang/Throwable;)V
    .locals 1
    .param p1, "t"    # Ljava/lang/Throwable;

    .prologue
    .line 132
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    invoke-interface {v0, p1}, Lcom/google/inject/Binder;->addError(Ljava/lang/Throwable;)V

    .line 133
    return-void
.end method

.method protected bind(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/binder/AnnotatedBindingBuilder;
    .locals 1
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

    .prologue
    .line 97
    .local p1, "typeLiteral":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TT;>;"
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    invoke-interface {v0, p1}, Lcom/google/inject/Binder;->bind(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v0

    return-object v0
.end method

.method protected bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;
    .locals 1
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

    .prologue
    .line 104
    .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    invoke-interface {v0, p1}, Lcom/google/inject/Binder;->bind(Ljava/lang/Class;)Lcom/google/inject/binder/AnnotatedBindingBuilder;

    move-result-object v0

    return-object v0
.end method

.method protected bind(Lcom/google/inject/Key;)Lcom/google/inject/binder/LinkedBindingBuilder;
    .locals 1
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

    .prologue
    .line 90
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    invoke-interface {v0, p1}, Lcom/google/inject/Binder;->bind(Lcom/google/inject/Key;)Lcom/google/inject/binder/LinkedBindingBuilder;

    move-result-object v0

    return-object v0
.end method

.method protected bindConstant()Lcom/google/inject/binder/AnnotatedConstantBindingBuilder;
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    invoke-interface {v0}, Lcom/google/inject/Binder;->bindConstant()Lcom/google/inject/binder/AnnotatedConstantBindingBuilder;

    move-result-object v0

    return-object v0
.end method

.method protected bindListener(Lcom/google/inject/matcher/Matcher;Lcom/google/inject/spi/TypeListener;)V
    .locals 1
    .param p2, "listener"    # Lcom/google/inject/spi/TypeListener;
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

    .prologue
    .line 251
    .local p1, "typeMatcher":Lcom/google/inject/matcher/Matcher;, "Lcom/google/inject/matcher/Matcher<-Lcom/google/inject/TypeLiteral<*>;>;"
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    invoke-interface {v0, p1, p2}, Lcom/google/inject/Binder;->bindListener(Lcom/google/inject/matcher/Matcher;Lcom/google/inject/spi/TypeListener;)V

    .line 252
    return-void
.end method

.method protected bindScope(Ljava/lang/Class;Lcom/google/inject/Scope;)V
    .locals 1
    .param p2, "scope"    # Lcom/google/inject/Scope;
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

    .prologue
    .line 83
    .local p1, "scopeAnnotation":Ljava/lang/Class;, "Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;"
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    invoke-interface {v0, p1, p2}, Lcom/google/inject/Binder;->bindScope(Ljava/lang/Class;Lcom/google/inject/Scope;)V

    .line 84
    return-void
.end method

.method protected binder()Lcom/google/inject/Binder;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    return-object v0
.end method

.method protected abstract configure()V
.end method

.method public final declared-synchronized configure(Lcom/google/inject/Binder;)V
    .locals 2
    .param p1, "builder"    # Lcom/google/inject/Binder;

    .prologue
    .line 55
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Re-entry is not allowed."

    invoke-static {v0, v1}, Lcom/google/inject/internal/util/$Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 57
    const-string v0, "builder"

    invoke-static {p1, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/Binder;

    iput-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 59
    :try_start_1
    invoke-virtual {p0}, Lcom/google/inject/AbstractModule;->configure()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    const/4 v0, 0x0

    :try_start_2
    iput-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 64
    monitor-exit p0

    return-void

    .line 55
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 62
    :catchall_0
    move-exception v0

    const/4 v1, 0x0

    :try_start_3
    iput-object v1, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 55
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method protected convertToTypes(Lcom/google/inject/matcher/Matcher;Lcom/google/inject/spi/TypeConverter;)V
    .locals 1
    .param p2, "converter"    # Lcom/google/inject/spi/TypeConverter;
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

    .prologue
    .line 217
    .local p1, "typeMatcher":Lcom/google/inject/matcher/Matcher;, "Lcom/google/inject/matcher/Matcher<-Lcom/google/inject/TypeLiteral<*>;>;"
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    invoke-interface {v0, p1, p2}, Lcom/google/inject/Binder;->convertToTypes(Lcom/google/inject/matcher/Matcher;Lcom/google/inject/spi/TypeConverter;)V

    .line 218
    return-void
.end method

.method protected currentStage()Lcom/google/inject/Stage;
    .locals 1

    .prologue
    .line 225
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    invoke-interface {v0}, Lcom/google/inject/Binder;->currentStage()Lcom/google/inject/Stage;

    move-result-object v0

    return-object v0
.end method

.method protected getMembersInjector(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/MembersInjector;
    .locals 1
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

    .prologue
    .line 241
    .local p1, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TT;>;"
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    invoke-interface {v0, p1}, Lcom/google/inject/Binder;->getMembersInjector(Lcom/google/inject/TypeLiteral;)Lcom/google/inject/MembersInjector;

    move-result-object v0

    return-object v0
.end method

.method protected getMembersInjector(Ljava/lang/Class;)Lcom/google/inject/MembersInjector;
    .locals 1
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

    .prologue
    .line 233
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    invoke-interface {v0, p1}, Lcom/google/inject/Binder;->getMembersInjector(Ljava/lang/Class;)Lcom/google/inject/MembersInjector;

    move-result-object v0

    return-object v0
.end method

.method protected getProvider(Lcom/google/inject/Key;)Lcom/google/inject/Provider;
    .locals 1
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

    .prologue
    .line 200
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<TT;>;"
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    invoke-interface {v0, p1}, Lcom/google/inject/Binder;->getProvider(Lcom/google/inject/Key;)Lcom/google/inject/Provider;

    move-result-object v0

    return-object v0
.end method

.method protected getProvider(Ljava/lang/Class;)Lcom/google/inject/Provider;
    .locals 1
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

    .prologue
    .line 208
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    invoke-interface {v0, p1}, Lcom/google/inject/Binder;->getProvider(Ljava/lang/Class;)Lcom/google/inject/Provider;

    move-result-object v0

    return-object v0
.end method

.method protected install(Lcom/google/inject/Module;)V
    .locals 1
    .param p1, "module"    # Lcom/google/inject/Module;

    .prologue
    .line 118
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    invoke-interface {v0, p1}, Lcom/google/inject/Binder;->install(Lcom/google/inject/Module;)V

    .line 119
    return-void
.end method

.method protected requestInjection(Ljava/lang/Object;)V
    .locals 1
    .param p1, "instance"    # Ljava/lang/Object;

    .prologue
    .line 148
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    invoke-interface {v0, p1}, Lcom/google/inject/Binder;->requestInjection(Ljava/lang/Object;)V

    .line 149
    return-void
.end method

.method protected varargs requestStaticInjection([Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 155
    .local p1, "types":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    invoke-interface {v0, p1}, Lcom/google/inject/Binder;->requestStaticInjection([Ljava/lang/Class;)V

    .line 156
    return-void
.end method

.method protected requireBinding(Lcom/google/inject/Key;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Key",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 180
    .local p1, "key":Lcom/google/inject/Key;, "Lcom/google/inject/Key<*>;"
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    invoke-interface {v0, p1}, Lcom/google/inject/Binder;->getProvider(Lcom/google/inject/Key;)Lcom/google/inject/Provider;

    .line 181
    return-void
.end method

.method protected requireBinding(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 192
    .local p1, "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    iget-object v0, p0, Lcom/google/inject/AbstractModule;->binder:Lcom/google/inject/Binder;

    invoke-interface {v0, p1}, Lcom/google/inject/Binder;->getProvider(Ljava/lang/Class;)Lcom/google/inject/Provider;

    .line 193
    return-void
.end method
