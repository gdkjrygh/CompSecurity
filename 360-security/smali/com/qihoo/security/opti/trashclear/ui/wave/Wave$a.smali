.class Lcom/qihoo/security/opti/trashclear/ui/wave/Wave$a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;


# direct methods
.method private constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;)V
    .locals 0

    .prologue
    .line 240
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave$a;->a:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;Lcom/qihoo/security/opti/trashclear/ui/wave/Wave$1;)V
    .locals 0

    .prologue
    .line 240
    invoke-direct {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave$a;-><init>(Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .prologue
    const-wide/16 v0, 0x0

    .line 242
    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave$a;->a:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    monitor-enter v4

    .line 244
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 246
    iget-object v5, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave$a;->a:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    invoke-static {v5}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->a(Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;)V

    .line 248
    iget-object v5, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave$a;->a:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    invoke-virtual {v5}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->invalidate()V

    .line 250
    const-wide/16 v6, 0x10

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sub-long/2addr v6, v8

    sub-long v2, v6, v2

    .line 251
    iget-object v5, p0, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave$a;->a:Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;

    cmp-long v6, v2, v0

    if-gez v6, :cond_0

    :goto_0
    invoke-virtual {v5, p0, v0, v1}, Lcom/qihoo/security/opti/trashclear/ui/wave/Wave;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 252
    monitor-exit v4

    .line 253
    return-void

    :cond_0
    move-wide v0, v2

    .line 251
    goto :goto_0

    .line 252
    :catchall_0
    move-exception v0

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
