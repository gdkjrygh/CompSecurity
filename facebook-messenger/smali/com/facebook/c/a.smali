.class abstract Lcom/facebook/c/a;
.super Landroid/content/ContentProvider;
.source "AbstractContentProvider.java"


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    .line 29
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/facebook/c/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method protected abstract a(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
.end method

.method protected abstract a(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
.end method

.method protected a(Landroid/net/Uri;[Landroid/content/ContentValues;)I
    .locals 1

    .prologue
    .line 48
    invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->bulkInsert(Landroid/net/Uri;[Landroid/content/ContentValues;)I

    move-result v0

    return v0
.end method

.method protected a(Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;
    .locals 1

    .prologue
    .line 109
    const/4 v0, 0x0

    return-object v0
.end method

.method protected abstract a(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
.end method

.method protected a(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .prologue
    .line 129
    invoke-virtual/range {p0 .. p5}, Lcom/facebook/c/a;->a(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method protected abstract a(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
.end method

.method protected a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 56
    const/4 v0, 0x0

    return-object v0
.end method

.method protected abstract a(Landroid/net/Uri;)Ljava/lang/String;
.end method

.method protected a()V
    .locals 0

    .prologue
    .line 198
    return-void
.end method

.method protected a(I)V
    .locals 0

    .prologue
    .line 155
    return-void
.end method

.method protected a(Landroid/content/res/Configuration;)V
    .locals 0

    .prologue
    .line 177
    invoke-super {p0, p1}, Landroid/content/ContentProvider;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 178
    return-void
.end method

.method protected a(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/content/ContentProviderOperation;",
            ">;)[",
            "Landroid/content/ContentProviderResult;"
        }
    .end annotation

    .prologue
    .line 39
    invoke-super {p0, p1}, Landroid/content/ContentProvider;->applyBatch(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;

    move-result-object v0

    return-object v0
.end method

.method protected a(Landroid/net/Uri;Ljava/lang/String;)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 70
    const/4 v0, 0x0

    return-object v0
.end method

.method public final applyBatch(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/content/ContentProviderOperation;",
            ">;)[",
            "Landroid/content/ContentProviderResult;"
        }
    .end annotation

    .prologue
    .line 268
    invoke-virtual {p0}, Lcom/facebook/c/a;->l()V

    .line 269
    invoke-virtual {p0, p1}, Lcom/facebook/c/a;->a(Ljava/util/ArrayList;)[Landroid/content/ContentProviderResult;

    move-result-object v0

    return-object v0
.end method

.method protected b(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    .locals 1

    .prologue
    .line 91
    invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->openAssetFile(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v0

    return-object v0
.end method

.method public final bulkInsert(Landroid/net/Uri;[Landroid/content/ContentValues;)I
    .locals 1

    .prologue
    .line 249
    invoke-virtual {p0}, Lcom/facebook/c/a;->l()V

    .line 250
    invoke-virtual {p0, p1, p2}, Lcom/facebook/c/a;->a(Landroid/net/Uri;[Landroid/content/ContentValues;)I

    move-result v0

    return v0
.end method

.method protected c(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 1

    .prologue
    .line 100
    invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->openFile(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    return-object v0
.end method

.method public final call(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 255
    invoke-virtual {p0}, Lcom/facebook/c/a;->l()V

    .line 256
    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/c/a;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 261
    invoke-virtual {p0}, Lcom/facebook/c/a;->l()V

    .line 262
    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/c/a;->a(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method protected f()V
    .locals 0

    .prologue
    .line 147
    return-void
.end method

.method protected g()V
    .locals 0

    .prologue
    .line 162
    return-void
.end method

.method public final getStreamTypes(Landroid/net/Uri;Ljava/lang/String;)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 274
    invoke-virtual {p0}, Lcom/facebook/c/a;->l()V

    .line 275
    invoke-virtual {p0, p1, p2}, Lcom/facebook/c/a;->a(Landroid/net/Uri;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 280
    invoke-virtual {p0}, Lcom/facebook/c/a;->l()V

    .line 281
    invoke-virtual {p0, p1}, Lcom/facebook/c/a;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected h()Z
    .locals 1

    .prologue
    .line 169
    invoke-super {p0}, Landroid/content/ContentProvider;->isTemporary()Z

    move-result v0

    return v0
.end method

.method protected i()Z
    .locals 1

    .prologue
    .line 211
    const/4 v0, 0x0

    return v0
.end method

.method public final insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 1

    .prologue
    .line 286
    invoke-virtual {p0}, Lcom/facebook/c/a;->l()V

    .line 287
    invoke-virtual {p0, p1, p2}, Lcom/facebook/c/a;->a(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method protected final isTemporary()Z
    .locals 1

    .prologue
    .line 332
    invoke-virtual {p0}, Lcom/facebook/c/a;->l()V

    .line 333
    invoke-virtual {p0}, Lcom/facebook/c/a;->h()Z

    move-result v0

    return v0
.end method

.method protected final j()V
    .locals 3

    .prologue
    .line 215
    iget-object v1, p0, Lcom/facebook/c/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    monitor-enter v1

    .line 216
    :try_start_0
    iget-object v0, p0, Lcom/facebook/c/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 217
    invoke-virtual {p0}, Lcom/facebook/c/a;->a()V

    .line 218
    iget-object v0, p0, Lcom/facebook/c/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 220
    :cond_0
    monitor-exit v1

    .line 221
    return-void

    .line 220
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected final k()V
    .locals 1

    .prologue
    .line 224
    invoke-virtual {p0}, Lcom/facebook/c/a;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 225
    invoke-static {}, Lcom/facebook/c/p;->a()V

    .line 227
    :cond_0
    return-void
.end method

.method protected final l()V
    .locals 0

    .prologue
    .line 230
    invoke-virtual {p0}, Lcom/facebook/c/a;->j()V

    .line 231
    invoke-virtual {p0}, Lcom/facebook/c/a;->k()V

    .line 232
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .prologue
    .line 338
    invoke-virtual {p0}, Lcom/facebook/c/a;->l()V

    .line 339
    invoke-virtual {p0, p1}, Lcom/facebook/c/a;->a(Landroid/content/res/Configuration;)V

    .line 340
    return-void
.end method

.method public final onCreate()Z
    .locals 1

    .prologue
    .line 244
    const/4 v0, 0x1

    return v0
.end method

.method public final onLowMemory()V
    .locals 1

    .prologue
    .line 368
    iget-object v0, p0, Lcom/facebook/c/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 377
    :goto_0
    return-void

    .line 374
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/c/a;->l()V

    .line 375
    invoke-super {p0}, Landroid/content/ContentProvider;->onLowMemory()V

    .line 376
    invoke-virtual {p0}, Lcom/facebook/c/a;->g()V

    goto :goto_0
.end method

.method public final onTrimMemory(I)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    .line 355
    iget-object v0, p0, Lcom/facebook/c/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 364
    :goto_0
    return-void

    .line 361
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/c/a;->l()V

    .line 362
    invoke-super {p0, p1}, Landroid/content/ContentProvider;->onTrimMemory(I)V

    .line 363
    invoke-virtual {p0, p1}, Lcom/facebook/c/a;->a(I)V

    goto :goto_0
.end method

.method public final openAssetFile(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    .locals 1

    .prologue
    .line 293
    invoke-virtual {p0}, Lcom/facebook/c/a;->l()V

    .line 294
    invoke-virtual {p0, p1, p2}, Lcom/facebook/c/a;->b(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v0

    return-object v0
.end method

.method public final openFile(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    .locals 1

    .prologue
    .line 299
    invoke-virtual {p0}, Lcom/facebook/c/a;->l()V

    .line 300
    invoke-virtual {p0, p1, p2}, Lcom/facebook/c/a;->c(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    return-object v0
.end method

.method public final openTypedAssetFile(Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;
    .locals 1

    .prologue
    .line 305
    invoke-virtual {p0}, Lcom/facebook/c/a;->l()V

    .line 306
    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/c/a;->a(Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v0

    return-object v0
.end method

.method public final query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    .prologue
    .line 312
    invoke-virtual {p0}, Lcom/facebook/c/a;->l()V

    .line 313
    invoke-virtual/range {p0 .. p5}, Lcom/facebook/c/a;->a(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public final query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .prologue
    .line 320
    invoke-virtual {p0}, Lcom/facebook/c/a;->l()V

    .line 321
    invoke-virtual/range {p0 .. p6}, Lcom/facebook/c/a;->a(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public final shutdown()V
    .locals 1

    .prologue
    .line 344
    iget-object v0, p0, Lcom/facebook/c/a;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 350
    :goto_0
    return-void

    .line 348
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/c/a;->l()V

    .line 349
    invoke-virtual {p0}, Lcom/facebook/c/a;->f()V

    goto :goto_0
.end method

.method public final update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .prologue
    .line 326
    invoke-virtual {p0}, Lcom/facebook/c/a;->l()V

    .line 327
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/facebook/c/a;->a(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method
