.class public Lcom/facebook/orca/f/n;
.super Ljava/lang/Object;
.source "OutgoingMessageFactory.java"


# instance fields
.field private final a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/viewercontext/ViewerContext;",
            ">;"
        }
    .end annotation
.end field

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

.field private final d:Lcom/facebook/orca/threads/a;

.field private final e:Lcom/facebook/orca/j/c;


# direct methods
.method public constructor <init>(Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/orca/threads/a;Lcom/facebook/common/time/a;Lcom/facebook/orca/j/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/viewercontext/ViewerContext;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/user/User;",
            ">;",
            "Lcom/facebook/orca/threads/a;",
            "Lcom/facebook/common/time/a;",
            "Lcom/facebook/orca/j/c;",
            ")V"
        }
    .end annotation

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/facebook/orca/f/n;->a:Ljavax/inject/a;

    .line 47
    iput-object p2, p0, Lcom/facebook/orca/f/n;->b:Ljavax/inject/a;

    .line 48
    iput-object p3, p0, Lcom/facebook/orca/f/n;->d:Lcom/facebook/orca/threads/a;

    .line 49
    iput-object p4, p0, Lcom/facebook/orca/f/n;->c:Lcom/facebook/common/time/a;

    .line 50
    iput-object p5, p0, Lcom/facebook/orca/f/n;->e:Lcom/facebook/orca/j/c;

    .line 51
    return-void
.end method


