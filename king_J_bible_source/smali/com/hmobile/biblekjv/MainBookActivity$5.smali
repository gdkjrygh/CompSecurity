.class Lcom/hmobile/biblekjv/MainBookActivity$5;
.super Ljava/lang/Object;
.source "MainBookActivity.java"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/MainBookActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/MainBookActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/MainBookActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/MainBookActivity$5;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    .line 341
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 6
    .param p1, "v"    # Landroid/widget/TextView;
    .param p2, "actionId"    # I
    .param p3, "event"    # Landroid/view/KeyEvent;

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 345
    const/4 v4, 0x3

    if-ne p2, v4, :cond_1

    .line 354
    iget-object v4, p0, Lcom/hmobile/biblekjv/MainBookActivity$5;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-virtual {v4}, Lcom/hmobile/biblekjv/MainBookActivity;->hidekeyBoard()V

    .line 355
    iget-object v4, p0, Lcom/hmobile/biblekjv/MainBookActivity$5;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iget-object v4, v4, Lcom/hmobile/biblekjv/MainBookActivity;->edtSearch:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v4}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-interface {v4}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v1

    .line 356
    .local v1, "word":Ljava/lang/String;
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-le v4, v2, :cond_0

    .line 357
    new-instance v0, Landroid/content/Intent;

    iget-object v4, p0, Lcom/hmobile/biblekjv/MainBookActivity$5;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    .line 358
    const-class v5, Lcom/hmobile/biblekjv/SearchResultActivity;

    .line 357
    invoke-direct {v0, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 359
    .local v0, "i":Landroid/content/Intent;
    const-string v4, "search_word"

    invoke-virtual {v0, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 360
    iget-object v4, p0, Lcom/hmobile/biblekjv/MainBookActivity$5;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    const/4 v5, 0x2

    invoke-virtual {v4, v0, v5}, Lcom/hmobile/biblekjv/MainBookActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 361
    iget-object v4, p0, Lcom/hmobile/biblekjv/MainBookActivity$5;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->llSearch:Landroid/widget/RelativeLayout;
    invoke-static {v4}, Lcom/hmobile/biblekjv/MainBookActivity;->access$28(Lcom/hmobile/biblekjv/MainBookActivity;)Landroid/widget/RelativeLayout;

    move-result-object v4

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 362
    iget-object v4, p0, Lcom/hmobile/biblekjv/MainBookActivity$5;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    iput-boolean v3, v4, Lcom/hmobile/biblekjv/MainBookActivity;->isSearchBarOpen:Z

    .line 363
    iget-object v4, p0, Lcom/hmobile/biblekjv/MainBookActivity$5;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->txtBookAndChapterName:Landroid/widget/TextView;
    invoke-static {v4}, Lcom/hmobile/biblekjv/MainBookActivity;->access$29(Lcom/hmobile/biblekjv/MainBookActivity;)Landroid/widget/TextView;

    move-result-object v4

    .line 364
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 365
    iget-object v4, p0, Lcom/hmobile/biblekjv/MainBookActivity$5;->this$0:Lcom/hmobile/biblekjv/MainBookActivity;

    # getter for: Lcom/hmobile/biblekjv/MainBookActivity;->imgSearch:Landroid/widget/ImageView;
    invoke-static {v4}, Lcom/hmobile/biblekjv/MainBookActivity;->access$30(Lcom/hmobile/biblekjv/MainBookActivity;)Landroid/widget/ImageView;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 369
    .end local v0    # "i":Landroid/content/Intent;
    .end local v1    # "word":Ljava/lang/String;
    :cond_0
    :goto_0
    return v2

    :cond_1
    move v2, v3

    goto :goto_0
.end method
