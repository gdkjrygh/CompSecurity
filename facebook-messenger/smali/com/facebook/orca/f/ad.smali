.class public Lcom/facebook/orca/f/ad;
.super Ljava/lang/Object;
.source "ThreadsCache.java"

# interfaces
.implements Lcom/facebook/auth/f/b;


# annotations
.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/auth/b/b;

.field private final c:Lcom/facebook/orca/threads/i;

.field private final d:Lcom/facebook/orca/threads/x;

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/facebook/orca/threads/g;

.field private final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            "Lcom/facebook/orca/f/m;",
            ">;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation
.end field

.field private final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/facebook/user/UserKey;",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 54
    const-class v0, Lcom/facebook/orca/f/ad;

    sput-object v0, Lcom/facebook/orca/f/ad;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/auth/b/b;Lcom/facebook/orca/threads/i;Lcom/facebook/orca/threads/x;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/orca/threads/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/auth/b/b;",
            "Lcom/facebook/orca/threads/i;",
            "Lcom/facebook/orca/threads/x;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/UserKey;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/threads/FolderName;",
            ">;",
            "Lcom/facebook/orca/threads/g;",
            ")V"
        }
    .end annotation

    .prologue
    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    invoke-static {}, Lcom/google/common/a/ik;->c()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/f/ad;->i:Ljava/util/Map;

    .line 75
    iput-object p1, p0, Lcom/facebook/orca/f/ad;->b:Lcom/facebook/auth/b/b;

    .line 76
    iput-object p2, p0, Lcom/facebook/orca/f/ad;->c:Lcom/facebook/orca/threads/i;

    .line 77
    iput-object p3, p0, Lcom/facebook/orca/f/ad;->d:Lcom/facebook/orca/threads/x;

    .line 78
    iput-object p4, p0, Lcom/facebook/orca/f/ad;->e:Ljavax/inject/a;

    .line 79
    iput-object p5, p0, Lcom/facebook/orca/f/ad;->f:Ljavax/inject/a;

    .line 80
    iput-object p6, p0, Lcom/facebook/orca/f/ad;->g:Lcom/facebook/orca/threads/g;

    .line 81
    invoke-static {}, Lcom/google/common/a/ik;->a()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/f/ad;->h:Ljava/util/Map;

    .line 82
    return-void
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;)Lcom/facebook/orca/threads/MessagesCollection;
    .locals 1
    .param p2    # Lcom/facebook/orca/threads/MessagesCollection;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/facebook/orca/threads/MessagesCollection;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 588
    if-nez p2, :cond_0

    .line 589
    invoke-static {p1}, Lcom/facebook/orca/threads/MessagesCollection;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object p2

    .line 591
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->c:Lcom/facebook/orca/threads/i;

    invoke-virtual {v0, p2, p3}, Lcom/facebook/orca/threads/i;->a(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/facebook/orca/threads/MessagesCollection;Ljava/util/Set;)Lcom/facebook/orca/threads/MessagesCollection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/threads/MessagesCollection;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/orca/threads/MessagesCollection;"
        }
    .end annotation

    .prologue
    .line 418
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 419
    invoke-virtual {p1}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 420
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 421
    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 424
    :cond_1
    new-instance v0, Lcom/facebook/orca/threads/MessagesCollection;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/MessagesCollection;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/orca/threads/MessagesCollection;->d()Z

    move-result v3

    invoke-direct {v0, v2, v1, v3}, Lcom/facebook/orca/threads/MessagesCollection;-><init>(Ljava/lang/String;Lcom/google/common/a/es;Z)V

    return-object v0
.end method

