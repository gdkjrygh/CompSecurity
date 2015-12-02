.class Lcom/facebook/orca/app/bx;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/f/n;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1426
    iput-object p1, p0, Lcom/facebook/orca/app/bx;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1426
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/bx;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/f/n;
    .locals 6

    .prologue
    .line 1430
    new-instance v0, Lcom/facebook/orca/f/n;

    const-class v1, Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/bx;->e(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v1

    const-class v2, Lcom/facebook/user/User;

    const-class v3, Lcom/facebook/auth/annotations/LoggedInUser;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/orca/app/bx;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    const-class v3, Lcom/facebook/orca/threads/a;

    invoke-virtual {p0, v3}, Lcom/facebook/orca/app/bx;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/orca/threads/a;

    const-class v4, Lcom/facebook/orca/g/e;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/app/bx;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/common/time/a;

    const-class v5, Lcom/facebook/orca/j/c;

    invoke-virtual {p0, v5}, Lcom/facebook/orca/app/bx;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/orca/j/c;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/f/n;-><init>(Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/orca/threads/a;Lcom/facebook/common/time/a;Lcom/facebook/orca/j/c;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1426
    invoke-virtual {p0}, Lcom/facebook/orca/app/bx;->a()Lcom/facebook/orca/f/n;

    move-result-object v0

    return-object v0
.end method
