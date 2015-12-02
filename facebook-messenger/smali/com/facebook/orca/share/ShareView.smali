.class public Lcom/facebook/orca/share/ShareView;
.super Lcom/facebook/widget/CustomRelativeLayout;
.source "ShareView.java"


# instance fields
.field private a:Lcom/facebook/ui/images/d/k;

.field private b:Lcom/facebook/orca/share/a;

.field private c:Lcom/facebook/widget/images/UrlImage;

.field private d:Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/widget/TextView;",
            ">;"
        }
    .end annotation
.end field

.field private h:Landroid/graphics/drawable/Drawable;

.field private i:Lcom/facebook/messages/model/share/Share;

.field private j:Z

.field private k:I

.field private l:Lcom/facebook/orca/share/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 68
    invoke-direct {p0, p1}, Lcom/facebook/widget/CustomRelativeLayout;-><init>(Landroid/content/Context;)V

    .line 69
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/share/ShareView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 70
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 73
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/CustomRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 74
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/share/ShareView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 75
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 78
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/CustomRelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 79
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/share/ShareView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 80
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/share/ShareView;)Lcom/facebook/orca/share/c;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/facebook/orca/share/ShareView;->l:Lcom/facebook/orca/share/c;

    return-object v0
.end method

.method private a(Landroid/content/Context;)Lcom/facebook/ui/images/d/h;
    .locals 5

    .prologue
    const v4, 0x3f19999a    # 0.6f

    .line 235
    const/high16 v0, 0x42700000    # 60.0f

    invoke-static {p1, v0}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v1

    .line 236
    const/high16 v0, 0x43160000    # 150.0f

    invoke-static {p1, v0}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v0

    .line 237
    iget-boolean v2, p0, Lcom/facebook/orca/share/ShareView;->j:Z

    if-eqz v2, :cond_0

    .line 238
    :goto_0
    new-instance v1, Lcom/facebook/ui/images/d/i;

    invoke-direct {v1}, Lcom/facebook/ui/images/d/i;-><init>()V

    new-instance v2, Lcom/facebook/ui/images/d/d;

    invoke-direct {v2}, Lcom/facebook/ui/images/d/d;-><init>()V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v2, v3}, Lcom/facebook/ui/images/d/d;->a(F)Lcom/facebook/ui/images/d/d;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/facebook/ui/images/d/d;->b(F)Lcom/facebook/ui/images/d/d;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/facebook/ui/images/d/d;->c(F)Lcom/facebook/ui/images/d/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/ui/images/d/d;->e()Lcom/facebook/ui/images/d/b;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/ui/images/d/i;->a(Lcom/facebook/ui/images/d/b;)Lcom/facebook/ui/images/d/i;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/ui/images/d/i;->a(I)Lcom/facebook/ui/images/d/i;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/ui/images/d/i;->b(I)Lcom/facebook/ui/images/d/i;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/ui/images/d/i;->c(I)Lcom/facebook/ui/images/d/i;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/ui/images/d/i;->d(I)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    iget-boolean v1, p0, Lcom/facebook/orca/share/ShareView;->j:Z

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/i;->a(Z)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    iget-boolean v1, p0, Lcom/facebook/orca/share/ShareView;->j:Z

    invoke-virtual {v0, v1}, Lcom/facebook/ui/images/d/i;->b(Z)Lcom/facebook/ui/images/d/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/images/d/i;->j()Lcom/facebook/ui/images/d/h;

    move-result-object v0

    return-object v0

    :cond_0
    move v0, v1

    .line 237
    goto :goto_0
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .prologue
    .line 83
    invoke-virtual {p0}, Lcom/facebook/orca/share/ShareView;->getInjector()Lcom/facebook/inject/t;

    move-result-object v1

    .line 84
    const-class v0, Lcom/facebook/ui/images/d/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/d/k;

    iput-object v0, p0, Lcom/facebook/orca/share/ShareView;->a:Lcom/facebook/ui/images/d/k;

    .line 85
    const-class v0, Lcom/facebook/orca/share/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/share/a;

    iput-object v0, p0, Lcom/facebook/orca/share/ShareView;->b:Lcom/facebook/orca/share/a;

    .line 87
    sget v0, Lcom/facebook/k;->orca_share_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/share/ShareView;->setContentView(I)V

    .line 88
    sget v0, Lcom/facebook/i;->share_image:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/share/ShareView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    iput-object v0, p0, Lcom/facebook/orca/share/ShareView;->c:Lcom/facebook/widget/images/UrlImage;

    .line 89
    sget v0, Lcom/facebook/i;->share_name:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/share/ShareView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

    iput-object v0, p0, Lcom/facebook/orca/share/ShareView;->d:Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

    .line 90
    sget v0, Lcom/facebook/i;->share_caption:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/share/ShareView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/share/ShareView;->e:Landroid/widget/TextView;

    .line 91
    sget v0, Lcom/facebook/i;->share_description:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/share/ShareView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/share/ShareView;->f:Landroid/widget/TextView;

    .line 92
    sget v0, Lcom/facebook/i;->share_property1:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/share/ShareView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 93
    sget v1, Lcom/facebook/i;->share_property2:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/share/ShareView;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 94
    sget v2, Lcom/facebook/i;->share_property3:I

    invoke-virtual {p0, v2}, Lcom/facebook/orca/share/ShareView;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 95
    invoke-static {v0, v1, v2}, Lcom/google/common/a/es;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/share/ShareView;->g:Ljava/util/List;

    .line 96
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/h;->orca_share_attachment_link_background:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/share/ShareView;->h:Landroid/graphics/drawable/Drawable;

    .line 99
    new-instance v0, Lcom/facebook/orca/share/b;

    invoke-direct {v0, p0}, Lcom/facebook/orca/share/b;-><init>(Lcom/facebook/orca/share/ShareView;)V

    .line 108
    invoke-virtual {p0, v0}, Lcom/facebook/orca/share/ShareView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 109
    iget-object v1, p0, Lcom/facebook/orca/share/ShareView;->d:Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/share/ShareView;->setWillNotDraw(Z)V

    .line 112
    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {p1, v0}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v0

    iput v0, p0, Lcom/facebook/orca/share/ShareView;->k:I

    .line 113
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/share/ShareView;)Lcom/facebook/messages/model/share/Share;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/facebook/orca/share/ShareView;->i:Lcom/facebook/messages/model/share/Share;

    return-object v0
