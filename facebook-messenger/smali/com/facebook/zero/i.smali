.class Lcom/facebook/zero/i;
.super Lcom/facebook/inject/d;
.source "ZeroModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/zero/ui/o;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/zero/c;


# direct methods
.method private constructor <init>(Lcom/facebook/zero/c;)V
    .locals 0

    .prologue
    .line 201
    iput-object p1, p0, Lcom/facebook/zero/i;->a:Lcom/facebook/zero/c;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/zero/c;Lcom/facebook/zero/d;)V
    .locals 0

    .prologue
    .line 201
    invoke-direct {p0, p1}, Lcom/facebook/zero/i;-><init>(Lcom/facebook/zero/c;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/zero/ui/o;
    .locals 5

    .prologue
    .line 205
    new-instance v2, Lcom/facebook/zero/ui/o;

    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {p0, v0}, Lcom/facebook/zero/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    const-class v1, Lcom/facebook/zero/d/a;

    invoke-virtual {p0, v1}, Lcom/facebook/zero/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/zero/d/a;

    const-class v3, Lcom/facebook/common/w/q;

    const-class v4, Lcom/facebook/zero/annotations/IsUserCurrentlyZeroRated;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/zero/i;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    invoke-direct {v2, v0, v1, v3}, Lcom/facebook/zero/ui/o;-><init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/zero/d/a;Ljavax/inject/a;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 201
    invoke-virtual {p0}, Lcom/facebook/zero/i;->a()Lcom/facebook/zero/ui/o;

    move-result-object v0

    return-object v0
.end method
