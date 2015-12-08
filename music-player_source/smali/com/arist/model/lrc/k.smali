.class final Lcom/arist/model/lrc/k;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/model/lrc/i;

.field private final synthetic b:Landroid/app/AlertDialog;

.field private final synthetic c:Lcom/arist/activity/MusicPlayActivity;

.field private final synthetic d:Lcom/arist/b/b;


# direct methods
.method constructor <init>(Lcom/arist/model/lrc/i;Landroid/app/AlertDialog;Lcom/arist/activity/MusicPlayActivity;Lcom/arist/b/b;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/lrc/k;->a:Lcom/arist/model/lrc/i;

    iput-object p2, p0, Lcom/arist/model/lrc/k;->b:Landroid/app/AlertDialog;

    iput-object p3, p0, Lcom/arist/model/lrc/k;->c:Lcom/arist/activity/MusicPlayActivity;

    iput-object p4, p0, Lcom/arist/model/lrc/k;->d:Lcom/arist/b/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/arist/model/lrc/k;->b:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/arist/model/lrc/k;->c:Lcom/arist/activity/MusicPlayActivity;

    const-class v2, Lcom/arist/activity/LrcBrowseActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "music_path"

    iget-object v2, p0, Lcom/arist/model/lrc/k;->d:Lcom/arist/b/b;

    invoke-virtual {v2}, Lcom/arist/b/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/arist/model/lrc/k;->c:Lcom/arist/activity/MusicPlayActivity;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lcom/arist/activity/MusicPlayActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method
