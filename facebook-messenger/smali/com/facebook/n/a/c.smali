.class Lcom/facebook/n/a/c;
.super Lcom/facebook/inject/d;
.source "SpringModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/n/f;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/n/a/b;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/facebook/n/a/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/n/f;
    .locals 1

    .prologue
    .line 48
    new-instance v0, Lcom/facebook/n/f;

    invoke-direct {v0}, Lcom/facebook/n/f;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 45
    invoke-virtual {p0}, Lcom/facebook/n/a/c;->a()Lcom/facebook/n/f;

    move-result-object v0

    return-object v0
.end method
