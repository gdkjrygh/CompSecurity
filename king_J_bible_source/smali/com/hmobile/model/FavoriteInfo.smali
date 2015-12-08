.class public Lcom/hmobile/model/FavoriteInfo;
.super Lcom/hmobile/activerecorbase/ActiveRecordBase;
.source "FavoriteInfo.java"


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

    .line 12
    invoke-direct {p0}, Lcom/hmobile/activerecorbase/ActiveRecordBase;-><init>()V

    .line 16
    iput v0, p0, Lcom/hmobile/model/FavoriteInfo;->ChapterNumber:I

    .line 17
    iput v0, p0, Lcom/hmobile/model/FavoriteInfo;->BookId:I

    .line 18
    iput v0, p0, Lcom/hmobile/model/FavoriteInfo;->VerseNumber:I

    .line 19
    const-string v0, ""

    iput-object v0, p0, Lcom/hmobile/model/FavoriteInfo;->Verse:Ljava/lang/String;

    .line 14
    return-void
.end method

.method public static copyFavs()V
    .locals 8

    .prologue
    .line 55
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->LocalConnection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v5

    const-class v6, Lcom/hmobile/model/FavoriteInfo;

    invoke-virtual {v5, v6}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findAll(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v3

    .line 56
    .local v3, "locallst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/FavoriteInfo;>;"
    if-eqz v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    if-gtz v5, :cond_1

    .line 57
    :cond_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->Connection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v5

    .line 58
    const-class v6, Lcom/hmobile/model/FavoriteInfo;

    invoke-virtual {v5, v6}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findAll(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v4

    .line 59
    .local v4, "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/FavoriteInfo;>;"
    if-eqz v4, :cond_1

    .line 60
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_2

    .line 70
    .end local v4    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/FavoriteInfo;>;"
    :cond_1
    :goto_1
    return-void

    .line 60
    .restart local v4    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/FavoriteInfo;>;"
    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/hmobile/model/FavoriteInfo;

    .line 61
    .local v1, "favoriteInfo":Lcom/hmobile/model/FavoriteInfo;
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->LocalConnection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v6

    const-class v7, Lcom/hmobile/model/FavoriteInfo;

    invoke-virtual {v6, v7}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->newEntity(Ljava/lang/Class;)Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v2

    check-cast v2, Lcom/hmobile/model/FavoriteInfo;

    .line 62
    .local v2, "info":Lcom/hmobile/model/FavoriteInfo;
    invoke-virtual {v2, v1}, Lcom/hmobile/model/FavoriteInfo;->copyFrom(Ljava/lang/Object;)V

    .line 63
    invoke-virtual {v2}, Lcom/hmobile/model/FavoriteInfo;->save()J
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 67
    .end local v1    # "favoriteInfo":Lcom/hmobile/model/FavoriteInfo;
    .end local v2    # "info":Lcom/hmobile/model/FavoriteInfo;
    .end local v4    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/FavoriteInfo;>;"
    :catch_0
    move-exception v0

    .line 68
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_1
.end method

.method public static getAllLocalFavorite()Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/FavoriteInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 41
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .local v2, "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/FavoriteInfo;>;"
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->LocalConnection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v4

    .line 44
    const-class v5, Lcom/hmobile/model/FavoriteInfo;

    .line 43
    invoke-virtual {v4, v5}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findAll(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v1

    .line 45
    .local v1, "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/FavoriteInfo;>;"
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    .end local v2    # "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/FavoriteInfo;>;"
    .local v3, "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/FavoriteInfo;>;"
    move-object v2, v3

    .line 49
    .end local v1    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/FavoriteInfo;>;"
    .end local v3    # "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/FavoriteInfo;>;"
    .restart local v2    # "m_list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/hmobile/model/FavoriteInfo;>;"
    :goto_0
    return-object v2

    .line 46
    :catch_0
    move-exception v0

    .line 47
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_0
.end method

.method public static isExist(Lcom/hmobile/model/VerseInfo;)Z
    .locals 7
    .param p0, "v"    # Lcom/hmobile/model/VerseInfo;

    .prologue
    .line 22
    const/4 v2, 0x0

    .line 24
    .local v2, "isExist":Z
    :try_start_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->LocalConnection()Lcom/hmobile/activerecorbase/ActiveRecordBase;

    move-result-object v4

    .line 25
    const-class v5, Lcom/hmobile/model/FavoriteInfo;

    .line 24
    invoke-virtual {v4, v5}, Lcom/hmobile/activerecorbase/ActiveRecordBase;->findAll(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v3

    .line 27
    .local v3, "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/FavoriteInfo;>;"
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_1

    .line 37
    .end local v3    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/FavoriteInfo;>;"
    :goto_1
    return v2

    .line 27
    .restart local v3    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/FavoriteInfo;>;"
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/hmobile/model/FavoriteInfo;

    .line 28
    .local v1, "f":Lcom/hmobile/model/FavoriteInfo;
    iget v5, v1, Lcom/hmobile/model/FavoriteInfo;->VerseNumber:I

    iget v6, p0, Lcom/hmobile/model/VerseInfo;->VerseNumber:I

    if-ne v5, v6, :cond_0

    iget v5, v1, Lcom/hmobile/model/FavoriteInfo;->BookId:I

    iget v6, p0, Lcom/hmobile/model/VerseInfo;->BookId:I

    if-ne v5, v6, :cond_0

    .line 29
    iget v5, v1, Lcom/hmobile/model/FavoriteInfo;->ChapterNumber:I

    iget v6, p0, Lcom/hmobile/model/VerseInfo;->ChapterNumber:I
    :try_end_0
    .catch Lcom/hmobile/activerecorbase/ActiveRecordException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v5, v6, :cond_0

    .line 30
    const/4 v2, 0x1

    goto :goto_0

    .line 34
    .end local v1    # "f":Lcom/hmobile/model/FavoriteInfo;
    .end local v3    # "lst":Ljava/util/List;, "Ljava/util/List<Lcom/hmobile/model/FavoriteInfo;>;"
    :catch_0
    move-exception v0

    .line 35
    .local v0, "e":Lcom/hmobile/activerecorbase/ActiveRecordException;
    invoke-virtual {v0}, Lcom/hmobile/activerecorbase/ActiveRecordException;->printStackTrace()V

    goto :goto_1
.end method
