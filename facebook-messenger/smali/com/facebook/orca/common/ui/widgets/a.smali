.class public Lcom/facebook/orca/common/ui/widgets/a;
.super Ljava/lang/Object;
.source "AnchorableToast.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Landroid/view/LayoutInflater;

.field private d:Landroid/view/View;

.field private e:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field private f:Landroid/widget/PopupWindow;

.field private g:Lcom/facebook/common/a/c;

.field private h:I

.field private i:I

.field private j:Z

.field private k:I

.field private l:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 25
    const-class v0, Lcom/facebook/orca/common/ui/widgets/a;

    sput-object v0, Lcom/facebook/orca/common/ui/widgets/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/LayoutInflater;)V
    .locals 2

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    const/16 v0, 0x30

    iput v0, p0, Lcom/facebook/orca/common/ui/widgets/a;->k:I

    .line 37
    const-wide/16 v0, 0xbb8

    iput-wide v0, p0, Lcom/facebook/orca/common/ui/widgets/a;->l:J

    .line 45
    iput-object p1, p0, Lcom/facebook/orca/common/ui/widgets/a;->b:Landroid/content/Context;

    .line 46
    iput-object p2, p0, Lcom/facebook/orca/common/ui/widgets/a;->c:Landroid/view/LayoutInflater;

    .line 47
    const/high16 v0, 0x42040000    # 33.0f

    invoke-static {p1, v0}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/common/ui/widgets/a;->i:I

    .line 48
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/common/ui/widgets/a;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/widgets/a;->b()V

    return-void
.end method

.method private b()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 163
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/a;->f:Landroid/widget/PopupWindow;

    if-nez v0, :cond_0

    .line 173
    :goto_0
    return-void

    .line 166
    :cond_0
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 167
    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->d:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 168
    iget v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->k:I

    const/16 v2, 0x30

    if-ne v1, v2, :cond_1

    .line 169
    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->f:Landroid/widget/PopupWindow;

    aget v2, v0, v3

    aget v0, v0, v4

    iget v3, p0, Lcom/facebook/orca/common/ui/widgets/a;->i:I

    sub-int/2addr v0, v3

    iget v3, p0, Lcom/facebook/orca/common/ui/widgets/a;->h:I

    iget v4, p0, Lcom/facebook/orca/common/ui/widgets/a;->i:I

    invoke-virtual {v1, v2, v0, v3, v4}, Landroid/widget/PopupWindow;->update(IIII)V

    goto :goto_0

    .line 171
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->f:Landroid/widget/PopupWindow;

    aget v2, v0, v3

    aget v0, v0, v4

    iget-object v3, p0, Lcom/facebook/orca/common/ui/widgets/a;->d:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v0, v3

    iget v3, p0, Lcom/facebook/orca/common/ui/widgets/a;->h:I

    iget v4, p0, Lcom/facebook/orca/common/ui/widgets/a;->i:I

    invoke-virtual {v1, v2, v0, v3, v4}, Landroid/widget/PopupWindow;->update(IIII)V

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 176
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/a;->f:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    .line 177
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/a;->f:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 178
    iput-object v2, p0, Lcom/facebook/orca/common/ui/widgets/a;->f:Landroid/widget/PopupWindow;

    .line 180
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/a;->g:Lcom/facebook/common/a/c;

    if-eqz v0, :cond_1

    .line 181
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/a;->g:Lcom/facebook/common/a/c;

    invoke-virtual {v0}, Lcom/facebook/common/a/c;->a()V

    .line 182
    iput-object v2, p0, Lcom/facebook/orca/common/ui/widgets/a;->g:Lcom/facebook/common/a/c;

    .line 184
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/a;->e:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    if-eqz v0, :cond_2

    .line 185
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/a;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->e:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 186
    iput-object v2, p0, Lcom/facebook/orca/common/ui/widgets/a;->e:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 188
    :cond_2
    return-void
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 63
    iput p1, p0, Lcom/facebook/orca/common/ui/widgets/a;->k:I

    .line 64
    return-void
.end method

.method public a(J)V
    .locals 0

    .prologue
    .line 71
    iput-wide p1, p0, Lcom/facebook/orca/common/ui/widgets/a;->l:J

    .line 72
    return-void
.end method

