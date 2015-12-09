.class Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$19;
.super Ljava/lang/Object;
.source "EnterpriseMobileBanking.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;->handleLobHelper(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

.field final synthetic val$cover:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;)V
    .locals 0

    .prologue
    .line 1251
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$19;->this$0:Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking;

    iput-object p2, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$19;->val$cover:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 1255
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/EnterpriseMobileBanking$19;->val$cover:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    invoke-virtual {v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->clearLast()V

    .line 1256
    return-void
.end method
