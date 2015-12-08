.class final Lcom/arist/model/lrc/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/arist/model/lrc/a;


# direct methods
.method constructor <init>(Lcom/arist/model/lrc/a;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/model/lrc/c;->a:Lcom/arist/model/lrc/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/arist/model/lrc/c;->a:Lcom/arist/model/lrc/a;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/arist/model/lrc/a;->a:Z

    iget-object v0, p0, Lcom/arist/model/lrc/c;->a:Lcom/arist/model/lrc/a;

    invoke-static {v0}, Lcom/arist/model/lrc/a;->a(Lcom/arist/model/lrc/a;)Lcom/arist/model/lrc/DeskLrcView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/arist/model/lrc/DeskLrcView;->invalidate()V

    return-void
.end method
