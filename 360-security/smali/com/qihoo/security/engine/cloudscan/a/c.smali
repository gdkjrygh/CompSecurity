.class public final Lcom/qihoo/security/engine/cloudscan/a/c;
.super Lnet/jarlehansen/protobuf/javame/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/engine/cloudscan/a/c$a;
    }
.end annotation


# static fields
.field private static a:Lnet/jarlehansen/protobuf/javame/a/a/b;


# instance fields
.field private final b:I

.field private final c:Lnet/jarlehansen/protobuf/javame/b;

.field private final d:Z

.field private final e:J

.field private final f:Z

.field private final g:Ljava/lang/String;

.field private final h:Z

.field private final i:I

.field private final j:Z

.field private final k:Lnet/jarlehansen/protobuf/javame/b;

.field private final l:Z

.field private final m:Ljava/lang/String;

.field private final n:Z

.field private final o:I

.field private final p:Z

.field private final q:Ljava/lang/String;

.field private final r:Z

.field private final s:Ljava/lang/String;

.field private final t:Z

.field private final u:Ljava/lang/String;

.field private final v:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lnet/jarlehansen/protobuf/javame/a/a/a;->a()Lnet/jarlehansen/protobuf/javame/a/a/a;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/engine/cloudscan/a/c;->a:Lnet/jarlehansen/protobuf/javame/a/a/b;

    return-void
.end method

