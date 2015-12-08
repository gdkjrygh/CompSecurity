.class final Lorg/bouncycastle/jce/provider/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/PrivilegedAction;


# instance fields
.field final synthetic a:Lorg/bouncycastle/jce/provider/BouncyCastleProvider;


# direct methods
.method constructor <init>(Lorg/bouncycastle/jce/provider/BouncyCastleProvider;)V
    .locals 0

    iput-object p1, p0, Lorg/bouncycastle/jce/provider/a;->a:Lorg/bouncycastle/jce/provider/BouncyCastleProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/jce/provider/a;->a:Lorg/bouncycastle/jce/provider/BouncyCastleProvider;

    invoke-static {v0}, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;->a(Lorg/bouncycastle/jce/provider/BouncyCastleProvider;)V

    const/4 v0, 0x0

    return-object v0
.end method
