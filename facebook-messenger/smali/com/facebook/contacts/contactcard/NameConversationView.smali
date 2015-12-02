.class public Lcom/facebook/contacts/contactcard/NameConversationView;
.super Lcom/facebook/widget/d;
.source "NameConversationView.java"


# instance fields
.field private final a:Lcom/facebook/orca/f/z;

.field private final b:Landroid/widget/RelativeLayout;

.field private final c:Landroid/widget/TextView;

.field private final d:Lcom/facebook/widget/images/UrlImage;

.field private e:Lcom/facebook/orca/threads/ThreadSummary;

.field private f:Ljava/lang/String;

.field private g:Lcom/facebook/orca/threadview/ThreadViewFragment;

.field private h:Lcom/facebook/analytics/av;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 61
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/contacts/contactcard/NameConversationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 62
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 65
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/contacts/contactcard/NameConversationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 66
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 69
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 71
    check-cast p1, Landroid/support/v4/app/i;

    invoke-virtual {p1}, Landroid/support/v4/app/i;->f()Landroid/support/v4/app/q;

    move-result-object v0

    const-string v1, "threadViewFragment"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ThreadViewFragment;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->g:Lcom/facebook/orca/threadview/ThreadViewFragment;

    .line 74
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/NameConversationView;->getInjector()Lcom/facebook/inject/t;

    move-result-object v1

    .line 75
    const-class v0, Lcom/facebook/orca/f/z;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/z;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->a:Lcom/facebook/orca/f/z;

    .line 76
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->h:Lcom/facebook/analytics/av;

    .line 78
    sget v0, Lcom/facebook/k;->contacts_name_conversation_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/NameConversationView;->setContentView(I)V

    .line 79
    sget v0, Lcom/facebook/i;->contact_card_thread_name_and_tile:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/NameConversationView;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->b:Landroid/widget/RelativeLayout;

    .line 80
    sget v0, Lcom/facebook/i;->thread_view_details_item_thread_tile:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/NameConversationView;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->d:Lcom/facebook/widget/images/UrlImage;

    .line 81
    sget v0, Lcom/facebook/i;->thread_view_details_item_value:I

    invoke-virtual {p0, v0}, Lcom/facebook/contacts/contactcard/NameConversationView;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->c:Landroid/widget/TextView;

    .line 83
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    .line 84
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_1

    .line 85
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->b:Landroid/widget/RelativeLayout;

    sget v1, Lcom/facebook/h;->orca_item_background_holo_light:I

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 90
    :goto_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "es"

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 92
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->c:Landroid/widget/TextView;

    const/high16 v1, 0x41700000    # 15.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 95
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->d:Lcom/facebook/widget/images/UrlImage;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/images/UrlImage;->setFocusable(Z)V

    .line 96
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->d:Lcom/facebook/widget/images/UrlImage;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/images/UrlImage;->setClickable(Z)V

    .line 97
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->d:Lcom/facebook/widget/images/UrlImage;

    new-instance v1, Lcom/facebook/contacts/contactcard/at;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactcard/at;-><init>(Lcom/facebook/contacts/contactcard/NameConversationView;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 104
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->b:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/facebook/contacts/contactcard/au;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactcard/au;-><init>(Lcom/facebook/contacts/contactcard/NameConversationView;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    return-void

    .line 87
    :cond_1
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->b:Landroid/widget/RelativeLayout;

    const v1, 0x1080062

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/contacts/contactcard/NameConversationView;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->f:Ljava/lang/String;

    return-object p1
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 183
    invoke-static {p1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, ""

    :cond_0
    return-object p1
.end method

.method private a()V
    .locals 3

    .prologue
    .line 130
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->e:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->e:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->v()Z

    move-result v0

    if-nez v0, :cond_1

    .line 142
    :cond_0
    :goto_0
    return-void

    .line 134
    :cond_1
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "click"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "button"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "thread_image"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/contacts/contactcard/NameConversationView;->a(Lcom/facebook/analytics/cb;)V

    .line 138
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/NameConversationView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/facebook/orca/images/ThreadIconPickerActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 139
    const-string v1, "threadId"

    iget-object v2, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->e:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v2}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 140
    const-string v1, "hasPictureHash"

    iget-object v2, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->e:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v2}, Lcom/facebook/orca/threads/ThreadSummary;->r()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 141
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/NameConversationView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/analytics/cb;)V
    .locals 2

    .prologue
    .line 188
    const-string v0, "NameConversationView"

    invoke-virtual {p1, v0}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 189
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->e:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_0

    .line 190
    const-string v0, "thread_id"

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->e:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 193
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->h:Lcom/facebook/analytics/av;

    invoke-interface {v0, p1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 194
    return-void
.end method

.method static synthetic a(Lcom/facebook/contacts/contactcard/NameConversationView;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/NameConversationView;->a()V

    return-void
.end method

.method private b()V
    .locals 3

    .prologue
    .line 145
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->e:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->v()Z

    move-result v0

    if-nez v0, :cond_0

    .line 164
    :goto_0
    return-void

    .line 149
    :cond_0
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "click"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "button"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "name_conversation"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/contacts/contactcard/NameConversationView;->a(Lcom/facebook/analytics/cb;)V

    .line 153
    new-instance v0, Lcom/facebook/orca/threadview/as;

    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/NameConversationView;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->f:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/threadview/as;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 154
    new-instance v1, Lcom/facebook/contacts/contactcard/av;

    invoke-direct {v1, p0}, Lcom/facebook/contacts/contactcard/av;-><init>(Lcom/facebook/contacts/contactcard/NameConversationView;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/as;->a(Lcom/facebook/orca/threadview/aw;)V

    .line 163
    invoke-virtual {v0}, Lcom/facebook/orca/threadview/as;->show()V

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/contacts/contactcard/NameConversationView;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/NameConversationView;->b()V

    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    .line 167
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 168
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->f:Ljava/lang/String;

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->e:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 180
    :goto_0
    return-void

    .line 171
    :cond_0
    new-instance v0, Lcom/facebook/orca/server/an;

    invoke-direct {v0}, Lcom/facebook/orca/server/an;-><init>()V

    .line 172
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->e:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/an;->a(Ljava/lang/String;)Lcom/facebook/orca/server/an;

    .line 173
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/an;->a(Z)Lcom/facebook/orca/server/an;

    .line 174
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->f:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/facebook/contacts/contactcard/NameConversationView;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/an;->b(Ljava/lang/String;)Lcom/facebook/orca/server/an;

    .line 175
    invoke-virtual {v0}, Lcom/facebook/orca/server/an;->h()Lcom/facebook/orca/server/ModifyThreadParams;

    move-result-object v0

    .line 176
    iget-object v1, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->g:Lcom/facebook/orca/threadview/ThreadViewFragment;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/threadview/ThreadViewFragment;->a(Lcom/facebook/orca/server/ModifyThreadParams;)V

    .line 178
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "set"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "thread_name"

    invoke-virtual {v0, v1}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/contacts/contactcard/NameConversationView;->a(Lcom/facebook/analytics/cb;)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/facebook/contacts/contactcard/NameConversationView;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Lcom/facebook/contacts/contactcard/NameConversationView;->c()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 114
    iput-object p2, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->e:Lcom/facebook/orca/threads/ThreadSummary;

    .line 115
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadSummary;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->f:Ljava/lang/String;

    .line 116
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    sget v1, Lcom/facebook/user/tiles/a;->a:I

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 118
    invoke-virtual {p0}, Lcom/facebook/contacts/contactcard/NameConversationView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/h;->orca_default_camera_tile:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 119
    new-instance v2, Landroid/graphics/drawable/LayerDrawable;

    const/4 v3, 0x2

    new-array v3, v3, [Landroid/graphics/drawable/Drawable;

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    invoke-direct {v2, v3}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 120
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->d:Lcom/facebook/widget/images/UrlImage;

    invoke-virtual {v0, v2}, Lcom/facebook/widget/images/UrlImage;->setPlaceHolderDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 121
    if-eqz p2, :cond_0

    .line 122
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->d:Lcom/facebook/widget/images/UrlImage;

    iget-object v1, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->a:Lcom/facebook/orca/f/z;

    invoke-virtual {v1, p2, v4}, Lcom/facebook/orca/f/z;->a(Lcom/facebook/orca/threads/ThreadSummary;Z)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Landroid/net/Uri;)V

    .line 127
    :goto_0
    return-void

    .line 125
    :cond_0
    iget-object v0, p0, Lcom/facebook/contacts/contactcard/NameConversationView;->d:Lcom/facebook/widget/images/UrlImage;

    sget-object v1, Lcom/facebook/widget/images/UrlImage;->a:Lcom/facebook/ui/images/b/m;

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Lcom/facebook/ui/images/b/m;)V

    goto :goto_0
.end method
