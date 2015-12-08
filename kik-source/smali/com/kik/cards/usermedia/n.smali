.class final Lcom/kik/cards/usermedia/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public a:Lcom/kik/g/p;

.field private b:Landroid/content/ContentResolver;

.field private c:Lcom/kik/cards/usermedia/q;

.field private d:I


# direct methods
.method public constructor <init>(Lcom/kik/cards/usermedia/q;Landroid/content/ContentResolver;I)V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/usermedia/n;->a:Lcom/kik/g/p;

    .line 34
    iput-object p1, p0, Lcom/kik/cards/usermedia/n;->c:Lcom/kik/cards/usermedia/q;

    .line 35
    iput-object p2, p0, Lcom/kik/cards/usermedia/n;->b:Landroid/content/ContentResolver;

    .line 36
    iput p3, p0, Lcom/kik/cards/usermedia/n;->d:I

    .line 37
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    const/4 v5, 0x0

    const/4 v1, 0x0

    .line 43
    iget-object v0, p0, Lcom/kik/cards/usermedia/n;->b:Landroid/content/ContentResolver;

    iget-object v2, p0, Lcom/kik/cards/usermedia/n;->c:Lcom/kik/cards/usermedia/q;

    invoke-virtual {v2}, Lcom/kik/cards/usermedia/q;->a()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget v4, p0, Lcom/kik/cards/usermedia/n;->d:I

    invoke-static {v0, v2, v3, v4, v5}, Landroid/provider/MediaStore$Images$Thumbnails;->getThumbnail(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 44
    iget-object v2, p0, Lcom/kik/cards/usermedia/n;->c:Lcom/kik/cards/usermedia/q;

    invoke-virtual {v2}, Lcom/kik/cards/usermedia/q;->b()I

    move-result v2

    .line 45
    if-eqz v0, :cond_1

    .line 46
    if-lez v2, :cond_0

    .line 47
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 48
    int-to-float v2, v2

    invoke-virtual {v5, v2}, Landroid/graphics/Matrix;->setRotate(F)V

    .line 49
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    move v2, v1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 51
    :cond_0
    new-instance v1, Lcom/kik/cache/h;

    new-instance v2, Lcom/kik/cache/g;

    invoke-direct {v2, v0}, Lcom/kik/cache/g;-><init>(Landroid/graphics/Bitmap;)V

    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/kik/cache/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    iget-object v0, p0, Lcom/kik/cards/usermedia/n;->a:Lcom/kik/g/p;

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 57
    :goto_0
    return-void

    .line 55
    :cond_1
    iget-object v0, p0, Lcom/kik/cards/usermedia/n;->a:Lcom/kik/g/p;

    invoke-virtual {v0, v5}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method
