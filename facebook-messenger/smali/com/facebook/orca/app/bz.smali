.class Lcom/facebook/orca/app/bz;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/phonenumber/identification/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 2009
    iput-object p1, p0, Lcom/facebook/orca/app/bz;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 2009
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/bz;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/phonenumber/identification/a;
    .locals 5

    .prologue
    .line 2014
    new-instance v3, Lcom/facebook/orca/phonenumber/identification/a;

    const-class v0, Landroid/support/v4/a/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/bz;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/a/e;

    const-class v1, Lcom/facebook/http/protocol/aq;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/bz;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v4

    const-class v1, Lcom/facebook/orca/protocol/methods/ag;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/bz;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/protocol/methods/ag;

    const-class v2, Lcom/facebook/orca/phonenumber/identification/f;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/bz;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/orca/phonenumber/identification/f;

    invoke-direct {v3, v0, v4, v1, v2}, Lcom/facebook/orca/phonenumber/identification/a;-><init>(Landroid/support/v4/a/e;Ljavax/inject/a;Lcom/facebook/orca/protocol/methods/ag;Lcom/facebook/orca/phonenumber/identification/f;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 2009
    invoke-virtual {p0}, Lcom/facebook/orca/app/bz;->a()Lcom/facebook/orca/phonenumber/identification/a;

    move-result-object v0

    return-object v0
.end method
