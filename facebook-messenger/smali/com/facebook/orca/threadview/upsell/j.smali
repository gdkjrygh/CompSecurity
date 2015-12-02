.class Lcom/facebook/orca/threadview/upsell/j;
.super Ljava/lang/Object;
.source "UpsellContactView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/upsell/UpsellContactView;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/upsell/UpsellContactView;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/facebook/orca/threadview/upsell/j;->a:Lcom/facebook/orca/threadview/upsell/UpsellContactView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/j;->a:Lcom/facebook/orca/threadview/upsell/UpsellContactView;

    invoke-static {v0}, Lcom/facebook/orca/threadview/upsell/UpsellContactView;->a(Lcom/facebook/orca/threadview/upsell/UpsellContactView;)Lcom/facebook/orca/threadview/upsell/k;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/j;->a:Lcom/facebook/orca/threadview/upsell/UpsellContactView;

    invoke-static {v0}, Lcom/facebook/orca/threadview/upsell/UpsellContactView;->a(Lcom/facebook/orca/threadview/upsell/UpsellContactView;)Lcom/facebook/orca/threadview/upsell/k;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/orca/threadview/upsell/k;->a()V

    .line 64
    :cond_0
    return-void
.end method
