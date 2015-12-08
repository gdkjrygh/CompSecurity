.class final Lcom/roidapp/photogrid/release/t;
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
.field final synthetic a:Lcom/roidapp/photogrid/release/r;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/r;I)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lcom/roidapp/photogrid/release/t;->a:Lcom/roidapp/photogrid/release/r;

    invoke-direct {p0, p2}, Landroid/support/v4/util/LruCache;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected final synthetic sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 105
    check-cast p2, Landroid/graphics/Bitmap;

    .line 1108
    invoke-static {p2}, Lcom/roidapp/photogrid/release/r;->a(Landroid/graphics/Bitmap;)I

    move-result v0

    .line 105
    return v0
.end method
