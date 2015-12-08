.class final Lcom/kik/l/am$c;
.super Lkik/android/h/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/l/am;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1528
    const-string v0, "kikItemDatabase.db"

    const/16 v1, 0x13

    invoke-direct {p0, p1, v0, v1, p2}, Lkik/android/h/i;-><init>(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)V

    .line 1529
    return-void
.end method


# virtual methods
.method public final a(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    .prologue
    .line 1549
    const-string v0, "CREATE TABLE IF NOT EXISTS KIKItemsTable (_id INTEGER PRIMARY KEY AUTOINCREMENT, item_sku VARCHAR, formatted_price VARCHAR);"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 1553
    return-void
.end method

.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .prologue
    .line 1534
    const-string v0, "CREATE TABLE IF NOT EXISTS KIKItemsTable (_id INTEGER PRIMARY KEY AUTOINCREMENT, item_sku VARCHAR, formatted_price VARCHAR);"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 1538
    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    .prologue
    .line 1544
    return-void
.end method
