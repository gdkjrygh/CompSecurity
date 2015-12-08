.class final Lcom/roidapp/baselib/b/j;
.super Landroid/support/v4/util/LruCache;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v4/util/LruCache",
        "<",
        "Ljava/lang/String;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/b/i;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/b/i;I)V
    .locals 0

    .prologue
    .line 13
    iput-object p1, p0, Lcom/roidapp/baselib/b/j;->a:Lcom/roidapp/baselib/b/i;

    invoke-direct {p0, p2}, Landroid/support/v4/util/LruCache;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected final synthetic sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 13
    check-cast p2, Landroid/graphics/Bitmap;

    .line 1186
    invoke-static {}, Lcom/roidapp/baselib/c/n;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1187
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v0

    .line 1191
    :goto_0
    return v0

    .line 1190
    :cond_0
    invoke-static {}, Lcom/roidapp/baselib/c/n;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1191
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getByteCount()I

    move-result v0

    goto :goto_0

    .line 1194
    :cond_1
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getRowBytes()I

    move-result v0

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    mul-int/2addr v0, v1

    .line 13
    goto :goto_0
.end method
