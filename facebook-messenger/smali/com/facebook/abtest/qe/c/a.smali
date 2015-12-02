.class public Lcom/facebook/abtest/qe/c/a;
.super Lcom/facebook/d/d/d;
.source "QuickExperimentDbSchemaPart.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 18
    const-class v0, Lcom/facebook/abtest/qe/c/a;

    sput-object v0, Lcom/facebook/abtest/qe/c/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 2
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .prologue
    .line 58
    const-string v0, "quick_experiment"

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1}, Lcom/facebook/d/d/d;-><init>(Ljava/lang/String;I)V

    .line 59
    return-void
.end method


# virtual methods
.method protected a(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .prologue
    .line 63
    const-string v0, "CREATE TABLE experiments (name TEXT, groupName TEXT, hash TEXT, loggingEnabled INTEGER, locale TEXT, customContentJSON TEXT, dataSource TEXT, meta_info TEXT,PRIMARY KEY (name, dataSource))"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 64
    return-void
.end method

.method protected a(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    .prologue
    .line 68
    const-string v0, "DROP TABLE IF EXISTS experiments"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 69
    invoke-virtual {p0, p1}, Lcom/facebook/abtest/qe/c/a;->a(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 70
    return-void
.end method

.method b(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 73
    const-string v0, "experiments"

    invoke-virtual {p1, v0, v1, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 74
    return-void
.end method
