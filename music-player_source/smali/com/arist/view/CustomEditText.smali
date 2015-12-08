.class public Lcom/arist/view/CustomEditText;
.super Landroid/widget/EditText;


# instance fields
.field private a:Landroid/graphics/drawable/Drawable;

.field private b:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method protected finalize()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/arist/view/CustomEditText;->a:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lcom/arist/view/CustomEditText;->b:Landroid/graphics/Rect;

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/arist/view/CustomEditText;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/view/CustomEditText;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iput-object v0, p0, Lcom/arist/view/CustomEditText;->b:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {p0}, Lcom/arist/view/CustomEditText;->getRight()I

    move-result v2

    iget-object v3, p0, Lcom/arist/view/CustomEditText;->b:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v3

    sub-int/2addr v2, v3

    add-int/lit8 v2, v2, -0x28

    if-lt v0, v2, :cond_0

    invoke-virtual {p0}, Lcom/arist/view/CustomEditText;->getRight()I

    move-result v2

    if-gt v0, v2, :cond_0

    invoke-virtual {p0}, Lcom/arist/view/CustomEditText;->getPaddingTop()I

    move-result v0

    if-lt v1, v0, :cond_0

    invoke-virtual {p0}, Lcom/arist/view/CustomEditText;->getHeight()I

    move-result v0

    if-gt v1, v0, :cond_0

    invoke-virtual {p0}, Lcom/arist/view/CustomEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/arist/view/CustomEditText;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/EditText;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    :cond_1
    invoke-virtual {p0}, Lcom/arist/view/CustomEditText;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/arist/activity/MainActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/arist/activity/MainActivity;->b(Z)V

    goto :goto_0
.end method

.method public setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    if-eqz p3, :cond_0

    iput-object p3, p0, Lcom/arist/view/CustomEditText;->a:Landroid/graphics/drawable/Drawable;

    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/EditText;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
