.class Lcom/facebook/config/background/d;
.super Lcom/facebook/inject/d;
.source "ConfigBackgroundModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/config/background/i;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/config/background/c;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Lcom/facebook/config/background/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/config/background/i;
    .locals 6

    .prologue
    .line 64
    new-instance v0, Lcom/facebook/config/background/i;

    const-class v1, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v1}, Lcom/facebook/config/background/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/auth/b/b;

    const-class v2, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v2}, Lcom/facebook/config/background/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/prefs/shared/d;

    const-class v3, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {p0, v3}, Lcom/facebook/config/background/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/fbservice/ops/k;

    const-class v4, Ljava/lang/Long;

    const-class v5, Lcom/facebook/config/background/ConfigRefreshInterval;

    invoke-virtual {p0, v4, v5}, Lcom/facebook/config/background/d;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v5, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v5}, Lcom/facebook/config/background/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/time/a;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/config/background/i;-><init>(Lcom/facebook/auth/b/b;Lcom/facebook/prefs/shared/d;Lcom/facebook/fbservice/ops/k;Ljavax/inject/a;Lcom/facebook/common/time/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 59
    invoke-virtual {p0}, Lcom/facebook/config/background/d;->a()Lcom/facebook/config/background/i;

    move-result-object v0

    return-object v0
.end method
