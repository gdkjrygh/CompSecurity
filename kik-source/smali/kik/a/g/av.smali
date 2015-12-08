.class final Lkik/a/g/av;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/g/as;


# instance fields
.field final synthetic a:Lkik/a/g/v;


# direct methods
.method constructor <init>(Lkik/a/g/v;)V
    .locals 0

    .prologue
    .line 809
    iput-object p1, p0, Lkik/a/g/av;->a:Lkik/a/g/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lkik/a/d/k;)Lorg/spongycastle/jce/interfaces/ECPublicKey;
    .locals 1

    .prologue
    .line 813
    invoke-virtual {p0}, Lkik/a/d/k;->j()[B

    move-result-object v0

    .line 815
    if-eqz v0, :cond_0

    .line 817
    :try_start_0
    invoke-static {v0}, Lkik/a/h/h;->a([B)Lorg/spongycastle/jce/interfaces/ECPublicKey;
    :try_end_0
    .catch Ljava/security/NoSuchProviderException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v0

    .line 821
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_1

    :catch_3
    move-exception v0

    goto :goto_1
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 809
    check-cast p1, Lkik/a/d/k;

    invoke-static {p1}, Lkik/a/g/av;->a(Lkik/a/d/k;)Lorg/spongycastle/jce/interfaces/ECPublicKey;

    move-result-object v0

    return-object v0
.end method
