.class public Lroboguice/event/ObservesTypeListener;
.super Ljava/lang/Object;
.source "ObservesTypeListener.java"

# interfaces
.implements Lcom/google/inject/spi/TypeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lroboguice/event/ObservesTypeListener$ContextObserverMethodInjector;
    }
.end annotation


# instance fields
.field protected eventManagerProvider:Lcom/google/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/Provider",
            "<",
            "Lroboguice/event/EventManager;",
            ">;"
        }
    .end annotation
.end field

.field protected observerThreadingDecorator:Lroboguice/event/eventListener/factory/EventListenerThreadingDecorator;


# direct methods
.method public constructor <init>(Lcom/google/inject/Provider;Lroboguice/event/eventListener/factory/EventListenerThreadingDecorator;)V
    .locals 0
    .param p2, "observerThreadingDecorator"    # Lroboguice/event/eventListener/factory/EventListenerThreadingDecorator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Provider",
            "<",
            "Lroboguice/event/EventManager;",
            ">;",
            "Lroboguice/event/eventListener/factory/EventListenerThreadingDecorator;",
            ")V"
        }
    .end annotation

    .prologue
    .line 26
    .local p1, "eventManagerProvider":Lcom/google/inject/Provider;, "Lcom/google/inject/Provider<Lroboguice/event/EventManager;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lroboguice/event/ObservesTypeListener;->eventManagerProvider:Lcom/google/inject/Provider;

    .line 28
    iput-object p2, p0, Lroboguice/event/ObservesTypeListener;->observerThreadingDecorator:Lroboguice/event/eventListener/factory/EventListenerThreadingDecorator;

    .line 29
    return-void
.end method


# virtual methods
.method protected checkMethodParameters(Ljava/lang/reflect/Method;)V
    .locals 2
    .param p1, "method"    # Ljava/lang/reflect/Method;

    .prologue
    .line 77
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 78
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Annotation @Observes must only annotate one parameter, which must be the only parameter in the listener method."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 80
    :cond_0
    return-void
.end method

