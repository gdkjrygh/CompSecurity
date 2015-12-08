.class public Lorg/chromium/content/browser/input/SelectPopupDialog;
.super Ljava/lang/Object;
.source "SelectPopupDialog.java"

# interfaces
.implements Lorg/chromium/content/browser/input/SelectPopup;


# static fields
.field private static final SELECT_DIALOG_ATTRS:[I


# instance fields
.field private final mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

.field private final mContext:Landroid/content/Context;

.field private final mListBoxPopup:Landroid/app/AlertDialog;

.field private mSelectionNotified:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 26
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Lorg/chromium/content/R$attr;->select_dialog_multichoice:I

    aput v2, v0, v1

    const/4 v1, 0x1

    sget v2, Lorg/chromium/content/R$attr;->select_dialog_singlechoice:I

    aput v2, v0, v1

    sput-object v0, Lorg/chromium/content/browser/input/SelectPopupDialog;->SELECT_DIALOG_ATTRS:[I

    return-void
.end method

.method public constructor <init>(Lorg/chromium/content/browser/ContentViewCore;Ljava/util/List;Z[I)V
    .locals 8
    .param p1, "contentViewCore"    # Lorg/chromium/content/browser/ContentViewCore;
    .param p3, "multiple"    # Z
    .param p4, "selected"    # [I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/chromium/content/browser/ContentViewCore;",
            "Ljava/util/List",
            "<",
            "Lorg/chromium/content/browser/input/SelectPopupItem;",
            ">;Z[I)V"
        }
    .end annotation

    .prologue
    .local p2, "items":Ljava/util/List;, "Ljava/util/List<Lorg/chromium/content/browser/input/SelectPopupItem;>;"
    const/4 v7, 0x0

    const/4 v6, 0x1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lorg/chromium/content/browser/input/SelectPopupDialog;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    .line 41
    iget-object v4, p0, Lorg/chromium/content/browser/input/SelectPopupDialog;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v4}, Lorg/chromium/content/browser/ContentViewCore;->getContext()Landroid/content/Context;

    move-result-object v4

    iput-object v4, p0, Lorg/chromium/content/browser/input/SelectPopupDialog;->mContext:Landroid/content/Context;

    .line 43
    new-instance v3, Landroid/widget/ListView;

    iget-object v4, p0, Lorg/chromium/content/browser/input/SelectPopupDialog;->mContext:Landroid/content/Context;

    invoke-direct {v3, v4}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 44
    .local v3, "listView":Landroid/widget/ListView;
    invoke-virtual {v3, v7}, Landroid/widget/ListView;->setCacheColorHint(I)V

    .line 45
    new-instance v4, Landroid/app/AlertDialog$Builder;

    iget-object v5, p0, Lorg/chromium/content/browser/input/SelectPopupDialog;->mContext:Landroid/content/Context;

    invoke-direct {v4, v5}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4, v3}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v4

    invoke-virtual {v4, v6}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v4

    invoke-virtual {v4, v6}, Landroid/app/AlertDialog$Builder;->setInverseBackgroundForced(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 50
    .local v1, "b":Landroid/app/AlertDialog$Builder;
    if-eqz p3, :cond_0

    .line 51
    const v4, 0x104000a

    new-instance v5, Lorg/chromium/content/browser/input/SelectPopupDialog$1;

    invoke-direct {v5, p0, v3}, Lorg/chromium/content/browser/input/SelectPopupDialog$1;-><init>(Lorg/chromium/content/browser/input/SelectPopupDialog;Landroid/widget/ListView;)V

    invoke-virtual {v1, v4, v5}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 57
    const/high16 v4, 0x1040000

    new-instance v5, Lorg/chromium/content/browser/input/SelectPopupDialog$2;

    invoke-direct {v5, p0}, Lorg/chromium/content/browser/input/SelectPopupDialog$2;-><init>(Lorg/chromium/content/browser/input/SelectPopupDialog;)V

    invoke-virtual {v1, v4, v5}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 65
    :cond_0
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v4

    iput-object v4, p0, Lorg/chromium/content/browser/input/SelectPopupDialog;->mListBoxPopup:Landroid/app/AlertDialog;

    .line 66
    new-instance v0, Lorg/chromium/content/browser/input/SelectPopupAdapter;

    iget-object v4, p0, Lorg/chromium/content/browser/input/SelectPopupDialog;->mContext:Landroid/content/Context;

    invoke-direct {p0, p3}, Lorg/chromium/content/browser/input/SelectPopupDialog;->getSelectDialogLayout(Z)I

    move-result v5

    invoke-direct {v0, v4, v5, p2}, Lorg/chromium/content/browser/input/SelectPopupAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 68
    .local v0, "adapter":Lorg/chromium/content/browser/input/SelectPopupAdapter;
    invoke-virtual {v3, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 69
    invoke-virtual {v3, v6}, Landroid/widget/ListView;->setFocusableInTouchMode(Z)V

    .line 71
    if-eqz p3, :cond_1

    .line 72
    const/4 v4, 0x2

    invoke-virtual {v3, v4}, Landroid/widget/ListView;->setChoiceMode(I)V

    .line 73
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    array-length v4, p4

    if-ge v2, v4, :cond_2

    .line 74
    aget v4, p4, v2

    invoke-virtual {v3, v4, v6}, Landroid/widget/ListView;->setItemChecked(IZ)V

    .line 73
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 77
    .end local v2    # "i":I
    :cond_1
    invoke-virtual {v3, v6}, Landroid/widget/ListView;->setChoiceMode(I)V

    .line 78
    new-instance v4, Lorg/chromium/content/browser/input/SelectPopupDialog$3;

    invoke-direct {v4, p0, v3}, Lorg/chromium/content/browser/input/SelectPopupDialog$3;-><init>(Lorg/chromium/content/browser/input/SelectPopupDialog;Landroid/widget/ListView;)V

    invoke-virtual {v3, v4}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 86
    array-length v4, p4

    if-lez v4, :cond_2

    .line 87
    aget v4, p4, v7

    invoke-virtual {v3, v4}, Landroid/widget/ListView;->setSelection(I)V

    .line 88
    aget v4, p4, v7

    invoke-virtual {v3, v4, v6}, Landroid/widget/ListView;->setItemChecked(IZ)V

    .line 91
    :cond_2
    iget-object v4, p0, Lorg/chromium/content/browser/input/SelectPopupDialog;->mListBoxPopup:Landroid/app/AlertDialog;

    new-instance v5, Lorg/chromium/content/browser/input/SelectPopupDialog$4;

    invoke-direct {v5, p0}, Lorg/chromium/content/browser/input/SelectPopupDialog$4;-><init>(Lorg/chromium/content/browser/input/SelectPopupDialog;)V

    invoke-virtual {v4, v5}, Landroid/app/AlertDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 97
    return-void
.end method

.method static synthetic access$000(Landroid/widget/ListView;)[I
    .locals 1
    .param p0, "x0"    # Landroid/widget/ListView;

    .prologue
    .line 25
    invoke-static {p0}, Lorg/chromium/content/browser/input/SelectPopupDialog;->getSelectedIndices(Landroid/widget/ListView;)[I

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$100(Lorg/chromium/content/browser/input/SelectPopupDialog;[I)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/content/browser/input/SelectPopupDialog;
    .param p1, "x1"    # [I

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/input/SelectPopupDialog;->notifySelection([I)V

    return-void
.end method

.method static synthetic access$200(Lorg/chromium/content/browser/input/SelectPopupDialog;)Landroid/app/AlertDialog;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/content/browser/input/SelectPopupDialog;

    .prologue
    .line 25
    iget-object v0, p0, Lorg/chromium/content/browser/input/SelectPopupDialog;->mListBoxPopup:Landroid/app/AlertDialog;

    return-object v0
.end method

.method private getSelectDialogLayout(Z)I
    .locals 6
    .param p1, "isMultiChoice"    # Z

    .prologue
    const/4 v3, 0x0

    .line 101
    iget-object v2, p0, Lorg/chromium/content/browser/input/SelectPopupDialog;->mContext:Landroid/content/Context;

    sget v4, Lorg/chromium/content/R$style;->SelectPopupDialog:I

    sget-object v5, Lorg/chromium/content/browser/input/SelectPopupDialog;->SELECT_DIALOG_ATTRS:[I

    invoke-virtual {v2, v4, v5}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 103
    .local v1, "styledAttributes":Landroid/content/res/TypedArray;
    if-eqz p1, :cond_0

    move v2, v3

    :goto_0
    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    .line 104
    .local v0, "resourceId":I
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 105
    return v0

    .line 103
    .end local v0    # "resourceId":I
    :cond_0
    const/4 v2, 0x1

    goto :goto_0
.end method

.method private static getSelectedIndices(Landroid/widget/ListView;)[I
    .locals 7
    .param p0, "listView"    # Landroid/widget/ListView;

    .prologue
    .line 109
    invoke-virtual {p0}, Landroid/widget/ListView;->getCheckedItemPositions()Landroid/util/SparseBooleanArray;

    move-result-object v5

    .line 110
    .local v5, "sparseArray":Landroid/util/SparseBooleanArray;
    const/4 v4, 0x0

    .line 111
    .local v4, "selectedCount":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    invoke-virtual {v5}, Landroid/util/SparseBooleanArray;->size()I

    move-result v6

    if-ge v0, v6, :cond_1

    .line 112
    invoke-virtual {v5, v0}, Landroid/util/SparseBooleanArray;->valueAt(I)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 113
    add-int/lit8 v4, v4, 0x1

    .line 111
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 116
    :cond_1
    new-array v1, v4, [I

    .line 117
    .local v1, "indices":[I
    const/4 v0, 0x0

    const/4 v2, 0x0

    .local v2, "j":I
    :goto_1
    invoke-virtual {v5}, Landroid/util/SparseBooleanArray;->size()I

    move-result v6

    if-ge v0, v6, :cond_3

    .line 118
    invoke-virtual {v5, v0}, Landroid/util/SparseBooleanArray;->valueAt(I)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 119
    add-int/lit8 v3, v2, 0x1

    .end local v2    # "j":I
    .local v3, "j":I
    invoke-virtual {v5, v0}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    move-result v6

    aput v6, v1, v2

    move v2, v3

    .line 117
    .end local v3    # "j":I
    .restart local v2    # "j":I
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 122
    :cond_3
    return-object v1
.end method

.method private notifySelection([I)V
    .locals 1
    .param p1, "indicies"    # [I

    .prologue
    .line 126
    iget-boolean v0, p0, Lorg/chromium/content/browser/input/SelectPopupDialog;->mSelectionNotified:Z

    if-eqz v0, :cond_0

    .line 129
    :goto_0
    return-void

    .line 127
    :cond_0
    iget-object v0, p0, Lorg/chromium/content/browser/input/SelectPopupDialog;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p1}, Lorg/chromium/content/browser/ContentViewCore;->selectPopupMenuItems([I)V

    .line 128
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/chromium/content/browser/input/SelectPopupDialog;->mSelectionNotified:Z

    goto :goto_0
.end method


# virtual methods
.method public hide()V
    .locals 1

    .prologue
    .line 138
    iget-object v0, p0, Lorg/chromium/content/browser/input/SelectPopupDialog;->mListBoxPopup:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->cancel()V

    .line 139
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/chromium/content/browser/input/SelectPopupDialog;->notifySelection([I)V

    .line 140
    return-void
.end method

.method public show()V
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lorg/chromium/content/browser/input/SelectPopupDialog;->mListBoxPopup:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 134
    return-void
.end method
