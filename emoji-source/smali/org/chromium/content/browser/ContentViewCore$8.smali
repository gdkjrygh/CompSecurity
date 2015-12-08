.class Lorg/chromium/content/browser/ContentViewCore$8;
.super Ljava/lang/Object;
.source "ContentViewCore.java"

# interfaces
.implements Lorg/chromium/content/browser/SelectActionModeCallback$ActionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/ContentViewCore;->showSelectActionBar()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/ContentViewCore;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/ContentViewCore;)V
    .locals 0

    .prologue
    .line 1833
    iput-object p1, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public copy()V
    .locals 1

    .prologue
    .line 1846
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$1500(Lorg/chromium/content/browser/ContentViewCore;)Lorg/chromium/content/browser/input/ImeAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lorg/chromium/content/browser/input/ImeAdapter;->copy()Z

    .line 1847
    return-void
.end method

.method public cut()V
    .locals 1

    .prologue
    .line 1841
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$1500(Lorg/chromium/content/browser/ContentViewCore;)Lorg/chromium/content/browser/input/ImeAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lorg/chromium/content/browser/input/ImeAdapter;->cut()Z

    .line 1842
    return-void
.end method

.method public isSelectionEditable()Z
    .locals 1

    .prologue
    .line 1904
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mFocusedNodeEditable:Z
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$400(Lorg/chromium/content/browser/ContentViewCore;)Z

    move-result v0

    return v0
.end method

.method public isSelectionPassword()Z
    .locals 1

    .prologue
    .line 1899
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$1500(Lorg/chromium/content/browser/ContentViewCore;)Lorg/chromium/content/browser/input/ImeAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lorg/chromium/content/browser/input/ImeAdapter;->isSelectionPassword()Z

    move-result v0

    return v0
.end method

.method public isShareAvailable()Z
    .locals 3

    .prologue
    .line 1924
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1925
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "text/plain"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 1926
    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v1}, Lorg/chromium/content/browser/ContentViewCore;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/high16 v2, 0x10000

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    return v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public isWebSearchAvailable()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 1932
    iget-object v2, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v2}, Lorg/chromium/content/browser/ContentViewCore;->getContentViewClient()Lorg/chromium/content/browser/ContentViewClient;

    move-result-object v2

    invoke-virtual {v2}, Lorg/chromium/content/browser/ContentViewClient;->doesPerformWebSearch()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1935
    :cond_0
    :goto_0
    return v1

    .line 1933
    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.WEB_SEARCH"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1934
    .local v0, "intent":Landroid/content/Intent;
    const-string v2, "new_search"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1935
    iget-object v2, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v2}, Lorg/chromium/content/browser/ContentViewCore;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/high16 v3, 0x10000

    invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-gtz v2, :cond_0

    const/4 v1, 0x0

    goto :goto_0
.end method

.method public onDestroyActionMode()V
    .locals 3

    .prologue
    .line 1909
    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    const/4 v2, 0x0

    # setter for: Lorg/chromium/content/browser/ContentViewCore;->mActionMode:Landroid/view/ActionMode;
    invoke-static {v1, v2}, Lorg/chromium/content/browser/ContentViewCore;->access$1602(Lorg/chromium/content/browser/ContentViewCore;Landroid/view/ActionMode;)Landroid/view/ActionMode;

    .line 1910
    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mUnselectAllOnActionModeDismiss:Z
    invoke-static {v1}, Lorg/chromium/content/browser/ContentViewCore;->access$1700(Lorg/chromium/content/browser/ContentViewCore;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1911
    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # invokes: Lorg/chromium/content/browser/ContentViewCore;->hideTextHandles()V
    invoke-static {v1}, Lorg/chromium/content/browser/ContentViewCore;->access$500(Lorg/chromium/content/browser/ContentViewCore;)V

    .line 1912
    invoke-virtual {p0}, Lorg/chromium/content/browser/ContentViewCore$8;->isSelectionEditable()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1913
    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mEditable:Landroid/text/Editable;
    invoke-static {v1}, Lorg/chromium/content/browser/ContentViewCore;->access$1800(Lorg/chromium/content/browser/ContentViewCore;)Landroid/text/Editable;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v0

    .line 1914
    .local v0, "selectionEnd":I
    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mInputConnection:Lorg/chromium/content/browser/input/AdapterInputConnection;
    invoke-static {v1}, Lorg/chromium/content/browser/ContentViewCore;->access$1900(Lorg/chromium/content/browser/ContentViewCore;)Lorg/chromium/content/browser/input/AdapterInputConnection;

    move-result-object v1

    invoke-virtual {v1, v0, v0}, Lorg/chromium/content/browser/input/AdapterInputConnection;->setSelection(II)Z

    .line 1919
    .end local v0    # "selectionEnd":I
    :cond_0
    :goto_0
    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v1}, Lorg/chromium/content/browser/ContentViewCore;->getContentViewClient()Lorg/chromium/content/browser/ContentViewClient;

    move-result-object v1

    invoke-virtual {v1}, Lorg/chromium/content/browser/ContentViewClient;->onContextualActionBarHidden()V

    .line 1920
    return-void

    .line 1916
    :cond_1
    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;
    invoke-static {v1}, Lorg/chromium/content/browser/ContentViewCore;->access$1500(Lorg/chromium/content/browser/ContentViewCore;)Lorg/chromium/content/browser/input/ImeAdapter;

    move-result-object v1

    invoke-virtual {v1}, Lorg/chromium/content/browser/input/ImeAdapter;->unselect()Z

    goto :goto_0
