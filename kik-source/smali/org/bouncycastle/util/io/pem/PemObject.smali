.class public Lorg/bouncycastle/util/io/pem/PemObject;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/util/io/pem/PemObjectGenerator;


# static fields
.field private static final a:Ljava/util/List;


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/util/List;

.field private d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lorg/bouncycastle/util/io/pem/PemObject;->a:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;[B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/util/io/pem/PemObject;->b:Ljava/lang/String;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/util/io/pem/PemObject;->c:Ljava/util/List;

    iput-object p3, p0, Lorg/bouncycastle/util/io/pem/PemObject;->d:[B

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[B)V
    .locals 1

    sget-object v0, Lorg/bouncycastle/util/io/pem/PemObject;->a:Ljava/util/List;

    invoke-direct {p0, p1, v0, p2}, Lorg/bouncycastle/util/io/pem/PemObject;-><init>(Ljava/lang/String;Ljava/util/List;[B)V

    return-void
.end method


# virtual methods
.method public final a()Lorg/bouncycastle/util/io/pem/PemObject;
    .locals 0

    return-object p0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/util/io/pem/PemObject;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/util/io/pem/PemObject;->c:Ljava/util/List;

    return-object v0
.end method

.method public final d()[B
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/util/io/pem/PemObject;->d:[B

    return-object v0
.end method
