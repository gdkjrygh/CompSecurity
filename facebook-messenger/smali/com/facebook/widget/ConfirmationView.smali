.class public Lcom/facebook/widget/ConfirmationView;
.super Lcom/facebook/widget/f;
.source "ConfirmationView.java"


# instance fields
.field private final a:Landroid/widget/TextView;

.field private final b:Landroid/widget/TextView;

.field private final c:Landroid/widget/TextView;

.field private d:Lcom/facebook/widget/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 33
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/widget/ConfirmationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/widget/ConfirmationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 38
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 41
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 43
    sget v0, Lcom/facebook/k;->confirmation_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/ConfirmationView;->setContentView(I)V

    .line 44
    sget v0, Lcom/facebook/i;->confirmation_message_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/ConfirmationView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/widget/ConfirmationView;->a:Landroid/widget/TextView;

    .line 45
    sget v0, Lcom/facebook/i;->confirmation_negative_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/ConfirmationView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/widget/ConfirmationView;->b:Landroid/widget/TextView;

    .line 46
    sget v0, Lcom/facebook/i;->confirmation_positive_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/ConfirmationView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/widget/ConfirmationView;->c:Landroid/widget/TextView;

    .line 48
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v1, Lcom/facebook/q;->ConfirmationView:[I

    invoke-virtual {v0, p2, v1, v2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 51
    :try_start_0
    sget v0, Lcom/facebook/q;->ConfirmationView_message:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/ConfirmationView;->setMessage(Ljava/lang/String;)V

    .line 52
    sget v0, Lcom/facebook/q;->ConfirmationView_negativeButtonTitle:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/ConfirmationView;->setNegativeButtonTitle(Ljava/lang/String;)V

    .line 54
    sget v0, Lcom/facebook/q;->ConfirmationView_positiveButtonTitle:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/ConfirmationView;->setPositiveButtonTitle(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 60
    iget-object v0, p0, Lcom/facebook/widget/ConfirmationView;->b:Landroid/widget/TextView;

    new-instance v1, Lcom/facebook/widget/a;

    invoke-direct {v1, p0}, Lcom/facebook/widget/a;-><init>(Lcom/facebook/widget/ConfirmationView;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    iget-object v0, p0, Lcom/facebook/widget/ConfirmationView;->c:Landroid/widget/TextView;

    new-instance v1, Lcom/facebook/widget/b;

    invoke-direct {v1, p0}, Lcom/facebook/widget/b;-><init>(Lcom/facebook/widget/ConfirmationView;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 77
    return-void

    .line 57
    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    throw v0
.end method

.method static synthetic a(Lcom/facebook/widget/ConfirmationView;)Lcom/facebook/widget/c;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/widget/ConfirmationView;->d:Lcom/facebook/widget/c;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/widget/ConfirmationView;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/facebook/widget/ConfirmationView;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 101
    :goto_0
    return-void

    .line 99
    :cond_0
    iget-object v0, p0, Lcom/facebook/widget/ConfirmationView;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method

.method public b()V
    .locals 2

    .prologue
    .line 108
    iget-object v0, p0, Lcom/facebook/widget/ConfirmationView;->a:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 109
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 112
    iget-object v0, p0, Lcom/facebook/widget/ConfirmationView;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 113
    return-void
.end method

.method public setBlurb(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/widget/ConfirmationView;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    return-void
.end method

.method public setListener(Lcom/facebook/widget/c;)V
    .locals 0

    .prologue
    .line 80
    iput-object p1, p0, Lcom/facebook/widget/ConfirmationView;->d:Lcom/facebook/widget/c;

    .line 81
    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/facebook/widget/ConfirmationView;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    return-void
.end method

.method public setNegativeButtonTitle(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/facebook/widget/ConfirmationView;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    return-void
.end method

.method public setPositiveButtonTitle(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/widget/ConfirmationView;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    return-void
.end method
