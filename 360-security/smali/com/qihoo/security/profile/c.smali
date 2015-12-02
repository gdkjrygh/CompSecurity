.class Lcom/qihoo/security/profile/c;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/profile/f;


# instance fields
.field a:Landroid/content/Context;

.field private b:Z


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/profile/c;->a:Landroid/content/Context;

    .line 47
    return-void
.end method

.method private final a(Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;)Lorg/json/JSONObject;
    .locals 8

    .prologue
    .line 139
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 140
    const-string/jumbo v1, "ts"

    iget-wide v2, p1, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;->a:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 141
    const-string/jumbo v1, "dur"

    iget-wide v2, p1, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;->b:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 142
    const-string/jumbo v1, "tr"

    iget v2, p1, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;->c:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 143
    const-string/jumbo v1, "tag"

    iget-object v2, p1, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 145
    iget-object v2, p1, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;->e:Landroid/util/SparseArray;

    .line 146
    if-eqz v2, :cond_1

    .line 147
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 148
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v4

    .line 149
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v4, :cond_0

    .line 150
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 151
    const-string/jumbo v6, "t"

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v7

    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 152
    const-string/jumbo v6, "v"

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 153
    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 149
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 155
    :cond_0
    const-string/jumbo v1, "dat"

    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    :cond_1
    :goto_1
    return-object v0

    .line 158
    :catch_0
    move-exception v0

    .line 163
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private final a(Ljava/util/List;Ljava/io/File;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;",
            ">;",
            "Ljava/io/File;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 167
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 168
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    .line 170
    :cond_0
    invoke-virtual {p2}, Ljava/io/File;->mkdir()Z

    .line 171
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 174
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string/jumbo v2, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {v0, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 175
    const-string/jumbo v2, "timestamp"

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 176
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 177
    const-string/jumbo v0, "model"

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 179
    :cond_1
    const-string/jumbo v0, "mem"

    invoke-static {}, Lcom/qihoo360/mobilesafe/core/d/d;->a()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 180
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 181
    const-string/jumbo v0, "fingerprint"

    sget-object v2, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 183
    :cond_2
    const-string/jumbo v0, "sdk"

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 186
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 187
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;

    .line 188
    invoke-direct {p0, v0}, Lcom/qihoo/security/profile/c;->a(Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;)Lorg/json/JSONObject;

    move-result-object v0

    .line 189
    if-eqz v0, :cond_3

    .line 190
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 193
    :cond_4
    const-string/jumbo v0, "samples"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 195
    new-instance v0, Ljava/io/FileWriter;

    new-instance v2, Ljava/io/File;

    const-string/jumbo v3, "pf.txt"

    invoke-direct {v2, p2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v0, v2}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    .line 196
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/FileWriter;->write(Ljava/lang/String;)V

    .line 197
    invoke-virtual {v0}, Ljava/io/FileWriter;->close()V

    .line 198
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 38
    iget-boolean v0, p0, Lcom/qihoo/security/profile/c;->b:Z

    return v0
.end method

.method public a(Ljava/util/List;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;",
            ">;)Z"
        }
    .end annotation

    .prologue
    const-wide/32 v8, 0x5265c00

    const/4 v1, 0x0

    .line 87
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move v0, v1

    .line 120
    :goto_0
    return v0

    .line 91
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lcom/qihoo/security/profile/c;->d()I

    move-result v2

    .line 92
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    .line 93
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;

    iget-wide v4, v0, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;->a:J

    .line 94
    add-int/lit8 v0, v3, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;

    iget-wide v6, v0, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;->a:J

    .line 96
    invoke-virtual {p0}, Lcom/qihoo/security/profile/c;->f()I

    move-result v0

    if-le v3, v0, :cond_3

    sub-long v4, v6, v4

    cmp-long v0, v4, v8

    if-lez v0, :cond_3

    .line 97
    sub-long v4, v6, v8

    .line 98
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 99
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gt v0, v2, :cond_2

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;

    iget-wide v6, v0, Lcom/qihoo/security/profile/ProfileDataKeeper$Sample;->a:J

    cmp-long v0, v6, v4

    if-gez v0, :cond_4

    .line 100
    :cond_2
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_1

    .line 114
    :catch_0
    move-exception v0

    :cond_3
    move v0, v1

    .line 120
    goto :goto_0

    .line 108
    :cond_4
    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lcom/qihoo/security/profile/c;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    const-string/jumbo v3, "pf"

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 109
    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/profile/c;->a(Ljava/util/List;Ljava/io/File;)V

    .line 110
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 111
    new-instance v2, Lcom/qihoo/security/profile/m;

    iget-object v3, p0, Lcom/qihoo/security/profile/c;->a:Landroid/content/Context;

    invoke-direct {v2, v3}, Lcom/qihoo/security/profile/m;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v0}, Lcom/qihoo/security/profile/m;->a(Ljava/io/File;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public b()V
    .locals 10

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 51
    iget-object v2, p0, Lcom/qihoo/security/profile/c;->a:Landroid/content/Context;

    const-string/jumbo v3, "pf_config"

    invoke-virtual {v2, v3, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 53
    const-string/jumbo v3, "last_updatetime"

    const-wide/16 v4, -0x1

    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    .line 54
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    div-long/2addr v6, v8

    .line 55
    cmp-long v3, v6, v4

    if-ltz v3, :cond_0

    sub-long v4, v6, v4

    const-wide/32 v8, 0x15180

    cmp-long v3, v4, v8

    if-lez v3, :cond_2

    .line 56
    :cond_0
    new-instance v3, Ljava/util/Random;

    invoke-direct {v3, v6, v7}, Ljava/util/Random;-><init>(J)V

    .line 57
    const/16 v4, 0x64

    invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    if-ge v3, v0, :cond_1

    :goto_0
    iput-boolean v0, p0, Lcom/qihoo/security/profile/c;->b:Z

    .line 58
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 59
    const-string/jumbo v1, "enabled"

    iget-boolean v2, p0, Lcom/qihoo/security/profile/c;->b:Z

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 60
    const-string/jumbo v1, "last_updatetime"

    invoke-interface {v0, v1, v6, v7}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 61
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 65
    :goto_1
    return-void

    :cond_1
    move v0, v1

    .line 57
    goto :goto_0

    .line 63
    :cond_2
    const-string/jumbo v0, "enabled"

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/profile/c;->b:Z

    goto :goto_1
.end method

.method public c()J
    .locals 2

    .prologue
    .line 74
    const-wide/32 v0, 0x493e0

    return-wide v0
.end method

.method public d()I
    .locals 1

    .prologue
    .line 79
    const/16 v0, 0x200

    return v0
.end method

.method public e()J
    .locals 2

    .prologue
    .line 125
    const-wide/32 v0, 0x1b7740

    return-wide v0
.end method

.method public f()I
    .locals 1

    .prologue
    .line 130
    const/16 v0, 0x40

    return v0
.end method
