.class final Lkik/android/net/communicator/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/net/communicator/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final a:Lkik/a/e/f$c;

.field final b:J

.field final synthetic c:Lkik/android/net/communicator/a;

.field private volatile d:Z

.field private e:J

.field private f:Lcom/kik/g/ar;


# direct methods
.method constructor <init>(Lkik/android/net/communicator/a;Lkik/a/e/f$c;JLcom/kik/g/ar;)V
    .locals 1

    .prologue
    .line 589
    iput-object p1, p0, Lkik/android/net/communicator/a$c;->c:Lkik/android/net/communicator/a;

    .line 590
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 584
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/net/communicator/a$c;->d:Z

    .line 591
    iput-object p2, p0, Lkik/android/net/communicator/a$c;->a:Lkik/a/e/f$c;

    .line 592
    iput-wide p3, p0, Lkik/android/net/communicator/a$c;->b:J

    .line 593
    iput-object p5, p0, Lkik/android/net/communicator/a$c;->f:Lcom/kik/g/ar;

    .line 594
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 598
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/android/net/communicator/a$c;->e:J

    .line 599
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 603
    iget-boolean v0, p0, Lkik/android/net/communicator/a$c;->d:Z

    if-nez v0, :cond_0

    .line 604
    iget-object v0, p0, Lkik/android/net/communicator/a$c;->a:Lkik/a/e/f$c;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-interface {v0}, Lkik/a/e/f$c;->a()V

    .line 605
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/net/communicator/a$c;->d:Z

    .line 606
    iget-object v0, p0, Lkik/android/net/communicator/a$c;->f:Lcom/kik/g/ar;

    invoke-virtual {v0}, Lcom/kik/g/ar;->c()V

    .line 608
    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 612
    iget-boolean v0, p0, Lkik/android/net/communicator/a$c;->d:Z

    return v0
.end method

.method public final d()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 617
    iget-boolean v1, p0, Lkik/android/net/communicator/a$c;->d:Z

    if-nez v1, :cond_0

    .line 618
    iget-object v1, p0, Lkik/android/net/communicator/a$c;->a:Lkik/a/e/f$c;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-interface {v1}, Lkik/a/e/f$c;->b()V

    .line 619
    iput-boolean v0, p0, Lkik/android/net/communicator/a$c;->d:Z

    .line 620
    iget-object v1, p0, Lkik/android/net/communicator/a$c;->f:Lcom/kik/g/ar;

    invoke-virtual {v1}, Lcom/kik/g/ar;->c()V

    .line 624
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()V
    .locals 2

    .prologue
    .line 629
    iget-boolean v0, p0, Lkik/android/net/communicator/a$c;->d:Z

    if-nez v0, :cond_0

    .line 630
    iget-object v0, p0, Lkik/android/net/communicator/a$c;->c:Lkik/android/net/communicator/a;

    invoke-static {v0}, Lkik/android/net/communicator/a;->y(Lkik/android/net/communicator/a;)Lkik/android/net/communicator/a$c;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lkik/android/net/communicator/a$c;->d:Z

    .line 631
    iget-object v0, p0, Lkik/android/net/communicator/a$c;->c:Lkik/android/net/communicator/a;

    invoke-static {v0}, Lkik/android/net/communicator/a;->y(Lkik/android/net/communicator/a;)Lkik/android/net/communicator/a$c;

    .line 632
    iget-object v0, p0, Lkik/android/net/communicator/a$c;->f:Lcom/kik/g/ar;

    invoke-virtual {v0}, Lcom/kik/g/ar;->c()V

    .line 634
    :cond_0
    return-void
.end method
