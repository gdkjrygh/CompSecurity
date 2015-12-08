.class public Lcom/arist/util/FavMusicXmlUtil;
.super Ljava/lang/Object;
.source "FavMusicXmlUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getFavMusic()Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Music;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 22
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .local v6, "musics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    const/4 v0, 0x0

    .line 26
    .local v0, "currentMusic":Lcom/arist/entity/Music;
    :try_start_0
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    move-result-object v3

    .line 27
    .local v3, "factory":Lorg/xmlpull/v1/XmlPullParserFactory;
    const/4 v9, 0x0

    invoke-virtual {v3, v9}, Lorg/xmlpull/v1/XmlPullParserFactory;->setNamespaceAware(Z)V

    .line 28
    invoke-virtual {v3}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v7

    .line 29
    .local v7, "parser":Lorg/xmlpull/v1/XmlPullParser;
    new-instance v4, Ljava/io/File;

    sget-object v9, Lcom/arist/util/Constant;->BASE_FAV_PATH:Ljava/lang/String;

    invoke-direct {v4, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 30
    .local v4, "file":Ljava/io/File;
    invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v9

    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v9

    if-nez v9, :cond_0

    .line 31
    invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v9

    invoke-virtual {v9}, Ljava/io/File;->mkdirs()Z

    .line 33
    :cond_0
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v9

    if-nez v9, :cond_1

    .line 34
    invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z

    .line 36
    :cond_1
    new-instance v5, Ljava/io/FileInputStream;

    invoke-direct {v5, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 37
    .local v5, "in":Ljava/io/FileInputStream;
    const-string v9, "utf-8"

    invoke-interface {v7, v5, v9}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 40
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2

    .local v2, "eventType":I
    move-object v1, v0

    .line 42
    .end local v0    # "currentMusic":Lcom/arist/entity/Music;
    .local v1, "currentMusic":Lcom/arist/entity/Music;
    :goto_0
    const/4 v9, 0x1

    if-ne v2, v9, :cond_2

    move-object v0, v1

    .line 83
    .end local v1    # "currentMusic":Lcom/arist/entity/Music;
    .end local v2    # "eventType":I
    .end local v3    # "factory":Lorg/xmlpull/v1/XmlPullParserFactory;
    .end local v4    # "file":Ljava/io/File;
    .end local v5    # "in":Ljava/io/FileInputStream;
    .end local v7    # "parser":Lorg/xmlpull/v1/XmlPullParser;
    .restart local v0    # "currentMusic":Lcom/arist/entity/Music;
    :goto_1
    return-object v6

    .line 44
    .end local v0    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v1    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v2    # "eventType":I
    .restart local v3    # "factory":Lorg/xmlpull/v1/XmlPullParserFactory;
    .restart local v4    # "file":Ljava/io/File;
    .restart local v5    # "in":Ljava/io/FileInputStream;
    .restart local v7    # "parser":Lorg/xmlpull/v1/XmlPullParser;
    :cond_2
    packed-switch v2, :pswitch_data_0

    :cond_3
    :goto_2
    :pswitch_0
    move-object v0, v1

    .line 80
    .end local v1    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v0    # "currentMusic":Lcom/arist/entity/Music;
    :goto_3
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->next()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v2

    move-object v1, v0

    .end local v0    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v1    # "currentMusic":Lcom/arist/entity/Music;
    goto :goto_0

    :pswitch_1
    move-object v0, v1

    .line 46
    .end local v1    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v0    # "currentMusic":Lcom/arist/entity/Music;
    goto :goto_3

    .line 49
    .end local v0    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v1    # "currentMusic":Lcom/arist/entity/Music;
    :pswitch_2
    :try_start_1
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v8

    .line 50
    .local v8, "tagName":Ljava/lang/String;
    const-string v9, "music"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 51
    new-instance v0, Lcom/arist/entity/Music;

    invoke-direct {v0}, Lcom/arist/entity/Music;-><init>()V

    .line 52
    .end local v1    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v0    # "currentMusic":Lcom/arist/entity/Music;
    goto :goto_3

    .end local v0    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v1    # "currentMusic":Lcom/arist/entity/Music;
    :cond_4
    const-string v9, "id"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 53
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    invoke-virtual {v1, v9}, Lcom/arist/entity/Music;->setId(I)V

    move-object v0, v1

    .line 54
    .end local v1    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v0    # "currentMusic":Lcom/arist/entity/Music;
    goto :goto_3

    .end local v0    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v1    # "currentMusic":Lcom/arist/entity/Music;
    :cond_5
    const-string v9, "title"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 55
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Lcom/arist/entity/Music;->setTitle(Ljava/lang/String;)V

    move-object v0, v1

    .line 56
    .end local v1    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v0    # "currentMusic":Lcom/arist/entity/Music;
    goto :goto_3

    .end local v0    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v1    # "currentMusic":Lcom/arist/entity/Music;
    :cond_6
    const-string v9, "data"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    .line 57
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Lcom/arist/entity/Music;->setData(Ljava/lang/String;)V

    move-object v0, v1

    .line 58
    .end local v1    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v0    # "currentMusic":Lcom/arist/entity/Music;
    goto :goto_3

    .end local v0    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v1    # "currentMusic":Lcom/arist/entity/Music;
    :cond_7
    const-string v9, "size"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    .line 59
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v10

    invoke-virtual {v1, v10, v11}, Lcom/arist/entity/Music;->setSize(J)V

    move-object v0, v1

    .line 60
    .end local v1    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v0    # "currentMusic":Lcom/arist/entity/Music;
    goto :goto_3

    .end local v0    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v1    # "currentMusic":Lcom/arist/entity/Music;
    :cond_8
    const-string v9, "duration"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    .line 61
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    invoke-virtual {v1, v9}, Lcom/arist/entity/Music;->setDuration(I)V

    move-object v0, v1

    .line 62
    .end local v1    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v0    # "currentMusic":Lcom/arist/entity/Music;
    goto :goto_3

    .end local v0    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v1    # "currentMusic":Lcom/arist/entity/Music;
    :cond_9
    const-string v9, "album"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    .line 63
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Lcom/arist/entity/Music;->setAlbum(Ljava/lang/String;)V

    move-object v0, v1

    .line 64
    .end local v1    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v0    # "currentMusic":Lcom/arist/entity/Music;
    goto/16 :goto_3

    .end local v0    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v1    # "currentMusic":Lcom/arist/entity/Music;
    :cond_a
    const-string v9, "albumId"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    .line 65
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    invoke-virtual {v1, v9}, Lcom/arist/entity/Music;->setAlbumId(I)V

    move-object v0, v1

    .line 66
    .end local v1    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v0    # "currentMusic":Lcom/arist/entity/Music;
    goto/16 :goto_3

    .end local v0    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v1    # "currentMusic":Lcom/arist/entity/Music;
    :cond_b
    const-string v9, "artist"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_c

    .line 67
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Lcom/arist/entity/Music;->setArtist(Ljava/lang/String;)V

    move-object v0, v1

    .line 68
    .end local v1    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v0    # "currentMusic":Lcom/arist/entity/Music;
    goto/16 :goto_3

    .end local v0    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v1    # "currentMusic":Lcom/arist/entity/Music;
    :cond_c
    const-string v9, "folderPath"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 69
    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->nextText()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Lcom/arist/entity/Music;->setFolderPath(Ljava/lang/String;)V

    move-object v0, v1

    .line 71
    .end local v1    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v0    # "currentMusic":Lcom/arist/entity/Music;
    goto/16 :goto_3

    .line 74
    .end local v0    # "currentMusic":Lcom/arist/entity/Music;
    .end local v8    # "tagName":Ljava/lang/String;
    .restart local v1    # "currentMusic":Lcom/arist/entity/Music;
    :pswitch_3
    const-string v9, "music"

    invoke-interface {v7}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 76
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_2

    .line 82
    :catch_0
    move-exception v9

    move-object v0, v1

    .end local v1    # "currentMusic":Lcom/arist/entity/Music;
    .restart local v0    # "currentMusic":Lcom/arist/entity/Music;
    goto/16 :goto_1

    .end local v2    # "eventType":I
    .end local v3    # "factory":Lorg/xmlpull/v1/XmlPullParserFactory;
    .end local v4    # "file":Ljava/io/File;
    .end local v5    # "in":Ljava/io/FileInputStream;
    .end local v7    # "parser":Lorg/xmlpull/v1/XmlPullParser;
    :catch_1
    move-exception v9

    goto/16 :goto_1

    .line 44
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static saveFavMusic(Ljava/util/ArrayList;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/Music;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 87
    .local p0, "musics":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/arist/entity/Music;>;"
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v6

    const-string v7, "mounted"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    .line 161
    :goto_0
    return-void

    .line 90
    :cond_0
    new-instance v2, Ljava/io/File;

    sget-object v6, Lcom/arist/util/Constant;->BASE_FAV_PATH:Ljava/lang/String;

    invoke-direct {v2, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 91
    .local v2, "file":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v6

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_1

    .line 92
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v6

    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 94
    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_2

    .line 96
    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 102
    :cond_2
    :goto_1
    :try_start_1
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 104
    .local v4, "os":Ljava/io/OutputStream;
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    move-result-object v1

    .line 106
    .local v1, "factory":Lorg/xmlpull/v1/XmlPullParserFactory;
    invoke-virtual {v1}, Lorg/xmlpull/v1/XmlPullParserFactory;->newSerializer()Lorg/xmlpull/v1/XmlSerializer;

    move-result-object v5

    .line 107
    .local v5, "xs":Lorg/xmlpull/v1/XmlSerializer;
    const-string v6, "UTF-8"

    invoke-interface {v5, v4, v6}, Lorg/xmlpull/v1/XmlSerializer;->setOutput(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 108
    const-string v6, "UTF-8"

    const/4 v7, 0x1

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-interface {v5, v6, v7}, Lorg/xmlpull/v1/XmlSerializer;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 109
    const-string v6, "\n"

    invoke-interface {v5, v6}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 110
    const/4 v6, 0x0

    const-string v7, "musics"

    invoke-interface {v5, v6, v7}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 111
    const-string v6, "\n"

    invoke-interface {v5, v6}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 112
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_3

    .line 154
    const/4 v6, 0x0

    const-string v7, "musics"

    invoke-interface {v5, v6, v7}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 155
    const-string v6, "\n"

    invoke-interface {v5, v6}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 156
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlSerializer;->endDocument()V

    .line 157
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlSerializer;->flush()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 158
    .end local v1    # "factory":Lorg/xmlpull/v1/XmlPullParserFactory;
    .end local v4    # "os":Ljava/io/OutputStream;
    .end local v5    # "xs":Lorg/xmlpull/v1/XmlSerializer;
    :catch_0
    move-exception v0

    .line 159
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 97
    .end local v0    # "e":Ljava/lang/Exception;
    :catch_1
    move-exception v0

    .line 98
    .local v0, "e":Ljava/io/IOException;
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1

    .line 112
    .end local v0    # "e":Ljava/io/IOException;
    .restart local v1    # "factory":Lorg/xmlpull/v1/XmlPullParserFactory;
    .restart local v4    # "os":Ljava/io/OutputStream;
    .restart local v5    # "xs":Lorg/xmlpull/v1/XmlSerializer;
    :cond_3
    :try_start_2
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/arist/entity/Music;

    .line 114
    .local v3, "music":Lcom/arist/entity/Music;
    const/4 v7, 0x0

    const-string v8, "music"

    invoke-interface {v5, v7, v8}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    const-string v7, "\n"

    invoke-interface {v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 116
    const/4 v7, 0x0

    const-string v8, "id"

    invoke-interface {v5, v7, v8}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 117
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/arist/entity/Music;->getId()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 118
    const/4 v7, 0x0

    const-string v8, "id"

    invoke-interface {v5, v7, v8}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    const-string v7, "\n"

    invoke-interface {v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 120
    const/4 v7, 0x0

    const-string v8, "title"

    invoke-interface {v5, v7, v8}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 121
    invoke-virtual {v3}, Lcom/arist/entity/Music;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 122
    const/4 v7, 0x0

    const-string v8, "title"

    invoke-interface {v5, v7, v8}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    const-string v7, "\n"

    invoke-interface {v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 124
    const/4 v7, 0x0

    const-string v8, "data"

    invoke-interface {v5, v7, v8}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 125
    invoke-virtual {v3}, Lcom/arist/entity/Music;->getData()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 126
    const/4 v7, 0x0

    const-string v8, "data"

    invoke-interface {v5, v7, v8}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    const-string v7, "\n"

    invoke-interface {v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 128
    const/4 v7, 0x0

    const-string v8, "size"

    invoke-interface {v5, v7, v8}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 129
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/arist/entity/Music;->getSize()J

    move-result-wide v8

    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 130
    const/4 v7, 0x0

    const-string v8, "size"

    invoke-interface {v5, v7, v8}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    const-string v7, "\n"

    invoke-interface {v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 132
    const/4 v7, 0x0

    const-string v8, "duration"

    invoke-interface {v5, v7, v8}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 133
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/arist/entity/Music;->getDuration()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 134
    const/4 v7, 0x0

    const-string v8, "duration"

    invoke-interface {v5, v7, v8}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    const-string v7, "\n"

    invoke-interface {v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 136
    const/4 v7, 0x0

    const-string v8, "album"

    invoke-interface {v5, v7, v8}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 137
    invoke-virtual {v3}, Lcom/arist/entity/Music;->getAlbum()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 138
    const/4 v7, 0x0

    const-string v8, "album"

    invoke-interface {v5, v7, v8}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    const-string v7, "\n"

    invoke-interface {v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 140
    const/4 v7, 0x0

    const-string v8, "albumId"

    invoke-interface {v5, v7, v8}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 141
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/arist/entity/Music;->getAlbumId()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 142
    const/4 v7, 0x0

    const-string v8, "albumId"

    invoke-interface {v5, v7, v8}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    const-string v7, "\n"

    invoke-interface {v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 144
    const/4 v7, 0x0

    const-string v8, "artist"

    invoke-interface {v5, v7, v8}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 145
    invoke-virtual {v3}, Lcom/arist/entity/Music;->getArtist()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 146
    const/4 v7, 0x0

    const-string v8, "artist"

    invoke-interface {v5, v7, v8}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    const-string v7, "\n"

    invoke-interface {v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 148
    const/4 v7, 0x0

    const-string v8, "folderPath"

    invoke-interface {v5, v7, v8}, Lorg/xmlpull/v1/XmlSerializer;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 149
    invoke-virtual {v3}, Lcom/arist/entity/Music;->getFolderPath()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 150
    const/4 v7, 0x0

    const-string v8, "folderPath"

    invoke-interface {v5, v7, v8}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    const-string v7, "\n"

    invoke-interface {v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 152
    const/4 v7, 0x0

    const-string v8, "music"

    invoke-interface {v5, v7, v8}, Lorg/xmlpull/v1/XmlSerializer;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    const-string v7, "\n"

    invoke-interface {v5, v7}, Lorg/xmlpull/v1/XmlSerializer;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_2
.end method
