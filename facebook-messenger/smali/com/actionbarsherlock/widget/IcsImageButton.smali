.class public Lcom/actionbarsherlock/widget/IcsImageButton;
.super Landroid/widget/ImageButton;
.source "IcsImageButton.java"

# interfaces
.implements Lcom/actionbarsherlock/internal/view/a;


# instance fields
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/actionbarsherlock/internal/view/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 21
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/actionbarsherlock/widget/IcsImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 25
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/actionbarsherlock/widget/IcsImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 17
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/actionbarsherlock/widget/IcsImageButton;->a:Ljava/util/Set;

    .line 30
    return-void
.end method


# virtual methods
.method public a(Lcom/actionbarsherlock/internal/view/b;)V
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/actionbarsherlock/widget/IcsImageButton;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 35
    return-void
.end method

.method public b(Lcom/actionbarsherlock/internal/view/b;)V
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/actionbarsherlock/widget/IcsImageButton;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 40
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .prologue
    .line 44
    invoke-super {p0}, Landroid/widget/ImageButton;->onAttachedToWindow()V

    .line 45
    iget-object v0, p0, Lcom/actionbarsherlock/widget/IcsImageButton;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/internal/view/b;

    .line 46
    invoke-interface {v0, p0}, Lcom/actionbarsherlock/internal/view/b;->a(Landroid/view/View;)V

    goto :goto_0

    .line 48
    :cond_0
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    .line 52
    invoke-super {p0}, Landroid/widget/ImageButton;->onDetachedFromWindow()V

    .line 53
    iget-object v0, p0, Lcom/actionbarsherlock/widget/IcsImageButton;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/internal/view/b;

    .line 54
    invoke-interface {v0, p0}, Lcom/actionbarsherlock/internal/view/b;->b(Landroid/view/View;)V

    goto :goto_0

    .line 56
    :cond_0
    return-void
.end method
