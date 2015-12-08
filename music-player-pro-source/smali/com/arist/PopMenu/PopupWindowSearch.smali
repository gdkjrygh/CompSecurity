.class public Lcom/arist/PopMenu/PopupWindowSearch;
.super Landroid/widget/PopupWindow;
.source "PopupWindowSearch.java"


# instance fields
.field private inflater:Landroid/view/LayoutInflater;

.field private layout:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 6
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "handler"    # Landroid/os/Handler;

    .prologue
    const/4 v5, 0x1

    .line 23
    invoke-direct {p0, p1}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    .line 24
    new-instance v2, Landroid/widget/LinearLayout;

    invoke-direct {v2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/arist/PopMenu/PopupWindowSearch;->layout:Landroid/widget/LinearLayout;

    .line 25
    iget-object v2, p0, Lcom/arist/PopMenu/PopupWindowSearch;->layout:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 26
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    iput-object v2, p0, Lcom/arist/PopMenu/PopupWindowSearch;->inflater:Landroid/view/LayoutInflater;

    .line 27
    iget-object v2, p0, Lcom/arist/PopMenu/PopupWindowSearch;->inflater:Landroid/view/LayoutInflater;

    const v3, 0x7f030017

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 28
    .local v1, "v":Landroid/view/View;
    const v2, 0x7f0d005e

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    .line 29
    .local v0, "et":Landroid/widget/EditText;
    new-instance v2, Lcom/arist/PopMenu/PopupWindowSearch$1;

    invoke-direct {v2, p0, p2}, Lcom/arist/PopMenu/PopupWindowSearch$1;-><init>(Lcom/arist/PopMenu/PopupWindowSearch;Landroid/os/Handler;)V

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 40
    iget-object v2, p0, Lcom/arist/PopMenu/PopupWindowSearch;->layout:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 41
    iget-object v2, p0, Lcom/arist/PopMenu/PopupWindowSearch;->layout:Landroid/widget/LinearLayout;

    invoke-super {p0, v2}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 42
    const/4 v2, -0x1

    invoke-super {p0, v2}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 43
    const/4 v2, -0x2

    invoke-super {p0, v2}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 44
    invoke-super {p0, v5}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 45
    return-void
.end method
