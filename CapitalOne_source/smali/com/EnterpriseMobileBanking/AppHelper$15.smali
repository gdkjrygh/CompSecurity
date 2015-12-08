.class final Lcom/EnterpriseMobileBanking/AppHelper$15;
.super Ljava/lang/Object;
.source "AppHelper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/AppHelper;->switchATM(Landroid/view/View;ZZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$loadAsNewUrl:Z

.field final synthetic val$showBack:Z

.field final synthetic val$url:Ljava/lang/String;

.field final synthetic val$v:Landroid/view/View;


# direct methods
.method constructor <init>(Landroid/view/View;ZZLjava/lang/String;)V
    .locals 0

    .prologue
    .line 742
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/AppHelper$15;->val$v:Landroid/view/View;

    iput-boolean p2, p0, Lcom/EnterpriseMobileBanking/AppHelper$15;->val$showBack:Z

    iput-boolean p3, p0, Lcom/EnterpriseMobileBanking/AppHelper$15;->val$loadAsNewUrl:Z

    iput-object p4, p0, Lcom/EnterpriseMobileBanking/AppHelper$15;->val$url:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 745
    # getter for: Lcom/EnterpriseMobileBanking/AppHelper;->application:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;
    invoke-static {}, Lcom/EnterpriseMobileBanking/AppHelper;->access$000()Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    move-result-object v0

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/AppHelper$15;->val$v:Landroid/view/View;

    iget-boolean v2, p0, Lcom/EnterpriseMobileBanking/AppHelper$15;->val$showBack:Z

    iget-boolean v3, p0, Lcom/EnterpriseMobileBanking/AppHelper$15;->val$loadAsNewUrl:Z

    iget-object v4, p0, Lcom/EnterpriseMobileBanking/AppHelper$15;->val$url:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->switchATM(Landroid/view/View;ZZLjava/lang/String;)V

    .line 746
    return-void
.end method
