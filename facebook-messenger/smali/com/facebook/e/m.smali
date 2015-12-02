.class Lcom/facebook/e/m;
.super Lcom/facebook/inject/d;
.source "DeviceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/e/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/e/h;


# direct methods
.method private constructor <init>(Lcom/facebook/e/h;)V
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lcom/facebook/e/m;->a:Lcom/facebook/e/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/e/h;Lcom/facebook/e/i;)V
    .locals 0

    .prologue
    .line 82
    invoke-direct {p0, p1}, Lcom/facebook/e/m;-><init>(Lcom/facebook/e/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/e/c;
    .locals 5

    .prologue
    .line 87
    new-instance v4, Lcom/facebook/e/c;

    invoke-virtual {p0}, Lcom/facebook/e/m;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {p0}, Lcom/facebook/e/m;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/net/ConnectivityManager;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    const-class v2, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v2}, Lcom/facebook/e/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/time/a;

    const-class v3, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v3}, Lcom/facebook/e/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/prefs/shared/d;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/e/c;-><init>(Landroid/content/Context;Landroid/net/ConnectivityManager;Lcom/facebook/common/time/a;Lcom/facebook/prefs/shared/d;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 82
    invoke-virtual {p0}, Lcom/facebook/e/m;->a()Lcom/facebook/e/c;

    move-result-object v0

    return-object v0
.end method
