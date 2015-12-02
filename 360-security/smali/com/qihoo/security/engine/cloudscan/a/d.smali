.class public final Lcom/qihoo/security/engine/cloudscan/a/d;
.super Lnet/jarlehansen/protobuf/javame/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/engine/cloudscan/a/d$a;
    }
.end annotation


# static fields
.field private static a:Lnet/jarlehansen/protobuf/javame/a/a/b;


# instance fields
.field private final b:I

.field private final c:I

.field private final d:Ljava/lang/String;

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lnet/jarlehansen/protobuf/javame/a/a/a;->a()Lnet/jarlehansen/protobuf/javame/a/a/a;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/engine/cloudscan/a/d;->a:Lnet/jarlehansen/protobuf/javame/a/a/b;

    return-void
.end method

.method private constructor <init>(Lcom/qihoo/security/engine/cloudscan/a/d$a;)V
    .locals 3

    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/a;-><init>()V

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/d$a;->a(Lcom/qihoo/security/engine/cloudscan/a/d$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/d$a;->b(Lcom/qihoo/security/engine/cloudscan/a/d$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/d$a;->c(Lcom/qihoo/security/engine/cloudscan/a/d$a;)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/a/d;->b:I

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/d$a;->d(Lcom/qihoo/security/engine/cloudscan/a/d$a;)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/a/d;->c:I

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/d$a;->e(Lcom/qihoo/security/engine/cloudscan/a/d$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/d;->d:Ljava/lang/String;

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/d$a;->f(Lcom/qihoo/security/engine/cloudscan/a/d$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/d;->e:Z

    return-void

    :cond_0
    new-instance v0, Lnet/jarlehansen/protobuf/javame/UninitializedMessageException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "Not all required fields were included (false = not included in message),  val:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/d$a;->a(Lcom/qihoo/security/engine/cloudscan/a/d$a;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, " level:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/d$a;->b(Lcom/qihoo/security/engine/cloudscan/a/d$a;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lnet/jarlehansen/protobuf/javame/UninitializedMessageException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/engine/cloudscan/a/d$a;Lcom/qihoo/security/engine/cloudscan/a/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/qihoo/security/engine/cloudscan/a/d;-><init>(Lcom/qihoo/security/engine/cloudscan/a/d$a;)V

    return-void
.end method

.method public static a()Lcom/qihoo/security/engine/cloudscan/a/d$a;
    .locals 2

    new-instance v0, Lcom/qihoo/security/engine/cloudscan/a/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qihoo/security/engine/cloudscan/a/d$a;-><init>(Lcom/qihoo/security/engine/cloudscan/a/d$a;)V

    return-object v0
.end method

.method static a(Lnet/jarlehansen/protobuf/javame/a/a;Lcom/qihoo/security/engine/cloudscan/a/d$a;I)Z
    .locals 2
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

    invoke-virtual {p1, v1}, Lcom/qihoo/security/engine/cloudscan/a/d$a;->a(I)Lcom/qihoo/security/engine/cloudscan/a/d$a;

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/a/a;->a(I)I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/qihoo/security/engine/cloudscan/a/d$a;->b(I)Lcom/qihoo/security/engine/cloudscan/a/d$a;

    goto :goto_0

    :pswitch_2
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/a/a;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/qihoo/security/engine/cloudscan/a/d$a;->a(Ljava/lang/String;)Lcom/qihoo/security/engine/cloudscan/a/d$a;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private g()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a(Lnet/jarlehansen/protobuf/javame/b/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/a/d;->b:I

    invoke-virtual {p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(II)V

    const/4 v0, 0x2

    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/a/d;->c:I

    invoke-virtual {p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(II)V

    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/d;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/d;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(ILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public b()I
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget v2, p0, Lcom/qihoo/security/engine/cloudscan/a/d;->b:I

    invoke-static {v1, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(II)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x2

    iget v2, p0, Lcom/qihoo/security/engine/cloudscan/a/d;->c:I

    invoke-static {v1, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(II)I

    move-result v1

    add-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/d;->e:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a/d;->d:Ljava/lang/String;

    invoke-static {v1, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/engine/cloudscan/a/d;->g()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/a/d;->b:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/a/d;->c:I

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/d;->d:Ljava/lang/String;

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/d;->e:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

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

    const-string/jumbo v0, "val = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/a/d;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "level = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/a/d;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/d;->e:Z

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "desc = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/d;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
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
