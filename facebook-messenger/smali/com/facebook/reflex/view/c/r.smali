.class Lcom/facebook/reflex/view/c/r;
.super Ljava/lang/Object;
.source "SelectionController.java"

# interfaces
.implements Lcom/facebook/reflex/ak;
.implements Lcom/facebook/reflex/w;


# instance fields
.field final synthetic a:Lcom/facebook/reflex/view/c/o;

.field private b:Lcom/facebook/reflex/view/b/r;


# direct methods
.method private constructor <init>(Lcom/facebook/reflex/view/c/o;)V
    .locals 0

    .prologue
    .line 170
    iput-object p1, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/reflex/view/c/o;Lcom/facebook/reflex/view/c/p;)V
    .locals 0

    .prologue
    .line 170
    invoke-direct {p0, p1}, Lcom/facebook/reflex/view/c/r;-><init>(Lcom/facebook/reflex/view/c/o;)V

    return-void
.end method

.method private a()Landroid/view/View;
    .locals 1

    .prologue
    .line 257
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->b:Lcom/facebook/reflex/view/b/r;

    instance-of v0, v0, Lcom/facebook/reflex/view/c/t;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->b:Lcom/facebook/reflex/view/b/r;

    check-cast v0, Lcom/facebook/reflex/view/c/t;

    invoke-interface {v0}, Lcom/facebook/reflex/view/c/t;->a()Landroid/view/View;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->b:Lcom/facebook/reflex/view/b/r;

    invoke-interface {v0}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/reflex/view/c/r;Lcom/facebook/reflex/view/b/r;)Lcom/facebook/reflex/view/b/r;
    .locals 0

    .prologue
    .line 170
    iput-object p1, p0, Lcom/facebook/reflex/view/c/r;->b:Lcom/facebook/reflex/view/b/r;

    return-object p1
.end method

.method private a(I)Z
    .locals 5

    .prologue
    .line 250
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v0}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/reflex/view/h;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    .line 252
    :goto_0
    iget-object v2, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v2}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/reflex/view/h;->getHeaderViewsCount()I

    move-result v2

    add-int/2addr v2, p1

    .line 253
    iget-object v3, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v3}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;

    move-result-object v3

    invoke-direct {p0}, Lcom/facebook/reflex/view/c/r;->a()Landroid/view/View;

    move-result-object v4

    invoke-virtual {v3, v4, v2, v0, v1}, Lcom/facebook/reflex/view/h;->performItemClick(Landroid/view/View;IJ)Z

    move-result v0

    return v0

    .line 250
    :cond_0
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v0}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/reflex/view/h;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v0

    goto :goto_0
.end method

.method private b(I)Z
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 264
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v0}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/reflex/view/h;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    if-nez v0, :cond_2

    const-wide/16 v4, 0x0

    .line 267
    :goto_0
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v0}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/reflex/view/h;->getHeaderViewsCount()I

    move-result v0

    add-int v3, p1, v0

    .line 268
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v0}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/reflex/view/h;->getOnItemLongClickListener()Landroid/widget/AdapterView$OnItemLongClickListener;

    move-result-object v0

    .line 269
    if-eqz v0, :cond_3

    .line 270
    iget-object v1, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v1}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;

    move-result-object v1

    invoke-direct {p0}, Lcom/facebook/reflex/view/c/r;->a()Landroid/view/View;

    move-result-object v2

    invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemLongClickListener;->onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z

    move-result v0

    .line 272
    :goto_1
    if-nez v0, :cond_0

    .line 273
    iget-object v1, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v1}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/reflex/view/h;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 274
    new-instance v0, Landroid/widget/AdapterView$AdapterContextMenuInfo;

    invoke-direct {p0}, Lcom/facebook/reflex/view/c/r;->a()Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1, v3, v4, v5}, Landroid/widget/AdapterView$AdapterContextMenuInfo;-><init>(Landroid/view/View;IJ)V

    .line 276
    iget-object v1, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v1}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/reflex/view/h;->setContextMenuInfo(Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 277
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v0}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/reflex/view/h;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v1}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->showContextMenuForChild(Landroid/view/View;)Z

    move-result v0

    .line 280
    :cond_0
    if-eqz v0, :cond_1

    .line 281
    iget-object v1, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v1}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;

    move-result-object v1

    invoke-virtual {v1, v6}, Lcom/facebook/reflex/view/h;->performHapticFeedback(I)Z

    .line 283
    :cond_1
    return v0

    .line 264
    :cond_2
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v0}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/reflex/view/h;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->getItemId(I)J

    move-result-wide v4

    goto :goto_0

    :cond_3
    move v0, v6

    goto :goto_1
.end method


