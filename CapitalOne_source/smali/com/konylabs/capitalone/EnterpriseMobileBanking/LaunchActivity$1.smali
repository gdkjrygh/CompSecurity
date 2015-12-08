.class Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity$1;
.super Ljava/lang/Object;
.source "LaunchActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;->onStart()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;

.field final synthetic val$action:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity$1;->this$0:Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;

    iput-object p2, p0, Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity$1;->val$action:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 80
    # getter for: Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;->launch:Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;
    invoke-static {}, Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;->access$000()Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity$1;->this$0:Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;

    iget-object v1, p0, Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity$1;->val$action:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;->startActivity(Landroid/content/Intent;)V

    .line 83
    iget-object v0, p0, Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity$1;->this$0:Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;

    invoke-virtual {v0}, Lcom/konylabs/capitalone/EnterpriseMobileBanking/LaunchActivity;->finish()V

    .line 85
    :cond_0
    return-void
.end method