.end method

.method private d()V
    .locals 10

    .prologue
    const/16 v9, 0x8

    const/4 v8, 0x0

    .line 137
    iget-boolean v0, p0, Lcom/facebook/orca/share/ShareView;->j:Z

    if-eqz v0, :cond_0

    .line 138
    const v0, 0x106000d

    invoke-virtual {p0, v0}, Lcom/facebook/orca/share/ShareView;->setBackgroundResource(I)V

    .line 143
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/share/ShareView;->i:Lcom/facebook/messages/model/share/Share;

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/Share;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 144
    iget-object v0, p0, Lcom/facebook/orca/share/ShareView;->d:Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

    invoke-virtual {v0, v9}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->setVisibility(I)V

    .line 150
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/share/ShareView;->i:Lcom/facebook/messages/model/share/Share;

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/Share;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 151
    iget-object v0, p0, Lcom/facebook/orca/share/ShareView;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 157
    :goto_2
    iget-object v0, p0, Lcom/facebook/orca/share/ShareView;->i:Lcom/facebook/messages/model/share/Share;

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/Share;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 158
    iget-object v0, p0, Lcom/facebook/orca/share/ShareView;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 164
    :goto_3
    iget-object v0, p0, Lcom/facebook/orca/share/ShareView;->b:Lcom/facebook/orca/share/a;

    iget-object v1, p0, Lcom/facebook/orca/share/ShareView;->i:Lcom/facebook/messages/model/share/Share;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/share/a;->a(Lcom/facebook/messages/model/share/Share;)Lcom/facebook/messages/model/share/ShareMedia;

    move-result-object v0

    .line 165
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/ShareMedia;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 166
    const-string v1, "photo"

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/ShareMedia;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 167
    iget-object v1, p0, Lcom/facebook/orca/share/ShareView;->c:Lcom/facebook/widget/images/UrlImage;

    sget v2, Lcom/facebook/h;->orca_image_attachment_background:I

    invoke-virtual {v1, v2}, Lcom/facebook/widget/images/UrlImage;->setBackgroundResource(I)V

    .line 171
    :goto_4
    iget-object v1, p0, Lcom/facebook/orca/share/ShareView;->c:Lcom/facebook/widget/images/UrlImage;

    invoke-virtual {v1, v8}, Lcom/facebook/widget/images/UrlImage;->setVisibility(I)V

    .line 172
    invoke-virtual {v0}, Lcom/facebook/messages/model/share/ShareMedia;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 173
    invoke-virtual {v0}, Landroid/net/Uri;->isAbsolute()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 174
    iget-object v1, p0, Lcom/facebook/orca/share/ShareView;->a:Lcom/facebook/ui/images/d/k;

    invoke-virtual {p0}, Lcom/facebook/orca/share/ShareView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/orca/share/ShareView;->a(Landroid/content/Context;)Lcom/facebook/ui/images/d/h;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/ui/images/d/k;->a(Lcom/facebook/ui/images/d/h;)Lcom/facebook/ui/images/base/b;

    move-result-object v1

    .line 176
    iget-object v2, p0, Lcom/facebook/orca/share/ShareView;->c:Lcom/facebook/widget/images/UrlImage;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/widget/images/UrlImage;->a(Landroid/net/Uri;Lcom/facebook/ui/images/base/b;)V

    .line 184
    :goto_5
    invoke-virtual {p0}, Lcom/facebook/orca/share/ShareView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 185
    iget-object v0, p0, Lcom/facebook/orca/share/ShareView;->i:Lcom/facebook/messages/model/share/Share;

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/Share;->g()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->h_()Lcom/google/common/a/mh;

    move-result-object v3

    .line 186
    iget-object v0, p0, Lcom/facebook/orca/share/ShareView;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 187
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 188
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/share/ShareProperty;

    .line 189
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 190
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 191
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "<font color=\"#888888\">"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/ShareProperty;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->htmlEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "</font>"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 193
    sget v6, Lcom/facebook/o;->share_property:I

    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v5, v7, v8

    const/4 v5, 0x1

    invoke-virtual {v0}, Lcom/facebook/messages/model/share/ShareProperty;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->htmlEncode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v7, v5

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 196
    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_6

    .line 140
    :cond_0
    sget v0, Lcom/facebook/h;->orca_share_attachment_background:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/share/ShareView;->setBackgroundResource(I)V

    goto/16 :goto_0

    .line 146
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/share/ShareView;->d:Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

    invoke-virtual {v0, v8}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->setVisibility(I)V

    .line 147
    iget-object v0, p0, Lcom/facebook/orca/share/ShareView;->d:Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

    iget-object v1, p0, Lcom/facebook/orca/share/ShareView;->i:Lcom/facebook/messages/model/share/Share;

    invoke-virtual {v1}, Lcom/facebook/messages/model/share/Share;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 153
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/share/ShareView;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 154
    iget-object v0, p0, Lcom/facebook/orca/share/ShareView;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/facebook/orca/share/ShareView;->i:Lcom/facebook/messages/model/share/Share;

    invoke-virtual {v1}, Lcom/facebook/messages/model/share/Share;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 160
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/share/ShareView;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setVisibility(I)V

    .line 161
    iget-object v0, p0, Lcom/facebook/orca/share/ShareView;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/facebook/orca/share/ShareView;->i:Lcom/facebook/messages/model/share/Share;

    invoke-virtual {v1}, Lcom/facebook/messages/model/share/Share;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 169
    :cond_4
    iget-object v1, p0, Lcom/facebook/orca/share/ShareView;->c:Lcom/facebook/widget/images/UrlImage;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/facebook/widget/images/UrlImage;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_4

    .line 178
    :cond_5
    iget-object v0, p0, Lcom/facebook/orca/share/ShareView;->c:Lcom/facebook/widget/images/UrlImage;

    invoke-virtual {v0, v9}, Lcom/facebook/widget/images/UrlImage;->setVisibility(I)V

    goto/16 :goto_5

    .line 181
    :cond_6
    iget-object v0, p0, Lcom/facebook/orca/share/ShareView;->c:Lcom/facebook/widget/images/UrlImage;

    invoke-virtual {v0, v9}, Lcom/facebook/widget/images/UrlImage;->setVisibility(I)V

    goto/16 :goto_5

    .line 199
    :cond_7
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 200
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 201
    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_7

    .line 203
    :cond_8
    return-void
