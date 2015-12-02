.class public final Lcom/qihoo/security/engine/cloudscan/a/i;
.super Lnet/jarlehansen/protobuf/javame/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/engine/cloudscan/a/i$a;
    }
.end annotation


# static fields
.field private static a:Lnet/jarlehansen/protobuf/javame/a/a/b;


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Ljava/util/Vector;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lnet/jarlehansen/protobuf/javame/a/a/a;->a()Lnet/jarlehansen/protobuf/javame/a/a/a;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/engine/cloudscan/a/i;->a:Lnet/jarlehansen/protobuf/javame/a/a/b;

    return-void
.end method

.method private constructor <init>(Lcom/qihoo/security/engine/cloudscan/a/i$a;)V
    .locals 3

    invoke-direct {p0}, Lnet/jarlehansen/protobuf/javame/a;-><init>()V

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/i$a;->a(Lcom/qihoo/security/engine/cloudscan/a/i$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/i$a;->b(Lcom/qihoo/security/engine/cloudscan/a/i$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/i;->b:Ljava/lang/String;

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/i$a;->c(Lcom/qihoo/security/engine/cloudscan/a/i$a;)Ljava/util/Vector;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/i;->c:Ljava/util/Vector;

    return-void

    :cond_0
    new-instance v0, Lnet/jarlehansen/protobuf/javame/UninitializedMessageException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "Not all required fields were included (false = not included in message),  key:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/i$a;->a(Lcom/qihoo/security/engine/cloudscan/a/i$a;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lnet/jarlehansen/protobuf/javame/UninitializedMessageException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/engine/cloudscan/a/i$a;Lcom/qihoo/security/engine/cloudscan/a/i;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/qihoo/security/engine/cloudscan/a/i;-><init>(Lcom/qihoo/security/engine/cloudscan/a/i$a;)V

    return-void
.end method

.method static a(Lnet/jarlehansen/protobuf/javame/a/a;)I
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

.method public static a()Lcom/qihoo/security/engine/cloudscan/a/i$a;
    .locals 2

    new-instance v0, Lcom/qihoo/security/engine/cloudscan/a/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qihoo/security/engine/cloudscan/a/i$a;-><init>(Lcom/qihoo/security/engine/cloudscan/a/i$a;)V

    return-object v0
.end method

.method static a(Lnet/jarlehansen/protobuf/javame/a/a;Lcom/qihoo/security/engine/cloudscan/a/i$a;I)Z
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
    invoke-virtual {p0, p2}, Lnet/jarlehansen/protobuf/javame/a/a;->b(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/qihoo/security/engine/cloudscan/a/i$a;->a(Ljava/lang/String;)Lcom/qihoo/security/engine/cloudscan/a/i$a;

    move v0, v2

    goto :goto_0

    :pswitch_1
    const/4 v1, 0x2

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

    invoke-static {}, Lcom/qihoo/security/engine/cloudscan/a/j;->a()Lcom/qihoo/security/engine/cloudscan/a/j$a;

    move-result-object v4

    new-instance v5, Lnet/jarlehansen/protobuf/javame/a/a;

    sget-object v6, Lcom/qihoo/security/engine/cloudscan/a/i;->a:Lnet/jarlehansen/protobuf/javame/a/a/b;

    invoke-direct {v5, v0, v6}, Lnet/jarlehansen/protobuf/javame/a/a;-><init>([BLnet/jarlehansen/protobuf/javame/a/a/b;)V

    move v0, v2

    :goto_2
    if-nez v0, :cond_1

    invoke-virtual {v4}, Lcom/qihoo/security/engine/cloudscan/a/j$a;->a()Lcom/qihoo/security/engine/cloudscan/a/j;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/qihoo/security/engine/cloudscan/a/i$a;->a(Lcom/qihoo/security/engine/cloudscan/a/j;)Lcom/qihoo/security/engine/cloudscan/a/i$a;

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_1
    invoke-static {v5}, Lcom/qihoo/security/engine/cloudscan/a/i;->a(Lnet/jarlehansen/protobuf/javame/a/a;)I

    move-result v0

    invoke-static {v5, v4, v0}, Lcom/qihoo/security/engine/cloudscan/a/j;->a(Lnet/jarlehansen/protobuf/javame/a/a;Lcom/qihoo/security/engine/cloudscan/a/j$a;I)Z

    move-result v0

    goto :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private e()I
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/qihoo/security/engine/cloudscan/a/i;->c:Ljava/util/Vector;

    invoke-static {v1, v2, v3}, Lnet/jarlehansen/protobuf/javame/c;->a(IILjava/util/Vector;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public a(Lnet/jarlehansen/protobuf/javame/b/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/i;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lnet/jarlehansen/protobuf/javame/b/a;->a(ILjava/lang/String;)V

    const/4 v0, 0x2

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a/i;->c:Ljava/util/Vector;

    invoke-virtual {p1, v0, v1, v2}, Lnet/jarlehansen/protobuf/javame/b/a;->a(IILjava/util/Vector;)V

    return-void
.end method

.method public b()I
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/qihoo/security/engine/cloudscan/a/i;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Lnet/jarlehansen/protobuf/javame/c;->a(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    invoke-direct {p0}, Lcom/qihoo/security/engine/cloudscan/a/i;->e()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/i;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/util/Vector;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/i;->c:Ljava/util/Vector;

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

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/i;->b:Ljava/lang/String;

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

    const-string/jumbo v0, "kvmap = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/a/i;->c:Ljava/util/Vector;

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
