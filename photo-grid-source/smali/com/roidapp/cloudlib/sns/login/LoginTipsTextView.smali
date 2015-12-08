.class public Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;
.super Landroid/widget/TextView;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 26
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;->a()V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0, p1, p2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;->a()V

    .line 33
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 38
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;->a()V

    .line 39
    return-void
.end method

.method private a()V
    .locals 5

    .prologue
    const/16 v4, 0x21

    const/4 v3, 0x0

    .line 43
    const/16 v0, 0x11

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;->setGravity(I)V

    .line 46
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->bu:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 47
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    new-instance v0, Landroid/text/SpannableStringBuilder;

    const-string v1, " EULA"

    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 50
    new-instance v1, Lcom/roidapp/cloudlib/sns/login/k;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/login/k;-><init>(Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;)V

    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    invoke-virtual {v0, v1, v3, v2, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 65
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;->append(Ljava/lang/CharSequence;)V

    .line 67
    const-string v0, " and "

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;->append(Ljava/lang/CharSequence;)V

    .line 69
    new-instance v0, Landroid/text/SpannableStringBuilder;

    const-string v1, "Privacy Policy."

    invoke-direct {v0, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 70
    new-instance v1, Lcom/roidapp/cloudlib/sns/login/l;

    invoke-direct {v1, p0}, Lcom/roidapp/cloudlib/sns/login/l;-><init>(Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;)V

    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v1, v3, v2, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 85
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;->append(Ljava/lang/CharSequence;)V

    .line 86
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 87
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x106000d

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;->setHighlightColor(I)V

    .line 89
    new-instance v0, Lcom/roidapp/cloudlib/sns/login/m;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/login/m;-><init>(Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 96
    return-void
.end method
