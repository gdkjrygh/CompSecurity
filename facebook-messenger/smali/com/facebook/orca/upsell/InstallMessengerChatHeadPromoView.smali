.class public Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;
.super Lcom/facebook/widget/CustomRelativeLayout;
.source "InstallMessengerChatHeadPromoView.java"


# instance fields
.field private final a:Lcom/facebook/c/s;

.field private final b:Lcom/facebook/prefs/shared/d;

.field private final c:Lcom/facebook/analytics/av;

.field private final d:Lcom/facebook/common/time/a;

.field private e:Landroid/widget/Button;

.field private f:Landroid/widget/ImageButton;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 46
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 47
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 51
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .prologue
    .line 54
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/CustomRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 56
    invoke-virtual {p0}, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->getInjector()Lcom/facebook/inject/t;

    move-result-object v1

    .line 57
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    iput-object v0, p0, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->a:Lcom/facebook/c/s;

    .line 58
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->b:Lcom/facebook/prefs/shared/d;

    .line 59
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->c:Lcom/facebook/analytics/av;

    .line 60
    const-class v0, Lcom/facebook/common/time/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    iput-object v0, p0, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->d:Lcom/facebook/common/time/a;

    .line 63
    sget v0, Lcom/facebook/k;->install_messenger_chat_heads_promotion:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->setContentView(I)V

    .line 64
    sget v0, Lcom/facebook/i;->chat_heads_megaphone_install:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->e:Landroid/widget/Button;

    .line 65
    sget v0, Lcom/facebook/i;->chat_heads_megaphone_x_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->f:Landroid/widget/ImageButton;

    .line 67
    iget-object v0, p0, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->e:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/upsell/a;

    invoke-direct {v1, p0}, Lcom/facebook/orca/upsell/a;-><init>(Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    iget-object v0, p0, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->f:Landroid/widget/ImageButton;

    new-instance v1, Lcom/facebook/orca/upsell/b;

    invoke-direct {v1, p0}, Lcom/facebook/orca/upsell/b;-><init>(Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 78
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->d()V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 162
    new-instance v0, Lcom/facebook/analytics/cb;

    invoke-direct {v0, p1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    .line 163
    iget-object v1, p0, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->c:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 164
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->h()V

    return-void
.end method

.method private d()V
    .locals 3

    .prologue
    .line 81
    invoke-direct {p0}, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->g()V

    .line 82
    const-string v0, "market://details?id=com.facebook.orca"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 83
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 84
    const/high16 v0, 0x10000000

    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 85
    iget-object v0, p0, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->a:Lcom/facebook/c/s;

    invoke-virtual {p0}, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    .line 86
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->setVisibility(I)V

    .line 87
    return-void
.end method

.method private e()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 105
    const-string v0, "install_messenger_chat_head_inbox_promo_impression"

    invoke-direct {p0, v0}, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->a(Ljava/lang/String;)V

    .line 106
    invoke-direct {p0}, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->f()V

    .line 107
    iget-object v0, p0, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->b:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/upsell/d;->b:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v0

    .line 110
    iget-object v1, p0, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->b:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/orca/upsell/d;->c:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v1

    .line 113
    iget-object v2, p0, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->b:Lcom/facebook/prefs/shared/d;

    invoke-interface {v2}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v2

    sget-object v3, Lcom/facebook/orca/upsell/d;->b:Lcom/facebook/prefs/shared/ae;

    add-int/lit8 v0, v0, 0x1

    invoke-interface {v2, v3, v0}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v2, Lcom/facebook/orca/upsell/d;->c:Lcom/facebook/prefs/shared/ae;

    add-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v2, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 121
    return-void
.end method

.method private f()V
    .locals 4

    .prologue
    .line 124
    iget-object v0, p0, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->b:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/upsell/d;->d:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v2, -0x1

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v0

    .line 127
    iget-object v2, p0, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->d:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    sub-long v0, v2, v0

    .line 128
    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 129
    iget-object v0, p0, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->b:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/upsell/d;->d:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->d:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/upsell/d;->c:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 136
    :cond_0
    return-void
.end method

.method private g()V
    .locals 4

    .prologue
    .line 139
    const-string v0, "install_messenger_chat_head_inbox_promo_conversion"

    invoke-direct {p0, v0}, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->a(Ljava/lang/String;)V

    .line 140
    iget-object v0, p0, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->b:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/upsell/d;->e:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p0, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->d:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 145
    return-void
.end method

.method private h()V
    .locals 1

    .prologue
    .line 148
    invoke-direct {p0}, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->i()V

    .line 149
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->setVisibility(I)V

    .line 150
    return-void
.end method

.method private i()V
    .locals 3

    .prologue
    .line 153
    const-string v0, "install_messenger_chat_head_inbox_promo_dismiss"

    invoke-direct {p0, v0}, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->a(Ljava/lang/String;)V

    .line 154
    iget-object v0, p0, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->b:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/upsell/d;->b:Lcom/facebook/prefs/shared/ae;

    const/16 v2, 0xa

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 159
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->e()V

    .line 91
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/upsell/InstallMessengerChatHeadPromoView;->setVisibility(I)V

    .line 92
    return-void
.end method
