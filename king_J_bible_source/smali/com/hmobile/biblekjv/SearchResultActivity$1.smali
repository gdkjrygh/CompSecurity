.class Lcom/hmobile/biblekjv/SearchResultActivity$1;
.super Ljava/lang/Object;
.source "SearchResultActivity.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/SearchResultActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/widget/AdapterView$OnItemSelectedListener;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/SearchResultActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/SearchResultActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/SearchResultActivity$1;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 5
    .param p2, "arg1"    # Landroid/view/View;
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
    const/4 v4, 0x0

    .line 90
    if-eqz p3, :cond_0

    .line 91
    iget-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity$1;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v2, Lcom/hmobile/biblekjv/SearchResultActivity;->m_list:Ljava/util/ArrayList;

    .line 92
    iget-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity$1;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    iget-object v2, v2, Lcom/hmobile/biblekjv/SearchResultActivity;->spnBook:Landroid/widget/Spinner;

    invoke-virtual {v2}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 93
    .local v1, "bookname":Ljava/lang/String;
    const-string v2, "\\("

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 94
    .local v0, "book":[Ljava/lang/String;
    iget-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity$1;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    const/4 v3, 0x1

    aget-object v4, v0, v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/hmobile/biblekjv/SearchResultActivity;->SearchVerse(ZLjava/lang/String;)V

    .line 98
    .end local v0    # "book":[Ljava/lang/String;
    .end local v1    # "bookname":Ljava/lang/String;
    :goto_0
    return-void

    .line 96
    :cond_0
    iget-object v2, p0, Lcom/hmobile/biblekjv/SearchResultActivity$1;->this$0:Lcom/hmobile/biblekjv/SearchResultActivity;

    const-string v3, ""

    invoke-virtual {v2, v4, v3}, Lcom/hmobile/biblekjv/SearchResultActivity;->SearchVerse(ZLjava/lang/String;)V

    goto :goto_0
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 103
    .local p1, "arg0":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    return-void
.end method
