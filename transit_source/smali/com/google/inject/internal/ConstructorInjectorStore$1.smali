.class Lcom/google/inject/internal/ConstructorInjectorStore$1;
.super Lcom/google/inject/internal/FailableCache;
.source "ConstructorInjectorStore.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/ConstructorInjectorStore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/inject/internal/FailableCache",
        "<",
        "Lcom/google/inject/spi/InjectionPoint;",
        "Lcom/google/inject/internal/ConstructorInjector",
        "<*>;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/inject/internal/ConstructorInjectorStore;


# direct methods
.method constructor <init>(Lcom/google/inject/internal/ConstructorInjectorStore;)V
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/google/inject/internal/ConstructorInjectorStore$1;->this$0:Lcom/google/inject/internal/ConstructorInjectorStore;

    invoke-direct {p0}, Lcom/google/inject/internal/FailableCache;-><init>()V

    return-void
.end method


# virtual methods
.method protected create(Lcom/google/inject/spi/InjectionPoint;Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/ConstructorInjector;
    .locals 1
    .param p1, "constructorInjector"    # Lcom/google/inject/spi/InjectionPoint;
    .param p2, "errors"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/spi/InjectionPoint;",
            "Lcom/google/inject/internal/Errors;",
            ")",
            "Lcom/google/inject/internal/ConstructorInjector",
            "<*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 36
    iget-object v0, p0, Lcom/google/inject/internal/ConstructorInjectorStore$1;->this$0:Lcom/google/inject/internal/ConstructorInjectorStore;

    # invokes: Lcom/google/inject/internal/ConstructorInjectorStore;->createConstructor(Lcom/google/inject/spi/InjectionPoint;Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/ConstructorInjector;
    invoke-static {v0, p1, p2}, Lcom/google/inject/internal/ConstructorInjectorStore;->access$000(Lcom/google/inject/internal/ConstructorInjectorStore;Lcom/google/inject/spi/InjectionPoint;Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/ConstructorInjector;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic create(Ljava/lang/Object;Lcom/google/inject/internal/Errors;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;
    .param p2, "x1"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 32
    check-cast p1, Lcom/google/inject/spi/InjectionPoint;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1, p2}, Lcom/google/inject/internal/ConstructorInjectorStore$1;->create(Lcom/google/inject/spi/InjectionPoint;Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/ConstructorInjector;

    move-result-object v0

    return-object v0
.end method
