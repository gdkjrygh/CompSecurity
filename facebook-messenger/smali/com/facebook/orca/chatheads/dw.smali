.class Lcom/facebook/orca/chatheads/dw;
.super Ljava/lang/Object;
.source "FloatingChatWindow.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/dv;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/dv;)V
    .locals 0

    .prologue
    .line 125
    iput-object p1, p0, Lcom/facebook/orca/chatheads/dw;->a:Lcom/facebook/orca/chatheads/dv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 128
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dw;->a:Lcom/facebook/orca/chatheads/dv;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dw;->a:Lcom/facebook/orca/chatheads/dv;

    invoke-virtual {v1}, Lcom/facebook/orca/chatheads/dv;->k()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/dv;->a(Landroid/view/WindowManager$LayoutParams;)V

    .line 129
    return-void
.end method
