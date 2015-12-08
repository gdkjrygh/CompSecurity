.class Lcom/hmobile/biblekjv/TodayActivity$2;
.super Ljava/lang/Object;
.source "TodayActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/TodayActivity;->onCreate(Landroid/os/Bundle;)V
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
.field final synthetic this$0:Lcom/hmobile/biblekjv/TodayActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/TodayActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/TodayActivity$2;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    .line 190
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 9
    .param p2, "v"    # Landroid/view/View;
    .param p3, "pos"    # I
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
    .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    const/4 v8, 0x0

    const/4 v7, 0x1

    .line 195
    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object v2

    .line 196
    .local v2, "o":Ljava/lang/Object;
    iget-object v5, p0, Lcom/hmobile/biblekjv/TodayActivity$2;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v5, v5, Lcom/hmobile/biblekjv/TodayActivity;->m_strings:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v1

    .line 197
    .local v1, "index":I
    iget-object v5, p0, Lcom/hmobile/biblekjv/TodayActivity$2;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    iget-object v5, v5, Lcom/hmobile/biblekjv/TodayActivity;->m_tempstrings:Ljava/util/ArrayList;

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 198
    .local v4, "temp":Ljava/lang/String;
    const-string v5, "###"

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 199
    .local v3, "search":[Ljava/lang/String;
    new-instance v0, Landroid/content/Intent;

    iget-object v5, p0, Lcom/hmobile/biblekjv/TodayActivity$2;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    .line 200
    const-class v6, Lcom/hmobile/biblekjv/SearchResultActivity;

    .line 199
    invoke-direct {v0, v5, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 201
    .local v0, "i":Landroid/content/Intent;
    const-string v5, "BookName"

    aget-object v6, v3, v8

    invoke-virtual {v0, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 202
    const-string v5, "ChapCount"

    aget-object v6, v3, v7

    invoke-virtual {v0, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 203
    const-string v5, "FromToday"

    invoke-virtual {v0, v5, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 204
    const-string v5, "isFromAuto"

    invoke-virtual {v0, v5, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 205
    iget-object v5, p0, Lcom/hmobile/biblekjv/TodayActivity$2;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    const/4 v6, 0x2

    invoke-virtual {v5, v0, v6}, Lcom/hmobile/biblekjv/TodayActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 206
    iget-object v5, p0, Lcom/hmobile/biblekjv/TodayActivity$2;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    # getter for: Lcom/hmobile/biblekjv/TodayActivity;->llSearch:Landroid/widget/RelativeLayout;
    invoke-static {v5}, Lcom/hmobile/biblekjv/TodayActivity;->access$4(Lcom/hmobile/biblekjv/TodayActivity;)Landroid/widget/RelativeLayout;

    move-result-object v5

    const/16 v6, 0x8

    invoke-virtual {v5, v6}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 207
    iget-object v5, p0, Lcom/hmobile/biblekjv/TodayActivity$2;->this$0:Lcom/hmobile/biblekjv/TodayActivity;

    # getter for: Lcom/hmobile/biblekjv/TodayActivity;->imgSearch:Landroid/widget/ImageView;
    invoke-static {v5}, Lcom/hmobile/biblekjv/TodayActivity;->access$5(Lcom/hmobile/biblekjv/TodayActivity;)Landroid/widget/ImageView;

    move-result-object v5

    invoke-virtual {v5, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 208
    return-void
.end method
