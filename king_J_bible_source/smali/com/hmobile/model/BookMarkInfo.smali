.class public Lcom/hmobile/model/BookMarkInfo;
.super Lcom/hmobile/activerecorbase/ActiveRecordBase;
.source "BookMarkInfo.java"


# instance fields
.field public Lable:Ljava/lang/String;

.field public Name:Ljava/lang/String;

.field public Verse:Ljava/lang/String;

.field public backColor:I

.field public book_id:I

.field public chap_number:I

.field public date:J

.field public isBackColor:Z

.field public verse_id:I


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 14
    invoke-direct {p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;-><init>()V

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/model/BookMarkInfo;->Lable:Ljava/lang/String;

    .line 19
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/model/BookMarkInfo;->Name:Ljava/lang/String;

    .line 20
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/model/BookMarkInfo;->Verse:Ljava/lang/String;

    .line 21
    iput v2, p0, Lcom/hmobile/model/BookMarkInfo;->book_id:I

    .line 22
    iput v2, p0, Lcom/hmobile/model/BookMarkInfo;->chap_number:I

    .line 23
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/hmobile/model/BookMarkInfo;->date:J

    .line 24
    iput v2, p0, Lcom/hmobile/model/BookMarkInfo;->verse_id:I

    .line 25
    iput-boolean v3, p0, Lcom/hmobile/model/BookMarkInfo;->isBackColor:Z

    .line 26
    iput v3, p0, Lcom/hmobile/model/BookMarkInfo;->backColor:I

    .line 16
    return-void
.end method

.method public static SaveBookMark(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZI)V
    .locals 4
    .param p0, "bookno"    # I
    .param p1, "chap_no"    # I
    .param p2, "lable"    # Ljava/lang/String;
    .param p3, "Name"    # Ljava/lang/String;
    .param p4, "verse"    # Ljava/lang/String;
    .param p5, "verse_count"    # I
    .param p6, "isbackcolor"    # Z
    .param p7, "color"    # I

    .prologue
    .line 33
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->LocalConnection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v2

    .line 34
    const-class v3, Lcom/hmobile/model/BookMarkInfo;

    invoke-virtual {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->newEntity(Ljava/lang/Class;)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v0

    check-cast v0, Lcom/hmobile/model/BookMarkInfo;

    .line 35
    .local v0, "bookmark":Lcom/hmobile/model/BookMarkInfo;
    iput p0, v0, Lcom/hmobile/model/BookMarkInfo;->book_id:I

    .line 36
    iput p1, v0, Lcom/hmobile/model/BookMarkInfo;->chap_number:I

    .line 37
    iput-object p2, v0, Lcom/hmobile/model/BookMarkInfo;->Lable:Ljava/lang/String;

    .line 38
    iput-object p3, v0, Lcom/hmobile/model/BookMarkInfo;->Name:Ljava/lang/String;

    .line 39
    iput-object p4, v0, Lcom/hmobile/model/BookMarkInfo;->Verse:Ljava/lang/String;

    .line 40
    iput p5, v0, Lcom/hmobile/model/BookMarkInfo;->verse_id:I

    .line 41
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/hmobile/model/BookMarkInfo;->date:J

    .line 42
    iput-boolean p6, v0, Lcom/hmobile/model/BookMarkInfo;->isBackColor:Z

    .line 43
    iput p7, v0, Lcom/hmobile/model/BookMarkInfo;->backColor:I

    .line 44
    invoke-virtual {v0}, Lcom/hmobile/model/BookMarkInfo;->save()J
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .end local v0    # "bookmark":Lcom/hmobile/model/BookMarkInfo;
    :goto_0
    return-void

    .line 45
    :catch_0
    move-exception v1

    .line 46
    .local v1, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v1}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_0
.end method

.method public static copyBookmarks()V
    .locals 8

    .prologue
    .line 111
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->LocalConnection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v5

    const-class v6, Lcom/hmobile/model/BookMarkInfo;

    invoke-virtual {v5, v6}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findAll(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v3

    .line 112
    .local v3, "locallst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/BookMarkInfo;>;"
    if-eqz v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    if-gtz v5, :cond_1

    .line 113
    :cond_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v5

    .line 114
    const-class v6, Lcom/hmobile/model/BookMarkInfo;

    invoke-virtual {v5, v6}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findAll(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v4

    .line 115
    .local v4, "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/BookMarkInfo;>;"
    if-eqz v4, :cond_1

    .line 116
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_2

    .line 126
    .end local v4    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/BookMarkInfo;>;"
    :cond_1
    :goto_1
    return-void

    .line 116
    .restart local v4    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/BookMarkInfo;>;"
    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/hmobile/model/BookMarkInfo;

    .line 117
    .local v0, "bookMarkInfo":Lcom/hmobile/model/BookMarkInfo;
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->LocalConnection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v6

    const-class v7, Lcom/hmobile/model/BookMarkInfo;

    invoke-virtual {v6, v7}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->newEntity(Ljava/lang/Class;)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v2

    check-cast v2, Lcom/hmobile/model/BookMarkInfo;

    .line 118
    .local v2, "info":Lcom/hmobile/model/BookMarkInfo;
    invoke-virtual {v2, v0}, Lcom/hmobile/model/BookMarkInfo;->copyFrom(Ljava/lang/Object;)V

    .line 119
    invoke-virtual {v2}, Lcom/hmobile/model/BookMarkInfo;->save()J
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 123
    .end local v0    # "bookMarkInfo":Lcom/hmobile/model/BookMarkInfo;
    .end local v2    # "info":Lcom/hmobile/model/BookMarkInfo;
    .end local v4    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/BookMarkInfo;>;"
    :catch_0
    move-exception v1

    .line 124
    .local v1, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v1}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_1
.end method

.method public static getAllBookMark()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/BookMarkInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 59
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .local v3, "m_bookmark":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/BookMarkInfo;>;"
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->LocalConnection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v4

    .line 62
    const-class v5, Lcom/hmobile/model/BookMarkInfo;

    .line 61
    invoke-virtual {v4, v5}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findAll(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    .line 63
    .local v2, "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/BookMarkInfo;>;"
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_0

    .line 64
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_1

    .line 71
    .end local v2    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/BookMarkInfo;>;"
    :cond_0
    :goto_1
    return-object v3

    .line 64
    .restart local v2    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/BookMarkInfo;>;"
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/hmobile/model/BookMarkInfo;

    .line 65
    .local v0, "b":Lcom/hmobile/model/BookMarkInfo;
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 68
    .end local v0    # "b":Lcom/hmobile/model/BookMarkInfo;
    .end local v2    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/BookMarkInfo;>;"
    :catch_0
    move-exception v1

    .line 69
    .local v1, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v1}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_1
.end method

.method public static getBookMarkInfoById(J)Lcom/hmobile/model/BookMarkInfo;
    .locals 4
    .param p0, "id"    # J

    .prologue
    .line 76
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->LocalConnection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v2

    .line 77
    const-class v3, Lcom/hmobile/model/BookMarkInfo;

    .line 76
    invoke-virtual {v2, v3, p0, p1}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findByID(Ljava/lang/Class;J)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v0

    check-cast v0, Lcom/hmobile/model/BookMarkInfo;
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    :goto_0
    return-object v0

    .line 79
    :catch_0
    move-exception v1

    .line 80
    .local v1, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v1}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    .line 82
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static getBookMarkInfoByPageNumber(II)Ljava/util/ArrayList;
    .locals 10
    .param p0, "book_id"    # I
    .param p1, "chap_id"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/BookMarkInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 87
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .local v3, "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/BookMarkInfo;>;"
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->LocalConnection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v4

    .line 90
    const-class v5, Lcom/hmobile/model/BookMarkInfo;

    .line 91
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "book_id"

    invoke-static {v7}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v7, "=? and "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 92
    const-string v7, "chap_number"

    invoke-static {v7}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 93
    const-string v7, "=?"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 91
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 94
    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/String;

    const/4 v8, 0x0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v7, v8

    const/4 v8, 0x1

    .line 95
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v7, v8

    .line 89
    invoke-virtual {v4, v5, v6, v7}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->find(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 96
    .local v2, "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/BookMarkInfo;>;"
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_0

    .line 97
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_1

    .line 105
    .end local v2    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/BookMarkInfo;>;"
    :cond_0
    :goto_1
    return-object v3

    .line 97
    .restart local v2    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/BookMarkInfo;>;"
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/hmobile/model/BookMarkInfo;

    .line 98
    .local v0, "bookMarkInfo":Lcom/hmobile/model/BookMarkInfo;
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 102
    .end local v0    # "bookMarkInfo":Lcom/hmobile/model/BookMarkInfo;
    .end local v2    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/BookMarkInfo;>;"
    :catch_0
    move-exception v1

    .line 103
    .local v1, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v1}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_1
.end method

.method public static getStringFromArray(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 51
    .local p0, "m_bookmark":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const-string v0, ""

    .line 52
    .local v0, "verse":Ljava/lang/String;
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 53
    invoke-static {}, Lcom/hmobile/common/Utils;->Instance()Lcom/hmobile/common/Utils;

    move-result-object v1

    const-string v2, "###"

    invoke-virtual {v1, p0, v2}, Lcom/hmobile/common/Utils;->join(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 55
    :cond_0
    return-object v0
.end method
