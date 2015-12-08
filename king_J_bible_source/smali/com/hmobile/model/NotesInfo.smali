.class public Lcom/hmobile/model/NotesInfo;
.super Lcom/hmobile/activerecorbase/ActiveRecordBase;
.source "NotesInfo.java"


# instance fields
.field public Lable:Ljava/lang/String;

.field public Title:Ljava/lang/String;

.field public Verse:Ljava/lang/String;

.field public book_id:I

.field public chap_number:I

.field public date:J

.field public verse_id:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 14
    invoke-direct {p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;-><init>()V

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/model/NotesInfo;->Lable:Ljava/lang/String;

    .line 19
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/model/NotesInfo;->Title:Ljava/lang/String;

    .line 20
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/model/NotesInfo;->Verse:Ljava/lang/String;

    .line 21
    iput v1, p0, Lcom/hmobile/model/NotesInfo;->book_id:I

    .line 22
    iput v1, p0, Lcom/hmobile/model/NotesInfo;->chap_number:I

    .line 23
    iput v1, p0, Lcom/hmobile/model/NotesInfo;->verse_id:I

    .line 24
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/hmobile/model/NotesInfo;->date:J

    .line 16
    return-void
.end method

.method public static SaveNotes(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 4
    .param p0, "bookno"    # I
    .param p1, "chap_no"    # I
    .param p2, "lable"    # Ljava/lang/String;
    .param p3, "title"    # Ljava/lang/String;
    .param p4, "verse"    # Ljava/lang/String;
    .param p5, "verse_count"    # I

    .prologue
    .line 30
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->LocalConnection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v2

    .line 31
    const-class v3, Lcom/hmobile/model/NotesInfo;

    invoke-virtual {v2, v3}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->newEntity(Ljava/lang/Class;)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v1

    check-cast v1, Lcom/hmobile/model/NotesInfo;

    .line 32
    .local v1, "note":Lcom/hmobile/model/NotesInfo;
    iput-object p3, v1, Lcom/hmobile/model/NotesInfo;->Title:Ljava/lang/String;

    .line 33
    iput-object p2, v1, Lcom/hmobile/model/NotesInfo;->Lable:Ljava/lang/String;

    .line 34
    iput-object p4, v1, Lcom/hmobile/model/NotesInfo;->Verse:Ljava/lang/String;

    .line 35
    iput p0, v1, Lcom/hmobile/model/NotesInfo;->book_id:I

    .line 36
    iput p1, v1, Lcom/hmobile/model/NotesInfo;->chap_number:I

    .line 37
    iput p5, v1, Lcom/hmobile/model/NotesInfo;->verse_id:I

    .line 38
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/hmobile/model/NotesInfo;->date:J

    .line 39
    invoke-virtual {v1}, Lcom/hmobile/model/NotesInfo;->save()J
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .end local v1    # "note":Lcom/hmobile/model/NotesInfo;
    :goto_0
    return-void

    .line 40
    :catch_0
    move-exception v0

    .line 41
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_0
.end method

.method public static getAllNotes()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/NotesInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 54
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .local v3, "m_notes":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/NotesInfo;>;"
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->LocalConnection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v4

    .line 57
    const-class v5, Lcom/hmobile/model/NotesInfo;

    .line 56
    invoke-virtual {v4, v5}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findAll(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    .line 58
    .local v2, "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/NotesInfo;>;"
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_0

    .line 59
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_1

    .line 66
    .end local v2    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/NotesInfo;>;"
    :cond_0
    :goto_1
    return-object v3

    .line 59
    .restart local v2    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/NotesInfo;>;"
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/hmobile/model/NotesInfo;

    .line 60
    .local v0, "b":Lcom/hmobile/model/NotesInfo;
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 63
    .end local v0    # "b":Lcom/hmobile/model/NotesInfo;
    .end local v2    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/NotesInfo;>;"
    :catch_0
    move-exception v1

    .line 64
    .local v1, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v1}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_1
.end method

.method public static getNotesInfoById(J)Lcom/hmobile/model/NotesInfo;
    .locals 4
    .param p0, "id"    # J

    .prologue
    .line 71
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->LocalConnection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v2

    .line 72
    const-class v3, Lcom/hmobile/model/NotesInfo;

    .line 71
    invoke-virtual {v2, v3, p0, p1}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findByID(Ljava/lang/Class;J)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v1

    check-cast v1, Lcom/hmobile/model/NotesInfo;
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    :goto_0
    return-object v1

    .line 74
    :catch_0
    move-exception v0

    .line 75
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    .line 77
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public static getNotesInfoByPageNumber(II)Ljava/util/ArrayList;
    .locals 10
    .param p0, "book_id"    # I
    .param p1, "chap_id"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/NotesInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 82
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 84
    .local v3, "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/NotesInfo;>;"
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->LocalConnection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v4

    .line 85
    const-class v5, Lcom/hmobile/model/NotesInfo;

    .line 86
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

    .line 87
    const-string v7, "chap_number"

    invoke-static {v7}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 88
    const-string v7, "=?"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 86
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 89
    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/String;

    const/4 v8, 0x0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v7, v8

    const/4 v8, 0x1

    .line 90
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    aput-object v9, v7, v8

    .line 84
    invoke-virtual {v4, v5, v6, v7}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->find(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 91
    .local v2, "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/NotesInfo;>;"
    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_0

    .line 92
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_1

    .line 100
    .end local v2    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/NotesInfo;>;"
    :cond_0
    :goto_1
    return-object v3

    .line 92
    .restart local v2    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/NotesInfo;>;"
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/hmobile/model/NotesInfo;

    .line 93
    .local v0, "bookMarkInfo":Lcom/hmobile/model/NotesInfo;
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 97
    .end local v0    # "bookMarkInfo":Lcom/hmobile/model/NotesInfo;
    .end local v2    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/NotesInfo;>;"
    :catch_0
    move-exception v1

    .line 98
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
    .line 46
    .local p0, "m_notes":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
    const-string v0, ""

    .line 47
    .local v0, "verse":Ljava/lang/String;
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 48
    invoke-static {}, Lcom/hmobile/common/Utils;->Instance()Lcom/hmobile/common/Utils;

    move-result-object v1

    const-string v2, "###"

    invoke-virtual {v1, p0, v2}, Lcom/hmobile/common/Utils;->join(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 50
    :cond_0
    return-object v0
.end method

.method public static isVerseNoted(III)Lcom/hmobile/model/NotesInfo;
    .locals 8
    .param p0, "book_id"    # I
    .param p1, "chap_id"    # I
    .param p2, "verse_id"    # I

    .prologue
    .line 106
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->LocalConnection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v2

    .line 107
    const-class v3, Lcom/hmobile/model/NotesInfo;

    .line 108
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "book_id"

    invoke-static {v5}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, "=? and "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 109
    const-string v5, "chap_number"

    invoke-static {v5}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 110
    const-string v5, "=? and "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 111
    const-string v5, "verse_id"

    invoke-static {v5}, Lcom/hmobile/activerecorbase/CamelNotationHelper;->toSQLName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 112
    const-string v5, "=?"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 108
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 113
    const/4 v5, 0x3

    new-array v5, v5, [Ljava/lang/String;

    const/4 v6, 0x0

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v6, 0x1

    .line 114
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    const/4 v6, 0x2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    .line 106
    invoke-virtual {v2, v3, v4, v5}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->find(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 115
    .local v1, "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/NotesInfo;>;"
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_0

    .line 116
    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/hmobile/model/NotesInfo;
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    .end local v1    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/NotesInfo;>;"
    :goto_0
    return-object v2

    .line 118
    :catch_0
    move-exception v0

    .line 119
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    .line 121
    .end local v0    # "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method
