.class final Lkik/a/d/f$a;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/a/d/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lkik/a/d/f;

.field private final b:Lkik/a/h/d;


# direct methods
.method public constructor <init>(Lkik/a/d/f;Lkik/a/h/d;)V
    .locals 0

    .prologue
    .line 607
    iput-object p1, p0, Lkik/a/d/f$a;->a:Lkik/a/d/f;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 608
    iput-object p2, p0, Lkik/a/d/f$a;->b:Lkik/a/h/d;

    .line 609
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 614
    iget-object v0, p0, Lkik/a/d/f$a;->a:Lkik/a/d/f;

    invoke-static {v0}, Lkik/a/d/f;->a(Lkik/a/d/f;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 616
    :try_start_0
    iget-object v0, p0, Lkik/a/d/f$a;->a:Lkik/a/d/f;

    invoke-static {v0}, Lkik/a/d/f;->b(Lkik/a/d/f;)Lkik/a/d/f$a;

    move-result-object v0

    if-ne v0, p0, :cond_0

    .line 617
    iget-object v0, p0, Lkik/a/d/f$a;->a:Lkik/a/d/f;

    invoke-static {v0}, Lkik/a/d/f;->c(Lkik/a/d/f;)Ljava/lang/String;

    .line 618
    iget-object v0, p0, Lkik/a/d/f$a;->a:Lkik/a/d/f;

    invoke-static {v0}, Lkik/a/d/f;->d(Lkik/a/d/f;)Lkik/a/d/f$a;

    .line 619
    iget-object v0, p0, Lkik/a/d/f$a;->b:Lkik/a/h/d;

    invoke-interface {v0}, Lkik/a/h/d;->a()V

    .line 621
    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
