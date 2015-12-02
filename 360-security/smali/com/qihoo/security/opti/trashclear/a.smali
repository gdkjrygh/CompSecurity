.class public Lcom/qihoo/security/opti/trashclear/a;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static a:Ljava/lang/String;

.field private static b:Lcom/qihoo/security/opti/trashclear/a;

.field private static c:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 31
    sput-object v0, Lcom/qihoo/security/opti/trashclear/a;->b:Lcom/qihoo/security/opti/trashclear/a;

    .line 33
    sput-object v0, Lcom/qihoo/security/opti/trashclear/a;->a:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/opti/trashclear/a;->c:Landroid/content/Context;

    .line 38
    return-void
.end method

.method public static a()Lcom/qihoo/security/opti/trashclear/a;
    .locals 1

    .prologue
    .line 41
    sget-object v0, Lcom/qihoo/security/opti/trashclear/a;->b:Lcom/qihoo/security/opti/trashclear/a;

    if-nez v0, :cond_0

    .line 42
    new-instance v0, Lcom/qihoo/security/opti/trashclear/a;

    invoke-direct {v0}, Lcom/qihoo/security/opti/trashclear/a;-><init>()V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/a;->b:Lcom/qihoo/security/opti/trashclear/a;

    .line 44
    :cond_0
    sget-object v0, Lcom/qihoo/security/opti/trashclear/a;->b:Lcom/qihoo/security/opti/trashclear/a;

    return-object v0
.end method

.method public static c()V
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v1, 0x0

    .line 85
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 90
    sget-object v0, Lcom/qihoo/security/opti/trashclear/a;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 91
    const-string/jumbo v2, ""

    .line 92
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v2, "c_t.config"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    sget-object v2, Lcom/qihoo/security/opti/trashclear/a;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "c_t.config"

    invoke-static {v2, v3}, Lcom/qihoo360/common/utils/Utils;->pathAppend(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 128
    :goto_0
    if-nez v0, :cond_0

    .line 130
    :try_start_1
    sget-object v2, Lcom/qihoo/security/opti/trashclear/a;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    const-string/jumbo v3, "c_t.config"

    invoke-virtual {v2, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7

    move-result-object v0

    .line 146
    :cond_0
    :goto_1
    :try_start_2
    new-instance v4, Ljava/io/InputStreamReader;

    new-instance v2, Ljava/util/zip/InflaterInputStream;

    invoke-direct {v2, v0}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;)V

    const-string/jumbo v3, "UTF-8"

    invoke-direct {v4, v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 148
    :try_start_3
    new-instance v6, Ljava/io/BufferedReader;

    invoke-direct {v6, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object v2, v1

    move-object v3, v1

    .line 150
    :goto_2
    :try_start_4
    invoke-virtual {v6}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 151
    const-string/jumbo v7, "up:"

    invoke-virtual {v5, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    move-object v1, v5

    .line 152
    goto :goto_2

    .line 125
    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0

    .line 153
    :cond_1
    const-string/jumbo v7, "#"

    invoke-virtual {v5, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_2

    move-object v2, v5

    .line 154
    goto :goto_2

    :cond_2
    move-object v3, v5

    .line 156
    goto :goto_2

    .line 159
    :cond_3
    if-eqz v3, :cond_4

    .line 160
    const-string/jumbo v5, ";"

    invoke-virtual {v3, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 161
    array-length v6, v5

    .line 162
    const/4 v5, 0x0

    :goto_3
    if-ge v5, v6, :cond_4

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 169
    :cond_4
    if-eqz v1, :cond_6

    .line 170
    const-string/jumbo v5, ":"

    invoke-virtual {v1, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 171
    array-length v6, v5

    if-le v6, v8, :cond_5

    const/4 v6, 0x1

    aget-object v6, v5, v6

    if-eqz v6, :cond_5

    .line 172
    const/4 v6, 0x1

    aget-object v1, v5, v6
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_6
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 185
    :goto_4
    :try_start_5
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 186
    invoke-virtual {v4}, Ljava/io/InputStreamReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    move-object v0, v1

    move-object v1, v2

    move-object v2, v3

    .line 193
    :goto_5
    sget-object v3, Lcom/qihoo/security/opti/trashclear/a;->c:Landroid/content/Context;

    const-string/jumbo v4, "clear_title_id"

    invoke-static {v3, v4, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    sput-object v1, Lcom/qihoo/security/opti/trashclear/a;->a:Ljava/lang/String;

    .line 197
    sget-object v1, Lcom/qihoo/security/opti/trashclear/a;->c:Landroid/content/Context;

    const-string/jumbo v2, "clear_up"

    invoke-static {v1, v2, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    sget-object v0, Lcom/qihoo/security/opti/trashclear/a;->c:Landroid/content/Context;

    const-string/jumbo v1, "clear_timestamp"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 206
    return-void

    .line 174
    :cond_5
    :try_start_6
    const-string/jumbo v1, ""

    goto :goto_4

    .line 177
    :cond_6
    const-string/jumbo v1, ""
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_4

    .line 187
    :catch_1
    move-exception v0

    move-object v0, v1

    move-object v1, v2

    move-object v2, v3

    .line 192
    goto :goto_5

    .line 179
    :catch_2
    move-exception v2

    move-object v4, v1

    move-object v2, v1

    move-object v3, v1

    .line 185
    :goto_6
    :try_start_7
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 186
    invoke-virtual {v4}, Ljava/io/InputStreamReader;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3

    move-object v0, v1

    move-object v1, v2

    move-object v2, v3

    .line 191
    goto :goto_5

    .line 187
    :catch_3
    move-exception v0

    move-object v0, v1

    move-object v1, v2

    move-object v2, v3

    .line 192
    goto :goto_5

    .line 184
    :catchall_0
    move-exception v2

    move-object v4, v1

    move-object v1, v2

    .line 185
    :goto_7
    :try_start_8
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 186
    invoke-virtual {v4}, Ljava/io/InputStreamReader;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4

    .line 191
    :goto_8
    throw v1

    .line 187
    :catch_4
    move-exception v0

    goto :goto_8

    .line 184
    :catchall_1
    move-exception v1

    goto :goto_7

    .line 179
    :catch_5
    move-exception v2

    move-object v2, v1

    move-object v3, v1

    goto :goto_6

    :catch_6
    move-exception v5

    goto :goto_6

    .line 134
    :catch_7
    move-exception v2

    goto/16 :goto_1
.end method


# virtual methods
.method public b()V
    .locals 5

    .prologue
    .line 57
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 58
    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    .line 59
    rem-int/lit8 v0, v0, 0x1e

    if-nez v0, :cond_1

    .line 76
    :cond_0
    :goto_0
    return-void

    .line 64
    :cond_1
    sget-object v0, Lcom/qihoo/security/opti/trashclear/a;->c:Landroid/content/Context;

    const-string/jumbo v1, "clear_timestamp"

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v0

    .line 65
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 66
    cmp-long v4, v2, v0

    if-lez v4, :cond_2

    sub-long v0, v2, v0

    const-wide/32 v2, 0x1b77400

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 71
    :cond_2
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/qihoo/security/opti/trashclear/a;->c:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/v5/UpdateService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 72
    const-string/jumbo v1, "com.qihoo.security.action.ACTION_CHECK_UPDATE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 73
    const-string/jumbo v1, "type"

    const/16 v2, 0xfa1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 74
    sget-object v1, Lcom/qihoo/security/opti/trashclear/a;->c:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0
.end method
