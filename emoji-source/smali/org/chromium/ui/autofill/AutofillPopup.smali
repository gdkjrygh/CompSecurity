.class public Lorg/chromium/ui/autofill/AutofillPopup;
.super Lorg/chromium/ui/DropdownPopupWindow;
.source "AutofillPopup.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/ui/autofill/AutofillPopup$AutofillPopupDelegate;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final ITEM_ID_SEPARATOR_ENTRY:I = -0x3


# instance fields
.field private final mAutofillCallback:Lorg/chromium/ui/autofill/AutofillPopup$AutofillPopupDelegate;

.field private final mContext:Landroid/content/Context;

.field private mSuggestions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lorg/chromium/ui/autofill/AutofillSuggestion;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const-class v0, Lorg/chromium/ui/autofill/AutofillPopup;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/ui/autofill/AutofillPopup;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;Lorg/chromium/ui/base/ViewAndroidDelegate;Lorg/chromium/ui/autofill/AutofillPopup$AutofillPopupDelegate;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "viewAndroidDelegate"    # Lorg/chromium/ui/base/ViewAndroidDelegate;
    .param p3, "autofillCallback"    # Lorg/chromium/ui/autofill/AutofillPopup$AutofillPopupDelegate;

    .prologue
    .line 68
    invoke-direct {p0, p1, p2}, Lorg/chromium/ui/DropdownPopupWindow;-><init>(Landroid/content/Context;Lorg/chromium/ui/base/ViewAndroidDelegate;)V

    .line 69
    iput-object p1, p0, Lorg/chromium/ui/autofill/AutofillPopup;->mContext:Landroid/content/Context;

    .line 70
    iput-object p3, p0, Lorg/chromium/ui/autofill/AutofillPopup;->mAutofillCallback:Lorg/chromium/ui/autofill/AutofillPopup$AutofillPopupDelegate;

    .line 72
    invoke-virtual {p0, p0}, Lorg/chromium/ui/autofill/AutofillPopup;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 73
    invoke-virtual {p0, p0}, Lorg/chromium/ui/autofill/AutofillPopup;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 74
    return-void
.end method


# virtual methods
.method public filterAndShow([Lorg/chromium/ui/autofill/AutofillSuggestion;Z)V
    .locals 11
    .param p1, "suggestions"    # [Lorg/chromium/ui/autofill/AutofillSuggestion;
    .param p2, "isRtl"    # Z
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x1

    .line 82
    new-instance v8, Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v8, p0, Lorg/chromium/ui/autofill/AutofillPopup;->mSuggestions:Ljava/util/List;

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .local v0, "cleanedData":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/chromium/ui/DropdownItem;>;"
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 86
    .local v4, "separators":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/Integer;>;"
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    array-length v8, p1

    if-ge v2, v8, :cond_1

    .line 87
    aget-object v8, p1, v2

    invoke-virtual {v8}, Lorg/chromium/ui/autofill/AutofillSuggestion;->getSuggestionId()I

    move-result v3

    .line 88
    .local v3, "itemId":I
    const/4 v8, -0x3

    if-ne v3, v8, :cond_0

    .line 89
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 86
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 91
    :cond_0
    aget-object v8, p1, v2

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 95
    .end local v3    # "itemId":I
    :cond_1
    new-instance v8, Lorg/chromium/ui/DropdownAdapter;

    iget-object v9, p0, Lorg/chromium/ui/autofill/AutofillPopup;->mContext:Landroid/content/Context;

    invoke-direct {v8, v9, v0, v4}, Lorg/chromium/ui/DropdownAdapter;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/util/Set;)V

    invoke-virtual {p0, v8}, Lorg/chromium/ui/autofill/AutofillPopup;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 96
    invoke-virtual {p0}, Lorg/chromium/ui/autofill/AutofillPopup;->show()V

    .line 97
    invoke-virtual {p0}, Lorg/chromium/ui/autofill/AutofillPopup;->getListView()Landroid/widget/ListView;

    move-result-object v8

    if-eqz p2, :cond_2

    :goto_2
    invoke-static {v8, v6}, Lorg/chromium/base/ApiCompatibilityUtils;->setLayoutDirection(Landroid/view/View;I)V

    .line 105
    :try_start_0
    const-class v6, Landroid/widget/ListPopupWindow;

    const-string v7, "setForceIgnoreOutsideTouch"

    const/4 v8, 0x1

    new-array v8, v8, [Ljava/lang/Class;

    const/4 v9, 0x0

    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v10, v8, v9

    invoke-virtual {v6, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 107
    .local v5, "setForceIgnoreOutsideTouch":Ljava/lang/reflect/Method;
    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    const/4 v8, 0x1

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    aput-object v8, v6, v7

    invoke-virtual {v5, p0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    .end local v5    # "setForceIgnoreOutsideTouch":Ljava/lang/reflect/Method;
    :goto_3
    return-void

    :cond_2
    move v6, v7

    .line 97
    goto :goto_2

    .line 108
    :catch_0
    move-exception v1

    .line 109
    .local v1, "e":Ljava/lang/Exception;
    const-string v6, "AutofillPopup"

    const-string v7, "ListPopupWindow.setForceIgnoreOutsideTouch not found"

    invoke-static {v6, v7, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_3
.end method

.method public hide()V
    .locals 0

    .prologue
    .line 119
    invoke-virtual {p0}, Lorg/chromium/ui/autofill/AutofillPopup;->dismiss()V

    .line 120
    return-void
.end method

.method public onDismiss()V
    .locals 1

    .prologue
    .line 132
    iget-object v0, p0, Lorg/chromium/ui/autofill/AutofillPopup;->mAutofillCallback:Lorg/chromium/ui/autofill/AutofillPopup$AutofillPopupDelegate;

    invoke-interface {v0}, Lorg/chromium/ui/autofill/AutofillPopup$AutofillPopupDelegate;->dismissed()V

    .line 133
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .param p2, "view"    # Landroid/view/View;
    .param p3, "position"    # I
    .param p4, "id"    # J
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
    .line 124
    .local p1, "parent":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    check-cast v0, Lorg/chromium/ui/DropdownAdapter;

    .line 125
    .local v0, "adapter":Lorg/chromium/ui/DropdownAdapter;
    iget-object v2, p0, Lorg/chromium/ui/autofill/AutofillPopup;->mSuggestions:Ljava/util/List;

    invoke-virtual {v0, p3}, Lorg/chromium/ui/DropdownAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    .line 126
    .local v1, "listIndex":I
    sget-boolean v2, Lorg/chromium/ui/autofill/AutofillPopup;->$assertionsDisabled:Z

    if-nez v2, :cond_0

    const/4 v2, -0x1

    if-gt v1, v2, :cond_0

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2}, Ljava/lang/AssertionError;-><init>()V

    throw v2

    .line 127
    :cond_0
    iget-object v2, p0, Lorg/chromium/ui/autofill/AutofillPopup;->mAutofillCallback:Lorg/chromium/ui/autofill/AutofillPopup$AutofillPopupDelegate;

    invoke-interface {v2, v1}, Lorg/chromium/ui/autofill/AutofillPopup$AutofillPopupDelegate;->suggestionSelected(I)V

    .line 128
    return-void
.end method
