.class Lcom/facebook/base/c/z;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/inject/x;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 906
    iput-object p1, p0, Lcom/facebook/base/c/z;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 906
    invoke-direct {p0, p1}, Lcom/facebook/base/c/z;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/inject/x;
    .locals 2

    .prologue
    .line 911
    invoke-virtual {p0}, Lcom/facebook/base/c/z;->c()Lcom/facebook/inject/t;

    move-result-object v0

    .line 912
    instance-of v1, v0, Lcom/facebook/inject/bb;

    if-eqz v1, :cond_0

    .line 913
    check-cast v0, Lcom/facebook/inject/bb;

    invoke-virtual {v0}, Lcom/facebook/inject/bb;->b()Lcom/facebook/inject/ab;

    move-result-object v0

    .line 915
    :cond_0
    check-cast v0, Lcom/facebook/inject/u;

    invoke-virtual {v0}, Lcom/facebook/inject/u;->b()Lcom/facebook/inject/x;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 906
    invoke-virtual {p0}, Lcom/facebook/base/c/z;->a()Lcom/facebook/inject/x;

    move-result-object v0

    return-object v0
.end method
