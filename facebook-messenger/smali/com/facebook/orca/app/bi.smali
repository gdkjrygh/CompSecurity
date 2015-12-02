.class Lcom/facebook/orca/app/bi;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/threads/l;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1660
    iput-object p1, p0, Lcom/facebook/orca/app/bi;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1660
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/bi;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threads/l;
    .locals 3

    .prologue
    .line 1664
    new-instance v1, Lcom/facebook/orca/threads/l;

    const-class v0, Lcom/facebook/user/User;

    const-class v2, Lcom/facebook/auth/annotations/LoggedInUser;

    invoke-virtual {p0, v0, v2}, Lcom/facebook/orca/app/bi;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v2

    const-class v0, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/bi;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    invoke-direct {v1, v2, v0}, Lcom/facebook/orca/threads/l;-><init>(Ljavax/inject/a;Lcom/facebook/common/time/a;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1660
    invoke-virtual {p0}, Lcom/facebook/orca/app/bi;->a()Lcom/facebook/orca/threads/l;

    move-result-object v0

    return-object v0
.end method
