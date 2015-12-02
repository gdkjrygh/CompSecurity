.class Lcom/facebook/common/f/c;
.super Lcom/facebook/inject/d;
.source "FileModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/f/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/common/f/a;


# direct methods
.method private constructor <init>(Lcom/facebook/common/f/a;)V
    .locals 0

    .prologue
    .line 25
    iput-object p1, p0, Lcom/facebook/common/f/c;->a:Lcom/facebook/common/f/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/common/f/a;Lcom/facebook/common/f/b;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lcom/facebook/common/f/c;-><init>(Lcom/facebook/common/f/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/f/f;
    .locals 3

    .prologue
    .line 29
    new-instance v1, Lcom/facebook/common/f/f;

    invoke-virtual {p0}, Lcom/facebook/common/f/c;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v2, Landroid/content/Context;

    invoke-interface {v0, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/facebook/common/f/f;-><init>(Landroid/content/Context;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 25
    invoke-virtual {p0}, Lcom/facebook/common/f/c;->a()Lcom/facebook/common/f/f;

    move-result-object v0

    return-object v0
.end method
