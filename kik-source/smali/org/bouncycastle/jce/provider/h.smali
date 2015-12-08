.class final Lorg/bouncycastle/jce/provider/h;
.super Ljava/lang/Object;


# static fields
.field static final a:Lorg/bouncycastle/jce/provider/h;


# instance fields
.field private b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lorg/bouncycastle/jce/provider/h;

    const v1, 0x80ff

    invoke-direct {v0, v1}, Lorg/bouncycastle/jce/provider/h;-><init>(I)V

    sput-object v0, Lorg/bouncycastle/jce/provider/h;->a:Lorg/bouncycastle/jce/provider/h;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/bouncycastle/jce/provider/h;-><init>(I)V

    return-void
.end method

.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lorg/bouncycastle/jce/provider/h;->b:I

    return-void
.end method


# virtual methods
.method final a(Lorg/bouncycastle/jce/provider/h;)V
    .locals 2

    iget v0, p0, Lorg/bouncycastle/jce/provider/h;->b:I

    iget v1, p1, Lorg/bouncycastle/jce/provider/h;->b:I

    or-int/2addr v0, v1

    iput v0, p0, Lorg/bouncycastle/jce/provider/h;->b:I

    return-void
.end method

.method final a()Z
    .locals 2

    iget v0, p0, Lorg/bouncycastle/jce/provider/h;->b:I

    sget-object v1, Lorg/bouncycastle/jce/provider/h;->a:Lorg/bouncycastle/jce/provider/h;

    iget v1, v1, Lorg/bouncycastle/jce/provider/h;->b:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final b(Lorg/bouncycastle/jce/provider/h;)Lorg/bouncycastle/jce/provider/h;
    .locals 4

    new-instance v0, Lorg/bouncycastle/jce/provider/h;

    invoke-direct {v0}, Lorg/bouncycastle/jce/provider/h;-><init>()V

    new-instance v1, Lorg/bouncycastle/jce/provider/h;

    iget v2, p0, Lorg/bouncycastle/jce/provider/h;->b:I

    iget v3, p1, Lorg/bouncycastle/jce/provider/h;->b:I

    and-int/2addr v2, v3

    invoke-direct {v1, v2}, Lorg/bouncycastle/jce/provider/h;-><init>(I)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/jce/provider/h;->a(Lorg/bouncycastle/jce/provider/h;)V

    return-object v0
.end method

.method final c(Lorg/bouncycastle/jce/provider/h;)Z
    .locals 3

    iget v0, p0, Lorg/bouncycastle/jce/provider/h;->b:I

    iget v1, p1, Lorg/bouncycastle/jce/provider/h;->b:I

    iget v2, p0, Lorg/bouncycastle/jce/provider/h;->b:I

    xor-int/2addr v1, v2

    or-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
