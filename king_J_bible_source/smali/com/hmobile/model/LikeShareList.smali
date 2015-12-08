.class public Lcom/hmobile/model/LikeShareList;
.super Ljava/lang/Object;
.source "LikeShareList.java"


# static fields
.field private static volatile _instance:Lcom/hmobile/model/LikeShareList;


# instance fields
.field protected m_modelLikeList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/LikeShareInfo;",
            ">;"
        }
    .end annotation
.end field

.field protected m_modelShareList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/LikeShareInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 11
    const/4 v0, 0x0

    sput-object v0, Lcom/hmobile/model/LikeShareList;->_instance:Lcom/hmobile/model/LikeShareList;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object v0, p0, Lcom/hmobile/model/LikeShareList;->m_modelLikeList:Ljava/util/ArrayList;

    .line 13
    iput-object v0, p0, Lcom/hmobile/model/LikeShareList;->m_modelShareList:Ljava/util/ArrayList;

    .line 9
    return-void
.end method

.method public static Instance()Lcom/hmobile/model/LikeShareList;
    .locals 2

    .prologue
    .line 16
    sget-object v0, Lcom/hmobile/model/LikeShareList;->_instance:Lcom/hmobile/model/LikeShareList;

    if-nez v0, :cond_0

    .line 17
    const-class v1, Lcom/hmobile/model/LikeShareList;

    monitor-enter v1

    .line 18
    :try_start_0
    new-instance v0, Lcom/hmobile/model/LikeShareList;

    invoke-direct {v0}, Lcom/hmobile/model/LikeShareList;-><init>()V

    sput-object v0, Lcom/hmobile/model/LikeShareList;->_instance:Lcom/hmobile/model/LikeShareList;

    .line 17
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    :cond_0
    sget-object v0, Lcom/hmobile/model/LikeShareList;->_instance:Lcom/hmobile/model/LikeShareList;

    return-object v0

    .line 17
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public clearList()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 102
    iput-object v0, p0, Lcom/hmobile/model/LikeShareList;->m_modelLikeList:Ljava/util/ArrayList;

    .line 103
    iput-object v0, p0, Lcom/hmobile/model/LikeShareList;->m_modelShareList:Ljava/util/ArrayList;

    .line 104
    return-void
.end method

