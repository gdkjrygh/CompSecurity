.class public Lcom/cleanmaster/ui/app/market/data/PackageStatInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final VERSION:I = 0x2

.field private static final serialVersionUID:J = 0x62740ae8067fa107L


# instance fields
.field private mIsExpended:Z

.field private mPackageName:Ljava/lang/String;

.field private mVersionCode:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/data/PackageStatInfo;->mPackageName:Ljava/lang/String;

    .line 15
    iput v1, p0, Lcom/cleanmaster/ui/app/market/data/PackageStatInfo;->mVersionCode:I

    .line 16
    iput-boolean v1, p0, Lcom/cleanmaster/ui/app/market/data/PackageStatInfo;->mIsExpended:Z

    .line 24
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/data/PackageStatInfo;->mPackageName:Ljava/lang/String;

    .line 25
    return-void
.end method

.method public static createTable(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CREATE TABLE IF NOT EXISTS "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "(_id INTEGER PRIMARY KEY,pkg_name TEXT,version_code INTEGER);"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 80
    return-void
.end method

.method public static fromJSONObject(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/data/PackageStatInfo;
    .locals 5

    .prologue
    .line 48
    const/4 v1, 0x0

    .line 49
    if-eqz p0, :cond_0

    .line 51
    :try_start_0
    const-string v0, "pkg_name"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 52
    const-string v0, "version_code"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 53
    new-instance v0, Lcom/cleanmaster/ui/app/market/data/PackageStatInfo;

    invoke-direct {v0, v2}, Lcom/cleanmaster/ui/app/market/data/PackageStatInfo;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    :try_start_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/cleanmaster/ui/app/market/data/PackageStatInfo;->setVersionCode(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 59
    :goto_0
    return-object v0

    .line 56
    :catch_0
    move-exception v0

    move-object v4, v0

    move-object v0, v1

    move-object v1, v4

    :goto_1
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method


# virtual methods
.method public getPackageName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/data/PackageStatInfo;->mPackageName:Ljava/lang/String;

    return-object v0
.end method

.method public getVersionCode()I
    .locals 1

    .prologue
    .line 40
    iget v0, p0, Lcom/cleanmaster/ui/app/market/data/PackageStatInfo;->mVersionCode:I

    return v0
.end method

.method public isExpended()Z
    .locals 1

    .prologue
    .line 36
    iget-boolean v0, p0, Lcom/cleanmaster/ui/app/market/data/PackageStatInfo;->mIsExpended:Z

    return v0
.end method

.method public setExpended(Z)V
    .locals 0

    .prologue
    .line 32
    iput-boolean p1, p0, Lcom/cleanmaster/ui/app/market/data/PackageStatInfo;->mIsExpended:Z

    .line 33
    return-void
.end method

.method public setVersionCode(I)V
    .locals 0

    .prologue
    .line 28
    iput p1, p0, Lcom/cleanmaster/ui/app/market/data/PackageStatInfo;->mVersionCode:I

    .line 29
    return-void
.end method

.method public toContentValues()Landroid/content/ContentValues;
    .locals 3

    .prologue
    .line 68
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 69
    const-string v1, "pkg_name"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/data/PackageStatInfo;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    const-string v1, "version_code"

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/data/PackageStatInfo;->getVersionCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 71
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 64
    const-string v0, "%s : %d"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/data/PackageStatInfo;->getPackageName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-virtual {p0}, Lcom/cleanmaster/ui/app/market/data/PackageStatInfo;->getVersionCode()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
