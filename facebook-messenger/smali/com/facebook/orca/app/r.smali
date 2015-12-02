.class Lcom/facebook/orca/app/r;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/p/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1906
    iput-object p1, p0, Lcom/facebook/orca/app/r;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1906
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/r;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/p/b;
    .locals 6

    .prologue
    .line 1911
    new-instance v0, Lcom/facebook/orca/p/b;

    const-class v1, Lcom/facebook/l/k;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/r;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/l/k;

    const-class v2, Lcom/facebook/orca/f/k;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/r;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/f/k;

    const-class v3, Lcom/facebook/orca/f/z;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/r;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/f/z;

    const-class v4, Lcom/facebook/orca/p/e;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/app/r;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/p/e;

    const-class v5, Landroid/content/res/Resources;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/app/r;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/res/Resources;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/p/b;-><init>(Lcom/facebook/l/k;Lcom/facebook/orca/f/k;Lcom/facebook/orca/f/z;Lcom/facebook/orca/p/e;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1906
    invoke-virtual {p0}, Lcom/facebook/orca/app/r;->a()Lcom/facebook/orca/p/b;

    move-result-object v0

    return-object v0
.end method
