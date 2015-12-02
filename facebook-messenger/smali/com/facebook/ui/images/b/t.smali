.class public Lcom/facebook/ui/images/b/t;
.super Ljava/lang/Object;
.source "FetchedImage.java"


# instance fields
.field private final a:Lcom/facebook/ui/images/cache/d;

.field private b:Ljava/io/File;

.field private c:Landroid/graphics/Bitmap;

.field private d:Lcom/facebook/ui/images/b/v;

.field private e:J

.field private f:Lcom/facebook/ui/images/b/u;


# direct methods
.method private constructor <init>(Lcom/facebook/ui/images/cache/d;)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 189
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 183
    iput-object v0, p0, Lcom/facebook/ui/images/b/t;->b:Ljava/io/File;

    .line 184
    iput-object v0, p0, Lcom/facebook/ui/images/b/t;->c:Landroid/graphics/Bitmap;

    .line 186
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/facebook/ui/images/b/t;->e:J

    .line 190
    iput-object p1, p0, Lcom/facebook/ui/images/b/t;->a:Lcom/facebook/ui/images/cache/d;

    .line 191
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/ui/images/cache/d;Lcom/facebook/ui/images/b/s;)V
    .locals 0

    .prologue
    .line 177
    invoke-direct {p0, p1}, Lcom/facebook/ui/images/b/t;-><init>(Lcom/facebook/ui/images/cache/d;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/ui/images/b/t;)Lcom/facebook/ui/images/cache/d;
    .locals 1

    .prologue
    .line 177
    iget-object v0, p0, Lcom/facebook/ui/images/b/t;->a:Lcom/facebook/ui/images/cache/d;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/ui/images/b/t;)Lcom/facebook/ui/images/b/v;
    .locals 1

    .prologue
    .line 177
    iget-object v0, p0, Lcom/facebook/ui/images/b/t;->d:Lcom/facebook/ui/images/b/v;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/ui/images/b/t;)Lcom/facebook/ui/images/b/u;
    .locals 1

    .prologue
    .line 177
    iget-object v0, p0, Lcom/facebook/ui/images/b/t;->f:Lcom/facebook/ui/images/b/u;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/ui/images/b/t;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 177
    iget-object v0, p0, Lcom/facebook/ui/images/b/t;->c:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/ui/images/b/t;)Ljava/io/File;
    .locals 1

    .prologue
    .line 177
    iget-object v0, p0, Lcom/facebook/ui/images/b/t;->b:Ljava/io/File;

    return-object v0
.end method

.method static synthetic f(Lcom/facebook/ui/images/b/t;)J
    .locals 2

    .prologue
    .line 177
    iget-wide v0, p0, Lcom/facebook/ui/images/b/t;->e:J

    return-wide v0
.end method


# virtual methods
.method public a()Lcom/facebook/ui/images/b/r;
    .locals 2

    .prologue
    .line 254
    new-instance v0, Lcom/facebook/ui/images/b/r;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/ui/images/b/r;-><init>(Lcom/facebook/ui/images/b/t;Lcom/facebook/ui/images/b/s;)V

    return-object v0
.end method

.method public a(J)Lcom/facebook/ui/images/b/t;
    .locals 0

    .prologue
    .line 244
    iput-wide p1, p0, Lcom/facebook/ui/images/b/t;->e:J

    .line 245
    return-object p0
.end method

.method public a(Landroid/graphics/Bitmap;)Lcom/facebook/ui/images/b/t;
    .locals 0

    .prologue
    .line 211
    iput-object p1, p0, Lcom/facebook/ui/images/b/t;->c:Landroid/graphics/Bitmap;

    .line 212
    return-object p0
.end method

.method public a(Lcom/facebook/ui/images/b/u;)Lcom/facebook/ui/images/b/t;
    .locals 0

    .prologue
    .line 233
    iput-object p1, p0, Lcom/facebook/ui/images/b/t;->f:Lcom/facebook/ui/images/b/u;

    .line 234
    return-object p0
.end method

.method public a(Lcom/facebook/ui/images/b/v;)Lcom/facebook/ui/images/b/t;
    .locals 0

    .prologue
    .line 222
    iput-object p1, p0, Lcom/facebook/ui/images/b/t;->d:Lcom/facebook/ui/images/b/v;

    .line 223
    return-object p0
.end method

.method public a(Ljava/io/File;)Lcom/facebook/ui/images/b/t;
    .locals 0

    .prologue
    .line 200
    iput-object p1, p0, Lcom/facebook/ui/images/b/t;->b:Ljava/io/File;

    .line 201
    return-object p0
.end method
