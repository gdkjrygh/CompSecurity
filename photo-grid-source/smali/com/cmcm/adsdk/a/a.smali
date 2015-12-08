.class public final Lcom/cmcm/adsdk/a/a;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 14
    const-string v0, "ad_sdk.db"

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 15
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .prologue
    .line 19
    const-string v0, "posinfo"

    invoke-static {p1, v0}, Lcom/cmcm/adsdk/b/a/c;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    .line 20
    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    .prologue
    .line 24
    const-string v0, "posinfo"

    invoke-static {p1, v0}, Lcom/cmcm/adsdk/b/a/c;->b(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)V

    .line 25
    invoke-virtual {p0, p1}, Lcom/cmcm/adsdk/a/a;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 26
    return-void
.end method
