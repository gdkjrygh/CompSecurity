.class public Lcom/qihoo/security/appbox/core/d;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:Lcom/qihoo/security/appbox/core/d;


# instance fields
.field private b:Landroid/content/Context;

.field private c:J

.field private final d:J

.field private e:Z

.field private f:I

.field private g:I


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const-wide/32 v0, 0x5265c00

    iput-wide v0, p0, Lcom/qihoo/security/appbox/core/d;->d:J

    .line 46
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/d;->b:Landroid/content/Context;

    .line 47
    return-void
.end method

.method public static declared-synchronized a()Lcom/qihoo/security/appbox/core/d;
    .locals 2

    .prologue
    .line 28
    const-class v1, Lcom/qihoo/security/appbox/core/d;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/appbox/core/d;->a:Lcom/qihoo/security/appbox/core/d;

    if-nez v0, :cond_0

    .line 29
    new-instance v0, Lcom/qihoo/security/appbox/core/d;

    invoke-direct {v0}, Lcom/qihoo/security/appbox/core/d;-><init>()V

    sput-object v0, Lcom/qihoo/security/appbox/core/d;->a:Lcom/qihoo/security/appbox/core/d;

    .line 31
    :cond_0
    sget-object v0, Lcom/qihoo/security/appbox/core/d;->a:Lcom/qihoo/security/appbox/core/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 28
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 167
    if-nez p1, :cond_0

    .line 181
    :goto_0
    return-void

    .line 170
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 171
    const-string/jumbo v1, "is_show_appbox_func"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/security/appbox/core/d;->e:Z

    .line 172
    const-string/jumbo v1, "red_dot_display_rule"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/appbox/core/d;->f:I

    .line 173
    const-string/jumbo v1, "mobivsta_red_dot_show"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/appbox/core/d;->g:I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 178
    :catch_0
    move-exception v0

    .line 179
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method

