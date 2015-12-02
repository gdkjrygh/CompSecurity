.class public Lcom/qihoo/antivirus/update/f;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field final a:Ljava/lang/String;

.field final b:I

.field final c:I

.field final d:I


# direct methods
.method constructor <init>(Ljava/io/File;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, -0x1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/antivirus/update/f;->a:Ljava/lang/String;

    .line 33
    const/4 v0, 0x3

    new-array v0, v0, [I

    .line 34
    invoke-virtual {p0, p1, v0}, Lcom/qihoo/antivirus/update/f;->a(Ljava/io/File;[I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 35
    aget v1, v0, v3

    iput v1, p0, Lcom/qihoo/antivirus/update/f;->b:I

    .line 36
    const/4 v1, 0x1

    aget v1, v0, v1

    iput v1, p0, Lcom/qihoo/antivirus/update/f;->c:I

    .line 37
    const/4 v1, 0x2

    aget v0, v0, v1

    iput v0, p0, Lcom/qihoo/antivirus/update/f;->d:I

    .line 43
    :goto_0
    return-void

    .line 39
    :cond_0
    iput v3, p0, Lcom/qihoo/antivirus/update/f;->b:I

    .line 40
    iput v2, p0, Lcom/qihoo/antivirus/update/f;->c:I

    .line 41
    iput v2, p0, Lcom/qihoo/antivirus/update/f;->d:I

    goto :goto_0
.end method

.method public static a(Ljava/io/File;Z)I
    .locals 4

    .prologue
    .line 135
    const/4 v0, -0x1

    .line 136
    const/4 v2, 0x0

    .line 138
    :try_start_0
    new-instance v1, Ljava/io/DataInputStream;

    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v3}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    :try_start_1
    invoke-virtual {v1}, Ljava/io/DataInputStream;->read()I

    .line 140
    invoke-virtual {v1}, Ljava/io/DataInputStream;->read()I

    .line 141
    invoke-virtual {v1}, Ljava/io/DataInputStream;->read()I

    .line 142
    invoke-virtual {v1}, Ljava/io/DataInputStream;->read()I

    .line 143
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    .line 144
    if-eqz p1, :cond_1

    .line 145
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    .line 155
    :goto_0
    if-eqz v1, :cond_0

    .line 157
    :try_start_2
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 163
    :cond_0
    :goto_1
    return v0

    .line 147
    :cond_1
    :try_start_3
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I

    .line 148
    invoke-virtual {v1}, Ljava/io/DataInputStream;->readInt()I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result v0

    goto :goto_0

    .line 150
    :catch_0
    move-exception v1

    move-object v1, v2

    .line 155
    :goto_2
    if-eqz v1, :cond_0

    .line 157
    :try_start_4
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    .line 158
    :catch_1
    move-exception v1

    goto :goto_1

    .line 154
    :catchall_0
    move-exception v0

    move-object v1, v2

    .line 155
    :goto_3
    if-eqz v1, :cond_2

    .line 157
    :try_start_5
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 162
    :cond_2
    :goto_4
    throw v0

    .line 158
    :catch_2
    move-exception v1

    goto :goto_4

    :catch_3
    move-exception v1

    goto :goto_1

    .line 154
    :catchall_1
    move-exception v0

    goto :goto_3

    .line 150
    :catch_4
    move-exception v2

    goto :goto_2
.end method

.method public static a(Ljava/io/File;)Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 89
    .line 90
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v2, ".tmp"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 94
    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    :try_start_1
    new-instance v3, Ljava/io/DataInputStream;

    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v3, v4}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 96
    :try_start_2
    invoke-virtual {v3}, Ljava/io/DataInputStream;->read()I

    .line 97
    invoke-virtual {v3}, Ljava/io/DataInputStream;->read()I

    .line 98
    invoke-virtual {v3}, Ljava/io/DataInputStream;->read()I

    .line 99
    invoke-virtual {v3}, Ljava/io/DataInputStream;->read()I

    .line 100
    invoke-virtual {v3}, Ljava/io/DataInputStream;->readInt()I

    .line 101
    invoke-virtual {v3}, Ljava/io/DataInputStream;->readInt()I

    .line 102
    invoke-virtual {v3}, Ljava/io/DataInputStream;->readInt()I

    .line 103
    invoke-static {v3, v2}, Lcom/qihoo/antivirus/update/af;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_8
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 104
    const/4 v4, 0x1

    .line 111
    if-eqz v3, :cond_0

    .line 113
    :try_start_3
    invoke-virtual {v3}, Ljava/io/DataInputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6

    .line 118
    :cond_0
    :goto_0
    if-eqz v2, :cond_5

    .line 120
    :try_start_4
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    move v2, v4

    .line 127
    :goto_1
    if-eqz v2, :cond_4

    .line 130
    :goto_2
    return-object v0

    .line 105
    :catch_0
    move-exception v2

    move-object v2, v1

    move-object v3, v1

    .line 106
    :goto_3
    const/4 v4, 0x0

    .line 111
    if-eqz v3, :cond_1

    .line 113
    :try_start_5
    invoke-virtual {v3}, Ljava/io/DataInputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 118
    :cond_1
    :goto_4
    if-eqz v2, :cond_5

    .line 120
    :try_start_6
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    move v2, v4

    .line 121
    goto :goto_1

    :catch_1
    move-exception v2

    move v2, v4

    goto :goto_1

    .line 110
    :catchall_0
    move-exception v0

    move-object v2, v1

    move-object v3, v1

    .line 111
    :goto_5
    if-eqz v3, :cond_2

    .line 113
    :try_start_7
    invoke-virtual {v3}, Ljava/io/DataInputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    .line 118
    :cond_2
    :goto_6
    if-eqz v2, :cond_3

    .line 120
    :try_start_8
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5

    .line 125
    :cond_3
    :goto_7
    throw v0

    .line 121
    :catch_2
    move-exception v2

    move v2, v4

    goto :goto_1

    :cond_4
    move-object v0, v1

    .line 130
    goto :goto_2

    .line 114
    :catch_3
    move-exception v3

    goto :goto_4

    :catch_4
    move-exception v1

    goto :goto_6

    .line 121
    :catch_5
    move-exception v1

    goto :goto_7

    .line 114
    :catch_6
    move-exception v3

    goto :goto_0

    .line 110
    :catchall_1
    move-exception v0

    move-object v3, v1

    goto :goto_5

    :catchall_2
    move-exception v0

    goto :goto_5

    .line 105
    :catch_7
    move-exception v3

    move-object v3, v1

    goto :goto_3

    :catch_8
    move-exception v4

    goto :goto_3

    :cond_5
    move v2, v4

    goto :goto_1
.end method


# virtual methods
.method a(Ljava/io/DataInputStream;Ljava/io/File;[I)Z
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 167
    invoke-virtual {p1}, Ljava/io/DataInputStream;->read()I

    move-result v0

    const/16 v1, 0x51

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Ljava/io/DataInputStream;->read()I

    move-result v0

    const/16 v1, 0x4c

    if-ne v0, v1, :cond_2

    .line 168
    invoke-virtual {p1}, Ljava/io/DataInputStream;->close()V

    .line 170
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10, v9}, Landroid/database/sqlite/SQLiteDatabase;->openDatabase(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 173
    :try_start_0
    const-string/jumbo v1, "v_patch"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string/jumbo v4, "flags"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-string/jumbo v4, "patch_version"

    aput-object v4, v2, v3

    const/4 v3, 0x2

    const-string/jumbo v4, "final_version"

    aput-object v4, v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 174
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 173
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 175
    if-eqz v1, :cond_4

    .line 176
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 177
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    aput v3, p3, v2

    .line 178
    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    aput v3, p3, v2

    .line 179
    const/4 v2, 0x2

    const/4 v3, 0x2

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    aput v3, p3, v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 197
    if-eqz v1, :cond_0

    .line 198
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_0
    move v0, v8

    .line 205
    :goto_0
    return v0

    .line 192
    :catch_0
    move-exception v1

    move-object v1, v10

    .line 197
    :goto_1
    if-eqz v1, :cond_1

    .line 198
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 202
    :cond_1
    :goto_2
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_2
    move v0, v9

    .line 205
    goto :goto_0

    .line 196
    :catchall_0
    move-exception v0

    .line 197
    :goto_3
    if-eqz v10, :cond_3

    .line 198
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 200
    :cond_3
    throw v0

    .line 197
    :cond_4
    if-eqz v1, :cond_1

    .line 198
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_2

    .line 196
    :catchall_1
    move-exception v0

    move-object v10, v1

    goto :goto_3

    .line 192
    :catch_1
    move-exception v2

    goto :goto_1
.end method

.method a(Ljava/io/DataInputStream;[I)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 78
    invoke-virtual {p1}, Ljava/io/DataInputStream;->read()I

    move-result v2

    const/16 v3, 0x44

    if-ne v2, v3, :cond_0

    invoke-virtual {p1}, Ljava/io/DataInputStream;->read()I

    move-result v2

    const/16 v3, 0x41

    if-ne v2, v3, :cond_0

    invoke-virtual {p1}, Ljava/io/DataInputStream;->read()I

    move-result v2

    const/16 v3, 0x54

    if-ne v2, v3, :cond_0

    .line 79
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I

    move-result v2

    aput v2, p2, v1

    .line 80
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    aput v1, p2, v0

    .line 81
    const/4 v1, 0x2

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I

    move-result v2

    aput v2, p2, v1

    .line 85
    :goto_0
    return v0

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method a(Ljava/io/File;[I)Z
    .locals 4

    .prologue
    .line 46
    const/4 v0, 0x0

    .line 48
    :try_start_0
    new-instance v1, Ljava/io/DataInputStream;

    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    :try_start_1
    invoke-virtual {v1}, Ljava/io/DataInputStream;->read()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 66
    :pswitch_0
    if-eqz v1, :cond_0

    .line 68
    :try_start_2
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5

    .line 74
    :cond_0
    :goto_0
    const/4 v0, 0x0

    :cond_1
    :goto_1
    return v0

    .line 53
    :pswitch_1
    :try_start_3
    invoke-virtual {p0, v1, p2}, Lcom/qihoo/antivirus/update/f;->a(Ljava/io/DataInputStream;[I)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result v0

    .line 66
    if-eqz v1, :cond_1

    .line 68
    :try_start_4
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_1

    .line 69
    :catch_0
    move-exception v1

    goto :goto_1

    .line 56
    :pswitch_2
    :try_start_5
    invoke-virtual {p0, v1, p1, p2}, Lcom/qihoo/antivirus/update/f;->a(Ljava/io/DataInputStream;Ljava/io/File;[I)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-result v0

    .line 66
    if-eqz v1, :cond_1

    .line 68
    :try_start_6
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_1

    .line 69
    :catch_1
    move-exception v1

    goto :goto_1

    .line 61
    :catch_2
    move-exception v1

    .line 66
    :goto_2
    if-eqz v0, :cond_0

    .line 68
    :try_start_7
    invoke-virtual {v0}, Ljava/io/DataInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3

    goto :goto_0

    .line 69
    :catch_3
    move-exception v0

    goto :goto_0

    .line 65
    :catchall_0
    move-exception v1

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    .line 66
    :goto_3
    if-eqz v1, :cond_2

    .line 68
    :try_start_8
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4

    .line 72
    :cond_2
    :goto_4
    throw v0

    .line 69
    :catch_4
    move-exception v1

    goto :goto_4

    :catch_5
    move-exception v0

    goto :goto_0

    .line 65
    :catchall_1
    move-exception v0

    goto :goto_3

    .line 61
    :catch_6
    move-exception v0

    move-object v0, v1

    goto :goto_2

    .line 50
    nop

    :pswitch_data_0
    .packed-switch 0x53
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
