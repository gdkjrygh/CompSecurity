.class public Lkik/android/widget/RobotoEditText;
.super Landroid/widget/EditText;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 28
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lkik/android/widget/RobotoEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0, p1, p2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 35
    invoke-direct {p0, p1, p2}, Lkik/android/widget/RobotoEditText;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 41
    invoke-direct {p0, p1, p2}, Lkik/android/widget/RobotoEditText;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 42
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 46
    sget-object v1, Lkik/android/ag$b;->p:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 47
    const/4 v2, -0x1

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    .line 48
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 50
    invoke-virtual {p0}, Lkik/android/widget/RobotoEditText;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v3

    .line 52
    packed-switch v2, :pswitch_data_0

    sget v1, Lkik/android/util/cb$a;->a:I

    :goto_0
    if-nez v3, :cond_0

    :goto_1
    invoke-static {p0, v1, v0}, Lkik/android/util/cb;->a(Landroid/widget/TextView;II)V

    .line 53
    return-void

    .line 52
    :pswitch_0
    sget v1, Lkik/android/util/cb$a;->b:I

    goto :goto_0

    :pswitch_1
    sget v1, Lkik/android/util/cb$a;->c:I

    goto :goto_0

    :pswitch_2
    sget v1, Lkik/android/util/cb$a;->d:I

    goto :goto_0

    :pswitch_3
    sget v1, Lkik/android/util/cb$a;->e:I

    goto :goto_0

    :pswitch_4
    sget v1, Lkik/android/util/cb$a;->f:I

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Landroid/graphics/Typeface;->getStyle()I

    move-result v0

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method


# virtual methods
.method protected onLayout(ZIIII)V
    .locals 3

    .prologue
    .line 58
    invoke-super/range {p0 .. p5}, Landroid/widget/EditText;->onLayout(ZIIII)V

    .line 60
    invoke-virtual {p0}, Lkik/android/widget/RobotoEditText;->getHint()Ljava/lang/CharSequence;

    move-result-object v0

    .line 62
    invoke-static {}, Lkik/android/util/DeviceUtils;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lkik/android/widget/RobotoEditText;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkik/android/widget/RobotoEditText;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_0

    .line 63
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lkik/android/widget/RobotoEditText;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kik/m/d;->a(Ljava/lang/String;Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object v0

    .line 65
    if-eqz v0, :cond_0

    .line 66
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "AUTOMATION_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/widget/RobotoEditText;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 69
    :cond_0
    return-void
.end method
