.class public final Lcom/roidapp/baselib/view/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field private a:Lcom/roidapp/baselib/view/t;

.field private b:Landroid/widget/PopupWindow;

.field private c:Lcom/roidapp/baselib/view/u;

.field private d:Landroid/widget/PopupWindow$OnDismissListener;

.field private e:Landroid/content/Context;

.field private f:[Ljava/lang/String;

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 58
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/roidapp/baselib/view/r;-><init>(Landroid/content/Context;[Ljava/lang/String;I)V

    .line 59
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 68
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/roidapp/baselib/view/r;-><init>(Landroid/content/Context;[Ljava/lang/String;II)V

    .line 69
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;II)V
    .locals 2

    .prologue
    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/baselib/view/r;->g:I

    .line 79
    iput-object p1, p0, Lcom/roidapp/baselib/view/r;->e:Landroid/content/Context;

    .line 80
    if-eqz p2, :cond_0

    array-length v0, p2

    if-gtz v0, :cond_1

    .line 81
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "MenuArray must more than 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 83
    :cond_1
    iput-object p2, p0, Lcom/roidapp/baselib/view/r;->f:[Ljava/lang/String;

    .line 84
    iput p3, p0, Lcom/roidapp/baselib/view/r;->h:I

    .line 85
    iput p4, p0, Lcom/roidapp/baselib/view/r;->k:I

    .line 86
    return-void
.end method

.method static synthetic a(Lcom/roidapp/baselib/view/r;)Landroid/widget/PopupWindow;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->b:Landroid/widget/PopupWindow;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/view/View;I)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 153
    invoke-virtual {p0, p1, p2, v0, v0}, Lcom/roidapp/baselib/view/r;->a(Landroid/view/View;III)V

    .line 154
    return-void
.end method

.method public final a(Landroid/view/View;III)V
    .locals 10

    .prologue
    const/4 v4, -0x2

    const/4 v9, 0x1

    const/4 v1, 0x0

    .line 165
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->b:Landroid/widget/PopupWindow;

    if-nez v0, :cond_4

    .line 1101
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lcom/roidapp/baselib/d;->a:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/view/r;->i:I

    .line 1103
    new-instance v2, Landroid/widget/ListView;

    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->e:Landroid/content/Context;

    invoke-direct {v2, v0}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 1104
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v0, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v0}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1105
    invoke-virtual {v2, v1}, Landroid/widget/ListView;->setVerticalScrollBarEnabled(Z)V

    .line 1106
    invoke-virtual {v2, v1}, Landroid/widget/ListView;->setFastScrollEnabled(Z)V

    .line 1107
    invoke-virtual {v2, v1}, Landroid/widget/ListView;->setCacheColorHint(I)V

    .line 1109
    new-instance v0, Landroid/widget/PopupWindow;

    iget v3, p0, Lcom/roidapp/baselib/view/r;->i:I

    invoke-direct {v0, v2, v3, v4, v9}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    iput-object v0, p0, Lcom/roidapp/baselib/view/r;->b:Landroid/widget/PopupWindow;

    .line 1111
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->b:Landroid/widget/PopupWindow;

    invoke-static {v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/PopupWindow;)V

    .line 1113
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v9}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 1114
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v9}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 1115
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v9}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 1116
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setClippingEnabled(Z)V

    .line 1118
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->d:Landroid/widget/PopupWindow$OnDismissListener;

    if-eqz v0, :cond_0

    .line 1119
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->b:Landroid/widget/PopupWindow;

    iget-object v3, p0, Lcom/roidapp/baselib/view/r;->d:Landroid/widget/PopupWindow$OnDismissListener;

    invoke-virtual {v0, v3}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 1122
    :cond_0
    iget v0, p0, Lcom/roidapp/baselib/view/r;->h:I

    if-nez v0, :cond_2

    .line 1123
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->b:Landroid/widget/PopupWindow;

    iget-object v3, p0, Lcom/roidapp/baselib/view/r;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/baselib/e;->bf:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1124
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v3, Lcom/roidapp/baselib/c;->a:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 1131
    :goto_0
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->a:Lcom/roidapp/baselib/view/t;

    if-nez v0, :cond_1

    .line 1132
    new-instance v0, Lcom/roidapp/baselib/view/t;

    iget-object v3, p0, Lcom/roidapp/baselib/view/r;->e:Landroid/content/Context;

    iget v4, p0, Lcom/roidapp/baselib/view/r;->h:I

    invoke-direct {v0, v3, v4}, Lcom/roidapp/baselib/view/t;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/roidapp/baselib/view/r;->a:Lcom/roidapp/baselib/view/t;

    .line 1134
    :cond_1
    iget-object v3, p0, Lcom/roidapp/baselib/view/r;->f:[Ljava/lang/String;

    array-length v4, v3

    move v0, v1

    :goto_1
    if-ge v0, v4, :cond_3

    aget-object v5, v3, v0

    .line 1135
    iget-object v6, p0, Lcom/roidapp/baselib/view/r;->a:Lcom/roidapp/baselib/view/t;

    invoke-virtual {v6, v5}, Lcom/roidapp/baselib/view/t;->a(Ljava/lang/String;)V

    .line 1134
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1127
    :cond_2
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->b:Landroid/widget/PopupWindow;

    iget-object v3, p0, Lcom/roidapp/baselib/view/r;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/roidapp/baselib/e;->be:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1128
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v3, Lcom/roidapp/baselib/c;->b:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 1138
    :cond_3
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 1139
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->a:Lcom/roidapp/baselib/view/t;

    invoke-virtual {v2, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1140
    invoke-virtual {v2, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 1141
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-virtual {v2, v0, v3}, Landroid/widget/ListView;->measure(II)V

    .line 1143
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->a:Lcom/roidapp/baselib/view/t;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/t;->getCount()I

    move-result v0

    invoke-virtual {v2}, Landroid/widget/ListView;->getDividerHeight()I

    move-result v3

    invoke-virtual {v2}, Landroid/widget/ListView;->getMeasuredHeight()I

    move-result v2

    add-int/2addr v2, v3

    mul-int/2addr v0, v2

    iput v0, p0, Lcom/roidapp/baselib/view/r;->j:I

    .line 1144
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->b:Landroid/widget/PopupWindow;

    .line 166
    iput-object v0, p0, Lcom/roidapp/baselib/view/r;->b:Landroid/widget/PopupWindow;

    .line 168
    :cond_4
    if-eqz p1, :cond_8

    .line 169
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 170
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v2

    .line 172
    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 173
    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    .line 174
    invoke-virtual {p1, v4}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 175
    invoke-virtual {p1, v6}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 177
    iget v0, v4, Landroid/graphics/Rect;->bottom:I

    .line 178
    iget v7, v4, Landroid/graphics/Rect;->left:I

    .line 179
    iget v5, v4, Landroid/graphics/Rect;->bottom:I

    iget v8, v4, Landroid/graphics/Rect;->top:I

    sub-int/2addr v5, v8

    .line 181
    iget v4, v4, Landroid/graphics/Rect;->top:I

    iget v8, p0, Lcom/roidapp/baselib/view/r;->j:I

    mul-int/lit8 v8, v8, 0x2

    if-ge v4, v8, :cond_5

    .line 182
    iput v1, p0, Lcom/roidapp/baselib/view/r;->k:I

    .line 185
    :cond_5
    iget v1, p0, Lcom/roidapp/baselib/view/r;->k:I

    if-nez v1, :cond_a

    if-ge v5, v2, :cond_a

    .line 187
    sub-int v1, v2, v5

    add-int/2addr v0, v1

    move v5, p3

    .line 190
    :goto_2
    add-int v1, v7, v5

    iget v4, p0, Lcom/roidapp/baselib/view/r;->i:I

    add-int/2addr v1, v4

    iget v4, v6, Landroid/graphics/Rect;->right:I

    if-le v1, v4, :cond_6

    .line 191
    div-int/lit8 v1, v3, 0x4

    sub-int p3, v5, v1

    move v5, p3

    goto :goto_2

    .line 194
    :cond_6
    iget v1, p0, Lcom/roidapp/baselib/view/r;->k:I

    if-ne v1, v9, :cond_9

    .line 196
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v3

    .line 197
    if-eqz v3, :cond_7

    .line 198
    invoke-virtual {v3}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v6

    new-instance v0, Lcom/roidapp/baselib/view/s;

    move-object v1, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/baselib/view/s;-><init>(Lcom/roidapp/baselib/view/r;ILandroid/view/View;Landroid/view/View;I)V

    invoke-virtual {v6, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 213
    :cond_7
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0, p1, v5, p4}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 215
    :cond_8
    iput p2, p0, Lcom/roidapp/baselib/view/r;->g:I

    .line 216
    return-void

    .line 208
    :cond_9
    :goto_3
    add-int v1, v0, p4

    iget v3, p0, Lcom/roidapp/baselib/view/r;->j:I

    add-int/2addr v1, v3

    iget v3, v6, Landroid/graphics/Rect;->bottom:I

    if-le v1, v3, :cond_7

    .line 209
    div-int/lit8 v1, v2, 0x4

    sub-int/2addr p4, v1

    goto :goto_3

    :cond_a
    move v5, p3

    goto :goto_2
.end method

.method public final a(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/roidapp/baselib/view/r;->d:Landroid/widget/PopupWindow$OnDismissListener;

    .line 94
    return-void
.end method

.method public final a(Lcom/roidapp/baselib/view/t;)V
    .locals 0

    .prologue
    .line 97
    iput-object p1, p0, Lcom/roidapp/baselib/view/r;->a:Lcom/roidapp/baselib/view/t;

    .line 98
    return-void
.end method

.method public final a(Lcom/roidapp/baselib/view/u;)V
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Lcom/roidapp/baselib/view/r;->c:Lcom/roidapp/baselib/view/u;

    .line 90
    return-void
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
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
    .line 220
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->c:Lcom/roidapp/baselib/view/u;

    if-eqz v0, :cond_0

    .line 221
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->c:Lcom/roidapp/baselib/view/u;

    iget v1, p0, Lcom/roidapp/baselib/view/r;->g:I

    invoke-interface {v0, p3, v1}, Lcom/roidapp/baselib/view/u;->b(II)V

    .line 223
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->b:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 224
    iget-object v0, p0, Lcom/roidapp/baselib/view/r;->b:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 226
    :cond_1
    return-void
.end method
