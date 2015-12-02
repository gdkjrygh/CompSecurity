.class Lcom/facebook/nux/f;
.super Lcom/facebook/inject/d;
.source "NuxModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/nux/status/f;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 78
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/nux/b;)V
    .locals 0

    .prologue
    .line 78
    invoke-direct {p0}, Lcom/facebook/nux/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/nux/status/f;
    .locals 3

    .prologue
    .line 83
    new-instance v2, Lcom/facebook/nux/status/f;

    const-class v0, Lcom/facebook/nux/status/a;

    invoke-virtual {p0, v0}, Lcom/facebook/nux/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/nux/status/a;

    const-class v1, Lcom/facebook/nux/status/j;

    invoke-virtual {p0, v1}, Lcom/facebook/nux/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/nux/status/j;

    invoke-direct {v2, v0, v1}, Lcom/facebook/nux/status/f;-><init>(Lcom/facebook/nux/status/a;Lcom/facebook/nux/status/j;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 78
    invoke-virtual {p0}, Lcom/facebook/nux/f;->a()Lcom/facebook/nux/status/f;

    move-result-object v0

    return-object v0
.end method
