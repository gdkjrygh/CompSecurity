.class public Lcom/hmobile/model/BookInfo;
.super Lcom/hmobile/activerecorbase/ActiveRecordBase;
.source "BookInfo.java"


# instance fields
.field public BookName:Ljava/lang/String;

.field public ChapterCount:I

.field public VerseCount:I

.field public id:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 14
    invoke-direct {p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;-><init>()V

    .line 18
    iput v1, p0, Lcom/hmobile/model/BookInfo;->id:I

    .line 19
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/model/BookInfo;->BookName:Ljava/lang/String;

    .line 20
    iput v1, p0, Lcom/hmobile/model/BookInfo;->ChapterCount:I

    .line 21
    iput v1, p0, Lcom/hmobile/model/BookInfo;->VerseCount:I

    .line 16
    return-void
.end method

.method public static getBookByBookName(Ljava/lang/String;)Lcom/hmobile/model/BookInfo;
    .locals 8
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    const/4 v4, 0x0

    .line 206
    const/4 v1, 0x0

    .line 208
    .local v1, "id":I
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v3

    const-class v5, Lcom/hmobile/model/BookInfo;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "select * from BOOK_INFO where BOOK_NAME like \'%"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "%\'"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v3, v5, v6, v7}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->excecuteRawQuery(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 214
    .local v2, "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/BookInfo;>;"
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_0

    .line 215
    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/hmobile/model/BookInfo;
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .line 220
    .end local v2    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/BookInfo;>;"
    :goto_0
    return-object v3

    .line 217
    :catch_0
    move-exception v0

    .line 218
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    .end local v0    # "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    :cond_0
    move-object v3, v4

    .line 220
    goto :goto_0
.end method

.method public static getBookCount()I
    .locals 4

    .prologue
    .line 133
    const/4 v1, 0x0

    .line 135
    .local v1, "i":I
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v2

    .line 136
    const-class v3, Lcom/hmobile/model/BookInfo;

    invoke-virtual {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getRecordCount(Ljava/lang/Class;)I
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    .line 140
    :goto_0
    return v1

    .line 137
    :catch_0
    move-exception v0

    .line 138
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_0
.end method

.method public static getBookIdByName(Ljava/lang/String;)I
    .locals 8
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 187
    const/4 v1, 0x0

    .line 189
    .local v1, "id":I
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v4

    const-class v5, Lcom/hmobile/model/BookInfo;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "select * from BOOK_INFO where BOOK_NAME like \'%"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "%\'"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v4, v5, v6, v7}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->excecuteRawQuery(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 195
    .local v3, "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/BookInfo;>;"
    if-eqz v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_0

    .line 196
    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/hmobile/model/BookInfo;

    invoke-virtual {v4}, Lcom/hmobile/model/BookInfo;->getID()J
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v4

    long-to-int v1, v4

    move v2, v1

    .line 202
    .end local v1    # "id":I
    .end local v3    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/BookInfo;>;"
    .local v2, "id":I
    :goto_0
    return v2

    .line 199
    .end local v2    # "id":I
    .restart local v1    # "id":I
    :catch_0
    move-exception v0

    .line 200
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    .end local v0    # "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    :cond_0
    move v2, v1

    .line 202
    .end local v1    # "id":I
    .restart local v2    # "id":I
    goto :goto_0
.end method

.method public static getBookInfoByBookid(J)Lcom/hmobile/model/BookInfo;
    .locals 4
    .param p0, "book_id"    # J

    .prologue
    .line 75
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v2

    .line 76
    const-class v3, Lcom/hmobile/model/BookInfo;

    .line 75
    invoke-virtual {v2, v3, p0, p1}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findByID(Ljava/lang/Class;J)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v0

    check-cast v0, Lcom/hmobile/model/BookInfo;
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .local v0, "book":Lcom/hmobile/model/BookInfo;
    if-eqz v0, :cond_0

    .line 84
    .end local v0    # "book":Lcom/hmobile/model/BookInfo;
    :goto_0
    return-object v0

    .line 81
    :catch_0
    move-exception v1

    .line 82
    .local v1, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v1}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    .line 84
    .end local v1    # "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static getBookList()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/BookInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 145
    const/4 v2, 0x0

    .line 147
    .local v2, "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/BookInfo;>;"
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v4

    .line 148
    const-class v5, Lcom/hmobile/model/BookInfo;

    .line 147
    invoke-virtual {v4, v5}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findAll(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v1

    .line 149
    .local v1, "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/BookInfo;>;"
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .end local v2    # "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/BookInfo;>;"
    .local v3, "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/BookInfo;>;"
    move-object v2, v3

    .line 153
    .end local v1    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/BookInfo;>;"
    .end local v3    # "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/BookInfo;>;"
    .restart local v2    # "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/BookInfo;>;"
    :goto_0
    return-object v2

    .line 150
    :catch_0
    move-exception v0

    .line 151
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_0
.end method

.method public static getBookNameByBookid(J)Ljava/lang/String;
    .locals 6
    .param p0, "book_id"    # J

    .prologue
    .line 60
    const-string v0, ""

    .line 62
    .local v0, "Name":Ljava/lang/String;
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v3

    .line 63
    const-class v4, Lcom/hmobile/model/BookInfo;

    .line 62
    invoke-virtual {v3, v4, p0, p1}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findByID(Ljava/lang/Class;J)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v1

    check-cast v1, Lcom/hmobile/model/BookInfo;

    .line 64
    .local v1, "book":Lcom/hmobile/model/BookInfo;
    if-eqz v1, :cond_0

    .line 65
    iget-object v3, v1, Lcom/hmobile/model/BookInfo;->BookName:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 69
    .end local v1    # "book":Lcom/hmobile/model/BookInfo;
    :cond_0
    :goto_0
    return-object v0

    .line 66
    :catch_0
    move-exception v2

    .line 67
    .local v2, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v2}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_0
.end method

.method public static getBookbyPage(II)Ljava/util/ArrayList;
    .locals 8
    .param p0, "book_id"    # I
    .param p1, "chap_number"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/VerseInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 26
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v2

    .line 27
    const-class v3, Lcom/hmobile/model/VerseInfo;

    .line 28
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "BookId"

    invoke-static {v5}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, "=? and "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 29
    const-string v5, "ChapterNumber"

    invoke-static {v5}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 30
    const-string v5, "=?"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 28
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 31
    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v6, 0x1

    .line 32
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    .line 26
    invoke-virtual {v2, v3, v4, v5}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->find(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 33
    .local v1, "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/VerseInfo;>;"
    check-cast v1, Ljava/util/ArrayList;
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .end local v1    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/VerseInfo;>;"
    :goto_0
    return-object v1

    .line 35
    :catch_0
    move-exception v0

    .line 36
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    .line 39
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public static getTodayBook()Lcom/hmobile/model/BookInfo;
    .locals 4

    .prologue
    .line 175
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v2

    .line 176
    const-class v3, Lcom/hmobile/model/BookInfo;

    .line 175
    invoke-virtual {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getRandom(Ljava/lang/Class;)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v0

    check-cast v0, Lcom/hmobile/model/BookInfo;
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    .local v0, "book":Lcom/hmobile/model/BookInfo;
    if-eqz v0, :cond_0

    .line 183
    .end local v0    # "book":Lcom/hmobile/model/BookInfo;
    :goto_0
    return-object v0

    .line 180
    :catch_0
    move-exception v1

    .line 181
    .local v1, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v1}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    .line 183
    .end local v1    # "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static getTodayVerse()Lcom/hmobile/model/TodayVerseInfo;
    .locals 7

    .prologue
    .line 91
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    .line 92
    const v6, 0x7f0700c0

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 93
    .local v1, "onoff":Ljava/lang/String;
    const-string v5, "on"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 94
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->LocalConnection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v5

    const-class v6, Lcom/hmobile/model/TodayVerseInfo;

    invoke-virtual {v5, v6}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findAll(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v3

    .line 95
    .local v3, "tt":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/TodayVerseInfo;>;"
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->LocalConnection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v5

    .line 96
    const-class v6, Lcom/hmobile/model/TodayVerseInfo;

    .line 95
    invoke-virtual {v5, v6}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getRandom(Ljava/lang/Class;)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v4

    check-cast v4, Lcom/hmobile/model/TodayVerseInfo;

    .line 97
    .local v4, "verse":Lcom/hmobile/model/TodayVerseInfo;
    if-eqz v4, :cond_1

    .line 117
    .end local v3    # "tt":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/TodayVerseInfo;>;"
    .end local v4    # "verse":Lcom/hmobile/model/TodayVerseInfo;
    :goto_0
    return-object v4

    .line 101
    :cond_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->LocalConnection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v5

    const-class v6, Lcom/hmobile/model/TodayVerseInfo;

    invoke-virtual {v5, v6}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->newEntity(Ljava/lang/Class;)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v2

    check-cast v2, Lcom/hmobile/model/TodayVerseInfo;

    .line 102
    .local v2, "tinfo":Lcom/hmobile/model/TodayVerseInfo;
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v5

    .line 103
    const-class v6, Lcom/hmobile/model/VerseInfo;

    .line 102
    invoke-virtual {v5, v6}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->getRandom(Ljava/lang/Class;)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v4

    check-cast v4, Lcom/hmobile/model/VerseInfo;

    .line 104
    .local v4, "verse":Lcom/hmobile/model/VerseInfo;
    if-eqz v4, :cond_1

    .line 105
    iget v5, v4, Lcom/hmobile/model/VerseInfo;->ChapterNumber:I

    iput v5, v2, Lcom/hmobile/model/TodayVerseInfo;->ChapterNumber:I

    .line 106
    iget v5, v4, Lcom/hmobile/model/VerseInfo;->BookId:I

    iput v5, v2, Lcom/hmobile/model/TodayVerseInfo;->BookId:I

    .line 107
    iget v5, v4, Lcom/hmobile/model/VerseInfo;->VerseNumber:I

    iput v5, v2, Lcom/hmobile/model/TodayVerseInfo;->VerseNumber:I

    .line 108
    iget-object v5, v4, Lcom/hmobile/model/VerseInfo;->Verse:Ljava/lang/String;

    iput-object v5, v2, Lcom/hmobile/model/TodayVerseInfo;->Verse:Ljava/lang/String;

    .line 109
    invoke-virtual {v2}, Lcom/hmobile/model/TodayVerseInfo;->save()J
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v2

    .line 110
    goto :goto_0

    .line 113
    .end local v2    # "tinfo":Lcom/hmobile/model/TodayVerseInfo;
    .end local v4    # "verse":Lcom/hmobile/model/VerseInfo;
    :catch_0
    move-exception v0

    .line 114
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    .line 117
    .end local v0    # "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    :cond_1
    const/4 v4, 0x0

    goto :goto_0
.end method

.method public static getTotalChapterCountBybookid(J)I
    .locals 6
    .param p0, "book_id"    # J

    .prologue
    .line 44
    const/4 v1, 0x0

    .line 46
    .local v1, "count":I
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v3

    .line 47
    const-class v4, Lcom/hmobile/model/BookInfo;

    .line 46
    invoke-virtual {v3, v4, p0, p1}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findByID(Ljava/lang/Class;J)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v0

    check-cast v0, Lcom/hmobile/model/BookInfo;

    .line 49
    .local v0, "book":Lcom/hmobile/model/BookInfo;
    iget v1, v0, Lcom/hmobile/model/BookInfo;->ChapterCount:I
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .end local v0    # "book":Lcom/hmobile/model/BookInfo;
    :goto_0
    return v1

    .line 51
    :catch_0
    move-exception v2

    .line 52
    .local v2, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v2}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_0
.end method

.method public static getVerseCountByBookAndChapId(II)I
    .locals 2
    .param p0, "bookid"    # I
    .param p1, "chap_id"    # I

    .prologue
    .line 158
    const/4 v0, 0x0

    .line 159
    .local v0, "i":I
    invoke-static {p0, p1}, Lcom/hmobile/model/BookInfo;->getBookbyPage(II)Ljava/util/ArrayList;

    move-result-object v1

    .line 160
    .local v1, "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/VerseInfo;>;"
    if-eqz v1, :cond_0

    .line 161
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 163
    :cond_0
    return v0
.end method
