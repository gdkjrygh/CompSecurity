.class public Lcom/facebook/orca/about/MessengerAboutActivity;
.super Lcom/facebook/base/activity/i;
.source "MessengerAboutActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# instance fields
.field private p:Lcom/facebook/c/s;

.field private q:Lcom/facebook/widget/titlebar/a;

.field private r:Landroid/widget/TextView;

.field private s:Landroid/widget/TextView;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private v:Landroid/view/View;

.field private w:Landroid/view/View;

.field private x:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/about/MessengerAboutActivity;)Lcom/facebook/c/s;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/orca/about/MessengerAboutActivity;->p:Lcom/facebook/c/s;

    return-object v0
.end method

.method private j()Landroid/text/SpannableString;
    .locals 6

    .prologue
    const/16 v5, 0x21

    .line 111
    invoke-virtual {p0}, Lcom/facebook/orca/about/MessengerAboutActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 113
    new-instance v1, Lcom/facebook/widget/text/CustomUrlLikeSpan;

    invoke-direct {v1}, Lcom/facebook/widget/text/CustomUrlLikeSpan;-><init>()V

    .line 114
    new-instance v2, Lcom/facebook/orca/about/d;

    invoke-direct {v2, p0}, Lcom/facebook/orca/about/d;-><init>(Lcom/facebook/orca/about/MessengerAboutActivity;)V

    invoke-virtual {v1, v2}, Lcom/facebook/widget/text/CustomUrlLikeSpan;->a(Lcom/facebook/widget/text/f;)V

    .line 122
    new-instance v2, Lcom/facebook/widget/text/CustomUrlLikeSpan;

    invoke-direct {v2}, Lcom/facebook/widget/text/CustomUrlLikeSpan;-><init>()V

    .line 123
    new-instance v3, Lcom/facebook/orca/about/e;

    invoke-direct {v3, p0}, Lcom/facebook/orca/about/e;-><init>(Lcom/facebook/orca/about/MessengerAboutActivity;)V

    invoke-virtual {v2, v3}, Lcom/facebook/widget/text/CustomUrlLikeSpan;->a(Lcom/facebook/widget/text/f;)V

    .line 131
    new-instance v3, Lcom/facebook/common/w/o;

    invoke-direct {v3, v0}, Lcom/facebook/common/w/o;-><init>(Landroid/content/res/Resources;)V

    .line 132
    sget v4, Lcom/facebook/o;->messenger_about_trademarks:I

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;)Lcom/facebook/common/w/o;

    .line 133
    const-string v0, "[[facebook_link1]]"

    sget v4, Lcom/facebook/o;->messenger_about_terms_of_service_facebook:I

    invoke-virtual {p0, v4}, Lcom/facebook/orca/about/MessengerAboutActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v0, v4, v1, v5}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lcom/facebook/common/w/o;

    .line 138
    const-string v0, "[[facebook_link2]]"

    sget v1, Lcom/facebook/o;->messenger_about_terms_of_service_facebook_inc:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/about/MessengerAboutActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1, v2, v5}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lcom/facebook/common/w/o;

    .line 143
    invoke-virtual {v3}, Lcom/facebook/common/w/o;->b()Landroid/text/SpannableString;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected b(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 51
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 53
    invoke-virtual {p0}, Lcom/facebook/orca/about/MessengerAboutActivity;->i()Lcom/facebook/inject/t;

    move-result-object v1

    .line 54
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    iput-object v0, p0, Lcom/facebook/orca/about/MessengerAboutActivity;->p:Lcom/facebook/c/s;

    .line 56
    sget v0, Lcom/facebook/k;->about:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/about/MessengerAboutActivity;->setContentView(I)V

    .line 58
    invoke-static {p0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 59
    sget v0, Lcom/facebook/i;->titlebar:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/about/MessengerAboutActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/titlebar/a;

    iput-object v0, p0, Lcom/facebook/orca/about/MessengerAboutActivity;->q:Lcom/facebook/widget/titlebar/a;

    .line 61
    sget v0, Lcom/facebook/i;->orca_about_app_name:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/about/MessengerAboutActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/about/MessengerAboutActivity;->r:Landroid/widget/TextView;

    .line 62
    sget v0, Lcom/facebook/i;->orca_about_version:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/about/MessengerAboutActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/about/MessengerAboutActivity;->s:Landroid/widget/TextView;

    .line 63
    sget v0, Lcom/facebook/i;->orca_about_copyright:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/about/MessengerAboutActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/about/MessengerAboutActivity;->t:Landroid/widget/TextView;

    .line 64
    sget v0, Lcom/facebook/i;->orca_about_trademarks:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/about/MessengerAboutActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/about/MessengerAboutActivity;->u:Landroid/widget/TextView;

    .line 65
    sget v0, Lcom/facebook/i;->orca_about_licenses:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/about/MessengerAboutActivity;->b(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/about/MessengerAboutActivity;->v:Landroid/view/View;

    .line 66
    sget v0, Lcom/facebook/i;->orca_about_privacy_and_terms:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/about/MessengerAboutActivity;->b(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/about/MessengerAboutActivity;->w:Landroid/view/View;

    .line 67
    sget v0, Lcom/facebook/i;->orca_about_terms_of_service:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/about/MessengerAboutActivity;->b(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/about/MessengerAboutActivity;->x:Landroid/view/View;

    .line 69
    iget-object v0, p0, Lcom/facebook/orca/about/MessengerAboutActivity;->u:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 70
    iget-object v0, p0, Lcom/facebook/orca/about/MessengerAboutActivity;->u:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setSaveEnabled(Z)V

    .line 72
    const-class v0, Lcom/facebook/config/b/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/b/a;

    .line 73
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v0}, Lcom/facebook/config/b/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v0}, Lcom/facebook/config/b/a;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 75
    iget-object v1, p0, Lcom/facebook/orca/about/MessengerAboutActivity;->s:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 77
    iget-object v0, p0, Lcom/facebook/orca/about/MessengerAboutActivity;->u:Landroid/widget/TextView;

    invoke-direct {p0}, Lcom/facebook/orca/about/MessengerAboutActivity;->j()Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    iget-object v0, p0, Lcom/facebook/orca/about/MessengerAboutActivity;->v:Landroid/view/View;

    new-instance v1, Lcom/facebook/orca/about/a;

    invoke-direct {v1, p0}, Lcom/facebook/orca/about/a;-><init>(Lcom/facebook/orca/about/MessengerAboutActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 89
    iget-object v0, p0, Lcom/facebook/orca/about/MessengerAboutActivity;->w:Landroid/view/View;

    new-instance v1, Lcom/facebook/orca/about/b;

    invoke-direct {v1, p0}, Lcom/facebook/orca/about/b;-><init>(Lcom/facebook/orca/about/MessengerAboutActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    iget-object v0, p0, Lcom/facebook/orca/about/MessengerAboutActivity;->x:Landroid/view/View;

    new-instance v1, Lcom/facebook/orca/about/c;

    invoke-direct {v1, p0}, Lcom/facebook/orca/about/c;-><init>(Lcom/facebook/orca/about/MessengerAboutActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 105
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 46
    sget-object v0, Lcom/facebook/analytics/f/a;->ORCA_PREFERENCE_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method
