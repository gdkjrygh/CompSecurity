.class public Lnet/coocent/android/xmlparser/NetMusicXmlParseTask;
.super Landroid/os/AsyncTask;
.source "NetMusicXmlParseTask.java"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        "Ljava/util/ArrayList",
        "<",
        "Lnet/coocent/android/xmlparser/GiftEntity;",
        ">;>;"
    }
.end annotation


# instance fields
.field private loader:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;

.field private mcontext:Landroid/content/Context;

.field private mloadAppInfoListener:Lnet/coocent/android/xmlparser/LoadAppInfoListener;

.field private parser:Lnet/coocent/android/xmlparser/GiftXmlParser;


# direct methods
.method public constructor <init>(Lnet/coocent/android/xmlparser/LoadAppInfoListener;Landroid/content/Context;)V
    .locals 2
    .param p1, "loadAppInfoListener"    # Lnet/coocent/android/xmlparser/LoadAppInfoListener;
    .param p2, "context"    # Landroid/content/Context;

    .prologue
    .line 19
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 21
    iput-object p1, p0, Lnet/coocent/android/xmlparser/NetMusicXmlParseTask;->mloadAppInfoListener:Lnet/coocent/android/xmlparser/LoadAppInfoListener;

    .line 22
    iput-object p2, p0, Lnet/coocent/android/xmlparser/NetMusicXmlParseTask;->mcontext:Landroid/content/Context;

    .line 23
    new-instance v0, Lnet/coocent/android/xmlparser/GiftXmlParser;

    iget-object v1, p0, Lnet/coocent/android/xmlparser/NetMusicXmlParseTask;->mcontext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lnet/coocent/android/xmlparser/GiftXmlParser;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnet/coocent/android/xmlparser/NetMusicXmlParseTask;->parser:Lnet/coocent/android/xmlparser/GiftXmlParser;

    .line 24
    new-instance v0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;

    invoke-direct {v0}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;-><init>()V

    iput-object v0, p0, Lnet/coocent/android/xmlparser/NetMusicXmlParseTask;->loader:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;

    .line 25
    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lnet/coocent/android/xmlparser/NetMusicXmlParseTask;->doInBackground([Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6
    .param p1, "params"    # [Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lnet/coocent/android/xmlparser/GiftEntity;",
            ">;"
        }
    .end annotation

    .prologue
    .line 29
    const/4 v1, 0x0

    .line 32
    .local v1, "giftList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lnet/coocent/android/xmlparser/GiftEntity;>;"
    const/4 v3, 0x0

    :try_start_0
    aget-object v3, p1, v3

    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x1

    .line 32
    invoke-static {v3, v4, v5}, Lnet/coocent/android/xmlparser/HttpService;->getStream(Ljava/lang/String;Ljava/util/ArrayList;I)Ljava/io/InputStream;

    move-result-object v2

    .line 34
    .local v2, "in":Ljava/io/InputStream;
    iget-object v3, p0, Lnet/coocent/android/xmlparser/NetMusicXmlParseTask;->parser:Lnet/coocent/android/xmlparser/GiftXmlParser;

    invoke-virtual {v3, v2}, Lnet/coocent/android/xmlparser/GiftXmlParser;->parse(Ljava/io/InputStream;)Ljava/util/ArrayList;

    move-result-object v1

    .line 35
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 41
    .end local v2    # "in":Ljava/io/InputStream;
    :goto_0
    return-object v1

    .line 36
    :catch_0
    move-exception v0

    .line 37
    .local v0, "e":Ljava/io/IOException;
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 38
    .end local v0    # "e":Ljava/io/IOException;
    :catch_1
    move-exception v0

    .line 39
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lnet/coocent/android/xmlparser/NetMusicXmlParseTask;->onPostExecute(Ljava/util/ArrayList;)V

    return-void
.end method

.method protected onPostExecute(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lnet/coocent/android/xmlparser/GiftEntity;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 46
    .local p1, "result":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lnet/coocent/android/xmlparser/GiftEntity;>;"
    if-eqz p1, :cond_0

    .line 47
    iget-object v2, p0, Lnet/coocent/android/xmlparser/NetMusicXmlParseTask;->mloadAppInfoListener:Lnet/coocent/android/xmlparser/LoadAppInfoListener;

    invoke-interface {v2, p1}, Lnet/coocent/android/xmlparser/LoadAppInfoListener;->onAppInfoLoaded(Ljava/util/ArrayList;)V

    .line 48
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 49
    .local v1, "n":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-lt v0, v1, :cond_1

    .line 53
    .end local v0    # "i":I
    .end local v1    # "n":I
    :cond_0
    return-void

    .line 50
    .restart local v0    # "i":I
    .restart local v1    # "n":I
    :cond_1
    iget-object v3, p0, Lnet/coocent/android/xmlparser/NetMusicXmlParseTask;->loader:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/coocent/android/xmlparser/GiftEntity;

    const/4 v4, 0x0

    invoke-virtual {v3, v2, v4}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;->loadImage(Lnet/coocent/android/xmlparser/GiftEntity;Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$Callback;)Landroid/graphics/Bitmap;

    .line 49
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
