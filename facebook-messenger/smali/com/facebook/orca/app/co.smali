.class Lcom/facebook/orca/app/co;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/f/x;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 1627
    iput-object p1, p0, Lcom/facebook/orca/app/co;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 1627
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/co;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/f/x;
    .locals 3

    .prologue
    .line 1631
    new-instance v2, Lcom/facebook/orca/f/x;

    const-class v0, Lcom/facebook/orca/app/g;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/co;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/app/g;

    const-class v1, Lcom/facebook/fbservice/ops/k;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/co;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/fbservice/ops/k;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/f/x;-><init>(Lcom/facebook/orca/app/g;Lcom/facebook/fbservice/ops/k;)V

    return-object v2
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1627
    invoke-virtual {p0}, Lcom/facebook/orca/app/co;->a()Lcom/facebook/orca/f/x;

    move-result-object v0

    return-object v0
.end method
