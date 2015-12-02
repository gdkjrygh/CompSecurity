.class Lcom/facebook/ui/media/b/f;
.super Lcom/facebook/inject/d;
.source "MediaModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/ui/media/b/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ui/media/b/c;


# direct methods
.method private constructor <init>(Lcom/facebook/ui/media/b/c;)V
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lcom/facebook/ui/media/b/f;->a:Lcom/facebook/ui/media/b/c;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/ui/media/b/c;Lcom/facebook/ui/media/b/d;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0, p1}, Lcom/facebook/ui/media/b/f;-><init>(Lcom/facebook/ui/media/b/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ui/media/b/a;
    .locals 6

    .prologue
    .line 43
    new-instance v0, Lcom/facebook/ui/media/b/a;

    const-class v1, Landroid/content/Context;

    invoke-virtual {p0, v1}, Lcom/facebook/ui/media/b/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/ui/images/a/a;

    invoke-virtual {p0, v2}, Lcom/facebook/ui/media/b/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/ui/images/a/a;

    const-class v3, Lcom/facebook/a/a;

    invoke-virtual {p0, v3}, Lcom/facebook/ui/media/b/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/a/a;

    const-class v4, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v4}, Lcom/facebook/ui/media/b/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/common/executors/a;

    const-class v5, Lcom/facebook/ui/media/attachments/d;

    invoke-virtual {p0, v5}, Lcom/facebook/ui/media/b/f;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/ui/media/attachments/d;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/ui/media/b/a;-><init>(Landroid/content/Context;Lcom/facebook/ui/images/a/a;Lcom/facebook/a/a;Lcom/facebook/common/executors/a;Lcom/facebook/ui/media/attachments/d;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 39
    invoke-virtual {p0}, Lcom/facebook/ui/media/b/f;->a()Lcom/facebook/ui/media/b/a;

    move-result-object v0

    return-object v0
.end method
