.class public final Landroid_src/mms/g/o;
.super Ljava/lang/Object;
.source "SqliteWrapper.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 86
    :try_start_0
    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 90
    :goto_0
    return v0

    .line 87
    :catch_0
    move-exception v0

    .line 88
    const-string v1, "SqliteWrapper"

    const-string v2, "Catch a SQLiteException when update: "

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    invoke-static {p0, v0}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/database/sqlite/SQLiteException;)V

    .line 90
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 97
    :try_start_0
    invoke-virtual {p1, p2, p3, p4}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 101
    :goto_0
    return v0

    .line 98
    :catch_0
    move-exception v0

    .line 99
    const-string v1, "SqliteWrapper"

    const-string v2, "Catch a SQLiteException when delete: "

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 100
    invoke-static {p0, v0}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/database/sqlite/SQLiteException;)V

    .line 101
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 3

    .prologue
    .line 66
    :try_start_0
    invoke-virtual/range {p1 .. p6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 70
    :goto_0
    return-object v0

    .line 67
    :catch_0
    move-exception v0

    .line 68
    const-string v1, "SqliteWrapper"

    const-string v2, "Catch a SQLiteException when query: "

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 69
    invoke-static {p0, v0}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/database/sqlite/SQLiteException;)V

    .line 70
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 3

    .prologue
    .line 108
    :try_start_0
    invoke-virtual {p1, p2, p3}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 112
    :goto_0
    return-object v0

    .line 109
    :catch_0
    move-exception v0

    .line 110
    const-string v1, "SqliteWrapper"

    const-string v2, "Catch a SQLiteException when insert: "

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 111
    invoke-static {p0, v0}, Landroid_src/mms/g/o;->a(Landroid/content/Context;Landroid/database/sqlite/SQLiteException;)V

    .line 112
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Landroid/database/sqlite/SQLiteException;)V
    .locals 0

    .prologue
    .line 60
    throw p1
.end method
