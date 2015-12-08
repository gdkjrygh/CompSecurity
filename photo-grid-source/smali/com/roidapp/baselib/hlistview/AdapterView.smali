.class public abstract Lcom/roidapp/baselib/hlistview/AdapterView;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroid/widget/Adapter;",
        ">",
        "Landroid/view/ViewGroup;"
    }
.end annotation


# instance fields
.field protected V:I
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
        category = "scrolling"
    .end annotation
.end field

.field protected W:I

.field private a:I

.field protected aa:I

.field protected ab:J

.field protected ac:J

.field protected ad:Z

.field ae:I

.field protected af:Z

.field ag:Lcom/roidapp/baselib/hlistview/u;

.field ah:Lcom/roidapp/baselib/hlistview/s;

.field ai:Lcom/roidapp/baselib/hlistview/t;

.field public aj:Z

.field protected ak:I
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
        category = "list"
    .end annotation
.end field

.field protected al:J

.field protected am:I
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
        category = "list"
    .end annotation
.end field

.field protected an:J

.field protected ao:I
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
        category = "list"
    .end annotation
.end field

.field protected ap:I

.field aq:Landroid/view/accessibility/AccessibilityManager;

.field protected ar:I

.field protected as:J

.field protected at:Z

.field private b:Landroid/view/View;

.field private c:Z

.field private d:Z

.field private e:Lcom/roidapp/baselib/hlistview/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/baselib/hlistview/AdapterView",
            "<TT;>.com/roidapp/baselib/hlistview/v;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .prologue
    const/4 v1, -0x1

    const-wide/high16 v2, -0x8000000000000000L

    const/4 v0, 0x0

    .line 219
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 60
    iput v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->V:I

    .line 76
    iput-wide v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ab:J

    .line 86
    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ad:Z

    .line 117
    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->af:Z

    .line 143
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ak:I

    .line 149
    iput-wide v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->al:J

    .line 154
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->am:I

    .line 160
    iput-wide v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->an:J

    .line 194
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ar:I

    .line 199
    iput-wide v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->as:J

    .line 216
    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->at:Z

    .line 220
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .prologue
    const/4 v1, -0x1

    const-wide/high16 v2, -0x8000000000000000L

    const/4 v0, 0x0

    .line 223
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 60
    iput v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->V:I

    .line 76
    iput-wide v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ab:J

    .line 86
    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ad:Z

    .line 117
    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->af:Z

    .line 143
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ak:I

    .line 149
    iput-wide v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->al:J

    .line 154
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->am:I

    .line 160
    iput-wide v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->an:J

    .line 194
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ar:I

    .line 199
    iput-wide v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->as:J

    .line 216
    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->at:Z

    .line 224
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .prologue
    const/4 v1, -0x1

    const-wide/high16 v2, -0x8000000000000000L

    const/4 v0, 0x0

    .line 228
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 60
    iput v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->V:I

    .line 76
    iput-wide v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ab:J

    .line 86
    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ad:Z

    .line 117
    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->af:Z

    .line 143
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ak:I

    .line 149
    iput-wide v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->al:J

    .line 154
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->am:I

    .line 160
    iput-wide v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->an:J

    .line 194
    iput v1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ar:I

    .line 199
    iput-wide v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->as:J

    .line 216
    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->at:Z

    .line 230
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 232
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->getImportantForAccessibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 233
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->setImportantForAccessibility(I)V

    .line 237
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_1

    .line 238
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->aq:Landroid/view/accessibility/AccessibilityManager;

    .line 240
    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/roidapp/baselib/hlistview/AdapterView;)Landroid/os/Parcelable;
    .locals 1

    .prologue
    .line 41
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    return-object v0
.end method

