.class Lcom/qihoo/security/opti/trashclear/filemanager/c$a;
.super Lcom/qihoo/security/opti/trashclear/filemanager/c$e;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/filemanager/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field a:Ljava/lang/ref/SoftReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/SoftReference",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 67
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/filemanager/c$e;-><init>(Lcom/qihoo/security/opti/trashclear/filemanager/c$1;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/opti/trashclear/filemanager/c$1;)V
    .locals 0

    .prologue
    .line 67
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/filemanager/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 86
    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c$a;->a:Ljava/lang/ref/SoftReference;

    .line 87
    return-void

    .line 86
    :cond_0
    new-instance v0, Ljava/lang/ref/SoftReference;

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-direct {v0, p1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c$a;->a:Ljava/lang/ref/SoftReference;

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
    .line 72
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c$a;->a:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 73
    const/4 v0, 0x0

    .line 76
    :goto_0
    return v0

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/c$a;->a:Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 76
    const/4 v0, 0x1

    goto :goto_0
.end method
