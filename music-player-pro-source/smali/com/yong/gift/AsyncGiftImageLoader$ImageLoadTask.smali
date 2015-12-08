.class public Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;
.super Ljava/lang/Object;
.source "AsyncGiftImageLoader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yong/gift/AsyncGiftImageLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ImageLoadTask"
.end annotation


# instance fields
.field private bitmap:Landroid/graphics/Bitmap;

.field private callback:Lcom/yong/gift/AsyncGiftImageLoader$Callback;

.field private icon_netPath:Ljava/lang/String;

.field private savePath:Ljava/lang/String;

.field final synthetic this$0:Lcom/yong/gift/AsyncGiftImageLoader;


# direct methods
.method public constructor <init>(Lcom/yong/gift/AsyncGiftImageLoader;)V
    .locals 0

    .prologue
    .line 150
    iput-object p1, p0, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->this$0:Lcom/yong/gift/AsyncGiftImageLoader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;)Lcom/yong/gift/AsyncGiftImageLoader$Callback;
    .locals 1

    .prologue
    .line 153
    iget-object v0, p0, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->callback:Lcom/yong/gift/AsyncGiftImageLoader$Callback;

    return-object v0
.end method

.method static synthetic access$1(Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 151
    iget-object v0, p0, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->icon_netPath:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$2(Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic access$3(Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 152
    iput-object p1, p0, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;

    return-void
.end method

.method static synthetic access$4(Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->savePath:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$5(Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 151
    iput-object p1, p0, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->icon_netPath:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$6(Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 154
    iput-object p1, p0, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->savePath:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$7(Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;Lcom/yong/gift/AsyncGiftImageLoader$Callback;)V
    .locals 0

    .prologue
    .line 153
    iput-object p1, p0, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->callback:Lcom/yong/gift/AsyncGiftImageLoader$Callback;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 174
    move-object v0, p1

    check-cast v0, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;

    .line 175
    .local v0, "task":Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;
    iget-object v1, p0, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->icon_netPath:Ljava/lang/String;

    iget-object v2, v0, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->icon_netPath:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    return v1
.end method

.method public getAlbumID()Ljava/lang/String;
    .locals 1

    .prologue
    .line 179
    iget-object v0, p0, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->savePath:Ljava/lang/String;

    return-object v0
.end method

.method public getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 157
    iget-object v0, p0, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->icon_netPath:Ljava/lang/String;

    return-object v0
.end method

.method public setAlbumID(Ljava/lang/String;)V
    .locals 0
    .param p1, "albumID"    # Ljava/lang/String;

    .prologue
    .line 183
    iput-object p1, p0, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->savePath:Ljava/lang/String;

    .line 184
    return-void
.end method

.method public setBitmap(Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1, "bitmap"    # Landroid/graphics/Bitmap;

    .prologue
    .line 169
    iput-object p1, p0, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;

    .line 170
    return-void
.end method

.method public setPath(Ljava/lang/String;)V
    .locals 0
    .param p1, "path"    # Ljava/lang/String;

    .prologue
    .line 161
    iput-object p1, p0, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->icon_netPath:Ljava/lang/String;

    .line 162
    return-void
.end method
