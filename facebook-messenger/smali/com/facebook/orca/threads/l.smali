.class public Lcom/facebook/orca/threads/l;
.super Ljava/lang/Object;
.source "MessagesUiReorderer.java"


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
.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/common/time/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-class v0, Lcom/facebook/orca/threads/l;

    sput-object v0, Lcom/facebook/orca/threads/l;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/common/time/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;",
            "Lcom/facebook/common/time/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/facebook/orca/threads/l;->b:Ljavax/inject/a;

    .line 39
    iput-object p2, p0, Lcom/facebook/orca/threads/l;->c:Lcom/facebook/common/time/a;

    .line 40
    return-void
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;)J
    .locals 4

    .prologue
    .line 99
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 100
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v0

    .line 102
    :goto_0
    return-wide v0

    :cond_0
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v0

    goto :goto_0
.end method

.method private a(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;)V
    .locals 3

    .prologue
    const/16 v2, 0x8

    .line 116
    const/4 v0, 0x2

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 128
    :goto_0
    return-void

    .line 120
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    const-string v1, "  Before Messages:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    invoke-direct {p0, v0, p1, v2}, Lcom/facebook/orca/threads/l;->a(Ljava/lang/StringBuilder;Lcom/facebook/orca/threads/MessagesCollection;I)V

    .line 124
    const-string v1, "  After Messages:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    invoke-direct {p0, v0, p2, v2}, Lcom/facebook/orca/threads/l;->a(Ljava/lang/StringBuilder;Lcom/facebook/orca/threads/MessagesCollection;I)V

    .line 127
    sget-object v1, Lcom/facebook/orca/threads/l;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/StringBuilder;Lcom/facebook/orca/threads/MessagesCollection;I)V
    .locals 3

    .prologue
    .line 131
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/facebook/orca/threads/MessagesCollection;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 132
    :cond_0
    const-string v0, "    none\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    :cond_1
    return-void

    .line 134
    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_1

    invoke-virtual {p2}, Lcom/facebook/orca/threads/MessagesCollection;->f()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 135
    invoke-virtual {p2, v0}, Lcom/facebook/orca/threads/MessagesCollection;->a(I)Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    .line 136
    const-string v2, "   "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private b(Lcom/facebook/messages/model/threads/Message;)Z
    .locals 3

    .prologue
    .line 106
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    .line 107
    iget-object v0, p0, Lcom/facebook/orca/threads/l;->b:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 108
    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threads/MessagesCollection;)Lcom/facebook/orca/threads/MessagesCollection;
    .locals 12

    .prologue
    .line 47
    const/4 v2, -0x1

    .line 48
    iget-object v0, p0, Lcom/facebook/orca/threads/l;->c:Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v5

    .line 49
    invoke-virtual {p1}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v7

    .line 50
    const/4 v1, 0x0

    .line 51
    const/4 v0, 0x0

    move v4, v2

    move v2, v1

    move v1, v0

    :goto_0
    invoke-virtual {v7}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 52
    invoke-virtual {v7, v1}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 53
    invoke-direct {p0, v0}, Lcom/facebook/orca/threads/l;->b(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v3

    .line 54
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v8

    sub-long v8, v5, v8

    const-wide/32 v10, 0x1b7740

    cmp-long v0, v8, v10

    if-lez v0, :cond_2

    .line 55
    const/4 v0, -0x1

    if-eq v4, v0, :cond_0

    if-eqz v3, :cond_0

    if-nez v2, :cond_2

    .line 63
    :cond_0
    const/4 v0, -0x1

    if-ne v4, v0, :cond_3

    .line 95
    :cond_1
    :goto_1
    return-object p1

    .line 51
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v2, v3

    move v4, v1

    move v1, v0

    goto :goto_0

    .line 70
    :cond_3
    const/4 v1, 0x0

    .line 71
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 72
    const/4 v2, 0x1

    move-object v3, v0

    :goto_2
    if-gt v2, v4, :cond_5

    .line 73
    invoke-virtual {v7, v2}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 74
    invoke-direct {p0, v3}, Lcom/facebook/orca/threads/l;->a(Lcom/facebook/messages/model/threads/Message;)J

    move-result-wide v5

    invoke-direct {p0, v0}, Lcom/facebook/orca/threads/l;->a(Lcom/facebook/messages/model/threads/Message;)J

    move-result-wide v8

    cmp-long v3, v5, v8

    if-gez v3, :cond_4

    .line 75
    const/4 v0, 0x1

    .line 81
    :goto_3
    if-eqz v0, :cond_1

    .line 87
    invoke-static {v7}, Lcom/google/common/a/hq;->a(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    .line 88
    const/4 v0, 0x0

    add-int/lit8 v2, v4, 0x1

    invoke-interface {v1, v0, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    .line 89
    new-instance v2, Lcom/facebook/orca/l/aj;

    invoke-direct {v2}, Lcom/facebook/orca/l/aj;-><init>()V

    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 90
    new-instance v0, Lcom/facebook/orca/threads/MessagesCollection;

    invoke-virtual {p1}, Lcom/facebook/orca/threads/MessagesCollection;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/orca/threads/MessagesCollection;->d()Z

    move-result v3

    invoke-direct {v0, v2, v1, v3}, Lcom/facebook/orca/threads/MessagesCollection;-><init>(Ljava/lang/String;Lcom/google/common/a/es;Z)V

    .line 94
    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/threads/l;->a(Lcom/facebook/orca/threads/MessagesCollection;Lcom/facebook/orca/threads/MessagesCollection;)V

    move-object p1, v0

    .line 95
    goto :goto_1

    .line 72
    :cond_4
    add-int/lit8 v2, v2, 0x1

    move-object v3, v0

    goto :goto_2

    :cond_5
    move v0, v1

    goto :goto_3
.end method
