.class public final Lcom/qihoo/security/engine/cloudscan/a/h;
.super Lnet/jarlehansen/protobuf/javame/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/engine/cloudscan/a/h$a;
    }
.end annotation


# static fields
.field private static a:Lnet/jarlehansen/protobuf/javame/a/a/b;


# instance fields
.field private final b:I

.field private final c:Z

.field private final d:J

.field private final e:Z

.field private final f:Lcom/qihoo/security/engine/cloudscan/a/g;

.field private final g:Z

.field private final h:Lnet/jarlehansen/protobuf/javame/b;

.field private final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lnet/jarlehansen/protobuf/javame/a/a/a;->a()Lnet/jarlehansen/protobuf/javame/a/a/a;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/engine/cloudscan/a/h;->a:Lnet/jarlehansen/protobuf/javame/a/a/b;

    return-void
.end method

.method private constructor <init>(Lcom/qihoo/security/engine/cloudscan/a/h$a;)V
    .locals 2

    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/a;-><init>()V

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/h$a;->a(Lcom/qihoo/security/engine/cloudscan/a/h$a;)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->b:I

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/h$a;->b(Lcom/qihoo/security/engine/cloudscan/a/h$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->c:Z

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/h$a;->c(Lcom/qihoo/security/engine/cloudscan/a/h$a;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->d:J

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/h$a;->d(Lcom/qihoo/security/engine/cloudscan/a/h$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->e:Z

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/h$a;->e(Lcom/qihoo/security/engine/cloudscan/a/h$a;)Lcom/qihoo/security/engine/cloudscan/a/g;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->f:Lcom/qihoo/security/engine/cloudscan/a/g;

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/h$a;->f(Lcom/qihoo/security/engine/cloudscan/a/h$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->g:Z

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/h$a;->g(Lcom/qihoo/security/engine/cloudscan/a/h$a;)Lnet/jarlehansen/protobuf/javame/b;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->h:Lnet/jarlehansen/protobuf/javame/b;

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/h$a;->h(Lcom/qihoo/security/engine/cloudscan/a/h$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->i:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/engine/cloudscan/a/h$a;Lcom/qihoo/security/engine/cloudscan/a/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/qihoo/security/engine/cloudscan/a/h;-><init>(Lcom/qihoo/security/engine/cloudscan/a/h$a;)V

    return-void
.end method

.method public static a()Lcom/qihoo/security/engine/cloudscan/a/h$a;
    .locals 2

    new-instance v0, Lcom/qihoo/security/engine/cloudscan/a/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qihoo/security/engine/cloudscan/a/h$a;-><init>(Lcom/qihoo/security/engine/cloudscan/a/h$a;)V

    return-object v0
.end method

.method static a(Lnet/jarlehansen/protobuf/javame/a/a;)Lcom/qihoo/security/engine/cloudscan/a/h;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p0}, Lcom/qihoo/security/engine/cloudscan/a/h;->b(Lnet/jarlehansen/protobuf/javame/a/a;)I

    move-result v0

    invoke-static {}, Lcom/qihoo/security/engine/cloudscan/a/h;->a()Lcom/qihoo/security/engine/cloudscan/a/h$a;

    move-result-object v1

    :goto_0
    if-gtz v0, :cond_0

    invoke-virtual {v1}, Lcom/qihoo/security/engine/cloudscan/a/h$a;->a()Lcom/qihoo/security/engine/cloudscan/a/h;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {p0, v1, v0}, Lcom/qihoo/security/engine/cloudscan/a/h;->a(Lnet/jarlehansen/protobuf/javame/a/a;Lcom/qihoo/security/engine/cloudscan/a/h$a;I)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lnet/jarlehansen/protobuf/javame/a/a;->b()V

    :cond_1
    invoke-static {p0}, Lcom/qihoo/security/engine/cloudscan/a/h;->b(Lnet/jarlehansen/protobuf/javame/a/a;)I

    move-result v0

    goto :goto_0
.end method

.method public static a([B)Lcom/qihoo/security/engine/cloudscan/a/h;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, Lnet/jarlehansen/protobuf/javame/a/a;

    sget-object v1, Lcom/qihoo/security/engine/cloudscan/a/h;->a:Lnet/jarlehansen/protobuf/javame/a/a/b;

    invoke-direct {v0, p0, v1}, Lnet/jarlehansen/protobuf/javame/a/a;-><init>([BLnet/jarlehansen/protobuf/javame/a/a/b;)V

    invoke-static {v0}, Lcom/qihoo/security/engine/cloudscan/a/h;->a(Lnet/jarlehansen/protobuf/javame/a/a;)Lcom/qihoo/security/engine/cloudscan/a/h;

    move-result-object v0

    return-object v0
.end method

.method static a(Lnet/jarlehansen/protobuf/javame/a/a;Lcom/qihoo/security/engine/cloudscan/a/h$a;I)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v2, 0x1

    const/4 v0, 0x0

    packed-switch p2, :pswitch_data_0

    :goto_0
    return v0

    :pswitch_0
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/a/a;->a(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/qihoo/security/engine/cloudscan/a/h$a;->a(I)Lcom/qihoo/security/engine/cloudscan/a/h$a;

    move v0, v2

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/a/a;->d(I)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/qihoo/security/engine/cloudscan/a/h$a;->a(J)Lcom/qihoo/security/engine/cloudscan/a/h$a;

    move v0, v2

    goto :goto_0

    :pswitch_2
    const/4 v1, 0x3

    invoke-virtual {p0, v1}, Lnet/jarlehansen/protobuf/javame/a/a;->f(I)Ljava/util/Vector;

    move-result-object v3

    move v1, v0

    :goto_1
    invoke-virtual {v3}, Ljava/util/Vector;->size()I

    move-result v0

    if-lt v1, v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-static {}, Lcom/qihoo/security/engine/cloudscan/a/g;->a()Lcom/qihoo/security/engine/cloudscan/a/g$a;

    move-result-object v4

    new-instance v5, Lnet/jarlehansen/protobuf/javame/a/a;

    sget-object v6, Lcom/qihoo/security/engine/cloudscan/a/h;->a:Lnet/jarlehansen/protobuf/javame/a/a/b;

    invoke-direct {v5, v0, v6}, Lnet/jarlehansen/protobuf/javame/a/a;-><init>([BLnet/jarlehansen/protobuf/javame/a/a/b;)V

    move v0, v2

    :goto_2
    if-nez v0, :cond_1

    invoke-virtual {v4}, Lcom/qihoo/security/engine/cloudscan/a/g$a;->a()Lcom/qihoo/security/engine/cloudscan/a/g;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/qihoo/security/engine/cloudscan/a/h$a;->a(Lcom/qihoo/security/engine/cloudscan/a/g;)Lcom/qihoo/security/engine/cloudscan/a/h$a;

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_1
    invoke-static {v5}, Lcom/qihoo/security/engine/cloudscan/a/h;->b(Lnet/jarlehansen/protobuf/javame/a/a;)I

    move-result v0

    invoke-static {v5, v4, v0}, Lcom/qihoo/security/engine/cloudscan/a/g;->a(Lnet/jarlehansen/protobuf/javame/a/a;Lcom/qihoo/security/engine/cloudscan/a/g$a;I)Z

    move-result v0

    goto :goto_2

    :pswitch_3
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/a/a;->e(I)Lnet/jarlehansen/protobuf/javame/b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/qihoo/security/engine/cloudscan/a/h$a;->a(Lnet/jarlehansen/protobuf/javame/b;)Lcom/qihoo/security/engine/cloudscan/a/h$a;

    move v0, v2

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static b(Lnet/jarlehansen/protobuf/javame/a/a;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lnet/jarlehansen/protobuf/javame/a/a;->a()I

    move-result v0

    return v0
.end method

.method private d()I
    .locals 3

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->g:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->f:Lcom/qihoo/security/engine/cloudscan/a/g;

    invoke-virtual {v2}, Lcom/qihoo/security/engine/cloudscan/a/g;->b()I

    move-result v2

    invoke-static {v1, v2}, Lnet/jarlehansen/protobuf/javame/c;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
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

    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->b:I

    invoke-virtual {p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(II)V

    :cond_0
    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->e:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    iget-wide v2, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->d:J

    invoke-virtual {p1, v0, v2, v3}, Lnet/jarlehansen/protobuf/javame/b/a;->a(IJ)V

    :cond_1
    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->g:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->f:Lcom/qihoo/security/engine/cloudscan/a/g;

    invoke-virtual {v1}, Lcom/qihoo/security/engine/cloudscan/a/g;->b()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->b(II)V

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->f:Lcom/qihoo/security/engine/cloudscan/a/g;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/engine/cloudscan/a/g;->a(Lnet/jarlehansen/protobuf/javame/b/a;)V

    :cond_2
    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->i:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->h:Lnet/jarlehansen/protobuf/javame/b;

    invoke-virtual {p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(ILnet/jarlehansen/protobuf/javame/b;)V

    :cond_3
    return-void
.end method

.method public b()I
    .locals 4

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->c:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iget v2, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->b:I

    invoke-static {v1, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->e:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    iget-wide v2, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->d:J

    invoke-static {v1, v2, v3}, Lnet/jarlehansen/protobuf/javame/c;->a(IJ)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->i:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->h:Lnet/jarlehansen/protobuf/javame/b;

    invoke-static {v1, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(ILnet/jarlehansen/protobuf/javame/b;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_2
    invoke-direct {p0}, Lcom/qihoo/security/engine/cloudscan/a/h;->d()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public c()Lcom/qihoo/security/engine/cloudscan/a/g;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->f:Lcom/qihoo/security/engine/cloudscan/a/g;

    return-object v0
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

    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->c:Z

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "type = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->e:Z

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "flags = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->d:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->g:Z

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "file_info = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->f:Lcom/qihoo/security/engine/cloudscan/a/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_2
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->i:Z

    if-eqz v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "stream = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/h;->h:Lnet/jarlehansen/protobuf/javame/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_3
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
