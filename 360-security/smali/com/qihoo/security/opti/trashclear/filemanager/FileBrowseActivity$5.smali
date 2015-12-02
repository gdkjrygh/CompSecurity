.class Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$5;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->t()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/ArrayList;

.field final synthetic b:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;Ljava/util/ArrayList;)V
    .locals 0

    .prologue
    .line 683
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$5;->b:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$5;->a:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    .line 686
    const-wide/16 v0, 0x0

    .line 687
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$5;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-wide v2, v0

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;

    .line 688
    iget-boolean v1, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->g:Z

    if-eqz v1, :cond_1

    .line 692
    iget-boolean v1, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->d:Z

    if-eqz v1, :cond_0

    .line 694
    :try_start_0
    new-instance v1, Ljava/io/File;

    iget-object v5, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->b:Ljava/lang/String;

    invoke-direct {v1, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/filemanager/e;->b(Ljava/io/File;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v6

    add-long/2addr v2, v6

    .line 698
    :goto_1
    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/e;->b(Ljava/lang/String;)V

    move-wide v0, v2

    :goto_2
    move-wide v2, v0

    .line 705
    goto :goto_0

    .line 695
    :catch_0
    move-exception v1

    .line 696
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 700
    :cond_0
    new-instance v1, Ljava/io/File;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->b:Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 701
    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v6

    add-long/2addr v2, v6

    .line 702
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_1
    move-wide v0, v2

    goto :goto_2

    .line 706
    :cond_2
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->y:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    if-eqz v0, :cond_3

    .line 707
    sget-object v0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->y:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    sget-object v1, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->y:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    iget-wide v4, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    sub-long v2, v4, v2

    iput-wide v2, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    .line 710
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$5;->b:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->j(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 719
    return-void
.end method
