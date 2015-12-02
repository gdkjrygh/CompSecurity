.class public Lcom/qihoo/security/leak/f;
.super Landroid/widget/FrameLayout;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/leak/f$a;
    }
.end annotation


# instance fields
.field private a:Landroid/view/WindowManager;

.field private b:Landroid/view/WindowManager$LayoutParams;

.field private c:Lcom/qihoo/security/leak/f$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/qihoo/security/leak/f$a;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v1, -0x2

    .line 27
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/leak/f;->c:Lcom/qihoo/security/leak/f$a;

    .line 28
    iput-object p2, p0, Lcom/qihoo/security/leak/f;->c:Lcom/qihoo/security/leak/f$a;

    .line 29
    invoke-virtual {p0}, Lcom/qihoo/security/leak/f;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v2, "window"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iput-object v0, p0, Lcom/qihoo/security/leak/f;->a:Landroid/view/WindowManager;

    .line 36
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    const/16 v3, 0x7d2

    const/16 v4, 0x220

    const/4 v5, -0x3

    move v2, v1

    invoke-direct/range {v0 .. v5}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    iput-object v0, p0, Lcom/qihoo/security/leak/f;->b:Landroid/view/WindowManager$LayoutParams;

    .line 40
    iget-object v0, p0, Lcom/qihoo/security/leak/f;->b:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x33

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 41
    invoke-virtual {p0, v6}, Lcom/qihoo/security/leak/f;->setFocusableInTouchMode(Z)V

    .line 42
    invoke-virtual {p0, v6}, Lcom/qihoo/security/leak/f;->setFocusable(Z)V

    .line 43
    invoke-virtual {p0}, Lcom/qihoo/security/leak/f;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03006e

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 45
    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    .line 62
    iget-object v0, p0, Lcom/qihoo/security/leak/f;->a:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/qihoo/security/leak/f;->b:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, p0, v1}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 63
    return-void
.end method

.method private d()V
    .locals 2

    .prologue
    .line 66
    invoke-virtual {p0}, Lcom/qihoo/security/leak/f;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 67
    iget-object v0, p0, Lcom/qihoo/security/leak/f;->b:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x190

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 68
    iget-object v0, p0, Lcom/qihoo/security/leak/f;->b:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x1f4

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 73
    :goto_0
    return-void

    .line 70
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/leak/f;->b:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x4b0

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 71
    iget-object v0, p0, Lcom/qihoo/security/leak/f;->b:Landroid/view/WindowManager$LayoutParams;

    const/16 v1, 0x1e0

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 49
    invoke-virtual {p0}, Lcom/qihoo/security/leak/f;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    invoke-direct {p0}, Lcom/qihoo/security/leak/f;->d()V

    .line 51
    invoke-direct {p0}, Lcom/qihoo/security/leak/f;->c()V

    .line 53
    :cond_0
    return-void
.end method

.method public a()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 77
    invoke-virtual {p0}, Lcom/qihoo/security/leak/f;->isShown()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 86
    :goto_0
    return v0

    .line 81
    :cond_0
    :try_start_0
    invoke-direct {p0}, Lcom/qihoo/security/leak/f;->d()V

    .line 82
    iget-object v1, p0, Lcom/qihoo/security/leak/f;->a:Landroid/view/WindowManager;

    iget-object v2, p0, Lcom/qihoo/security/leak/f;->b:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v1, p0, v2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    const/4 v0, 0x1

    goto :goto_0

    .line 84
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 92
    invoke-virtual {p0}, Lcom/qihoo/security/leak/f;->isShown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 102
    :goto_0
    return-void

    .line 97
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/leak/f;->a:Landroid/view/WindowManager;

    invoke-interface {v0, p0}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    .line 98
    iget-object v0, p0, Lcom/qihoo/security/leak/f;->c:Lcom/qihoo/security/leak/f$a;

    invoke-interface {v0}, Lcom/qihoo/security/leak/f$a;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 99
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 106
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 107
    invoke-virtual {p0}, Lcom/qihoo/security/leak/f;->b()V

    .line 109
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 57
    invoke-virtual {p0}, Lcom/qihoo/security/leak/f;->b()V

    .line 58
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method
