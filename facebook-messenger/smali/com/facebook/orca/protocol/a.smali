.class public Lcom/facebook/orca/protocol/a;
.super Lcom/facebook/orca/server/a;
.source "WebServiceHandler.java"

# interfaces
.implements Lcom/facebook/fbservice/service/e;


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

.field private static final c:Lcom/facebook/debug/log/l;


# instance fields
.field private final A:Lcom/facebook/orca/protocol/methods/az;

.field private final B:Lcom/facebook/orca/protocol/methods/ae;

.field private final C:Lcom/facebook/analytics/cn;

.field private final D:Lcom/facebook/push/mqtt/bx;

.field private final E:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/a/j;",
            ">;"
        }
    .end annotation
.end field

.field private final F:Lcom/facebook/common/time/a;

.field private final G:Lcom/facebook/ui/media/b/a;

.field private final H:Lcom/facebook/orca/j/c;

.field private final I:Lcom/facebook/orca/photos/b/k;

.field private final J:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/facebook/http/protocol/i;

.field private final e:Lcom/facebook/orca/protocol/methods/n;

.field private final f:Lcom/facebook/orca/protocol/methods/l;

.field private final g:Lcom/facebook/orca/protocol/methods/j;

.field private final h:Lcom/facebook/orca/protocol/methods/o;

.field private final i:Lcom/facebook/orca/protocol/methods/s;

.field private final j:Lcom/facebook/orca/protocol/methods/i;

.field private final k:Lcom/facebook/orca/protocol/methods/al;

.field private final l:Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod;

.field private final m:Lcom/facebook/orca/protocol/methods/k;

.field private final n:Lcom/facebook/orca/protocol/methods/a;

.field private final o:Lcom/facebook/orca/protocol/methods/e;

.field private final p:Lcom/facebook/orca/protocol/methods/SendBroadcastMethod;

.field private final q:Lcom/facebook/orca/protocol/methods/ab;

.field private final r:Lcom/facebook/orca/protocol/methods/af;

.field private final s:Lcom/facebook/orca/protocol/methods/w;

.field private final t:Lcom/facebook/orca/protocol/methods/h;

.field private final u:Lcom/facebook/orca/protocol/methods/g;

.field private final v:Lcom/facebook/orca/protocol/methods/ay;

.field private final w:Lcom/facebook/orca/protocol/methods/aw;

.field private final x:Lcom/facebook/orca/protocol/methods/v;

.field private final y:Lcom/facebook/orca/protocol/methods/ax;

