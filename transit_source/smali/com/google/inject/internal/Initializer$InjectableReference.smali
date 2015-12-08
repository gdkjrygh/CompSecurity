.class Lcom/google/inject/internal/Initializer$InjectableReference;
.super Ljava/lang/Object;
.source "Initializer.java"

# interfaces
.implements Lcom/google/inject/internal/Initializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/Initializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "InjectableReference"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/inject/internal/Initializable",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final injector:Lcom/google/inject/internal/InjectorImpl;

.field private final instance:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private membersInjector:Lcom/google/inject/internal/MembersInjectorImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/inject/internal/MembersInjectorImpl",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final source:Ljava/lang/Object;

.field final synthetic this$0:Lcom/google/inject/internal/Initializer;


# direct methods
.method public constructor <init>(Lcom/google/inject/internal/Initializer;Lcom/google/inject/internal/InjectorImpl;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .param p2, "injector"    # Lcom/google/inject/internal/InjectorImpl;
    .param p4, "source"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/InjectorImpl;",
            "TT;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    .line 111
    .local p0, "this":Lcom/google/inject/internal/Initializer$InjectableReference;, "Lcom/google/inject/internal/Initializer$InjectableReference<TT;>;"
    .local p3, "instance":Ljava/lang/Object;, "TT;"
    iput-object p1, p0, Lcom/google/inject/internal/Initializer$InjectableReference;->this$0:Lcom/google/inject/internal/Initializer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    iput-object p2, p0, Lcom/google/inject/internal/Initializer$InjectableReference;->injector:Lcom/google/inject/internal/InjectorImpl;

    .line 113
    const-string v0, "instance"

    invoke-static {p3, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/Initializer$InjectableReference;->instance:Ljava/lang/Object;

    .line 114
    const-string v0, "source"

    invoke-static {p4, v0}, Lcom/google/inject/internal/util/$Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/inject/internal/Initializer$InjectableReference;->source:Ljava/lang/Object;

    .line 115
    return-void
.end method


# virtual methods
.method public get(Lcom/google/inject/internal/Errors;)Ljava/lang/Object;
    .locals 6
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/inject/internal/Errors;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 128
    .local p0, "this":Lcom/google/inject/internal/Initializer$InjectableReference;, "Lcom/google/inject/internal/Initializer$InjectableReference<TT;>;"
    iget-object v1, p0, Lcom/google/inject/internal/Initializer$InjectableReference;->this$0:Lcom/google/inject/internal/Initializer;

    # getter for: Lcom/google/inject/internal/Initializer;->ready:Ljava/util/concurrent/CountDownLatch;
    invoke-static {v1}, Lcom/google/inject/internal/Initializer;->access$000(Lcom/google/inject/internal/Initializer;)Ljava/util/concurrent/CountDownLatch;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->getCount()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    .line 129
    iget-object v1, p0, Lcom/google/inject/internal/Initializer$InjectableReference;->instance:Ljava/lang/Object;

    .line 150
    :goto_0
    return-object v1

    .line 133
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    iget-object v2, p0, Lcom/google/inject/internal/Initializer$InjectableReference;->this$0:Lcom/google/inject/internal/Initializer;

    # getter for: Lcom/google/inject/internal/Initializer;->creatingThread:Ljava/lang/Thread;
    invoke-static {v2}, Lcom/google/inject/internal/Initializer;->access$100(Lcom/google/inject/internal/Initializer;)Ljava/lang/Thread;

    move-result-object v2

    if-eq v1, v2, :cond_1

    .line 135
    :try_start_0
    iget-object v1, p0, Lcom/google/inject/internal/Initializer$InjectableReference;->this$0:Lcom/google/inject/internal/Initializer;

    # getter for: Lcom/google/inject/internal/Initializer;->ready:Ljava/util/concurrent/CountDownLatch;
    invoke-static {v1}, Lcom/google/inject/internal/Initializer;->access$000(Lcom/google/inject/internal/Initializer;)Ljava/util/concurrent/CountDownLatch;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 136
    iget-object v1, p0, Lcom/google/inject/internal/Initializer$InjectableReference;->instance:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 137
    :catch_0
    move-exception v0

    .line 139
    .local v0, "e":Ljava/lang/InterruptedException;
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 144
    .end local v0    # "e":Ljava/lang/InterruptedException;
    :cond_1
    iget-object v1, p0, Lcom/google/inject/internal/Initializer$InjectableReference;->this$0:Lcom/google/inject/internal/Initializer;

    # getter for: Lcom/google/inject/internal/Initializer;->pendingInjection:Ljava/util/Map;
    invoke-static {v1}, Lcom/google/inject/internal/Initializer;->access$200(Lcom/google/inject/internal/Initializer;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lcom/google/inject/internal/Initializer$InjectableReference;->instance:Ljava/lang/Object;

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 147
    iget-object v2, p0, Lcom/google/inject/internal/Initializer$InjectableReference;->membersInjector:Lcom/google/inject/internal/MembersInjectorImpl;

    iget-object v3, p0, Lcom/google/inject/internal/Initializer$InjectableReference;->instance:Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/inject/internal/Initializer$InjectableReference;->source:Ljava/lang/Object;

    invoke-virtual {p1, v1}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v4

    iget-object v1, p0, Lcom/google/inject/internal/Initializer$InjectableReference;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v1, v1, Lcom/google/inject/internal/InjectorImpl;->options:Lcom/google/inject/internal/InjectorImpl$InjectorOptions;

    iget-object v1, v1, Lcom/google/inject/internal/InjectorImpl$InjectorOptions;->stage:Lcom/google/inject/Stage;

    sget-object v5, Lcom/google/inject/Stage;->TOOL:Lcom/google/inject/Stage;

    if-ne v1, v5, :cond_3

    const/4 v1, 0x1

    :goto_1
    invoke-virtual {v2, v3, v4, v1}, Lcom/google/inject/internal/MembersInjectorImpl;->injectAndNotify(Ljava/lang/Object;Lcom/google/inject/internal/Errors;Z)V

    .line 150
    :cond_2
    iget-object v1, p0, Lcom/google/inject/internal/Initializer$InjectableReference;->instance:Ljava/lang/Object;

    goto :goto_0

    .line 147
    :cond_3
    const/4 v1, 0x0

    goto :goto_1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 154
    .local p0, "this":Lcom/google/inject/internal/Initializer$InjectableReference;, "Lcom/google/inject/internal/Initializer$InjectableReference<TT;>;"
    iget-object v0, p0, Lcom/google/inject/internal/Initializer$InjectableReference;->instance:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public validate(Lcom/google/inject/internal/Errors;)V
    .locals 3
    .param p1, "errors"    # Lcom/google/inject/internal/Errors;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/ErrorsException;
        }
    .end annotation

    .prologue
    .line 119
    .local p0, "this":Lcom/google/inject/internal/Initializer$InjectableReference;, "Lcom/google/inject/internal/Initializer$InjectableReference<TT;>;"
    iget-object v1, p0, Lcom/google/inject/internal/Initializer$InjectableReference;->instance:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lcom/google/inject/TypeLiteral;->get(Ljava/lang/Class;)Lcom/google/inject/TypeLiteral;

    move-result-object v0

    .line 120
    .local v0, "type":Lcom/google/inject/TypeLiteral;, "Lcom/google/inject/TypeLiteral<TT;>;"
    iget-object v1, p0, Lcom/google/inject/internal/Initializer$InjectableReference;->injector:Lcom/google/inject/internal/InjectorImpl;

    iget-object v1, v1, Lcom/google/inject/internal/InjectorImpl;->membersInjectorStore:Lcom/google/inject/internal/MembersInjectorStore;

    iget-object v2, p0, Lcom/google/inject/internal/Initializer$InjectableReference;->source:Ljava/lang/Object;

    invoke-virtual {p1, v2}, Lcom/google/inject/internal/Errors;->withSource(Ljava/lang/Object;)Lcom/google/inject/internal/Errors;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/google/inject/internal/MembersInjectorStore;->get(Lcom/google/inject/TypeLiteral;Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/MembersInjectorImpl;

    move-result-object v1

    iput-object v1, p0, Lcom/google/inject/internal/Initializer$InjectableReference;->membersInjector:Lcom/google/inject/internal/MembersInjectorImpl;

    .line 121
    return-void
.end method
