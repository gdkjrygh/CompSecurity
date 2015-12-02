.class Lcom/facebook/common/v/m;
.super Lcom/facebook/inject/d;
.source "UserInteractionModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/common/v/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/common/v/k;


# direct methods
.method private constructor <init>(Lcom/facebook/common/v/k;)V
    .locals 0

    .prologue
    .line 56
    iput-object p1, p0, Lcom/facebook/common/v/m;->a:Lcom/facebook/common/v/k;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/common/v/k;Lcom/facebook/common/v/l;)V
    .locals 0

    .prologue
    .line 56
    invoke-direct {p0, p1}, Lcom/facebook/common/v/m;-><init>(Lcom/facebook/common/v/k;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/common/v/c;
    .locals 1

    .prologue
    .line 61
    const-class v0, Lcom/facebook/common/v/a;

    invoke-virtual {p0, v0}, Lcom/facebook/common/v/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/v/a;

    invoke-virtual {v0}, Lcom/facebook/common/v/a;->f()Lcom/facebook/common/v/c;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 56
    invoke-virtual {p0}, Lcom/facebook/common/v/m;->a()Lcom/facebook/common/v/c;

    move-result-object v0

    return-object v0
.end method
