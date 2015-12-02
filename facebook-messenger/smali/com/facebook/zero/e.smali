.class Lcom/facebook/zero/e;
.super Lcom/facebook/inject/d;
.source "ZeroModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/fbservice/service/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/zero/c;


# direct methods
.method private constructor <init>(Lcom/facebook/zero/c;)V
    .locals 0

    .prologue
    .line 178
    iput-object p1, p0, Lcom/facebook/zero/e;->a:Lcom/facebook/zero/c;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V
    .locals 0

    .prologue
    .line 178
    invoke-direct {p0, p1}, Lcom/facebook/zero/e;-><init>(Lcom/facebook/zero/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/service/e;
    .locals 1

    .prologue
    .line 182
    const-class v0, Lcom/facebook/zero/protocol/c;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/e;

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 178
    invoke-virtual {p0}, Lcom/facebook/zero/e;->a()Lcom/facebook/fbservice/service/e;

    move-result-object v0

    return-object v0
.end method
