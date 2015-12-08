.class final Lcom/mopub/network/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/volley/toolbox/ImageLoader$ImageCache;


# instance fields
.field final synthetic a:Landroid/support/v4/util/LruCache;


# direct methods
.method constructor <init>(Landroid/support/v4/util/LruCache;)V
    .locals 0

    .prologue
    .line 99
    iput-object p1, p0, Lcom/mopub/network/f;->a:Landroid/support/v4/util/LruCache;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/mopub/network/f;->a:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0, p1}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final putBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 107
    iget-object v0, p0, Lcom/mopub/network/f;->a:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    return-void
.end method
