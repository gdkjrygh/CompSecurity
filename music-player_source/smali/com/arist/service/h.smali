.class final Lcom/arist/service/h;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/arist/service/MusicPlayService;


# direct methods
.method constructor <init>(Lcom/arist/service/MusicPlayService;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/service/h;->a:Lcom/arist/service/MusicPlayService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/arist/service/h;->a:Lcom/arist/service/MusicPlayService;

    const v1, 0x759bc71

    iget-object v2, p0, Lcom/arist/service/h;->a:Lcom/arist/service/MusicPlayService;

    invoke-static {v2}, Lcom/arist/service/MusicPlayService;->c(Lcom/arist/service/MusicPlayService;)Lcom/arist/service/o;

    move-result-object v2

    invoke-static {}, Lcom/arist/activity/MyApplication;->g()Lcom/arist/b/b;

    move-result-object v3

    invoke-static {}, Lcom/arist/activity/MyApplication;->d()Z

    move-result v4

    invoke-virtual {v2, v3, v4}, Lcom/arist/service/o;->a(Lcom/arist/b/b;Z)Landroid/app/Notification;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/arist/service/MusicPlayService;->startForeground(ILandroid/app/Notification;)V

    return-void
.end method
