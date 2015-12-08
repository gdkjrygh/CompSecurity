.class public final Lcom/roidapp/photogrid/video/cc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/c/s;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/c/s",
        "<",
        "Lcom/roidapp/photogrid/release/ig;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;II)Lcom/bumptech/glide/load/a/c;
    .locals 1

    .prologue
    .line 12
    check-cast p1, Lcom/roidapp/photogrid/release/ig;

    .line 1016
    new-instance v0, Lcom/roidapp/photogrid/video/bl;

    invoke-direct {v0, p1, p2, p3}, Lcom/roidapp/photogrid/video/bl;-><init>(Lcom/roidapp/photogrid/release/ig;II)V

    .line 12
    return-object v0
.end method
