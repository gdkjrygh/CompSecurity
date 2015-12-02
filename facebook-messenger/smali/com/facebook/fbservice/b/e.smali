.class Lcom/facebook/fbservice/b/e;
.super Lcom/facebook/inject/d;
.source "BlueServiceModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/fbservice/service/p;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/fbservice/b/a;


# direct methods
.method private constructor <init>(Lcom/facebook/fbservice/b/a;)V
    .locals 0

    .prologue
    .line 75
    iput-object p1, p0, Lcom/facebook/fbservice/b/e;->a:Lcom/facebook/fbservice/b/a;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/fbservice/b/a;Lcom/facebook/fbservice/b/b;)V
    .locals 0

    .prologue
    .line 75
    invoke-direct {p0, p1}, Lcom/facebook/fbservice/b/e;-><init>(Lcom/facebook/fbservice/b/a;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/fbservice/service/p;
    .locals 3

    .prologue
    .line 79
    new-instance v2, Lcom/facebook/fbservice/service/p;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/fbservice/b/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/common/process/c;

    invoke-virtual {p0, v1}, Lcom/facebook/fbservice/b/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/process/c;

    invoke-direct {v2, v0, v1}, Lcom/facebook/fbservice/service/p;-><init>(Landroid/content/Context;Lcom/facebook/common/process/c;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 75
    invoke-virtual {p0}, Lcom/facebook/fbservice/b/e;->a()Lcom/facebook/fbservice/service/p;

    move-result-object v0

    return-object v0
.end method
