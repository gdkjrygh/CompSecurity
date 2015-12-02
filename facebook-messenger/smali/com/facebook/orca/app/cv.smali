.class Lcom/facebook/orca/app/cv;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/threadlist/af;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1461
    iput-object p1, p0, Lcom/facebook/orca/app/cv;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1461
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/cv;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threadlist/af;
    .locals 6

    .prologue
    .line 1465
    new-instance v0, Lcom/facebook/orca/threadlist/af;

    const-class v1, Landroid/content/Context;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/cv;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/facebook/orca/f/b;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/cv;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/f/b;

    const-class v3, Lcom/facebook/orca/f/x;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/cv;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/f/x;

    const-class v4, Lcom/facebook/orca/photos/a/e;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/app/cv;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/orca/photos/a/e;

    const-class v5, Landroid/view/LayoutInflater;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/app/cv;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/LayoutInflater;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/threadlist/af;-><init>(Landroid/content/Context;Lcom/facebook/orca/f/b;Lcom/facebook/orca/f/x;Lcom/facebook/orca/photos/a/e;Landroid/view/LayoutInflater;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1461
    invoke-virtual {p0}, Lcom/facebook/orca/app/cv;->a()Lcom/facebook/orca/threadlist/af;

    move-result-object v0

    return-object v0
.end method
