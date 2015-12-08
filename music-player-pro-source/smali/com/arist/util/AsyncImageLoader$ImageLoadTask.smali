.class public Lcom/arist/util/AsyncImageLoader$ImageLoadTask;
.super Ljava/lang/Object;
.source "AsyncImageLoader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/util/AsyncImageLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ImageLoadTask"
.end annotation


# instance fields
.field private bitmap:Landroid/graphics/Bitmap;

.field private callback:Lcom/arist/util/AsyncImageLoader$Callback;

.field private netPath:Ljava/lang/String;

.field private savePath:Ljava/lang/String;

.field final synthetic this$0:Lcom/arist/util/AsyncImageLoader;


# direct methods
.method public constructor <init>(Lcom/arist/util/AsyncImageLoader;)V
    .locals 0

    .prologue
    .line 118
    iput-object p1, p0, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->this$0:Lcom/arist/util/AsyncImageLoader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/arist/util/AsyncImageLoader$ImageLoadTask;)Lcom/arist/util/AsyncImageLoader$Callback;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->callback:Lcom/arist/util/AsyncImageLoader$Callback;

    return-object v0
.end method

.method static synthetic access$1(Lcom/arist/util/AsyncImageLoader$ImageLoadTask;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->netPath:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$2(Lcom/arist/util/AsyncImageLoader$ImageLoadTask;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic access$3(Lcom/arist/util/AsyncImageLoader$ImageLoadTask;Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 120
    iput-object p1, p0, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;

    return-void
.end method

.method static synthetic access$4(Lcom/arist/util/AsyncImageLoader$ImageLoadTask;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 122
    iget-object v0, p0, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->savePath:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$5(Lcom/arist/util/AsyncImageLoader$ImageLoadTask;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 119
    iput-object p1, p0, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->netPath:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$6(Lcom/arist/util/AsyncImageLoader$ImageLoadTask;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 122
    iput-object p1, p0, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->savePath:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$7(Lcom/arist/util/AsyncImageLoader$ImageLoadTask;Lcom/arist/util/AsyncImageLoader$Callback;)V
    .locals 0

    .prologue
    .line 121
    iput-object p1, p0, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->callback:Lcom/arist/util/AsyncImageLoader$Callback;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 142
    move-object v0, p1

    check-cast v0, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;

    .line 143
    .local v0, "task":Lcom/arist/util/AsyncImageLoader$ImageLoadTask;
    iget-object v1, p0, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->savePath:Ljava/lang/String;

    iget-object v2, v0, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->savePath:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    return v1
.end method

.method public getAlbumID()Ljava/lang/String;
    .locals 1

    .prologue
    .line 147
    iget-object v0, p0, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->savePath:Ljava/lang/String;

    return-object v0
.end method

.method public getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->netPath:Ljava/lang/String;

    return-object v0
.end method

.method public setAlbumID(Ljava/lang/String;)V
    .locals 0
    .param p1, "albumID"    # Ljava/lang/String;

    .prologue
    .line 151
    iput-object p1, p0, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->savePath:Ljava/lang/String;

    .line 152
    return-void
.end method

.method public setBitmap(Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1, "bitmap"    # Landroid/graphics/Bitmap;

    .prologue
    .line 137
    iput-object p1, p0, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;

    .line 138
    return-void
.end method

.method public setPath(Ljava/lang/String;)V
    .locals 0
    .param p1, "path"    # Ljava/lang/String;

    .prologue
    .line 129
    iput-object p1, p0, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->netPath:Ljava/lang/String;

    .line 130
    return-void
.end method
