.class public Lcom/hmobile/model/VerseInfo;
.super Lcom/hmobile/activerecorbase/ActiveRecordBase;
.source "VerseInfo.java"


# instance fields
.field public BookId:I

.field public ChapterNumber:I

.field public Verse:Ljava/lang/String;

.field public VerseNumber:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 11
    invoke-direct {p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;-><init>()V

    .line 13
    iput v0, p0, Lcom/hmobile/model/VerseInfo;->ChapterNumber:I

    .line 14
    iput v0, p0, Lcom/hmobile/model/VerseInfo;->BookId:I

    .line 15
    iput v0, p0, Lcom/hmobile/model/VerseInfo;->VerseNumber:I

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/model/VerseInfo;->Verse:Ljava/lang/String;

    .line 11
    return-void
.end method

.method public static getVerseByBookAndChapNumber(II)Ljava/util/ArrayList;
    .locals 10
    .param p0, "bookid"    # I
    .param p1, "chap_no"    # I
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
    .line 42
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .local v2, "m_final":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/VerseInfo;>;"
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v4

    .line 46
    const-class v5, Lcom/hmobile/model/VerseInfo;

    .line 47
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "BookId"

    invoke-static {v7}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v7, "=? and "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 48
    const-string v7, "ChapterNumber"

    invoke-static {v7}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 49
    const-string v7, "=?"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 47
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 49
    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/String;

    const/4 v8, 0x0

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v7, v8

    const/4 v8, 0x1

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v7, v8

    .line 45
    invoke-virtual {v4, v5, v6, v7}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->find(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 50
    .local v1, "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/VerseInfo;>;"
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_0

    .line 51
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .end local v2    # "m_final":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/VerseInfo;>;"
    .local v3, "m_final":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/VerseInfo;>;"
    move-object v2, v3

    .line 56
    .end local v1    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/VerseInfo;>;"
    .end local v3    # "m_final":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/VerseInfo;>;"
    .restart local v2    # "m_final":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/VerseInfo;>;"
    :cond_0
    :goto_0
    return-object v2

    .line 53
    :catch_0
    move-exception v0

    .line 54
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_0
.end method

.method public static getVerseByBookId(I)Ljava/util/ArrayList;
    .locals 8
    .param p0, "book_id"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/VerseInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 138
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v2

    .line 139
    const-class v3, Lcom/hmobile/model/VerseInfo;

    .line 140
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "BookId"

    invoke-static {v5}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, "=?"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 141
    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    .line 138
    invoke-virtual {v2, v3, v4, v5}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->find(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 142
    .local v1, "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/VerseInfo;>;"
    check-cast v1, Ljava/util/ArrayList;
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    .end local v1    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/VerseInfo;>;"
    :goto_0
    return-object v1

    .line 144
    :catch_0
    move-exception v0

    .line 145
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    .line 148
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public static getVerseByBookbySearchWord(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 9
    .param p0, "word"    # Ljava/lang/String;
    .param p1, "bookname"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/VerseInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 85
    const/4 v3, 0x0

    .line 86
    .local v3, "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/VerseInfo;>;"
    invoke-static {p1}, Lcom/hmobile/model/BookInfo;->getBookIdByName(Ljava/lang/String;)I

    move-result v1

    .line 94
    .local v1, "id":I
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v5

    .line 95
    const-class v6, Lcom/hmobile/model/VerseInfo;

    .line 96
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "BOOK_ID="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " AND VERSE like \'%"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "%\'"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    .line 94
    invoke-virtual {v5, v6, v7, v8}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->find(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 97
    .local v2, "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/VerseInfo;>;"
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .end local v3    # "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/VerseInfo;>;"
    .local v4, "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/VerseInfo;>;"
    move-object v3, v4

    .line 106
    .end local v2    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/VerseInfo;>;"
    .end local v4    # "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/VerseInfo;>;"
    .restart local v3    # "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/VerseInfo;>;"
    :goto_0
    return-object v3

    .line 103
    :catch_0
    move-exception v0

    .line 104
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_0
.end method

.method public static getVerseBySearchWord(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 12
    .param p0, "word"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/VerseInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 19
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .local v5, "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/VerseInfo;>;"
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v6

    .line 22
    const-class v7, Lcom/hmobile/model/VerseInfo;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Verse like \'%"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "%\'"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    .line 21
    invoke-virtual {v6, v7, v8, v9}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->find(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 24
    .local v2, "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/VerseInfo;>;"
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 25
    invoke-static {}, Lcom/hmobile/model/BookInfo;->getBookList()Ljava/util/ArrayList;

    move-result-object v4

    .line 26
    .local v4, "m_booklist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/BookInfo;>;"
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_1

    .line 37
    .end local v2    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/VerseInfo;>;"
    .end local v4    # "m_booklist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/BookInfo;>;"
    :goto_1
    return-object v5

    .line 26
    .restart local v2    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/VerseInfo;>;"
    .restart local v4    # "m_booklist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/BookInfo;>;"
    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/hmobile/model/BookInfo;

    .line 27
    .local v0, "bookInfo":Lcom/hmobile/model/BookInfo;
    iget-object v7, v0, Lcom/hmobile/model/BookInfo;->BookName:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 28
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v7

    .line 29
    const-class v8, Lcom/hmobile/model/VerseInfo;

    .line 30
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "BOOK_ID="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/hmobile/model/BookInfo;->getID()J

    move-result-wide v10

    invoke-virtual {v9, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    .line 29
    invoke-virtual {v7, v8, v9, v10}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->find(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 31
    .local v3, "lst1":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/VerseInfo;>;"
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 34
    .end local v0    # "bookInfo":Lcom/hmobile/model/BookInfo;
    .end local v2    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/VerseInfo;>;"
    .end local v3    # "lst1":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/VerseInfo;>;"
    .end local v4    # "m_booklist":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/BookInfo;>;"
    :catch_0
    move-exception v1

    .line 35
    .local v1, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v1}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_1
.end method

.method public static getVerseInfoByDB_id(J)Lcom/hmobile/model/VerseInfo;
    .locals 4
    .param p0, "verse_id"    # J

    .prologue
    .line 111
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v2

    .line 112
    const-class v3, Lcom/hmobile/model/VerseInfo;

    .line 111
    invoke-virtual {v2, v3, p0, p1}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findByID(Ljava/lang/Class;J)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v1

    check-cast v1, Lcom/hmobile/model/VerseInfo;
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    .local v1, "verse":Lcom/hmobile/model/VerseInfo;
    if-eqz v1, :cond_0

    .line 120
    .end local v1    # "verse":Lcom/hmobile/model/VerseInfo;
    :goto_0
    return-object v1

    .line 117
    :catch_0
    move-exception v0

    .line 118
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    .line 120
    .end local v0    # "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public static getVerseInfoByVerse(Ljava/lang/String;)Lcom/hmobile/model/VerseInfo;
    .locals 7
    .param p0, "verse"    # Ljava/lang/String;

    .prologue
    .line 179
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v2

    .line 180
    const-class v3, Lcom/hmobile/model/VerseInfo;

    .line 181
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Verse"

    invoke-static {v5}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, "=?"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 182
    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    aput-object p0, v5, v6

    .line 179
    invoke-virtual {v2, v3, v4, v5}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->find(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 183
    .local v1, "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/VerseInfo;>;"
    if-eqz v1, :cond_0

    .line 184
    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/hmobile/model/VerseInfo;
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .line 189
    .end local v1    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/VerseInfo;>;"
    :goto_0
    return-object v2

    .line 186
    :catch_0
    move-exception v0

    .line 187
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    .line 189
    .end local v0    # "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method

.method public static getVerseInfoByVerseNumber(ILjava/util/ArrayList;)Lcom/hmobile/model/VerseInfo;
    .locals 4
    .param p0, "verse_number"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/VerseInfo;",
            ">;)",
            "Lcom/hmobile/model/VerseInfo;"
        }
    .end annotation

    .prologue
    .line 126
    .local p1, "m_verse":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/VerseInfo;>;"
    const/4 v0, 0x0

    .line 127
    .local v0, "info":Lcom/hmobile/model/VerseInfo;
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    .line 132
    return-object v0

    .line 127
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/hmobile/model/VerseInfo;

    .line 128
    .local v1, "v":Lcom/hmobile/model/VerseInfo;
    iget v3, v1, Lcom/hmobile/model/VerseInfo;->VerseNumber:I

    if-ne v3, p0, :cond_0

    .line 129
    move-object v0, v1

    goto :goto_0
.end method

.method public static getVerseStringByBookAndChapter(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .param p0, "book_id"    # Ljava/lang/String;
    .param p1, "chap_id"    # Ljava/lang/String;
    .param p2, "verse_id"    # Ljava/lang/String;

    .prologue
    .line 155
    :try_start_0
    const-string v2, ""

    .line 156
    .local v2, "verse":Ljava/lang/String;
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v3

    .line 157
    const-class v4, Lcom/hmobile/model/VerseInfo;

    .line 158
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "BookId"

    invoke-static {v6}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v6, "=? and "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 159
    const-string v6, "ChapterNumber"

    invoke-static {v6}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 160
    const-string v6, "=? and "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 161
    const-string v6, "VerseNumber"

    invoke-static {v6}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 162
    const-string v6, "=? "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 158
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 163
    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/String;

    const/4 v7, 0x0

    aput-object p0, v6, v7

    const/4 v7, 0x1

    aput-object p1, v6, v7

    const/4 v7, 0x2

    aput-object p2, v6, v7

    .line 156
    invoke-virtual {v3, v4, v5, v6}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->find(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 164
    .local v1, "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/VerseInfo;>;"
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_0

    .line 165
    const/4 v3, 0x0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/hmobile/model/VerseInfo;

    iget-object v2, v3, Lcom/hmobile/model/VerseInfo;->Verse:Ljava/lang/String;
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .line 173
    .end local v1    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/VerseInfo;>;"
    .end local v2    # "verse":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object v2

    .line 169
    :catch_0
    move-exception v0

    .line 170
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    .line 173
    const/4 v2, 0x0

    goto :goto_0
.end method
