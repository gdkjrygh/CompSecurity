.class Lcom/facebook/zero/h;
.super Lcom/facebook/inject/d;
.source "ZeroModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/zero/ui/l;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/zero/c;


# direct methods
.method private constructor <init>(Lcom/facebook/zero/c;)V
    .locals 0

    .prologue
    .line 212
    iput-object p1, p0, Lcom/facebook/zero/h;->a:Lcom/facebook/zero/c;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V
    .locals 0

    .prologue
    .line 212
    invoke-direct {p0, p1}, Lcom/facebook/zero/h;-><init>(Lcom/facebook/zero/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/zero/ui/l;
    .locals 3

    .prologue
    .line 216
    new-instance v2, Lcom/facebook/zero/ui/l;

    const-class v0, Landroid/content/res/Resources;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/res/Resources;

    const-class v1, Lcom/facebook/zero/ui/o;

    invoke-virtual {p0, v1}, Lcom/facebook/zero/h;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/zero/ui/o;

    invoke-direct {v2, v0, v1}, Lcom/facebook/zero/ui/l;-><init>(Landroid/content/res/Resources;Lcom/facebook/zero/ui/o;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 212
    invoke-virtual {p0}, Lcom/facebook/zero/h;->a()Lcom/facebook/zero/ui/l;

    move-result-object v0

    return-object v0
.end method
