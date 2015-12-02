.class Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$2;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)V
    .locals 0

    .prologue
    .line 165
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$2;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 169
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 170
    const-string/jumbo v1, "android.intent.action.MEDIA_MOUNTED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string/jumbo v1, "android.intent.action.MEDIA_UNMOUNTED"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 171
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$2;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->j(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 173
    :cond_1
    return-void
.end method
