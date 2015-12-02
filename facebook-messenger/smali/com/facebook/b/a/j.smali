.class Lcom/facebook/b/a/j;
.super Lcom/facebook/inject/d;
.source "ChatHeadsIpcModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/b/a/a;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/b/a/h;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/facebook/b/a/j;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/b/a/a;
    .locals 3

    .prologue
    .line 52
    new-instance v2, Lcom/facebook/b/a/a;

    const-class v0, Lcom/facebook/b/a/b;

    invoke-virtual {p0, v0}, Lcom/facebook/b/a/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/b/a/b;

    const-class v1, Lcom/facebook/config/a/d;

    invoke-virtual {p0, v1}, Lcom/facebook/b/a/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/config/a/d;

    invoke-direct {v2, v0, v1}, Lcom/facebook/b/a/a;-><init>(Lcom/facebook/b/a/b;Lcom/facebook/config/a/d;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 47
    invoke-virtual {p0}, Lcom/facebook/b/a/j;->a()Lcom/facebook/b/a/a;

    move-result-object v0

    return-object v0
.end method
