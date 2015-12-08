.class final Lcom/google/inject/internal/SingleMethodInjector;
.super Ljava/lang/Object;
.source "SingleMethodInjector.java"

# interfaces
.implements Lcom/google/inject/internal/SingleMemberInjector;


# instance fields
.field private final injectionPoint:Lcom/google/inject/spi/InjectionPoint;

.field private final methodInvoker:Lcom/google/inject/internal/InjectorImpl$MethodInvoker;

.field private final parameterInjectors:[Lcom/google/inject/internal/SingleParameterInjector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lcom/google/inject/internal/SingleParameterInjector",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/inject/internal/InjectorImpl;Lcom/google/inject/spi/InjectionPoint;Lcom/google/inject/internal/Errors;)V
    .locals 2
    .param p1, "injector"    # Lcom/google/inject/internal/InjectorImpl;
    .param p2, "injectionPoint"    # Lcom/google/inject/spi/InjectionPoint;
    .param p3, "errors"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p2, p0, Lcom/google/inject/internal/SingleMethodInjector;->injectionPoint:Lcom/google/inject/spi/InjectionPoint;

    .line 37
    invoke-virtual {p2}, Lcom/google/inject/spi/InjectionPoint;->getMember()Ljava/lang/reflect/Member;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    .line 38
    .local v0, "method":Ljava/lang/reflect/Method;
    invoke-direct {p0, v0}, Lcom/google/inject/internal/SingleMethodInjector;->createMethodInvoker(Ljava/lang/reflect/Method;)Lcom/google/inject/internal/InjectorImpl$MethodInvoker;

    move-result-object v1

    iput-object v1, p0, Lcom/google/inject/internal/SingleMethodInjector;->methodInvoker:Lcom/google/inject/internal/InjectorImpl$MethodInvoker;

    .line 39
    invoke-virtual {p2}, Lcom/google/inject/spi/InjectionPoint;->getDependencies()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1, v1, p3}, Lcom/google/inject/internal/InjectorImpl;->getParametersInjectors(Ljava/util/List;Lcom/google/inject/internal/Errors;)[Lcom/google/inject/internal/SingleParameterInjector;

    move-result-object v1

    iput-object v1, p0, Lcom/google/inject/internal/SingleMethodInjector;->parameterInjectors:[Lcom/google/inject/internal/SingleParameterInjector;

    .line 40
    return-void
.end method

.method private createMethodInvoker(Ljava/lang/reflect/Method;)Lcom/google/inject/internal/InjectorImpl$MethodInvoker;
    .locals 2
    .param p1, "method"    # Ljava/lang/reflect/Method;

    .prologue
    .line 45
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v0

    .line 46
    .local v0, "modifiers":I
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPrivate(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isProtected(I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 63
    :cond_0
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getModifiers()I

    move-result v1

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v1

    if-nez v1, :cond_2

    .line 65
    :cond_1
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 68
    :cond_2
    new-instance v1, Lcom/google/inject/internal/SingleMethodInjector$1;

    invoke-direct {v1, p0, p1}, Lcom/google/inject/internal/SingleMethodInjector$1;-><init>(Lcom/google/inject/internal/SingleMethodInjector;Ljava/lang/reflect/Method;)V

    return-object v1
.end method


# virtual methods
.method public getInjectionPoint()Lcom/google/inject/spi/InjectionPoint;
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/google/inject/internal/SingleMethodInjector;->injectionPoint:Lcom/google/inject/spi/InjectionPoint;

    return-object v0
.end method

.method public inject(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Ljava/lang/Object;)V
    .locals 5
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;
    .param p2, "context"    # Lcom/google/inject/internal/InternalContext;
    .param p3, "o"    # Ljava/lang/Object;

    .prologue
    .line 83
    :try_start_0
    iget-object v4, p0, Lcom/google/inject/internal/SingleMethodInjector;->parameterInjectors:[Lcom/google/inject/internal/SingleParameterInjector;

    invoke-static {p1, p2, v4}, Lcom/google/inject/internal/SingleParameterInjector;->getAll(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;[Lcom/google/inject/internal/SingleParameterInjector;)[Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/inject/internal/ErrorsException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 90
    .local v2, "parameters":[Ljava/lang/Object;
    :try_start_1
    iget-object v4, p0, Lcom/google/inject/internal/SingleMethodInjector;->methodInvoker:Lcom/google/inject/internal/InjectorImpl$MethodInvoker;

    invoke-interface {v4, p3, v2}, Lcom/google/inject/internal/InjectorImpl$MethodInvoker;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2

    .line 99
    .end local v2    # "parameters":[Ljava/lang/Object;
    :goto_0
    return-void

    .line 84
    :catch_0
    move-exception v1

    .line 85
    .local v1, "e":Lcom/google/inject/internal/ErrorsException;
    invoke-virtual {v1}, Lcom/google/inject/internal/ErrorsException;->getErrors()Lcom/google/inject/internal/Errors;

    move-result-object v4

    invoke-virtual {p1, v4}, Lcom/google/inject/internal/Errors;->merge(Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/Errors;

    goto :goto_0

    .line 91
    .end local v1    # "e":Lcom/google/inject/internal/ErrorsException;
    .restart local v2    # "parameters":[Ljava/lang/Object;
    :catch_1
    move-exception v1

    .line 92
    .local v1, "e":Ljava/lang/IllegalAccessException;
    new-instance v4, Ljava/lang/AssertionError;

    invoke-direct {v4, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v4

    .line 93
    .end local v1    # "e":Ljava/lang/IllegalAccessException;
    :catch_2
    move-exception v3

    .line 94
    .local v3, "userException":Ljava/lang/reflect/InvocationTargetException;
    invoke-virtual {v3}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 97
    .local v0, "cause":Ljava/lang/Throwable;
    :goto_1
    iget-object v4, p0, Lcom/google/inject/internal/SingleMethodInjector;->injectionPoint:Lcom/google/inject/spi/InjectionPoint;

    invoke-virtual {p1, v4}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/google/inject/internal/Errors;->errorInjectingMethod(Ljava/lang/Throwable;)Lcom/google/inject/internal/Errors;

    goto :goto_0

    .end local v0    # "cause":Ljava/lang/Throwable;
    :cond_0
    move-object v0, v3

    .line 94
    goto :goto_1
.end method
