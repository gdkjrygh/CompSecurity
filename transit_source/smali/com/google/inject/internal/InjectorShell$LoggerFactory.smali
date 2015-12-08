.class Lcom/google/inject/internal/InjectorShell$LoggerFactory;
.super Ljava/lang/Object;
.source "InjectorShell.java"

# interfaces
.implements Lcom/google/inject/internal/InternalFactory;
.implements Lcom/google/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/InjectorShell;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LoggerFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/inject/internal/InternalFactory",
        "<",
        "Ljava/util/logging/Logger;",
        ">;",
        "Lcom/google/inject/Provider",
        "<",
        "Ljava/util/logging/Logger;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 250
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/inject/internal/InjectorShell$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/inject/internal/InjectorShell$1;

    .prologue
    .line 250
    invoke-direct {p0}, Lcom/google/inject/internal/InjectorShell$LoggerFactory;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 250
    invoke-virtual {p0}, Lcom/google/inject/internal/InjectorShell$LoggerFactory;->get()Ljava/util/logging/Logger;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Lcom/google/inject/spi/Dependency;Z)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/internal/Errors;
    .param p2, "x1"    # Lcom/google/inject/internal/InternalContext;
    .param p3, "x2"    # Lcom/google/inject/spi/Dependency;
    .param p4, "x3"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 250
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/inject/internal/InjectorShell$LoggerFactory;->get(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Lcom/google/inject/spi/Dependency;Z)Ljava/util/logging/Logger;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/util/logging/Logger;
    .locals 1

    .prologue
    .line 259
    invoke-static {}, Ljava/util/logging/Logger;->getAnonymousLogger()Ljava/util/logging/Logger;

    move-result-object v0

    return-object v0
.end method

.method public get(Lcom/google/inject/internal/Errors;Lcom/google/inject/internal/InternalContext;Lcom/google/inject/spi/Dependency;Z)Ljava/util/logging/Logger;
    .locals 2
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;
    .param p2, "context"    # Lcom/google/inject/internal/InternalContext;
    .param p4, "linked"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/Errors;",
            "Lcom/google/inject/internal/InternalContext;",
            "Lcom/google/inject/spi/Dependency",
            "<*>;Z)",
            "Ljava/util/logging/Logger;"
        }
    .end annotation

    .prologue
    .line 252
    .local p3, "dependency":Lcom/google/inject/spi/Dependency;, "Lcom/google/inject/spi/Dependency<*>;"
    invoke-virtual {p3}, Lcom/google/inject/spi/Dependency;->getInjectionPoint()Lcom/google/inject/spi/InjectionPoint;

    move-result-object v0

    .line 253
    .local v0, "injectionPoint":Lcom/google/inject/spi/InjectionPoint;
    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/logging/Logger;->getAnonymousLogger()Ljava/util/logging/Logger;

    move-result-object v1

    :goto_0
    return-object v1

    :cond_0
    invoke-virtual {v0}, Lcom/google/inject/spi/InjectionPoint;->getMember()Ljava/lang/reflect/Member;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v1

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 263
    const-string v0, "Provider<Logger>"

    return-object v0
.end method
