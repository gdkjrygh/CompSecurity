.class Lcom/facebook/orca/chatheads/cs;
.super Lcom/facebook/inject/d;
.source "ChatHeadsModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/orca/chatheads/ae;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/cn;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/chatheads/cn;)V
    .locals 0

    .prologue
    .line 180
    iput-object p1, p0, Lcom/facebook/orca/chatheads/cs;->a:Lcom/facebook/orca/chatheads/cn;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/chatheads/cn;Lcom/facebook/orca/chatheads/co;)V
    .locals 0

    .prologue
    .line 180
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/cs;-><init>(Lcom/facebook/orca/chatheads/cn;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/chatheads/ae;
    .locals 2

    .prologue
    .line 185
    new-instance v1, Lcom/facebook/orca/chatheads/ae;

    const-class v0, Landroid/view/WindowManager;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/cs;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-direct {v1, v0}, Lcom/facebook/orca/chatheads/ae;-><init>(Landroid/view/WindowManager;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 180
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/cs;->a()Lcom/facebook/orca/chatheads/ae;

    move-result-object v0

    return-object v0
.end method
