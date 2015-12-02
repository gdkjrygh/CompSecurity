.class Lcom/facebook/zero/j;
.super Lcom/facebook/inject/d;
.source "ZeroModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/zero/protocol/a/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/zero/c;


# direct methods
.method private constructor <init>(Lcom/facebook/zero/c;)V
    .locals 0

    .prologue
    .line 150
    iput-object p1, p0, Lcom/facebook/zero/j;->a:Lcom/facebook/zero/c;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V
    .locals 0

    .prologue
    .line 150
    invoke-direct {p0, p1}, Lcom/facebook/zero/j;-><init>(Lcom/facebook/zero/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/zero/protocol/a/a;
    .locals 2

    .prologue
    .line 153
    new-instance v1, Lcom/facebook/zero/protocol/a/a;

    const-class v0, Lcom/facebook/zero/ui/h;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/j;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/ui/h;

    invoke-direct {v1, v0}, Lcom/facebook/zero/protocol/a/a;-><init>(Lcom/facebook/zero/ui/h;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 150
    invoke-virtual {p0}, Lcom/facebook/zero/j;->a()Lcom/facebook/zero/protocol/a/a;

    move-result-object v0

    return-object v0
.end method