.method private a(I)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 111
    iget-object v1, p0, Lcom/qihoo/security/appbox/core/d;->b:Landroid/content/Context;

    const-string/jumbo v2, "last_get_red_dot_show_rule_value"

    invoke-static {v1, v2, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v1

    .line 112
    if-ne v1, p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method private f()V
    .locals 4

    .prologue
    .line 116
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/d;->b:Landroid/content/Context;

    const-string/jumbo v1, "m_b.dat"

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/b/s;->e(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v0

    .line 117
    iget-wide v2, p0, Lcom/qihoo/security/appbox/core/d;->c:J

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    .line 118
    invoke-virtual {p0}, Lcom/qihoo/security/appbox/core/d;->e()V

    .line 120
    :cond_0
    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    .prologue
    .line 55
    invoke-direct {p0}, Lcom/qihoo/security/appbox/core/d;->f()V

    .line 56
    iget-boolean v0, p0, Lcom/qihoo/security/appbox/core/d;->e:Z

    return v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 64
    invoke-direct {p0}, Lcom/qihoo/security/appbox/core/d;->f()V

    .line 65
    iget v0, p0, Lcom/qihoo/security/appbox/core/d;->f:I

    return v0
.end method

.method public d()Z
    .locals 10

    .prologue
    const-wide/16 v8, 0x0

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 72
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 73
    invoke-direct {p0}, Lcom/qihoo/security/appbox/core/d;->f()V

    .line 74
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    .line 78
    iget-object v2, p0, Lcom/qihoo/security/appbox/core/d;->b:Landroid/content/Context;

    const-string/jumbo v3, "appbox_new_function_enable_last_time"

    invoke-static {v2, v3, v8, v9}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    .line 79
    iget v4, p0, Lcom/qihoo/security/appbox/core/d;->f:I

    if-eq v4, v6, :cond_1

    iget v4, p0, Lcom/qihoo/security/appbox/core/d;->f:I

    if-eq v4, v7, :cond_1

    .line 103
    :cond_0
    :goto_0
    return v0

    .line 83
    :cond_1
    cmp-long v4, v2, v8

    if-nez v4, :cond_2

    move v0, v1

    .line 84
    goto :goto_0

    .line 87
    :cond_2
    iget v4, p0, Lcom/qihoo/security/appbox/core/d;->f:I

    if-ne v4, v6, :cond_3

    .line 88
    iget v2, p0, Lcom/qihoo/security/appbox/core/d;->f:I

    invoke-direct {p0, v2}, Lcom/qihoo/security/appbox/core/d;->a(I)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    .line 91
    goto :goto_0

    .line 93
    :cond_3
    iget v4, p0, Lcom/qihoo/security/appbox/core/d;->f:I

    if-ne v4, v7, :cond_0

    .line 94
    iget v4, p0, Lcom/qihoo/security/appbox/core/d;->g:I

    if-lt v4, v1, :cond_0

    iget v4, p0, Lcom/qihoo/security/appbox/core/d;->g:I

    const/16 v5, 0x270e

    if-gt v4, v5, :cond_0

    .line 95
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long v2, v4, v2

    .line 96
    iget v4, p0, Lcom/qihoo/security/appbox/core/d;->g:I

    int-to-long v4, v4

    const-wide/32 v6, 0x5265c00

    mul-long/2addr v4, v6

    cmp-long v2, v2, v4

    if-ltz v2, :cond_0

    move v0, v1

    .line 97
    goto :goto_0
.end method

.method public e()V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 123
    .line 126
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/appbox/core/d;->b:Landroid/content/Context;

    const-string/jumbo v2, "m_b.dat"

    invoke-static {v1, v2}, Lcom/qihoo360/mobilesafe/b/s;->e(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/qihoo/security/appbox/core/d;->c:J

    .line 127
    iget-object v1, p0, Lcom/qihoo/security/appbox/core/d;->b:Landroid/content/Context;

    const-string/jumbo v2, "m_b.dat"

    invoke-static {v1, v2}, Lcom/qihoo360/mobilesafe/b/s;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move-result-object v1

    .line 128
    if-eqz v1, :cond_7

    .line 129
    :try_start_1
    sget-object v2, Lcom/qihoo360/mobilesafe/support/NativeManager;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/qihoo360/mobilesafe/b/s;->a(Ljava/io/InputStream;Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_8
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    move-result-object v2

    .line 131
    if-eqz v2, :cond_3

    .line 132
    :try_start_2
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-direct {v3, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v1, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_9
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 133
    :try_start_3
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 134
    const-string/jumbo v3, ""

    .line 135
    const-string/jumbo v3, ""

    .line 136
    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 137
    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    .line 145
    :catch_0
    move-exception v0

    move-object v0, v1

    move-object v1, v2

    .line 150
    :goto_1
    if-eqz v0, :cond_0

    .line 152
    :try_start_4
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 156
    :cond_0
    :goto_2
    if-eqz v1, :cond_1

    .line 158
    :try_start_5
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 163
    :cond_1
    :goto_3
    return-void

    .line 139
    :cond_2
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    .line 140
    monitor-enter p0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 141
    :try_start_7
    invoke-direct {p0, v0}, Lcom/qihoo/security/appbox/core/d;->a(Ljava/lang/String;)V

    .line 142
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-object v0, v1

    .line 150
    :cond_3
    :goto_4
    if-eqz v0, :cond_4

    .line 152
    :try_start_8
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    .line 156
    :cond_4
    :goto_5
    if-eqz v2, :cond_1

    .line 158
    :try_start_9
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1

    goto :goto_3

    .line 159
    :catch_1
    move-exception v0

    goto :goto_3

    .line 142
    :catchall_0
    move-exception v0

    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :try_start_b
    throw v0
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 150
    :catchall_1
    move-exception v0

    :goto_6
    if-eqz v1, :cond_5

    .line 152
    :try_start_c
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_5

    .line 156
    :cond_5
    :goto_7
    if-eqz v2, :cond_6

    .line 158
    :try_start_d
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_6

    .line 160
    :cond_6
    :goto_8
    throw v0

    .line 153
    :catch_2
    move-exception v0

    goto :goto_5

    :catch_3
    move-exception v0

    goto :goto_2

    .line 159
    :catch_4
    move-exception v0

    goto :goto_3

    .line 153
    :catch_5
    move-exception v1

    goto :goto_7

    .line 159
    :catch_6
    move-exception v1

    goto :goto_8

    .line 150
    :catchall_2
    move-exception v1

    move-object v2, v0

    move-object v4, v0

    move-object v0, v1

    move-object v1, v4

    goto :goto_6

    :catchall_3
    move-exception v2

    move-object v4, v2

    move-object v2, v1

    move-object v1, v0

    move-object v0, v4

    goto :goto_6

    :catchall_4
    move-exception v1

    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    goto :goto_6

    .line 145
    :catch_7
    move-exception v1

    move-object v1, v0

    goto :goto_1

    :catch_8
    move-exception v2

    goto :goto_1

    :catch_9
    move-exception v1

    move-object v1, v2

    goto :goto_1

    :cond_7
    move-object v2, v1

    goto :goto_4
.end method
