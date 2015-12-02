.class Lcom/facebook/orca/background/j;
.super Lcom/facebook/inject/d;
.source "MessagesBackgroundModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/background/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/background/f;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/background/f;)V
    .locals 0

    .prologue
    .line 95
    iput-object p1, p0, Lcom/facebook/orca/background/j;->a:Lcom/facebook/orca/background/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/background/f;Lcom/facebook/orca/background/g;)V
    .locals 0

    .prologue
    .line 95
    invoke-direct {p0, p1}, Lcom/facebook/orca/background/j;-><init>(Lcom/facebook/orca/background/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/background/d;
    .locals 6

    .prologue
    .line 100
    new-instance v0, Lcom/facebook/orca/background/d;

    const-class v1, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/background/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/auth/b/b;

    const-class v2, Lcom/facebook/orca/f/k;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/background/j;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    invoke-virtual {p0}, Lcom/facebook/orca/background/j;->e()Lcom/facebook/inject/ab;

    move-result-object v3

    const-class v4, Lcom/facebook/fbservice/ops/k;

    invoke-interface {v3, v4}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/fbservice/ops/k;

    const-class v4, Landroid/support/v4/a/e;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/background/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/support/v4/a/e;

    const-class v5, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/background/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/common/time/a;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/background/d;-><init>(Lcom/facebook/auth/b/b;Ljavax/inject/a;Lcom/facebook/fbservice/ops/k;Landroid/support/v4/a/e;Lcom/facebook/common/time/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 95
    invoke-virtual {p0}, Lcom/facebook/orca/background/j;->a()Lcom/facebook/orca/background/d;

    move-result-object v0

    return-object v0
.end method
