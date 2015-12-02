.class Lcom/facebook/orca/app/az;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/threads/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 2079
    iput-object p1, p0, Lcom/facebook/orca/app/az;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 2079
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/az;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threads/g;
    .locals 5

    .prologue
    .line 2083
    new-instance v1, Lcom/facebook/orca/threads/g;

    const-class v0, Lcom/facebook/auth/b/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/az;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/b/b;

    const-class v2, Ljava/lang/Boolean;

    const-class v3, Lcom/facebook/orca/annotations/IsClientSmsEnabled;

    invoke-virtual {p0, v2, v3}, Lcom/facebook/orca/app/az;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    const-class v3, Ljava/lang/Boolean;

    const-class v4, Lcom/facebook/orca/annotations/IsSmsReadPermitted;

    invoke-virtual {p0, v3, v4}, Lcom/facebook/orca/app/az;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v3

    const-class v4, Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-virtual {p0, v4}, Lcom/facebook/orca/app/az;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    invoke-direct {v1, v0, v2, v3, v4}, Lcom/facebook/orca/threads/g;-><init>(Lcom/facebook/auth/b/b;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 2079
    invoke-virtual {p0}, Lcom/facebook/orca/app/az;->a()Lcom/facebook/orca/threads/g;

    move-result-object v0

    return-object v0
.end method
