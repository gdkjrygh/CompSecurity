.class public Lcom/facebook/debug/a/a;
.super Ljava/lang/Object;
.source "ActivityTracer.java"


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/common/executors/a;

.field private c:Lcom/facebook/debug/d/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    const-class v0, Lcom/facebook/debug/a/a;

    sput-object v0, Lcom/facebook/debug/a/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/common/executors/a;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/facebook/debug/a/a;->b:Lcom/facebook/common/executors/a;

    .line 26
    invoke-interface {p1}, Lcom/facebook/common/executors/a;->a()V

    .line 27
    return-void
.end method

.method static synthetic a(Lcom/facebook/debug/a/a;)Lcom/facebook/debug/d/e;
    .locals 1

    .prologue
    .line 16
    iget-object v0, p0, Lcom/facebook/debug/a/a;->c:Lcom/facebook/debug/d/e;

    return-object v0
.end method

.method static synthetic a()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 16
    sget-object v0, Lcom/facebook/debug/a/a;->a:Ljava/lang/Class;

    return-object v0
.end method

.method private b()V
    .locals 2

    .prologue
    .line 66
    invoke-static {}, Landroid/os/Looper;->myQueue()Landroid/os/MessageQueue;

    move-result-object v0

    new-instance v1, Lcom/facebook/debug/a/b;

    invoke-direct {v1, p0}, Lcom/facebook/debug/a/b;-><init>(Lcom/facebook/debug/a/a;)V

    invoke-virtual {v0, v1}, Landroid/os/MessageQueue;->addIdleHandler(Landroid/os/MessageQueue$IdleHandler;)V

    .line 80
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/debug/d/e;)V
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/debug/a/a;->b:Lcom/facebook/common/executors/a;

    invoke-interface {v0}, Lcom/facebook/common/executors/a;->a()V

    .line 61
    iput-object p1, p0, Lcom/facebook/debug/a/a;->c:Lcom/facebook/debug/d/e;

    .line 62
    invoke-direct {p0}, Lcom/facebook/debug/a/a;->b()V

    .line 63
    return-void
.end method
