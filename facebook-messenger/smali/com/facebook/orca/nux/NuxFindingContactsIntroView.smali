.class public Lcom/facebook/orca/nux/NuxFindingContactsIntroView;
.super Lcom/facebook/orca/nux/e;
.source "NuxFindingContactsIntroView.java"


# instance fields
.field private d:Landroid/widget/TextView;

.field private e:Lcom/facebook/widget/HorizontalOrVerticalViewGroup;

.field private f:Landroid/widget/Button;

.field private g:Landroid/widget/Button;

.field private h:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0, p1}, Lcom/facebook/orca/nux/e;-><init>(Landroid/content/Context;)V

    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/nux/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/nux/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 33
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    .prologue
    .line 45
    sget v0, Lcom/facebook/k;->orca_nux_finding_contacts_intro:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->setContentView(I)V

    .line 46
    sget v0, Lcom/facebook/i;->orca_nux_finding_contacts_title:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->d:Landroid/widget/TextView;

    .line 47
    sget v0, Lcom/facebook/i;->orca_nux_finding_contacts_button_group:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;

    iput-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->e:Lcom/facebook/widget/HorizontalOrVerticalViewGroup;

    .line 48
    sget v0, Lcom/facebook/i;->orca_nux_finding_contacts_intro_find_contacts_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->f:Landroid/widget/Button;

    .line 49
    sget v0, Lcom/facebook/i;->orca_nux_finding_contacts_intro_skip_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->g:Landroid/widget/Button;

    .line 50
    sget v0, Lcom/facebook/i;->orca_nux_finding_contacts_intro_body:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->h:Landroid/widget/TextView;

    .line 51
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 95
    invoke-virtual {p0}, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->d()V

    .line 96
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->h:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 97
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .prologue
    .line 55
    invoke-super {p0, p1, p2}, Lcom/facebook/orca/nux/e;->onMeasure(II)V

    .line 58
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->e:Lcom/facebook/widget/HorizontalOrVerticalViewGroup;

    invoke-virtual {v0}, Lcom/facebook/widget/HorizontalOrVerticalViewGroup;->getMode()Lcom/facebook/widget/h;

    move-result-object v0

    sget-object v1, Lcom/facebook/widget/h;->HORIZONTAL:Lcom/facebook/widget/h;

    if-ne v0, v1, :cond_0

    .line 59
    sget v0, Lcom/facebook/p;->OrcaNuxTitle:I

    .line 63
    :goto_0
    iget-object v1, p0, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 64
    return-void

    .line 61
    :cond_0
    sget v0, Lcom/facebook/p;->NuxFindingContactsIntroTitleSmall:I

    goto :goto_0
.end method

.method public setBodyText(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 90
    invoke-virtual {p0}, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->d()V

    .line 91
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->h:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    return-void
.end method

.method public setLearnMoreLinkSpan(Lcom/facebook/widget/text/CustomUrlLikeSpan;)V
    .locals 4

    .prologue
    .line 77
    invoke-virtual {p0}, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 78
    new-instance v1, Lcom/facebook/common/w/o;

    invoke-direct {v1, v0}, Lcom/facebook/common/w/o;-><init>(Landroid/content/res/Resources;)V

    .line 79
    sget v2, Lcom/facebook/o;->orca_nux_finding_contacts_intro_body:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;)Lcom/facebook/common/w/o;

    .line 80
    const-string v2, "[[learn_more_link]]"

    sget v3, Lcom/facebook/o;->orca_nux_finding_contacts_intro_learn_more_link:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x21

    invoke-virtual {v1, v2, v0, p1, v3}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lcom/facebook/common/w/o;

    .line 85
    invoke-virtual {p0}, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->b()V

    .line 86
    invoke-virtual {v1}, Lcom/facebook/common/w/o;->b()Landroid/text/SpannableString;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->setBodyText(Ljava/lang/CharSequence;)V

    .line 87
    return-void
.end method

.method public setOnFindContactsClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 67
    invoke-virtual {p0}, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->d()V

    .line 68
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->f:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    return-void
.end method

.method public setOnSkipClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 72
    invoke-virtual {p0}, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->d()V

    .line 73
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxFindingContactsIntroView;->g:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    return-void
.end method
