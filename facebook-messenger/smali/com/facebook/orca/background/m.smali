.class Lcom/facebook/orca/background/m;
.super Lcom/facebook/inject/d;
.source "MessagesBackgroundModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/background/q;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 137
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/background/g;)V
    .locals 0

    .prologue
    .line 137
    invoke-direct {p0}, Lcom/facebook/orca/background/m;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/background/q;
    .locals 7

    .prologue
    .line 142
    new-instance v0, Lcom/facebook/orca/background/q;

    const-class v1, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/background/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/auth/b/b;

    const-class v2, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/background/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/fbservice/ops/k;

    const-class v3, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/background/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/prefs/shared/d;

    const-class v4, Lcom/facebook/base/broadcast/a;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/background/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/base/broadcast/a;

    const-class v5, Lcom/facebook/common/v/a;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/background/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/v/a;

    const-class v6, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v6}, Lcom/facebook/orca/background/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/common/time/a;

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/background/q;-><init>(Lcom/facebook/auth/b/b;Lcom/facebook/fbservice/ops/k;Lcom/facebook/prefs/shared/d;Lcom/facebook/base/broadcast/a;Lcom/facebook/common/v/a;Lcom/facebook/common/time/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 137
    invoke-virtual {p0}, Lcom/facebook/orca/background/m;->a()Lcom/facebook/orca/background/q;

    move-result-object v0

    return-object v0
.end method
