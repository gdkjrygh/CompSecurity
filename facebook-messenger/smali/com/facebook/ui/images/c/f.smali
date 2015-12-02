.class Lcom/facebook/ui/images/c/f;
.super Lcom/facebook/inject/d;
.source "ImageModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/ui/images/b/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ui/images/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/ui/images/c/a;)V
    .locals 0

    .prologue
    .line 154
    iput-object p1, p0, Lcom/facebook/ui/images/c/f;->a:Lcom/facebook/ui/images/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/ui/images/c/a;Lcom/facebook/ui/images/c/b;)V
    .locals 0

    .prologue
    .line 154
    invoke-direct {p0, p1}, Lcom/facebook/ui/images/c/f;-><init>(Lcom/facebook/ui/images/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ui/images/b/h;
    .locals 5

    .prologue
    .line 158
    new-instance v4, Lcom/facebook/ui/images/b/h;

    const-class v0, Lcom/facebook/ui/images/cache/a;

    invoke-virtual {p0, v0}, Lcom/facebook/ui/images/c/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/cache/a;

    const-class v1, Lcom/facebook/common/executors/n;

    invoke-virtual {p0, v1}, Lcom/facebook/ui/images/c/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/executors/n;

    const-class v2, Lcom/facebook/ui/images/b/a;

    invoke-virtual {p0, v2}, Lcom/facebook/ui/images/c/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/ui/images/b/l;

    const-class v3, Lcom/facebook/ui/images/b/e;

    invoke-virtual {p0, v3}, Lcom/facebook/ui/images/c/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/ui/images/b/e;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/facebook/ui/images/b/h;-><init>(Lcom/facebook/ui/images/cache/a;Lcom/facebook/common/executors/n;Lcom/facebook/ui/images/b/l;Lcom/facebook/ui/images/b/e;)V

    return-object v4
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 154
    invoke-virtual {p0}, Lcom/facebook/ui/images/c/f;->a()Lcom/facebook/ui/images/b/h;

    move-result-object v0

    return-object v0
.end method
