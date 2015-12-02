.class Lcom/facebook/config/server/f;
.super Lcom/facebook/inject/d;
.source "DefaultServerConfigModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/config/server/b;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/config/server/e;)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0}, Lcom/facebook/config/server/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/config/server/b;
    .locals 8

    .prologue
    .line 75
    new-instance v0, Lcom/facebook/config/server/b;

    const-class v1, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v1}, Lcom/facebook/config/server/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/prefs/shared/d;

    const-class v2, Lcom/facebook/base/broadcast/a;

    invoke-virtual {p0, v2}, Lcom/facebook/config/server/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/base/broadcast/a;

    const-class v3, Ljava/lang/Boolean;

    const-class v4, Lcom/facebook/prefs/shared/IsInternalPrefsEnabled;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/config/server/f;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v4, Ljava/lang/Boolean;

    const-class v5, Lcom/facebook/config/server/IsBootstrapEnabled;

    invoke-virtual {p0, v4, v5}, Lcom/facebook/config/server/f;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v5, Lcom/facebook/config/a/a;

    invoke-virtual {p0, v5}, Lcom/facebook/config/server/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/config/a/a;

    const-class v6, Lcom/facebook/common/v/a;

    invoke-virtual {p0, v6}, Lcom/facebook/config/server/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/common/v/a;

    const-class v7, Lcom/facebook/config/server/q;

    invoke-virtual {p0, v7}, Lcom/facebook/config/server/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/facebook/config/server/q;

    invoke-direct/range {v0 .. v7}, Lcom/facebook/config/server/b;-><init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/base/broadcast/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/config/a/a;Lcom/facebook/common/v/a;Lcom/facebook/config/server/q;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 71
    invoke-virtual {p0}, Lcom/facebook/config/server/f;->a()Lcom/facebook/config/server/b;

    move-result-object v0

    return-object v0
.end method
