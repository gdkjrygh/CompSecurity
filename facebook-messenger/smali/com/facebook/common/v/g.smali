.class Lcom/facebook/common/v/g;
.super Ljava/lang/Object;
.source "UserInteractionController.java"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field final synthetic a:Lcom/facebook/common/v/f;


# direct methods
.method constructor <init>(Lcom/facebook/common/v/f;)V
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lcom/facebook/common/v/g;->a:Lcom/facebook/common/v/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/facebook/common/v/g;->a:Lcom/facebook/common/v/f;

    invoke-static {v0}, Lcom/facebook/common/v/f;->a(Lcom/facebook/common/v/f;)V

    .line 77
    const/4 v0, 0x1

    return v0
.end method
