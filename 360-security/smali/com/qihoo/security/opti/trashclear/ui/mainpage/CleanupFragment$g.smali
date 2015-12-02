.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "g"
.end annotation


# instance fields
.field private a:Z

.field private final b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$h;

.field private final c:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$h;[Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 2498
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 2499
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$h;

    .line 2500
    if-nez p2, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;->c:[Ljava/lang/String;

    .line 2501
    return-void

    .line 2500
    :cond_0
    invoke-virtual {p2}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 2504
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;->start()V

    .line 2505
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 2508
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;->a:Z

    .line 2509
    return-void
.end method

.method public run()V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 2513
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;->c:[Ljava/lang/String;

    if-nez v0, :cond_2

    move v2, v1

    .line 2515
    :goto_0
    if-lez v2, :cond_3

    move v0, v1

    .line 2516
    :goto_1
    iget-boolean v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;->a:Z

    if-nez v3, :cond_3

    .line 2517
    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$h;

    if-eqz v3, :cond_0

    .line 2518
    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$h;

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;->c:[Ljava/lang/String;

    aget-object v4, v4, v0

    invoke-interface {v3, v4}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$h;->a(Ljava/lang/String;)V

    .line 2520
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 2521
    if-ne v0, v2, :cond_1

    move v0, v1

    .line 2525
    :cond_1
    const-wide/16 v4, 0x258

    :try_start_0
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 2526
    :catch_0
    move-exception v3

    .line 2527
    invoke-virtual {v3}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_1

    .line 2513
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$g;->c:[Ljava/lang/String;

    array-length v0, v0

    move v2, v0

    goto :goto_0

    .line 2531
    :cond_3
    return-void
.end method
