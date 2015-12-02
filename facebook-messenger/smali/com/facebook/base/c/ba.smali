.class Lcom/facebook/base/c/ba;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/e/o;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 966
    iput-object p1, p0, Lcom/facebook/base/c/ba;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 966
    invoke-direct {p0, p1}, Lcom/facebook/base/c/ba;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/e/o;
    .locals 3

    .prologue
    .line 970
    new-instance v0, Lcom/facebook/common/e/o;

    const-class v1, Lcom/facebook/common/w/q;

    const-class v2, Lcom/facebook/auth/annotations/IsMeUserAnEmployee;

    invoke-virtual {p0, v1, v2}, Lcom/facebook/base/c/ba;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/common/e/o;-><init>(Ljavax/inject/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 966
    invoke-virtual {p0}, Lcom/facebook/base/c/ba;->a()Lcom/facebook/common/e/o;

    move-result-object v0

    return-object v0
.end method
