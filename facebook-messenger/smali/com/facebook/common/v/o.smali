.class Lcom/facebook/common/v/o;
.super Lcom/facebook/inject/d;
.source "UserInteractionModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/v/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/common/v/k;


# direct methods
.method private constructor <init>(Lcom/facebook/common/v/k;)V
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lcom/facebook/common/v/o;->a:Lcom/facebook/common/v/k;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/common/v/k;Lcom/facebook/common/v/l;)V
    .locals 0

    .prologue
    .line 65
    invoke-direct {p0, p1}, Lcom/facebook/common/v/o;-><init>(Lcom/facebook/common/v/k;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/v/d;
    .locals 4

    .prologue
    .line 70
    new-instance v3, Lcom/facebook/common/v/d;

    const-class v0, Lcom/facebook/base/broadcast/a;

    invoke-virtual {p0, v0}, Lcom/facebook/common/v/o;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/broadcast/a;

    const-class v1, Lcom/facebook/common/hardware/q;

    invoke-virtual {p0, v1}, Lcom/facebook/common/v/o;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/hardware/q;

    const-class v2, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v2}, Lcom/facebook/common/v/o;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/time/a;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/common/v/d;-><init>(Lcom/facebook/base/broadcast/a;Lcom/facebook/common/hardware/q;Lcom/facebook/common/time/a;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 65
    invoke-virtual {p0}, Lcom/facebook/common/v/o;->a()Lcom/facebook/common/v/d;

    move-result-object v0

    return-object v0
.end method
