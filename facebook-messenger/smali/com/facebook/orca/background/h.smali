.class Lcom/facebook/orca/background/h;
.super Lcom/facebook/inject/d;
.source "MessagesBackgroundModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/background/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/background/f;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/background/f;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/facebook/orca/background/h;->a:Lcom/facebook/orca/background/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/background/f;Lcom/facebook/orca/background/g;)V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0, p1}, Lcom/facebook/orca/background/h;-><init>(Lcom/facebook/orca/background/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/background/a;
    .locals 6

    .prologue
    .line 68
    new-instance v0, Lcom/facebook/orca/background/a;

    const-class v1, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/background/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/auth/b/b;

    const-class v2, Lcom/facebook/orca/g/b;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/background/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/g/b;

    invoke-virtual {p0}, Lcom/facebook/orca/background/h;->e()Lcom/facebook/inject/ab;

    move-result-object v3

    const-class v4, Lcom/facebook/fbservice/ops/k;

    invoke-interface {v3, v4}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/fbservice/ops/k;

    const-class v4, Landroid/support/v4/a/e;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/background/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/support/v4/a/e;

    const-class v5, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/background/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/time/a;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/background/a;-><init>(Lcom/facebook/auth/b/b;Lcom/facebook/orca/g/b;Lcom/facebook/fbservice/ops/k;Landroid/support/v4/a/e;Lcom/facebook/common/time/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 63
    invoke-virtual {p0}, Lcom/facebook/orca/background/h;->a()Lcom/facebook/orca/background/a;

    move-result-object v0

    return-object v0
.end method
