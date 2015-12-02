.class public Lcom/facebook/ads/internal/util/l;
.super Landroid/os/AsyncTask;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "[",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Landroid/widget/ImageView;

.field private final d:Lcom/facebook/ads/internal/f/c;

.field private e:Lcom/facebook/ads/internal/util/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/facebook/ads/internal/util/l;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/ads/internal/util/l;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p1, p0, Lcom/facebook/ads/internal/util/l;->b:Landroid/content/Context;

    iput-object v0, p0, Lcom/facebook/ads/internal/util/l;->d:Lcom/facebook/ads/internal/f/c;

    iput-object v0, p0, Lcom/facebook/ads/internal/util/l;->c:Landroid/widget/ImageView;

    return-void
.end method

.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 1

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    invoke-virtual {p1}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ads/internal/util/l;->b:Landroid/content/Context;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/ads/internal/util/l;->d:Lcom/facebook/ads/internal/f/c;

    iput-object p1, p0, Lcom/facebook/ads/internal/util/l;->c:Landroid/widget/ImageView;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/ads/internal/f/c;)V
    .locals 1

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    invoke-virtual {p1}, Lcom/facebook/ads/internal/f/c;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ads/internal/util/l;->b:Landroid/content/Context;

    iput-object p1, p0, Lcom/facebook/ads/internal/util/l;->d:Lcom/facebook/ads/internal/f/c;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/ads/internal/util/l;->c:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/ads/internal/util/m;)Lcom/facebook/ads/internal/util/l;
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/internal/util/l;->e:Lcom/facebook/ads/internal/util/m;

    return-object p0
.end method

.method protected a([Landroid/graphics/Bitmap;)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/facebook/ads/internal/util/l;->c:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/ads/internal/util/l;->c:Landroid/widget/ImageView;

    aget-object v1, p1, v2

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/ads/internal/util/l;->d:Lcom/facebook/ads/internal/f/c;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/ads/internal/util/l;->d:Lcom/facebook/ads/internal/f/c;

    aget-object v1, p1, v2

    const/4 v2, 0x1

    aget-object v2, p1, v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/ads/internal/f/c;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V

    :cond_1
    iget-object v0, p0, Lcom/facebook/ads/internal/util/l;->e:Lcom/facebook/ads/internal/util/m;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/ads/internal/util/l;->e:Lcom/facebook/ads/internal/util/m;

    invoke-interface {v0}, Lcom/facebook/ads/internal/util/m;->a()V

    :cond_2
    return-void
.end method

.method protected varargs a([Ljava/lang/String;)[Landroid/graphics/Bitmap;
    .locals 8

    const/4 v7, 0x1

    const/4 v6, 0x0

    aget-object v2, p1, v6

    iget-object v0, p0, Lcom/facebook/ads/internal/util/l;->b:Landroid/content/Context;

    invoke-static {v0, v2}, Lcom/facebook/ads/internal/util/n;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/facebook/ads/internal/util/h;->b()Lorg/apache/http/client/HttpClient;

    move-result-object v1

    new-instance v3, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {v3, v2}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    :try_start_0
    invoke-interface {v1, v3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/http/util/EntityUtils;->toByteArray(Lorg/apache/http/HttpEntity;)[B

    move-result-object v3

    const/4 v4, 0x0

    array-length v5, v3

    invoke-static {v3, v4, v5}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-interface {v1}, Lorg/apache/http/HttpEntity;->consumeContent()V

    iget-object v1, p0, Lcom/facebook/ads/internal/util/l;->b:Landroid/content/Context;

    invoke-static {v1, v2, v0}, Lcom/facebook/ads/internal/util/n;->a(Landroid/content/Context;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/facebook/ads/internal/util/l;->d:Lcom/facebook/ads/internal/f/c;

    if-eqz v1, :cond_2

    if-eqz v0, :cond_1

    :try_start_1
    new-instance v1, Lcom/facebook/ads/internal/util/s;

    invoke-direct {v1, v0}, Lcom/facebook/ads/internal/util/s;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x42200000    # 40.0f

    div-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/facebook/ads/internal/util/s;->a(I)Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Lcom/facebook/ads/internal/util/s;->a()Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    :goto_1
    const/4 v2, 0x2

    new-array v2, v2, [Landroid/graphics/Bitmap;

    aput-object v0, v2, v6

    aput-object v1, v2, v7

    move-object v0, v2

    :goto_2
    return-object v0

    :catch_0
    move-exception v1

    sget-object v3, Lcom/facebook/ads/internal/util/l;->a:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "Error downloading image: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catch_1
    move-exception v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/facebook/ads/internal/util/b;->a(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/facebook/ads/internal/util/b;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/ads/internal/util/d;->a(Lcom/facebook/ads/internal/util/b;)V

    :cond_1
    move-object v1, v0

    goto :goto_1

    :cond_2
    new-array v1, v7, [Landroid/graphics/Bitmap;

    aput-object v0, v1, v6

    move-object v0, v1

    goto :goto_2
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/facebook/ads/internal/util/l;->a([Ljava/lang/String;)[Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/facebook/ads/internal/util/l;->a([Landroid/graphics/Bitmap;)V

    return-void
.end method
