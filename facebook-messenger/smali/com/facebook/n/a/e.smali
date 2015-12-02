.class Lcom/facebook/n/a/e;
.super Lcom/facebook/inject/d;
.source "SpringModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/n/j;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/n/a/b;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Lcom/facebook/n/a/e;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/n/j;
    .locals 4

    .prologue
    .line 37
    new-instance v3, Lcom/facebook/n/j;

    const-class v0, Lcom/facebook/n/f;

    invoke-virtual {p0, v0}, Lcom/facebook/n/a/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    const-class v1, Lcom/facebook/ui/b/d;

    invoke-virtual {p0, v1}, Lcom/facebook/n/a/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/ui/b/d;

    const-class v2, Lcom/facebook/n/k;

    invoke-virtual {p0, v2}, Lcom/facebook/n/a/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/n/k;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/n/j;-><init>(Lcom/facebook/common/time/a;Lcom/facebook/ui/b/d;Lcom/facebook/n/k;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 34
    invoke-virtual {p0}, Lcom/facebook/n/a/e;->a()Lcom/facebook/n/j;

    move-result-object v0

    return-object v0
.end method
