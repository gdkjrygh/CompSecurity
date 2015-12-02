.class Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->c(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 289
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$3;->b:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$3;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 14

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 293
    new-instance v0, Ljava/io/File;

    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$3;->a:Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 294
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-nez v3, :cond_1

    .line 295
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$3;->b:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->j(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 296
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 361
    :goto_0
    return-void

    .line 299
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 300
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 305
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    .line 307
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v6

    .line 308
    if-nez v6, :cond_2

    .line 309
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$3;->b:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->j(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 310
    iput-object v4, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 311
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto :goto_0

    .line 315
    :cond_2
    array-length v7, v6

    move v3, v2

    :goto_1
    if-ge v3, v7, :cond_b

    aget-object v8, v6, v3

    .line 316
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v9, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 317
    invoke-virtual {v9}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 318
    invoke-virtual {v8}, Ljava/io/File;->isFile()Z

    move-result v10

    if-nez v10, :cond_5

    .line 319
    iget-object v10, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$3;->b:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v10}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->h(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Lcom/qihoo/security/opti/trashclear/filemanager/a;

    move-result-object v10

    invoke-virtual {v10, v0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->e(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_4

    .line 315
    :cond_3
    :goto_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 322
    :cond_4
    iget-object v10, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$3;->b:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v10}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->h(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Lcom/qihoo/security/opti/trashclear/filemanager/a;

    move-result-object v10

    invoke-virtual {v10, v0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->f(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 327
    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$3;->b:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->k(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v8}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 328
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$3;->b:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->l(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)J

    move-result-wide v10

    invoke-virtual {v8}, Ljava/io/File;->lastModified()J

    move-result-wide v12

    sub-long/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->abs(J)J

    move-result-wide v10

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$3;->b:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->m(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)J

    move-result-wide v12

    cmp-long v0, v10, v12

    if-lez v0, :cond_9

    move v0, v1

    .line 330
    :goto_3
    iget-object v10, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$3;->b:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v10}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->n(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Z

    move-result v10

    if-eqz v10, :cond_6

    if-nez v0, :cond_3

    :cond_6
    iget-object v10, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$3;->b:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v10}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->n(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Z

    move-result v10

    if-nez v10, :cond_7

    if-eqz v0, :cond_3

    .line 335
    :cond_7
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 336
    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/e;->a(Ljava/io/File;)Z

    move-result v10

    if-eqz v10, :cond_3

    .line 337
    sget-boolean v10, Lcom/qihoo/security/opti/trashclear/filemanager/e;->a:Z

    invoke-static {v0, v10}, Lcom/qihoo/security/opti/trashclear/filemanager/e;->a(Ljava/io/File;Z)Lcom/qihoo/security/opti/trashclear/filemanager/d;

    move-result-object v0

    .line 340
    invoke-virtual {v8}, Ljava/io/File;->isDirectory()Z

    move-result v8

    if-eqz v8, :cond_8

    .line 341
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 343
    invoke-virtual {v8}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v8

    .line 344
    if-eqz v8, :cond_a

    .line 345
    array-length v8, v8

    iput v8, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->e:I

    .line 350
    :cond_8
    :goto_4
    if-eqz v0, :cond_3

    .line 351
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_9
    move v0, v2

    .line 328
    goto :goto_3

    .line 347
    :cond_a
    iput v2, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->e:I

    goto :goto_4

    .line 358
    :cond_b
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$3;->b:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->j(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 359
    iput-object v4, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 360
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto/16 :goto_0
.end method
