.class public Lcom/facebook/orca/common/ui/titlebar/TitleBar;
.super Lcom/facebook/widget/f;
.source "TitleBar.java"

# interfaces
.implements Lcom/facebook/widget/titlebar/a;


# instance fields
.field private a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/config/server/j;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lcom/facebook/push/mqtt/v;

.field private c:Lcom/facebook/config/a/a;

.field private d:Lcom/facebook/analytics/av;

.field private e:Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;

.field private f:Landroid/view/View;

.field private g:Landroid/view/ViewGroup;

.field private h:Landroid/view/ViewGroup;

.field private i:Landroid/widget/ImageView;

.field private j:Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;

.field private k:Landroid/view/View;

.field private l:Landroid/widget/LinearLayout;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/view/View;

.field private o:Landroid/view/View;

.field private p:Ljava/lang/String;

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:Lcom/facebook/base/broadcast/q;

.field private u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/widget/titlebar/d;",
            ">;"
        }
    .end annotation
.end field

.field private v:Lcom/facebook/widget/titlebar/b;

.field private w:Lcom/facebook/orca/common/b/a;

.field private x:Lcom/facebook/orca/fbwebrtc/l;

.field private y:Landroid/graphics/Paint;

.field private z:Lcom/facebook/widget/d/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 99
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 85
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->u:Ljava/util/List;

    .line 100
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 101
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 104
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 85
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->u:Ljava/util/List;

    .line 105
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 106
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 109
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 85
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->u:Ljava/util/List;

    .line 110
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 111
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 114
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->getInjector()Lcom/facebook/inject/t;

    move-result-object v1

    .line 115
    const-class v0, Lcom/facebook/config/server/j;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->a:Ljavax/inject/a;

    .line 116
    const-class v0, Lcom/facebook/push/mqtt/v;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/mqtt/v;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->b:Lcom/facebook/push/mqtt/v;

    .line 117
    const-class v0, Lcom/facebook/config/a/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/a;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->c:Lcom/facebook/config/a/a;

    .line 118
    const-class v0, Lcom/facebook/orca/common/b/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/b/a;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->w:Lcom/facebook/orca/common/b/a;

    .line 119
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->d:Lcom/facebook/analytics/av;

    .line 120
    const-class v0, Lcom/facebook/orca/fbwebrtc/l;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/fbwebrtc/l;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->x:Lcom/facebook/orca/fbwebrtc/l;

    .line 122
    sget-object v0, Lcom/facebook/q;->TitleBar:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 123
    sget v1, Lcom/facebook/q;->TitleBar_title:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->p:Ljava/lang/String;

    .line 124
    sget v1, Lcom/facebook/q;->TitleBar_hasProgressBar:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->r:Z

    .line 125
    sget v1, Lcom/facebook/q;->TitleBar_hasBackButton:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->q:Z

    .line 126
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 128
    sget v0, Lcom/facebook/k;->orca_titlebar:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->setContentView(I)V

    .line 130
    sget v0, Lcom/facebook/i;->titlebar_back_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->e:Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;

    .line 131
    sget v0, Lcom/facebook/i;->titlebar_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->f:Landroid/view/View;

    .line 132
    sget v0, Lcom/facebook/i;->titlebar_default_text_title:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->j:Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;

    .line 133
    sget v0, Lcom/facebook/i;->titlebar_main_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->g:Landroid/view/ViewGroup;

    .line 134
    sget v0, Lcom/facebook/i;->titlebar_text_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->h:Landroid/view/ViewGroup;

    .line 135
    sget v0, Lcom/facebook/i;->titlebar_menu_arrow:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->i:Landroid/widget/ImageView;

    .line 136
    sget v0, Lcom/facebook/i;->titlebar_button_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->l:Landroid/widget/LinearLayout;

    .line 137
    sget v0, Lcom/facebook/i;->call_status_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->m:Landroid/widget/TextView;

    .line 138
    sget v0, Lcom/facebook/i;->orca_titlebar_divebar_button_overlay_view_holder:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->n:Landroid/view/View;

    .line 140
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->j:Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->setText(Ljava/lang/String;)V

    .line 142
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 143
    const-string v1, "com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 144
    const-string v1, "com.facebook.mqtt.ACTION_MQTT_CONFIG_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 145
    const-string v1, "com.facebook.orca.login.AuthStateMachineMonitor.LOGIN_COMPLETE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 146
    const-string v1, "com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 147
    const-string v1, "com.facebook.orca.fbwebrtc.CALL_STATUS_AND_DURATION_UPDATE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 148
    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/q;

    invoke-direct {v1, p0, p1, v0}, Lcom/facebook/orca/common/ui/titlebar/q;-><init>(Lcom/facebook/orca/common/ui/titlebar/TitleBar;Landroid/content/Context;Landroid/content/IntentFilter;)V

    iput-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->t:Lcom/facebook/base/broadcast/q;

    .line 164
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->g:Landroid/view/ViewGroup;

    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/r;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/titlebar/r;-><init>(Lcom/facebook/orca/common/ui/titlebar/TitleBar;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 176
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->m:Landroid/widget/TextView;

    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/s;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/titlebar/s;-><init>(Lcom/facebook/orca/common/ui/titlebar/TitleBar;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 183
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->c:Lcom/facebook/config/a/a;

    invoke-virtual {v0}, Lcom/facebook/config/a/a;->h()Lcom/facebook/config/a/b;

    move-result-object v0

    sget-object v1, Lcom/facebook/config/a/b;->DEVELOPMENT:Lcom/facebook/config/a/b;

    if-ne v0, v1, :cond_0

    .line 184
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->setWillNotDraw(Z)V

    .line 187
    :cond_0
    iget-boolean v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->q:Z

    if-nez v0, :cond_1

    .line 188
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->e:Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;->setVisibility(I)V

    .line 191
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->e:Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;

    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/t;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/titlebar/t;-><init>(Lcom/facebook/orca/common/ui/titlebar/TitleBar;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 199
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->d()V

    .line 201
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->y:Landroid/graphics/Paint;

    .line 202
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->y:Landroid/graphics/Paint;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 203
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->y:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 204
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->y:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 205
    return-void
.end method

.method private a(Landroid/view/View;Landroid/view/View;)V
    .locals 2

    .prologue
    .line 536
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 537
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v1

    .line 538
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 539
    invoke-virtual {v0, p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 540
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/common/ui/titlebar/TitleBar;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->e()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/common/ui/titlebar/TitleBar;Lcom/facebook/orca/common/ui/titlebar/z;I)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->a(Lcom/facebook/orca/common/ui/titlebar/z;I)V

    return-void
.end method

.method private a(Lcom/facebook/orca/common/ui/titlebar/z;I)V
    .locals 2

    .prologue
    .line 436
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p2, v0, :cond_1

    .line 450
    :cond_0
    :goto_0
    return-void

    .line 440
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->u:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/titlebar/d;

    .line 441
    invoke-virtual {v0}, Lcom/facebook/widget/titlebar/d;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 442
    invoke-virtual {v0}, Lcom/facebook/widget/titlebar/d;->e()Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v1, 0x1

    .line 443
    :goto_1
    invoke-virtual {p1, v1}, Lcom/facebook/orca/common/ui/titlebar/z;->setSelected(Z)V

    .line 444
    invoke-virtual {v0, v1}, Lcom/facebook/widget/titlebar/d;->a(Z)V

    .line 446
    :cond_2
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->v:Lcom/facebook/widget/titlebar/b;

    if-eqz v1, :cond_0

    .line 447
    invoke-virtual {v0}, Lcom/facebook/widget/titlebar/d;->g()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->a(Ljava/lang/String;)V

    .line 448
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->v:Lcom/facebook/widget/titlebar/b;

    invoke-virtual {v1, v0}, Lcom/facebook/widget/titlebar/b;->a(Lcom/facebook/widget/titlebar/d;)V

    goto :goto_0

    .line 442
    :cond_3
    const/4 v1, 0x0

    goto :goto_1
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 416
    if-nez p1, :cond_0

    .line 433
    :goto_0
    return-void

    .line 420
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 422
    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "click"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "button"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    .line 427
    instance-of v2, v0, Lcom/facebook/analytics/d;

    if-eqz v2, :cond_1

    .line 428
    check-cast v0, Lcom/facebook/analytics/d;

    invoke-interface {v0}, Lcom/facebook/analytics/d;->g_()Lcom/facebook/analytics/f/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/analytics/f/a;->toString()Ljava/lang/String;

    move-result-object v0

    .line 429
    invoke-virtual {v1, v0}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 432
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->d:Lcom/facebook/analytics/av;

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/orca/common/ui/titlebar/TitleBar;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->f()V

    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/common/ui/titlebar/TitleBar;)Lcom/facebook/widget/d/a;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->z:Lcom/facebook/widget/d/a;

    return-object v0
.end method

.method private c()V
    .locals 2

    .prologue
    .line 354
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    .line 355
    const-string v1, "titlebar_back_button"

    invoke-direct {p0, v1}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->a(Ljava/lang/String;)V

    .line 356
    invoke-virtual {v0}, Landroid/app/Activity;->onBackPressed()V

    .line 357
    return-void
.end method

.method static synthetic d(Lcom/facebook/orca/common/ui/titlebar/TitleBar;)Landroid/view/ViewGroup;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->g:Landroid/view/ViewGroup;

    return-object v0
.end method

.method private d()V
    .locals 8

    .prologue
    const/4 v6, 0x4

    const/4 v4, -0x2

    const/16 v7, 0x8

    const/4 v3, 0x0

    .line 360
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    :goto_0
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->u:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 362
    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/z;

    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/facebook/orca/common/ui/titlebar/z;-><init>(Landroid/content/Context;)V

    .line 363
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v2, v4, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 365
    invoke-virtual {v1, v2}, Lcom/facebook/orca/common/ui/titlebar/z;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 366
    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 367
    new-instance v2, Lcom/facebook/orca/common/ui/titlebar/u;

    invoke-direct {v2, p0, v0}, Lcom/facebook/orca/common/ui/titlebar/u;-><init>(Lcom/facebook/orca/common/ui/titlebar/TitleBar;I)V

    invoke-virtual {v1, v2}, Lcom/facebook/orca/common/ui/titlebar/z;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 373
    if-nez v0, :cond_0

    .line 374
    sget v2, Lcom/facebook/i;->title_button_1:I

    invoke-virtual {v1, v2}, Lcom/facebook/orca/common/ui/titlebar/z;->setId(I)V

    .line 360
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    move v2, v3

    move v4, v3

    .line 379
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 380
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/titlebar/z;

    .line 381
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->u:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/widget/titlebar/d;

    .line 382
    invoke-virtual {v1}, Lcom/facebook/widget/titlebar/d;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/facebook/orca/common/ui/titlebar/z;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 383
    invoke-virtual {v1}, Lcom/facebook/widget/titlebar/d;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/facebook/orca/common/ui/titlebar/z;->setText(Ljava/lang/String;)V

    .line 384
    invoke-virtual {v1}, Lcom/facebook/widget/titlebar/d;->i()I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/facebook/orca/common/ui/titlebar/z;->setButtonWidth(I)V

    .line 385
    invoke-virtual {v1}, Lcom/facebook/widget/titlebar/d;->f()Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v6

    :goto_2
    invoke-virtual {v0, v5}, Lcom/facebook/orca/common/ui/titlebar/z;->setVisibility(I)V

    .line 386
    invoke-virtual {v1}, Lcom/facebook/widget/titlebar/d;->e()Z

    move-result v5

    invoke-virtual {v0, v5}, Lcom/facebook/orca/common/ui/titlebar/z;->setSelected(Z)V

    .line 387
    invoke-virtual {v1}, Lcom/facebook/widget/titlebar/d;->d()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 388
    iget-boolean v1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->s:Z

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/z;->setShowProgress(Z)V

    .line 389
    const/4 v1, 0x1

    .line 379
    :goto_3
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    move v4, v1

    goto :goto_1

    :cond_2
    move v5, v3

    .line 385
    goto :goto_2

    .line 393
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    move v1, v0

    :goto_4
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 394
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/titlebar/z;

    .line 395
    invoke-virtual {v0, v7}, Lcom/facebook/orca/common/ui/titlebar/z;->setVisibility(I)V

    .line 396
    invoke-virtual {v0, v3}, Lcom/facebook/orca/common/ui/titlebar/z;->setShowProgress(Z)V

    .line 393
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_4

    .line 399
    :cond_4
    iget-boolean v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->r:Z

    if-eqz v0, :cond_7

    .line 400
    if-eqz v4, :cond_5

    .line 401
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->j:Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;

    invoke-virtual {v0, v7}, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->setProgressBarVisibility(I)V

    .line 410
    :goto_5
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->e()V

    .line 412
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->f()V

    .line 413
    return-void

    .line 403
    :cond_5
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->j:Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;

    iget-boolean v1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->s:Z

    if-eqz v1, :cond_6

    :goto_6
    invoke-virtual {v0, v3}, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->setProgressBarVisibility(I)V

    goto :goto_5

    :cond_6
    move v3, v6

    goto :goto_6

    .line 406
    :cond_7
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->j:Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;

    invoke-virtual {v0, v7}, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->setProgressBarVisibility(I)V

    goto :goto_5

    :cond_8
    move v1, v4

    goto :goto_3
.end method

.method static synthetic e(Lcom/facebook/orca/common/ui/titlebar/TitleBar;)Lcom/facebook/orca/fbwebrtc/l;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->x:Lcom/facebook/orca/fbwebrtc/l;

    return-object v0
.end method

.method private e()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 473
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/server/j;

    .line 474
    invoke-static {}, Lcom/facebook/base/b;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Lcom/facebook/config/server/j;->a()Lcom/facebook/http/c/i;

    move-result-object v2

    invoke-interface {v0}, Lcom/facebook/config/server/j;->b()Lcom/facebook/http/c/i;

    move-result-object v0

    if-eq v2, v0, :cond_0

    const/4 v0, 0x1

    .line 477
    :goto_0
    if-eqz v0, :cond_1

    .line 478
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->f:Landroid/view/View;

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    const/16 v3, 0xff

    invoke-static {v1, v3, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-direct {v2, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 482
    :goto_1
    return-void

    :cond_0
    move v0, v1

    .line 474
    goto :goto_0

    .line 480
    :cond_1
    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/w;->FACEBOOK:Lcom/facebook/orca/common/ui/titlebar/w;

    invoke-direct {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->setColorScheme(Lcom/facebook/orca/common/ui/titlebar/w;)V

    goto :goto_1
.end method

.method private f()V
    .locals 2

    .prologue
    .line 543
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->x:Lcom/facebook/orca/fbwebrtc/l;

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/l;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 544
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->m:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 545
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->m:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->x:Lcom/facebook/orca/fbwebrtc/l;

    invoke-virtual {v1}, Lcom/facebook/orca/fbwebrtc/l;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 549
    :goto_0
    return-void

    .line 547
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->m:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method

.method static synthetic f(Lcom/facebook/orca/common/ui/titlebar/TitleBar;)V
    .locals 0

    .prologue
    .line 55
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->c()V

    return-void
.end method

.method private setColorScheme(Lcom/facebook/orca/common/ui/titlebar/w;)V
    .locals 2

    .prologue
    .line 485
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->e:Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;->setColorScheme(Lcom/facebook/orca/common/ui/titlebar/w;)V

    .line 488
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 489
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/titlebar/z;

    .line 490
    invoke-virtual {v0, p1}, Lcom/facebook/orca/common/ui/titlebar/z;->setColorScheme(Lcom/facebook/orca/common/ui/titlebar/w;)V

    .line 488
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 493
    :cond_0
    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/v;->b:[I

    invoke-virtual {p1}, Lcom/facebook/orca/common/ui/titlebar/w;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 501
    :goto_1
    return-void

    .line 495
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->f:Landroid/view/View;

    sget v1, Lcom/facebook/h;->orca_title_bar_background:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    .line 498
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->f:Landroid/view/View;

    sget v1, Lcom/facebook/h;->orca_title_bar_sms_background:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    .line 493
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public a(Z)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 328
    iput-boolean p1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->s:Z

    .line 330
    iget-boolean v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->r:Z

    if-nez v0, :cond_0

    .line 351
    :goto_0
    return-void

    :cond_0
    move v1, v2

    .line 335
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 336
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->u:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/titlebar/d;

    invoke-virtual {v0}, Lcom/facebook/widget/titlebar/d;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 337
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/titlebar/z;

    .line 338
    invoke-virtual {v0, p1}, Lcom/facebook/orca/common/ui/titlebar/z;->setShowProgress(Z)V

    .line 339
    const/4 v0, 0x1

    .line 344
    :goto_2
    if-eqz v0, :cond_2

    .line 345
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->j:Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->setProgressBarVisibility(I)V

    goto :goto_0

    .line 335
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 346
    :cond_2
    if-eqz p1, :cond_3

    .line 347
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->j:Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->setProgressBarVisibility(I)V

    goto :goto_0

    .line 349
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->j:Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->setProgressBarVisibility(I)V

    goto :goto_0

    :cond_4
    move v0, v2

    goto :goto_2
.end method

.method public a()Z
    .locals 2

    .prologue
    .line 268
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->w:Lcom/facebook/orca/common/b/a;

    sget-object v1, Lcom/facebook/orca/common/b/a;->FB4A:Lcom/facebook/orca/common/b/a;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()V
    .locals 2

    .prologue
    .line 527
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->o:Landroid/view/View;

    if-nez v0, :cond_0

    .line 533
    :goto_0
    return-void

    .line 531
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->o:Landroid/view/View;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->n:Landroid/view/View;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->a(Landroid/view/View;Landroid/view/View;)V

    .line 532
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->o:Landroid/view/View;

    goto :goto_0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 4

    .prologue
    .line 222
    invoke-super {p0, p1}, Lcom/facebook/widget/f;->draw(Landroid/graphics/Canvas;)V

    .line 224
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->c:Lcom/facebook/config/a/a;

    invoke-virtual {v0}, Lcom/facebook/config/a/a;->h()Lcom/facebook/config/a/b;

    move-result-object v0

    sget-object v1, Lcom/facebook/config/a/b;->DEVELOPMENT:Lcom/facebook/config/a/b;

    if-ne v0, v1, :cond_0

    .line 225
    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/v;->a:[I

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->b:Lcom/facebook/push/mqtt/v;

    invoke-virtual {v1}, Lcom/facebook/push/mqtt/v;->f()Lcom/facebook/push/mqtt/bu;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/push/mqtt/bu;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 236
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->y:Landroid/graphics/Paint;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 240
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41200000    # 10.0f

    invoke-static {v0, v1}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v0

    .line 241
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v1

    sub-int/2addr v1, v0

    int-to-float v1, v1

    int-to-float v2, v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    iget-object v3, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->y:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 243
    :cond_0
    return-void

    .line 227
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->y:Landroid/graphics/Paint;

    const/high16 v1, -0x10000

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    .line 230
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->y:Landroid/graphics/Paint;

    const/16 v1, -0x100

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    .line 233
    :pswitch_2
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->y:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    .line 225
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public getButtonSpecs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/widget/titlebar/d;",
            ">;"
        }
    .end annotation

    .prologue
    .line 301
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->u:Ljava/util/List;

    return-object v0
.end method

.method public getCustomTitleView()Landroid/view/View;
    .locals 1

    .prologue
    .line 281
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->k:Landroid/view/View;

    return-object v0
.end method

.method public getOnToolbarButtonListener()Lcom/facebook/widget/titlebar/b;
    .locals 1

    .prologue
    .line 453
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->v:Lcom/facebook/widget/titlebar/b;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 246
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->p:Ljava/lang/String;

    return-object v0
.end method

.method public getTitleBarDivebarButtonOverlay()Landroid/view/View;
    .locals 2

    .prologue
    .line 515
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->o:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 516
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->o:Landroid/view/View;

    .line 522
    :goto_0
    return-object v0

    .line 519
    :cond_0
    new-instance v0, Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/ac;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->o:Landroid/view/View;

    .line 520
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->o:Landroid/view/View;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->n:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 521
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->n:Landroid/view/View;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->o:Landroid/view/View;

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->a(Landroid/view/View;Landroid/view/View;)V

    .line 522
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->o:Landroid/view/View;

    goto :goto_0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .prologue
    .line 209
    invoke-super {p0}, Lcom/facebook/widget/f;->onAttachedToWindow()V

    .line 210
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->t:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->a()V

    .line 211
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->e()V

    .line 212
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 216
    invoke-super {p0}, Lcom/facebook/widget/f;->onDetachedFromWindow()V

    .line 217
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->t:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->b()V

    .line 218
    return-void
.end method

.method public setButtonSpecs(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/widget/titlebar/d;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 306
    invoke-static {p1}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->u:Ljava/util/List;

    .line 307
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->d()V

    .line 308
    return-void
.end method

.method public setCustomTitleView(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 286
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->k:Landroid/view/View;

    .line 287
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->h:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-le v0, v2, :cond_0

    .line 288
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->h:Landroid/view/ViewGroup;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 291
    :cond_0
    if-eqz p1, :cond_1

    .line 292
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->h:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 293
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 294
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->j:Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->setVisibility(I)V

    .line 298
    :goto_0
    return-void

    .line 296
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->j:Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->setVisibility(I)V

    goto :goto_0
.end method

.method public setHasBackButton(Z)V
    .locals 2

    .prologue
    .line 263
    iput-boolean p1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->q:Z

    .line 264
    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->e:Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;->setVisibility(I)V

    .line 265
    return-void

    .line 264
    :cond_0
    const/16 v0, 0x8

    goto :goto_0
.end method

.method public setHasProgressBar(Z)V
    .locals 1

    .prologue
    .line 273
    iget-boolean v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->r:Z

    if-eq v0, p1, :cond_1

    const/4 v0, 0x1

    .line 274
    :goto_0
    iput-boolean p1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->r:Z

    .line 275
    if-eqz v0, :cond_0

    .line 276
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->d()V

    .line 278
    :cond_0
    return-void

    .line 273
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setOnToolbarButtonListener(Lcom/facebook/widget/titlebar/b;)V
    .locals 0

    .prologue
    .line 458
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->v:Lcom/facebook/widget/titlebar/b;

    .line 459
    return-void
.end method

.method public setQuickActionMenuListener(Lcom/facebook/widget/d/a;)V
    .locals 0

    .prologue
    .line 505
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->z:Lcom/facebook/widget/d/a;

    .line 506
    return-void
.end method

.method public setTitle(I)V
    .locals 2

    .prologue
    .line 257
    invoke-virtual {p0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->p:Ljava/lang/String;

    .line 258
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->j:Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->setText(Ljava/lang/String;)V

    .line 259
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 251
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->p:Ljava/lang/String;

    .line 252
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->j:Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/common/ui/titlebar/TitleBarDefaultTextTitle;->setText(Ljava/lang/String;)V

    .line 253
    return-void
.end method
