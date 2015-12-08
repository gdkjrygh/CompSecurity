.class final Lcom/mopub/volley/toolbox/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mopub/volley/Response$Listener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/mopub/volley/Response$Listener",
        "<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/mopub/volley/toolbox/ImageLoader;


# direct methods
.method constructor <init>(Lcom/mopub/volley/toolbox/ImageLoader;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 227
    iput-object p1, p0, Lcom/mopub/volley/toolbox/e;->b:Lcom/mopub/volley/toolbox/ImageLoader;

    iput-object p2, p0, Lcom/mopub/volley/toolbox/e;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onResponse(Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 230
    iget-object v0, p0, Lcom/mopub/volley/toolbox/e;->b:Lcom/mopub/volley/toolbox/ImageLoader;

    iget-object v1, p0, Lcom/mopub/volley/toolbox/e;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/mopub/volley/toolbox/ImageLoader;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 231
    return-void
.end method

.method public final bridge synthetic onResponse(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 227
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/mopub/volley/toolbox/e;->onResponse(Landroid/graphics/Bitmap;)V

    return-void
.end method
