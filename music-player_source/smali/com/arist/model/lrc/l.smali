.class final Lcom/arist/model/lrc/l;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/model/lrc/i;

.field private final synthetic b:Landroid/app/AlertDialog;

.field private final synthetic c:Lcom/arist/b/b;

.field private final synthetic d:Lcom/arist/activity/MusicPlayActivity;


# direct methods
.method constructor <init>(Lcom/arist/model/lrc/i;Landroid/app/AlertDialog;Lcom/arist/b/b;Lcom/arist/activity/MusicPlayActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/lrc/l;->a:Lcom/arist/model/lrc/i;

    iput-object p2, p0, Lcom/arist/model/lrc/l;->b:Landroid/app/AlertDialog;

    iput-object p3, p0, Lcom/arist/model/lrc/l;->c:Lcom/arist/b/b;

    iput-object p4, p0, Lcom/arist/model/lrc/l;->d:Lcom/arist/activity/MusicPlayActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/arist/model/lrc/l;->b:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "http://www.google.cn/search?q="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/arist/model/lrc/l;->c:Lcom/arist/b/b;

    invoke-virtual {v2}, Lcom/arist/b/b;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "+ lrc"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/arist/model/lrc/l;->d:Lcom/arist/activity/MusicPlayActivity;

    invoke-virtual {v1, v0}, Lcom/arist/activity/MusicPlayActivity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