.end method

.method public paste()V
    .locals 1

    .prologue
    .line 1851
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$1500(Lorg/chromium/content/browser/ContentViewCore;)Lorg/chromium/content/browser/input/ImeAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lorg/chromium/content/browser/input/ImeAdapter;->paste()Z

    .line 1852
    return-void
.end method

.method public search()V
    .locals 4

    .prologue
    .line 1874
    iget-object v2, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v2}, Lorg/chromium/content/browser/ContentViewCore;->getSelectedText()Ljava/lang/String;

    move-result-object v1

    .line 1875
    .local v1, "query":Ljava/lang/String;
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1895
    :goto_0
    return-void

    .line 1878
    :cond_0
    iget-object v2, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v2}, Lorg/chromium/content/browser/ContentViewCore;->getContentViewClient()Lorg/chromium/content/browser/ContentViewClient;

    move-result-object v2

    invoke-virtual {v2}, Lorg/chromium/content/browser/ContentViewClient;->doesPerformWebSearch()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1879
    iget-object v2, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v2}, Lorg/chromium/content/browser/ContentViewCore;->getContentViewClient()Lorg/chromium/content/browser/ContentViewClient;

    move-result-object v2

    invoke-virtual {v2, v1}, Lorg/chromium/content/browser/ContentViewClient;->performWebSearch(Ljava/lang/String;)V

    goto :goto_0

    .line 1883
    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.WEB_SEARCH"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1884
    .local v0, "i":Landroid/content/Intent;
    const-string v2, "new_search"

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1885
    const-string v2, "query"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1886
    const-string v2, "com.android.browser.application_id"

    iget-object v3, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v3}, Lorg/chromium/content/browser/ContentViewCore;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1887
    iget-object v2, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v2}, Lorg/chromium/content/browser/ContentViewCore;->getContext()Landroid/content/Context;

    move-result-object v2

    instance-of v2, v2, Landroid/app/Activity;

    if-nez v2, :cond_2

    .line 1888
    const/high16 v2, 0x10000000

    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1891
    :cond_2
    :try_start_0
    iget-object v2, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v2}, Lorg/chromium/content/browser/ContentViewCore;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1892
    :catch_0
    move-exception v2

    goto :goto_0
.end method

.method public selectAll()V
    .locals 1

    .prologue
    .line 1836
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mImeAdapter:Lorg/chromium/content/browser/input/ImeAdapter;
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$1500(Lorg/chromium/content/browser/ContentViewCore;)Lorg/chromium/content/browser/input/ImeAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lorg/chromium/content/browser/input/ImeAdapter;->selectAll()Z

    .line 1837
    return-void
.end method

.method public share()V
    .locals 5

    .prologue
    .line 1856
    iget-object v3, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v3}, Lorg/chromium/content/browser/ContentViewCore;->getSelectedText()Ljava/lang/String;

    move-result-object v1

    .line 1857
    .local v1, "query":Ljava/lang/String;
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1870
    :goto_0
    return-void

    .line 1859
    :cond_0
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.SEND"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1860
    .local v2, "send":Landroid/content/Intent;
    const-string v3, "text/plain"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 1861
    const-string v3, "android.intent.extra.TEXT"

    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1863
    :try_start_0
    iget-object v3, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v3}, Lorg/chromium/content/browser/ContentViewCore;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lorg/chromium/content/R$string;->actionbar_share:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    .line 1865
    .local v0, "i":Landroid/content/Intent;
    const/high16 v3, 0x10000000

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 1866
    iget-object v3, p0, Lorg/chromium/content/browser/ContentViewCore$8;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v3}, Lorg/chromium/content/browser/ContentViewCore;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1867
    .end local v0    # "i":Landroid/content/Intent;
    :catch_0
    move-exception v3

    goto :goto_0
.end method
