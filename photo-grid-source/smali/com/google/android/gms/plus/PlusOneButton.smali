.class public final Lcom/google/android/gms/plus/PlusOneButton;
.super Landroid/widget/FrameLayout;


# instance fields
.field private a:Landroid/view/View;

.field private b:I

.field private c:I

.field private d:Ljava/lang/String;

.field private e:I

.field private f:Lcom/google/android/gms/plus/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .prologue
    const/4 v3, 0x2

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 0
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 1000
    const-string v0, "http://schemas.android.com/apk/lib/com.google.android.gms.plus"

    const-string v4, "size"

    const-string v5, "PlusOneButton"

    invoke-static {v0, v4, p1, p2, v5}, Lcom/google/android/gms/common/internal/f;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "SMALL"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v0, v1

    .line 0
    :goto_0
    iput v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->b:I

    .line 2000
    const-string v0, "http://schemas.android.com/apk/lib/com.google.android.gms.plus"

    const-string v4, "annotation"

    const-string v5, "PlusOneButton"

    invoke-static {v0, v4, p1, p2, v5}, Lcom/google/android/gms/common/internal/f;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "INLINE"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 0
    :goto_1
    iput v3, p0, Lcom/google/android/gms/plus/PlusOneButton;->c:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->e:I

    invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButton;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 3000
    iget-object v1, p0, Lcom/google/android/gms/plus/PlusOneButton;->a:Landroid/view/View;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/plus/PlusOneButton;->a:Landroid/view/View;

    invoke-virtual {p0, v1}, Lcom/google/android/gms/plus/PlusOneButton;->removeView(Landroid/view/View;)V

    :cond_0
    iget v1, p0, Lcom/google/android/gms/plus/PlusOneButton;->b:I

    iget v2, p0, Lcom/google/android/gms/plus/PlusOneButton;->c:I

    iget-object v3, p0, Lcom/google/android/gms/plus/PlusOneButton;->d:Ljava/lang/String;

    iget v4, p0, Lcom/google/android/gms/plus/PlusOneButton;->e:I

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/android/gms/plus/internal/e;->a(Landroid/content/Context;IILjava/lang/String;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->a:Landroid/view/View;

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->f:Lcom/google/android/gms/plus/b;

    .line 4000
    iput-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->f:Lcom/google/android/gms/plus/b;

    iget-object v1, p0, Lcom/google/android/gms/plus/PlusOneButton;->a:Landroid/view/View;

    new-instance v2, Lcom/google/android/gms/plus/a;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/plus/a;-><init>(Lcom/google/android/gms/plus/PlusOneButton;Lcom/google/android/gms/plus/b;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3000
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->a:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/PlusOneButton;->addView(Landroid/view/View;)V

    .line 0
    invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButton;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_1
    return-void

    .line 1000
    :cond_2
    const-string v4, "MEDIUM"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    move v0, v2

    goto :goto_0

    :cond_3
    const-string v4, "TALL"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v3

    goto :goto_0

    :cond_4
    const/4 v0, 0x3

    goto :goto_0

    .line 2000
    :cond_5
    const-string v3, "NONE"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    move v3, v1

    goto :goto_1

    :cond_6
    move v3, v2

    goto :goto_1
.end method

.method static synthetic a(Lcom/google/android/gms/plus/PlusOneButton;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->a:Landroid/view/View;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/plus/PlusOneButton;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->e:I

    return v0
.end method


# virtual methods
.method protected final onLayout(ZIIII)V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->a:Landroid/view/View;

    sub-int v1, p4, p2

    sub-int v2, p5, p3

    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method protected final onMeasure(II)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButton;->a:Landroid/view/View;

    invoke-virtual {p0, v0, p1, p2}, Lcom/google/android/gms/plus/PlusOneButton;->measureChild(Landroid/view/View;II)V

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/plus/PlusOneButton;->setMeasuredDimension(II)V

    return-void
.end method
