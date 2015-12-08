.class public Lorg/chromium/content/browser/input/SelectPopupDropdown;
.super Ljava/lang/Object;
.source "SelectPopupDropdown.java"

# interfaces
.implements Lorg/chromium/content/browser/input/SelectPopup;


# instance fields
.field private final mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

.field private final mContext:Landroid/content/Context;

.field private final mDropdownPopupWindow:Lorg/chromium/ui/DropdownPopupWindow;

.field private mInitialSelection:I

.field private mSelectionNotified:Z


# direct methods
.method public constructor <init>(Lorg/chromium/content/browser/ContentViewCore;Ljava/util/List;Landroid/graphics/Rect;[I)V
    .locals 10
    .param p1, "contentViewCore"    # Lorg/chromium/content/browser/ContentViewCore;
    .param p3, "bounds"    # Landroid/graphics/Rect;
    .param p4, "selected"    # [I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/chromium/content/browser/ContentViewCore;",
            "Ljava/util/List",
            "<",
            "Lorg/chromium/content/browser/input/SelectPopupItem;",
            ">;",
            "Landroid/graphics/Rect;",
            "[I)V"
        }
    .end annotation

    .prologue
    .line 34
    .local p2, "items":Ljava/util/List;, "Ljava/util/List<Lorg/chromium/content/browser/input/SelectPopupItem;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const/4 v6, -0x1

    iput v6, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mInitialSelection:I

    .line 35
    iput-object p1, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    .line 36
    iget-object v6, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v6}, Lorg/chromium/content/browser/ContentViewCore;->getContext()Landroid/content/Context;

    move-result-object v6

    iput-object v6, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mContext:Landroid/content/Context;

    .line 37
    new-instance v6, Lorg/chromium/ui/DropdownPopupWindow;

    iget-object v7, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mContext:Landroid/content/Context;

    iget-object v8, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v8}, Lorg/chromium/content/browser/ContentViewCore;->getViewAndroidDelegate()Lorg/chromium/ui/base/ViewAndroidDelegate;

    move-result-object v8

    invoke-direct {v6, v7, v8}, Lorg/chromium/ui/DropdownPopupWindow;-><init>(Landroid/content/Context;Lorg/chromium/ui/base/ViewAndroidDelegate;)V

    iput-object v6, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mDropdownPopupWindow:Lorg/chromium/ui/DropdownPopupWindow;

    .line 39
    iget-object v6, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mDropdownPopupWindow:Lorg/chromium/ui/DropdownPopupWindow;

    new-instance v7, Lorg/chromium/content/browser/input/SelectPopupDropdown$1;

    invoke-direct {v7, p0}, Lorg/chromium/content/browser/input/SelectPopupDropdown$1;-><init>(Lorg/chromium/content/browser/input/SelectPopupDropdown;)V

    invoke-virtual {v6, v7}, Lorg/chromium/ui/DropdownPopupWindow;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 46
    array-length v6, p4

    if-lez v6, :cond_0

    .line 47
    const/4 v6, 0x0

    aget v6, p4, v6

    iput v6, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mInitialSelection:I

    .line 49
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v6

    new-array v6, v6, [Lorg/chromium/ui/DropdownItem;

    invoke-interface {p2, v6}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Lorg/chromium/ui/DropdownItem;

    .line 50
    .local v4, "dropdownItems":[Lorg/chromium/ui/DropdownItem;
    iget-object v6, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mDropdownPopupWindow:Lorg/chromium/ui/DropdownPopupWindow;

    new-instance v7, Lorg/chromium/ui/DropdownAdapter;

    iget-object v8, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mContext:Landroid/content/Context;

    const/4 v9, 0x0

    invoke-direct {v7, v8, v4, v9}, Lorg/chromium/ui/DropdownAdapter;-><init>(Landroid/content/Context;[Lorg/chromium/ui/DropdownItem;Ljava/util/Set;)V

    invoke-virtual {v6, v7}, Lorg/chromium/ui/DropdownPopupWindow;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 51
    iget-object v6, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v6}, Lorg/chromium/content/browser/ContentViewCore;->getRenderCoordinates()Lorg/chromium/content/browser/RenderCoordinates;

    move-result-object v5

    .line 52
    .local v5, "renderCoordinates":Lorg/chromium/content/browser/RenderCoordinates;
    iget v6, p3, Landroid/graphics/Rect;->left:I

    int-to-float v6, v6

    invoke-virtual {v5, v6}, Lorg/chromium/content/browser/RenderCoordinates;->fromLocalCssToPix(F)F

    move-result v6

    invoke-virtual {v5, v6}, Lorg/chromium/content/browser/RenderCoordinates;->fromPixToDip(F)F

    move-result v2

    .line 54
    .local v2, "anchorX":F
    iget v6, p3, Landroid/graphics/Rect;->top:I

    int-to-float v6, v6

    invoke-virtual {v5, v6}, Lorg/chromium/content/browser/RenderCoordinates;->fromLocalCssToPix(F)F

    move-result v6

    invoke-virtual {v5, v6}, Lorg/chromium/content/browser/RenderCoordinates;->fromPixToDip(F)F

    move-result v3

    .line 56
    .local v3, "anchorY":F
    iget v6, p3, Landroid/graphics/Rect;->right:I

    int-to-float v6, v6

    invoke-virtual {v5, v6}, Lorg/chromium/content/browser/RenderCoordinates;->fromLocalCssToPix(F)F

    move-result v6

    invoke-virtual {v5, v6}, Lorg/chromium/content/browser/RenderCoordinates;->fromPixToDip(F)F

    move-result v6

    sub-float v1, v6, v2

    .line 58
    .local v1, "anchorWidth":F
    iget v6, p3, Landroid/graphics/Rect;->bottom:I

    int-to-float v6, v6

    invoke-virtual {v5, v6}, Lorg/chromium/content/browser/RenderCoordinates;->fromLocalCssToPix(F)F

    move-result v6

    invoke-virtual {v5, v6}, Lorg/chromium/content/browser/RenderCoordinates;->fromPixToDip(F)F

    move-result v6

    sub-float v0, v6, v3

    .line 60
    .local v0, "anchorHeight":F
    iget-object v6, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mDropdownPopupWindow:Lorg/chromium/ui/DropdownPopupWindow;

    invoke-virtual {v6, v2, v3, v1, v0}, Lorg/chromium/ui/DropdownPopupWindow;->setAnchorRect(FFFF)V

    .line 61
    iget-object v6, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mDropdownPopupWindow:Lorg/chromium/ui/DropdownPopupWindow;

    new-instance v7, Lorg/chromium/content/browser/input/SelectPopupDropdown$2;

    invoke-direct {v7, p0}, Lorg/chromium/content/browser/input/SelectPopupDropdown$2;-><init>(Lorg/chromium/content/browser/input/SelectPopupDropdown;)V

    invoke-virtual {v6, v7}, Lorg/chromium/ui/DropdownPopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 68
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/content/browser/input/SelectPopupDropdown;[I)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/content/browser/input/SelectPopupDropdown;
    .param p1, "x1"    # [I

    .prologue
    .line 24
    invoke-direct {p0, p1}, Lorg/chromium/content/browser/input/SelectPopupDropdown;->notifySelection([I)V

    return-void
.end method

.method private notifySelection([I)V
    .locals 1
    .param p1, "indicies"    # [I

    .prologue
    .line 71
    iget-boolean v0, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mSelectionNotified:Z

    if-eqz v0, :cond_0

    .line 74
    :goto_0
    return-void

    .line 72
    :cond_0
    iget-object v0, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mContentViewCore:Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0, p1}, Lorg/chromium/content/browser/ContentViewCore;->selectPopupMenuItems([I)V

    .line 73
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mSelectionNotified:Z

    goto :goto_0
.end method


# virtual methods
.method public hide()V
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mDropdownPopupWindow:Lorg/chromium/ui/DropdownPopupWindow;

    invoke-virtual {v0}, Lorg/chromium/ui/DropdownPopupWindow;->dismiss()V

    .line 87
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/chromium/content/browser/input/SelectPopupDropdown;->notifySelection([I)V

    .line 88
    return-void
.end method

.method public show()V
    .locals 2

    .prologue
    .line 78
    iget-object v0, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mDropdownPopupWindow:Lorg/chromium/ui/DropdownPopupWindow;

    invoke-virtual {v0}, Lorg/chromium/ui/DropdownPopupWindow;->show()V

    .line 79
    iget v0, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mInitialSelection:I

    if-ltz v0, :cond_0

    .line 80
    iget-object v0, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mDropdownPopupWindow:Lorg/chromium/ui/DropdownPopupWindow;

    invoke-virtual {v0}, Lorg/chromium/ui/DropdownPopupWindow;->getListView()Landroid/widget/ListView;

    move-result-object v0

    iget v1, p0, Lorg/chromium/content/browser/input/SelectPopupDropdown;->mInitialSelection:I

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 82
    :cond_0
    return-void
.end method
