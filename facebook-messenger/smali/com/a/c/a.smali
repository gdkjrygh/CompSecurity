.class public final Lcom/a/c/a;
.super Ljava/lang/Object;
.source "ViewHelper.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/view/View;)F
    .locals 1

    .prologue
    .line 152
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/a/c/a/a;->a(Landroid/view/View;)Lcom/a/c/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/c/a/a;->getTranslationY()F

    move-result v0

    :goto_0
    return v0

    :cond_0
    invoke-static {p0}, Lcom/a/c/b;->a(Landroid/view/View;)F

    move-result v0

    goto :goto_0
.end method

.method public static a(Landroid/view/View;F)V
    .locals 1

    .prologue
    .line 24
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-eqz v0, :cond_0

    .line 25
    invoke-static {p0}, Lcom/a/c/a/a;->a(Landroid/view/View;)Lcom/a/c/a/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/a/c/a/a;->setAlpha(F)V

    .line 29
    :goto_0
    return-void

    .line 27
    :cond_0
    invoke-static {p0, p1}, Lcom/a/c/b;->a(Landroid/view/View;F)V

    goto :goto_0
.end method

.method public static b(Landroid/view/View;F)V
    .locals 1

    .prologue
    .line 36
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-eqz v0, :cond_0

    .line 37
    invoke-static {p0}, Lcom/a/c/a/a;->a(Landroid/view/View;)Lcom/a/c/a/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/a/c/a/a;->setPivotX(F)V

    .line 41
    :goto_0
    return-void

    .line 39
    :cond_0
    invoke-static {p0, p1}, Lcom/a/c/b;->b(Landroid/view/View;F)V

    goto :goto_0
.end method

.method public static c(Landroid/view/View;F)V
    .locals 1

    .prologue
    .line 48
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-eqz v0, :cond_0

    .line 49
    invoke-static {p0}, Lcom/a/c/a/a;->a(Landroid/view/View;)Lcom/a/c/a/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/a/c/a/a;->setPivotY(F)V

    .line 53
    :goto_0
    return-void

    .line 51
    :cond_0
    invoke-static {p0, p1}, Lcom/a/c/b;->c(Landroid/view/View;F)V

    goto :goto_0
.end method

.method public static d(Landroid/view/View;F)V
    .locals 1

    .prologue
    .line 60
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-eqz v0, :cond_0

    .line 61
    invoke-static {p0}, Lcom/a/c/a/a;->a(Landroid/view/View;)Lcom/a/c/a/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/a/c/a/a;->setRotation(F)V

    .line 65
    :goto_0
    return-void

    .line 63
    :cond_0
    invoke-static {p0, p1}, Lcom/a/c/b;->d(Landroid/view/View;F)V

    goto :goto_0
.end method

.method public static e(Landroid/view/View;F)V
    .locals 1

    .prologue
    .line 96
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-eqz v0, :cond_0

    .line 97
    invoke-static {p0}, Lcom/a/c/a/a;->a(Landroid/view/View;)Lcom/a/c/a/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/a/c/a/a;->setScaleX(F)V

    .line 101
    :goto_0
    return-void

    .line 99
    :cond_0
    invoke-static {p0, p1}, Lcom/a/c/b;->e(Landroid/view/View;F)V

    goto :goto_0
.end method

.method public static f(Landroid/view/View;F)V
    .locals 1

    .prologue
    .line 108
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-eqz v0, :cond_0

    .line 109
    invoke-static {p0}, Lcom/a/c/a/a;->a(Landroid/view/View;)Lcom/a/c/a/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/a/c/a/a;->setScaleY(F)V

    .line 113
    :goto_0
    return-void

    .line 111
    :cond_0
    invoke-static {p0, p1}, Lcom/a/c/b;->f(Landroid/view/View;F)V

    goto :goto_0
.end method

.method public static g(Landroid/view/View;F)V
    .locals 1

    .prologue
    .line 144
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-eqz v0, :cond_0

    .line 145
    invoke-static {p0}, Lcom/a/c/a/a;->a(Landroid/view/View;)Lcom/a/c/a/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/a/c/a/a;->setTranslationX(F)V

    .line 149
    :goto_0
    return-void

    .line 147
    :cond_0
    invoke-static {p0, p1}, Lcom/a/c/b;->g(Landroid/view/View;F)V

    goto :goto_0
.end method

.method public static h(Landroid/view/View;F)V
    .locals 1

    .prologue
    .line 156
    sget-boolean v0, Lcom/a/c/a/a;->a:Z

    if-eqz v0, :cond_0

    .line 157
    invoke-static {p0}, Lcom/a/c/a/a;->a(Landroid/view/View;)Lcom/a/c/a/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/a/c/a/a;->setTranslationY(F)V

    .line 161
    :goto_0
    return-void

    .line 159
    :cond_0
    invoke-static {p0, p1}, Lcom/a/c/b;->h(Landroid/view/View;F)V

    goto :goto_0
.end method
