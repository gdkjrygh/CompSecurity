.class final Lcom/arist/service/i;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/arist/service/MusicPlayService;

.field private final synthetic b:I


# direct methods
.method constructor <init>(Lcom/arist/service/MusicPlayService;I)V
    .locals 0

    iput-object p1, p0, Lcom/arist/service/i;->a:Lcom/arist/service/MusicPlayService;

    iput p2, p0, Lcom/arist/service/i;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    sget-object v0, Lcom/arist/activity/MyApplication;->q:Landroid/content/Context;

    iget-object v1, p0, Lcom/arist/service/i;->a:Lcom/arist/service/MusicPlayService;

    iget v2, p0, Lcom/arist/service/i;->b:I

    invoke-virtual {v1, v2}, Lcom/arist/service/MusicPlayService;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method
