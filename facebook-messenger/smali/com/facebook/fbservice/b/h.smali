.class Lcom/facebook/fbservice/b/h;
.super Lcom/facebook/inject/d;
.source "BlueServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/fbservice/a/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/b/a;


# direct methods
.method private constructor <init>(Lcom/facebook/fbservice/b/a;)V
    .locals 0

    .prologue
    .line 123
    iput-object p1, p0, Lcom/facebook/fbservice/b/h;->a:Lcom/facebook/fbservice/b/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/fbservice/b/a;Lcom/facebook/fbservice/b/b;)V
    .locals 0

    .prologue
    .line 123
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/b/h;-><init>(Lcom/facebook/fbservice/b/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/a/a;
    .locals 4

    .prologue
    .line 128
    new-instance v3, Lcom/facebook/fbservice/a/a;

    const-class v0, Lcom/facebook/fbservice/service/p;

    invoke-virtual {p0, v0}, Lcom/facebook/fbservice/b/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/p;

    const-class v1, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {p0, v1}, Lcom/facebook/fbservice/b/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/fbservice/ops/k;

    const-class v2, Landroid/content/Context;

    invoke-virtual {p0, v2}, Lcom/facebook/fbservice/b/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/fbservice/a/a;-><init>(Lcom/facebook/fbservice/service/p;Lcom/facebook/fbservice/ops/k;Landroid/content/Context;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 123
    invoke-virtual {p0}, Lcom/facebook/fbservice/b/h;->a()Lcom/facebook/fbservice/a/a;

    move-result-object v0

    return-object v0
.end method
