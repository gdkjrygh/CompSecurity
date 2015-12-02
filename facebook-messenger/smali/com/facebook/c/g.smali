.class Lcom/facebook/c/g;
.super Lcom/facebook/inject/d;
.source "ContentModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/c/s;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/c/d;


# direct methods
.method private constructor <init>(Lcom/facebook/c/d;)V
    .locals 0

    .prologue
    .line 35
    iput-object p1, p0, Lcom/facebook/c/g;->a:Lcom/facebook/c/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/c/d;Lcom/facebook/c/e;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lcom/facebook/c/g;-><init>(Lcom/facebook/c/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/c/s;
    .locals 5

    .prologue
    .line 39
    new-instance v2, Lcom/facebook/c/s;

    invoke-virtual {p0}, Lcom/facebook/c/g;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const-class v0, Lcom/facebook/c/t;

    invoke-virtual {p0, v0}, Lcom/facebook/c/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/t;

    const-class v1, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v1}, Lcom/facebook/c/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/e/h;

    const-class v4, Lcom/facebook/c/o;

    invoke-virtual {p0, v4}, Lcom/facebook/c/g;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v2, v3, v0, v1, v4}, Lcom/facebook/c/s;-><init>(Ljava/lang/String;Lcom/facebook/c/t;Lcom/facebook/common/e/h;Ljava/util/Set;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 35
    invoke-virtual {p0}, Lcom/facebook/c/g;->a()Lcom/facebook/c/s;

    move-result-object v0

    return-object v0
.end method
