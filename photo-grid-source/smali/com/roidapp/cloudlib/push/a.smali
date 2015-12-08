.class public final Lcom/roidapp/cloudlib/push/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 42
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/cloudlib/push/a;->a:Z

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 8

    .prologue
    const/4 v5, 0x0

    .line 45
    sget-boolean v0, Lcom/roidapp/cloudlib/push/a;->a:Z

    if-eqz v0, :cond_1

    .line 90
    :cond_0
    :goto_0
    return-void

    .line 47
    :cond_1
    if-eqz p0, :cond_0

    .line 49
    invoke-static {}, Lcom/roidapp/baselib/c/n;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 51
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 52
    const/4 v1, 0x1

    sput-boolean v1, Lcom/roidapp/cloudlib/push/a;->a:Z

    .line 54
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/al;->c(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1128
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/al;->e(Landroid/content/Context;)Z

    move-result v1

    .line 57
    if-eqz v1, :cond_0

    .line 1196
    const-string v1, "pushservice"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 64
    const-string v2, "regid"

    invoke-interface {v1, v2, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 65
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 68
    const-string v3, "appVersion"

    const/4 v4, -0x1

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3

    .line 69
    invoke-static {v0}, Lcom/roidapp/baselib/c/n;->c(Landroid/content/Context;)I

    move-result v4

    .line 70
    if-ne v3, v4, :cond_3

    .line 72
    const-string v3, "uploadregid"

    invoke-interface {v1, v3, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 73
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 75
    invoke-static {v0, v2}, Lcom/roidapp/cloudlib/push/a;->e(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 78
    :cond_2
    const-string v3, "uploadTime"

    const-wide/16 v4, 0x0

    invoke-interface {v1, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    .line 79
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long v4, v6, v4

    const-wide/32 v6, 0x240c8400

    cmp-long v1, v4, v6

    if-lez v1, :cond_0

    .line 81
    invoke-static {v0, v2}, Lcom/roidapp/cloudlib/push/a;->e(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 2132
    :cond_3
    if-eqz v0, :cond_0

    .line 2134
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 2136
    invoke-static {}, Lcom/roidapp/baselib/c/t;->a()Ljava/util/concurrent/AbstractExecutorService;

    move-result-object v1

    new-instance v2, Lcom/roidapp/cloudlib/push/c;

    invoke-direct {v2, v0}, Lcom/roidapp/cloudlib/push/c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/AbstractExecutorService;->execute(Ljava/lang/Runnable;)V

    goto/16 :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 93
    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lcom/roidapp/cloudlib/push/a;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 94
    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 4

    .prologue
    .line 105
    sget-boolean v0, Lcom/roidapp/cloudlib/push/a;->a:Z

    if-nez v0, :cond_0

    .line 106
    invoke-static {p0}, Lcom/roidapp/cloudlib/push/a;->a(Landroid/content/Context;)V

    .line 107
    :cond_0
    sget-boolean v0, Lcom/roidapp/cloudlib/push/a;->a:Z

    if-eqz v0, :cond_1

    .line 108
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 3196
    const-string v1, "pushservice"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 109
    const-string v2, "regid"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 110
    if-eqz v1, :cond_1

    .line 111
    invoke-static {}, Lcom/roidapp/baselib/c/t;->a()Ljava/util/concurrent/AbstractExecutorService;

    move-result-object v2

    new-instance v3, Lcom/roidapp/cloudlib/push/b;

    invoke-direct {v3, p1, p2, v0, v1}, Lcom/roidapp/cloudlib/push/b;-><init>(Ljava/lang/String;ZLandroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/util/concurrent/AbstractExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 125
    :cond_1
    return-void
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 101
    .line 2196
    const-string v0, "pushservice"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 101
    const-string v1, "snsToken"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 97
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/roidapp/cloudlib/push/a;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 98
    return-void
.end method

.method static synthetic c(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2

    .prologue
    .line 17
    .line 4196
    const-string v0, "pushservice"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 17
    return-object v0
.end method

.method static synthetic c(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 17
    .line 5196
    const-string v0, "pushservice"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 5188
    invoke-static {p0}, Lcom/roidapp/baselib/c/n;->c(Landroid/content/Context;)I

    move-result v1

    .line 5189
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 5190
    const-string v2, "regid"

    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 5191
    const-string v2, "appVersion"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 5192
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 17
    return-void
.end method

.method static synthetic d(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 17
    .line 6177
    invoke-static {p0, p1}, Lcom/roidapp/cloudlib/push/e;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6196
    const-string v0, "pushservice"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 6179
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 6180
    const-string v1, "uploadregid"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 6181
    const-string v1, "uploadTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 6182
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 17
    :cond_0
    return-void
.end method

.method private static e(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 161
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 162
    invoke-static {}, Lcom/roidapp/baselib/c/t;->a()Ljava/util/concurrent/AbstractExecutorService;

    move-result-object v1

    new-instance v2, Lcom/roidapp/cloudlib/push/d;

    invoke-direct {v2, v0, p1}, Lcom/roidapp/cloudlib/push/d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/AbstractExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 168
    return-void
.end method
