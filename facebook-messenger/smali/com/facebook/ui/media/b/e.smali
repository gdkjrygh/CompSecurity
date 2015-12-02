.class Lcom/facebook/ui/media/b/e;
.super Lcom/facebook/inject/d;
.source "MediaModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/ui/media/attachments/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/ui/media/b/c;


# direct methods
.method private constructor <init>(Lcom/facebook/ui/media/b/c;)V
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/facebook/ui/media/b/e;->a:Lcom/facebook/ui/media/b/c;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/ui/media/b/c;Lcom/facebook/ui/media/b/d;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0, p1}, Lcom/facebook/ui/media/b/e;-><init>(Lcom/facebook/ui/media/b/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/ui/media/attachments/d;
    .locals 2

    .prologue
    .line 33
    new-instance v1, Lcom/facebook/ui/media/attachments/d;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/ui/media/b/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/facebook/ui/media/attachments/d;-><init>(Landroid/content/Context;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 29
    invoke-virtual {p0}, Lcom/facebook/ui/media/b/e;->a()Lcom/facebook/ui/media/attachments/d;

    move-result-object v0

    return-object v0
.end method
