.class public final Lcom/qihoo/security/engine/cloudscan/a/j;
.super Lnet/jarlehansen/protobuf/javame/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/engine/cloudscan/a/j$a;
    }
.end annotation


# static fields
.field private static a:Lnet/jarlehansen/protobuf/javame/a/a/b;


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Lnet/jarlehansen/protobuf/javame/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lnet/jarlehansen/protobuf/javame/a/a/a;->a()Lnet/jarlehansen/protobuf/javame/a/a/a;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/engine/cloudscan/a/j;->a:Lnet/jarlehansen/protobuf/javame/a/a/b;

    return-void
.end method

.method private constructor <init>(Lcom/qihoo/security/engine/cloudscan/a/j$a;)V
    .locals 3

    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/a;-><init>()V

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/j$a;->a(Lcom/qihoo/security/engine/cloudscan/a/j$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/j$a;->b(Lcom/qihoo/security/engine/cloudscan/a/j$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/j$a;->c(Lcom/qihoo/security/engine/cloudscan/a/j$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/j;->b:Ljava/lang/String;

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/j$a;->d(Lcom/qihoo/security/engine/cloudscan/a/j$a;)Lnet/jarlehansen/protobuf/javame/b;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/j;->c:Lnet/jarlehansen/protobuf/javame/b;

    return-void

    :cond_0
    new-instance v0, Lnet/jarlehansen/protobuf/javame/UninitializedMessageException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "Not all required fields were included (false = not included in message),  key:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/j$a;->a(Lcom/qihoo/security/engine/cloudscan/a/j$a;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, " val:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/j$a;->b(Lcom/qihoo/security/engine/cloudscan/a/j$a;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lnet/jarlehansen/protobuf/javame/UninitializedMessageException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/engine/cloudscan/a/j$a;Lcom/qihoo/security/engine/cloudscan/a/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/qihoo/security/engine/cloudscan/a/j;-><init>(Lcom/qihoo/security/engine/cloudscan/a/j$a;)V

    return-void
.end method

.method public static a()Lcom/qihoo/security/engine/cloudscan/a/j$a;
    .locals 2

    new-instance v0, Lcom/qihoo/security/engine/cloudscan/a/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qihoo/security/engine/cloudscan/a/j$a;-><init>(Lcom/qihoo/security/engine/cloudscan/a/j$a;)V

    return-object v0
.end method

.method static a(Lnet/jarlehansen/protobuf/javame/a/a;Lcom/qihoo/security/engine/cloudscan/a/j$a;I)Z
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

    invoke-virtual {p1, v1}, Lcom/qihoo/security/engine/cloudscan/a/j$a;->a(Ljava/lang/String;)Lcom/qihoo/security/engine/cloudscan/a/j$a;

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/a/a;->e(I)Lnet/jarlehansen/protobuf/javame/b;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/qihoo/security/engine/cloudscan/a/j$a;->a(Lnet/jarlehansen/protobuf/javame/b;)Lcom/qihoo/security/engine/cloudscan/a/j$a;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private e()I
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

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/j;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(ILjava/lang/String;)V

    const/4 v0, 0x2

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/j;->c:Lnet/jarlehansen/protobuf/javame/b;

    invoke-virtual {p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(ILnet/jarlehansen/protobuf/javame/b;)V

    return-void
.end method

.method public b()I
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a/j;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a/j;->c:Lnet/jarlehansen/protobuf/javame/b;

    invoke-static {v1, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(ILnet/jarlehansen/protobuf/javame/b;)I

    move-result v1

    add-int/2addr v0, v1

    invoke-direct {p0}, Lcom/qihoo/security/engine/cloudscan/a/j;->e()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/j;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lnet/jarlehansen/protobuf/javame/b;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/j;->c:Lnet/jarlehansen/protobuf/javame/b;

    return-object v0
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

    const-string/jumbo v0, "key = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/j;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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

    const-string/jumbo v0, "val = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/j;->c:Lnet/jarlehansen/protobuf/javame/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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

    const-string/jumbo v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
