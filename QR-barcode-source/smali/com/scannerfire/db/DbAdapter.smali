.class public Lcom/scannerfire/db/DbAdapter;
.super Ljava/lang/Object;
.source "DbAdapter.java"


# static fields
.field private static final DATABASE_TABLE:Ljava/lang/String; = "scans"

.field public static final KEY_BYTE:Ljava/lang/String; = "byte"

.field public static final KEY_DATE:Ljava/lang/String; = "date"

.field public static final KEY_FORMAT:Ljava/lang/String; = "format"

.field public static final KEY_RECORDID:Ljava/lang/String; = "_id"

.field public static final KEY_RESULT_X:Ljava/lang/String; = "result_x"

.field public static final KEY_RESULT_Y:Ljava/lang/String; = "result_y"

.field public static final KEY_TEXT:Ljava/lang/String; = "text"

.field public static final KEY_TIME:Ljava/lang/String; = "time"

.field private static final LOG_TAG:Ljava/lang/String;


# instance fields
.field private context:Landroid/content/Context;

.field private database:Landroid/database/sqlite/SQLiteDatabase;

.field private dbHelper:Lcom/scannerfire/db/DatabaseHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/scannerfire/db/DbAdapter;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/scannerfire/db/DbAdapter;->LOG_TAG:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/scannerfire/db/DbAdapter;->context:Landroid/content/Context;

    .line 48
    return-void
.end method

