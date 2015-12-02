.class Lcom/facebook/fbservice/b/g;
.super Lcom/facebook/inject/d;
.source "BlueServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/fbservice/ops/p;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/b/a;


# direct methods
.method private constructor <init>(Lcom/facebook/fbservice/b/a;)V
    .locals 0

    .prologue
    .line 99
    iput-object p1, p0, Lcom/facebook/fbservice/b/g;->a:Lcom/facebook/fbservice/b/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/fbservice/b/a;Lcom/facebook/fbservice/b/b;)V
    .locals 0

    .prologue
    .line 99
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/b/g;-><init>(Lcom/facebook/fbservice/b/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/ops/p;
    .locals 6

    .prologue
    .line 104
    new-instance v0, Lcom/facebook/fbservice/ops/p;

    const-class v1, Landroid/content/Context;

    invoke-virtual {p0, v1}, Lcom/facebook/fbservice/b/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/fbservice/service/p;

    invoke-virtual {p0, v2}, Lcom/facebook/fbservice/b/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/fbservice/service/p;

    const-class v3, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v3}, Lcom/facebook/fbservice/b/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/common/executors/a;

    const-class v4, Lcom/facebook/auth/viewercontext/e;

    invoke-virtual {p0, v4}, Lcom/facebook/fbservice/b/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/auth/viewercontext/e;

    const-class v5, Lcom/facebook/common/process/d;

    invoke-virtual {p0, v5}, Lcom/facebook/fbservice/b/g;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/process/d;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/fbservice/ops/p;-><init>(Landroid/content/Context;Lcom/facebook/fbservice/service/p;Lcom/facebook/common/executors/a;Lcom/facebook/auth/viewercontext/e;Lcom/facebook/common/process/d;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 99
    invoke-virtual {p0}, Lcom/facebook/fbservice/b/g;->a()Lcom/facebook/fbservice/ops/p;

    move-result-object v0

    return-object v0
.end method
