.class Lcom/qihoo/security/opti/trashclear/filemanager/c$b;
.super Lcom/qihoo/security/opti/trashclear/filemanager/c$e;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/filemanager/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field a:Ljava/lang/ref/SoftReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/SoftReference",
            "<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 90
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/filemanager/c$e;-><init>(Lcom/qihoo/security/opti/trashclear/filemanager/c$1;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/opti/trashclear/filemanager/c$1;)V
    .locals 0

    .prologue
    .line 90
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/c$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 110
    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c$b;->a:Ljava/lang/ref/SoftReference;

    .line 111
    return-void

    .line 110
    :cond_0
    new-instance v0, Ljava/lang/ref/SoftReference;

    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-direct {v0, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 105
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c$b;->a:Ljava/lang/ref/SoftReference;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Landroid/widget/ImageView;)Z
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c$b;->a:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 96
    const/4 v0, 0x0

    .line 100
    :goto_0
    return v0

    .line 99
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c$b;->a:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 100
    const/4 v0, 0x1

    goto :goto_0
.end method
