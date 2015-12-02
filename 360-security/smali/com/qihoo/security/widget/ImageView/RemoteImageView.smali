.class public Lcom/qihoo/security/widget/ImageView/RemoteImageView;
.super Lcom/qihoo/security/widget/RatioImageView;
.source "360Security"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 27
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 31
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo/security/widget/RatioImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    invoke-virtual {p0}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 39
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 85
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->c:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/appbox/c/a/b$b;

    .line 86
    :goto_0
    if-eqz v0, :cond_0

    .line 87
    invoke-interface {v0}, Lcom/qihoo/security/appbox/c/a/b$b;->a()V

    .line 90
    :cond_0
    invoke-static {}, Lcom/qihoo/security/appbox/c/a/b;->a()Lcom/qihoo/security/appbox/c/a/b;

    move-result-object v0

    invoke-virtual {v0, p1, p0, p2}, Lcom/qihoo/security/appbox/c/a/b;->a(Ljava/lang/String;Landroid/widget/ImageView;I)Lcom/qihoo/security/appbox/c/a/b$b;

    move-result-object v0

    .line 91
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->c:Ljava/lang/ref/WeakReference;

    .line 92
    return-void

    .line 85
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Package://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->a(Ljava/lang/String;I)V

    .line 60
    return-void
.end method

.method public c(Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "ApkPath://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->a(Ljava/lang/String;I)V

    .line 73
    return-void
.end method

.method public setImageResourceInListView(I)V
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->c:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/widget/ImageView/RemoteImageView;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/appbox/c/a/b$b;

    .line 43
    :goto_0
    if-eqz v0, :cond_0

    .line 44
    invoke-interface {v0}, Lcom/qihoo/security/appbox/c/a/b$b;->a()V

    .line 46
    :cond_0
    invoke-super {p0, p1}, Lcom/qihoo/security/widget/RatioImageView;->setImageResource(I)V

    .line 47
    return-void

    .line 42
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
