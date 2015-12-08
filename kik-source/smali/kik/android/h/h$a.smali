.class final Lkik/android/h/h$a;
.super Lkik/android/h/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/h/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 163
    const-string v0, "kikCoreDatabase.db"

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Lkik/android/h/i;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 164
    return-void
.end method


# virtual methods
.method public final a(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .prologue
    .line 170
    return-void
.end method

.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    .prologue
    .line 177
    const-string v0, "CREATE TABLE %s (%s CHAR(36) PRIMARY KEY, %s BOOLEAN NOT NULL, %s VARCHAR);"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "CoreTable"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "core_id"

    aput-object v3, v1, v2

    const/4 v2, 0x2

    const-string v3, "is_active"

    aput-object v3, v1, v2

    const/4 v2, 0x3

    const-string v3, "username"

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 178
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 179
    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .prologue
    .line 185
    return-void
.end method
