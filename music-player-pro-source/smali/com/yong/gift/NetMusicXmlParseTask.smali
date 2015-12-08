.class public Lcom/yong/gift/NetMusicXmlParseTask;
.super Landroid/os/AsyncTask;
.source "NetMusicXmlParseTask.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        "Ljava/util/ArrayList",
        "<",
        "Lcom/yong/gift/GiftEntity;",
        ">;>;"
    }
.end annotation


# instance fields
.field private context:Lcom/yong/gift/GiftActivity;

.field private parser:Lcom/yong/gift/GiftXmlParser;


# direct methods
.method public constructor <init>(Lcom/yong/gift/GiftActivity;)V
    .locals 1
    .param p1, "context"    # Lcom/yong/gift/GiftActivity;

    .prologue
    .line 16
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/yong/gift/NetMusicXmlParseTask;->context:Lcom/yong/gift/GiftActivity;

    .line 18
    new-instance v0, Lcom/yong/gift/GiftXmlParser;

    invoke-direct {v0}, Lcom/yong/gift/GiftXmlParser;-><init>()V

    iput-object v0, p0, Lcom/yong/gift/NetMusicXmlParseTask;->parser:Lcom/yong/gift/GiftXmlParser;

    .line 19
    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/yong/gift/NetMusicXmlParseTask;->doInBackground([Ljava/lang/String;)Ljava/util/ArrayList;

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
            "Lcom/yong/gift/GiftEntity;",
            ">;"
        }
    .end annotation

    .prologue
    .line 23
    const/4 v1, 0x0

    .line 26
    .local v1, "giftList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/yong/gift/GiftEntity;>;"
    const/4 v3, 0x0

    :try_start_0
    aget-object v3, p1, v3

    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x1

    .line 26
    invoke-static {v3, v4, v5}, Lcom/arist/util/HttpService;->getStream(Ljava/lang/String;Ljava/util/ArrayList;I)Ljava/io/InputStream;

    move-result-object v2

    .line 28
    .local v2, "in":Ljava/io/InputStream;
    iget-object v3, p0, Lcom/yong/gift/NetMusicXmlParseTask;->parser:Lcom/yong/gift/GiftXmlParser;

    invoke-virtual {v3, v2}, Lcom/yong/gift/GiftXmlParser;->parse(Ljava/io/InputStream;)Ljava/util/ArrayList;

    move-result-object v1

    .line 29
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 35
    .end local v2    # "in":Ljava/io/InputStream;
    :goto_0
    return-object v1

    .line 30
    :catch_0
    move-exception v0

    .line 31
    .local v0, "e":Ljava/io/IOException;
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 32
    .end local v0    # "e":Ljava/io/IOException;
    :catch_1
    move-exception v0

    .line 33
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lcom/yong/gift/NetMusicXmlParseTask;->onPostExecute(Ljava/util/ArrayList;)V

    return-void
.end method

.method protected onPostExecute(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/yong/gift/GiftEntity;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 40
    .local p1, "result":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/yong/gift/GiftEntity;>;"
    iget-object v0, p0, Lcom/yong/gift/NetMusicXmlParseTask;->context:Lcom/yong/gift/GiftActivity;

    invoke-virtual {v0, p1}, Lcom/yong/gift/GiftActivity;->updateView(Ljava/util/ArrayList;)V

    .line 41
    return-void
.end method