# virtual methods
.method public a(Lcom/facebook/reflex/r;)V
    .locals 5

    .prologue
    const/4 v4, -0x1

    const/4 v3, 0x0

    .line 220
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v0}, Lcom/facebook/reflex/view/c/o;->b(Lcom/facebook/reflex/view/c/o;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 246
    :cond_0
    :goto_0
    return-void

    .line 223
    :cond_1
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v0}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/reflex/view/c/r;->b:Lcom/facebook/reflex/view/b/r;

    invoke-interface {v1}, Lcom/facebook/reflex/view/b/r;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/reflex/Widget;->e()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/view/h;->b(I)I

    move-result v0

    .line 224
    iget-object v1, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v1}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/reflex/view/h;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v1}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/reflex/view/h;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    invoke-interface {v1, v0}, Landroid/widget/ListAdapter;->isEnabled(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 228
    :cond_2
    sget-object v1, Lcom/facebook/reflex/view/c/p;->a:[I

    invoke-virtual {p1}, Lcom/facebook/reflex/r;->a()Lcom/facebook/reflex/t;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/reflex/t;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 239
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    iget-object v1, p0, Lcom/facebook/reflex/view/c/r;->b:Lcom/facebook/reflex/view/b/r;

    invoke-static {v0, v1, v3}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;Lcom/facebook/reflex/view/b/r;Z)V

    .line 240
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-virtual {v0, v4}, Lcom/facebook/reflex/view/c/o;->c(I)V

    .line 241
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v0, v3}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;Z)Z

    goto :goto_0

    .line 230
    :pswitch_1
    invoke-direct {p0, v0}, Lcom/facebook/reflex/view/c/r;->b(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 231
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    iget-object v1, p0, Lcom/facebook/reflex/view/c/r;->b:Lcom/facebook/reflex/view/b/r;

    invoke-static {v0, v1, v3}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;Lcom/facebook/reflex/view/b/r;Z)V

    .line 232
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-virtual {v0, v4}, Lcom/facebook/reflex/view/c/o;->c(I)V

    goto :goto_0

    .line 234
    :cond_3
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;Z)Z

    goto :goto_0

    .line 228
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public b(Lcom/facebook/reflex/r;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, -0x1

    .line 176
    invoke-static {p1}, Lcom/facebook/reflex/view/b/k;->a(Lcom/facebook/reflex/r;)Landroid/view/MotionEvent;

    move-result-object v0

    .line 177
    invoke-static {}, Lcom/facebook/reflex/view/b/k;->a()Lcom/facebook/reflex/view/b/k;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/reflex/view/c/r;->b:Lcom/facebook/reflex/view/b/r;

    invoke-interface {v2}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/facebook/reflex/view/b/k;->a(Landroid/view/View;Landroid/view/MotionEvent;)V

    .line 178
    iget-object v1, p0, Lcom/facebook/reflex/view/c/r;->b:Lcom/facebook/reflex/view/b/r;

    invoke-interface {v1}, Lcom/facebook/reflex/view/b/r;->f()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    .line 179
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 180
    if-eqz v1, :cond_1

    .line 216
    :cond_0
    :goto_0
    return-void

    .line 184
    :cond_1
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v0}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/reflex/view/c/r;->b:Lcom/facebook/reflex/view/b/r;

    invoke-interface {v1}, Lcom/facebook/reflex/view/b/r;->getBackingWidget()Lcom/facebook/reflex/Widget;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/reflex/Widget;->e()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/view/h;->b(I)I

    move-result v0

    .line 185
    iget-object v1, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v1}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/reflex/view/h;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v1}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/reflex/view/h;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    invoke-interface {v1, v0}, Landroid/widget/ListAdapter;->isEnabled(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 189
    :cond_2
    sget-object v1, Lcom/facebook/reflex/view/c/p;->a:[I

    invoke-virtual {p1}, Lcom/facebook/reflex/r;->a()Lcom/facebook/reflex/t;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/reflex/t;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 191
    :pswitch_0
    invoke-direct {p0, v0}, Lcom/facebook/reflex/view/c/r;->a(I)Z

    .line 192
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    iget-object v1, p0, Lcom/facebook/reflex/view/c/r;->b:Lcom/facebook/reflex/view/b/r;

    invoke-static {v0, v1, v4}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;Lcom/facebook/reflex/view/b/r;Z)V

    .line 193
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-virtual {v0, v3}, Lcom/facebook/reflex/view/c/o;->c(I)V

    .line 195
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v0}, Lcom/facebook/reflex/view/c/o;->b(Lcom/facebook/reflex/view/c/o;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 200
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v0}, Lcom/facebook/reflex/view/c/o;->c(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/c/q;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/reflex/view/c/r;->b:Lcom/facebook/reflex/view/b/r;

    invoke-virtual {v0, v1}, Lcom/facebook/reflex/view/c/q;->a(Lcom/facebook/reflex/view/b/r;)V

    .line 201
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v0}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/h;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-static {v1}, Lcom/facebook/reflex/view/c/o;->c(Lcom/facebook/reflex/view/c/o;)Lcom/facebook/reflex/view/c/q;

    move-result-object v1

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/reflex/view/h;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 203
    :cond_3
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    iget-object v1, p0, Lcom/facebook/reflex/view/c/r;->b:Lcom/facebook/reflex/view/b/r;

    invoke-static {v0, v1, v4}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;Lcom/facebook/reflex/view/b/r;Z)V

    .line 204
    iget-object v0, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-virtual {v0, v3}, Lcom/facebook/reflex/view/c/o;->c(I)V

    goto/16 :goto_0

    .line 209
    :pswitch_2
    iget-object v1, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    iget-object v2, p0, Lcom/facebook/reflex/view/c/r;->b:Lcom/facebook/reflex/view/b/r;

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Lcom/facebook/reflex/view/c/o;->a(Lcom/facebook/reflex/view/c/o;Lcom/facebook/reflex/view/b/r;Z)V

    .line 210
    iget-object v1, p0, Lcom/facebook/reflex/view/c/r;->a:Lcom/facebook/reflex/view/c/o;

    invoke-virtual {v1, v0}, Lcom/facebook/reflex/view/c/o;->c(I)V

    goto/16 :goto_0

    .line 189
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
