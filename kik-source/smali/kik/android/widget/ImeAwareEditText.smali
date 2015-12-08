.class public Lkik/android/widget/ImeAwareEditText;
.super Lkik/android/widget/RobotoEditText;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/widget/ImeAwareEditText$a;,
        Lkik/android/widget/ImeAwareEditText$b;
    }
.end annotation


# instance fields
.field private a:Landroid/graphics/Rect;

.field private b:Landroid/util/DisplayMetrics;

.field private c:Lkik/android/widget/ImeAwareEditText$a;

.field private d:Lkik/android/widget/ImeAwareEditText$b;

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 28
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lkik/android/widget/ImeAwareEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0, p1, p2}, Lkik/android/widget/RobotoEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lkik/android/widget/ImeAwareEditText;->a:Landroid/graphics/Rect;

    .line 19
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/ImeAwareEditText;->e:Z

    .line 34
    invoke-virtual {p0}, Lkik/android/widget/ImeAwareEditText;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/ImeAwareEditText;->b:Landroid/util/DisplayMetrics;

    .line 35
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0, p1, p2, p3}, Lkik/android/widget/RobotoEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 15
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lkik/android/widget/ImeAwareEditText;->a:Landroid/graphics/Rect;

    .line 19
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/widget/ImeAwareEditText;->e:Z

    .line 40
    invoke-virtual {p0}, Lkik/android/widget/ImeAwareEditText;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iput-object v0, p0, Lkik/android/widget/ImeAwareEditText;->b:Landroid/util/DisplayMetrics;

    .line 41
    return-void
.end method


# virtual methods
.method public final a(Lkik/android/widget/ImeAwareEditText$a;)V
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lkik/android/widget/ImeAwareEditText;->c:Lkik/android/widget/ImeAwareEditText$a;

    .line 46
    return-void
.end method

.method public final a(Lkik/android/widget/ImeAwareEditText$b;)V
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lkik/android/widget/ImeAwareEditText;->d:Lkik/android/widget/ImeAwareEditText$b;

    .line 73
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 88
    iput-boolean p1, p0, Lkik/android/widget/ImeAwareEditText;->e:Z

    .line 89
    return-void
.end method

.method public dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lkik/android/widget/ImeAwareEditText;->c:Lkik/android/widget/ImeAwareEditText$a;

    if-eqz v0, :cond_0

    .line 95
    iget-object v0, p0, Lkik/android/widget/ImeAwareEditText;->d:Lkik/android/widget/ImeAwareEditText$b;

    invoke-interface {v0, p1}, Lkik/android/widget/ImeAwareEditText$b;->a(Landroid/view/KeyEvent;)Z

    move-result v0

    .line 97
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Lkik/android/widget/RobotoEditText;->dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 3

    .prologue
    .line 103
    invoke-super {p0, p1}, Lkik/android/widget/RobotoEditText;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v0

    .line 104
    iget-boolean v1, p0, Lkik/android/widget/ImeAwareEditText;->e:Z

    if-eqz v1, :cond_0

    if-eqz p1, :cond_0

    .line 105
    iget v1, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    const v2, -0x40000001    # -1.9999999f

    and-int/2addr v1, v2

    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 107
    :cond_0
    return-object v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 51
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-ne v2, v0, :cond_1

    invoke-virtual {p0}, Lkik/android/widget/ImeAwareEditText;->isFocused()Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v0

    .line 53
    :goto_0
    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lkik/android/widget/ImeAwareEditText;->getText()Landroid/text/Editable;

    move-result-object v2

    instance-of v2, v2, Landroid/text/Editable;

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lkik/android/widget/ImeAwareEditText;->onCheckIsTextEditor()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lkik/android/widget/ImeAwareEditText;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_1
    if-eqz v0, :cond_0

    .line 54
    iget-object v0, p0, Lkik/android/widget/ImeAwareEditText;->a:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Lkik/android/widget/ImeAwareEditText;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 56
    iget-object v0, p0, Lkik/android/widget/ImeAwareEditText;->b:Landroid/util/DisplayMetrics;

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iget-object v1, p0, Lkik/android/widget/ImeAwareEditText;->a:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v0, v1

    const/16 v1, 0x32

    if-ge v0, v1, :cond_0

    .line 57
    iget-object v0, p0, Lkik/android/widget/ImeAwareEditText;->c:Lkik/android/widget/ImeAwareEditText$a;

    if-eqz v0, :cond_0

    .line 58
    iget-object v0, p0, Lkik/android/widget/ImeAwareEditText;->c:Lkik/android/widget/ImeAwareEditText$a;

    invoke-interface {v0}, Lkik/android/widget/ImeAwareEditText$a;->l()V

    .line 62
    :cond_0
    invoke-super {p0, p1}, Lkik/android/widget/RobotoEditText;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    :cond_1
    move v2, v1

    .line 51
    goto :goto_0

    :cond_2
    move v0, v1

    .line 53
    goto :goto_1
.end method
