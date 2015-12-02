.class Lcom/facebook/ui/b/c;
.super Lcom/facebook/inject/d;
.source "ChoreographerSupportModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/ui/b/d;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/ui/b/b;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/facebook/ui/b/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ui/b/d;
    .locals 1

    .prologue
    .line 20
    new-instance v0, Lcom/facebook/ui/b/d;

    invoke-direct {v0}, Lcom/facebook/ui/b/d;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 17
    invoke-virtual {p0}, Lcom/facebook/ui/b/c;->a()Lcom/facebook/ui/b/d;

    move-result-object v0

    return-object v0
.end method
