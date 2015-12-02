.class Lcom/facebook/base/c/h;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/base/a/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 730
    iput-object p1, p0, Lcom/facebook/base/c/h;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 730
    invoke-direct {p0, p1}, Lcom/facebook/base/c/h;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/base/a/c;
    .locals 2

    .prologue
    .line 735
    new-instance v1, Lcom/facebook/base/a/c;

    const-class v0, Lcom/facebook/base/a/d;

    invoke-virtual {p0, v0}, Lcom/facebook/base/c/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/a/d;

    invoke-direct {v1, v0}, Lcom/facebook/base/a/c;-><init>(Lcom/facebook/base/a/d;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 730
    invoke-virtual {p0}, Lcom/facebook/base/c/h;->a()Lcom/facebook/base/a/c;

    move-result-object v0

    return-object v0
.end method