# virtual methods
.method public a(ILcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLcom/facebook/location/Coordinates;Ljava/util/List;Ljava/util/List;)Lcom/facebook/messages/model/threads/Message;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/facebook/messages/threads/model/ThreadViewSpec;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJ",
            "Lcom/facebook/location/Coordinates;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/media/attachments/MediaResource;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/share/Share;",
            ">;)",
            "Lcom/facebook/messages/model/threads/Message;"
        }
    .end annotation

    .prologue
    .line 112
    const/4 v13, 0x0

    move-object v0, p0

    move v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-wide/from16 v6, p6

    move-wide/from16 v8, p8

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    invoke-virtual/range {v0 .. v13}, Lcom/facebook/orca/f/n;->a(ILcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLcom/facebook/location/Coordinates;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    return-object v0
.end method

.method public a(ILcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLcom/facebook/location/Coordinates;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)Lcom/facebook/messages/model/threads/Message;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/facebook/messages/threads/model/ThreadViewSpec;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJ",
            "Lcom/facebook/location/Coordinates;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/media/attachments/MediaResource;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/share/Share;",
            ">;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/facebook/messages/model/threads/Message;"
        }
    .end annotation

    .prologue
    .line 139
    iget-object v2, p0, Lcom/facebook/orca/f/n;->c:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    .line 140
    const-wide/16 v4, -0x1

    cmp-long v4, p6, v4

    if-nez v4, :cond_0

    move-wide/from16 p6, v2

    .line 143
    :cond_0
    const-wide/16 v4, -0x1

    cmp-long v4, p8, v4

    if-nez v4, :cond_1

    move-wide/from16 p8, v2

    .line 146
    :cond_1
    if-nez p13, :cond_2

    .line 147
    invoke-static {}, Lcom/google/common/a/ev;->j()Lcom/google/common/a/ev;

    move-result-object p13

    .line 150
    :cond_2
    iget-object v2, p0, Lcom/facebook/orca/f/n;->a:Ljavax/inject/a;

    invoke-interface {v2}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/auth/viewercontext/ViewerContext;

    .line 151
    const-string v3, "Can\'t create a sent message without a viewer"

    invoke-static {v2, v3}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    invoke-virtual {v2}, Lcom/facebook/auth/viewercontext/ViewerContext;->c()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 156
    const-string v3, ""

    move-object v7, v3

    .line 163
    :goto_0
    if-eqz p11, :cond_8

    .line 164
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v6

    .line 165
    const/4 v3, 0x0

    .line 166
    invoke-interface/range {p11 .. p11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move v4, v3

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 168
    invoke-virtual {v3}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v5

    sget-object v9, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    if-ne v5, v9, :cond_3

    invoke-virtual {v3}, Lcom/facebook/ui/media/attachments/MediaResource;->f()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_5

    .line 170
    :cond_3
    invoke-interface {v6, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 158
    :cond_4
    iget-object v3, p0, Lcom/facebook/orca/f/n;->b:Ljavax/inject/a;

    invoke-interface {v3}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/user/User;

    .line 159
    invoke-virtual {v3}, Lcom/facebook/user/User;->h()Ljava/lang/String;

    move-result-object v3

    move-object v7, v3

    goto :goto_0

    .line 173
    :cond_5
    new-instance v9, Ljava/lang/StringBuilder;

    const/16 v5, 0x28

    invoke-direct {v9, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 176
    if-nez p3, :cond_6

    iget-object v5, p0, Lcom/facebook/orca/f/n;->c:Lcom/facebook/common/time/a;

    invoke-interface {v5}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    .line 178
    :goto_2
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v10, "_"

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v10, ".jpg"

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    iget-object v5, p0, Lcom/facebook/orca/f/n;->e:Lcom/facebook/orca/j/c;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x1

    invoke-virtual {v5, v9, v10}, Lcom/facebook/orca/j/c;->b(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v5

    .line 184
    invoke-static {v3, v5}, Lcom/facebook/ui/media/attachments/MediaResource;->a(Lcom/facebook/ui/media/attachments/MediaResource;Ljava/lang/String;)Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v3

    invoke-interface {v6, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 186
    add-int/lit8 v3, v4, 0x1

    move v4, v3

    .line 187
    goto :goto_1

    :cond_6
    move-object v5, p3

    .line 176
    goto :goto_2

    :cond_7
    move-object/from16 p11, v6

    .line 191
    :cond_8
    if-nez p12, :cond_9

    .line 192
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object p12

    .line 195
    :cond_9
    new-instance v3, Lcom/facebook/messages/model/threads/ParticipantInfo;

    new-instance v4, Lcom/facebook/user/UserKey;

    sget-object v5, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    invoke-virtual {v2}, Lcom/facebook/auth/viewercontext/ViewerContext;->a()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Lcom/facebook/user/UserKey;-><init>(Lcom/facebook/user/n;Ljava/lang/String;)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/facebook/auth/viewercontext/ViewerContext;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, "@facebook.com"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v4, v7, v2}, Lcom/facebook/messages/model/threads/ParticipantInfo;-><init>(Lcom/facebook/user/UserKey;Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    iget-object v2, p0, Lcom/facebook/orca/f/n;->d:Lcom/facebook/orca/threads/a;

    move-wide/from16 v0, p6

    invoke-virtual {v2, v0, v1}, Lcom/facebook/orca/threads/a;->a(J)J

    move-result-wide v4

    .line 200
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "sent."

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 201
    new-instance v6, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v6}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v6, p1}, Lcom/facebook/messages/model/threads/e;->a(I)Lcom/facebook/messages/model/threads/e;

    move-result-object v6

    invoke-virtual {v6, v2}, Lcom/facebook/messages/model/threads/e;->a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2, p3}, Lcom/facebook/messages/model/threads/e;->e(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    move-object/from16 v0, p4

    invoke-virtual {v2, v0}, Lcom/facebook/messages/model/threads/e;->d(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    move-wide/from16 v0, p6

    invoke-virtual {v2, v0, v1}, Lcom/facebook/messages/model/threads/e;->a(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    move-wide/from16 v0, p8

    invoke-virtual {v2, v0, v1}, Lcom/facebook/messages/model/threads/e;->b(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Lcom/facebook/messages/model/threads/e;->c(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    move-object/from16 v0, p10

    invoke-virtual {v2, v0}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/location/Coordinates;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/facebook/messages/model/threads/e;->a(Z)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    sget-object v3, Lcom/facebook/messages/model/threads/c;->SEND:Lcom/facebook/messages/model/threads/c;

    invoke-virtual {v2, v3}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/c;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    const-string v3, "mobile"

    invoke-virtual {v2, v3}, Lcom/facebook/messages/model/threads/e;->f(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    move-object/from16 v0, p11

    invoke-virtual {v2, v0}, Lcom/facebook/messages/model/threads/e;->e(Ljava/util/List;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    move-object/from16 v0, p12

    invoke-virtual {v2, v0}, Lcom/facebook/messages/model/threads/e;->f(Ljava/util/List;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    move-object/from16 v0, p5

    invoke-virtual {v2, v0}, Lcom/facebook/messages/model/threads/e;->g(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    move-object/from16 v0, p13

    invoke-virtual {v2, v0}, Lcom/facebook/messages/model/threads/e;->a(Ljava/util/Map;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    .line 219
    invoke-virtual {p2}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v3

    if-eqz v3, :cond_a

    .line 220
    invoke-virtual {p2}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/messages/model/threads/e;->b(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    .line 224
    :goto_3
    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v2

    return-object v2

    .line 222
    :cond_a
    invoke-virtual {p2}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->e()Lcom/facebook/user/RecipientInfo;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/user/RecipientInfo;)Lcom/facebook/messages/model/threads/e;

    goto :goto_3
.end method

.method public a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLcom/facebook/location/Coordinates;Ljava/util/List;)Lcom/facebook/messages/model/threads/Message;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJ",
            "Lcom/facebook/location/Coordinates;",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/media/attachments/MediaResource;",
            ">;)",
            "Lcom/facebook/messages/model/threads/Message;"
        }
    .end annotation

    .prologue
    .line 62
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v12

    .line 63
    invoke-static {p2}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v2

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-virtual/range {v0 .. v12}, Lcom/facebook/orca/f/n;->a(ILcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLcom/facebook/location/Coordinates;Ljava/util/List;Ljava/util/List;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    return-object v0
.end method
