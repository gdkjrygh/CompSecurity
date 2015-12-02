.class Lcom/facebook/orca/threadview/q;
.super Ljava/lang/Object;
.source "MessageItemView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/l;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/l;)V
    .locals 0

    .prologue
    .line 553
    iput-object p1, p0, Lcom/facebook/orca/threadview/q;->a:Lcom/facebook/orca/threadview/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 556
    iget-object v0, p0, Lcom/facebook/orca/threadview/q;->a:Lcom/facebook/orca/threadview/l;

    invoke-static {v0}, Lcom/facebook/orca/threadview/l;->c(Lcom/facebook/orca/threadview/l;)V

    .line 557
    return-void
.end method
