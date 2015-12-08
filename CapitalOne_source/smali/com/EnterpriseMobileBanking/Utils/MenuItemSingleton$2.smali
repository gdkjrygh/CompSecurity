.class Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$2;
.super Ljava/lang/Object;
.source "MenuItemSingleton.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->clear()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$2;->this$0:Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$2;->this$0:Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;

    # getter for: Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->items:Ljava/util/ArrayList;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->access$000(Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 45
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$2;->this$0:Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;

    # getter for: Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->listener:Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$ChangeListener;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->access$100(Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;)Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$ChangeListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 46
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$2;->this$0:Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;

    # getter for: Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->listener:Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$ChangeListener;
    invoke-static {v0}, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;->access$100(Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton;)Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$ChangeListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/EnterpriseMobileBanking/Utils/MenuItemSingleton$ChangeListener;->dataChanged()V

    .line 48
    :cond_0
    return-void
.end method
