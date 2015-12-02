.class public final Lcom/qihoo/security/engine/cloudscan/a/a;
.super Lnet/jarlehansen/protobuf/javame/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/engine/cloudscan/a/a$a;
    }
.end annotation


# static fields
.field private static a:Lnet/jarlehansen/protobuf/javame/a/a/b;


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Z

.field private final d:I

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lnet/jarlehansen/protobuf/javame/a/a/a;->a()Lnet/jarlehansen/protobuf/javame/a/a/a;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/engine/cloudscan/a/a;->a:Lnet/jarlehansen/protobuf/javame/a/a/b;

    return-void
.end method

.method private constructor <init>(Lcom/qihoo/security/engine/cloudscan/a/a$a;)V
    .locals 1

    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/a;-><init>()V

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/a$a;->a(Lcom/qihoo/security/engine/cloudscan/a/a$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/a;->b:Ljava/lang/String;

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/a$a;->b(Lcom/qihoo/security/engine/cloudscan/a/a$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/a;->c:Z

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/a$a;->c(Lcom/qihoo/security/engine/cloudscan/a/a$a;)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/a/a;->d:I

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/a$a;->d(Lcom/qihoo/security/engine/cloudscan/a/a$a;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/a;->e:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/engine/cloudscan/a/a$a;Lcom/qihoo/security/engine/cloudscan/a/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/qihoo/security/engine/cloudscan/a/a;-><init>(Lcom/qihoo/security/engine/cloudscan/a/a$a;)V

    return-void
.end method

.method public static a()Lcom/qihoo/security/engine/cloudscan/a/a$a;
    .locals 2

    new-instance v0, Lcom/qihoo/security/engine/cloudscan/a/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qihoo/security/engine/cloudscan/a/a$a;-><init>(Lcom/qihoo/security/engine/cloudscan/a/a$a;)V

    return-object v0
.end method

.method static a(Lnet/jarlehansen/protobuf/javame/a/a;Lcom/qihoo/security/engine/cloudscan/a/a$a;I)Z
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
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/a/a;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/qihoo/security/engine/cloudscan/a/a$a;->a(Ljava/lang/String;)Lcom/qihoo/security/engine/cloudscan/a/a$a;

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/a/a;->a(I)I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/qihoo/security/engine/cloudscan/a/a$a;->a(I)Lcom/qihoo/security/engine/cloudscan/a/a$a;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private c()I
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

    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/a;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/a;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(ILjava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/a;->e:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/a/a;->d:I

    invoke-virtual {p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(II)V

    :cond_1
    return-void
.end method

.method public b()I
    .locals 3

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/a;->c:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a/a;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/a;->e:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    iget v2, p0, Lcom/qihoo/security/engine/cloudscan/a/a;->d:I

    invoke-static {v1, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/engine/cloudscan/a/a;->c()I

    move-result v1

    add-int/2addr v0, v1

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

    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/a;->c:Z

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "name = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    iget-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/a;->e:Z

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "version = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/a/a;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "   "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
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
