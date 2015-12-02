.class Lcom/facebook/debug/fps/g;
.super Lcom/facebook/inject/d;
.source "FPSModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/debug/fps/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/debug/fps/d;


# direct methods
.method private constructor <init>(Lcom/facebook/debug/fps/d;)V
    .locals 0

    .prologue
    .line 33
    iput-object p1, p0, Lcom/facebook/debug/fps/g;->a:Lcom/facebook/debug/fps/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/debug/fps/d;Lcom/facebook/debug/fps/e;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0, p1}, Lcom/facebook/debug/fps/g;-><init>(Lcom/facebook/debug/fps/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/debug/fps/a;
    .locals 3

    .prologue
    .line 36
    new-instance v1, Lcom/facebook/debug/fps/a;

    const-class v0, Lcom/facebook/debug/fps/k;

    invoke-virtual {p0, v0}, Lcom/facebook/debug/fps/g;->d(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    const-class v0, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v0}, Lcom/facebook/debug/fps/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/a;

    invoke-direct {v1, v2, v0}, Lcom/facebook/debug/fps/a;-><init>(Ljavax/inject/a;Lcom/facebook/common/executors/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 33
    invoke-virtual {p0}, Lcom/facebook/debug/fps/g;->a()Lcom/facebook/debug/fps/a;

    move-result-object v0

    return-object v0
.end method
