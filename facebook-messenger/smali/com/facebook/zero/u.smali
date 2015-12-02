.class Lcom/facebook/zero/u;
.super Lcom/facebook/inject/d;
.source "ZeroModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/zero/d/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/zero/c;


# direct methods
.method private constructor <init>(Lcom/facebook/zero/c;)V
    .locals 0

    .prologue
    .line 158
    iput-object p1, p0, Lcom/facebook/zero/u;->a:Lcom/facebook/zero/c;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V
    .locals 0

    .prologue
    .line 158
    invoke-direct {p0, p1}, Lcom/facebook/zero/u;-><init>(Lcom/facebook/zero/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/zero/d/a;
    .locals 15

    .prologue
    .line 161
    new-instance v0, Lcom/facebook/zero/d/a;

    invoke-virtual {p0}, Lcom/facebook/zero/u;->e()Lcom/facebook/inject/ab;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    invoke-interface {v1, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v2}, Lcom/facebook/zero/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/time/a;

    const-class v3, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v3}, Lcom/facebook/zero/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/prefs/shared/d;

    const-class v4, Lcom/facebook/zero/server/d;

    invoke-virtual {p0, v4}, Lcom/facebook/zero/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/zero/server/d;

    const-class v5, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {p0, v5}, Lcom/facebook/zero/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/fbservice/ops/k;

    const-class v6, Lcom/facebook/base/broadcast/a;

    invoke-virtual {p0, v6}, Lcom/facebook/zero/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/base/broadcast/a;

    const-class v7, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v7}, Lcom/facebook/zero/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/common/e/h;

    const-class v8, Lcom/facebook/zero/b/d;

    invoke-virtual {p0, v8}, Lcom/facebook/zero/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/zero/b/d;

    const-class v9, Lcom/facebook/zero/ui/h;

    invoke-virtual {p0, v9}, Lcom/facebook/zero/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/facebook/zero/ui/h;

    const-class v10, Lcom/facebook/zero/ui/p;

    invoke-virtual {p0, v10}, Lcom/facebook/zero/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/facebook/zero/ui/p;

    const-class v11, Lcom/facebook/zero/rewrite/e;

    invoke-virtual {p0, v11}, Lcom/facebook/zero/u;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/facebook/zero/rewrite/e;

    const-class v12, Ljava/lang/Boolean;

    const-class v13, Lcom/facebook/zero/annotations/IsZeroRatingFeatureEnabled;

    invoke-virtual {p0, v12, v13}, Lcom/facebook/zero/u;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v12

    const-class v13, Lcom/facebook/common/w/q;

    const-class v14, Lcom/facebook/zero/annotations/IsUserCurrentlyZeroRated;

    invoke-virtual {p0, v13, v14}, Lcom/facebook/zero/u;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v13

    invoke-direct/range {v0 .. v13}, Lcom/facebook/zero/d/a;-><init>(Landroid/content/Context;Lcom/facebook/common/time/a;Lcom/facebook/prefs/shared/d;Lcom/facebook/zero/server/d;Lcom/facebook/fbservice/ops/k;Lcom/facebook/base/broadcast/a;Lcom/facebook/common/e/h;Lcom/facebook/zero/b/d;Lcom/facebook/zero/ui/h;Lcom/facebook/zero/ui/p;Lcom/facebook/zero/rewrite/e;Ljavax/inject/a;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 158
    invoke-virtual {p0}, Lcom/facebook/zero/u;->a()Lcom/facebook/zero/d/a;

    move-result-object v0

    return-object v0
.end method
