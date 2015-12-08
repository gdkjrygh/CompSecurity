.class public Lorg/spongycastle/util/io/pem/PemObject;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/util/io/pem/PemObjectGenerator;


# static fields
.field private static final a:Ljava/util/List;


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/util/List;

.field private d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/util/io/pem/PemObject;->a:Ljava/util/List;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/util/List;[B)V
    .locals 1

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lorg/spongycastle/util/io/pem/PemObject;->b:Ljava/lang/String;

    .line 37
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/util/io/pem/PemObject;->c:Ljava/util/List;

    .line 38
    iput-object p3, p0, Lorg/spongycastle/util/io/pem/PemObject;->d:[B

    .line 39
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[B)V
    .locals 1

    .prologue
    .line 24
    sget-object v0, Lorg/spongycastle/util/io/pem/PemObject;->a:Ljava/util/List;

    invoke-direct {p0, p1, v0, p2}, Lorg/spongycastle/util/io/pem/PemObject;-><init>(Ljava/lang/String;Ljava/util/List;[B)V

    .line 25
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lorg/spongycastle/util/io/pem/PemObject;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lorg/spongycastle/util/io/pem/PemObject;->c:Ljava/util/List;

    return-object v0
.end method

.method public final c()[B
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lorg/spongycastle/util/io/pem/PemObject;->d:[B

    return-object v0
.end method

.method public final d()Lorg/spongycastle/util/io/pem/PemObject;
    .locals 0

    .prologue
    .line 59
    return-object p0
.end method
