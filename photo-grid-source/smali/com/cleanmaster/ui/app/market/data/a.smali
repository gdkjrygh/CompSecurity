.class public Lcom/cleanmaster/ui/app/market/data/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:J

.field public h:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput v1, p0, Lcom/cleanmaster/ui/app/market/data/a;->a:I

    .line 23
    const/4 v0, 0x0

    iput v0, p0, Lcom/cleanmaster/ui/app/market/data/a;->b:I

    .line 24
    iput v1, p0, Lcom/cleanmaster/ui/app/market/data/a;->c:I

    .line 25
    iput v1, p0, Lcom/cleanmaster/ui/app/market/data/a;->d:I

    .line 26
    iput v1, p0, Lcom/cleanmaster/ui/app/market/data/a;->e:I

    .line 27
    iput v1, p0, Lcom/cleanmaster/ui/app/market/data/a;->f:I

    .line 28
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/cleanmaster/ui/app/market/data/a;->g:J

    .line 29
    const-string v0, ""

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/data/a;->h:Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CREATE TABLE IF NOT EXISTS "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "(_id INTEGER PRIMARY KEY,pos_id TEXT,show_type TEXT,total_ads INTEGER ,x_mtime INTEGER );"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 78
    return-void
.end method


# virtual methods
.method public a()Landroid/content/ContentValues;
    .locals 4

    .prologue
    .line 48
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 49
    const-string v1, "pos_id"

    iget-object v2, p0, Lcom/cleanmaster/ui/app/market/data/a;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    const-string v1, "total_ads"

    iget v2, p0, Lcom/cleanmaster/ui/app/market/data/a;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 51
    const-string v1, "show_type"

    iget v2, p0, Lcom/cleanmaster/ui/app/market/data/a;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 52
    const-string v1, "x_mtime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 53
    return-object v0
.end method

.method public a(Ljava/lang/String;)Landroid/content/ContentValues;
    .locals 1

    .prologue
    .line 58
    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/data/a;->a()Landroid/content/ContentValues;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/database/Cursor;)Lcom/cleanmaster/ui/app/market/data/a;
    .locals 4

    .prologue
    .line 63
    new-instance v0, Lcom/cleanmaster/ui/app/market/data/a;

    invoke-direct {v0}, Lcom/cleanmaster/ui/app/market/data/a;-><init>()V

    .line 64
    const-string v1, "pos_id"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/cleanmaster/ui/app/market/data/a;->h:Ljava/lang/String;

    .line 65
    const-string v1, "total_ads"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    iput v1, v0, Lcom/cleanmaster/ui/app/market/data/a;->f:I

    .line 66
    const-string v1, "show_type"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    iput v1, v0, Lcom/cleanmaster/ui/app/market/data/a;->e:I

    .line 67
    const-string v1, "x_mtime"

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    iput-wide v2, v0, Lcom/cleanmaster/ui/app/market/data/a;->g:J

    .line 68
    return-object v0
.end method

.method public a(Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 34
    :try_start_0
    const-string v0, "code"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/cleanmaster/ui/app/market/data/a;->a:I

    .line 35
    const-string v0, "adn"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/cleanmaster/ui/app/market/data/a;->b:I

    .line 36
    const-string v0, "offset"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/cleanmaster/ui/app/market/data/a;->c:I

    .line 37
    const-string v0, "show_rating"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/cleanmaster/ui/app/market/data/a;->d:I

    .line 38
    const-string v0, "show_type"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/cleanmaster/ui/app/market/data/a;->e:I

    .line 39
    const-string v0, "total_ads"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/cleanmaster/ui/app/market/data/a;->f:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    :goto_0
    return-object p0

    .line 41
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .prologue
    .line 82
    const-string v0, "(:pos_id %s :code %d :total_ads %d :show_type %d :show_rating %d :x_mtime %d)"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/cleanmaster/ui/app/market/data/a;->h:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget v3, p0, Lcom/cleanmaster/ui/app/market/data/a;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget v3, p0, Lcom/cleanmaster/ui/app/market/data/a;->f:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget v3, p0, Lcom/cleanmaster/ui/app/market/data/a;->e:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x4

    iget v3, p0, Lcom/cleanmaster/ui/app/market/data/a;->d:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x5

    iget-wide v4, p0, Lcom/cleanmaster/ui/app/market/data/a;->g:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
