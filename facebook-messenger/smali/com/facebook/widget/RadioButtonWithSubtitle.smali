.class public Lcom/facebook/widget/RadioButtonWithSubtitle;
.super Lcom/facebook/widget/e;
.source "RadioButtonWithSubtitle.java"

# interfaces
.implements Landroid/widget/Checkable;


# instance fields
.field private final a:Landroid/widget/RadioButton;

.field private final b:Landroid/widget/TextView;

.field private final c:Landroid/widget/TextView;

.field private final d:Landroid/view/ViewGroup;

.field private e:Lcom/facebook/widget/o;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 33
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/widget/RadioButtonWithSubtitle;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .prologue
    .line 37
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 39
    sget v0, Lcom/facebook/k;->radio_button_with_subtitle:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/RadioButtonWithSubtitle;->setContentView(I)V

    .line 41
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/RadioButtonWithSubtitle;->setOrientation(I)V

    .line 43
    sget v0, Lcom/facebook/i;->radio_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/RadioButtonWithSubtitle;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lcom/facebook/widget/RadioButtonWithSubtitle;->a:Landroid/widget/RadioButton;

    .line 44
    sget v0, Lcom/facebook/i;->radio_button_text_wrapper:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/RadioButtonWithSubtitle;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/facebook/widget/RadioButtonWithSubtitle;->d:Landroid/view/ViewGroup;

    .line 45
    sget v0, Lcom/facebook/i;->radio_button_title:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/RadioButtonWithSubtitle;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/widget/RadioButtonWithSubtitle;->b:Landroid/widget/TextView;

    .line 46
    sget v0, Lcom/facebook/i;->radio_button_subtitle:I

    invoke-virtual {p0, v0}, Lcom/facebook/widget/RadioButtonWithSubtitle;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/widget/RadioButtonWithSubtitle;->c:Landroid/widget/TextView;

    .line 48
    sget-object v0, Lcom/facebook/q;->RadioButtonWithSubtitle:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 52
    sget v1, Lcom/facebook/q;->RadioButtonWithSubtitle_android_text:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 53
    sget v2, Lcom/facebook/q;->RadioButtonWithSubtitle_subtitle:I

    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 55
    iget-object v2, p0, Lcom/facebook/widget/RadioButtonWithSubtitle;->b:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    iget-object v1, p0, Lcom/facebook/widget/RadioButtonWithSubtitle;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    iget-object v0, p0, Lcom/facebook/widget/RadioButtonWithSubtitle;->d:Landroid/view/ViewGroup;

    new-instance v1, Lcom/facebook/widget/m;

    invoke-direct {v1, p0}, Lcom/facebook/widget/m;-><init>(Lcom/facebook/widget/RadioButtonWithSubtitle;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    iget-object v0, p0, Lcom/facebook/widget/RadioButtonWithSubtitle;->a:Landroid/widget/RadioButton;

    new-instance v1, Lcom/facebook/widget/n;

    invoke-direct {v1, p0}, Lcom/facebook/widget/n;-><init>(Lcom/facebook/widget/RadioButtonWithSubtitle;)V

    invoke-virtual {v0, v1}, Landroid/widget/RadioButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 73
    return-void
.end method

.method static synthetic a(Lcom/facebook/widget/RadioButtonWithSubtitle;)Landroid/widget/RadioButton;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/facebook/widget/RadioButtonWithSubtitle;->a:Landroid/widget/RadioButton;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/widget/RadioButtonWithSubtitle;)Lcom/facebook/widget/o;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/facebook/widget/RadioButtonWithSubtitle;->e:Lcom/facebook/widget/o;

    return-object v0
.end method


# virtual methods
.method public isChecked()Z
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/facebook/widget/RadioButtonWithSubtitle;->a:Landroid/widget/RadioButton;

    invoke-virtual {v0}, Landroid/widget/RadioButton;->isChecked()Z

    move-result v0

    return v0
.end method

.method public setChecked(Z)V
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/widget/RadioButtonWithSubtitle;->a:Landroid/widget/RadioButton;

    invoke-virtual {v0, p1}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 92
    return-void
.end method

.method public setOnCheckedChangeListener(Lcom/facebook/widget/o;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lcom/facebook/widget/RadioButtonWithSubtitle;->e:Lcom/facebook/widget/o;

    .line 77
    return-void
.end method

.method public toggle()V
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/facebook/widget/RadioButtonWithSubtitle;->a:Landroid/widget/RadioButton;

    invoke-virtual {v0}, Landroid/widget/RadioButton;->toggle()V

    .line 82
    return-void
.end method