.end method

.method private getShareNameRect()Landroid/graphics/Rect;
    .locals 3

    .prologue
    .line 221
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 222
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 223
    iget-object v2, p0, Lcom/facebook/orca/share/ShareView;->d:Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 224
    invoke-virtual {p0, v1}, Lcom/facebook/orca/share/ShareView;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 226
    iget v2, v1, Landroid/graphics/Rect;->left:I

    neg-int v2, v2

    iget v1, v1, Landroid/graphics/Rect;->top:I

    neg-int v1, v1

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Rect;->offset(II)V

    .line 227
    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v2, p0, Lcom/facebook/orca/share/ShareView;->k:I

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 228
    iget v1, v0, Landroid/graphics/Rect;->top:I

    iget v2, p0, Lcom/facebook/orca/share/ShareView;->k:I

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->top:I

    .line 229
    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    iget v2, p0, Lcom/facebook/orca/share/ShareView;->k:I

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 230
    iget v1, v0, Landroid/graphics/Rect;->right:I

    iget v2, p0, Lcom/facebook/orca/share/ShareView;->k:I

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 231
    return-object v0
.end method


# virtual methods
.method a()V
    .locals 1

    .prologue
    .line 206
    invoke-direct {p0}, Lcom/facebook/orca/share/ShareView;->getShareNameRect()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/share/ShareView;->invalidate(Landroid/graphics/Rect;)V

    .line 207
    return-void
