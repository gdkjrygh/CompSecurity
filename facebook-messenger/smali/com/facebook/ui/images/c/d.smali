.class Lcom/facebook/ui/images/c/d;
.super Lcom/facebook/inject/d;
.source "ImageModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/ui/images/b/c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ui/images/c/a;


# direct methods
.method private constructor <init>(Lcom/facebook/ui/images/c/a;)V
    .locals 0

    .prologue
    .line 146
    iput-object p1, p0, Lcom/facebook/ui/images/c/d;->a:Lcom/facebook/ui/images/c/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/ui/images/c/a;Lcom/facebook/ui/images/c/b;)V
    .locals 0

    .prologue
    .line 146
    invoke-direct {p0, p1}, Lcom/facebook/ui/images/c/d;-><init>(Lcom/facebook/ui/images/c/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ui/images/b/c;
    .locals 2

    .prologue
    .line 150
    new-instance v1, Lcom/facebook/ui/images/b/c;

    const-class v0, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v0}, Lcom/facebook/ui/images/c/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/a;

    invoke-direct {v1, v0}, Lcom/facebook/ui/images/b/c;-><init>(Lcom/facebook/common/executors/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 146
    invoke-virtual {p0}, Lcom/facebook/ui/images/c/d;->a()Lcom/facebook/ui/images/b/c;

    move-result-object v0

    return-object v0
.end method
