.class Lcom/facebook/orca/chatheads/bn;
.super Ljava/lang/Object;
.source "ChatHeadWindowManager.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/al;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 735
    iput-object p1, p0, Lcom/facebook/orca/chatheads/bn;->a:Lcom/facebook/orca/chatheads/al;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 738
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bn;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->q(Lcom/facebook/orca/chatheads/al;)V

    .line 739
    return-void
.end method