.method private createContentValues(Lcom/google/zxing/Result;Ljava/lang/String;Ljava/lang/String;)Landroid/content/ContentValues;
    .locals 4
    .param p1, "r"    # Lcom/google/zxing/Result;
    .param p2, "time"    # Ljava/lang/String;
    .param p3, "date"    # Ljava/lang/String;

    .prologue
    const/4 v3, 0x0

    .line 65
    if-nez p1, :cond_0

    .line 66
    const/4 v0, 0x0

    .line 78
    :goto_0
    return-object v0

    .line 68
    :cond_0
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 69
    .local v0, "values":Landroid/content/ContentValues;
    const-string v1, "text"

    invoke-virtual {p1}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    const-string v1, "byte"

    invoke-virtual {p1}, Lcom/google/zxing/Result;->getRawBytes()[B

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 71
    invoke-virtual {p1}, Lcom/google/zxing/Result;->getResultPoints()[Lcom/google/zxing/ResultPoint;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/google/zxing/Result;->getResultPoints()[Lcom/google/zxing/ResultPoint;

    move-result-object v1

    aget-object v1, v1, v3

    if-eqz v1, :cond_1

    .line 72
    const-string v1, "result_x"

    invoke-virtual {p1}, Lcom/google/zxing/Result;->getResultPoints()[Lcom/google/zxing/ResultPoint;

    move-result-object v2

    aget-object v2, v2, v3

    invoke-virtual {v2}, Lcom/google/zxing/ResultPoint;->getX()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Float;)V

    .line 73
    const-string v1, "result_y"

    invoke-virtual {p1}, Lcom/google/zxing/Result;->getResultPoints()[Lcom/google/zxing/ResultPoint;

    move-result-object v2

    aget-object v2, v2, v3

    invoke-virtual {v2}, Lcom/google/zxing/ResultPoint;->getY()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Float;)V

    .line 75
    :cond_1
    const-string v1, "format"

    invoke-virtual {p1}, Lcom/google/zxing/Result;->getBarcodeFormat()Lcom/google/zxing/BarcodeFormat;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/zxing/BarcodeFormat;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    const-string v1, "time"

    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    const-string v1, "date"

    invoke-virtual {v0, v1, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public close()V
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/scannerfire/db/DbAdapter;->dbHelper:Lcom/scannerfire/db/DatabaseHelper;

    invoke-virtual {v0}, Lcom/scannerfire/db/DatabaseHelper;->close()V

    .line 58
    return-void
.end method

.method public createRecord(Lcom/google/zxing/Result;Ljava/lang/String;Ljava/lang/String;)J
    .locals 6
    .param p1, "result"    # Lcom/google/zxing/Result;
    .param p2, "time"    # Ljava/lang/String;
    .param p3, "date"    # Ljava/lang/String;

    .prologue
    .line 83
    invoke-direct {p0, p1, p2, p3}, Lcom/scannerfire/db/DbAdapter;->createContentValues(Lcom/google/zxing/Result;Ljava/lang/String;Ljava/lang/String;)Landroid/content/ContentValues;

    move-result-object v2

    .line 84
    .local v2, "initialValues":Landroid/content/ContentValues;
    if-nez v2, :cond_0

    .line 85
    iget-object v3, p0, Lcom/scannerfire/db/DbAdapter;->context:Landroid/content/Context;

    check-cast v3, Landroid/app/Activity;

    const-string v4, "Error: impossible to save into database"

    invoke-static {v3, v4}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    .line 86
    const-wide/16 v0, -0x1

    .line 89
    :goto_0
    return-wide v0

    .line 88
    :cond_0
    iget-object v3, p0, Lcom/scannerfire/db/DbAdapter;->database:Landroid/database/sqlite/SQLiteDatabase;

    const-string v4, "scans"

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5, v2}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v0

    .line 89
    .local v0, "id":J
    goto :goto_0
.end method

.method public deleteAll()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 61
    iget-object v0, p0, Lcom/scannerfire/db/DbAdapter;->database:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "scans"

    invoke-virtual {v0, v1, v2, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 62
    return-void
.end method

.method public deleteRecord(J)Z
    .locals 5
    .param p1, "recordID"    # J

    .prologue
    .line 94
    iget-object v0, p0, Lcom/scannerfire/db/DbAdapter;->database:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "scans"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "_id="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 95
    const/4 v3, 0x0

    .line 94
    invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public fetchAllRecords()Landroid/database/Cursor;
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 100
    const-string v0, ""

    const-string v1, " QUERY EFFETTUTATA "

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    iget-object v0, p0, Lcom/scannerfire/db/DbAdapter;->database:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "scans"

    const/16 v2, 0x8

    new-array v2, v2, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "_id"

    aput-object v5, v2, v4

    const/4 v4, 0x1

    .line 102
    const-string v5, "text"

    aput-object v5, v2, v4

    const/4 v4, 0x2

    const-string v5, "byte"

    aput-object v5, v2, v4

    const/4 v4, 0x3

    const-string v5, "result_x"

    aput-object v5, v2, v4

    const/4 v4, 0x4

    const-string v5, "result_y"

    aput-object v5, v2, v4

    const/4 v4, 0x5

    const-string v5, "format"

    aput-object v5, v2, v4

    const/4 v4, 0x6

    .line 103
    const-string v5, "time"

    aput-object v5, v2, v4

    const/4 v4, 0x7

    const-string v5, "date"

    aput-object v5, v2, v4

    const-string v7, "date ASC"

    move-object v4, v3

    move-object v5, v3

    move-object v6, v3

    .line 101
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public getStringValues()Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<[",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 170
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 171
    .local v0, "arr":Ljava/util/ArrayList;, "Ljava/util/ArrayList<[Ljava/lang/String;>;"
    const/4 v8, 0x4

    new-array v8, v8, [Ljava/lang/String;

    const/4 v9, 0x0

    const-string v10, "FORMAT"

    aput-object v10, v8, v9

    const/4 v9, 0x1

    const-string v10, "TEXT"

    aput-object v10, v8, v9

    const/4 v9, 0x2

    const-string v10, "TIME"

    aput-object v10, v8, v9

    const/4 v9, 0x3

    const-string v10, "DATE"

    aput-object v10, v8, v9

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    const-string v5, "SELECT * FROM scans"

    .line 173
    .local v5, "query":Ljava/lang/String;
    iget-object v8, p0, Lcom/scannerfire/db/DbAdapter;->database:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v9, 0x0

    invoke-virtual {v8, v5, v9}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    .line 174
    .local v2, "cursor":Landroid/database/Cursor;
    if-eqz v2, :cond_0

    .line 175
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 176
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v8

    if-lt v4, v8, :cond_1

    .line 186
    .end local v4    # "i":I
    :cond_0
    return-object v0

    .line 177
    .restart local v4    # "i":I
    :cond_1
    const/4 v8, 0x5

    invoke-interface {v2, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 178
    .local v1, "barcode":Ljava/lang/String;
    new-instance v8, Ljava/lang/StringBuilder;

    const/16 v9, 0x22

    invoke-static {v9}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v9, 0x1

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    const-string v10, "(\r\n|\n)"

    const-string v11, " "

    invoke-virtual {v9, v10, v11}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const/16 v9, 0x22

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 179
    .local v6, "resultText":Ljava/lang/String;
    const-string v8, ""

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Result Text -> "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 180
    const/4 v8, 0x6

    invoke-interface {v2, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 181
    .local v7, "time":Ljava/lang/String;
    const/4 v8, 0x7

    invoke-interface {v2, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 182
    .local v3, "date":Ljava/lang/String;
    const/4 v8, 0x4

    new-array v8, v8, [Ljava/lang/String;

    const/4 v9, 0x0

    aput-object v1, v8, v9

    const/4 v9, 0x1

    aput-object v6, v8, v9

    const/4 v9, 0x2

    aput-object v7, v8, v9

    const/4 v9, 0x3

    aput-object v3, v8, v9

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 176
    add-int/lit8 v4, v4, 0x1

    goto :goto_0
.end method

.method public getValues()Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/scannerfire/model/QRModel;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v11, 0x1

    const/4 v10, 0x0

    .line 108
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .local v0, "arr":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/scannerfire/model/QRModel;>;"
    const-string v5, "SELECT * FROM scans ORDER BY _id DESC"

    .line 110
    .local v5, "query":Ljava/lang/String;
    iget-object v7, p0, Lcom/scannerfire/db/DbAdapter;->database:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v8, 0x0

    invoke-virtual {v7, v5, v8}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    .line 111
    .local v2, "cursor":Landroid/database/Cursor;
    if-eqz v2, :cond_0

    .line 112
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 113
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v7

    if-lt v3, v7, :cond_1

    .line 129
    .end local v3    # "i":I
    :cond_0
    return-object v0

    .line 114
    .restart local v3    # "i":I
    :cond_1
    new-instance v4, Lcom/scannerfire/model/QRModel;

    invoke-direct {v4}, Lcom/scannerfire/model/QRModel;-><init>()V

    .line 116
    .local v4, "model":Lcom/scannerfire/model/QRModel;
    new-array v6, v11, [Lcom/google/zxing/ResultPoint;

    new-instance v7, Lcom/google/zxing/ResultPoint;

    const/4 v8, 0x3

    invoke-interface {v2, v8}, Landroid/database/Cursor;->getFloat(I)F

    move-result v8

    .line 117
    const/4 v9, 0x4

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getFloat(I)F

    move-result v9

    invoke-direct {v7, v8, v9}, Lcom/google/zxing/ResultPoint;-><init>(FF)V

    aput-object v7, v6, v10

    .line 118
    .local v6, "res":[Lcom/google/zxing/ResultPoint;
    const/4 v7, 0x5

    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/google/zxing/BarcodeFormat;->valueOf(Ljava/lang/String;)Lcom/google/zxing/BarcodeFormat;

    move-result-object v1

    .line 119
    .local v1, "bar":Lcom/google/zxing/BarcodeFormat;
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    invoke-virtual {v4, v7}, Lcom/scannerfire/model/QRModel;->setId(I)V

    .line 121
    new-instance v7, Lcom/google/zxing/Result;

    invoke-interface {v2, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 122
    const/4 v9, 0x2

    invoke-interface {v2, v9}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v9

    invoke-direct {v7, v8, v9, v6, v1}, Lcom/google/zxing/Result;-><init>(Ljava/lang/String;[B[Lcom/google/zxing/ResultPoint;Lcom/google/zxing/BarcodeFormat;)V

    .line 121
    invoke-virtual {v4, v7}, Lcom/scannerfire/model/QRModel;->setResult(Lcom/google/zxing/Result;)V

    .line 123
    const/4 v7, 0x6

    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Lcom/scannerfire/model/QRModel;->setTime(Ljava/lang/String;)V

    .line 124
    const/4 v7, 0x7

    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Lcom/scannerfire/model/QRModel;->setDate(Ljava/lang/String;)V

    .line 125
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 113
    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method

.method public open()Lcom/scannerfire/db/DbAdapter;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;
        }
    .end annotation

    .prologue
    .line 51
    new-instance v0, Lcom/scannerfire/db/DatabaseHelper;

    iget-object v1, p0, Lcom/scannerfire/db/DbAdapter;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/scannerfire/db/DatabaseHelper;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/scannerfire/db/DbAdapter;->dbHelper:Lcom/scannerfire/db/DatabaseHelper;

    .line 52
    iget-object v0, p0, Lcom/scannerfire/db/DbAdapter;->dbHelper:Lcom/scannerfire/db/DatabaseHelper;

    invoke-virtual {v0}, Lcom/scannerfire/db/DatabaseHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/scannerfire/db/DbAdapter;->database:Landroid/database/sqlite/SQLiteDatabase;

    .line 53
    return-object p0
.end method

.method public saveCSV(Ljava/lang/String;)Z
    .locals 10
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    const/4 v6, 0x0

    .line 137
    :try_start_0
    invoke-virtual {p0}, Lcom/scannerfire/db/DbAdapter;->open()Lcom/scannerfire/db/DbAdapter;

    .line 138
    invoke-virtual {p0}, Lcom/scannerfire/db/DbAdapter;->getStringValues()Ljava/util/List;

    move-result-object v1

    .line 140
    .local v1, "db":Ljava/util/List;, "Ljava/util/List<[Ljava/lang/String;>;"
    sget-object v7, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static {v7}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    .line 143
    .local v3, "exportDir":Ljava/io/File;
    const-string v7, ""

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Cartella di esportazione CSV -> "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 145
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 147
    :cond_0
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 149
    .local v4, "file":Ljava/io/File;
    invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z

    .line 150
    new-instance v0, Lau/com/bytecode/opencsv/CSVWriter;

    new-instance v7, Ljava/io/FileWriter;

    invoke-direct {v7, v4}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v7}, Lau/com/bytecode/opencsv/CSVWriter;-><init>(Ljava/io/Writer;)V

    .line 152
    .local v0, "csvWrite":Lau/com/bytecode/opencsv/CSVWriter;
    invoke-virtual {v0, v1}, Lau/com/bytecode/opencsv/CSVWriter;->writeAll(Ljava/util/List;)V

    .line 153
    invoke-virtual {v0}, Lau/com/bytecode/opencsv/CSVWriter;->close()V

    .line 154
    invoke-virtual {p0}, Lcom/scannerfire/db/DbAdapter;->close()V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 164
    iget-object v7, p0, Lcom/scannerfire/db/DbAdapter;->context:Landroid/content/Context;

    const v8, 0x7f080151

    invoke-static {v7, v8, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v6

    invoke-virtual {v6}, Landroid/widget/Toast;->show()V

    .line 165
    const/4 v6, 0x1

    .end local v0    # "csvWrite":Lau/com/bytecode/opencsv/CSVWriter;
    .end local v1    # "db":Ljava/util/List;, "Ljava/util/List<[Ljava/lang/String;>;"
    .end local v3    # "exportDir":Ljava/io/File;
    .end local v4    # "file":Ljava/io/File;
    :goto_0
    return v6

    .line 156
    :catch_0
    move-exception v5

    .line 157
    .local v5, "sqlEx":Landroid/database/SQLException;
    const-string v7, "MainActivity"

    invoke-virtual {v5}, Landroid/database/SQLException;->getMessage()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 158
    iget-object v7, p0, Lcom/scannerfire/db/DbAdapter;->context:Landroid/content/Context;

    const-string v8, "SQLException"

    invoke-static {v7, v8, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v7

    invoke-virtual {v7}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 160
    .end local v5    # "sqlEx":Landroid/database/SQLException;
    :catch_1
    move-exception v2

    .line 161
    .local v2, "e":Ljava/io/IOException;
    const-string v7, "MainActivity"

    invoke-virtual {v2}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method
