.class Lcom/facebook/n/a/d;
.super Lcom/facebook/inject/d;
.source "SpringModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/n/h;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/n/a/b;)V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0}, Lcom/facebook/n/a/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/n/h;
    .locals 1

    .prologue
    .line 64
    new-instance v0, Lcom/facebook/n/h;

    invoke-direct {v0}, Lcom/facebook/n/h;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 60
    invoke-virtual {p0}, Lcom/facebook/n/a/d;->a()Lcom/facebook/n/h;

    move-result-object v0

    return-object v0
.end method
