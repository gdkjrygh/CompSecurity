.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private a:Z

.field private final b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$f;

.field private c:J

.field private d:J

.field private e:J


# direct methods
.method public constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$f;)V
    .locals 2

    .prologue
    const-wide/16 v0, 0x0

    .line 2552
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 2549
    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->d:J

    .line 2550
    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->e:J

    .line 2553
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$f;

    .line 2554
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 2557
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->a:Z

    .line 2558
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->start()V

    .line 2559
    return-void
.end method

.method public a(J)V
    .locals 1

    .prologue
    .line 2568
    iput-wide p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->c:J

    .line 2569
    return-void
.end method

.method public b()V
    .locals 4

    .prologue
    .line 2562
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->a:Z

    .line 2563
    const/16 v0, 0x478b

    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->d:J

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->e:J

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2565
    return-void
.end method

.method public run()V
    .locals 11

    .prologue
    const/4 v10, 0x5

    const/4 v9, 0x2

    const/4 v8, 0x1

    const/4 v1, 0x0

    .line 2573
    move v0, v1

    .line 2574
    :cond_0
    :goto_0
    iget-boolean v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->a:Z

    if-nez v2, :cond_7

    .line 2576
    const-wide/16 v2, 0x3e8

    :try_start_0
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2580
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 2588
    if-eq v0, v8, :cond_1

    if-eq v0, v9, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    if-ne v0, v10, :cond_5

    .line 2589
    :cond_1
    if-eq v0, v8, :cond_0

    .line 2591
    if-ne v0, v9, :cond_3

    .line 2596
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v2

    const-string/jumbo v3, "sp_key_has_clear_memory"

    invoke-static {v2, v3, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_2

    .line 2598
    invoke-static {}, Lcom/qihoo/security/service/ProcessClearService;->e()V

    .line 2601
    :cond_2
    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->c:J

    iput-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->d:J

    .line 2602
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$f;

    if-eqz v2, :cond_0

    .line 2603
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$f;

    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->c:J

    invoke-interface {v2, v4, v5}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$f;->a(J)V

    goto :goto_0

    .line 2577
    :catch_0
    move-exception v2

    .line 2578
    invoke-virtual {v2}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_1

    .line 2605
    :cond_3
    if-ne v0, v10, :cond_0

    .line 2606
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v2

    const-string/jumbo v3, "sp_key_has_clear_memory"

    invoke-static {v2, v3, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_4

    .line 2608
    invoke-static {}, Lcom/qihoo/security/service/ProcessClearService;->e()V

    .line 2611
    :cond_4
    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->c:J

    iput-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->e:J

    .line 2615
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$f;

    if-eqz v2, :cond_0

    .line 2616
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$f;

    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->c:J

    invoke-interface {v2, v4, v5}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$f;->a(J)V

    goto :goto_0

    .line 2623
    :cond_5
    const/16 v2, 0xa

    if-ne v0, v2, :cond_0

    .line 2627
    const/16 v2, 0x478b

    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->d:J

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->e:J

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    iget-wide v6, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->c:J

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v3, v4, v5}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2629
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$f;

    if-eqz v2, :cond_6

    .line 2630
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$f;

    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->c:J

    invoke-interface {v2, v4, v5}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$f;->a(J)V

    .line 2631
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$f;

    invoke-interface {v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$f;->a()V

    .line 2633
    :cond_6
    iput-boolean v8, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$c;->a:Z

    goto/16 :goto_0

    .line 2636
    :cond_7
    return-void
.end method