.method private a(Lcom/facebook/user/User;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 788
    invoke-virtual {p1}, Lcom/facebook/user/User;->d()Lcom/facebook/user/Name;

    move-result-object v0

    .line 789
    invoke-virtual {v0}, Lcom/facebook/user/Name;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 790
    invoke-virtual {v0}, Lcom/facebook/user/Name;->getFirstName()Ljava/lang/String;

    move-result-object v0

    .line 798
    :goto_0
    return-object v0

    .line 791
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/user/Name;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 792
    invoke-virtual {v0}, Lcom/facebook/user/Name;->d()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 793
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/user/Name;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 794
    invoke-virtual {v0}, Lcom/facebook/user/Name;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 795
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/user/User;->l()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 796
    invoke-virtual {p1}, Lcom/facebook/user/User;->m()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 798
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;)V
    .locals 4
    .param p2    # Lcom/facebook/orca/threads/MessagesCollection;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/facebook/orca/threads/MessagesCollection;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v3, 0x5

    .line 600
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 619
    :goto_0
    return-void

    .line 604
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 605
    const-string v1, "Merged messages:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 606
    const-string v1, "  New Message:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 607
    invoke-static {p1}, Lcom/facebook/orca/threads/MessagesCollection;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/f/ad;->a(Ljava/lang/StringBuilder;Lcom/facebook/orca/threads/MessagesCollection;I)V

    .line 609
    const-string v1, "  Recent Messages:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 610
    invoke-direct {p0, v0, p2, v3}, Lcom/facebook/orca/f/ad;->a(Ljava/lang/StringBuilder;Lcom/facebook/orca/threads/MessagesCollection;I)V

    .line 612
    const-string v1, "  Loaded Messages:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 613
    invoke-direct {p0, v0, p3, v3}, Lcom/facebook/orca/f/ad;->a(Ljava/lang/StringBuilder;Lcom/facebook/orca/threads/MessagesCollection;I)V

    .line 615
    const-string v1, "  Result:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 616
    const/16 v1, 0x8

    invoke-direct {p0, v0, p4, v1}, Lcom/facebook/orca/f/ad;->a(Ljava/lang/StringBuilder;Lcom/facebook/orca/threads/MessagesCollection;I)V

    .line 617
    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    sget-object v1, Lcom/facebook/orca/f/ad;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/threads/MessagesCollection;)V
    .locals 2

    .prologue
    .line 622
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 631
    :goto_0
    return-void

    .line 626
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 627
    const-string v1, "  Messages:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 628
    const/16 v1, 0x8

    invoke-direct {p0, v0, p1, v1}, Lcom/facebook/orca/f/ad;->a(Ljava/lang/StringBuilder;Lcom/facebook/orca/threads/MessagesCollection;I)V

    .line 629
    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 630
    sget-object v1, Lcom/facebook/orca/f/ad;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 3

    .prologue
    .line 636
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 650
    :cond_0
    :goto_0
    return-void

    .line 639
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->toString()Ljava/lang/String;

    move-result-object v0

    .line 640
    if-eqz p2, :cond_2

    .line 641
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadSummary;->toString()Ljava/lang/String;

    move-result-object v1

    .line 642
    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 647
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 648
    const-string v2, "  ThreadSummary: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 649
    sget-object v0, Lcom/facebook/orca/f/ad;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/StringBuilder;Lcom/facebook/orca/threads/MessagesCollection;I)V
    .locals 3

    .prologue
    .line 653
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/facebook/orca/threads/MessagesCollection;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 654
    :cond_0
    const-string v0, "    none\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 661
    :cond_1
    return-void

    .line 656
    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_1

    invoke-virtual {p2}, Lcom/facebook/orca/threads/MessagesCollection;->f()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 657
    invoke-virtual {p2, v0}, Lcom/facebook/orca/threads/MessagesCollection;->a(I)Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    .line 658
    const-string v2, "   "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 656
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/messages/model/threads/Message;)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 350
    if-nez p2, :cond_1

    if-nez p1, :cond_1

    .line 359
    :cond_0
    :goto_0
    return v0

    .line 352
    :cond_1
    if-eqz p1, :cond_2

    if-nez p2, :cond_3

    :cond_2
    move v0, v1

    .line 353
    goto :goto_0

    .line 355
    :cond_3
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->e()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    .line 359
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->e()J

    move-result-wide v2

    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->s()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method private b(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/MessagesCollection;)V
    .locals 6
    .param p3    # Lcom/facebook/orca/threads/MessagesCollection;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "this"
    .end annotation

    .prologue
    .line 532
    if-nez p2, :cond_0

    .line 581
    :goto_0
    return-void

    .line 537
    :cond_0
    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    .line 538
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    .line 539
    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/m;->g(Ljava/lang/String;)Lcom/facebook/orca/f/ab;

    move-result-object v2

    .line 542
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/m;->c(Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v3

    .line 543
    if-nez v3, :cond_1

    .line 544
    invoke-virtual {p0}, Lcom/facebook/orca/f/ad;->a()V

    .line 545
    invoke-virtual {v2}, Lcom/facebook/orca/f/ab;->b()V

    goto :goto_0

    .line 550
    :cond_1
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/m;->f(Ljava/lang/String;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    .line 552
    if-nez v0, :cond_5

    .line 553
    new-instance v0, Lcom/facebook/orca/threads/MessagesCollection;

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v0, v1, v4, v5}, Lcom/facebook/orca/threads/MessagesCollection;-><init>(Ljava/lang/String;Lcom/google/common/a/es;Z)V

    .line 554
    invoke-virtual {p0}, Lcom/facebook/orca/f/ad;->a()V

    .line 555
    invoke-virtual {v2}, Lcom/facebook/orca/f/ab;->b()V

    .line 563
    :cond_2
    :goto_1
    if-eqz p3, :cond_3

    iget-object v1, p0, Lcom/facebook/orca/f/ad;->c:Lcom/facebook/orca/threads/i;

    invoke-virtual {v1, p3, v0}, Lcom/facebook/orca/threads/i;->c(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 565
    :cond_3
    invoke-virtual {p0}, Lcom/facebook/orca/f/ad;->a()V

    .line 566
    invoke-virtual {v2}, Lcom/facebook/orca/f/ab;->b()V

    .line 569
    :cond_4
    invoke-direct {p0, p2, p3, v0}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v1

    .line 570
    invoke-direct {p0, p2, p3, v0, v1}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;)V

    .line 571
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->d:Lcom/facebook/orca/threads/x;

    invoke-virtual {v0, v3, p2}, Lcom/facebook/orca/threads/x;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 573
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v2

    .line 574
    invoke-virtual {v3}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/orca/f/m;->c(Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v3

    invoke-direct {p0, v0, v3}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 578
    invoke-virtual {v2, v0}, Lcom/facebook/orca/f/m;->b(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 579
    invoke-virtual {v2, v1}, Lcom/facebook/orca/f/m;->a(Lcom/facebook/orca/threads/MessagesCollection;)V

    .line 580
    invoke-direct {p0, v0}, Lcom/facebook/orca/f/ad;->b(Lcom/facebook/orca/threads/ThreadSummary;)V

    goto :goto_0

    .line 556
    :cond_5
    invoke-virtual {p2}, Lcom/facebook/messages/model/threads/Message;->y()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 557
    invoke-virtual {p0}, Lcom/facebook/orca/f/ad;->a()V

    .line 558
    invoke-virtual {v2}, Lcom/facebook/orca/f/ab;->b()V

    goto :goto_1
.end method

.method private b(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 5

    .prologue
    .line 364
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->y()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    .line 365
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/m;->g(Ljava/lang/String;)Lcom/facebook/orca/f/ab;

    move-result-object v0

    .line 366
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 367
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->c()J

    move-result-wide v1

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/f/ab;->a(J)V

    .line 371
    :goto_0
    return-void

    .line 369
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/f/ab;->a(J)V

    goto :goto_0
.end method

.method private declared-synchronized g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;
    .locals 2

    .prologue
    .line 85
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->h:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/m;

    .line 86
    if-nez v0, :cond_0

    .line 87
    new-instance v0, Lcom/facebook/orca/f/m;

    invoke-direct {v0, p1}, Lcom/facebook/orca/f/m;-><init>(Lcom/facebook/orca/threads/FolderName;)V

    .line 88
    iget-object v1, p0, Lcom/facebook/orca/f/ad;->h:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    :cond_0
    monitor-exit p0

    return-object v0

    .line 85
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method declared-synchronized a(Ljava/lang/String;)J
    .locals 2

    .prologue
    .line 694
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    invoke-direct {p0, v0}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    .line 695
    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/m;->g(Ljava/lang/String;)Lcom/facebook/orca/f/ab;

    move-result-object v0

    .line 696
    invoke-virtual {v0}, Lcom/facebook/orca/f/ab;->g()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    monitor-exit p0

    return-wide v0

    .line 694
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/threads/ThreadSummary;
    .locals 2

    .prologue
    .line 189
    monitor-enter p0

    :try_start_0
    invoke-virtual {p2}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 190
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    invoke-virtual {p2}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/m;->c(Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 193
    :goto_0
    monitor-exit p0

    return-object v0

    .line 192
    :cond_0
    :try_start_1
    invoke-virtual {p2}, Lcom/facebook/orca/server/ThreadCriteria;->b()Lcom/facebook/user/UserKey;

    move-result-object v0

    .line 193
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/orca/f/m;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/threads/ThreadSummary;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    goto :goto_0

    .line 189
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;
    .locals 1

    .prologue
    .line 113
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/orca/f/m;->c(Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Lcom/facebook/user/UserKey;Lcom/facebook/orca/f/ae;)Lcom/facebook/orca/threads/ThreadSummary;
    .locals 3

    .prologue
    .line 149
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    .line 150
    invoke-virtual {p0, v0, p2}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/f/ae;)Z

    move-result v2

    .line 151
    if-eqz v2, :cond_0

    .line 152
    invoke-direct {p0, v0}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    .line 153
    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/m;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/orca/threads/ThreadSummary;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 154
    if-eqz v0, :cond_0

    .line 160
    :goto_0
    monitor-exit p0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 149
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Ljava/lang/String;Lcom/facebook/orca/f/ae;)Lcom/facebook/orca/threads/ThreadSummary;
    .locals 3

    .prologue
    .line 125
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    .line 126
    invoke-virtual {p0, v0, p2}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/f/ae;)Z

    move-result v2

    .line 127
    if-eqz v2, :cond_0

    .line 128
    invoke-direct {p0, v0}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/m;->c(Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 129
    if-eqz v0, :cond_0

    .line 134
    :goto_0
    monitor-exit p0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 125
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/User;
    .locals 1

    .prologue
    .line 753
    if-nez p1, :cond_0

    .line 754
    const/4 v0, 0x0

    .line 756
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->i:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    goto :goto_0
.end method

.method a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 761
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 762
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->i:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 763
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/facebook/user/User;->d()Lcom/facebook/user/Name;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/Name;->f()Ljava/lang/String;

    move-result-object v0

    .line 770
    :goto_0
    if-nez v0, :cond_0

    .line 771
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->a()Ljava/lang/String;

    move-result-object v0

    .line 773
    :cond_0
    return-object v0

    .line 763
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 765
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method declared-synchronized a()V
    .locals 3

    .prologue
    .line 102
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/m;

    .line 103
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/facebook/orca/f/m;->c(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 102
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 105
    :cond_0
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/MessagesCollection;)V
    .locals 1
    .param p3    # Lcom/facebook/orca/threads/MessagesCollection;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 516
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/f/ad;->b(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/MessagesCollection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 517
    monitor-exit p0

    return-void

    .line 516
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/FolderCounts;)V
    .locals 1

    .prologue
    .line 524
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/orca/f/m;->a(Lcom/facebook/orca/threads/FolderCounts;)V

    .line 525
    return-void
.end method

.method declared-synchronized a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/MessagesCollection;)V
    .locals 2

    .prologue
    .line 337
    monitor-enter p0

    :try_start_0
    invoke-virtual {p2}, Lcom/facebook/orca/threads/MessagesCollection;->a()Ljava/lang/String;

    move-result-object v0

    .line 338
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/facebook/orca/f/m;->a(Lcom/facebook/orca/threads/MessagesCollection;)V

    .line 339
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/orca/f/m;->c(Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 340
    if-nez v0, :cond_1

    .line 342
    invoke-virtual {p0}, Lcom/facebook/orca/f/ad;->a()V

    .line 346
    :cond_0
    :goto_0
    invoke-direct {p0, p2}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/MessagesCollection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 347
    monitor-exit p0

    return-void

    .line 343
    :cond_1
    :try_start_1
    invoke-virtual {p2}, Lcom/facebook/orca/threads/MessagesCollection;->c()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/messages/model/threads/Message;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 344
    invoke-virtual {p0}, Lcom/facebook/orca/f/ad;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 337
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadsCollection;J)V
    .locals 3

    .prologue
    .line 238
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v1

    .line 239
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadsCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 240
    invoke-virtual {v1, v0}, Lcom/facebook/orca/f/m;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 241
    invoke-virtual {p0, v0, p3, p4}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/ThreadSummary;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 238
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 243
    :cond_0
    :try_start_1
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadsCollection;->c()Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/facebook/orca/f/m;->a(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 245
    monitor-exit p0

    return-void
.end method

.method declared-synchronized a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/ThreadsCollection;JZ)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 209
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v2

    .line 210
    invoke-virtual {v2}, Lcom/facebook/orca/f/m;->g()V

    .line 211
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadsCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 212
    invoke-virtual {v2, v0}, Lcom/facebook/orca/f/m;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 213
    invoke-virtual {p0, v0, p3, p4}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/ThreadSummary;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 209
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 215
    :cond_0
    const/4 v0, 0x1

    :try_start_1
    invoke-virtual {v2, v0}, Lcom/facebook/orca/f/m;->b(Z)V

    .line 216
    if-nez p5, :cond_1

    move v0, v1

    :goto_1
    invoke-virtual {v2, v0}, Lcom/facebook/orca/f/m;->c(Z)V

    .line 217
    invoke-virtual {v2, p3, p4}, Lcom/facebook/orca/f/m;->a(J)V

    .line 219
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadsCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadSummary;

    .line 220
    invoke-direct {p0, v0}, Lcom/facebook/orca/f/ad;->b(Lcom/facebook/orca/threads/ThreadSummary;)V

    goto :goto_2

    .line 216
    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    .line 223
    :cond_2
    invoke-virtual {v2}, Lcom/facebook/orca/f/m;->i()V

    .line 224
    invoke-virtual {p2}, Lcom/facebook/orca/threads/ThreadsCollection;->c()Z

    move-result v0

    invoke-virtual {v2, v0}, Lcom/facebook/orca/f/m;->a(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 226
    monitor-exit p0

    return-void
.end method

.method declared-synchronized a(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;J)V
    .locals 1

    .prologue
    .line 704
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    .line 705
    invoke-virtual {v0, p2}, Lcom/facebook/orca/f/m;->g(Ljava/lang/String;)Lcom/facebook/orca/f/ab;

    move-result-object v0

    .line 706
    invoke-virtual {v0, p3, p4}, Lcom/facebook/orca/f/ab;->b(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 707
    monitor-exit p0

    return-void

    .line 704
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 1

    .prologue
    .line 256
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, v0}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/compose/MessageDraft;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 257
    monitor-exit p0

    return-void

    .line 256
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Lcom/facebook/orca/threads/ThreadSummary;J)V
    .locals 2

    .prologue
    .line 248
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 249
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->y()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    .line 250
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/m;->g(Ljava/lang/String;)Lcom/facebook/orca/f/ab;

    move-result-object v0

    .line 251
    invoke-virtual {v0, p2, p3}, Lcom/facebook/orca/f/ab;->c(J)V

    .line 252
    invoke-virtual {v0}, Lcom/facebook/orca/f/ab;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 253
    monitor-exit p0

    return-void

    .line 248
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/compose/MessageDraft;)V
    .locals 3
    .param p2    # Lcom/facebook/orca/compose/MessageDraft;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 262
    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/facebook/orca/threads/v;

    invoke-direct {v0}, Lcom/facebook/orca/threads/v;-><init>()V

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/v;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/orca/threads/v;->a(Lcom/facebook/orca/compose/MessageDraft;)Lcom/facebook/orca/threads/v;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/v;->z()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 263
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->y()Lcom/facebook/orca/threads/FolderName;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v1

    .line 264
    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/f/m;->c(Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v2

    invoke-direct {p0, v0, v2}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 268
    invoke-virtual {v1, v0}, Lcom/facebook/orca/f/m;->b(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 269
    invoke-direct {p0, v0}, Lcom/facebook/orca/f/ad;->b(Lcom/facebook/orca/threads/ThreadSummary;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 270
    monitor-exit p0

    return-void

    .line 262
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;)V
    .locals 3

    .prologue
    .line 502
    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->y()Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    .line 503
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    .line 504
    invoke-direct {p0, v0}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/facebook/orca/f/m;->d(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 506
    const/4 v1, 0x0

    invoke-virtual {p2, v1}, Lcom/facebook/orca/threads/MessagesCollection;->a(I)Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    invoke-direct {p0, v0, v1, p2}, Lcom/facebook/orca/f/ad;->b(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/MessagesCollection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 510
    :goto_0
    monitor-exit p0

    return-void

    .line 508
    :cond_0
    :try_start_1
    invoke-virtual {p0, v0, p2}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/threads/MessagesCollection;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 502
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Ljava/lang/String;J)V
    .locals 1

    .prologue
    .line 700
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 701
    monitor-exit p0

    return-void

    .line 700
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Ljava/lang/String;Landroid/location/Location;J)V
    .locals 1

    .prologue
    .line 710
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    invoke-direct {p0, v0}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    .line 711
    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/m;->g(Ljava/lang/String;)Lcom/facebook/orca/f/ab;

    move-result-object v0

    .line 712
    invoke-virtual {v0, p2, p3, p4}, Lcom/facebook/orca/f/ab;->a(Landroid/location/Location;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 713
    monitor-exit p0

    return-void

    .line 710
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Ljava/lang/String;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 394
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/orca/f/ad;->a(Ljava/lang/String;Ljava/util/Set;Lcom/facebook/orca/threads/FolderName;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 395
    monitor-exit p0

    return-void

    .line 394
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Ljava/lang/String;Ljava/util/Set;Lcom/facebook/orca/threads/FolderName;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/facebook/orca/threads/FolderName;",
            ")V"
        }
    .end annotation

    .prologue
    .line 408
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p3}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    .line 409
    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/m;->f(Ljava/lang/String;)Lcom/facebook/orca/threads/MessagesCollection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 410
    if-nez v1, :cond_0

    .line 414
    :goto_0
    monitor-exit p0

    return-void

    .line 413
    :cond_0
    :try_start_1
    invoke-direct {p0, v1, p2}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/MessagesCollection;Ljava/util/Set;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/m;->a(Lcom/facebook/orca/threads/MessagesCollection;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 408
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method a(Ljava/util/Collection;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/user/User;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 734
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserKey;

    .line 735
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/user/User;

    .line 739
    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 740
    iget-object v2, p0, Lcom/facebook/orca/f/ad;->b:Lcom/facebook/auth/b/b;

    instance-of v2, v2, Lcom/facebook/auth/b/c;

    if-eqz v2, :cond_0

    .line 741
    iget-object v2, p0, Lcom/facebook/orca/f/ad;->b:Lcom/facebook/auth/b/b;

    check-cast v2, Lcom/facebook/auth/b/c;

    invoke-interface {v2, v1}, Lcom/facebook/auth/b/c;->a(Lcom/facebook/user/User;)V

    .line 744
    :cond_0
    iget-object v2, p0, Lcom/facebook/orca/f/ad;->i:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v4

    invoke-interface {v2, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 746
    :cond_1
    return-void
.end method

.method a(Lcom/facebook/orca/threads/FolderName;)Z
    .locals 1

    .prologue
    .line 94
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/f/m;->c()Z

    move-result v0

    return v0
.end method

.method a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/f/ae;)Z
    .locals 3
    .annotation build Lcom/google/common/annotations/VisibleForTesting;
    .end annotation

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 165
    iget-object v2, p0, Lcom/facebook/orca/f/ad;->g:Lcom/facebook/orca/threads/g;

    invoke-virtual {v2}, Lcom/facebook/orca/threads/g;->a()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 166
    sget-object v2, Lcom/facebook/orca/f/ae;->PREFER_MERGED_FOLDERS:Lcom/facebook/orca/f/ae;

    if-ne p2, v2, :cond_3

    .line 167
    iget-object v2, p0, Lcom/facebook/orca/f/ad;->g:Lcom/facebook/orca/threads/g;

    invoke-virtual {v2, p1}, Lcom/facebook/orca/threads/g;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/facebook/orca/f/ad;->g:Lcom/facebook/orca/threads/g;

    invoke-virtual {v2, p1}, Lcom/facebook/orca/threads/g;->b(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    move v0, v1

    :cond_1
    move v1, v0

    .line 175
    :cond_2
    :goto_0
    return v1

    .line 169
    :cond_3
    sget-object v2, Lcom/facebook/orca/f/ae;->PREFER_RAW_FOLDERS:Lcom/facebook/orca/f/ae;

    if-ne p2, v2, :cond_4

    .line 170
    iget-object v2, p0, Lcom/facebook/orca/f/ad;->g:Lcom/facebook/orca/threads/g;

    invoke-virtual {v2, p1}, Lcom/facebook/orca/threads/g;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v1, v0

    goto :goto_0

    .line 172
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 175
    :cond_5
    iget-object v2, p0, Lcom/facebook/orca/f/ad;->g:Lcom/facebook/orca/threads/g;

    invoke-virtual {v2, p1}, Lcom/facebook/orca/threads/g;->a(Lcom/facebook/orca/threads/FolderName;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v1, v0

    goto :goto_0
.end method

.method declared-synchronized a(Ljava/lang/String;I)Z
    .locals 1

    .prologue
    .line 476
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/orca/f/ad;->a(Ljava/lang/String;ILcom/facebook/orca/threads/FolderName;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Ljava/lang/String;ILcom/facebook/orca/threads/FolderName;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 489
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1, p3}, Lcom/facebook/orca/f/ad;->a(Ljava/lang/String;Lcom/facebook/orca/threads/FolderName;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v2

    if-nez v2, :cond_1

    move v0, v1

    .line 496
    :cond_0
    :goto_0
    monitor-exit p0

    return v0

    .line 492
    :cond_1
    :try_start_1
    invoke-direct {p0, p3}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/facebook/orca/f/m;->f(Ljava/lang/String;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v2

    .line 493
    invoke-virtual {v2}, Lcom/facebook/orca/threads/MessagesCollection;->d()Z

    move-result v3

    if-nez v3, :cond_0

    .line 496
    invoke-virtual {v2}, Lcom/facebook/orca/threads/MessagesCollection;->f()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v2

    if-le p2, v2, :cond_0

    move v0, v1

    goto :goto_0

    .line 489
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized a(Ljava/lang/String;Lcom/facebook/orca/threads/FolderName;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 449
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p2}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/facebook/orca/f/m;->h(Ljava/lang/String;)Lcom/facebook/orca/f/ab;

    move-result-object v1

    .line 450
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/facebook/orca/f/ab;->a()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    if-eqz v1, :cond_1

    .line 464
    :cond_0
    :goto_0
    monitor-exit p0

    return v0

    .line 453
    :cond_1
    :try_start_1
    invoke-direct {p0, p2}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v1

    .line 454
    invoke-virtual {v1, p1}, Lcom/facebook/orca/f/m;->f(Ljava/lang/String;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v2

    .line 455
    invoke-virtual {v1, p1}, Lcom/facebook/orca/f/m;->c(Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v1

    .line 456
    if-eqz v2, :cond_0

    .line 459
    if-eqz v1, :cond_0

    invoke-virtual {v2}, Lcom/facebook/orca/threads/MessagesCollection;->c()Lcom/facebook/messages/model/threads/Message;

    move-result-object v2

    invoke-direct {p0, v1, v2}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/messages/model/threads/Message;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v1

    if-eqz v1, :cond_0

    .line 464
    const/4 v0, 0x1

    goto :goto_0

    .line 449
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized b(Ljava/lang/String;)J
    .locals 2

    .prologue
    .line 716
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    invoke-direct {p0, v0}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    .line 717
    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/m;->g(Ljava/lang/String;)Lcom/facebook/orca/f/ab;

    move-result-object v0

    .line 718
    invoke-virtual {v0}, Lcom/facebook/orca/f/ab;->f()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    monitor-exit p0

    return-wide v0

    .line 716
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized b(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;)Lcom/facebook/orca/threads/MessagesCollection;
    .locals 1

    .prologue
    .line 328
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/orca/f/m;->f(Ljava/lang/String;)Lcom/facebook/orca/threads/MessagesCollection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized b(Ljava/lang/String;Lcom/facebook/orca/f/ae;)Lcom/facebook/orca/threads/MessagesCollection;
    .locals 3

    .prologue
    .line 304
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    .line 305
    invoke-virtual {p0, v0, p2}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/orca/threads/FolderName;Lcom/facebook/orca/f/ae;)Z

    move-result v2

    .line 306
    if-eqz v2, :cond_0

    .line 307
    invoke-direct {p0, v0}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    .line 308
    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/m;->f(Ljava/lang/String;)Lcom/facebook/orca/threads/MessagesCollection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 309
    if-eqz v0, :cond_0

    .line 315
    :goto_0
    monitor-exit p0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 304
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method b(Lcom/facebook/messages/model/threads/ParticipantInfo;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 777
    const/4 v1, 0x0

    .line 778
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 779
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->i:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 780
    if-eqz v0, :cond_1

    .line 781
    invoke-direct {p0, v0}, Lcom/facebook/orca/f/ad;->a(Lcom/facebook/user/User;)Ljava/lang/String;

    move-result-object v0

    .line 784
    :goto_0
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method

.method public declared-synchronized b()V
    .locals 2

    .prologue
    .line 667
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/m;

    .line 668
    invoke-virtual {v0}, Lcom/facebook/orca/f/m;->j()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 667
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 670
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 671
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->i:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 672
    monitor-exit p0

    return-void
.end method

.method b(Lcom/facebook/orca/threads/FolderName;)Z
    .locals 1

    .prologue
    .line 98
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/f/m;->d()Z

    move-result v0

    return v0
.end method

.method declared-synchronized c(Ljava/lang/String;)J
    .locals 2

    .prologue
    .line 722
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    invoke-direct {p0, v0}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    .line 723
    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/m;->g(Ljava/lang/String;)Lcom/facebook/orca/f/ab;

    move-result-object v0

    .line 724
    invoke-virtual {v0}, Lcom/facebook/orca/f/ab;->e()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    monitor-exit p0

    return-wide v0

    .line 722
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized c(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/ThreadsCollection;
    .locals 3

    .prologue
    .line 278
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    .line 279
    new-instance v1, Lcom/facebook/orca/threads/ThreadsCollection;

    invoke-virtual {v0}, Lcom/facebook/orca/f/m;->a()Lcom/facebook/common/b/c;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/common/b/c;->a()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/orca/f/m;->b()Z

    move-result v0

    invoke-direct {v1, v2, v0}, Lcom/facebook/orca/threads/ThreadsCollection;-><init>(Lcom/google/common/a/es;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v1

    .line 278
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()V
    .locals 2

    .prologue
    .line 678
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->h:Ljava/util/Map;

    sget-object v1, Lcom/facebook/orca/threads/FolderName;->d:Lcom/facebook/orca/threads/FolderName;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/m;

    .line 679
    if-eqz v0, :cond_0

    .line 680
    invoke-virtual {v0}, Lcom/facebook/orca/f/m;->j()V

    .line 682
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->h:Ljava/util/Map;

    sget-object v1, Lcom/facebook/orca/threads/FolderName;->e:Lcom/facebook/orca/threads/FolderName;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/m;

    .line 683
    if-eqz v0, :cond_1

    .line 684
    invoke-virtual {v0}, Lcom/facebook/orca/f/m;->j()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 686
    :cond_1
    monitor-exit p0

    return-void

    .line 678
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized c(Lcom/facebook/orca/threads/FolderName;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 380
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/orca/f/m;->b(Ljava/lang/String;)V

    .line 381
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/facebook/orca/f/m;->e(Ljava/lang/String;)V

    .line 382
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/m;

    .line 383
    invoke-virtual {v0, p2}, Lcom/facebook/orca/f/m;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 380
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 385
    :cond_0
    monitor-exit p0

    return-void
.end method

.method declared-synchronized d(Ljava/lang/String;)J
    .locals 2

    .prologue
    .line 728
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/FolderName;

    invoke-direct {p0, v0}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    .line 729
    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/m;->g(Ljava/lang/String;)Lcom/facebook/orca/f/ab;

    move-result-object v0

    .line 730
    invoke-virtual {v0}, Lcom/facebook/orca/f/ab;->d()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    monitor-exit p0

    return-wide v0

    .line 728
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized d(Lcom/facebook/orca/threads/FolderName;)Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/threads/FolderName;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            ">;"
        }
    .end annotation

    .prologue
    .line 292
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/f/m;->h()Lcom/google/common/a/es;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public d()V
    .locals 0

    .prologue
    .line 804
    invoke-virtual {p0}, Lcom/facebook/orca/f/ad;->b()V

    .line 805
    return-void
.end method

.method e(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/FolderCounts;
    .locals 1

    .prologue
    .line 520
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/f/m;->f()Lcom/facebook/orca/threads/FolderCounts;

    move-result-object v0

    return-object v0
.end method

.method e()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation

    .prologue
    .line 749
    iget-object v0, p0, Lcom/facebook/orca/f/ad;->i:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method f(Lcom/facebook/orca/threads/FolderName;)J
    .locals 2

    .prologue
    .line 689
    invoke-direct {p0, p1}, Lcom/facebook/orca/f/ad;->g(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/f/m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/f/m;->e()J

    move-result-wide v0

    return-wide v0
.end method
