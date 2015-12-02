.class Lcom/facebook/e/n;
.super Lcom/facebook/inject/d;
.source "DeviceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/e/r;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/e/h;


# direct methods
.method private constructor <init>(Lcom/facebook/e/h;)V
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lcom/facebook/e/n;->a:Lcom/facebook/e/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/e/h;Lcom/facebook/e/i;)V
    .locals 0

    .prologue
    .line 72
    invoke-direct {p0, p1}, Lcom/facebook/e/n;-><init>(Lcom/facebook/e/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/e/r;
    .locals 3

    .prologue
    .line 76
    new-instance v1, Lcom/facebook/e/r;

    invoke-virtual {p0}, Lcom/facebook/e/n;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v2, Landroid/content/Context;

    invoke-interface {v0, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/facebook/e/r;-><init>(Landroid/content/Context;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 72
    invoke-virtual {p0}, Lcom/facebook/e/n;->a()Lcom/facebook/e/r;

    move-result-object v0

    return-object v0
.end method
