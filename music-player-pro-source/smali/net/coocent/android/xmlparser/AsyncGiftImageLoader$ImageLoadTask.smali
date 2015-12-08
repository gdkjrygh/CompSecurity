.class public Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;
.super Ljava/lang/Object;
.source "AsyncGiftImageLoader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ImageLoadTask"
.end annotation


# instance fields
.field private bitmap:Landroid/graphics/Bitmap;

.field private callback:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$Callback;

.field private icon_netPath:Ljava/lang/String;

.field private savePath:Ljava/lang/String;

.field final synthetic this$0:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;


# direct methods
.method public constructor <init>(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;)V
    .locals 0

    .prologue
    .line 160
    iput-object p1, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->this$0:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;)Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$Callback;
    .locals 1

    .prologue
    .line 163
    iget-object v0, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->callback:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$Callback;

    return-object v0
.end method

.method static synthetic access$1(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 161
    iget-object v0, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->icon_netPath:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$2(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 162
    iget-object v0, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic access$3(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 162
    iput-object p1, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;

    return-void
.end method

.method static synthetic access$4(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->savePath:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$5(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 161
    iput-object p1, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->icon_netPath:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$6(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 164
    iput-object p1, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->savePath:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$7(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$Callback;)V
    .locals 0

    .prologue
    .line 163
    iput-object p1, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->callback:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$Callback;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1, "o"    # Ljava/lang/Object;

    .prologue
    .line 184
    move-object v0, p1

    check-cast v0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;

    .line 185
    .local v0, "task":Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;
    iget-object v1, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->icon_netPath:Ljava/lang/String;

    iget-object v2, v0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->icon_netPath:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    return v1
.end method

.method public getAlbumID()Ljava/lang/String;
    .locals 1

    .prologue
    .line 189
    iget-object v0, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->savePath:Ljava/lang/String;

    return-object v0
.end method

.method public getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 175
    iget-object v0, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 167
    iget-object v0, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->icon_netPath:Ljava/lang/String;

    return-object v0
.end method

.method public setAlbumID(Ljava/lang/String;)V
    .locals 0
    .param p1, "albumID"    # Ljava/lang/String;

    .prologue
    .line 193
    iput-object p1, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->savePath:Ljava/lang/String;

    .line 194
    return-void
.end method

.method public setBitmap(Landroid/graphics/Bitmap;)V
    .locals 0
    .param p1, "bitmap"    # Landroid/graphics/Bitmap;

    .prologue
    .line 179
    iput-object p1, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;

    .line 180
    return-void
.end method

.method public setPath(Ljava/lang/String;)V
    .locals 0
    .param p1, "path"    # Ljava/lang/String;

    .prologue
    .line 171
    iput-object p1, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->icon_netPath:Ljava/lang/String;

    .line 172
    return-void
.end method
