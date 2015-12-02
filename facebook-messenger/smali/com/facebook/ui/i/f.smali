.class Lcom/facebook/ui/i/f;
.super Lcom/facebook/inject/d;
.source "ToastModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/ui/i/g;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/ui/i/d;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/facebook/ui/i/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ui/i/g;
    .locals 3

    .prologue
    .line 39
    new-instance v2, Lcom/facebook/ui/i/g;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/ui/i/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/ui/i/b;

    invoke-virtual {p0, v1}, Lcom/facebook/ui/i/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/ui/i/b;

    invoke-direct {v2, v0, v1}, Lcom/facebook/ui/i/g;-><init>(Landroid/content/Context;Lcom/facebook/ui/i/b;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 35
    invoke-virtual {p0}, Lcom/facebook/ui/i/f;->a()Lcom/facebook/ui/i/g;

    move-result-object v0

    return-object v0
.end method
