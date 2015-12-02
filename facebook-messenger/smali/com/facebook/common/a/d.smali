.class public Lcom/facebook/common/a/d;
.super Ljava/lang/Object;
.source "DeferredHandler.java"


# instance fields
.field private a:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroid/os/MessageQueue;

.field private c:Lcom/facebook/common/a/g;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/facebook/common/a/d;->a:Ljava/util/LinkedList;

    .line 38
    invoke-static {}, Landroid/os/Looper;->myQueue()Landroid/os/MessageQueue;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/common/a/d;->b:Landroid/os/MessageQueue;

    .line 39
    new-instance v0, Lcom/facebook/common/a/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/common/a/g;-><init>(Lcom/facebook/common/a/d;Lcom/facebook/common/a/e;)V

    iput-object v0, p0, Lcom/facebook/common/a/d;->c:Lcom/facebook/common/a/g;

    .line 77
    return-void
.end method

.method static synthetic a(Lcom/facebook/common/a/d;)Ljava/util/LinkedList;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/common/a/d;->a:Ljava/util/LinkedList;

    return-object v0
.end method


# virtual methods
.method a()V
    .locals 2

    .prologue
    .line 112
    iget-object v0, p0, Lcom/facebook/common/a/d;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 113
    iget-object v0, p0, Lcom/facebook/common/a/d;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    .line 114
    instance-of v0, v0, Lcom/facebook/common/a/f;

    if-eqz v0, :cond_1

    .line 115
    iget-object v0, p0, Lcom/facebook/common/a/d;->b:Landroid/os/MessageQueue;

    iget-object v1, p0, Lcom/facebook/common/a/d;->c:Lcom/facebook/common/a/g;

    invoke-virtual {v0, v1}, Landroid/os/MessageQueue;->addIdleHandler(Landroid/os/MessageQueue$IdleHandler;)V

    .line 120
    :cond_0
    :goto_0
    return-void

    .line 117
    :cond_1
    iget-object v0, p0, Lcom/facebook/common/a/d;->c:Lcom/facebook/common/a/g;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/common/a/g;->sendEmptyMessage(I)Z

    goto :goto_0
.end method
