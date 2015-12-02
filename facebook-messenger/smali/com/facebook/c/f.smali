.class Lcom/facebook/c/f;
.super Lcom/facebook/inject/d;
.source "ContentModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/c/j;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/c/d;


# direct methods
.method private constructor <init>(Lcom/facebook/c/d;)V
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/facebook/c/f;->a:Lcom/facebook/c/d;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/c/d;Lcom/facebook/c/e;)V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0, p1}, Lcom/facebook/c/f;-><init>(Lcom/facebook/c/d;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/c/j;
    .locals 3

    .prologue
    .line 62
    new-instance v1, Lcom/facebook/c/j;

    invoke-virtual {p0}, Lcom/facebook/c/f;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v2, Landroid/content/Context;

    invoke-interface {v0, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/facebook/c/j;-><init>(Landroid/content/Context;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 57
    invoke-virtual {p0}, Lcom/facebook/c/f;->a()Lcom/facebook/c/j;

    move-result-object v0

    return-object v0
.end method
