.class public final Lcom/google/android/gms/plus/PlusOneButtonWithPopup;
.super Landroid/view/ViewGroup;


# instance fields
.field private hN:Ljava/lang/String;

.field private it:Ljava/lang/String;

.field private mSize:I

.field private re:Landroid/view/View;

.field private rf:I

.field private rk:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-static {p1, p2}, Lcom/google/android/gms/plus/PlusOneButton;->getSize(Landroid/content/Context;Landroid/util/AttributeSet;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->mSize:I

    invoke-static {p1, p2}, Lcom/google/android/gms/plus/PlusOneButton;->getAnnotation(Landroid/content/Context;Landroid/util/AttributeSet;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->rf:I

    new-instance v0, Lcom/google/android/gms/plus/PlusOneDummyView;

    iget v1, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->mSize:I

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/plus/PlusOneDummyView;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->re:Landroid/view/View;

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->re:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private c(II)I
    .locals 2

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    :goto_0
    return p1

    :sswitch_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    sub-int/2addr v1, p2

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_0
        0x40000000 -> :sswitch_0
    .end sparse-switch
.end method

.method private cS()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->re:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->re:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->removeView(Landroid/view/View;)V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->mSize:I

    iget v2, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->rf:I

    iget-object v3, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->hN:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->it:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/fm;->a(Landroid/content/Context;IILjava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->re:Landroid/view/View;

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->rk:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->rk:Landroid/view/View$OnClickListener;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->re:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private cT()Lcom/google/android/gms/internal/fj;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->re:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;

    invoke-static {v0}, Lcom/google/android/gms/internal/fj$a;->ap(Landroid/os/IBinder;)Lcom/google/android/gms/internal/fj;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "PlusOneButtonWithPopup"

    const/4 v1, 0x5

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "PlusOneButtonWithPopup"

    const-string v1, "Failed to get PlusOneDelegate"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public cancelClick()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->re:Landroid/view/View;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->cT()Lcom/google/android/gms/internal/fj;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/fj;->cancelClick()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public getResolution()Landroid/app/PendingIntent;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->re:Landroid/view/View;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->cT()Lcom/google/android/gms/internal/fj;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/fj;->getResolution()Landroid/app/PendingIntent;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public initialize(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "accountName"    # Ljava/lang/String;

    .prologue
    const-string v0, "Url must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/dm;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->hN:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->it:Ljava/lang/String;

    invoke-direct {p0}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->cS()V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 6
    .param p1, "changed"    # Z
    .param p2, "left"    # I
    .param p3, "top"    # I
    .param p4, "right"    # I
    .param p5, "bottom"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->re:Landroid/view/View;

    invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->getPaddingTop()I

    move-result v2

    sub-int v3, p4, p2

    invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->getPaddingRight()I

    move-result v4

    sub-int/2addr v3, v4

    sub-int v4, p5, p3

    invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->getPaddingBottom()I

    move-result v5

    sub-int/2addr v4, v5

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 5
    .param p1, "widthMeasureSpec"    # I
    .param p2, "heightMeasureSpec"    # I

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->getPaddingBottom()I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->re:Landroid/view/View;

    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->c(II)I

    move-result v3

    invoke-direct {p0, p2, v1}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->c(II)I

    move-result v4

    invoke-virtual {v2, v3, v4}, Landroid/view/View;->measure(II)V

    iget-object v2, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->re:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    add-int/2addr v0, v2

    iget-object v2, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->re:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->setMeasuredDimension(II)V

    return-void
.end method

.method public reinitialize()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->re:Landroid/view/View;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->cT()Lcom/google/android/gms/internal/fj;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/fj;->reinitialize()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public setAnnotation(I)V
    .locals 0
    .param p1, "annotation"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->rf:I

    invoke-direct {p0}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->cS()V

    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1
    .param p1, "onClickListener"    # Landroid/view/View$OnClickListener;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->rk:Landroid/view/View$OnClickListener;

    iget-object v0, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->re:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setSize(I)V
    .locals 0
    .param p1, "size"    # I

    .prologue
    iput p1, p0, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->mSize:I

    invoke-direct {p0}, Lcom/google/android/gms/plus/PlusOneButtonWithPopup;->cS()V

    return-void
.end method
