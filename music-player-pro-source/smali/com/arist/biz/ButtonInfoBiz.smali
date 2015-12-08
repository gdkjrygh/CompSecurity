.class public Lcom/arist/biz/ButtonInfoBiz;
.super Ljava/lang/Object;
.source "ButtonInfoBiz.java"


# instance fields
.field private btnDes:[Ljava/lang/String;

.field private btnDesNum:[Ljava/lang/String;

.field private btnIcon:[I

.field private btnName:[Ljava/lang/String;

.field private context:Landroid/content/Context;

.field private infos:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/ButtonInfo;",
            ">;"
        }
    .end annotation
.end field

.field private mainPref:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v1, 0x7

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-array v0, v1, [Ljava/lang/String;

    iput-object v0, p0, Lcom/arist/biz/ButtonInfoBiz;->btnName:[Ljava/lang/String;

    .line 21
    new-array v0, v1, [Ljava/lang/String;

    iput-object v0, p0, Lcom/arist/biz/ButtonInfoBiz;->btnDes:[Ljava/lang/String;

    .line 22
    new-array v0, v1, [I

    iput-object v0, p0, Lcom/arist/biz/ButtonInfoBiz;->btnIcon:[I

    .line 23
    new-array v0, v1, [Ljava/lang/String;

    iput-object v0, p0, Lcom/arist/biz/ButtonInfoBiz;->btnDesNum:[Ljava/lang/String;

    .line 17
    iput-object p1, p0, Lcom/arist/biz/ButtonInfoBiz;->context:Landroid/content/Context;

    .line 18
    return-void
.end method


# virtual methods
.method public getButtonInfos()Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/arist/entity/ButtonInfo;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v7, 0x0

    .line 27
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/arist/biz/ButtonInfoBiz;->infos:Ljava/util/ArrayList;

    .line 29
    iget-object v2, p0, Lcom/arist/biz/ButtonInfoBiz;->context:Landroid/content/Context;

    const-string v3, "main_activity_pref"

    invoke-virtual {v2, v3, v7}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    iput-object v2, p0, Lcom/arist/biz/ButtonInfoBiz;->mainPref:Landroid/content/SharedPreferences;

    .line 30
    iget-object v2, p0, Lcom/arist/biz/ButtonInfoBiz;->btnDesNum:[Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/arist/biz/ButtonInfoBiz;->mainPref:Landroid/content/SharedPreferences;

    const-string v5, "num_of_all_music"

    invoke-interface {v4, v5, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v7

    .line 31
    iget-object v2, p0, Lcom/arist/biz/ButtonInfoBiz;->btnDesNum:[Ljava/lang/String;

    const/4 v3, 0x1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/arist/biz/ButtonInfoBiz;->mainPref:Landroid/content/SharedPreferences;

    const-string v6, "num_of_artist"

    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    .line 32
    iget-object v2, p0, Lcom/arist/biz/ButtonInfoBiz;->btnDesNum:[Ljava/lang/String;

    const/4 v3, 0x2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/arist/biz/ButtonInfoBiz;->mainPref:Landroid/content/SharedPreferences;

    const-string v6, "num_of_album"

    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    .line 33
    iget-object v2, p0, Lcom/arist/biz/ButtonInfoBiz;->btnDesNum:[Ljava/lang/String;

    const/4 v3, 0x3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/arist/biz/ButtonInfoBiz;->mainPref:Landroid/content/SharedPreferences;

    const-string v6, "num_of_all_folder"

    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    .line 34
    iget-object v2, p0, Lcom/arist/biz/ButtonInfoBiz;->btnDesNum:[Ljava/lang/String;

    const/4 v3, 0x4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/arist/biz/ButtonInfoBiz;->mainPref:Landroid/content/SharedPreferences;

    const-string v6, "num_of_favorite"

    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    .line 35
    iget-object v2, p0, Lcom/arist/biz/ButtonInfoBiz;->btnDesNum:[Ljava/lang/String;

    const/4 v3, 0x5

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/arist/biz/ButtonInfoBiz;->mainPref:Landroid/content/SharedPreferences;

    const-string v6, "num_of_add"

    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    .line 36
    iget-object v2, p0, Lcom/arist/biz/ButtonInfoBiz;->btnDesNum:[Ljava/lang/String;

    const/4 v3, 0x6

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/arist/biz/ButtonInfoBiz;->mainPref:Landroid/content/SharedPreferences;

    const-string v6, "num_of_download"

    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    .line 38
    iget-object v2, p0, Lcom/arist/biz/ButtonInfoBiz;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/high16 v3, 0x7f0b0000

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/arist/biz/ButtonInfoBiz;->btnName:[Ljava/lang/String;

    .line 39
    iget-object v2, p0, Lcom/arist/biz/ButtonInfoBiz;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0b0001

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/arist/biz/ButtonInfoBiz;->btnDes:[Ljava/lang/String;

    .line 40
    const/4 v2, 0x7

    new-array v2, v2, [I

    fill-array-data v2, :array_0

    iput-object v2, p0, Lcom/arist/biz/ButtonInfoBiz;->btnIcon:[I

    .line 43
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget-object v2, p0, Lcom/arist/biz/ButtonInfoBiz;->btnIcon:[I

    array-length v2, v2

    if-lt v0, v2, :cond_0

    .line 50
    iget-object v2, p0, Lcom/arist/biz/ButtonInfoBiz;->infos:Ljava/util/ArrayList;

    return-object v2

    .line 44
    :cond_0
    new-instance v1, Lcom/arist/entity/ButtonInfo;

    invoke-direct {v1}, Lcom/arist/entity/ButtonInfo;-><init>()V

    .line 45
    .local v1, "info":Lcom/arist/entity/ButtonInfo;
    iget-object v2, p0, Lcom/arist/biz/ButtonInfoBiz;->btnIcon:[I

    aget v2, v2, v0

    invoke-virtual {v1, v2}, Lcom/arist/entity/ButtonInfo;->setBtnResId(I)V

    .line 46
    iget-object v2, p0, Lcom/arist/biz/ButtonInfoBiz;->btnName:[Ljava/lang/String;

    aget-object v2, v2, v0

    invoke-virtual {v1, v2}, Lcom/arist/entity/ButtonInfo;->setBtnTitle(Ljava/lang/String;)V

    .line 47
    new-instance v2, Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/arist/biz/ButtonInfoBiz;->btnDesNum:[Ljava/lang/String;

    aget-object v3, v3, v0

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/arist/biz/ButtonInfoBiz;->btnDes:[Ljava/lang/String;

    aget-object v3, v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/arist/entity/ButtonInfo;->setBtnDes(Ljava/lang/String;)V

    .line 48
    iget-object v2, p0, Lcom/arist/biz/ButtonInfoBiz;->infos:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 40
    :array_0
    .array-data 4
        0x7f02001a
        0x7f02001b
        0x7f020019
        0x7f020020
        0x7f02001f
        0x7f020018
        0x7f02001e
    .end array-data
.end method
