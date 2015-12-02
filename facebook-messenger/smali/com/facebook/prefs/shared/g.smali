.class Lcom/facebook/prefs/shared/g;
.super Ljava/lang/Object;
.source "FbSharedPreferencesContentProvider.java"


# instance fields
.field final synthetic a:Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;

.field private b:I

.field private c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;)V
    .locals 1

    .prologue
    .line 408
    iput-object p1, p0, Lcom/facebook/prefs/shared/g;->a:Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 409
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/prefs/shared/g;->c:Ljava/util/Set;

    .line 410
    return-void
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 421
    iget-object v0, p0, Lcom/facebook/prefs/shared/g;->c:Ljava/util/Set;

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 417
    iget-object v0, p0, Lcom/facebook/prefs/shared/g;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 418
    return-void
.end method

.method public b()I
    .locals 1

    .prologue
    .line 425
    iget v0, p0, Lcom/facebook/prefs/shared/g;->b:I

    return v0
.end method

.method public c()V
    .locals 1

    .prologue
    .line 431
    iget-object v0, p0, Lcom/facebook/prefs/shared/g;->a:Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;

    invoke-static {v0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->a(Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 432
    iget v0, p0, Lcom/facebook/prefs/shared/g;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/prefs/shared/g;->b:I

    .line 433
    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    .line 436
    iget-object v0, p0, Lcom/facebook/prefs/shared/g;->a:Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;

    invoke-static {v0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->a(Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 437
    return-void
.end method

.method public e()V
    .locals 1

    .prologue
    .line 440
    iget-object v0, p0, Lcom/facebook/prefs/shared/g;->a:Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;

    invoke-static {v0}, Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;->a(Lcom/facebook/prefs/shared/FbSharedPreferencesContentProvider;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 441
    iget v0, p0, Lcom/facebook/prefs/shared/g;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/facebook/prefs/shared/g;->b:I

    .line 442
    return-void
.end method
