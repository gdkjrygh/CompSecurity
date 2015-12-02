.class Lcom/facebook/orca/nux/w;
.super Ljava/lang/Object;
.source "ThreadNuxController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/nux/u;


# direct methods
.method constructor <init>(Lcom/facebook/orca/nux/u;)V
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lcom/facebook/orca/nux/w;->a:Lcom/facebook/orca/nux/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/facebook/orca/nux/w;->a:Lcom/facebook/orca/nux/u;

    invoke-static {v0}, Lcom/facebook/orca/nux/u;->b(Lcom/facebook/orca/nux/u;)V

    .line 46
    return-void
.end method
