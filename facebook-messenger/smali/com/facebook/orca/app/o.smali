.class Lcom/facebook/orca/app/o;
.super Lcom/facebook/inject/d;
.source "MessagesModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/f/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/app/h;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/app/h;)V
    .locals 0

    .prologue
    .line 956
    iput-object p1, p0, Lcom/facebook/orca/app/o;->a:Lcom/facebook/orca/app/h;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/app/h;Lcom/facebook/orca/app/i;)V
    .locals 0

    .prologue
    .line 956
    invoke-direct {p0, p1}, Lcom/facebook/orca/app/o;-><init>(Lcom/facebook/orca/app/h;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/f/g;
    .locals 4

    .prologue
    .line 961
    new-instance v3, Lcom/facebook/orca/f/g;

    const-class v0, Lcom/facebook/orca/f/ad;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/app/o;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/ad;

    const-class v1, Lcom/facebook/orca/f/k;

    invoke-virtual {p0, v1}, Lcom/facebook/orca/app/o;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/f/k;

    const-class v2, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v2}, Lcom/facebook/orca/app/o;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/e/h;

    invoke-direct {v3, v0, v1, v2}, Lcom/facebook/orca/f/g;-><init>(Lcom/facebook/orca/f/ad;Lcom/facebook/orca/f/k;Lcom/facebook/common/e/h;)V

    return-object v3
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 956
    invoke-virtual {p0}, Lcom/facebook/orca/app/o;->a()Lcom/facebook/orca/f/g;

    move-result-object v0

    return-object v0
.end method
