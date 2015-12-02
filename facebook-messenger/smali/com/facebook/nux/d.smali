.class Lcom/facebook/nux/d;
.super Lcom/facebook/inject/d;
.source "NuxModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/nux/status/a;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 67
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/nux/b;)V
    .locals 0

    .prologue
    .line 67
    invoke-direct {p0}, Lcom/facebook/nux/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/nux/status/a;
    .locals 2

    .prologue
    .line 72
    new-instance v0, Lcom/facebook/nux/status/a;

    const-class v1, Lcom/facebook/nux/status/e;

    invoke-virtual {p0, v1}, Lcom/facebook/nux/d;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/nux/status/a;-><init>(Ljava/util/Set;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 67
    invoke-virtual {p0}, Lcom/facebook/nux/d;->a()Lcom/facebook/nux/status/a;

    move-result-object v0

    return-object v0
.end method
