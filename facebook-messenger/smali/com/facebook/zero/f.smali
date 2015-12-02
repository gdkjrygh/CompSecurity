.class Lcom/facebook/zero/f;
.super Lcom/facebook/inject/d;
.source "ZeroModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/zero/ui/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/zero/c;


# direct methods
.method private constructor <init>(Lcom/facebook/zero/c;)V
    .locals 0

    .prologue
    .line 223
    iput-object p1, p0, Lcom/facebook/zero/f;->a:Lcom/facebook/zero/c;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V
    .locals 0

    .prologue
    .line 223
    invoke-direct {p0, p1}, Lcom/facebook/zero/f;-><init>(Lcom/facebook/zero/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/zero/ui/d;
    .locals 9

    .prologue
    .line 227
    new-instance v0, Lcom/facebook/zero/ui/d;

    const-class v1, Landroid/content/Context;

    invoke-virtual {p0, v1}, Lcom/facebook/zero/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/zero/d/a;

    invoke-virtual {p0, v2}, Lcom/facebook/zero/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/zero/d/a;

    const-class v3, Lcom/facebook/zero/ui/o;

    invoke-virtual {p0, v3}, Lcom/facebook/zero/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/zero/ui/o;

    const-class v4, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v4}, Lcom/facebook/zero/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/prefs/shared/d;

    const-class v5, Lcom/facebook/c/s;

    invoke-virtual {p0, v5}, Lcom/facebook/zero/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/c/s;

    const-class v6, Lcom/facebook/analytics/av;

    invoke-virtual {p0, v6}, Lcom/facebook/zero/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/analytics/av;

    const-class v7, Lcom/facebook/common/w/q;

    const-class v8, Lcom/facebook/zero/annotations/IsUserCurrentlyZeroRated;

    invoke-virtual {p0, v7, v8}, Lcom/facebook/zero/f;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v7

    invoke-direct/range {v0 .. v7}, Lcom/facebook/zero/ui/d;-><init>(Landroid/content/Context;Lcom/facebook/zero/d/a;Lcom/facebook/zero/ui/o;Lcom/facebook/prefs/shared/d;Lcom/facebook/c/s;Lcom/facebook/analytics/av;Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 223
    invoke-virtual {p0}, Lcom/facebook/zero/f;->a()Lcom/facebook/zero/ui/d;

    move-result-object v0

    return-object v0
.end method
