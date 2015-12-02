.class public Lcom/qihoo/security/appbox/ui/view/RemoteIconView;
.super Landroid/widget/ImageView;
.source "360Security"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/qihoo/security/appbox/c/a/b$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 36
    invoke-direct {p0, p1}, Lcom/qihoo/security/appbox/ui/view/RemoteIconView;->a(Landroid/content/Context;)V

    .line 37
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0, p1, p2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 41
    invoke-direct {p0, p1}, Lcom/qihoo/security/appbox/ui/view/RemoteIconView;->a(Landroid/content/Context;)V

    .line 42
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 46
    invoke-direct {p0, p1}, Lcom/qihoo/security/appbox/ui/view/RemoteIconView;->a(Landroid/content/Context;)V

    .line 47
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 54
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/ui/view/RemoteIconView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 57
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Package://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/qihoo/security/appbox/ui/view/RemoteIconView;->b(Ljava/lang/String;I)V

    .line 65
    return-void
.end method

.method public b(Ljava/lang/String;I)V
    .locals 2

    .prologue
    .line 72
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/view/RemoteIconView;->b:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/view/RemoteIconView;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/appbox/c/a/b$b;

    .line 73
    :goto_0
    if-eqz v0, :cond_0

    .line 74
    invoke-interface {v0}, Lcom/qihoo/security/appbox/c/a/b$b;->a()V

    .line 77
    :cond_0
    invoke-static {}, Lcom/qihoo/security/appbox/c/a/b;->a()Lcom/qihoo/security/appbox/c/a/b;

    move-result-object v0

    invoke-virtual {v0, p1, p0, p2}, Lcom/qihoo/security/appbox/c/a/b;->a(Ljava/lang/String;Landroid/widget/ImageView;I)Lcom/qihoo/security/appbox/c/a/b$b;

    move-result-object v0

    .line 78
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/qihoo/security/appbox/ui/view/RemoteIconView;->b:Ljava/lang/ref/WeakReference;

    .line 79
    return-void

    .line 72
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method getUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/qihoo/security/appbox/ui/view/RemoteIconView;->a:Ljava/lang/String;

    return-object v0
.end method
