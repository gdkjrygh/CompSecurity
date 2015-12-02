.class Lcom/facebook/nux/e;
.super Lcom/facebook/inject/d;
.source "NuxModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/nux/service/a;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 103
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/nux/b;)V
    .locals 0

    .prologue
    .line 103
    invoke-direct {p0}, Lcom/facebook/nux/e;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/nux/service/a;
    .locals 5

    .prologue
    .line 107
    new-instance v3, Lcom/facebook/nux/service/a;

    const-class v0, Lcom/facebook/http/protocol/aq;

    invoke-virtual {p0, v0}, Lcom/facebook/nux/e;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v0, Lcom/facebook/nux/status/l;

    invoke-virtual {p0, v0}, Lcom/facebook/nux/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/nux/status/l;

    const-class v1, Lcom/facebook/nux/status/a;

    invoke-virtual {p0, v1}, Lcom/facebook/nux/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/nux/status/a;

    const-class v2, Lcom/facebook/nux/status/j;

    invoke-virtual {p0, v2}, Lcom/facebook/nux/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/nux/status/j;

    invoke-direct {v3, v4, v0, v1, v2}, Lcom/facebook/nux/service/a;-><init>(Ljavax/inject/a;Lcom/facebook/nux/status/l;Lcom/facebook/nux/status/a;Lcom/facebook/nux/status/j;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 103
    invoke-virtual {p0}, Lcom/facebook/nux/e;->a()Lcom/facebook/nux/service/a;

    move-result-object v0

    return-object v0
.end method
