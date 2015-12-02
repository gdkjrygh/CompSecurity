.class Lcom/facebook/i/a/p;
.super Lcom/facebook/inject/d;
.source "PeerProcessManagerModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/i/a/c;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/i/a/o;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/facebook/i/a/p;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/i/a/c;
    .locals 7

    .prologue
    .line 36
    new-instance v0, Lcom/facebook/i/a/c;

    const-class v1, Ljava/lang/Integer;

    const-class v2, Lcom/facebook/common/process/MyProcessId;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/i/a/p;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    const-class v2, Lcom/facebook/common/process/d;

    invoke-virtual {p0, v2}, Lcom/facebook/i/a/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/process/d;

    const-class v3, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v3}, Lcom/facebook/i/a/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/common/e/h;

    const-class v4, Landroid/os/HandlerThread;

    invoke-virtual {p0, v4}, Lcom/facebook/i/a/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/HandlerThread;

    const-class v5, Ljava/lang/String;

    const-class v6, Lcom/facebook/auth/annotations/ViewerContextUserId;

    invoke-virtual {p0, v5, v6}, Lcom/facebook/i/a/p;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v5

    const-class v6, Lcom/facebook/auth/c/b;

    invoke-virtual {p0, v6}, Lcom/facebook/i/a/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/auth/c/b;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/i/a/c;-><init>(Ljavax/inject/a;Lcom/facebook/common/process/d;Lcom/facebook/common/e/h;Landroid/os/HandlerThread;Ljavax/inject/a;Lcom/facebook/auth/c/b;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 30
    invoke-virtual {p0}, Lcom/facebook/i/a/p;->a()Lcom/facebook/i/a/c;

    move-result-object v0

    return-object v0
.end method
