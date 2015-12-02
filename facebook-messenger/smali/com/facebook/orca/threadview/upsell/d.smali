.class Lcom/facebook/orca/threadview/upsell/d;
.super Ljava/lang/Object;
.source "MergedThreadsUpsellController.java"

# interfaces
.implements Lcom/facebook/orca/threadview/upsell/k;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/upsell/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/upsell/a;)V
    .locals 0

    .prologue
    .line 189
    iput-object p1, p0, Lcom/facebook/orca/threadview/upsell/d;->a:Lcom/facebook/orca/threadview/upsell/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 193
    iget-object v0, p0, Lcom/facebook/orca/threadview/upsell/d;->a:Lcom/facebook/orca/threadview/upsell/a;

    invoke-static {v0}, Lcom/facebook/orca/threadview/upsell/a;->d(Lcom/facebook/orca/threadview/upsell/a;)Lcom/facebook/widget/ConfirmationView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/widget/ConfirmationView;->a()V

    .line 194
    return-void
.end method