.field private final z:Lcom/facebook/orca/protocol/methods/ao;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 116
    const-class v0, Lcom/facebook/orca/protocol/a;

    sput-object v0, Lcom/facebook/orca/protocol/a;->a:Ljava/lang/Class;

    .line 117
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/orca/protocol/a;->b:Lcom/facebook/debug/log/l;

    .line 118
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/orca/protocol/a;->c:Lcom/facebook/debug/log/l;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/http/protocol/i;Lcom/facebook/orca/protocol/methods/n;Lcom/facebook/orca/protocol/methods/l;Lcom/facebook/orca/protocol/methods/j;Lcom/facebook/orca/protocol/methods/o;Lcom/facebook/orca/protocol/methods/s;Lcom/facebook/orca/protocol/methods/i;Lcom/facebook/orca/protocol/methods/al;Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod;Lcom/facebook/orca/protocol/methods/k;Lcom/facebook/orca/protocol/methods/a;Lcom/facebook/orca/protocol/methods/e;Lcom/facebook/orca/protocol/methods/SendBroadcastMethod;Lcom/facebook/orca/protocol/methods/ab;Lcom/facebook/orca/protocol/methods/af;Lcom/facebook/orca/protocol/methods/w;Lcom/facebook/orca/protocol/methods/h;Lcom/facebook/orca/protocol/methods/g;Lcom/facebook/orca/protocol/methods/ay;Lcom/facebook/orca/protocol/methods/aw;Lcom/facebook/orca/protocol/methods/v;Lcom/facebook/orca/protocol/methods/ax;Lcom/facebook/orca/protocol/methods/ao;Lcom/facebook/orca/protocol/methods/az;Lcom/facebook/orca/protocol/methods/ae;Lcom/facebook/analytics/cn;Lcom/facebook/push/mqtt/bx;Ljavax/inject/a;Lcom/facebook/common/time/a;Lcom/facebook/ui/media/b/a;Lcom/facebook/orca/j/c;Lcom/facebook/orca/photos/b/k;Ljavax/inject/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/http/protocol/i;",
            "Lcom/facebook/orca/protocol/methods/n;",
            "Lcom/facebook/orca/protocol/methods/l;",
            "Lcom/facebook/orca/protocol/methods/j;",
            "Lcom/facebook/orca/protocol/methods/o;",
            "Lcom/facebook/orca/protocol/methods/s;",
            "Lcom/facebook/orca/protocol/methods/i;",
            "Lcom/facebook/orca/protocol/methods/al;",
            "Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod;",
            "Lcom/facebook/orca/protocol/methods/k;",
            "Lcom/facebook/orca/protocol/methods/a;",
            "Lcom/facebook/orca/protocol/methods/e;",
            "Lcom/facebook/orca/protocol/methods/SendBroadcastMethod;",
            "Lcom/facebook/orca/protocol/methods/ab;",
            "Lcom/facebook/orca/protocol/methods/af;",
            "Lcom/facebook/orca/protocol/methods/w;",
            "Lcom/facebook/orca/protocol/methods/h;",
            "Lcom/facebook/orca/protocol/methods/g;",
            "Lcom/facebook/orca/protocol/methods/ay;",
            "Lcom/facebook/orca/protocol/methods/aw;",
            "Lcom/facebook/orca/protocol/methods/v;",
            "Lcom/facebook/orca/protocol/methods/ax;",
            "Lcom/facebook/orca/protocol/methods/ao;",
            "Lcom/facebook/orca/protocol/methods/az;",
            "Lcom/facebook/orca/protocol/methods/ae;",
            "Lcom/facebook/analytics/cn;",
            "Lcom/facebook/push/mqtt/bx;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/orca/a/j;",
            ">;",
            "Lcom/facebook/common/time/a;",
            "Lcom/facebook/ui/media/b/a;",
            "Lcom/facebook/orca/j/c;",
            "Lcom/facebook/orca/photos/b/k;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 195
    const-string v1, "WebServiceHandler"

    invoke-direct {p0, v1}, Lcom/facebook/orca/server/a;-><init>(Ljava/lang/String;)V

    .line 196
    iput-object p1, p0, Lcom/facebook/orca/protocol/a;->d:Lcom/facebook/http/protocol/i;

    .line 197
    iput-object p2, p0, Lcom/facebook/orca/protocol/a;->e:Lcom/facebook/orca/protocol/methods/n;

    .line 198
    iput-object p3, p0, Lcom/facebook/orca/protocol/a;->f:Lcom/facebook/orca/protocol/methods/l;

    .line 199
    iput-object p4, p0, Lcom/facebook/orca/protocol/a;->g:Lcom/facebook/orca/protocol/methods/j;

    .line 200
    iput-object p5, p0, Lcom/facebook/orca/protocol/a;->h:Lcom/facebook/orca/protocol/methods/o;

    .line 201
    iput-object p6, p0, Lcom/facebook/orca/protocol/a;->i:Lcom/facebook/orca/protocol/methods/s;

    .line 202
    iput-object p7, p0, Lcom/facebook/orca/protocol/a;->j:Lcom/facebook/orca/protocol/methods/i;

    .line 203
    iput-object p8, p0, Lcom/facebook/orca/protocol/a;->k:Lcom/facebook/orca/protocol/methods/al;

    .line 204
    iput-object p9, p0, Lcom/facebook/orca/protocol/a;->l:Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod;

    .line 205
    iput-object p10, p0, Lcom/facebook/orca/protocol/a;->m:Lcom/facebook/orca/protocol/methods/k;

    .line 206
    iput-object p11, p0, Lcom/facebook/orca/protocol/a;->n:Lcom/facebook/orca/protocol/methods/a;

    .line 207
    iput-object p12, p0, Lcom/facebook/orca/protocol/a;->o:Lcom/facebook/orca/protocol/methods/e;

    .line 208
    iput-object p13, p0, Lcom/facebook/orca/protocol/a;->p:Lcom/facebook/orca/protocol/methods/SendBroadcastMethod;

    .line 209
    move-object/from16 v0, p14

    iput-object v0, p0, Lcom/facebook/orca/protocol/a;->q:Lcom/facebook/orca/protocol/methods/ab;

    .line 210
    move-object/from16 v0, p15

    iput-object v0, p0, Lcom/facebook/orca/protocol/a;->r:Lcom/facebook/orca/protocol/methods/af;

    .line 211
    move-object/from16 v0, p16

    iput-object v0, p0, Lcom/facebook/orca/protocol/a;->s:Lcom/facebook/orca/protocol/methods/w;

    .line 212
    move-object/from16 v0, p17

    iput-object v0, p0, Lcom/facebook/orca/protocol/a;->t:Lcom/facebook/orca/protocol/methods/h;

    .line 213
    move-object/from16 v0, p18

    iput-object v0, p0, Lcom/facebook/orca/protocol/a;->u:Lcom/facebook/orca/protocol/methods/g;

    .line 214
    move-object/from16 v0, p19

    iput-object v0, p0, Lcom/facebook/orca/protocol/a;->v:Lcom/facebook/orca/protocol/methods/ay;

    .line 215
    move-object/from16 v0, p20

    iput-object v0, p0, Lcom/facebook/orca/protocol/a;->w:Lcom/facebook/orca/protocol/methods/aw;

    .line 216
    move-object/from16 v0, p21

    iput-object v0, p0, Lcom/facebook/orca/protocol/a;->x:Lcom/facebook/orca/protocol/methods/v;

    .line 217
    move-object/from16 v0, p22

    iput-object v0, p0, Lcom/facebook/orca/protocol/a;->y:Lcom/facebook/orca/protocol/methods/ax;

    .line 218
    move-object/from16 v0, p23

    iput-object v0, p0, Lcom/facebook/orca/protocol/a;->z:Lcom/facebook/orca/protocol/methods/ao;

    .line 219
    move-object/from16 v0, p24

    iput-object v0, p0, Lcom/facebook/orca/protocol/a;->A:Lcom/facebook/orca/protocol/methods/az;

    .line 220
    move-object/from16 v0, p25

    iput-object v0, p0, Lcom/facebook/orca/protocol/a;->B:Lcom/facebook/orca/protocol/methods/ae;

    .line 221
    move-object/from16 v0, p26

    iput-object v0, p0, Lcom/facebook/orca/protocol/a;->C:Lcom/facebook/analytics/cn;

    .line 222
    move-object/from16 v0, p27

    iput-object v0, p0, Lcom/facebook/orca/protocol/a;->D:Lcom/facebook/push/mqtt/bx;

    .line 223
    move-object/from16 v0, p28

    iput-object v0, p0, Lcom/facebook/orca/protocol/a;->E:Ljavax/inject/a;

    .line 224
    move-object/from16 v0, p29

    iput-object v0, p0, Lcom/facebook/orca/protocol/a;->F:Lcom/facebook/common/time/a;

    .line 225
    move-object/from16 v0, p30

    iput-object v0, p0, Lcom/facebook/orca/protocol/a;->G:Lcom/facebook/ui/media/b/a;

    .line 226
    move-object/from16 v0, p31

    iput-object v0, p0, Lcom/facebook/orca/protocol/a;->H:Lcom/facebook/orca/j/c;

    .line 227
    move-object/from16 v0, p32

    iput-object v0, p0, Lcom/facebook/orca/protocol/a;->I:Lcom/facebook/orca/photos/b/k;

    .line 228
    move-object/from16 v0, p33

    iput-object v0, p0, Lcom/facebook/orca/protocol/a;->J:Ljavax/inject/a;

    .line 229
    return-void
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/http/protocol/j;Ljava/lang/StringBuilder;)I
    .locals 5

    .prologue
    .line 711
    const/4 v0, 0x0

    .line 713
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v1

    .line 714
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 715
    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v3

    sget-object v4, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    if-ne v3, v4, :cond_0

    .line 718
    iget-object v3, p0, Lcom/facebook/orca/protocol/a;->q:Lcom/facebook/orca/protocol/methods/ab;

    new-instance v4, Lcom/facebook/orca/protocol/methods/ac;

    invoke-direct {v4, v0, v1}, Lcom/facebook/orca/protocol/methods/ac;-><init>(Lcom/facebook/ui/media/attachments/MediaResource;I)V

    invoke-static {v3, v4}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "media-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    .line 723
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-eqz v0, :cond_1

    .line 724
    const/16 v0, 0x2c

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 726
    :cond_1
    const-string v0, "{result=media-"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ":$.id}"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 727
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 729
    :cond_2
    return v1
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;Ljava/lang/StringBuilder;)I
    .locals 6

    .prologue
    .line 686
    const/4 v0, 0x0

    .line 687
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 688
    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->j()Ljava/lang/String;

    move-result-object v0

    .line 689
    iget-object v3, p0, Lcom/facebook/orca/protocol/a;->I:Lcom/facebook/orca/photos/b/k;

    invoke-virtual {v3, v0}, Lcom/facebook/orca/photos/b/k;->a(Ljava/lang/String;)Lcom/facebook/orca/photos/b/m;

    move-result-object v0

    .line 691
    iget-object v3, v0, Lcom/facebook/orca/photos/b/m;->a:Lcom/facebook/orca/photos/b/n;

    sget-object v4, Lcom/facebook/orca/photos/b/n;->SUCCESS:Lcom/facebook/orca/photos/b/n;

    if-eq v3, v4, :cond_0

    .line 693
    const-string v3, "PhotoUpload"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Photo upload state is: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v0, v0, Lcom/facebook/orca/photos/b/m;->a:Lcom/facebook/orca/photos/b/n;

    invoke-virtual {v0}, Lcom/facebook/orca/photos/b/n;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/facebook/common/e/m;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/common/e/m;

    goto :goto_0

    .line 698
    :cond_0
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_1

    .line 699
    const-string v3, ","

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 701
    :cond_1
    iget-object v0, v0, Lcom/facebook/orca/photos/b/m;->b:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 702
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    .line 703
    goto :goto_0

    .line 704
    :cond_2
    return v1
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/d;Ljava/lang/String;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 15

    .prologue
    .line 799
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->F:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v13

    .line 801
    :try_start_0
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->J:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct/range {p0 .. p1}, Lcom/facebook/orca/protocol/a;->b(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 803
    invoke-direct/range {p0 .. p1}, Lcom/facebook/orca/protocol/a;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/protocol/c;

    move-result-object v1

    .line 804
    sget-object v2, Lcom/facebook/orca/protocol/c;->IN_PROGRESS:Lcom/facebook/orca/protocol/c;

    if-ne v1, v2, :cond_0

    .line 806
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->C:Lcom/facebook/analytics/cn;

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v4

    iget-object v6, p0, Lcom/facebook/orca/protocol/a;->F:Lcom/facebook/common/time/a;

    invoke-interface {v6}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v6

    sub-long/2addr v6, v13

    move-object/from16 v0, p2

    iget-wide v8, v0, Lcom/facebook/messages/model/threads/d;->b:J

    const/4 v11, 0x0

    move-object/from16 v10, p3

    invoke-virtual/range {v1 .. v11}, Lcom/facebook/analytics/cn;->b(Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;I)V

    .line 814
    sget-object v1, Lcom/facebook/fbservice/service/t;->PHOTO_UPLOAD_NOT_COMPLETE:Lcom/facebook/fbservice/service/t;

    const-string v2, "All photos not present yet"

    invoke-static {v1, v2}, Lcom/facebook/fbservice/service/OperationResult;->a(Lcom/facebook/fbservice/service/t;Ljava/lang/String;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    .line 843
    :goto_0
    return-object v1

    .line 818
    :cond_0
    sget-object v2, Lcom/facebook/orca/protocol/c;->FAILED:Lcom/facebook/orca/protocol/c;

    if-ne v1, v2, :cond_1

    .line 820
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->C:Lcom/facebook/analytics/cn;

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v4

    iget-object v6, p0, Lcom/facebook/orca/protocol/a;->F:Lcom/facebook/common/time/a;

    invoke-interface {v6}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v6

    sub-long/2addr v6, v13

    move-object/from16 v0, p2

    iget-wide v8, v0, Lcom/facebook/messages/model/threads/d;->b:J

    sget-object v10, Lcom/facebook/orca/photos/b/j;->a:Lcom/facebook/orca/photos/b/j;

    const/4 v12, 0x0

    move-object/from16 v11, p3

    invoke-virtual/range {v1 .. v12}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/Throwable;Ljava/lang/String;I)V

    .line 829
    sget-object v1, Lcom/facebook/fbservice/service/t;->PHOTO_UPLOAD_FAILED:Lcom/facebook/fbservice/service/t;

    const-string v2, "One or more photos failed to upload"

    invoke-static {v1, v2}, Lcom/facebook/fbservice/service/OperationResult;->a(Lcom/facebook/fbservice/service/t;Ljava/lang/String;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    goto :goto_0

    .line 834
    :cond_1
    invoke-direct/range {p0 .. p1}, Lcom/facebook/orca/protocol/a;->d(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/server/NewMessageResult;

    move-result-object v12

    .line 835
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->C:Lcom/facebook/analytics/cn;

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v4

    iget-object v6, p0, Lcom/facebook/orca/protocol/a;->F:Lcom/facebook/common/time/a;

    invoke-interface {v6}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v6

    sub-long/2addr v6, v13

    move-object/from16 v0, p2

    iget-wide v8, v0, Lcom/facebook/messages/model/threads/d;->b:J

    const/4 v11, 0x0

    move-object/from16 v10, p3

    invoke-virtual/range {v1 .. v11}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;I)V

    .line 843
    invoke-static {v12}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_0

    .line 844
    :catch_0
    move-exception v10

    .line 846
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->C:Lcom/facebook/analytics/cn;

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v4

    iget-object v6, p0, Lcom/facebook/orca/protocol/a;->F:Lcom/facebook/common/time/a;

    invoke-interface {v6}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v6

    sub-long/2addr v6, v13

    move-object/from16 v0, p2

    iget-wide v8, v0, Lcom/facebook/messages/model/threads/d;->b:J

    const/4 v12, 0x0

    move-object/from16 v11, p3

    invoke-virtual/range {v1 .. v12}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/Throwable;Ljava/lang/String;I)V

    .line 855
    const-class v1, Ljava/lang/Exception;

    invoke-static {v10, v1}, Lcom/google/common/base/Throwables;->propagateIfPossible(Ljava/lang/Throwable;Ljava/lang/Class;)V

    .line 856
    invoke-static {v10}, Lcom/google/common/base/Throwables;->propagate(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object v1

    throw v1
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/protocol/c;
    .locals 4

    .prologue
    .line 613
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->C()Z

    move-result v0

    if-nez v0, :cond_0

    .line 614
    sget-object v0, Lcom/facebook/orca/protocol/c;->NO_PHOTOS:Lcom/facebook/orca/protocol/c;

    .line 631
    :goto_0
    return-object v0

    .line 617
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 618
    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->j()Ljava/lang/String;

    move-result-object v0

    .line 619
    iget-object v2, p0, Lcom/facebook/orca/protocol/a;->I:Lcom/facebook/orca/photos/b/k;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/photos/b/k;->a(Ljava/lang/String;)Lcom/facebook/orca/photos/b/m;

    move-result-object v0

    .line 621
    iget-object v2, v0, Lcom/facebook/orca/photos/b/m;->a:Lcom/facebook/orca/photos/b/n;

    sget-object v3, Lcom/facebook/orca/photos/b/n;->SUCCESS:Lcom/facebook/orca/photos/b/n;

    if-eq v2, v3, :cond_1

    .line 624
    iget-object v1, v0, Lcom/facebook/orca/photos/b/m;->a:Lcom/facebook/orca/photos/b/n;

    sget-object v2, Lcom/facebook/orca/photos/b/n;->IN_PROGRESS:Lcom/facebook/orca/photos/b/n;

    if-eq v1, v2, :cond_2

    iget-object v0, v0, Lcom/facebook/orca/photos/b/m;->a:Lcom/facebook/orca/photos/b/n;

    sget-object v1, Lcom/facebook/orca/photos/b/n;->NOT_ACTIVE:Lcom/facebook/orca/photos/b/n;

    if-ne v0, v1, :cond_3

    .line 626
    :cond_2
    sget-object v0, Lcom/facebook/orca/protocol/c;->IN_PROGRESS:Lcom/facebook/orca/protocol/c;

    goto :goto_0

    .line 628
    :cond_3
    sget-object v0, Lcom/facebook/orca/protocol/c;->FAILED:Lcom/facebook/orca/protocol/c;

    goto :goto_0

    .line 631
    :cond_4
    sget-object v0, Lcom/facebook/orca/protocol/c;->ALL_UPLOADED:Lcom/facebook/orca/protocol/c;

    goto :goto_0
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/user/UserKey;Lcom/facebook/messages/model/threads/d;Lcom/facebook/orca/a/j;)Lcom/facebook/orca/protocol/methods/ar;
    .locals 28

    .prologue
    .line 738
    const/4 v2, 0x0

    .line 739
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/facebook/orca/protocol/a;->D:Lcom/facebook/push/mqtt/bx;

    invoke-virtual {v3}, Lcom/facebook/push/mqtt/bx;->a()Lcom/facebook/push/mqtt/bw;

    move-result-object v27

    .line 741
    const/4 v12, 0x1

    :goto_0
    :try_start_0
    move-object/from16 v0, p4

    iget v3, v0, Lcom/facebook/orca/a/j;->d:I

    if-gt v12, v3, :cond_1

    .line 743
    move-object/from16 v0, p4

    iget v2, v0, Lcom/facebook/orca/a/j;->f:I

    if-gt v12, v2, :cond_0

    .line 745
    move-object/from16 v0, p4

    iget-wide v2, v0, Lcom/facebook/orca/a/j;->e:J

    move-object/from16 v0, v27

    invoke-virtual {v0, v2, v3}, Lcom/facebook/push/mqtt/bw;->a(J)Z

    .line 749
    :cond_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/protocol/a;->F:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v7

    .line 751
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/protocol/a;->z:Lcom/facebook/orca/protocol/methods/ao;

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-virtual {v2, v0, v1}, Lcom/facebook/orca/protocol/methods/ao;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/user/UserKey;)Lcom/facebook/orca/protocol/methods/ar;

    move-result-object v26

    .line 755
    sget-object v2, Lcom/facebook/orca/protocol/b;->a:[I

    invoke-virtual/range {v26 .. v26}, Lcom/facebook/orca/protocol/methods/ar;->a()Lcom/facebook/orca/protocol/methods/au;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/orca/protocol/methods/au;->ordinal()I

    move-result v3

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_0

    .line 741
    :goto_1
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v2, v26

    goto :goto_0

    .line 757
    :pswitch_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/protocol/a;->C:Lcom/facebook/analytics/cn;

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v5

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/facebook/orca/protocol/a;->F:Lcom/facebook/common/time/a;

    invoke-interface {v9}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v9

    sub-long v7, v9, v7

    move-object/from16 v0, p3

    iget-wide v9, v0, Lcom/facebook/messages/model/threads/d;->b:J

    const-string v11, "via_mqtt"

    invoke-virtual/range {v2 .. v12}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 789
    invoke-virtual/range {v27 .. v27}, Lcom/facebook/push/mqtt/bw;->c()V

    move-object/from16 v2, v26

    .line 792
    :goto_2
    return-object v2

    .line 767
    :pswitch_1
    :try_start_1
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/protocol/a;->C:Lcom/facebook/analytics/cn;

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {v26 .. v26}, Lcom/facebook/orca/protocol/methods/ar;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4, v12}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 789
    :catchall_0
    move-exception v2

    invoke-virtual/range {v27 .. v27}, Lcom/facebook/push/mqtt/bw;->c()V

    throw v2

    .line 774
    :pswitch_2
    :try_start_2
    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/facebook/orca/protocol/a;->C:Lcom/facebook/analytics/cn;

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v16

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/protocol/a;->F:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    sub-long v18, v2, v7

    move-object/from16 v0, p3

    iget-wide v0, v0, Lcom/facebook/messages/model/threads/d;->b:J

    move-wide/from16 v20, v0

    invoke-virtual/range {v26 .. v26}, Lcom/facebook/orca/protocol/methods/ar;->d()Ljava/lang/String;

    move-result-object v22

    invoke-virtual/range {v26 .. v26}, Lcom/facebook/orca/protocol/methods/ar;->e()I

    move-result v23

    invoke-virtual/range {v27 .. v27}, Lcom/facebook/push/mqtt/bw;->b()Lcom/facebook/push/mqtt/bu;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/push/mqtt/bu;->toString()Ljava/lang/String;

    move-result-object v24

    move/from16 v25, v12

    invoke-virtual/range {v13 .. v25}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;ILjava/lang/String;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 789
    :cond_1
    invoke-virtual/range {v27 .. v27}, Lcom/facebook/push/mqtt/bw;->c()V

    goto :goto_2

    .line 755
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private a(Ljava/io/File;)V
    .locals 3

    .prologue
    .line 677
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 678
    sget-object v0, Lcom/facebook/orca/protocol/a;->c:Lcom/facebook/debug/log/l;

    sget-object v1, Lcom/facebook/orca/protocol/a;->a:Ljava/lang/Class;

    const-string v2, "Could not delete temp file after failed scaling"

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;)V

    .line 683
    :cond_0
    return-void
