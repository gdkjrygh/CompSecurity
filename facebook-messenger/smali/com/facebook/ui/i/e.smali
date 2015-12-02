.class Lcom/facebook/ui/i/e;
.super Lcom/facebook/inject/d;
.source "ToastModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/ui/i/b;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/ui/i/d;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Lcom/facebook/ui/i/e;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ui/i/b;
    .locals 2

    .prologue
    .line 29
    new-instance v1, Lcom/facebook/ui/i/b;

    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v0}, Lcom/facebook/ui/i/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    invoke-direct {v1, v0}, Lcom/facebook/ui/i/b;-><init>(Lcom/facebook/analytics/av;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 25
    invoke-virtual {p0}, Lcom/facebook/ui/i/e;->a()Lcom/facebook/ui/i/b;

    move-result-object v0

    return-object v0
.end method
