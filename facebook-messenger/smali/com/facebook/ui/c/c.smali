.class Lcom/facebook/ui/c/c;
.super Lcom/facebook/inject/d;
.source "DiskModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/ui/c/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ui/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/ui/c/a;)V
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/facebook/ui/c/c;->a:Lcom/facebook/ui/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/ui/c/a;Lcom/facebook/ui/c/b;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0, p1}, Lcom/facebook/ui/c/c;-><init>(Lcom/facebook/ui/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ui/c/d;
    .locals 4

    .prologue
    .line 28
    new-instance v3, Lcom/facebook/ui/c/d;

    invoke-virtual {p0}, Lcom/facebook/ui/c/c;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v1}, Lcom/facebook/ui/c/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/executors/a;

    const-class v2, Lcom/facebook/common/f/f;

    invoke-virtual {p0, v2}, Lcom/facebook/ui/c/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/f/f;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/ui/c/d;-><init>(Landroid/content/Context;Lcom/facebook/common/executors/a;Lcom/facebook/common/f/f;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 24
    invoke-virtual {p0}, Lcom/facebook/ui/c/c;->a()Lcom/facebook/ui/c/d;

    move-result-object v0

    return-object v0
.end method
