.class Lcom/facebook/widget/b;
.super Ljava/lang/Object;
.source "ConfirmationView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/widget/ConfirmationView;


# direct methods
.method constructor <init>(Lcom/facebook/widget/ConfirmationView;)V
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/facebook/widget/b;->a:Lcom/facebook/widget/ConfirmationView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/facebook/widget/b;->a:Lcom/facebook/widget/ConfirmationView;

    invoke-static {v0}, Lcom/facebook/widget/ConfirmationView;->a(Lcom/facebook/widget/ConfirmationView;)Lcom/facebook/widget/c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 73
    iget-object v0, p0, Lcom/facebook/widget/b;->a:Lcom/facebook/widget/ConfirmationView;

    invoke-static {v0}, Lcom/facebook/widget/ConfirmationView;->a(Lcom/facebook/widget/ConfirmationView;)Lcom/facebook/widget/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/widget/c;->b()V

    .line 75
    :cond_0
    return-void
.end method
