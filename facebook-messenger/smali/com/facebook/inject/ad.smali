.class public Lcom/facebook/inject/ad;
.super Ljava/lang/Object;
.source "LessEagerUiThreadSingletonInitializer.java"


# instance fields
.field private final a:Lcom/facebook/inject/t;


# direct methods
.method public constructor <init>(Lcom/facebook/inject/t;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/facebook/inject/ad;->a:Lcom/facebook/inject/t;

    .line 26
    return-void
.end method

.method static synthetic a(Lcom/facebook/inject/ad;)Lcom/facebook/inject/t;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/facebook/inject/ad;->a:Lcom/facebook/inject/t;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/Set;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/google/inject/a;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 29
    invoke-static {}, Landroid/os/Looper;->myQueue()Landroid/os/MessageQueue;

    move-result-object v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    new-instance v1, Lcom/facebook/inject/ae;

    invoke-direct {v1, p0, p1}, Lcom/facebook/inject/ae;-><init>(Lcom/facebook/inject/ad;Ljava/util/Set;)V

    invoke-virtual {v0, v1}, Landroid/os/MessageQueue;->addIdleHandler(Landroid/os/MessageQueue$IdleHandler;)V

    .line 57
    :goto_0
    return-void

    .line 52
    :cond_0
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/inject/a;

    .line 53
    iget-object v2, p0, Lcom/facebook/inject/ad;->a:Lcom/facebook/inject/t;

    invoke-virtual {v2, v0}, Lcom/facebook/inject/t;->a(Lcom/google/inject/a;)Ljava/lang/Object;

    goto :goto_1

    .line 55
    :cond_1
    invoke-interface {p1}, Ljava/util/Set;->clear()V

    goto :goto_0
.end method
