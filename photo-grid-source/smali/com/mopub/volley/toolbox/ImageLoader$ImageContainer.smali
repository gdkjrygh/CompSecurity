.class public Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/mopub/volley/toolbox/ImageLoader;

.field private b:Landroid/graphics/Bitmap;

.field private final c:Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/mopub/volley/toolbox/ImageLoader;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;)V
    .locals 0

    .prologue
    .line 314
    iput-object p1, p0, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->a:Lcom/mopub/volley/toolbox/ImageLoader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 315
    iput-object p2, p0, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->b:Landroid/graphics/Bitmap;

    .line 316
    iput-object p3, p0, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->e:Ljava/lang/String;

    .line 317
    iput-object p4, p0, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->d:Ljava/lang/String;

    .line 318
    iput-object p5, p0, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->c:Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;

    .line 319
    return-void
.end method

.method static synthetic a(Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .prologue
    .line 292
    iput-object p1, p0, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->b:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic a(Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;)Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;
    .locals 1

    .prologue
    .line 292
    iget-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->c:Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;

    return-object v0
.end method


# virtual methods
.method public cancelRequest()V
    .locals 2

    .prologue
    .line 325
    iget-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->c:Lcom/mopub/volley/toolbox/ImageLoader$ImageListener;

    if-nez v0, :cond_1

    .line 345
    :cond_0
    :goto_0
    return-void

    .line 329
    :cond_1
    iget-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->a:Lcom/mopub/volley/toolbox/ImageLoader;

    invoke-static {v0}, Lcom/mopub/volley/toolbox/ImageLoader;->a(Lcom/mopub/volley/toolbox/ImageLoader;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/volley/toolbox/h;

    .line 330
    if-eqz v0, :cond_2

    .line 331
    invoke-virtual {v0, p0}, Lcom/mopub/volley/toolbox/h;->removeContainerAndCancelIfNecessary(Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;)Z

    move-result v0

    .line 332
    if-eqz v0, :cond_0

    .line 333
    iget-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->a:Lcom/mopub/volley/toolbox/ImageLoader;

    invoke-static {v0}, Lcom/mopub/volley/toolbox/ImageLoader;->a(Lcom/mopub/volley/toolbox/ImageLoader;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 337
    :cond_2
    iget-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->a:Lcom/mopub/volley/toolbox/ImageLoader;

    invoke-static {v0}, Lcom/mopub/volley/toolbox/ImageLoader;->b(Lcom/mopub/volley/toolbox/ImageLoader;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mopub/volley/toolbox/h;

    .line 338
    if-eqz v0, :cond_0

    .line 339
    invoke-virtual {v0, p0}, Lcom/mopub/volley/toolbox/h;->removeContainerAndCancelIfNecessary(Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;)Z

    .line 340
    invoke-static {v0}, Lcom/mopub/volley/toolbox/h;->a(Lcom/mopub/volley/toolbox/h;)Ljava/util/LinkedList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 341
    iget-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->a:Lcom/mopub/volley/toolbox/ImageLoader;

    invoke-static {v0}, Lcom/mopub/volley/toolbox/ImageLoader;->b(Lcom/mopub/volley/toolbox/ImageLoader;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 351
    iget-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->b:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getRequestUrl()Ljava/lang/String;
    .locals 1

    .prologue
    .line 358
    iget-object v0, p0, Lcom/mopub/volley/toolbox/ImageLoader$ImageContainer;->e:Ljava/lang/String;

    return-object v0
.end method
