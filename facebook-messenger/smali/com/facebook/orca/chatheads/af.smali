.class Lcom/facebook/orca/chatheads/af;
.super Ljava/lang/Object;
.source "ChatHeadTextBubbleWindow.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/ae;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/ae;)V
    .locals 0

    .prologue
    .line 25
    iput-object p1, p0, Lcom/facebook/orca/chatheads/af;->a:Lcom/facebook/orca/chatheads/ae;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/facebook/orca/chatheads/af;->a:Lcom/facebook/orca/chatheads/ae;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ae;->a(Lcom/facebook/orca/chatheads/ae;)V

    .line 29
    return-void
.end method
