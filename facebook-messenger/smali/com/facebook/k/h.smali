.class Lcom/facebook/k/h;
.super Lcom/facebook/inject/d;
.source "PowerManagementModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/k/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/k/e;


# direct methods
.method private constructor <init>(Lcom/facebook/k/e;)V
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lcom/facebook/k/h;->a:Lcom/facebook/k/e;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/k/e;Lcom/facebook/k/f;)V
    .locals 0

    .prologue
    .line 73
    invoke-direct {p0, p1}, Lcom/facebook/k/h;-><init>(Lcom/facebook/k/e;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/k/b;
    .locals 2

    .prologue
    .line 78
    new-instance v1, Lcom/facebook/k/b;

    const-class v0, Lcom/facebook/k/a;

    invoke-virtual {p0, v0}, Lcom/facebook/k/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/k/a;

    invoke-direct {v1, v0}, Lcom/facebook/k/b;-><init>(Lcom/facebook/k/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 73
    invoke-virtual {p0}, Lcom/facebook/k/h;->a()Lcom/facebook/k/b;

    move-result-object v0

    return-object v0
.end method
