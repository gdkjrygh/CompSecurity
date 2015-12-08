.class final Lcom/arist/model/lrc/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/arist/model/lrc/a;


# direct methods
.method constructor <init>(Lcom/arist/model/lrc/a;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/lrc/b;->a:Lcom/arist/model/lrc/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/arist/model/lrc/b;->a:Lcom/arist/model/lrc/a;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/arist/model/lrc/a;->a:Z

    iget-object v0, p0, Lcom/arist/model/lrc/b;->a:Lcom/arist/model/lrc/a;

    invoke-static {v0}, Lcom/arist/model/lrc/a;->a(Lcom/arist/model/lrc/a;)Lcom/arist/model/lrc/DeskLrcView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/model/lrc/DeskLrcView;->invalidate()V

    iget-object v0, p0, Lcom/arist/model/lrc/b;->a:Lcom/arist/model/lrc/a;

    invoke-static {v0}, Lcom/arist/model/lrc/a;->b(Lcom/arist/model/lrc/a;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/arist/model/lrc/b;->a:Lcom/arist/model/lrc/a;

    invoke-static {v1}, Lcom/arist/model/lrc/a;->c(Lcom/arist/model/lrc/a;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
