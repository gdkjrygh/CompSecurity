.class Lcom/facebook/base/c/ak;
.super Lcom/facebook/inject/d;
.source "FbBaseModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Landroid_src/e/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/base/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/base/c/a;)V
    .locals 0

    .prologue
    .line 958
    iput-object p1, p0, Lcom/facebook/base/c/ak;->a:Lcom/facebook/base/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/base/c/a;Lcom/facebook/base/c/b;)V
    .locals 0

    .prologue
    .line 958
    invoke-direct {p0, p1}, Lcom/facebook/base/c/ak;-><init>(Lcom/facebook/base/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Landroid_src/e/a;
    .locals 1

    .prologue
    .line 962
    new-instance v0, Landroid_src/e/a;

    invoke-direct {v0}, Landroid_src/e/a;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 958
    invoke-virtual {p0}, Lcom/facebook/base/c/ak;->a()Landroid_src/e/a;

    move-result-object v0

    return-object v0
.end method
