.class public Lcom/facebook/widget/text/BetterEditTextView;
.super Landroid/widget/EditText;
.source "BetterEditTextView.java"


# instance fields
.field private a:Lcom/facebook/widget/text/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1, p2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/text/BetterEditTextView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/text/BetterEditTextView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .prologue
    .line 40
    sget-object v0, Lcom/facebook/q;->BetterEditTextView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 41
    sget v1, Lcom/facebook/q;->BetterEditTextView_fontFamily:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    .line 42
    invoke-static {v1}, Lcom/facebook/widget/text/d;->fromIndex(I)Lcom/facebook/widget/text/d;

    move-result-object v1

    invoke-virtual {p0}, Lcom/facebook/widget/text/BetterEditTextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v2

    invoke-static {p0, v1, v2}, Lcom/facebook/widget/text/c;->a(Landroid/widget/TextView;Lcom/facebook/widget/text/d;Landroid/graphics/Typeface;)V

    .line 46
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 47
    return-void
.end method


# virtual methods
.method protected onScrollChanged(IIII)V
    .locals 1

    .prologue
    .line 55
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/EditText;->onScrollChanged(IIII)V

    .line 56
    iget-object v0, p0, Lcom/facebook/widget/text/BetterEditTextView;->a:Lcom/facebook/widget/text/a;

    if-eqz v0, :cond_0

    .line 57
    iget-object v0, p0, Lcom/facebook/widget/text/BetterEditTextView;->a:Lcom/facebook/widget/text/a;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/facebook/widget/text/a;->a(IIII)V

    .line 59
    :cond_0
    return-void
.end method

.method public setOnScrollListener(Lcom/facebook/widget/text/a;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/facebook/widget/text/BetterEditTextView;->a:Lcom/facebook/widget/text/a;

    .line 51
    return-void
.end method