.method private a()V
    .locals 2

    .prologue
    .line 918
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ag:Lcom/roidapp/baselib/hlistview/u;

    if-nez v0, :cond_1

    .line 929
    :cond_0
    :goto_0
    return-void

    .line 2560
    :cond_1
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ak:I

    .line 922
    if-ltz v0, :cond_0

    .line 923
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->f()Landroid/view/View;

    .line 924
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->p()Landroid/widget/Adapter;

    move-result-object v1

    invoke-interface {v1, v0}, Landroid/widget/Adapter;->getItemId(I)J

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/baselib/hlistview/AdapterView;Landroid/os/Parcelable;)V
    .locals 0

    .prologue
    .line 41
    invoke-virtual {p0, p1}, Lcom/roidapp/baselib/hlistview/AdapterView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method private b()V
    .locals 1

    .prologue
    .line 932
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->aq:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 940
    :cond_0
    :goto_0
    return-void

    .line 3560
    :cond_1
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ak:I

    .line 936
    if-ltz v0, :cond_0

    .line 938
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->sendAccessibilityEvent(I)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/baselib/hlistview/AdapterView;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->a()V

    return-void
.end method

.method static synthetic c(Lcom/roidapp/baselib/hlistview/AdapterView;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->b()V

    return-void
.end method

.method private c()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 996
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->p()Landroid/widget/Adapter;

    move-result-object v1

    .line 997
    if-eqz v1, :cond_1

    .line 998
    invoke-interface {v1}, Landroid/widget/Adapter;->getCount()I

    move-result v1

    .line 999
    if-lez v1, :cond_1

    .line 5638
    iget v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->V:I

    .line 999
    if-gtz v2, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->u()I

    move-result v2

    add-int/lit8 v1, v1, -0x1

    if-ge v2, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 1002
    :cond_1
    return v0
.end method


# virtual methods
.method protected a(IZ)I
    .locals 0

    .prologue
    .line 1188
    return p1
.end method

.method public final a(Landroid/view/View;)I
    .locals 4

    .prologue
    const/4 v1, -0x1

    .line 612
    :goto_0
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    if-nez v2, :cond_0

    move-object p1, v0

    .line 613
    goto :goto_0

    .line 617
    :catch_0
    move-exception v0

    move v0, v1

    .line 629
    :goto_1
    return v0

    .line 621
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->getChildCount()I

    move-result v2

    .line 622
    const/4 v0, 0x0

    :goto_2
    if-ge v0, v2, :cond_2

    .line 623
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 624
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->V:I

    add-int/2addr v0, v1

    goto :goto_1

    .line 622
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    move v0, v1

    .line 629
    goto :goto_1
.end method

.method public final a(Lcom/roidapp/baselib/hlistview/s;)V
    .locals 0

    .prologue
    .line 271
    iput-object p1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ah:Lcom/roidapp/baselib/hlistview/s;

    .line 272
    return-void
.end method

.method public a(Landroid/view/View;IJ)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 293
    iget-object v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ah:Lcom/roidapp/baselib/hlistview/s;

    if-eqz v2, :cond_1

    .line 294
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AdapterView;->playSoundEffect(I)V

    .line 295
    if-eqz p1, :cond_0

    .line 296
    invoke-virtual {p1, v0}, Landroid/view/View;->sendAccessibilityEvent(I)V

    .line 298
    :cond_0
    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ah:Lcom/roidapp/baselib/hlistview/s;

    invoke-interface {v1, p0, p1, p2}, Lcom/roidapp/baselib/hlistview/s;->a(Lcom/roidapp/baselib/hlistview/AdapterView;Landroid/view/View;I)V

    .line 302
    :goto_0
    return v0

    :cond_1
    move v0, v1

    goto :goto_0
.end method

.method public addView(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 454
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "addView(View) is not supported in AdapterView"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public addView(Landroid/view/View;I)V
    .locals 2

    .prologue
    .line 470
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "addView(View, int) is not supported in AdapterView"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .prologue
    .line 505
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "addView(View, int, LayoutParams) is not supported in AdapterView"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .prologue
    .line 486
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "addView(View, LayoutParams) is not supported in AdapterView"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected canAnimate()Z
    .locals 1

    .prologue
    .line 1007
    invoke-super {p0}, Landroid/view/ViewGroup;->canAnimate()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ao:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 2

    .prologue
    .line 944
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->f()Landroid/view/View;

    move-result-object v0

    .line 945
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 947
    const/4 v0, 0x1

    .line 949
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/os/Parcelable;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 804
    invoke-virtual {p0, p1}, Lcom/roidapp/baselib/hlistview/AdapterView;->dispatchThawSelfOnly(Landroid/util/SparseArray;)V

    .line 805
    return-void
.end method

.method protected dispatchSaveInstanceState(Landroid/util/SparseArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/os/Parcelable;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 796
    invoke-virtual {p0, p1}, Lcom/roidapp/baselib/hlistview/AdapterView;->dispatchFreezeSelfOnly(Landroid/util/SparseArray;)V

    .line 797
    return-void
.end method

.method public abstract f()Landroid/view/View;
.end method

.method public abstract i(I)V
.end method

.method public final j(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 776
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->p()Landroid/widget/Adapter;

    move-result-object v0

    .line 777
    if-eqz v0, :cond_0

    if-gez p1, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public final k(I)J
    .locals 2

    .prologue
    .line 781
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->p()Landroid/widget/Adapter;

    move-result-object v0

    .line 782
    if-eqz v0, :cond_0

    if-gez p1, :cond_1

    :cond_0
    const-wide/high16 v0, -0x8000000000000000L

    :goto_0
    return-wide v0

    :cond_1
    invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v0

    goto :goto_0
.end method

.method protected final l(I)V
    .locals 2

    .prologue
    .line 1198
    iput p1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->am:I

    .line 1199
    invoke-virtual {p0, p1}, Lcom/roidapp/baselib/hlistview/AdapterView;->k(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->an:J

    .line 1200
    return-void
.end method

.method protected final m(I)V
    .locals 2

    .prologue
    .line 1209
    iput p1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ak:I

    .line 1210
    invoke-virtual {p0, p1}, Lcom/roidapp/baselib/hlistview/AdapterView;->k(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->al:J

    .line 1212
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ad:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ae:I

    if-nez v0, :cond_0

    if-ltz p1, :cond_0

    .line 1213
    iput p1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->aa:I

    .line 1214
    iget-wide v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->al:J

    iput-wide v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ab:J

    .line 1216
    :cond_0
    return-void
.end method

.method n()V
    .locals 8

    .prologue
    const-wide/high16 v6, -0x8000000000000000L

    const/4 v5, -0x1

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 1014
    iget v4, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ao:I

    .line 1017
    if-lez v4, :cond_6

    .line 1022
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ad:Z

    if-eqz v0, :cond_5

    .line 1025
    iput-boolean v1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ad:Z

    .line 1029
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->x()I

    move-result v0

    .line 1030
    if-ltz v0, :cond_5

    .line 1032
    invoke-virtual {p0, v0, v2}, Lcom/roidapp/baselib/hlistview/AdapterView;->a(IZ)I

    move-result v3

    .line 1033
    if-ne v3, v0, :cond_5

    .line 1035
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->m(I)V

    move v3, v2

    .line 1040
    :goto_0
    if-nez v3, :cond_3

    .line 6560
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ak:I

    .line 1045
    if-lt v0, v4, :cond_0

    .line 1046
    add-int/lit8 v0, v4, -0x1

    .line 1048
    :cond_0
    if-gez v0, :cond_1

    move v0, v1

    .line 1053
    :cond_1
    invoke-virtual {p0, v0, v2}, Lcom/roidapp/baselib/hlistview/AdapterView;->a(IZ)I

    move-result v4

    .line 1054
    if-gez v4, :cond_4

    .line 1056
    invoke-virtual {p0, v0, v1}, Lcom/roidapp/baselib/hlistview/AdapterView;->a(IZ)I

    move-result v0

    .line 1058
    :goto_1
    if-ltz v0, :cond_3

    .line 1059
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->m(I)V

    .line 1060
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->w()V

    move v0, v2

    .line 1065
    :goto_2
    if-nez v0, :cond_2

    .line 1067
    iput v5, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->am:I

    .line 1068
    iput-wide v6, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->an:J

    .line 1069
    iput v5, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ak:I

    .line 1070
    iput-wide v6, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->al:J

    .line 1071
    iput-boolean v1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ad:Z

    .line 1072
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->w()V

    .line 1079
    :cond_2
    return-void

    :cond_3
    move v0, v3

    goto :goto_2

    :cond_4
    move v0, v4

    goto :goto_1

    :cond_5
    move v3, v1

    goto :goto_0

    :cond_6
    move v0, v1

    goto :goto_2
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 873
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 874
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->e:Lcom/roidapp/baselib/hlistview/v;

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 875
    return-void
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    .line 982
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 983
    const-class v0, Lcom/roidapp/baselib/hlistview/AdapterView;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setClassName(Ljava/lang/CharSequence;)V

    .line 984
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->c()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setScrollable(Z)V

    .line 985
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->f()Landroid/view/View;

    move-result-object v0

    .line 986
    if-eqz v0, :cond_0

    .line 987
    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setEnabled(Z)V

    .line 4560
    :cond_0
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ak:I

    .line 989
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setCurrentItemIndex(I)V

    .line 4638
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->V:I

    .line 990
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setFromIndex(I)V

    .line 991
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->u()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setToIndex(I)V

    .line 5595
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ao:I

    .line 992
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setItemCount(I)V

    .line 993
    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    .line 970
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 971
    const-class v0, Lcom/roidapp/baselib/hlistview/AdapterView;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 972
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->c()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 973
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->f()Landroid/view/View;

    move-result-object v0

    .line 974
    if-eqz v0, :cond_0

    .line 975
    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setEnabled(Z)V

    .line 977
    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    .prologue
    .line 550
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->a:I

    .line 551
    return-void
.end method

.method public onRequestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    .line 955
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onRequestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 957
    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v0

    .line 958
    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 960
    invoke-virtual {p1, v0}, Landroid/view/View;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 961
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityEvent;->appendRecord(Landroid/view/accessibility/AccessibilityRecord;)V

    .line 962
    const/4 v0, 0x1

    .line 964
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public abstract p()Landroid/widget/Adapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public final q()I
    .locals 1
    .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
    .end annotation

    .prologue
    .line 560
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ak:I

    return v0
.end method

.method public final r()J
    .locals 2
    .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
    .end annotation

    .prologue
    .line 568
    iget-wide v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->al:J

    return-wide v0
.end method

.method public removeAllViews()V
    .locals 2

    .prologue
    .line 545
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "removeAllViews() is not supported in AdapterView"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public removeView(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 520
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "removeView(View) is not supported in AdapterView"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public removeViewAt(I)V
    .locals 2

    .prologue
    .line 534
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "removeViewAt(int) is not supported in AdapterView"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final s()I
    .locals 1
    .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
    .end annotation

    .prologue
    .line 595
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ao:I

    return v0
.end method

.method public setFocusable(Z)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 699
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->p()Landroid/widget/Adapter;

    move-result-object v0

    .line 700
    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    move v0, v2

    .line 702
    :goto_0
    iput-boolean p1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->c:Z

    .line 703
    if-nez p1, :cond_1

    .line 704
    iput-boolean v1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->d:Z

    .line 707
    :cond_1
    if-eqz p1, :cond_3

    if-nez v0, :cond_3

    :goto_1
    invoke-super {p0, v2}, Landroid/view/ViewGroup;->setFocusable(Z)V

    .line 708
    return-void

    :cond_2
    move v0, v1

    .line 700
    goto :goto_0

    :cond_3
    move v2, v1

    .line 707
    goto :goto_1
.end method

.method public setFocusableInTouchMode(Z)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 712
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->p()Landroid/widget/Adapter;

    move-result-object v0

    .line 713
    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    move v0, v2

    .line 715
    :goto_0
    iput-boolean p1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->d:Z

    .line 716
    if-eqz p1, :cond_1

    .line 717
    iput-boolean v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->c:Z

    .line 720
    :cond_1
    if-eqz p1, :cond_3

    if-nez v0, :cond_3

    :goto_1
    invoke-super {p0, v2}, Landroid/view/ViewGroup;->setFocusableInTouchMode(Z)V

    .line 721
    return-void

    :cond_2
    move v0, v1

    .line 713
    goto :goto_0

    :cond_3
    move v2, v1

    .line 720
    goto :goto_1
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 2

    .prologue
    .line 787
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Don\'t call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final t()I
    .locals 1

    .prologue
    .line 638
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->V:I

    return v0
.end method

.method public final u()I
    .locals 2

    .prologue
    .line 647
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->V:I

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->getChildCount()I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method protected final v()V
    .locals 6

    .prologue
    const/16 v5, 0x8

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 724
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->p()Landroid/widget/Adapter;

    move-result-object v4

    .line 725
    if-eqz v4, :cond_0

    invoke-interface {v4}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    if-nez v0, :cond_3

    :cond_0
    move v0, v2

    .line 726
    :goto_0
    if-nez v0, :cond_4

    move v3, v2

    .line 730
    :goto_1
    if-eqz v3, :cond_5

    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->d:Z

    if-eqz v0, :cond_5

    move v0, v2

    :goto_2
    invoke-super {p0, v0}, Landroid/view/ViewGroup;->setFocusableInTouchMode(Z)V

    .line 731
    if-eqz v3, :cond_6

    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->c:Z

    if-eqz v0, :cond_6

    move v0, v2

    :goto_3
    invoke-super {p0, v0}, Landroid/view/ViewGroup;->setFocusable(Z)V

    .line 732
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->b:Landroid/view/View;

    if-eqz v0, :cond_2

    .line 733
    if-eqz v4, :cond_1

    invoke-interface {v4}, Landroid/widget/Adapter;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1747
    :cond_1
    :goto_4
    if-eqz v2, :cond_9

    .line 1748
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->b:Landroid/view/View;

    if-eqz v0, :cond_8

    .line 1749
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1750
    invoke-virtual {p0, v5}, Lcom/roidapp/baselib/hlistview/AdapterView;->setVisibility(I)V

    .line 1759
    :goto_5
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->aj:Z

    if-eqz v0, :cond_2

    .line 1760
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->getLeft()I

    move-result v2

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->getTop()I

    move-result v3

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->getRight()I

    move-result v4

    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->getBottom()I

    move-result v5

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/baselib/hlistview/AdapterView;->onLayout(ZIIII)V

    :cond_2
    :goto_6
    return-void

    :cond_3
    move v0, v1

    .line 725
    goto :goto_0

    :cond_4
    move v3, v1

    .line 726
    goto :goto_1

    :cond_5
    move v0, v1

    .line 730
    goto :goto_2

    :cond_6
    move v0, v1

    .line 731
    goto :goto_3

    :cond_7
    move v2, v1

    .line 733
    goto :goto_4

    .line 1753
    :cond_8
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AdapterView;->setVisibility(I)V

    goto :goto_5

    .line 1763
    :cond_9
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->b:Landroid/view/View;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->b:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1764
    :cond_a
    invoke-virtual {p0, v1}, Lcom/roidapp/baselib/hlistview/AdapterView;->setVisibility(I)V

    goto :goto_6
.end method

.method protected final w()V
    .locals 4

    .prologue
    .line 1085
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->am:I

    iget v1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ar:I

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->an:J

    iget-wide v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->as:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_5

    .line 6899
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ag:Lcom/roidapp/baselib/hlistview/u;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->aq:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 6901
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->af:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->at:Z

    if-eqz v0, :cond_6

    .line 6906
    :cond_2
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->e:Lcom/roidapp/baselib/hlistview/v;

    if-nez v0, :cond_3

    .line 6907
    new-instance v0, Lcom/roidapp/baselib/hlistview/v;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/roidapp/baselib/hlistview/v;-><init>(Lcom/roidapp/baselib/hlistview/AdapterView;B)V

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->e:Lcom/roidapp/baselib/hlistview/v;

    .line 6909
    :cond_3
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->e:Lcom/roidapp/baselib/hlistview/v;

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->post(Ljava/lang/Runnable;)Z

    .line 1087
    :cond_4
    :goto_0
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->am:I

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ar:I

    .line 1088
    iget-wide v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->an:J

    iput-wide v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->as:J

    .line 1090
    :cond_5
    return-void

    .line 6911
    :cond_6
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->a()V

    .line 6912
    invoke-direct {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->b()V

    goto :goto_0
.end method

.method final x()I
    .locals 12

    .prologue
    .line 1099
    iget v6, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ao:I

    .line 1101
    if-nez v6, :cond_0

    .line 1102
    const/4 v3, -0x1

    .line 1174
    :goto_0
    return v3

    .line 1105
    :cond_0
    iget-wide v8, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ab:J

    .line 1106
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->aa:I

    .line 1109
    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v1, v8, v2

    if-nez v1, :cond_1

    .line 1110
    const/4 v3, -0x1

    goto :goto_0

    .line 1114
    :cond_1
    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1115
    add-int/lit8 v1, v6, -0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 1117
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x64

    add-long v10, v2, v4

    .line 1128
    const/4 v0, 0x0

    .line 1138
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->p()Landroid/widget/Adapter;

    move-result-object v7

    .line 1139
    if-nez v7, :cond_b

    .line 1140
    const/4 v3, -0x1

    goto :goto_0

    .line 1150
    :cond_2
    add-int/lit8 v4, v6, -0x1

    if-ne v1, v4, :cond_6

    const/4 v4, 0x1

    move v5, v4

    .line 1151
    :goto_1
    if-nez v2, :cond_7

    const/4 v4, 0x1

    .line 1153
    :goto_2
    if-eqz v5, :cond_3

    if-nez v4, :cond_a

    .line 1158
    :cond_3
    if-nez v4, :cond_4

    if-eqz v0, :cond_8

    if-nez v5, :cond_8

    .line 1160
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 1163
    const/4 v0, 0x0

    move v3, v1

    .line 1143
    :cond_5
    :goto_3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    cmp-long v4, v4, v10

    if-gtz v4, :cond_a

    .line 1144
    invoke-interface {v7, v3}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v4

    .line 1145
    cmp-long v4, v4, v8

    if-nez v4, :cond_2

    goto :goto_0

    .line 1150
    :cond_6
    const/4 v4, 0x0

    move v5, v4

    goto :goto_1

    .line 1151
    :cond_7
    const/4 v4, 0x0

    goto :goto_2

    .line 1164
    :cond_8
    if-nez v5, :cond_9

    if-nez v0, :cond_5

    if-nez v4, :cond_5

    .line 1166
    :cond_9
    add-int/lit8 v2, v2, -0x1

    .line 1169
    const/4 v0, 0x1

    move v3, v2

    goto :goto_3

    .line 1174
    :cond_a
    const/4 v3, -0x1

    goto :goto_0

    :cond_b
    move v2, v1

    move v3, v1

    goto :goto_3
.end method

.method public final y()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 1226
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->getChildCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 1227
    iput-boolean v5, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ad:Z

    .line 1228
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->a:I

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ac:J

    .line 1229
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->am:I

    if-ltz v0, :cond_2

    .line 1231
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->am:I

    iget v1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->V:I

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lcom/roidapp/baselib/hlistview/AdapterView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 1232
    iget-wide v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->al:J

    iput-wide v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ab:J

    .line 1233
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ak:I

    iput v1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->aa:I

    .line 1234
    if-eqz v0, :cond_0

    .line 1235
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->W:I

    .line 1237
    :cond_0
    iput v4, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ae:I

    .line 1254
    :cond_1
    :goto_0
    return-void

    .line 1240
    :cond_2
    invoke-virtual {p0, v4}, Lcom/roidapp/baselib/hlistview/AdapterView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 1241
    invoke-virtual {p0}, Lcom/roidapp/baselib/hlistview/AdapterView;->p()Landroid/widget/Adapter;

    move-result-object v1

    .line 1242
    iget v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->V:I

    if-ltz v2, :cond_4

    iget v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->V:I

    invoke-interface {v1}, Landroid/widget/Adapter;->getCount()I

    move-result v3

    if-ge v2, v3, :cond_4

    .line 1243
    iget v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->V:I

    invoke-interface {v1, v2}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ab:J

    .line 1247
    :goto_1
    iget v1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->V:I

    iput v1, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->aa:I

    .line 1248
    if-eqz v0, :cond_3

    .line 1249
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->W:I

    .line 1251
    :cond_3
    iput v5, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ae:I

    goto :goto_0

    .line 1245
    :cond_4
    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lcom/roidapp/baselib/hlistview/AdapterView;->ab:J

    goto :goto_1
.end method