.method protected findContextObserver(Ljava/lang/reflect/Method;Lcom/google/inject/spi/TypeEncounter;)V
    .locals 11
    .param p1, "method"    # Ljava/lang/reflect/Method;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Method;",
            "Lcom/google/inject/spi/TypeEncounter",
            "<TI;>;)V"
        }
    .end annotation

    .prologue
    .line 45
    .local p2, "iTypeEncounter":Lcom/google/inject/spi/TypeEncounter;, "Lcom/google/inject/spi/TypeEncounter<TI;>;"
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v6

    .line 46
    .local v6, "parameterAnnotations":[[Ljava/lang/annotation/Annotation;
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    array-length v9, v6

    if-ge v3, v9, :cond_2

    .line 47
    aget-object v1, v6, v3

    .line 48
    .local v1, "annotationArray":[Ljava/lang/annotation/Annotation;
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    .line 49
    .local v8, "parameterTypes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
    aget-object v7, v8, v3

    .line 51
    .local v7, "parameterType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    move-object v2, v1

    .local v2, "arr$":[Ljava/lang/annotation/Annotation;
    array-length v5, v2

    .local v5, "len$":I
    const/4 v4, 0x0

    .local v4, "i$":I
    :goto_1
    if-ge v4, v5, :cond_1

    aget-object v0, v2, v4

    .line 52
    .local v0, "annotation":Ljava/lang/annotation/Annotation;
    invoke-interface {v0}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    move-result-object v9

    const-class v10, Lroboguice/event/Observes;

    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    .line 53
    check-cast v0, Lroboguice/event/Observes;

    .end local v0    # "annotation":Ljava/lang/annotation/Annotation;
    invoke-interface {v0}, Lroboguice/event/Observes;->value()Lroboguice/event/EventThread;

    move-result-object v9

    invoke-virtual {p0, p2, p1, v7, v9}, Lroboguice/event/ObservesTypeListener;->registerContextObserver(Lcom/google/inject/spi/TypeEncounter;Ljava/lang/reflect/Method;Ljava/lang/Class;Lroboguice/event/EventThread;)V

    .line 51
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 46
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 55
    .end local v1    # "annotationArray":[Ljava/lang/annotation/Annotation;
    .end local v2    # "arr$":[Ljava/lang/annotation/Annotation;
    .end local v4    # "i$":I
    .end local v5    # "len$":I
    .end local v7    # "parameterType":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v8    # "parameterTypes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
    :cond_2
    return-void
.end method

.method public hear(Lcom/google/inject/TypeLiteral;Lcom/google/inject/spi/TypeEncounter;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/TypeLiteral",
            "<TI;>;",
            "Lcom/google/inject/spi/TypeEncounter",
            "<TI;>;)V"
        }
    .end annotation

    .prologue
    .line 32
    .local p1, "iTypeLiteral":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TI;>;"
    .local p2, "iTypeEncounter":Lcom/google/inject/spi/TypeEncounter;, "Lcom/google/inject/spi/TypeEncounter<TI;>;"
    invoke-virtual {p1}, Lcom/google/inject/TypeLiteral;->getRawType()Ljava/lang/Class;

    move-result-object v2

    .local v2, "c":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :goto_0
    const-class v9, Ljava/lang/Object;

    if-eq v2, v9, :cond_3

    .line 33
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/reflect/Method;
    array-length v6, v0

    .local v6, "len$":I
    const/4 v3, 0x0

    .local v3, "i$":I
    :goto_1
    if-ge v3, v6, :cond_0

    aget-object v8, v0, v3

    .line 34
    .local v8, "method":Ljava/lang/reflect/Method;
    invoke-virtual {p0, v8, p2}, Lroboguice/event/ObservesTypeListener;->findContextObserver(Ljava/lang/reflect/Method;Lcom/google/inject/spi/TypeEncounter;)V

    .line 33
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 36
    .end local v8    # "method":Ljava/lang/reflect/Method;
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v0

    .local v0, "arr$":[Ljava/lang/Class;
    array-length v6, v0

    const/4 v3, 0x0

    move v4, v3

    .end local v0    # "arr$":[Ljava/lang/Class;
    .end local v3    # "i$":I
    .end local v6    # "len$":I
    .local v4, "i$":I
    :goto_2
    if-ge v4, v6, :cond_2

    aget-object v5, v0, v4

    .line 37
    .local v5, "interfaceClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v1

    .local v1, "arr$":[Ljava/lang/reflect/Method;
    array-length v7, v1

    .local v7, "len$":I
    const/4 v3, 0x0

    .end local v4    # "i$":I
    .restart local v3    # "i$":I
    :goto_3
    if-ge v3, v7, :cond_1

    aget-object v8, v1, v3

    .line 38
    .restart local v8    # "method":Ljava/lang/reflect/Method;
    invoke-virtual {p0, v8, p2}, Lroboguice/event/ObservesTypeListener;->findContextObserver(Ljava/lang/reflect/Method;Lcom/google/inject/spi/TypeEncounter;)V

    .line 37
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 36
    .end local v8    # "method":Ljava/lang/reflect/Method;
    :cond_1
    add-int/lit8 v3, v4, 0x1

    move v4, v3

    .end local v3    # "i$":I
    .restart local v4    # "i$":I
    goto :goto_2

    .line 32
    .end local v1    # "arr$":[Ljava/lang/reflect/Method;
    .end local v5    # "interfaceClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v7    # "len$":I
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    .line 42
    .end local v4    # "i$":I
    :cond_3
    return-void
.end method

.method protected registerContextObserver(Lcom/google/inject/spi/TypeEncounter;Ljava/lang/reflect/Method;Ljava/lang/Class;Lroboguice/event/EventThread;)V
    .locals 6
    .param p2, "method"    # Ljava/lang/reflect/Method;
    .param p4, "threadType"    # Lroboguice/event/EventThread;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/spi/TypeEncounter",
            "<TI;>;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/Class",
            "<TT;>;",
            "Lroboguice/event/EventThread;",
            ")V"
        }
    .end annotation

    .prologue
    .line 67
    .local p1, "iTypeEncounter":Lcom/google/inject/spi/TypeEncounter;, "Lcom/google/inject/spi/TypeEncounter<TI;>;"
    .local p3, "parameterType":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
    invoke-virtual {p0, p2}, Lroboguice/event/ObservesTypeListener;->checkMethodParameters(Ljava/lang/reflect/Method;)V

    .line 68
    new-instance v0, Lroboguice/event/ObservesTypeListener$ContextObserverMethodInjector;

    iget-object v1, p0, Lroboguice/event/ObservesTypeListener;->eventManagerProvider:Lcom/google/inject/Provider;

    iget-object v2, p0, Lroboguice/event/ObservesTypeListener;->observerThreadingDecorator:Lroboguice/event/eventListener/factory/EventListenerThreadingDecorator;

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lroboguice/event/ObservesTypeListener$ContextObserverMethodInjector;-><init>(Lcom/google/inject/Provider;Lroboguice/event/eventListener/factory/EventListenerThreadingDecorator;Ljava/lang/reflect/Method;Ljava/lang/Class;Lroboguice/event/EventThread;)V

    invoke-interface {p1, v0}, Lcom/google/inject/spi/TypeEncounter;->register(Lcom/google/inject/spi/InjectionListener;)V

    .line 69
    return-void
.end method
