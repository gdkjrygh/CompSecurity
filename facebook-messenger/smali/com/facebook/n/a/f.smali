.class Lcom/facebook/n/a/f;
.super Lcom/facebook/inject/d;
.source "SpringModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/n/k;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/n/a/b;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/facebook/n/a/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/n/k;
    .locals 1

    .prologue
    .line 56
    new-instance v0, Lcom/facebook/n/k;

    invoke-direct {v0}, Lcom/facebook/n/k;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 52
    invoke-virtual {p0}, Lcom/facebook/n/a/f;->a()Lcom/facebook/n/k;

    move-result-object v0

    return-object v0
.end method
