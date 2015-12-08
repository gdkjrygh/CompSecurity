.class final Lcom/arist/model/lrc/j;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/arist/model/lrc/i;

.field private final synthetic b:Landroid/app/AlertDialog;

.field private final synthetic c:Lcom/arist/b/b;

.field private final synthetic d:Lcom/arist/model/lrc/m;

.field private final synthetic e:Lcom/arist/activity/MusicPlayActivity;


# direct methods
.method constructor <init>(Lcom/arist/model/lrc/i;Landroid/app/AlertDialog;Lcom/arist/b/b;Lcom/arist/model/lrc/m;Lcom/arist/activity/MusicPlayActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/lrc/j;->a:Lcom/arist/model/lrc/i;

    iput-object p2, p0, Lcom/arist/model/lrc/j;->b:Landroid/app/AlertDialog;

    iput-object p3, p0, Lcom/arist/model/lrc/j;->c:Lcom/arist/b/b;

    iput-object p4, p0, Lcom/arist/model/lrc/j;->d:Lcom/arist/model/lrc/m;

    iput-object p5, p0, Lcom/arist/model/lrc/j;->e:Lcom/arist/activity/MusicPlayActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3

    iget-object v0, p0, Lcom/arist/model/lrc/j;->b:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    new-instance v0, Ljava/lang/StringBuilder;

    sget-object v1, Lcom/arist/c/a;->F:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/arist/model/lrc/j;->c:Lcom/arist/b/b;

    invoke-virtual {v1}, Lcom/arist/b/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/arist/c/c;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".lrc"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/arist/model/lrc/j;->d:Lcom/arist/model/lrc/m;

    invoke-virtual {v2, p3}, Lcom/arist/model/lrc/m;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v2}, Lcom/arist/c/c;->a(Ljava/io/File;Ljava/io/File;)V

    iget-object v0, p0, Lcom/arist/model/lrc/j;->e:Lcom/arist/activity/MusicPlayActivity;

    invoke-virtual {v0}, Lcom/arist/activity/MusicPlayActivity;->a()V

    return-void
.end method
