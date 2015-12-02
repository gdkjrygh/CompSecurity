.class Lcom/facebook/inject/k;
.super Lcom/facebook/inject/d;
.source "BuiltInModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Landroid/content/Context;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/inject/i;


# direct methods
.method private constructor <init>(Lcom/facebook/inject/i;)V
    .locals 0

    .prologue
    .line 32
    iput-object p1, p0, Lcom/facebook/inject/k;->a:Lcom/facebook/inject/i;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/inject/i;Lcom/facebook/inject/j;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lcom/facebook/inject/k;-><init>(Lcom/facebook/inject/i;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/content/Context;
    .locals 3

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/inject/k;->a:Lcom/facebook/inject/i;

    invoke-static {v0}, Lcom/facebook/inject/i;->a(Lcom/facebook/inject/i;)Lcom/facebook/inject/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/inject/n;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 40
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 41
    invoke-static {}, Lcom/facebook/inject/av;->a()Lcom/facebook/inject/av;

    move-result-object v1

    .line 42
    const-class v2, Ljavax/inject/Singleton;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/av;->c(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 43
    new-instance v0, Lcom/facebook/inject/aq;

    const-string v1, "Should not call getContext in singleton creation. Can lead to memory leaks."

    invoke-direct {v0, v1}, Lcom/facebook/inject/aq;-><init>(Ljava/lang/String;)V

    throw v0

    .line 47
    :cond_1
    const-class v2, Lcom/facebook/inject/ThreadLocalScoped;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/av;->c(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 48
    new-instance v0, Lcom/facebook/inject/aq;

    const-string v1, "Should not call getContext in thread local creation. Can lead to memory leaks."

    invoke-direct {v0, v1}, Lcom/facebook/inject/aq;-><init>(Ljava/lang/String;)V

    throw v0

    .line 53
    :cond_2
    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 32
    invoke-virtual {p0}, Lcom/facebook/inject/k;->a()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method