.method public getAllLike(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 8
    .param p1, "url"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/LikeShareInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 25
    iget-object v4, p0, Lcom/hmobile/model/LikeShareList;->m_modelLikeList:Ljava/util/ArrayList;

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/hmobile/model/LikeShareList;->m_modelLikeList:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-gtz v4, :cond_2

    .line 26
    :cond_0
    invoke-static {}, Lcom/hmobile/model/ServiceHelper;->Instance()Lcom/hmobile/model/ServiceHelper;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/hmobile/model/ServiceHelper;->call(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 27
    .local v2, "response":Ljava/lang/String;
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_2

    .line 28
    invoke-static {v2}, Lcom/hmobile/model/LikeShareInfo;->parse(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    iput-object v4, p0, Lcom/hmobile/model/LikeShareList;->m_modelLikeList:Ljava/util/ArrayList;

    .line 29
    iget-object v4, p0, Lcom/hmobile/model/LikeShareList;->m_modelLikeList:Ljava/util/ArrayList;

    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/hmobile/model/LikeShareList;->m_modelLikeList:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_2

    .line 30
    iget-object v4, p0, Lcom/hmobile/model/LikeShareList;->m_modelLikeList:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_3

    .line 59
    .end local v2    # "response":Ljava/lang/String;
    :cond_2
    iget-object v4, p0, Lcom/hmobile/model/LikeShareList;->m_modelLikeList:Ljava/util/ArrayList;

    return-object v4

    .line 30
    .restart local v2    # "response":Ljava/lang/String;
    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/hmobile/model/LikeShareInfo;

    .line 31
    .local v1, "i":Lcom/hmobile/model/LikeShareInfo;
    iget-object v5, v1, Lcom/hmobile/model/LikeShareInfo;->verseinfo:Ljava/lang/String;

    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 32
    iget-object v5, v1, Lcom/hmobile/model/LikeShareInfo;->book:Ljava/lang/String;

    invoke-static {v5}, Lcom/hmobile/model/BookInfo;->getBookIdByName(Ljava/lang/String;)I

    move-result v0

    .line 33
    .local v0, "bookid":I
    if-eqz v0, :cond_1

    .line 36
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 37
    iget-object v6, v1, Lcom/hmobile/model/LikeShareInfo;->chapter:Ljava/lang/String;

    iget-object v7, v1, Lcom/hmobile/model/LikeShareInfo;->verse:Ljava/lang/String;

    .line 35
    invoke-static {v5, v6, v7}, Lcom/hmobile/model/VerseInfo;->getVerseStringByBookAndChapter(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 38
    .local v3, "v":Ljava/lang/String;
    if-eqz v3, :cond_1

    .line 39
    iput-object v3, v1, Lcom/hmobile/model/LikeShareInfo;->verseinfo:Ljava/lang/String;

    goto :goto_0
.end method

.method public getAllShare(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 8
    .param p1, "url"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/hmobile/model/LikeShareInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 63
    iget-object v4, p0, Lcom/hmobile/model/LikeShareList;->m_modelShareList:Ljava/util/ArrayList;

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/hmobile/model/LikeShareList;->m_modelShareList:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-gtz v4, :cond_2

    .line 64
    :cond_0
    invoke-static {}, Lcom/hmobile/model/ServiceHelper;->Instance()Lcom/hmobile/model/ServiceHelper;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/hmobile/model/ServiceHelper;->call(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 65
    .local v2, "response":Ljava/lang/String;
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_2

    .line 66
    invoke-static {v2}, Lcom/hmobile/model/LikeShareInfo;->parse(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    iput-object v4, p0, Lcom/hmobile/model/LikeShareList;->m_modelShareList:Ljava/util/ArrayList;

    .line 67
    iget-object v4, p0, Lcom/hmobile/model/LikeShareList;->m_modelShareList:Ljava/util/ArrayList;

    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/hmobile/model/LikeShareList;->m_modelShareList:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_2

    .line 68
    iget-object v4, p0, Lcom/hmobile/model/LikeShareList;->m_modelShareList:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_3

    .line 98
    .end local v2    # "response":Ljava/lang/String;
    :cond_2
    iget-object v4, p0, Lcom/hmobile/model/LikeShareList;->m_modelShareList:Ljava/util/ArrayList;

    return-object v4

    .line 68
    .restart local v2    # "response":Ljava/lang/String;
    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/hmobile/model/LikeShareInfo;

    .line 69
    .local v1, "i":Lcom/hmobile/model/LikeShareInfo;
    iget-object v5, v1, Lcom/hmobile/model/LikeShareInfo;->verseinfo:Ljava/lang/String;

    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 70
    iget-object v5, v1, Lcom/hmobile/model/LikeShareInfo;->book:Ljava/lang/String;

    invoke-static {v5}, Lcom/hmobile/model/BookInfo;->getBookIdByName(Ljava/lang/String;)I

    move-result v0

    .line 71
    .local v0, "bookid":I
    if-eqz v0, :cond_1

    .line 74
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 75
    iget-object v6, v1, Lcom/hmobile/model/LikeShareInfo;->chapter:Ljava/lang/String;

    iget-object v7, v1, Lcom/hmobile/model/LikeShareInfo;->verse:Ljava/lang/String;

    .line 73
    invoke-static {v5, v6, v7}, Lcom/hmobile/model/VerseInfo;->getVerseStringByBookAndChapter(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 76
    .local v3, "v":Ljava/lang/String;
    if-eqz v3, :cond_1

    .line 77
    iput-object v3, v1, Lcom/hmobile/model/LikeShareInfo;->verseinfo:Ljava/lang/String;

    goto :goto_0
.end method
