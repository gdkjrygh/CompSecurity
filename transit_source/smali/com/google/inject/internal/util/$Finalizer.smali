.class public Lcom/google/inject/internal/util/$Finalizer;
.super Ljava/lang/Thread;
.source "Finalizer.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/inject/internal/util/$Finalizer$1;,
        Lcom/google/inject/internal/util/$Finalizer$ShutDown;
    }
.end annotation


# static fields
.field private static final FINALIZABLE_REFERENCE:Ljava/lang/String; = "com.google.inject.internal.util.$FinalizableReference"

.field private static final logger:Ljava/util/logging/Logger;


# instance fields
.field private final finalizableReferenceClassReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Ljava/lang/Class",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final frqReference:Ljava/lang/ref/PhantomReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/PhantomReference",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final queue:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 50
    const-class v0, Lcom/google/inject/internal/util/$Finalizer;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/inject/internal/util/$Finalizer;->logger:Ljava/util/logging/Logger;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 2
    .param p2, "frq"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .prologue
    .line 92
    .local p1, "finalizableReferenceClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const-class v0, Lcom/google/inject/internal/util/$Finalizer;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 88
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object v0, p0, Lcom/google/inject/internal/util/$Finalizer;->queue:Ljava/lang/ref/ReferenceQueue;

    .line 94
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/inject/internal/util/$Finalizer;->finalizableReferenceClassReference:Ljava/lang/ref/WeakReference;

    .line 98
    new-instance v0, Ljava/lang/ref/PhantomReference;

    iget-object v1, p0, Lcom/google/inject/internal/util/$Finalizer;->queue:Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0, p2, v1}, Ljava/lang/ref/PhantomReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    iput-object v0, p0, Lcom/google/inject/internal/util/$Finalizer;->frqReference:Ljava/lang/ref/PhantomReference;

    .line 100
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/inject/internal/util/$Finalizer;->setDaemon(Z)V

    .line 103
    return-void
.end method

.method private cleanUp(Ljava/lang/ref/Reference;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/Reference",
            "<*>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/util/$Finalizer$ShutDown;
        }
    .end annotation

    .prologue
    .line 124
    .local p1, "reference":Ljava/lang/ref/Reference;, "Ljava/lang/ref/Reference<*>;"
    invoke-direct {p0}, Lcom/google/inject/internal/util/$Finalizer;->getFinalizeReferentMethod()Ljava/lang/reflect/Method;

    move-result-object v0

    .line 130
    .local v0, "finalizeReferentMethod":Ljava/lang/reflect/Method;
    :cond_0
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->clear()V

    .line 132
    iget-object v2, p0, Lcom/google/inject/internal/util/$Finalizer;->frqReference:Ljava/lang/ref/PhantomReference;

    if-ne p1, v2, :cond_1

    .line 137
    new-instance v2, Lcom/google/inject/internal/util/$Finalizer$ShutDown;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/google/inject/internal/util/$Finalizer$ShutDown;-><init>(Lcom/google/inject/internal/util/$Finalizer$1;)V

    throw v2

    .line 141
    :cond_1
    const/4 v2, 0x0

    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 150
    :goto_0
    iget-object v2, p0, Lcom/google/inject/internal/util/$Finalizer;->queue:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v2}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object p1

    if-nez p1, :cond_0

    .line 151
    return-void

    .line 142
    :catch_0
    move-exception v1

    .line 143
    .local v1, "t":Ljava/lang/Throwable;
    sget-object v2, Lcom/google/inject/internal/util/$Finalizer;->logger:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v4, "Error cleaning up after reference."

    invoke-virtual {v2, v3, v4, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method private getFinalizeReferentMethod()Ljava/lang/reflect/Method;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/inject/internal/util/$Finalizer$ShutDown;
        }
    .end annotation

    .prologue
    .line 157
    iget-object v2, p0, Lcom/google/inject/internal/util/$Finalizer;->finalizableReferenceClassReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    .line 159
    .local v1, "finalizableReferenceClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    if-nez v1, :cond_0

    .line 168
    new-instance v2, Lcom/google/inject/internal/util/$Finalizer$ShutDown;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/google/inject/internal/util/$Finalizer$ShutDown;-><init>(Lcom/google/inject/internal/util/$Finalizer$1;)V

    throw v2

    .line 171
    :cond_0
    :try_start_0
    const-string v2, "finalizeReferent"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Class;

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    return-object v2

    .line 172
    :catch_0
    move-exception v0

    .line 173
    .local v0, "e":Ljava/lang/NoSuchMethodException;
    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v2
.end method

.method public static startFinalizer(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/ref/ReferenceQueue;
    .locals 3
    .param p1, "frq"    # Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/ref/ReferenceQueue",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 76
    .local p0, "finalizableReferenceClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.google.inject.internal.util.$FinalizableReference"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 77
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Expected com.google.inject.internal.util.FinalizableReference."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 81
    :cond_0
    new-instance v0, Lcom/google/inject/internal/util/$Finalizer;

    invoke-direct {v0, p0, p1}, Lcom/google/inject/internal/util/$Finalizer;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 82
    .local v0, "finalizer":Lcom/google/inject/internal/util/$Finalizer;
    invoke-virtual {v0}, Lcom/google/inject/internal/util/$Finalizer;->start()V

    .line 83
    iget-object v1, v0, Lcom/google/inject/internal/util/$Finalizer;->queue:Ljava/lang/ref/ReferenceQueue;

    return-object v1
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 114
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/google/inject/internal/util/$Finalizer;->queue:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v0}, Ljava/lang/ref/ReferenceQueue;->remove()Ljava/lang/ref/Reference;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/inject/internal/util/$Finalizer;->cleanUp(Ljava/lang/ref/Reference;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/inject/internal/util/$Finalizer$ShutDown; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 115
    :catch_0
    move-exception v0

    goto :goto_0

    .line 117
    :catch_1
    move-exception v0

    .line 118
    return-void
.end method
