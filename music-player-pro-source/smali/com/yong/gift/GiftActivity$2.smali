.class Lcom/yong/gift/GiftActivity$2;
.super Ljava/lang/Object;
.source "GiftActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yong/gift/GiftActivity;->findView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/widget/AdapterView$OnItemClickListener;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/yong/gift/GiftActivity;


# direct methods
.method constructor <init>(Lcom/yong/gift/GiftActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/yong/gift/GiftActivity$2;->this$0:Lcom/yong/gift/GiftActivity;

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .param p2, "arg1"    # Landroid/view/View;
    .param p3, "arg2"    # I
    .param p4, "arg3"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 86
    .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    iget-object v3, p0, Lcom/yong/gift/GiftActivity$2;->this$0:Lcom/yong/gift/GiftActivity;

    # getter for: Lcom/yong/gift/GiftActivity;->giftListViewAdapter:Lcom/yong/gift/GiftListViewAdapter;
    invoke-static {v3}, Lcom/yong/gift/GiftActivity;->access$1(Lcom/yong/gift/GiftActivity;)Lcom/yong/gift/GiftListViewAdapter;

    move-result-object v3

    .line 87
    invoke-virtual {v3, p3}, Lcom/yong/gift/GiftListViewAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v3

    .line 86
    check-cast v3, Lcom/yong/gift/GiftEntity;

    .line 87
    invoke-virtual {v3}, Lcom/yong/gift/GiftEntity;->getMarketUrl()Ljava/lang/String;

    move-result-object v1

    .line 88
    .local v1, "marketUrl":Ljava/lang/String;
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 89
    .local v2, "uri":Landroid/net/Uri;
    new-instance v0, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v0, v3, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 90
    .local v0, "intent3":Landroid/content/Intent;
    iget-object v3, p0, Lcom/yong/gift/GiftActivity$2;->this$0:Lcom/yong/gift/GiftActivity;

    invoke-virtual {v3, v0}, Lcom/yong/gift/GiftActivity;->startActivity(Landroid/content/Intent;)V

    .line 91
    return-void
.end method
