.class public final Lcom/arist/model/b/a;
.super Landroid/database/sqlite/SQLiteOpenHelper;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const-string v0, "musicplayer.db"

    const/4 v1, 0x0

    const/16 v2, 0x3eb

    invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    iput-object p1, p0, Lcom/arist/model/b/a;->a:Landroid/content/Context;

    return-void
.end method

.method private a(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 11

    const/4 v10, 0x2

    const/4 v9, 0x3

    const/4 v8, 0x4

    const/4 v1, 0x0

    const/4 v6, 0x5

    const/16 v0, 0x18

    new-array v2, v0, [[I

    new-array v0, v6, [I

    aput-object v0, v2, v1

    const/4 v0, 0x1

    new-array v3, v6, [I

    const/16 v4, 0x12c

    aput v4, v3, v1

    const/16 v4, 0x12c

    aput v4, v3, v8

    aput-object v3, v2, v0

    new-array v0, v6, [I

    fill-array-data v0, :array_0

    aput-object v0, v2, v10

    new-array v0, v6, [I

    const/16 v3, 0x258

    aput v3, v0, v1

    const/16 v3, 0xc8

    aput v3, v0, v10

    const/16 v3, 0x190

    aput v3, v0, v9

    const/16 v3, 0x64

    aput v3, v0, v8

    aput-object v0, v2, v9

    new-array v0, v6, [I

    aput-object v0, v2, v8

    new-array v0, v6, [I

    const/16 v3, 0x12c

    aput v3, v0, v1

    const/16 v3, 0xc8

    aput v3, v0, v9

    const/16 v3, -0x64

    aput v3, v0, v8

    aput-object v0, v2, v6

    const/4 v0, 0x6

    new-array v3, v6, [I

    const/16 v4, 0x190

    aput v4, v3, v1

    const/4 v4, 0x1

    const/16 v5, 0x64

    aput v5, v3, v4

    const/16 v4, 0x384

    aput v4, v3, v10

    const/16 v4, 0x12c

    aput v4, v3, v9

    aput-object v3, v2, v0

    const/4 v0, 0x7

    new-array v3, v6, [I

    const/16 v4, 0x1f4

    aput v4, v3, v1

    const/4 v4, 0x1

    const/16 v5, 0x12c

    aput v5, v3, v4

    const/16 v4, 0x64

    aput v4, v3, v9

    const/16 v4, 0x12c

    aput v4, v3, v8

    aput-object v3, v2, v0

    const/16 v0, 0x8

    new-array v3, v6, [I

    fill-array-data v3, :array_1

    aput-object v3, v2, v0

    const/16 v0, 0x9

    new-array v3, v6, [I

    fill-array-data v3, :array_2

    aput-object v3, v2, v0

    const/16 v0, 0xa

    new-array v3, v6, [I

    fill-array-data v3, :array_3

    aput-object v3, v2, v0

    const/16 v0, 0xb

    new-array v3, v6, [I

    fill-array-data v3, :array_4

    aput-object v3, v2, v0

    const/16 v0, 0xc

    new-array v3, v6, [I

    const/16 v4, 0x258

    aput v4, v3, v1

    const/4 v4, 0x1

    const/16 v5, 0x190

    aput v5, v3, v4

    const/16 v4, 0x64

    aput v4, v3, v10

    aput-object v3, v2, v0

    const/16 v0, 0xd

    new-array v3, v6, [I

    const/16 v4, 0x64

    aput v4, v3, v10

    const/16 v4, 0x190

    aput v4, v3, v9

    const/16 v4, 0x258

    aput v4, v3, v8

    aput-object v3, v2, v0

    const/16 v0, 0xe

    new-array v3, v6, [I

    fill-array-data v3, :array_5

    aput-object v3, v2, v0

    const/16 v0, 0xf

    new-array v3, v6, [I

    fill-array-data v3, :array_6

    aput-object v3, v2, v0

    const/16 v0, 0x10

    new-array v3, v6, [I

    const/16 v4, 0x258

    aput v4, v3, v1

    const/4 v4, 0x1

    const/16 v5, 0x1f4

    aput v5, v3, v4

    const/16 v4, 0x12c

    aput v4, v3, v9

    const/16 v4, 0x32

    aput v4, v3, v8

    aput-object v3, v2, v0

    const/16 v0, 0x11

    new-array v3, v6, [I

    const/16 v4, 0x1f4

    aput v4, v3, v1

    const/4 v4, 0x1

    const/16 v5, 0x32

    aput v5, v3, v4

    const/16 v4, 0x15e

    aput v4, v3, v10

    const/16 v4, -0x1e0

    aput v4, v3, v8

    aput-object v3, v2, v0

    const/16 v0, 0x12

    new-array v3, v6, [I

    const/16 v4, 0x1f4

    aput v4, v3, v1

    const/4 v4, 0x1

    const/16 v5, 0x1e

    aput v5, v3, v4

    const/16 v4, 0x1e

    aput v4, v3, v9

    const/16 v4, 0x1f4

    aput v4, v3, v8

    aput-object v3, v2, v0

    const/16 v0, 0x13

    new-array v3, v6, [I

    const/16 v4, 0x15e

    aput v4, v3, v1

    const/16 v4, -0x64

    aput v4, v3, v10

    const/16 v4, -0x32

    aput v4, v3, v9

    const/16 v4, 0x12c

    aput v4, v3, v8

    aput-object v3, v2, v0

    const/16 v0, 0x14

    new-array v3, v6, [I

    const/16 v4, 0x226

    aput v4, v3, v1

    const/16 v4, -0x78

    aput v4, v3, v10

    const/16 v4, -0x190

    aput v4, v3, v9

    const/16 v4, 0x12c

    aput v4, v3, v8

    aput-object v3, v2, v0

    const/16 v0, 0x15

    new-array v3, v6, [I

    const/16 v4, -0x12c

    aput v4, v3, v1

    const/16 v4, 0x12c

    aput v4, v3, v10

    const/16 v4, -0x64

    aput v4, v3, v9

    const/16 v4, 0x64

    aput v4, v3, v8

    aput-object v3, v2, v0

    const/16 v0, 0x16

    new-array v3, v6, [I

    fill-array-data v3, :array_7

    aput-object v3, v2, v0

    const/16 v0, 0x17

    new-array v3, v6, [I

    fill-array-data v3, :array_8

    aput-object v3, v2, v0

    iget-object v0, p0, Lcom/arist/model/b/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f0c0003

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v3

    const-string v0, "create table if not exists effect (_id integer primary key autoincrement,name varchar(10) not null,b1 integer not null, b2 integer not null, b3 integer not null, b4 integer not null, b5 integer not null)"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    if-eqz v3, :cond_0

    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    move v0, v1

    :goto_0
    array-length v5, v3

    if-lt v0, v5, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-virtual {v4}, Landroid/content/ContentValues;->clear()V

    const-string v5, "name"

    aget-object v6, v3, v0

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "b1"

    aget-object v6, v2, v0

    aget v6, v6, v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v5, "b2"

    aget-object v6, v2, v0

    const/4 v7, 0x1

    aget v6, v6, v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v5, "b3"

    aget-object v6, v2, v0

    aget v6, v6, v10

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v5, "b4"

    aget-object v6, v2, v0

    aget v6, v6, v9

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v5, "b5"

    aget-object v6, v2, v0

    aget v6, v6, v8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v5, "effect"

    const/4 v6, 0x0

    invoke-virtual {p1, v5, v6, v4}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :array_0
    .array-data 4
        0x1f4
        0x12c
        -0xc8
        0x190
        0x190
    .end array-data

    :array_1
    .array-data 4
        0x190
        0xc8
        -0xc8
        0xc8
        0x1f4
    .end array-data

    :array_2
    .array-data 4
        -0x64
        0xc8
        0x1f4
        0x64
        -0xc8
    .end array-data

    :array_3
    .array-data 4
        0x1f4
        0x12c
        -0x64
        0x12c
        0x1f4
    .end array-data

    :array_4
    .array-data 4
        0x1f4
        0x12c
        0xc8
        0x190
        0x190
    .end array-data

    :array_5
    .array-data 4
        0x258
        0x12c
        0x64
        0x12c
        0x258
    .end array-data

    :array_6
    .array-data 4
        -0x12c
        -0xc8
        0x12c
        0x118
        -0x64
    .end array-data

    :array_7
    .array-data 4
        0x12c
        0xc8
        0xfa
        0x1a4
        0x19a
    .end array-data

    :array_8
    .array-data 4
        0x208
        0x12c
        -0x12c
        0xfa
        0x190
    .end array-data
.end method


# virtual methods
.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    const-string v0, "create table if not exists musictbl(_id integer primary key ,title text not null,data text not null,size long,duration int not null,album text,album_pic text,album_id integer,folder_path text,date integer,artist text,artist_pic text, play_time integer default 0)"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "create table if not exists playlist (_id integer primary key autoincrement,name text not null, sort integer default 0, setup_time integer not null)"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "create table if not exists music_playlist (_id integer primary key autoincrement,m_id integer not null,p_id integer not null,foreign key(m_id) references musictbl(_id) on delete cascade on update cascade,foreign key(p_id) references playlist(_id) on delete cascade on update cascade)"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "name"

    iget-object v2, p0, Lcom/arist/model/b/a;->a:Landroid/content/Context;

    const v3, 0x7f0900d6

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "setup_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v2}, Lcom/arist/c/h;->a(Ljava/lang/Long;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "playlist"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    invoke-direct {p0, p1}, Lcom/arist/model/b/a;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    const/16 v0, 0x3e8

    if-ge p2, v0, :cond_0

    const-string v0, "DROP TABLE IF EXISTS music_playlist"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS musictbl"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS playlist"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS effect"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/arist/model/b/a;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V

    :cond_0
    packed-switch p2, :pswitch_data_0

    :goto_0
    :pswitch_0
    return-void

    :pswitch_1
    const-string v0, "ALTER TABLE musictbl ADD play_time integer default 0"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :pswitch_2
    const-string v0, "ALTER TABLE playlist ADD sort integer default 0"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x3e8
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
