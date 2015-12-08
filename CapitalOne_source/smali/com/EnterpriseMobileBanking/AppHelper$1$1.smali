.class Lcom/EnterpriseMobileBanking/AppHelper$1$1;
.super Ljava/lang/Object;
.source "AppHelper.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/AppHelper$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/AppHelper$1;

.field final synthetic val$root:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/AppHelper$1;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 191
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/AppHelper$1$1;->this$0:Lcom/EnterpriseMobileBanking/AppHelper$1;

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/AppHelper$1$1;->val$root:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 6

    .prologue
    .line 195
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/AppHelper$1$1;->val$root:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/AppHelper$1$1;->val$root:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    sub-int v0, v1, v2

    .line 196
    .local v0, "heightDiff":I
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/AppHelper$1$1;->val$root:Landroid/view/View;

    new-instance v2, Lcom/EnterpriseMobileBanking/AppHelper$1$1$1;

    invoke-direct {v2, p0, v0}, Lcom/EnterpriseMobileBanking/AppHelper$1$1$1;-><init>(Lcom/EnterpriseMobileBanking/AppHelper$1$1;I)V

    const-wide/16 v4, 0xfa

    invoke-virtual {v1, v2, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 205
    return-void
.end method
