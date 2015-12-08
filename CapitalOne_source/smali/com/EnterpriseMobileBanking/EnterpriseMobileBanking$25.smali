.class Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$25;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->handleBackPressed(Z)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;)V
    .locals 0

    .prologue
    .line 1765
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$25;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 1771
    const-wide/16 v2, 0x1f4

    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    .line 1772
    const/4 v1, 0x0

    # setter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->disableback:Z
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$1702(Z)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1778
    :goto_0
    return-void

    .line 1774
    :catch_0
    move-exception v0

    .line 1776
    .local v0, "ie":Ljava/lang/InterruptedException;
    # setter for: Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->disableback:Z
    invoke-static {v4}, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->access$1702(Z)Z

    goto :goto_0
.end method
