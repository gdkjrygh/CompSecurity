.class Lcom/facebook/base/c/ab;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Landroid/support/v4/app/q;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 607
    iput-object p1, p0, Lcom/facebook/base/c/ab;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 607
    invoke-direct {p0, p1}, Lcom/facebook/base/c/ab;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/support/v4/app/q;
    .locals 2

    .prologue
    .line 611
    const-class v0, Landroid/app/Activity;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 612
    instance-of v1, v0, Landroid/support/v4/app/i;

    if-eqz v1, :cond_0

    .line 613
    check-cast v0, Landroid/support/v4/app/i;

    invoke-virtual {v0}, Landroid/support/v4/app/i;->f()Landroid/support/v4/app/q;

    move-result-object v0

    .line 615
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 607
    invoke-virtual {p0}, Lcom/facebook/base/c/ab;->a()Landroid/support/v4/app/q;

    move-result-object v0

    return-object v0
.end method
