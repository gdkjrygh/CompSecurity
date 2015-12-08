.class public Lcom/kik/l/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/database/Cursor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/l/y$a;
    }
.end annotation


# instance fields
.field private a:Ljava/util/HashMap;

.field private final b:Landroid/database/Cursor;


# direct methods
.method public constructor <init>(Landroid/database/Cursor;)V
    .locals 5

    .prologue
    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    iput-object p1, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    .line 83
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/kik/l/y;->a:Ljava/util/HashMap;

    .line 86
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v1

    .line 88
    const/4 v0, 0x0

    :goto_0
    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 89
    iget-object v2, p0, Lcom/kik/l/y;->a:Ljava/util/HashMap;

    aget-object v3, v1, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 91
    :cond_0
    return-void
.end method

.method private static a(Landroid/database/Cursor;Ljava/lang/Class;)Lcom/kik/l/y;
    .locals 4

    .prologue
    .line 42
    const/4 v1, 0x0

    .line 45
    const/4 v0, 0x1

    :try_start_0
    new-array v0, v0, [Ljava/lang/Class;

    const/4 v2, 0x0

    const-class v3, Landroid/database/Cursor;

    aput-object v3, v0, v2

    invoke-virtual {p1, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 47
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/l/y;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3

    .line 62
    :goto_0
    return-object v0

    .line 49
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/NoSuchMethodException;->printStackTrace()V

    move-object v0, v1

    .line 60
    goto :goto_0

    .line 52
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->printStackTrace()V

    move-object v0, v1

    .line 60
    goto :goto_0

    .line 55
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InstantiationException;->printStackTrace()V

    move-object v0, v1

    .line 60
    goto :goto_0

    .line 58
    :catch_3
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    move-object v0, v1

    goto :goto_0
.end method

.method public static a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/Class;Ljava/lang/String;)Lcom/kik/l/y;
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 67
    move-object v0, p0

    move-object v1, p2

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    move-object v6, v2

    move-object v7, v2

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/kik/l/y;->a(Landroid/database/Cursor;Ljava/lang/Class;)Lcom/kik/l/y;

    move-result-object v0

    return-object v0
.end method

.method public static varargs a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lcom/kik/l/y;
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 72
    move-object v0, p0

    move-object v1, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, v2

    move-object v6, v2

    move-object v7, v2

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/kik/l/y;->a(Landroid/database/Cursor;Ljava/lang/Class;)Lcom/kik/l/y;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/kik/l/y$a;)V
    .locals 2

    .prologue
    .line 148
    :try_start_0
    invoke-virtual {p0}, Lcom/kik/l/y;->moveToFirst()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_2

    .line 151
    :cond_0
    :try_start_1
    invoke-interface {p1, p0}, Lcom/kik/l/y$a;->a(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 162
    :cond_1
    :try_start_2
    invoke-virtual {p0}, Lcom/kik/l/y;->moveToNext()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    .line 166
    :cond_2
    invoke-virtual {p0}, Lcom/kik/l/y;->close()V

    return-void

    .line 153
    :catch_0
    move-exception v0

    .line 155
    :try_start_3
    invoke-static {v0}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 156
    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 159
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 166
    :catchall_0
    move-exception v0

    .line 167
    invoke-virtual {p0}, Lcom/kik/l/y;->close()V

    throw v0
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 174
    invoke-virtual {p0, p1}, Lcom/kik/l/y;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    iget-object v2, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v2, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(Ljava/lang/String;)[B
    .locals 2

    .prologue
    .line 184
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-virtual {p0, p1}, Lcom/kik/l/y;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0

    return-object v0
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 189
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-virtual {p0, p1}, Lcom/kik/l/y;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 1

    .prologue
    .line 431
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    if-eqz v0, :cond_0

    .line 432
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 434
    :cond_0
    return-void
.end method

.method public copyStringToBuffer(ILandroid/database/CharArrayBuffer;)V
    .locals 1

    .prologue
    .line 372
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0, p1, p2}, Landroid/database/Cursor;->copyStringToBuffer(ILandroid/database/CharArrayBuffer;)V

    .line 373
    return-void
.end method

.method public final d(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 204
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-virtual {p0, p1}, Lcom/kik/l/y;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    return v0
.end method

.method public deactivate()V
    .locals 1

    .prologue
    .line 419
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->deactivate()V

    .line 420
    return-void
.end method

.method public final e(Ljava/lang/String;)J
    .locals 2

    .prologue
    .line 209
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-virtual {p0, p1}, Lcom/kik/l/y;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public getBlob(I)[B
    .locals 1

    .prologue
    .line 360
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0

    return-object v0
.end method

.method public getColumnCount()I
    .locals 1

    .prologue
    .line 354
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->getColumnCount()I

    move-result v0

    return v0
.end method

.method public getColumnIndex(Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 96
    iget-object v0, p0, Lcom/kik/l/y;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 97
    iget-object v0, p0, Lcom/kik/l/y;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 106
    :cond_0
    :goto_0
    return v0

    .line 100
    :cond_1
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 102
    if-ltz v0, :cond_0

    .line 103
    iget-object v1, p0, Lcom/kik/l/y;->a:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public getColumnIndexOrThrow(Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 112
    iget-object v0, p0, Lcom/kik/l/y;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 113
    iget-object v0, p0, Lcom/kik/l/y;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 120
    :goto_0
    return v0

    .line 116
    :cond_0
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    .line 118
    iget-object v1, p0, Lcom/kik/l/y;->a:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public getColumnName(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 342
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getColumnName(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getColumnNames()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 348
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 234
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    if-nez v0, :cond_0

    .line 235
    const/4 v0, 0x0

    .line 238
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v0

    goto :goto_0
.end method

.method public getDouble(I)D
    .locals 2

    .prologue
    .line 401
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide v0

    return-wide v0
.end method

.method public getExtras()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 488
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public getFloat(I)F
    .locals 1

    .prologue
    .line 396
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getFloat(I)F

    move-result v0

    return v0
.end method

.method public getInt(I)I
    .locals 1

    .prologue
    .line 384
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    return v0
.end method

.method public getLong(I)J
    .locals 2

    .prologue
    .line 390
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public getNotificationUri()Landroid/net/Uri;
    .locals 1

    .prologue
    .line 476
    const/4 v0, 0x0

    return-object v0
.end method

.method public getPosition()I
    .locals 1

    .prologue
    .line 244
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->getPosition()I

    move-result v0

    return v0
.end method

.method public getShort(I)S
    .locals 1

    .prologue
    .line 378
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getShort(I)S

    move-result v0

    return v0
.end method

.method public getString(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 366
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getType(I)I
    .locals 1

    .prologue
    .line 407
    const/4 v0, 0x0

    return v0
.end method

.method public getWantsAllOnMoveCalls()Z
    .locals 1

    .prologue
    .line 482
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->getWantsAllOnMoveCalls()Z

    move-result v0

    return v0
.end method

.method public isAfterLast()Z
    .locals 1

    .prologue
    .line 332
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    if-nez v0, :cond_0

    .line 333
    const/4 v0, 0x1

    .line 336
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v0

    goto :goto_0
.end method

.method public isBeforeFirst()Z
    .locals 1

    .prologue
    .line 326
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->isBeforeFirst()Z

    move-result v0

    return v0
.end method

.method public isClosed()Z
    .locals 1

    .prologue
    .line 439
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    return v0
.end method

.method public isFirst()Z
    .locals 1

    .prologue
    .line 310
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    if-nez v0, :cond_0

    .line 311
    const/4 v0, 0x0

    .line 314
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->isFirst()Z

    move-result v0

    goto :goto_0
.end method

.method public isLast()Z
    .locals 1

    .prologue
    .line 320
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->isLast()Z

    move-result v0

    return v0
.end method

.method public isNull(I)Z
    .locals 1

    .prologue
    .line 413
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    return v0
.end method

.method public move(I)Z
    .locals 1

    .prologue
    .line 250
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    if-nez v0, :cond_0

    .line 251
    const/4 v0, 0x0

    .line 254
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->move(I)Z

    move-result v0

    goto :goto_0
.end method

.method public moveToFirst()Z
    .locals 1

    .prologue
    .line 270
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    if-nez v0, :cond_0

    .line 271
    const/4 v0, 0x0

    .line 274
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    goto :goto_0
.end method

.method public moveToLast()Z
    .locals 1

    .prologue
    .line 280
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    if-nez v0, :cond_0

    .line 281
    const/4 v0, 0x0

    .line 284
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->moveToLast()Z

    move-result v0

    goto :goto_0
.end method

.method public moveToNext()Z
    .locals 1

    .prologue
    .line 290
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    if-nez v0, :cond_0

    .line 291
    const/4 v0, 0x0

    .line 294
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    goto :goto_0
.end method

.method public moveToPosition(I)Z
    .locals 1

    .prologue
    .line 260
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    if-nez v0, :cond_0

    .line 261
    const/4 v0, 0x0

    .line 264
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result v0

    goto :goto_0
.end method

.method public moveToPrevious()Z
    .locals 1

    .prologue
    .line 300
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    if-nez v0, :cond_0

    .line 301
    const/4 v0, 0x0

    .line 304
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->moveToPrevious()Z

    move-result v0

    goto :goto_0
.end method

.method public registerContentObserver(Landroid/database/ContentObserver;)V
    .locals 1

    .prologue
    .line 445
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->registerContentObserver(Landroid/database/ContentObserver;)V

    .line 446
    return-void
.end method

.method public registerDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1

    .prologue
    .line 457
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 458
    return-void
.end method

.method public requery()Z
    .locals 1

    .prologue
    .line 425
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0}, Landroid/database/Cursor;->requery()Z

    move-result v0

    return v0
.end method

.method public respond(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 494
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->respond(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public setNotificationUri(Landroid/content/ContentResolver;Landroid/net/Uri;)V
    .locals 1

    .prologue
    .line 469
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0, p1, p2}, Landroid/database/Cursor;->setNotificationUri(Landroid/content/ContentResolver;Landroid/net/Uri;)V

    .line 470
    return-void
.end method

.method public unregisterContentObserver(Landroid/database/ContentObserver;)V
    .locals 1

    .prologue
    .line 451
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 452
    return-void
.end method

.method public unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1

    .prologue
    .line 463
    iget-object v0, p0, Lcom/kik/l/y;->b:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 464
    return-void
.end method
