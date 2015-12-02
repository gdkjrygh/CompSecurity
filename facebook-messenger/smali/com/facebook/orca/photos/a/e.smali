.class public Lcom/facebook/orca/photos/a/e;
.super Ljava/lang/Object;
.source "MessengerThreadTileViewDataFactory.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Lcom/facebook/debug/log/l;


# instance fields
.field private final c:Lcom/facebook/orca/attachments/a;

.field private final d:Lcom/facebook/orca/f/z;

.field private final e:Lcom/facebook/user/tiles/c;

.field private final f:Lcom/facebook/orca/photos/a/b;

.field private final g:Lcom/facebook/user/tiles/a;

.field private final h:Lcom/facebook/orca/threads/q;

.field private final i:Lcom/facebook/orca/f/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/facebook/orca/photos/a/e;

    sput-object v0, Lcom/facebook/orca/photos/a/e;->a:Ljava/lang/Class;

    .line 35
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/orca/photos/a/e;->b:Lcom/facebook/debug/log/l;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/attachments/a;Lcom/facebook/orca/f/z;Lcom/facebook/user/tiles/c;Lcom/facebook/orca/photos/a/b;Lcom/facebook/user/tiles/a;Lcom/facebook/orca/threads/q;Lcom/facebook/orca/f/k;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/facebook/orca/photos/a/e;->c:Lcom/facebook/orca/attachments/a;

    .line 54
    iput-object p2, p0, Lcom/facebook/orca/photos/a/e;->d:Lcom/facebook/orca/f/z;

    .line 55
    iput-object p3, p0, Lcom/facebook/orca/photos/a/e;->e:Lcom/facebook/user/tiles/c;

    .line 56
    iput-object p4, p0, Lcom/facebook/orca/photos/a/e;->f:Lcom/facebook/orca/photos/a/b;

    .line 57
    iput-object p5, p0, Lcom/facebook/orca/photos/a/e;->g:Lcom/facebook/user/tiles/a;

    .line 58
    iput-object p6, p0, Lcom/facebook/orca/photos/a/e;->h:Lcom/facebook/orca/threads/q;

    .line 59
    iput-object p7, p0, Lcom/facebook/orca/photos/a/e;->i:Lcom/facebook/orca/f/k;

    .line 60
    return-void
.end method

