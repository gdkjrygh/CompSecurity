.class public Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;
.super Landroid/widget/PopupWindow;
.source "PopupWindowCompat.java"


# static fields
.field private static final NOP:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field private static final superListenerField:Ljava/lang/reflect/Field;


# instance fields
.field private mSuperScrollListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field private mViewTreeObserver:Landroid/view/ViewTreeObserver;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 43
    const/4 v0, 0x0

    .line 45
    .local v0, "f":Ljava/lang/reflect/Field;
    :try_start_0
    const-class v1, Landroid/widget/PopupWindow;

    const-string v2, "mOnScrollChangedListener"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 46
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    :goto_0
    sput-object v0, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->superListenerField:Ljava/lang/reflect/Field;

    .line 53
    new-instance v1, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat$1;

    invoke-direct {v1}, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat$1;-><init>()V

    sput-object v1, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->NOP:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    .line 58
    return-void

    .line 47
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0}, Landroid/widget/PopupWindow;-><init>()V

    .line 65
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->init()V

    .line 66
    return-void
.end method

.method public constructor <init>(II)V
    .locals 0
    .param p1, "width"    # I
    .param p2, "height"    # I

    .prologue
    .line 90
    invoke-direct {p0, p1, p2}, Landroid/widget/PopupWindow;-><init>(II)V

    .line 91
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->init()V

    .line 92
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 69
    invoke-direct {p0, p1}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    .line 70
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->init()V

    .line 71
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 74
    invoke-direct {p0, p1, p2}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 75
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->init()V

    .line 76
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 79
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 80
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->init()V

    .line 81
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I
    .param p4, "defStyleRes"    # I

    .prologue
    .line 85
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 86
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->init()V

    .line 87
    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 0
    .param p1, "contentView"    # Landroid/view/View;

    .prologue
    .line 95
    invoke-direct {p0, p1}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;)V

    .line 96
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->init()V

    .line 97
    return-void
.end method

.method public constructor <init>(Landroid/view/View;II)V
    .locals 0
    .param p1, "contentView"    # Landroid/view/View;
    .param p2, "width"    # I
    .param p3, "height"    # I

    .prologue
    .line 105
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    .line 106
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->init()V

    .line 107
    return-void
.end method

.method public constructor <init>(Landroid/view/View;IIZ)V
    .locals 0
    .param p1, "contentView"    # Landroid/view/View;
    .param p2, "width"    # I
    .param p3, "height"    # I
    .param p4, "focusable"    # Z

    .prologue
    .line 100
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    .line 101
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->init()V

    .line 102
    return-void
.end method

.method private init()V
    .locals 3

    .prologue
    .line 110
    sget-object v1, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->superListenerField:Ljava/lang/reflect/Field;

    if-eqz v1, :cond_0

    .line 112
    :try_start_0
    sget-object v1, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->superListenerField:Ljava/lang/reflect/Field;

    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    iput-object v1, p0, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->mSuperScrollListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    .line 113
    sget-object v1, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->superListenerField:Ljava/lang/reflect/Field;

    sget-object v2, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->NOP:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    :cond_0
    :goto_0
    return-void

    .line 114
    :catch_0
    move-exception v0

    .line 115
    .local v0, "e":Ljava/lang/Exception;
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->mSuperScrollListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    goto :goto_0
.end method

.method private registerListener(Landroid/view/View;)V
    .locals 3
    .param p1, "anchor"    # Landroid/view/View;

    .prologue
    .line 135
    iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->mSuperScrollListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    if-eqz v1, :cond_1

    .line 136
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 138
    .local v0, "vto":Landroid/view/ViewTreeObserver;
    :goto_0
    iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->mViewTreeObserver:Landroid/view/ViewTreeObserver;

    if-eq v0, v1, :cond_1

    .line 139
    iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->mViewTreeObserver:Landroid/view/ViewTreeObserver;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->mViewTreeObserver:Landroid/view/ViewTreeObserver;

    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 140
    iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->mViewTreeObserver:Landroid/view/ViewTreeObserver;

    iget-object v2, p0, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->mSuperScrollListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 142
    :cond_0
    iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->mViewTreeObserver:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_1

    .line 143
    iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->mSuperScrollListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 147
    .end local v0    # "vto":Landroid/view/ViewTreeObserver;
    :cond_1
    return-void

    .line 137
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private unregisterListener()V
    .locals 2

    .prologue
    .line 122
    iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->mSuperScrollListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->mViewTreeObserver:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_1

    .line 123
    iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->mViewTreeObserver:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 124
    iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->mViewTreeObserver:Landroid/view/ViewTreeObserver;

    iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->mSuperScrollListener:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 126
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->mViewTreeObserver:Landroid/view/ViewTreeObserver;

    .line 128
    :cond_1
    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 0

    .prologue
    .line 175
    invoke-super {p0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 176
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->unregisterListener()V

    .line 177
    return-void
.end method

.method public showAsDropDown(Landroid/view/View;II)V
    .locals 0
    .param p1, "anchor"    # Landroid/view/View;
    .param p2, "xoff"    # I
    .param p3, "yoff"    # I

    .prologue
    .line 151
    invoke-super {p0, p1, p2, p3}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 152
    invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->registerListener(Landroid/view/View;)V

    .line 153
    return-void
.end method

.method public showAtLocation(Landroid/view/View;III)V
    .locals 0
    .param p1, "parent"    # Landroid/view/View;
    .param p2, "gravity"    # I
    .param p3, "x"    # I
    .param p4, "y"    # I

    .prologue
    .line 169
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 170
    invoke-direct {p0}, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->unregisterListener()V

    .line 171
    return-void
.end method

.method public update(Landroid/view/View;II)V
    .locals 0
    .param p1, "anchor"    # Landroid/view/View;
    .param p2, "width"    # I
    .param p3, "height"    # I

    .prologue
    .line 163
    invoke-super {p0, p1, p2, p3}, Landroid/widget/PopupWindow;->update(Landroid/view/View;II)V

    .line 164
    invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->registerListener(Landroid/view/View;)V

    .line 165
    return-void
.end method

.method public update(Landroid/view/View;IIII)V
    .locals 0
    .param p1, "anchor"    # Landroid/view/View;
    .param p2, "xoff"    # I
    .param p3, "yoff"    # I
    .param p4, "width"    # I
    .param p5, "height"    # I

    .prologue
    .line 157
    invoke-super/range {p0 .. p5}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    .line 158
    invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/widget/PopupWindowCompat;->registerListener(Landroid/view/View;)V

    .line 159
    return-void
.end method