.end method

.method public a(Lcom/facebook/messages/model/share/Share;Z)V
    .locals 0

    .prologue
    .line 126
    iput-object p1, p0, Lcom/facebook/orca/share/ShareView;->i:Lcom/facebook/messages/model/share/Share;

    .line 127
    iput-boolean p2, p0, Lcom/facebook/orca/share/ShareView;->j:Z

    .line 128
    invoke-direct {p0}, Lcom/facebook/orca/share/ShareView;->d()V

    .line 129
    return-void
.end method

.method public getShare()Lcom/facebook/messages/model/share/Share;
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/facebook/orca/share/ShareView;->i:Lcom/facebook/messages/model/share/Share;

    return-object v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .prologue
    .line 211
    invoke-super {p0, p1}, Lcom/facebook/widget/CustomRelativeLayout;->onDraw(Landroid/graphics/Canvas;)V

    .line 214
    invoke-direct {p0}, Lcom/facebook/orca/share/ShareView;->getShareNameRect()Landroid/graphics/Rect;

    move-result-object v0

    .line 215
    iget-object v1, p0, Lcom/facebook/orca/share/ShareView;->h:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Lcom/facebook/orca/share/ShareView;->d:Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

    invoke-virtual {v2}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->getDrawableState()[I

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 216
    iget-object v1, p0, Lcom/facebook/orca/share/ShareView;->h:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 217
    iget-object v0, p0, Lcom/facebook/orca/share/ShareView;->h:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 218
    return-void
.end method

.method public setListener(Lcom/facebook/orca/share/c;)V
    .locals 0

    .prologue
    .line 132
    iput-object p1, p0, Lcom/facebook/orca/share/ShareView;->l:Lcom/facebook/orca/share/c;

    .line 133
    return-void
.end method
