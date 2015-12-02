.class Lcom/facebook/orca/chatheads/x;
.super Ljava/lang/Object;
.source "ChatHeadTextBubbleView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/v;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/v;)V
    .locals 0

    .prologue
    .line 122
    iput-object p1, p0, Lcom/facebook/orca/chatheads/x;->a:Lcom/facebook/orca/chatheads/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lcom/facebook/orca/chatheads/x;->a:Lcom/facebook/orca/chatheads/v;

    invoke-static {v0, p1}, Lcom/facebook/orca/chatheads/v;->a(Lcom/facebook/orca/chatheads/v;Landroid/view/View;)V

    .line 126
    return-void
.end method
