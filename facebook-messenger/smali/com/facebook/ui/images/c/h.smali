.class Lcom/facebook/ui/images/c/h;
.super Lcom/facebook/inject/d;
.source "ImageModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/ui/images/a/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ui/images/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/ui/images/c/a;)V
    .locals 0

    .prologue
    .line 136
    iput-object p1, p0, Lcom/facebook/ui/images/c/h;->a:Lcom/facebook/ui/images/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/ui/images/c/a;Lcom/facebook/ui/images/c/b;)V
    .locals 0

    .prologue
    .line 136
    invoke-direct {p0, p1}, Lcom/facebook/ui/images/c/h;-><init>(Lcom/facebook/ui/images/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ui/images/a/a;
    .locals 3

    .prologue
    .line 140
    new-instance v1, Lcom/facebook/ui/images/a/a;

    invoke-virtual {p0}, Lcom/facebook/ui/images/c/h;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v2, Landroid/content/Context;

    invoke-interface {v0, v2}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/facebook/ui/images/a/a;-><init>(Landroid/content/Context;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 136
    invoke-virtual {p0}, Lcom/facebook/ui/images/c/h;->a()Lcom/facebook/ui/images/a/a;

    move-result-object v0

    return-object v0
.end method
