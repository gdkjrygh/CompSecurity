.class Lcom/facebook/orca/app/m;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/attachments/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 916
    iput-object p1, p0, Lcom/facebook/orca/app/m;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 916
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/m;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/attachments/a;
    .locals 5

    .prologue
    .line 919
    new-instance v2, Lcom/facebook/orca/attachments/a;

    const-class v0, Lcom/facebook/http/c/i;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/m;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/m;->e(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    invoke-virtual {p0}, Lcom/facebook/orca/app/m;->e()Lcom/facebook/inject/ab;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/inject/ab;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v1, Lcom/facebook/orca/j/c;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/j/c;

    invoke-direct {v2, v3, v4, v0, v1}, Lcom/facebook/orca/attachments/a;-><init>(Ljavax/inject/a;Ljavax/inject/a;Landroid/content/Context;Lcom/facebook/orca/j/c;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 916
    invoke-virtual {p0}, Lcom/facebook/orca/app/m;->a()Lcom/facebook/orca/attachments/a;

    move-result-object v0

    return-object v0
.end method