.method public a(Landroid/view/View;Landroid/view/View;)V
    .locals 9

    .prologue
    const-wide/16 v7, 0x0

    const/16 v6, 0x33

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 97
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/widgets/a;->a()V

    .line 99
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-nez v0, :cond_0

    .line 100
    sget-object v0, Lcom/facebook/orca/common/ui/widgets/a;->a:Ljava/lang/Class;

    const-string v1, "show called with null window token -- ignoring"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 160
    :goto_0
    return-void

    .line 104
    :cond_0
    iput-object p1, p0, Lcom/facebook/orca/common/ui/widgets/a;->d:Landroid/view/View;

    .line 105
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 106
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 107
    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 108
    sget v2, Lcom/facebook/h;->orca_anchorable_toast_background:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 109
    new-instance v2, Landroid/widget/PopupWindow;

    iget-object v3, p0, Lcom/facebook/orca/common/ui/widgets/a;->b:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/facebook/orca/common/ui/widgets/a;->f:Landroid/widget/PopupWindow;

    .line 111
    new-instance v2, Landroid/widget/FrameLayout;

    iget-object v3, p0, Lcom/facebook/orca/common/ui/widgets/a;->b:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 112
    invoke-virtual {v2, v1}, Landroid/widget/FrameLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 113
    invoke-virtual {v2, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 114
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->h:I

    .line 115
    iget-boolean v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->j:Z

    if-eqz v1, :cond_1

    .line 116
    iget v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->h:I

    const/high16 v3, 0x40000000    # 2.0f

    invoke-static {v1, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-virtual {v2, v1, v3}, Landroid/widget/FrameLayout;->measure(II)V

    .line 119
    invoke-virtual {v2}, Landroid/widget/FrameLayout;->getMeasuredHeight()I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->i:I

    .line 122
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->f:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 123
    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->f:Landroid/widget/PopupWindow;

    iget v2, p0, Lcom/facebook/orca/common/ui/widgets/a;->h:I

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 124
    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->f:Landroid/widget/PopupWindow;

    iget v2, p0, Lcom/facebook/orca/common/ui/widgets/a;->i:I

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 125
    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->f:Landroid/widget/PopupWindow;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 126
    iget-wide v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->l:J

    cmp-long v1, v1, v7

    if-lez v1, :cond_4

    .line 127
    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->f:Landroid/widget/PopupWindow;

    const v2, 0x1030004

    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 136
    :goto_1
    iget v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->k:I

    const/16 v2, 0x30

    if-ne v1, v2, :cond_5

    .line 137
    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->f:Landroid/widget/PopupWindow;

    aget v2, v0, v4

    aget v0, v0, v5

    iget v3, p0, Lcom/facebook/orca/common/ui/widgets/a;->i:I

    sub-int/2addr v0, v3

    invoke-virtual {v1, p1, v6, v2, v0}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 144
    :cond_2
    :goto_2
    iget-wide v0, p0, Lcom/facebook/orca/common/ui/widgets/a;->l:J

    cmp-long v0, v0, v7

    if-lez v0, :cond_3

    .line 145
    new-instance v0, Lcom/facebook/common/a/c;

    new-instance v1, Lcom/facebook/orca/common/ui/widgets/b;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/widgets/b;-><init>(Lcom/facebook/orca/common/ui/widgets/a;)V

    invoke-direct {v0, v1}, Lcom/facebook/common/a/c;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lcom/facebook/orca/common/ui/widgets/a;->g:Lcom/facebook/common/a/c;

    .line 151
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/a;->g:Lcom/facebook/common/a/c;

    iget-wide v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->l:J

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 153
    :cond_3
    new-instance v0, Lcom/facebook/orca/common/ui/widgets/c;

    invoke-direct {v0, p0}, Lcom/facebook/orca/common/ui/widgets/c;-><init>(Lcom/facebook/orca/common/ui/widgets/a;)V

    iput-object v0, p0, Lcom/facebook/orca/common/ui/widgets/a;->e:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 159
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->e:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    goto/16 :goto_0

    .line 129
    :cond_4
    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->f:Landroid/widget/PopupWindow;

    invoke-virtual {v1, v4}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    goto :goto_1

    .line 139
    :cond_5
    iget v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->k:I

    const/16 v2, 0x50

    if-ne v1, v2, :cond_2

    .line 140
    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->f:Landroid/widget/PopupWindow;

    aget v2, v0, v4

    aget v0, v0, v5

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v0, v3

    invoke-virtual {v1, p1, v6, v2, v0}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    goto :goto_2
.end method

.method public a(Landroid/view/View;Ljava/lang/CharSequence;Lcom/facebook/orca/common/ui/widgets/d;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 75
    new-instance v0, Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 77
    sget-object v1, Lcom/facebook/orca/common/ui/widgets/d;->WARNING:Lcom/facebook/orca/common/ui/widgets/d;

    if-ne p3, v1, :cond_0

    .line 78
    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->c:Landroid/view/LayoutInflater;

    sget v2, Lcom/facebook/k;->orca_toast_warning:I

    invoke-virtual {v1, v2, v0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    .line 83
    :goto_0
    iget v0, p0, Lcom/facebook/orca/common/ui/widgets/a;->k:I

    const/16 v2, 0x50

    if-ne v0, v2, :cond_1

    .line 84
    sget v0, Lcom/facebook/i;->toast_bottom_divider:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 85
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 91
    :goto_1
    sget v0, Lcom/facebook/i;->anchorable_toast_text:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 92
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    invoke-virtual {p0, p1, v1}, Lcom/facebook/orca/common/ui/widgets/a;->a(Landroid/view/View;Landroid/view/View;)V

    .line 94
    return-void

    .line 80
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/common/ui/widgets/a;->c:Landroid/view/LayoutInflater;

    sget v2, Lcom/facebook/k;->orca_toast_normal:I

    invoke-virtual {v1, v2, v0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    .line 87
    :cond_1
    sget v0, Lcom/facebook/i;->toast_top_divider:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 88
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 55
    iput-boolean p1, p0, Lcom/facebook/orca/common/ui/widgets/a;->j:Z

    .line 56
    return-void
.end method
