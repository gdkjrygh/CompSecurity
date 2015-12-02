.class Lcom/facebook/c/h;
.super Lcom/facebook/inject/d;
.source "ContentModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/c/t;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/c/d;


# direct methods
.method private constructor <init>(Lcom/facebook/c/d;)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lcom/facebook/c/h;->a:Lcom/facebook/c/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/c/d;Lcom/facebook/c/e;)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0, p1}, Lcom/facebook/c/h;-><init>(Lcom/facebook/c/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/c/t;
    .locals 4

    .prologue
    .line 51
    new-instance v2, Lcom/facebook/c/t;

    invoke-virtual {p0}, Lcom/facebook/c/h;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/pm/PackageManager;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageManager;

    invoke-virtual {p0}, Lcom/facebook/c/h;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v3, Landroid/content/Context;

    invoke-interface {v1, v3}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Lcom/facebook/c/t;-><init>(Landroid/content/pm/PackageManager;Landroid/content/pm/ApplicationInfo;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 47
    invoke-virtual {p0}, Lcom/facebook/c/h;->a()Lcom/facebook/c/t;

    move-result-object v0

    return-object v0
.end method