.method private a(Ljava/util/List;I)Lcom/facebook/messages/model/threads/ParticipantInfo;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;I)",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;"
        }
    .end annotation

    .prologue
    .line 193
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-lt p2, v0, :cond_1

    .line 196
    :cond_0
    new-instance v0, Lcom/facebook/messages/model/threads/ParticipantInfo;

    iget-object v1, p0, Lcom/facebook/orca/photos/a/e;->i:Lcom/facebook/orca/f/k;

    invoke-virtual {v1}, Lcom/facebook/orca/f/k;->b()Lcom/facebook/user/UserKey;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/facebook/messages/model/threads/ParticipantInfo;-><init>(Lcom/facebook/user/UserKey;Ljava/lang/String;)V

    .line 198
    :goto_0
    return-object v0

    :cond_1
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/ParticipantInfo;

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/widget/tiles/j;
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 98
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->r()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->t()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 99
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/photos/a/e;->c:Lcom/facebook/orca/attachments/a;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/attachments/a;->a(Lcom/facebook/orca/threads/ThreadSummary;)Landroid/net/Uri;

    move-result-object v0

    .line 100
    invoke-virtual {v0}, Landroid/net/Uri;->isAbsolute()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 101
    new-instance v0, Lcom/facebook/orca/photos/a/d;

    iget-object v1, p0, Lcom/facebook/orca/photos/a/e;->e:Lcom/facebook/user/tiles/c;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/facebook/orca/photos/a/b;->a:Lcom/facebook/widget/tiles/a;

    iget-object v4, p0, Lcom/facebook/orca/photos/a/e;->c:Lcom/facebook/orca/attachments/a;

    invoke-virtual {v4, p1}, Lcom/facebook/orca/attachments/a;->a(Lcom/facebook/orca/threads/ThreadSummary;)Landroid/net/Uri;

    move-result-object v4

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/photos/a/d;-><init>(Lcom/facebook/user/tiles/c;Ljava/lang/String;Lcom/facebook/widget/tiles/a;Landroid/net/Uri;ZLjava/util/List;)V

    .line 177
    :goto_0
    return-object v0

    .line 113
    :cond_1
    sget-object v1, Lcom/facebook/orca/photos/a/e;->b:Lcom/facebook/debug/log/l;

    sget-object v2, Lcom/facebook/orca/photos/a/e;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Uri is not absolute - Uri: "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " TID: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;)V

    .line 120
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/photos/a/e;->d:Lcom/facebook/orca/f/z;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/z;->b(Lcom/facebook/orca/threads/ThreadSummary;)Ljava/util/List;

    move-result-object v3

    .line 121
    iget-object v0, p0, Lcom/facebook/orca/photos/a/e;->d:Lcom/facebook/orca/f/z;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/z;->c(Lcom/facebook/orca/threads/ThreadSummary;)I

    move-result v0

    .line 124
    if-ne v0, v7, :cond_3

    .line 125
    invoke-direct {p0, v3, v5}, Lcom/facebook/orca/photos/a/e;->a(Ljava/util/List;I)Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v6

    .line 127
    new-instance v0, Lcom/facebook/orca/photos/a/d;

    iget-object v1, p0, Lcom/facebook/orca/photos/a/e;->e:Lcom/facebook/user/tiles/c;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/orca/photos/a/e;->f:Lcom/facebook/orca/photos/a/b;

    invoke-virtual {v3, p1}, Lcom/facebook/orca/photos/a/b;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/widget/tiles/a;

    move-result-object v3

    invoke-virtual {v6}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v6

    invoke-static {v6}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/photos/a/d;-><init>(Lcom/facebook/user/tiles/c;Ljava/lang/String;Lcom/facebook/widget/tiles/a;Landroid/net/Uri;ZLjava/util/List;)V

    goto :goto_0

    .line 138
    :cond_3
    if-ne v0, v8, :cond_4

    .line 139
    iget-object v0, p0, Lcom/facebook/orca/photos/a/e;->h:Lcom/facebook/orca/threads/q;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threads/q;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/ThreadParticipant;

    move-result-object v6

    .line 141
    new-instance v0, Lcom/facebook/orca/photos/a/d;

    iget-object v1, p0, Lcom/facebook/orca/photos/a/e;->e:Lcom/facebook/user/tiles/c;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/orca/photos/a/e;->f:Lcom/facebook/orca/photos/a/b;

    invoke-virtual {v3, p1}, Lcom/facebook/orca/photos/a/b;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/widget/tiles/a;

    move-result-object v3

    invoke-virtual {v6}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v6

    invoke-static {v6}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/photos/a/d;-><init>(Lcom/facebook/user/tiles/c;Ljava/lang/String;Lcom/facebook/widget/tiles/a;Landroid/net/Uri;ZLjava/util/List;)V

    goto :goto_0

    .line 152
    :cond_4
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/threads/m;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 153
    new-instance v0, Lcom/facebook/orca/photos/a/d;

    iget-object v1, p0, Lcom/facebook/orca/photos/a/e;->e:Lcom/facebook/user/tiles/c;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/facebook/orca/photos/a/b;->b:Lcom/facebook/widget/tiles/a;

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v6

    move v5, v7

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/photos/a/d;-><init>(Lcom/facebook/user/tiles/c;Ljava/lang/String;Lcom/facebook/widget/tiles/a;Landroid/net/Uri;ZLjava/util/List;)V

    goto/16 :goto_0

    .line 164
    :cond_5
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    .line 165
    if-ge v0, v8, :cond_6

    .line 167
    new-instance v0, Lcom/facebook/orca/photos/a/d;

    iget-object v1, p0, Lcom/facebook/orca/photos/a/e;->e:Lcom/facebook/user/tiles/c;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/facebook/orca/photos/a/b;->a:Lcom/facebook/widget/tiles/a;

    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v6

    move v5, v7

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/photos/a/d;-><init>(Lcom/facebook/user/tiles/c;Ljava/lang/String;Lcom/facebook/widget/tiles/a;Landroid/net/Uri;ZLjava/util/List;)V

    goto/16 :goto_0

    .line 177
    :cond_6
    new-instance v0, Lcom/facebook/orca/photos/a/d;

    iget-object v1, p0, Lcom/facebook/orca/photos/a/e;->e:Lcom/facebook/user/tiles/c;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v3, v5}, Lcom/facebook/orca/photos/a/e;->a(Ljava/util/List;I)Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v6

    invoke-virtual {v6}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v6

    invoke-direct {p0, v3, v7}, Lcom/facebook/orca/photos/a/e;->a(Ljava/util/List;I)Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v7

    invoke-virtual {v7}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v7

    invoke-direct {p0, v3, v8}, Lcom/facebook/orca/photos/a/e;->a(Ljava/util/List;I)Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v3

    invoke-static {v6, v7, v3}, Lcom/google/common/a/es;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v6

    move-object v3, v4

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/photos/a/d;-><init>(Lcom/facebook/user/tiles/c;Ljava/lang/String;Lcom/facebook/widget/tiles/a;Landroid/net/Uri;ZLjava/util/List;)V

    goto/16 :goto_0
.end method

.method public a(Lcom/facebook/user/User;)Lcom/facebook/widget/tiles/j;
    .locals 7

    .prologue
    .line 63
    new-instance v0, Lcom/facebook/orca/photos/a/d;

    iget-object v1, p0, Lcom/facebook/orca/photos/a/e;->e:Lcom/facebook/user/tiles/c;

    invoke-virtual {p1}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/user/UserKey;->c()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/orca/photos/a/e;->g:Lcom/facebook/user/tiles/a;

    invoke-virtual {p1}, Lcom/facebook/user/User;->a()Lcom/facebook/user/n;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/facebook/user/tiles/a;->a(Lcom/facebook/user/n;)Lcom/facebook/widget/tiles/a;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {p1}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v6

    invoke-static {v6}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/photos/a/d;-><init>(Lcom/facebook/user/tiles/c;Ljava/lang/String;Lcom/facebook/widget/tiles/a;Landroid/net/Uri;ZLjava/util/List;)V

    return-object v0
.end method

.method public a(Lcom/facebook/widget/tiles/a;)Lcom/facebook/widget/tiles/j;
    .locals 7

    .prologue
    .line 85
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v6

    .line 86
    new-instance v0, Lcom/facebook/orca/photos/a/d;

    iget-object v1, p0, Lcom/facebook/orca/photos/a/e;->e:Lcom/facebook/user/tiles/c;

    const-string v2, ""

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v3, p1

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/photos/a/d;-><init>(Lcom/facebook/user/tiles/c;Ljava/lang/String;Lcom/facebook/widget/tiles/a;Landroid/net/Uri;ZLjava/util/List;)V

    return-object v0
.end method
