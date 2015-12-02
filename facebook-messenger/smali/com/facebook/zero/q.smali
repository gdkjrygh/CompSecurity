.class Lcom/facebook/zero/q;
.super Lcom/facebook/inject/d;
.source "ZeroModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/zero/b/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/zero/c;


# direct methods
.method private constructor <init>(Lcom/facebook/zero/c;)V
    .locals 0

    .prologue
    .line 322
    iput-object p1, p0, Lcom/facebook/zero/q;->a:Lcom/facebook/zero/c;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V
    .locals 0

    .prologue
    .line 322
    invoke-direct {p0, p1}, Lcom/facebook/zero/q;-><init>(Lcom/facebook/zero/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/zero/b/d;
    .locals 2

    .prologue
    .line 325
    new-instance v1, Lcom/facebook/zero/b/d;

    const-class v0, Lcom/facebook/zero/b/a;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/q;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/b/a;

    invoke-direct {v1, v0}, Lcom/facebook/zero/b/d;-><init>(Lcom/facebook/zero/b/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 322
    invoke-virtual {p0}, Lcom/facebook/zero/q;->a()Lcom/facebook/zero/b/d;

    move-result-object v0

    return-object v0
.end method
