.class public final Lcom/google/inject/Guice;
.super Ljava/lang/Object;
.source "Guice.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createInjector(Lcom/google/inject/Stage;Ljava/lang/Iterable;)Lcom/google/inject/Injector;
    .locals 1
    .param p0, "stage"    # Lcom/google/inject/Stage;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/Stage;",
            "Ljava/lang/Iterable",
            "<+",
            "Lcom/google/inject/Module;",
            ">;)",
            "Lcom/google/inject/Injector;"
        }
    .end annotation

    .prologue
    .line 95
    .local p1, "modules":Ljava/lang/Iterable;, "Ljava/lang/Iterable<+Lcom/google/inject/Module;>;"
    new-instance v0, Lcom/google/inject/internal/InternalInjectorCreator;

    invoke-direct {v0}, Lcom/google/inject/internal/InternalInjectorCreator;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/inject/internal/InternalInjectorCreator;->stage(Lcom/google/inject/Stage;)Lcom/google/inject/internal/InternalInjectorCreator;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/inject/internal/InternalInjectorCreator;->addModules(Ljava/lang/Iterable;)Lcom/google/inject/internal/InternalInjectorCreator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/inject/internal/InternalInjectorCreator;->build()Lcom/google/inject/Injector;

    move-result-object v0

    return-object v0
.end method

.method public static varargs createInjector(Lcom/google/inject/Stage;[Lcom/google/inject/Module;)Lcom/google/inject/Injector;
    .locals 1
    .param p0, "stage"    # Lcom/google/inject/Stage;
    .param p1, "modules"    # [Lcom/google/inject/Module;

    .prologue
    .line 83
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/inject/Guice;->createInjector(Lcom/google/inject/Stage;Ljava/lang/Iterable;)Lcom/google/inject/Injector;

    move-result-object v0

    return-object v0
.end method

.method public static createInjector(Ljava/lang/Iterable;)Lcom/google/inject/Injector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable",
            "<+",
            "Lcom/google/inject/Module;",
            ">;)",
            "Lcom/google/inject/Injector;"
        }
    .end annotation

    .prologue
    .line 72
    .local p0, "modules":Ljava/lang/Iterable;, "Ljava/lang/Iterable<+Lcom/google/inject/Module;>;"
    sget-object v0, Lcom/google/inject/Stage;->DEVELOPMENT:Lcom/google/inject/Stage;

    invoke-static {v0, p0}, Lcom/google/inject/Guice;->createInjector(Lcom/google/inject/Stage;Ljava/lang/Iterable;)Lcom/google/inject/Injector;

    move-result-object v0

    return-object v0
.end method

.method public static varargs createInjector([Lcom/google/inject/Module;)Lcom/google/inject/Injector;
    .locals 1
    .param p0, "modules"    # [Lcom/google/inject/Module;

    .prologue
    .line 62
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/google/inject/Guice;->createInjector(Ljava/lang/Iterable;)Lcom/google/inject/Injector;

    move-result-object v0

    return-object v0
.end method
