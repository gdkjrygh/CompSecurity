.class Lcom/facebook/base/c/j;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/ui/f/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 1034
    iput-object p1, p0, Lcom/facebook/base/c/j;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 1034
    invoke-direct {p0, p1}, Lcom/facebook/base/c/j;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ui/f/b;
    .locals 3

    .prologue
    .line 1039
    new-instance v2, Lcom/facebook/ui/f/b;

    const-class v0, Landroid/app/Activity;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    const-class v1, Lcom/facebook/ui/f/a;

    invoke-virtual {p0, v1}, Lcom/facebook/base/c/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/ui/f/a;

    invoke-direct {v2, v0, v1}, Lcom/facebook/ui/f/b;-><init>(Landroid/app/Activity;Lcom/facebook/ui/f/a;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1034
    invoke-virtual {p0}, Lcom/facebook/base/c/j;->a()Lcom/facebook/ui/f/b;

    move-result-object v0

    return-object v0
.end method
