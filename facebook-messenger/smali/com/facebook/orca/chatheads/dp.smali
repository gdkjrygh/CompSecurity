.class Lcom/facebook/orca/chatheads/dp;
.super Ljava/lang/Object;
.source "ChatThreadView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/dh;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/dh;)V
    .locals 0

    .prologue
    .line 787
    iput-object p1, p0, Lcom/facebook/orca/chatheads/dp;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 790
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dp;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->e(Lcom/facebook/orca/chatheads/dh;)V

    .line 791
    return-void
.end method