.end method

.method private b(Lcom/facebook/messages/model/threads/Message;)Z
    .locals 3

    .prologue
    .line 635
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 636
    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v0

    sget-object v2, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    if-eq v0, v2, :cond_0

    .line 637
    const/4 v0, 0x0

    .line 640
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private c(Lcom/facebook/messages/model/threads/Message;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/messages/model/threads/Message;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v5, 0x1

    .line 644
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 646
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 647
    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v3

    sget-object v4, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    if-ne v3, v4, :cond_0

    .line 648
    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->j()Ljava/lang/String;

    move-result-object v3

    .line 649
    if-nez v3, :cond_1

    .line 650
    sget-object v0, Lcom/facebook/orca/protocol/a;->b:Lcom/facebook/debug/log/l;

    sget-object v3, Lcom/facebook/orca/protocol/a;->a:Ljava/lang/Class;

    const-string v4, "A mediaResource didn\'t have a filename"

    invoke-static {v0, v3, v4}, Lcom/facebook/debug/log/b;->a(Lcom/facebook/debug/log/l;Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 653
    :cond_1
    iget-object v4, p0, Lcom/facebook/orca/protocol/a;->H:Lcom/facebook/orca/j/c;

    invoke-virtual {v4, v3, v5}, Lcom/facebook/orca/j/c;->c(Ljava/lang/String;Z)Z

    move-result v4

    if-nez v4, :cond_0

    .line 657
    iget-object v4, p0, Lcom/facebook/orca/protocol/a;->H:Lcom/facebook/orca/j/c;

    invoke-virtual {v4, v3, v5}, Lcom/facebook/orca/j/c;->a(Ljava/lang/String;Z)Ljava/io/File;

    move-result-object v3

    .line 660
    :try_start_0
    iget-object v4, p0, Lcom/facebook/orca/protocol/a;->G:Lcom/facebook/ui/media/b/a;

    invoke-virtual {v4, v0, v3}, Lcom/facebook/ui/media/b/a;->a(Lcom/facebook/ui/media/attachments/MediaResource;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 668
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 661
    :catch_0
    move-exception v0

    .line 662
    invoke-direct {p0, v3}, Lcom/facebook/orca/protocol/a;->a(Ljava/io/File;)V

    .line 663
    throw v0

    .line 664
    :catch_1
    move-exception v0

    .line 665
    invoke-direct {p0, v3}, Lcom/facebook/orca/protocol/a;->a(Ljava/io/File;)V

    .line 666
    throw v0

    .line 671
    :cond_2
    return-object v1
.end method

.method private d(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/server/NewMessageResult;
    .locals 11

    .prologue
    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 861
    iget-object v0, p0, Lcom/facebook/orca/protocol/a;->d:Lcom/facebook/http/protocol/i;

    invoke-interface {v0}, Lcom/facebook/http/protocol/i;->a()Lcom/facebook/http/protocol/j;

    move-result-object v9

    .line 866
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->E()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 867
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->E()Ljava/lang/String;

    move-result-object v0

    move v1, v7

    move-object v2, v0

    move-object v0, v8

    .line 878
    :goto_0
    new-instance v3, Lcom/facebook/orca/protocol/methods/am;

    if-nez v0, :cond_6

    move-object v0, v8

    :goto_1
    invoke-direct {v3, p1, v2, v0}, Lcom/facebook/orca/protocol/methods/am;-><init>(Lcom/facebook/messages/model/threads/Message;Ljava/lang/String;Ljava/lang/String;)V

    .line 882
    iget-object v0, p0, Lcom/facebook/orca/protocol/a;->k:Lcom/facebook/orca/protocol/methods/al;

    invoke-static {v0, v3}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    const-string v2, "send"

    invoke-virtual {v0, v2}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v2

    .line 886
    iget-object v0, p0, Lcom/facebook/orca/protocol/a;->J:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    if-lez v1, :cond_0

    .line 887
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "media-"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/http/protocol/z;->b(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    .line 889
    :cond_0
    invoke-virtual {v2}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v0

    invoke-interface {v9, v0}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    .line 892
    iget-object v0, p0, Lcom/facebook/orca/protocol/a;->g:Lcom/facebook/orca/protocol/methods/j;

    const-string v1, "{result=send:$.id}"

    invoke-static {v0, v1}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    const-string v1, "fetch_sent"

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    const-string v1, "send"

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/z;->b(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v0

    invoke-interface {v9, v0}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    .line 899
    new-instance v0, Lcom/facebook/orca/server/FetchMoreMessagesParams;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/orca/server/ThreadCriteria;->a(Ljava/lang/String;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v1

    const-wide/16 v2, 0x0

    const-wide/16 v4, -0x1

    const/4 v6, 0x2

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/server/FetchMoreMessagesParams;-><init>(Lcom/facebook/orca/server/ThreadCriteria;JJI)V

    .line 905
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->m:Lcom/facebook/orca/protocol/methods/k;

    invoke-static {v1, v0}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    const-string v1, "fetch"

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    const-string v1, "send"

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/z;->b(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v0

    invoke-interface {v9, v0}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    .line 912
    const-string v0, "sendMessage"

    invoke-interface {v9, v0}, Lcom/facebook/http/protocol/j;->b(Ljava/lang/String;)V

    .line 913
    const-string v0, "send"

    invoke-interface {v9, v0}, Lcom/facebook/http/protocol/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 914
    const-string v0, "fetch_sent"

    invoke-interface {v9, v0}, Lcom/facebook/http/protocol/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMessageResult;

    .line 915
    const-string v1, "fetch"

    invoke-interface {v9, v1}, Lcom/facebook/http/protocol/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/server/FetchMoreMessagesResult;

    .line 917
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMessageResult;->a()Lcom/facebook/messages/model/threads/Message;

    move-result-object v3

    .line 921
    invoke-virtual {v1}, Lcom/facebook/orca/server/FetchMoreMessagesResult;->a()Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v4

    .line 922
    invoke-virtual {v4}, Lcom/facebook/orca/threads/MessagesCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 923
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 924
    const/4 v7, 0x1

    .line 928
    :cond_2
    if-nez v7, :cond_3

    move-object v4, v8

    .line 933
    :cond_3
    new-instance v0, Lcom/facebook/orca/server/NewMessageResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    invoke-virtual {v3}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-direct/range {v0 .. v6}, Lcom/facebook/orca/server/NewMessageResult;-><init>(Lcom/facebook/fbservice/c/b;Ljava/lang/String;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/orca/threads/MessagesCollection;J)V

    return-object v0

    .line 868
    :cond_4
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->C()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 869
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v0, 0x32

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 870
    iget-object v0, p0, Lcom/facebook/orca/protocol/a;->J:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 871
    invoke-direct {p0, p1, v1}, Lcom/facebook/orca/protocol/a;->a(Lcom/facebook/messages/model/threads/Message;Ljava/lang/StringBuilder;)I

    move-result v0

    move-object v2, v8

    move-object v10, v1

    move v1, v0

    move-object v0, v10

    goto/16 :goto_0

    .line 873
    :cond_5
    invoke-direct {p0, p1, v9, v1}, Lcom/facebook/orca/protocol/a;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/http/protocol/j;Ljava/lang/StringBuilder;)I

    move-result v0

    move-object v2, v8

    move-object v10, v1

    move v1, v0

    move-object v0, v10

    goto/16 :goto_0

    .line 878
    :cond_6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :cond_7
    move v1, v7

    move-object v0, v8

    move-object v2, v8

    goto/16 :goto_0
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 7

    .prologue
    const-wide/16 v5, 0xa

    .line 233
    const-string v0, "WebServiceHandler"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 235
    :try_start_0
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 236
    sget-object v2, Lcom/facebook/orca/server/aq;->w:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 237
    invoke-virtual {p0, p1}, Lcom/facebook/orca/protocol/a;->b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 242
    invoke-virtual {v1, v5, v6}, Lcom/facebook/debug/d/e;->a(J)J

    return-object v0

    .line 239
    :cond_0
    :try_start_1
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unknown operation type: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 242
    :catchall_0
    move-exception v0

    invoke-virtual {v1, v5, v6}, Lcom/facebook/debug/d/e;->a(J)J

    throw v0
.end method

.method protected b(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 11

    .prologue
    .line 574
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v1

    .line 575
    const-string v0, "outgoingMessage"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/facebook/messages/model/threads/Message;

    .line 576
    const-string v0, "userKeyInCanonicalThread"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 577
    invoke-static {v0}, Lcom/facebook/user/UserKey;->a(Ljava/lang/String;)Lcom/facebook/user/UserKey;

    move-result-object v9

    .line 579
    iget-object v0, p0, Lcom/facebook/orca/protocol/a;->J:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 580
    invoke-direct {p0, v8}, Lcom/facebook/orca/protocol/a;->c(Lcom/facebook/messages/model/threads/Message;)Ljava/util/List;

    .line 583
    :cond_0
    invoke-static {v8}, Lcom/facebook/messages/model/threads/d;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/d;

    move-result-object v10

    .line 584
    iget-object v0, p0, Lcom/facebook/orca/protocol/a;->C:Lcom/facebook/analytics/cn;

    invoke-virtual {v8}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v1

    iget-wide v2, v10, Lcom/facebook/messages/model/threads/d;->b:J

    iget v4, v10, Lcom/facebook/messages/model/threads/d;->c:I

    iget v5, v10, Lcom/facebook/messages/model/threads/d;->d:I

    iget v6, v10, Lcom/facebook/messages/model/threads/d;->e:I

    iget-object v7, p0, Lcom/facebook/orca/protocol/a;->J:Ljavax/inject/a;

    invoke-interface {v7}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    invoke-virtual/range {v0 .. v7}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;JIIIZ)V

    .line 592
    iget-object v0, p0, Lcom/facebook/orca/protocol/a;->E:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/a/j;

    .line 595
    invoke-direct {p0, v8, v9, v10, v0}, Lcom/facebook/orca/protocol/a;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/user/UserKey;Lcom/facebook/messages/model/threads/d;Lcom/facebook/orca/a/j;)Lcom/facebook/orca/protocol/methods/ar;

    move-result-object v0

    .line 601
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/facebook/orca/protocol/methods/ar;->a()Lcom/facebook/orca/protocol/methods/au;

    move-result-object v1

    sget-object v2, Lcom/facebook/orca/protocol/methods/au;->SUCCEEDED:Lcom/facebook/orca/protocol/methods/au;

    if-ne v1, v2, :cond_1

    .line 602
    invoke-virtual {v0}, Lcom/facebook/orca/protocol/methods/ar;->b()Lcom/facebook/orca/server/NewMessageResult;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 609
    :goto_0
    return-object v0

    .line 606
    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/facebook/orca/protocol/methods/ar;->a()Lcom/facebook/orca/protocol/methods/au;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/protocol/methods/au;->FAILED:Lcom/facebook/orca/protocol/methods/au;

    if-ne v0, v1, :cond_2

    const-string v0, "via_graph_after_mqtt_failure"

    .line 609
    :goto_1
    invoke-direct {p0, v8, v10, v0}, Lcom/facebook/orca/protocol/a;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/threads/d;Ljava/lang/String;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    goto :goto_0

    .line 606
    :cond_2
    const-string v0, "via_graph"

    goto :goto_1
.end method

.method protected b(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 250
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 251
    const-string v1, "fetchThreadListParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadListParams;

    .line 252
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->d:Lcom/facebook/http/protocol/i;

    iget-object v2, p0, Lcom/facebook/orca/protocol/a;->e:Lcom/facebook/orca/protocol/methods/n;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/i;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadListResult;

    .line 254
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected c(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 261
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 262
    const-string v1, "fetchMoreThreadsParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMoreThreadsParams;

    .line 263
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->d:Lcom/facebook/http/protocol/i;

    iget-object v2, p0, Lcom/facebook/orca/protocol/a;->f:Lcom/facebook/orca/protocol/methods/l;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/i;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMoreThreadsResult;

    .line 265
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected d(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 8

    .prologue
    .line 272
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 273
    const-string v1, "fetchThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/facebook/orca/server/FetchThreadParams;

    .line 275
    iget-object v0, p0, Lcom/facebook/orca/protocol/a;->d:Lcom/facebook/http/protocol/i;

    invoke-interface {v0}, Lcom/facebook/http/protocol/i;->a()Lcom/facebook/http/protocol/j;

    move-result-object v7

    .line 278
    invoke-virtual {v6}, Lcom/facebook/orca/server/FetchThreadParams;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 279
    new-instance v0, Lcom/facebook/orca/server/MarkThreadParams;

    invoke-virtual {v6}, Lcom/facebook/orca/server/FetchThreadParams;->a()Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/server/ThreadCriteria;->a()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/facebook/orca/server/ai;->READ:Lcom/facebook/orca/server/ai;

    const/4 v3, 0x1

    invoke-virtual {v6}, Lcom/facebook/orca/server/FetchThreadParams;->e()J

    move-result-wide v4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/server/MarkThreadParams;-><init>(Ljava/lang/String;Lcom/facebook/orca/server/ai;ZJ)V

    .line 284
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->s:Lcom/facebook/orca/protocol/methods/w;

    invoke-static {v1, v0}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    const-string v1, "update-last-read"

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v0

    invoke-interface {v7, v0}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    .line 290
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/protocol/a;->h:Lcom/facebook/orca/protocol/methods/o;

    invoke-static {v0, v6}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    const-string v1, "fetch-thread"

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v1

    invoke-virtual {v6}, Lcom/facebook/orca/server/FetchThreadParams;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "update-last-read"

    :goto_0
    invoke-virtual {v1, v0}, Lcom/facebook/http/protocol/z;->b(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v0

    invoke-interface {v7, v0}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    .line 297
    const-string v0, "fetchThread"

    invoke-interface {v7, v0}, Lcom/facebook/http/protocol/j;->b(Ljava/lang/String;)V

    .line 300
    const-string v0, "fetch-thread"

    invoke-interface {v7, v0}, Lcom/facebook/http/protocol/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 301
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0

    .line 290
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected e(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 16

    .prologue
    .line 475
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v1

    .line 476
    const-string v2, "createThreadParams"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lcom/facebook/orca/server/SendMessageByRecipientsParams;

    .line 477
    invoke-virtual {v9}, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->a()Lcom/facebook/messages/model/threads/Message;

    move-result-object v14

    .line 480
    const-wide v12, 0x7fffffffffffffffL

    .line 481
    sget-object v2, Lcom/facebook/messages/model/threads/d;->a:Lcom/facebook/messages/model/threads/d;

    .line 485
    :try_start_0
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/orca/protocol/a;->J:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    .line 486
    move-object/from16 v0, p0

    invoke-direct {v0, v14}, Lcom/facebook/orca/protocol/a;->c(Lcom/facebook/messages/model/threads/Message;)Ljava/util/List;

    .line 489
    :cond_0
    invoke-static {v14}, Lcom/facebook/messages/model/threads/d;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/d;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v11

    .line 490
    :try_start_1
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/orca/protocol/a;->C:Lcom/facebook/analytics/cn;

    invoke-virtual {v14}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v2

    iget-wide v3, v11, Lcom/facebook/messages/model/threads/d;->b:J

    iget v5, v11, Lcom/facebook/messages/model/threads/d;->c:I

    iget v6, v11, Lcom/facebook/messages/model/threads/d;->d:I

    iget v7, v11, Lcom/facebook/messages/model/threads/d;->e:I

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/facebook/orca/protocol/a;->J:Ljavax/inject/a;

    invoke-interface {v8}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    invoke-virtual/range {v1 .. v8}, Lcom/facebook/analytics/cn;->b(Ljava/lang/String;JIIIZ)V

    .line 498
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/orca/protocol/a;->d:Lcom/facebook/http/protocol/i;

    invoke-interface {v1}, Lcom/facebook/http/protocol/i;->a()Lcom/facebook/http/protocol/j;

    move-result-object v4

    .line 500
    const/4 v3, 0x0

    .line 501
    const/4 v2, 0x0

    .line 502
    const/4 v1, 0x0

    .line 503
    invoke-virtual {v14}, Lcom/facebook/messages/model/threads/Message;->E()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 504
    invoke-virtual {v14}, Lcom/facebook/messages/model/threads/Message;->E()Ljava/lang/String;

    move-result-object v3

    move v15, v1

    move-object v1, v2

    move v2, v15

    .line 515
    :goto_0
    new-instance v5, Lcom/facebook/orca/protocol/methods/f;

    if-nez v1, :cond_4

    const/4 v1, 0x0

    :goto_1
    invoke-direct {v5, v9, v3, v1}, Lcom/facebook/orca/protocol/methods/f;-><init>(Lcom/facebook/orca/server/SendMessageByRecipientsParams;Ljava/lang/String;Ljava/lang/String;)V

    .line 519
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/orca/protocol/a;->o:Lcom/facebook/orca/protocol/methods/e;

    invoke-static {v1, v5}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v1

    const-string v3, "create-thread"

    invoke-virtual {v1, v3}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v3

    .line 524
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/orca/protocol/a;->J:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_1

    if-lez v2, :cond_1

    .line 525
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "media-"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/facebook/http/protocol/z;->b(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    .line 527
    :cond_1
    invoke-virtual {v3}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v1

    invoke-interface {v4, v1}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    .line 530
    new-instance v1, Lcom/facebook/orca/server/ac;

    invoke-direct {v1}, Lcom/facebook/orca/server/ac;-><init>()V

    sget-object v2, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/ac;

    move-result-object v1

    const-string v2, "{result=create-thread:$.tid}"

    invoke-static {v2}, Lcom/facebook/orca/server/ThreadCriteria;->a(Ljava/lang/String;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/server/ac;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lcom/facebook/orca/server/ac;->a(I)Lcom/facebook/orca/server/ac;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/orca/server/ac;->h()Lcom/facebook/orca/server/FetchThreadParams;

    move-result-object v1

    .line 535
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/facebook/orca/protocol/a;->h:Lcom/facebook/orca/protocol/methods/o;

    invoke-static {v2, v1}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v1

    const-string v2, "fetch-thread"

    invoke-virtual {v1, v2}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v1

    const-string v2, "create-thread"

    invoke-virtual {v1, v2}, Lcom/facebook/http/protocol/z;->b(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v1

    invoke-interface {v4, v1}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    .line 542
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/orca/protocol/a;->F:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v12

    .line 543
    const-string v1, "createThread"

    invoke-interface {v4, v1}, Lcom/facebook/http/protocol/j;->b(Ljava/lang/String;)V

    .line 544
    const-string v1, "fetch-thread"

    invoke-interface {v4, v1}, Lcom/facebook/http/protocol/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    move-object v10, v0

    .line 546
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/orca/protocol/a;->C:Lcom/facebook/analytics/cn;

    invoke-virtual {v10}, Lcom/facebook/orca/server/FetchThreadResult;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v4

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/facebook/orca/protocol/a;->F:Lcom/facebook/common/time/a;

    invoke-interface {v6}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v6

    sub-long/2addr v6, v12

    iget-wide v8, v11, Lcom/facebook/messages/model/threads/d;->b:J

    invoke-virtual/range {v1 .. v9}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;JJJ)V

    .line 554
    invoke-static {v10}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v1

    return-object v1

    .line 505
    :cond_2
    invoke-virtual {v14}, Lcom/facebook/messages/model/threads/Message;->C()Z

    move-result v5

    if-eqz v5, :cond_5

    .line 506
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v1, 0x14

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 507
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/orca/protocol/a;->J:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 508
    move-object/from16 v0, p0

    invoke-direct {v0, v14, v2}, Lcom/facebook/orca/protocol/a;->a(Lcom/facebook/messages/model/threads/Message;Ljava/lang/StringBuilder;)I

    move-result v1

    move v15, v1

    move-object v1, v2

    move v2, v15

    goto/16 :goto_0

    .line 510
    :cond_3
    move-object/from16 v0, p0

    invoke-direct {v0, v14, v4, v2}, Lcom/facebook/orca/protocol/a;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/http/protocol/j;Ljava/lang/StringBuilder;)I

    move-result v1

    move v15, v1

    move-object v1, v2

    move v2, v15

    goto/16 :goto_0

    .line 515
    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    goto/16 :goto_1

    .line 555
    :catch_0
    move-exception v9

    move-object v7, v2

    move-wide v5, v12

    .line 556
    :goto_2
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/orca/protocol/a;->C:Lcom/facebook/analytics/cn;

    invoke-virtual {v14}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v3

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/facebook/orca/protocol/a;->F:Lcom/facebook/common/time/a;

    invoke-interface {v8}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v10

    sub-long v5, v10, v5

    iget-wide v7, v7, Lcom/facebook/messages/model/threads/d;->b:J

    invoke-virtual/range {v1 .. v9}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;JJJLjava/lang/Throwable;)V

    .line 562
    new-instance v1, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v1}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v1, v14}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    sget-object v2, Lcom/facebook/messages/model/threads/SendError;->b:Lcom/facebook/messages/model/threads/SendError;

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/SendError;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    const/16 v2, 0x385

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/threads/e;->a(I)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    .line 568
    new-instance v2, Lcom/facebook/orca/o/a;

    invoke-direct {v2, v9, v1}, Lcom/facebook/orca/o/a;-><init>(Ljava/lang/Throwable;Lcom/facebook/messages/model/threads/Message;)V

    throw v2

    .line 555
    :catch_1
    move-exception v9

    move-object v7, v11

    move-wide v5, v12

    goto :goto_2

    :cond_5
    move v15, v1

    move-object v1, v2

    move v2, v15

    goto/16 :goto_0
.end method

.method protected f(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 11

    .prologue
    const/4 v2, 0x0

    .line 387
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 388
    const-string v1, "broadcastMessageParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/SendMessageByRecipientsParams;

    .line 390
    invoke-virtual {v0}, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->a()Lcom/facebook/messages/model/threads/Message;

    move-result-object v8

    .line 392
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->J:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    .line 393
    invoke-direct {p0, v8}, Lcom/facebook/orca/protocol/a;->c(Lcom/facebook/messages/model/threads/Message;)Ljava/util/List;

    .line 397
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->d:Lcom/facebook/http/protocol/i;

    invoke-interface {v1}, Lcom/facebook/http/protocol/i;->a()Lcom/facebook/http/protocol/j;

    move-result-object v5

    .line 401
    const/4 v1, 0x0

    .line 402
    invoke-virtual {v8}, Lcom/facebook/messages/model/threads/Message;->E()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 403
    new-instance v0, Ljava/security/InvalidParameterException;

    const-string v1, "Only images are supported by blast"

    invoke-direct {v0, v1}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 460
    :catch_0
    move-exception v0

    .line 461
    new-instance v1, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v1}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v1, v8}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    sget-object v2, Lcom/facebook/messages/model/threads/SendError;->c:Lcom/facebook/messages/model/threads/SendError;

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/SendError;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    const/16 v2, 0x385

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/threads/e;->a(I)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    .line 467
    new-instance v2, Lcom/facebook/orca/o/a;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/o/a;-><init>(Ljava/lang/Throwable;Lcom/facebook/messages/model/threads/Message;)V

    throw v2

    .line 404
    :cond_1
    :try_start_1
    invoke-virtual {v8}, Lcom/facebook/messages/model/threads/Message;->C()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 405
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 406
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->J:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 407
    invoke-direct {p0, v8, v3}, Lcom/facebook/orca/protocol/a;->a(Lcom/facebook/messages/model/threads/Message;Ljava/lang/StringBuilder;)I

    move-result v1

    move v10, v1

    move-object v1, v3

    move v3, v10

    .line 413
    :goto_0
    new-instance v4, Lcom/facebook/orca/protocol/methods/aj;

    if-nez v1, :cond_4

    move-object v1, v2

    :goto_1
    invoke-direct {v4, v0, v1}, Lcom/facebook/orca/protocol/methods/aj;-><init>(Lcom/facebook/orca/server/SendMessageByRecipientsParams;Ljava/lang/String;)V

    .line 418
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->p:Lcom/facebook/orca/protocol/methods/SendBroadcastMethod;

    invoke-static {v1, v4}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v2

    .line 420
    const-string v1, "broadcast-thread"

    invoke-virtual {v2, v1}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    .line 422
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->J:Ljavax/inject/a;

    invoke-interface {v1}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_2

    if-lez v3, :cond_2

    .line 423
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "media-"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/facebook/http/protocol/z;->b(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    .line 425
    :cond_2
    invoke-virtual {v2}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v1

    invoke-interface {v5, v1}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    .line 427
    invoke-virtual {v0}, Lcom/facebook/orca/server/SendMessageByRecipientsParams;->d()Lcom/google/common/a/es;

    move-result-object v7

    .line 428
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 430
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/RecipientInfo;

    .line 431
    invoke-virtual {v0}, Lcom/facebook/user/RecipientInfo;->a()Lcom/facebook/user/UserIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserIdentifier;->d()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 409
    :cond_3
    invoke-direct {p0, v8, v5, v3}, Lcom/facebook/orca/protocol/a;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/http/protocol/j;Ljava/lang/StringBuilder;)I

    move-result v1

    move v10, v1

    move-object v1, v3

    move v3, v10

    goto :goto_0

    .line 413
    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    .line 434
    :cond_5
    new-instance v0, Lcom/facebook/orca/server/ac;

    invoke-direct {v0}, Lcom/facebook/orca/server/ac;-><init>()V

    sget-object v2, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/ac;

    move-result-object v0

    invoke-static {v1}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/orca/server/ThreadCriteria;->a(Lcom/google/common/a/es;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/server/ac;

    move-result-object v0

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3

    invoke-virtual {v0, v1}, Lcom/facebook/orca/server/ac;->a(I)Lcom/facebook/orca/server/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/ac;->h()Lcom/facebook/orca/server/FetchThreadParams;

    move-result-object v0

    .line 439
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->i:Lcom/facebook/orca/protocol/methods/s;

    invoke-static {v1, v0}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    const-string v1, "fetch-all"

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    const-string v1, "broadcast-thread"

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/z;->b(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v0

    invoke-interface {v5, v0}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    .line 446
    const-string v0, "createThread"

    invoke-interface {v5, v0}, Lcom/facebook/http/protocol/j;->b(Ljava/lang/String;)V

    .line 448
    const-string v0, "broadcast-thread"

    invoke-interface {v5, v0}, Lcom/facebook/http/protocol/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/common/a/ev;

    .line 450
    const-string v0, "fetch-all"

    invoke-interface {v5, v0}, Lcom/facebook/http/protocol/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/common/a/es;

    .line 452
    new-instance v0, Lcom/facebook/orca/server/SendBroadcastResult;

    sget-object v1, Lcom/facebook/fbservice/c/b;->FROM_SERVER:Lcom/facebook/fbservice/c/b;

    iget-object v2, p0, Lcom/facebook/orca/protocol/a;->F:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    invoke-virtual {v8}, Lcom/facebook/messages/model/threads/Message;->J()Lcom/google/common/a/ev;

    move-result-object v6

    const-string v9, "broadcast_id"

    invoke-virtual {v6, v9}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/server/SendBroadcastResult;-><init>(Lcom/facebook/fbservice/c/b;JLcom/google/common/a/ev;Lcom/google/common/a/es;Ljava/lang/String;I)V

    .line 459
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    return-object v0

    :cond_6
    move v3, v1

    move-object v1, v2

    goto/16 :goto_0
.end method

.method protected h(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 351
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 352
    const-string v1, "addMembersParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/AddMembersParams;

    .line 355
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->d:Lcom/facebook/http/protocol/i;

    invoke-interface {v1}, Lcom/facebook/http/protocol/i;->a()Lcom/facebook/http/protocol/j;

    move-result-object v1

    .line 356
    iget-object v2, p0, Lcom/facebook/orca/protocol/a;->n:Lcom/facebook/orca/protocol/methods/a;

    invoke-static {v2, v0}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v2

    const-string v3, "add-members"

    invoke-virtual {v2, v3}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    .line 362
    new-instance v2, Lcom/facebook/orca/server/ac;

    invoke-direct {v2}, Lcom/facebook/orca/server/ac;-><init>()V

    sget-object v3, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    invoke-virtual {v2, v3}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/ac;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/orca/server/AddMembersParams;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/server/ThreadCriteria;->a(Ljava/lang/String;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/server/ac;

    move-result-object v0

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/server/ac;->a(I)Lcom/facebook/orca/server/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/ac;->h()Lcom/facebook/orca/server/FetchThreadParams;

    move-result-object v0

    .line 367
    iget-object v2, p0, Lcom/facebook/orca/protocol/a;->h:Lcom/facebook/orca/protocol/methods/o;

    invoke-static {v2, v0}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    const-string v2, "fetch"

    invoke-virtual {v0, v2}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    const-string v2, "add-members"

    invoke-virtual {v0, v2}, Lcom/facebook/http/protocol/z;->b(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    .line 374
    const-string v0, "addMembers"

    invoke-interface {v1, v0}, Lcom/facebook/http/protocol/j;->b(Ljava/lang/String;)V

    .line 377
    const/4 v0, 0x1

    invoke-interface {v1, v0}, Lcom/facebook/http/protocol/j;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 378
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected i(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 966
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 967
    const-string v1, "removeMemberParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/RemoveMemberParams;

    .line 970
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->d:Lcom/facebook/http/protocol/i;

    invoke-interface {v1}, Lcom/facebook/http/protocol/i;->a()Lcom/facebook/http/protocol/j;

    move-result-object v1

    .line 971
    iget-object v2, p0, Lcom/facebook/orca/protocol/a;->r:Lcom/facebook/orca/protocol/methods/af;

    invoke-static {v2, v0}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v2

    const-string v3, "remove-members"

    invoke-virtual {v2, v3}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    .line 976
    new-instance v2, Lcom/facebook/orca/server/ac;

    invoke-direct {v2}, Lcom/facebook/orca/server/ac;-><init>()V

    sget-object v3, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    invoke-virtual {v2, v3}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/ac;

    move-result-object v2

    invoke-virtual {v0}, Lcom/facebook/orca/server/RemoveMemberParams;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/server/ThreadCriteria;->a(Ljava/lang/String;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/server/ac;

    move-result-object v0

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/server/ac;->a(I)Lcom/facebook/orca/server/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/ac;->h()Lcom/facebook/orca/server/FetchThreadParams;

    move-result-object v0

    .line 981
    iget-object v2, p0, Lcom/facebook/orca/protocol/a;->h:Lcom/facebook/orca/protocol/methods/o;

    invoke-static {v2, v0}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    const-string v2, "fetch"

    invoke-virtual {v0, v2}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    const-string v2, "remove-members"

    invoke-virtual {v0, v2}, Lcom/facebook/http/protocol/z;->b(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    .line 988
    const-string v0, "removeMember"

    invoke-interface {v1, v0}, Lcom/facebook/http/protocol/j;->b(Ljava/lang/String;)V

    .line 991
    const/4 v0, 0x1

    invoke-interface {v1, v0}, Lcom/facebook/http/protocol/j;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 992
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected j(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 999
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 1000
    const-string v1, "markThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/MarkThreadParams;

    .line 1001
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->d:Lcom/facebook/http/protocol/i;

    iget-object v2, p0, Lcom/facebook/orca/protocol/a;->s:Lcom/facebook/orca/protocol/methods/w;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/i;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1002
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected m(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 1009
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 1010
    const-string v1, "deleteThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/DeleteThreadParams;

    .line 1011
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->d:Lcom/facebook/http/protocol/i;

    iget-object v2, p0, Lcom/facebook/orca/protocol/a;->t:Lcom/facebook/orca/protocol/methods/h;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/i;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1012
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected n(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 1019
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 1020
    const-string v1, "deleteMessagesParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/DeleteMessagesParams;

    .line 1021
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->d:Lcom/facebook/http/protocol/i;

    iget-object v2, p0, Lcom/facebook/orca/protocol/a;->u:Lcom/facebook/orca/protocol/methods/g;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/i;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1022
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected o(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5

    .prologue
    .line 1029
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 1030
    const-string v1, "modifyThreadParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/ModifyThreadParams;

    .line 1032
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->d:Lcom/facebook/http/protocol/i;

    invoke-interface {v1}, Lcom/facebook/http/protocol/i;->a()Lcom/facebook/http/protocol/j;

    move-result-object v2

    .line 1035
    const/4 v1, 0x0

    .line 1036
    invoke-virtual {v0}, Lcom/facebook/orca/server/ModifyThreadParams;->b()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1037
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->v:Lcom/facebook/orca/protocol/methods/ay;

    invoke-static {v1, v0}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v1

    const-string v3, "setThreadName"

    invoke-virtual {v1, v3}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    .line 1041
    const-string v1, "setThreadName"

    .line 1045
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/orca/server/ModifyThreadParams;->d()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 1046
    iget-object v3, p0, Lcom/facebook/orca/protocol/a;->w:Lcom/facebook/orca/protocol/methods/aw;

    invoke-static {v3, v0}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v3

    const-string v4, "setThreadImage"

    invoke-virtual {v3, v4}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/facebook/http/protocol/z;->b(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    .line 1051
    const-string v1, "setThreadImage"

    .line 1054
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/orca/server/ModifyThreadParams;->f()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1055
    iget-object v3, p0, Lcom/facebook/orca/protocol/a;->y:Lcom/facebook/orca/protocol/methods/ax;

    invoke-static {v3, v0}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v3

    const-string v4, "muteThread"

    invoke-virtual {v3, v4}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/facebook/http/protocol/z;->b(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    .line 1060
    const-string v1, "muteThread"

    .line 1064
    :cond_2
    new-instance v3, Lcom/facebook/orca/server/ac;

    invoke-direct {v3}, Lcom/facebook/orca/server/ac;-><init>()V

    sget-object v4, Lcom/facebook/fbservice/service/s;->CHECK_SERVER_FOR_NEW_DATA:Lcom/facebook/fbservice/service/s;

    invoke-virtual {v3, v4}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/fbservice/service/s;)Lcom/facebook/orca/server/ac;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/orca/server/ModifyThreadParams;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/server/ThreadCriteria;->a(Ljava/lang/String;)Lcom/facebook/orca/server/ThreadCriteria;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/facebook/orca/server/ac;->a(Lcom/facebook/orca/server/ThreadCriteria;)Lcom/facebook/orca/server/ac;

    move-result-object v0

    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Lcom/facebook/orca/server/ac;->a(I)Lcom/facebook/orca/server/ac;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/server/ac;->h()Lcom/facebook/orca/server/FetchThreadParams;

    move-result-object v0

    .line 1069
    iget-object v3, p0, Lcom/facebook/orca/protocol/a;->h:Lcom/facebook/orca/protocol/methods/o;

    invoke-static {v3, v0}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    const-string v3, "fetch"

    invoke-virtual {v0, v3}, Lcom/facebook/http/protocol/z;->a(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/facebook/http/protocol/z;->b(Ljava/lang/String;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    .line 1076
    const-string v0, "modifyThread"

    invoke-interface {v2, v0}, Lcom/facebook/http/protocol/j;->b(Ljava/lang/String;)V

    .line 1079
    const/4 v0, 0x1

    invoke-interface {v2, v0}, Lcom/facebook/http/protocol/j;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 1080
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected q(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 1087
    iget-object v0, p0, Lcom/facebook/orca/protocol/a;->d:Lcom/facebook/http/protocol/i;

    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->x:Lcom/facebook/orca/protocol/methods/v;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/http/protocol/i;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1088
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected s(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 337
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 338
    const-string v1, "fetchGroupThreadsParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchGroupThreadsParams;

    .line 340
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->d:Lcom/facebook/http/protocol/i;

    iget-object v2, p0, Lcom/facebook/orca/protocol/a;->j:Lcom/facebook/orca/protocol/methods/i;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/i;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchGroupThreadsResult;

    .line 344
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected t(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 955
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 956
    const-string v1, "fetchMoreMessagesParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMoreMessagesParams;

    .line 957
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->d:Lcom/facebook/http/protocol/i;

    iget-object v2, p0, Lcom/facebook/orca/protocol/a;->m:Lcom/facebook/orca/protocol/methods/k;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/i;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMoreMessagesResult;

    .line 959
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected u(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 5

    .prologue
    .line 308
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 309
    const-string v1, "fetchMultipleThreadsParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchMultipleThreadsParams;

    .line 312
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->d:Lcom/facebook/http/protocol/i;

    invoke-interface {v1}, Lcom/facebook/http/protocol/i;->a()Lcom/facebook/http/protocol/j;

    move-result-object v2

    .line 313
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchMultipleThreadsParams;->b()Lcom/google/common/a/es;

    move-result-object v3

    .line 315
    invoke-virtual {v3}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadParams;

    .line 316
    iget-object v4, p0, Lcom/facebook/orca/protocol/a;->h:Lcom/facebook/orca/protocol/methods/o;

    invoke-static {v4, v0}, Lcom/facebook/http/protocol/y;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Lcom/facebook/http/protocol/z;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/http/protocol/z;->a()Lcom/facebook/http/protocol/y;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/facebook/http/protocol/j;->a(Lcom/facebook/http/protocol/y;)V

    goto :goto_0

    .line 320
    :cond_0
    const-string v0, "fetchMultipleThreads"

    invoke-interface {v2, v0}, Lcom/facebook/http/protocol/j;->b(Ljava/lang/String;)V

    .line 322
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v4

    .line 324
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    invoke-virtual {v3}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 325
    invoke-interface {v2, v1}, Lcom/facebook/http/protocol/j;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchThreadResult;

    .line 326
    invoke-virtual {v4, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 324
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 329
    :cond_1
    new-instance v0, Lcom/facebook/orca/server/FetchMultipleThreadsResult;

    invoke-virtual {v4}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/orca/server/FetchMultipleThreadsResult;-><init>(Lcom/google/common/a/es;)V

    .line 331
    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected v(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 1094
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 1095
    const-string v1, "setSettingsParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/SetSettingsParams;

    .line 1096
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->d:Lcom/facebook/http/protocol/i;

    iget-object v2, p0, Lcom/facebook/orca/protocol/a;->A:Lcom/facebook/orca/protocol/methods/az;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/i;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1097
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected w(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 1105
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 1106
    const-string v1, "traceInfo"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1107
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->d:Lcom/facebook/http/protocol/i;

    iget-object v2, p0, Lcom/facebook/orca/protocol/a;->B:Lcom/facebook/orca/protocol/methods/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/i;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1108
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method

.method protected x(Lcom/facebook/fbservice/service/ad;Lcom/facebook/fbservice/service/e;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 3

    .prologue
    .line 944
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v0

    .line 945
    const-string v1, "sendWebrtcMessageParams"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;

    .line 947
    iget-object v1, p0, Lcom/facebook/orca/protocol/a;->d:Lcom/facebook/http/protocol/i;

    iget-object v2, p0, Lcom/facebook/orca/protocol/a;->l:Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod;

    invoke-interface {v1, v2, v0}, Lcom/facebook/http/protocol/i;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    .line 948
    invoke-static {}, Lcom/facebook/fbservice/service/OperationResult;->b()Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method
