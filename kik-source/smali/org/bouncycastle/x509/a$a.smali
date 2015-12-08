.class final Lorg/bouncycastle/x509/a$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/bouncycastle/x509/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/security/Provider;


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/security/Provider;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/x509/a$a;->a:Ljava/lang/Object;

    iput-object p2, p0, Lorg/bouncycastle/x509/a$a;->b:Ljava/security/Provider;

    return-void
.end method
