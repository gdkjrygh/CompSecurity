.class Lcom/facebook/base/c/p;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/base/broadcast/j;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 1013
    iput-object p1, p0, Lcom/facebook/base/c/p;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 1013
    invoke-direct {p0, p1}, Lcom/facebook/base/c/p;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/base/broadcast/j;
    .locals 3

    .prologue
    .line 1018
    new-instance v2, Lcom/facebook/base/broadcast/n;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/config/a/a;

    invoke-virtual {p0, v1}, Lcom/facebook/base/c/p;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/config/a/a;

    invoke-virtual {v1}, Lcom/facebook/config/a/a;->j()Lcom/facebook/base/j;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/base/j;->getPermission()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Lcom/facebook/base/broadcast/n;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1013
    invoke-virtual {p0}, Lcom/facebook/base/c/p;->a()Lcom/facebook/base/broadcast/j;

    move-result-object v0

    return-object v0
.end method