.method private constructor <init>(Lcom/qihoo/security/engine/cloudscan/a/c$a;)V
    .locals 3

    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/a;-><init>()V

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->a(Lcom/qihoo/security/engine/cloudscan/a/c$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->b(Lcom/qihoo/security/engine/cloudscan/a/c$a;)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->b:I

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->c(Lcom/qihoo/security/engine/cloudscan/a/c$a;)Lnet/jarlehansen/protobuf/javame/b;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->c:Lnet/jarlehansen/protobuf/javame/b;

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->d(Lcom/qihoo/security/engine/cloudscan/a/c$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->d:Z

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->e(Lcom/qihoo/security/engine/cloudscan/a/c$a;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->e:J

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->f(Lcom/qihoo/security/engine/cloudscan/a/c$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->f:Z

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->g(Lcom/qihoo/security/engine/cloudscan/a/c$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->g:Ljava/lang/String;

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->h(Lcom/qihoo/security/engine/cloudscan/a/c$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->h:Z

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->i(Lcom/qihoo/security/engine/cloudscan/a/c$a;)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->i:I

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->j(Lcom/qihoo/security/engine/cloudscan/a/c$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->j:Z

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->k(Lcom/qihoo/security/engine/cloudscan/a/c$a;)Lnet/jarlehansen/protobuf/javame/b;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->k:Lnet/jarlehansen/protobuf/javame/b;

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->l(Lcom/qihoo/security/engine/cloudscan/a/c$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->l:Z

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->m(Lcom/qihoo/security/engine/cloudscan/a/c$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->m:Ljava/lang/String;

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->n(Lcom/qihoo/security/engine/cloudscan/a/c$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->n:Z

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->o(Lcom/qihoo/security/engine/cloudscan/a/c$a;)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->o:I

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->p(Lcom/qihoo/security/engine/cloudscan/a/c$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->p:Z

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->q(Lcom/qihoo/security/engine/cloudscan/a/c$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->q:Ljava/lang/String;

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->r(Lcom/qihoo/security/engine/cloudscan/a/c$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->r:Z

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->s(Lcom/qihoo/security/engine/cloudscan/a/c$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->s:Ljava/lang/String;

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->t(Lcom/qihoo/security/engine/cloudscan/a/c$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->t:Z

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->u(Lcom/qihoo/security/engine/cloudscan/a/c$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->u:Ljava/lang/String;

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->v(Lcom/qihoo/security/engine/cloudscan/a/c$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->v:Z

    return-void

    :cond_0
    new-instance v0, Lnet/jarlehansen/protobuf/javame/UninitializedMessageException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "Not all required fields were included (false = not included in message),  id:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->a(Lcom/qihoo/security/engine/cloudscan/a/c$a;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lnet/jarlehansen/protobuf/javame/UninitializedMessageException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/engine/cloudscan/a/c$a;Lcom/qihoo/security/engine/cloudscan/a/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/qihoo/security/engine/cloudscan/a/c;-><init>(Lcom/qihoo/security/engine/cloudscan/a/c$a;)V

    return-void
.end method

.method public static a()Lcom/qihoo/security/engine/cloudscan/a/c$a;
    .locals 2

    new-instance v0, Lcom/qihoo/security/engine/cloudscan/a/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;-><init>(Lcom/qihoo/security/engine/cloudscan/a/c$a;)V

    return-object v0
.end method

.method static a(Lnet/jarlehansen/protobuf/javame/a/a;Lcom/qihoo/security/engine/cloudscan/a/c$a;I)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    packed-switch p2, :pswitch_data_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_0
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/a/a;->a(I)I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->a(I)Lcom/qihoo/security/engine/cloudscan/a/c$a;

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/a/a;->e(I)Lnet/jarlehansen/protobuf/javame/b;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->a(Lnet/jarlehansen/protobuf/javame/b;)Lcom/qihoo/security/engine/cloudscan/a/c$a;

    goto :goto_0

    :pswitch_2
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/a/a;->d(I)J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->a(J)Lcom/qihoo/security/engine/cloudscan/a/c$a;

    goto :goto_0

    :pswitch_3
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/a/a;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->a(Ljava/lang/String;)Lcom/qihoo/security/engine/cloudscan/a/c$a;

    goto :goto_0

    :pswitch_4
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/a/a;->a(I)I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->b(I)Lcom/qihoo/security/engine/cloudscan/a/c$a;

    goto :goto_0

    :pswitch_5
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/a/a;->e(I)Lnet/jarlehansen/protobuf/javame/b;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->b(Lnet/jarlehansen/protobuf/javame/b;)Lcom/qihoo/security/engine/cloudscan/a/c$a;

    goto :goto_0

    :pswitch_6
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/a/a;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->b(Ljava/lang/String;)Lcom/qihoo/security/engine/cloudscan/a/c$a;

    goto :goto_0

    :pswitch_7
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/a/a;->a(I)I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->c(I)Lcom/qihoo/security/engine/cloudscan/a/c$a;

    goto :goto_0

    :pswitch_8
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/a/a;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->c(Ljava/lang/String;)Lcom/qihoo/security/engine/cloudscan/a/c$a;

    goto :goto_0

    :pswitch_9
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/a/a;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->d(Ljava/lang/String;)Lcom/qihoo/security/engine/cloudscan/a/c$a;

    goto :goto_0

    :pswitch_a
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/a/a;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/qihoo/security/engine/cloudscan/a/c$a;->e(Ljava/lang/String;)Lcom/qihoo/security/engine/cloudscan/a/c$a;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
    .end packed-switch
.end method

.method private c()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a(Lnet/jarlehansen/protobuf/javame/b/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->b:I

    invoke-virtual {p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(II)V

    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->d:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->c:Lnet/jarlehansen/protobuf/javame/b;

    invoke-virtual {p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(ILnet/jarlehansen/protobuf/javame/b;)V

    :cond_0
    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->f:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x3

    iget-wide v2, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->e:J

    invoke-virtual {p1, v0, v2, v3}, Lnet/jarlehansen/protobuf/javame/b/a;->a(IJ)V

    :cond_1
    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->h:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->g:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(ILjava/lang/String;)V

    :cond_2
    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->j:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x5

    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->i:I

    invoke-virtual {p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(II)V

    :cond_3
    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->l:Z

    if-eqz v0, :cond_4

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->k:Lnet/jarlehansen/protobuf/javame/b;

    invoke-virtual {p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(ILnet/jarlehansen/protobuf/javame/b;)V

    :cond_4
    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->n:Z

    if-eqz v0, :cond_5

    const/4 v0, 0x7

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->m:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(ILjava/lang/String;)V

    :cond_5
    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->p:Z

    if-eqz v0, :cond_6

    const/16 v0, 0x8

    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->o:I

    invoke-virtual {p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(II)V

    :cond_6
    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->r:Z

    if-eqz v0, :cond_7

    const/16 v0, 0x9

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->q:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(ILjava/lang/String;)V

    :cond_7
    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->t:Z

    if-eqz v0, :cond_8

    const/16 v0, 0xa

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->s:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(ILjava/lang/String;)V

    :cond_8
    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->v:Z

    if-eqz v0, :cond_9

    const/16 v0, 0xb

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->u:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(ILjava/lang/String;)V

    :cond_9
    return-void
.end method

.method public b()I
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget v2, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->b:I

    invoke-static {v1, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(II)I

    move-result v1

    add-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->d:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->c:Lnet/jarlehansen/protobuf/javame/b;

    invoke-static {v1, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(ILnet/jarlehansen/protobuf/javame/b;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->f:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x3

    iget-wide v2, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->e:J

    invoke-static {v1, v2, v3}, Lnet/jarlehansen/protobuf/javame/c;->a(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->h:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->g:Ljava/lang/String;

    invoke-static {v1, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->j:Z

    if-eqz v1, :cond_3

    const/4 v1, 0x5

    iget v2, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->i:I

    invoke-static {v1, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->l:Z

    if-eqz v1, :cond_4

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->k:Lnet/jarlehansen/protobuf/javame/b;

    invoke-static {v1, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(ILnet/jarlehansen/protobuf/javame/b;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->n:Z

    if-eqz v1, :cond_5

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->m:Ljava/lang/String;

    invoke-static {v1, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->p:Z

    if-eqz v1, :cond_6

    const/16 v1, 0x8

    iget v2, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->o:I

    invoke-static {v1, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_6
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->r:Z

    if-eqz v1, :cond_7

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->q:Ljava/lang/String;

    invoke-static {v1, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_7
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->t:Z

    if-eqz v1, :cond_8

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->s:Ljava/lang/String;

    invoke-static {v1, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_8
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->v:Z

    if-eqz v1, :cond_9

    const/16 v1, 0xb

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->u:Ljava/lang/String;

    invoke-static {v1, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_9
    invoke-direct {p0}, Lcom/qihoo/security/engine/cloudscan/a/c;->c()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string/jumbo v0, ""

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "id = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->d:Z

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "sha1 = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->c:Lnet/jarlehansen/protobuf/javame/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->f:Z

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "file_size = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->e:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->h:Z

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "file_path = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_2
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->j:Z

    if-eqz v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "bole_ver = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_3
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->l:Z

    if-eqz v1, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "bole_buf = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->k:Lnet/jarlehansen/protobuf/javame/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_4
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->n:Z

    if-eqz v1, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "bole_ext = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_5
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->p:Z

    if-eqz v1, :cond_6

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "mpattern_ver = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_6
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->r:Z

    if-eqz v1, :cond_7

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "mpattern = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_7
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->t:Z

    if-eqz v1, :cond_8

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "mpattern_ext = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_8
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->v:Z

    if-eqz v1, :cond_9

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "ext = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/c;->u:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_9
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
