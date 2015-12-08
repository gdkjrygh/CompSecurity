.class Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
.super Landroid/widget/ListView;
.source "ListPopupWindow.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/ListPopupWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DropDownListView"
.end annotation


# static fields
.field public static final INVALID_POSITION:I = -0x1

.field static final NO_POSITION:I = -0x1

.field private static final TAG:Ljava/lang/String; = "ListPopupWindow.DropDownListView"


# instance fields
.field private mHijackFocus:Z

.field private mListSelectionHidden:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "hijackFocus"    # Z

    .prologue
    .line 1170
    const/4 v0, 0x0

    sget v1, Landroid/support/v7/appcompat/R$attr;->dropDownListViewStyle:I

    invoke-direct {p0, p1, v0, v1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 1171
    iput-boolean p2, p0, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mHijackFocus:Z

    .line 1172
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->setCacheColorHint(I)V

    .line 1173
    return-void
.end method

.method static synthetic access$502(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;Z)Z
    .locals 0
    .param p0, "x0"    # Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
    .param p1, "x1"    # Z

    .prologue
    .line 1119
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mListSelectionHidden:Z

    return p1
.end method

.method static synthetic access$600(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;IZ)I
    .locals 1
    .param p0, "x0"    # Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
    .param p1, "x1"    # I
    .param p2, "x2"    # Z

    .prologue
    .line 1119
    invoke-direct {p0, p1, p2}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->lookForSelectablePosition(IZ)I

    move-result v0

    return v0
.end method

.method private lookForSelectablePosition(IZ)I
    .locals 4
    .param p1, "position"    # I
    .param p2, "lookDown"    # Z

    .prologue
    const/4 v2, -0x1

    .line 1184
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    .line 1185
    .local v0, "adapter":Landroid/widget/ListAdapter;
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->isInTouchMode()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1211
    :cond_0
    :goto_0
    return v2

    .line 1189
    :cond_1
    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v1

    .line 1190
    .local v1, "count":I
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v3

    invoke-interface {v3}, Landroid/widget/ListAdapter;->areAllItemsEnabled()Z

    move-result v3

    if-nez v3, :cond_4

    .line 1191
    if-eqz p2, :cond_2

    .line 1192
    const/4 v3, 0x0

    invoke-static {v3, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 1193
    :goto_1
    if-ge p1, v1, :cond_3

    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->isEnabled(I)Z

    move-result v3

    if-nez v3, :cond_3

    .line 1194
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 1197
    :cond_2
    add-int/lit8 v3, v1, -0x1

    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 1198
    :goto_2
    if-ltz p1, :cond_3

    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->isEnabled(I)Z

    move-result v3

    if-nez v3, :cond_3

    .line 1199
    add-int/lit8 p1, p1, -0x1

    goto :goto_2

    .line 1203
    :cond_3
    if-ltz p1, :cond_0

    if-ge p1, v1, :cond_0

    move v2, p1

    .line 1206
    goto :goto_0

    .line 1208
    :cond_4
    if-ltz p1, :cond_0

    if-ge p1, v1, :cond_0

    move v2, p1

    .line 1211
    goto :goto_0
.end method


# virtual methods
.method public hasFocus()Z
    .locals 1

    .prologue
    .line 1248
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mHijackFocus:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/widget/ListView;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hasWindowFocus()Z
    .locals 1

    .prologue
    .line 1228
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mHijackFocus:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/widget/ListView;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isFocused()Z
    .locals 1

    .prologue
    .line 1238
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mHijackFocus:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/widget/ListView;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isInTouchMode()Z
    .locals 1

    .prologue
    .line 1218
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mHijackFocus:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->mListSelectionHidden:Z

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/widget/ListView;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final measureHeightOfChildrenCompat(IIIII)I
    .locals 21
    .param p1, "widthMeasureSpec"    # I
    .param p2, "startPosition"    # I
    .param p3, "endPosition"    # I
    .param p4, "maxHeight"    # I
    .param p5, "disallowPartialChildPosition"    # I

    .prologue
    .line 1281
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getListPaddingTop()I

    move-result v14

    .line 1282
    .local v14, "paddingTop":I
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getListPaddingBottom()I

    move-result v11

    .line 1283
    .local v11, "paddingBottom":I
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getListPaddingLeft()I

    move-result v12

    .line 1284
    .local v12, "paddingLeft":I
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getListPaddingRight()I

    move-result v13

    .line 1285
    .local v13, "paddingRight":I
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getDividerHeight()I

    move-result v16

    .line 1286
    .local v16, "reportedDividerHeight":I
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getDivider()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 1288
    .local v6, "divider":Landroid/graphics/drawable/Drawable;
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v2

    .line 1290
    .local v2, "adapter":Landroid/widget/ListAdapter;
    if-nez v2, :cond_1

    .line 1291
    add-int v15, v14, v11

    .line 1350
    :cond_0
    :goto_0
    return v15

    .line 1295
    :cond_1
    add-int v17, v14, v11

    .line 1296
    .local v17, "returnedHeight":I
    if-lez v16, :cond_5

    if-eqz v6, :cond_5

    move/from16 v7, v16

    .line 1301
    .local v7, "dividerHeight":I
    :goto_1
    const/4 v15, 0x0

    .line 1303
    .local v15, "prevHeightWithoutPartialChild":I
    const/4 v3, 0x0

    .line 1304
    .local v3, "child":Landroid/view/View;
    const/16 v18, 0x0

    .line 1305
    .local v18, "viewType":I
    invoke-interface {v2}, Landroid/widget/ListAdapter;->getCount()I

    move-result v5

    .line 1306
    .local v5, "count":I
    const/4 v9, 0x0

    .local v9, "i":I
    :goto_2
    if-ge v9, v5, :cond_9

    .line 1307
    invoke-interface {v2, v9}, Landroid/widget/ListAdapter;->getItemViewType(I)I

    move-result v10

    .line 1308
    .local v10, "newType":I
    move/from16 v0, v18

    if-eq v10, v0, :cond_2

    .line 1309
    const/4 v3, 0x0

    .line 1310
    move/from16 v18, v10

    .line 1312
    :cond_2
    move-object/from16 v0, p0

    invoke-interface {v2, v9, v3, v0}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 1316
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    .line 1317
    .local v4, "childLp":Landroid/view/ViewGroup$LayoutParams;
    if-eqz v4, :cond_6

    iget v0, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    move/from16 v19, v0

    if-lez v19, :cond_6

    .line 1318
    iget v0, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    move/from16 v19, v0

    const/high16 v20, 0x40000000    # 2.0f

    invoke-static/range {v19 .. v20}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .line 1323
    .local v8, "heightMeasureSpec":I
    :goto_3
    move/from16 v0, p1

    invoke-virtual {v3, v0, v8}, Landroid/view/View;->measure(II)V

    .line 1325
    if-lez v9, :cond_3

    .line 1327
    add-int v17, v17, v7

    .line 1330
    :cond_3
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v19

    add-int v17, v17, v19

    .line 1332
    move/from16 v0, v17

    move/from16 v1, p4

    if-lt v0, v1, :cond_7

    .line 1335
    if-ltz p5, :cond_4

    move/from16 v0, p5

    if-le v9, v0, :cond_4

    if-lez v15, :cond_4

    move/from16 v0, v17

    move/from16 v1, p4

    if-ne v0, v1, :cond_0

    :cond_4
    move/from16 v15, p4

    goto :goto_0

    .line 1296
    .end local v3    # "child":Landroid/view/View;
    .end local v4    # "childLp":Landroid/view/ViewGroup$LayoutParams;
    .end local v5    # "count":I
    .end local v7    # "dividerHeight":I
    .end local v8    # "heightMeasureSpec":I
    .end local v9    # "i":I
    .end local v10    # "newType":I
    .end local v15    # "prevHeightWithoutPartialChild":I
    .end local v18    # "viewType":I
    :cond_5
    const/4 v7, 0x0

    goto :goto_1

    .line 1321
    .restart local v3    # "child":Landroid/view/View;
    .restart local v4    # "childLp":Landroid/view/ViewGroup$LayoutParams;
    .restart local v5    # "count":I
    .restart local v7    # "dividerHeight":I
    .restart local v9    # "i":I
    .restart local v10    # "newType":I
    .restart local v15    # "prevHeightWithoutPartialChild":I
    .restart local v18    # "viewType":I
    :cond_6
    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v19 .. v20}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .restart local v8    # "heightMeasureSpec":I
    goto :goto_3

    .line 1343
    :cond_7
    if-ltz p5, :cond_8

    move/from16 v0, p5

    if-lt v9, v0, :cond_8

    .line 1344
    move/from16 v15, v17

    .line 1306
    :cond_8
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .end local v4    # "childLp":Landroid/view/ViewGroup$LayoutParams;
    .end local v8    # "heightMeasureSpec":I
    .end local v10    # "newType":I
    :cond_9
    move/from16 v15, v17

    .line 1350
    goto :goto_0
.end method
